package app.esper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.time.CurrentTimeEvent;
import com.espertech.esper.client.time.TimerControlEvent;
import com.espertech.esperio.csv.AdapterCoordinator;
import com.espertech.esperio.csv.AdapterCoordinatorImpl;
import com.espertech.esperio.csv.AdapterInputSource;
import com.espertech.esperio.csv.CSVInputAdapter;
import com.espertech.esperio.csv.CSVInputAdapterSpec;
import com.opencsv.CSVReader;

import cepapp.CEPApp;
import cepapp.InputFile;
import domain.CEPDomain;
import domain.Event;
import domain.impl.CEPDomainImpl;
import domain.impl.EventImpl;
import domain.impl.EventPropertyImpl;
import eventpattern.CEPEventPattern;
import eventpattern.ComplexEvent;

public class Simulator {

	public static void main(String[] args) throws Exception {
	    //runApp();
	}
    
	public static void runApp(CEPApp cepappModel) throws Exception {
		
		//Simulator for run app
		Configuration config = new Configuration();
		
		// The internal timer is disabled
		config.getEngineDefaults().getThreading().setInternalTimerEnabled(false);
		
		// Microsecond time unit for time resolution
		config.getEngineDefaults().getTimeSource().setTimeUnit(TimeUnit.MICROSECONDS);
		
		EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider(config);
		
		// Define the event type
		
		Pattern p = Pattern.compile("cepapp.impl.EventImpl");
		Matcher mat;
		
		Event newEvent;
		Map<String, Object> CEPdomainProperties = new HashMap<String, Object>();
		
		for(int i = 0; i < cepappModel.getSourceElements().size(); i++) {
			mat = p.matcher(cepappModel.getSourceElements().get(i).getClass().getName());
			if(mat.matches()) {
				System.out.println("AQUI");
				newEvent = (Event) cepappModel.getSourceElements().get(i);
				for(int j = 0; j < newEvent.getEventProperties().size(); j++) {
					CEPdomainProperties.put(newEvent.getEventProperties().get(j).getName(),
							newEvent.getEventProperties().get(j).getType());
				}
				config.addEventType(newEvent.getTypeName(), CEPdomainProperties);
			}
		}
		
		
		// Delete all existing patterns from the CEP engine
		epService.getEPAdministrator().destroyAllStatements();
			
		EPRuntime runtime = epService.getEPRuntime();
		// Switch to external clocking
		runtime.sendEvent(new TimerControlEvent(TimerControlEvent.ClockType.CLOCK_EXTERNAL));
		
		char SEPARATOR=',';
		char QUOTE='"';
		String firstTimestamp="";
		CSVReader reader = null;
		p = Pattern.compile("class cepapp.impl.InputFileImpl");
		Pattern complexEvent = Pattern.compile("class cepapp.impl.ComplexEventImpl");
		InputFile newInputFile;
		ComplexEvent newComplexEvent = null;
		AdapterCoordinator coordinator = null;
		
		for(int i = 0; i < cepappModel.getSourceElements().size(); i++) {
			mat = p.matcher(cepappModel.getSourceElements().get(i).getClass().toString());
			if(mat.matches()) {
				newInputFile = (InputFile) cepappModel.getSourceElements().get(i);
			    try {
			    	reader = new CSVReader(new FileReader(newInputFile.getFile_uri()),SEPARATOR,QUOTE);
			        
			        reader.readNext();
			        
			        Pattern limpiar = Pattern.compile("\\d{10,13}");
			        java.util.regex.Matcher buscar = limpiar.matcher(Arrays.toString(reader.readNext()));
			        while (buscar.find())
			        	firstTimestamp = buscar.group(0);
			        
	
			    } catch (Exception e) {
			    	e.printStackTrace();
			    } finally {
			    	if (null != reader) {
			        
			    	try {
			    		reader.close();
			    	} catch (IOException e1) {
			    		e1.printStackTrace();
			    	}	
			    		
			    	} 
			    }
				
			    Long firstTimestampLong = Long.parseLong(firstTimestamp);
			    
				// IMPORTANT: CurrentTimeEvent must receive as parameter the timestamp in which the data start in the CSV file
				// 1571732376156602 is in microseconds
				//runtime.sendEvent(new CurrentTimeEvent(firstTimestampLong));
				
				try {
					for(int j = 0; j < cepappModel.getSinkElements().size(); j++) {
						mat = complexEvent.matcher(cepappModel.getSinkElements().get(j).getClass().toString());
						if(mat.matches()) {
							newComplexEvent = (ComplexEvent) cepappModel.getSinkElements().get(j);
							String GenericEpl = Files.lines(Paths.get("resources\\" + newComplexEvent.getTypeName() + ".epl")).collect(Collectors.joining("\n"));
							EPStatement GenericPattern = epService.getEPAdministrator().createEPL(GenericEpl);
							//GenericPattern.addListener(new GenericListener(newComplexEvent));
						}
					}
				} catch (IOException io){
					io.printStackTrace();
				}
											
				// The CSV data input file must be located in the resources folder.		
				//AdapterInputSource GenericInputSource = new AdapterInputSource("Vaccine_Delivery-Events.csv");
				AdapterInputSource GenericInputSource = new AdapterInputSource(newInputFile.getFile_uri());
				CSVInputAdapterSpec GenericAdapterSpec = new CSVInputAdapterSpec(GenericInputSource, newComplexEvent.getTypeName());
				GenericAdapterSpec.setUsingTimeSpanEvents(true);
					
				// The timestamp column to schedule events being sent into the CEP engine
				GenericAdapterSpec.setTimestampColumn("timestamp");
					
				// External timing is enabled, so EsperIO will run through the input file at full speed without pausing.
				// The algorithm used sends a time event after all events for a particular time have been received.		
				GenericAdapterSpec.setUsingExternalTimer(true);
				GenericAdapterSpec.setUsingEngineThread(false);
					
				    	
				// AdapterCoordinatorImpl(com.espertech.esper.client.EPServiceProvider epService, boolean usingEngineThread, boolean usingExternalTimer, boolean usingTimeSpanEvents)
				//   usingEngineThread - true if the coordinator should set time by the scheduling service in the engine, false if it should set time externally through the calling thread
				//   usingExternalTimer - true to use esper's external timer mechanism instead of internal timing
				//   usingTimeSpanEvents - true for time span events
				//coordinator = new AdapterCoordinatorImpl(epService, false, true, true);
				 		 	
				coordinator.coordinate(new CSVInputAdapter(GenericAdapterSpec));
				//coordinator.coordinate(new CSVInputAdapter(predictionAdapterSpec));
			}
		}    
		    
		System.out.println("The simulation has started...");	
		    
		long start = System.currentTimeMillis();
		coordinator.start();
		long delta = System.currentTimeMillis() - start;
		System.out.println("Time execution: " + delta + " milliseconds");
		System.out.println("The simulation has finished.");
		
		
	}
	
}
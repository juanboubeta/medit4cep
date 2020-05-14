package app.esper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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

import domain.CEPDomain;
import domain.Event;
import domain.impl.CEPDomainImpl;
import domain.impl.EventImpl;
import domain.impl.EventPropertyImpl;
import eventpattern.CEPEventPattern;

public class Simulator {

	public static void main(String[] args) throws Exception {
	    //runApp();
	}
    
	public static void runApp(CEPDomain domainModel, CEPEventPattern patternModel) throws Exception {
		
			Configuration config = new Configuration();
			
			// The internal timer is disabled
			config.getEngineDefaults().getThreading().setInternalTimerEnabled(false);
			
			// Microsecond time unit for time resolution
			config.getEngineDefaults().getTimeSource().setTimeUnit(TimeUnit.MICROSECONDS);
			
			// Define the event type
			
			for(int i = 0; i < domainModel.getEvents().size(); i++) {
				Map<String, Object> CEPdomainProperties = new HashMap<String, Object>();
				for(int j = 0; j < domainModel.getEvents().get(i).getEventProperties().size(); j++) {
					CEPdomainProperties.put(domainModel.getEvents().get(i).getEventProperties().get(j).getName(), 
							domainModel.getEvents().get(i).getEventProperties().get(j).getType());
				}
				config.addEventType(domainModel.getEvents().get(i).getTypeName(), CEPdomainProperties);
			}
			
						
			EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider(config);
				
			// Delete all existing patterns from the CEP engine
			epService.getEPAdministrator().destroyAllStatements();
				
			EPRuntime runtime = epService.getEPRuntime();
			// Switch to external clocking
			runtime.sendEvent(new TimerControlEvent(TimerControlEvent.ClockType.CLOCK_EXTERNAL));
				
			// IMPORTANT: CurrentTimeEvent must receive as parameter the timestamp in which the data start in the CSV file
			// 
			// 1571732376156602 is in microseconds
			runtime.sendEvent(new CurrentTimeEvent(1577872800000L));
			
			String GenericEpl = Files.lines(Paths.get("resources\\" + patternModel.getPatternName() + ".epl")).collect(Collectors.joining("\n"));
			EPStatement GenericPattern = epService.getEPAdministrator().createEPL(GenericEpl);
			GenericPattern.addListener(new GenericListener(patternModel));
			
			
			/*String TemperatureWarningEpl = Files.lines(Paths.get("resources\\TemperatureWarning.epl")).collect(Collectors.joining("\n"));
			EPStatement TemperatureWarningPattern = epService.getEPAdministrator().createEPL(TemperatureWarningEpl);
			TemperatureWarningPattern.addListener(new TemperatureWarningListener());	
				
			String TemperatureWarningStaticEpl = Files.lines(Paths.get("resources\\TemperatureWarningStatic.epl")).collect(Collectors.joining("\n"));
			EPStatement TemperatureWarningStaticPattern = epService.getEPAdministrator().createEPL(TemperatureWarningStaticEpl);
			TemperatureWarningStaticPattern.addListener(new TemperatureWarningStaticListener());
			
			String TemperatureAlertEpl = Files.lines(Paths.get("resources\\TemperatureAlert.epl")).collect(Collectors.joining("\n"));
			EPStatement TemperatureAlertPattern = epService.getEPAdministrator().createEPL(TemperatureAlertEpl);
			TemperatureAlertPattern.addListener(new TemperatureAlertListener());*/
					
			
			// The CSV data input file must be located in the resources folder.		
			AdapterInputSource GenericInputSource = new AdapterInputSource("Vaccine_Delivery-Events.csv");
			CSVInputAdapterSpec GenericAdapterSpec = new CSVInputAdapterSpec(GenericInputSource, patternModel.getPatternName());
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
			AdapterCoordinator coordinator = new AdapterCoordinatorImpl(epService, false, true, true);
			 		 	
			coordinator.coordinate(new CSVInputAdapter(GenericAdapterSpec));
			//coordinator.coordinate(new CSVInputAdapter(predictionAdapterSpec));
			    
			System.out.println("The simulation has started...");	
			    
			long start = System.currentTimeMillis();
			coordinator.start();
			long delta = System.currentTimeMillis() - start;
			System.out.println("Time execution: " + delta + " milliseconds");
			System.out.println("The simulation has finished.");
	}
	
}
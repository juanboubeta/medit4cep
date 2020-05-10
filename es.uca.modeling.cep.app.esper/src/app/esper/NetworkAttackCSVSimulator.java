package app.esper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

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

import domain.Event;
import domain.impl.CEPDomainImpl;
import domain.impl.EventImpl;
import domain.impl.EventPropertyImpl;

public class NetworkAttackCSVSimulator {

	public static void main(String[] args) throws Exception {
	    runApp();
	}
    
	public static void runApp() throws Exception {
		
			Configuration config = new Configuration();
			
			// The internal timer is disabled
			config.getEngineDefaults().getThreading().setInternalTimerEnabled(false);
			
			// Microsecond time unit for time resolution
			config.getEngineDefaults().getTimeSource().setTimeUnit(TimeUnit.MICROSECONDS);
			
			// Define the VaccineDelivery event type
			//Map<String, Object> CEPdomainProperties = new HashMap<String, Object>();
			
			//EList<Event> prueba = CEPDomain.getEvents();
			
			
			
			/*EList<Event> AllEvents = CEPDomainImpl.getEvents();
			
			for(int i = 0; i < CEPDomainImpl.getEvents().size(); i++) {
				for(int j = 0; i < Event.getEventProperties().size(); j++) {
					CEPdomainProperties.put("timestamp", Long.class);
				}
				config.addEventType("VaccineDelivery", CEPdomainProperties);
			}*/
			
			// Define the VaccineDelivery event type
			Map<String, Object> CEPdomainProperties = new HashMap<String, Object>();
			CEPdomainProperties.put("timestamp", Long.class);
			CEPdomainProperties.put("shipmentId", String.class);
			CEPdomainProperties.put("temperature", Double.class);

			// Register the simple event types with their properties into the CEP engine
			config.addEventType("TemperatureReading", CEPdomainProperties);
						
				
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

			String TemperatureWarningEpl = Files.lines(Paths.get("resources\\TemperatureWarning.epl")).collect(Collectors.joining("\n"));
			EPStatement TemperatureWarningPattern = epService.getEPAdministrator().createEPL(TemperatureWarningEpl);
			TemperatureWarningPattern.addListener(new TemperatureWarningListener());	
				
			String TemperatureWarningStaticEpl = Files.lines(Paths.get("resources\\TemperatureWarningStatic.epl")).collect(Collectors.joining("\n"));
			EPStatement TemperatureWarningStaticPattern = epService.getEPAdministrator().createEPL(TemperatureWarningStaticEpl);
			TemperatureWarningStaticPattern.addListener(new TemperatureWarningStaticListener());
			
			String TemperatureAlertEpl = Files.lines(Paths.get("resources\\TemperatureAlert.epl")).collect(Collectors.joining("\n"));
			EPStatement TemperatureAlertPattern = epService.getEPAdministrator().createEPL(TemperatureAlertEpl);
			TemperatureAlertPattern.addListener(new TemperatureAlertListener());
					
			
			// The CSV data input file must be located in the resources folder.		
			AdapterInputSource VaccineDeliveryInputSource = new AdapterInputSource("Vaccine_Delivery-EventsPrueba.csv");
			CSVInputAdapterSpec VaccineDeliveryAdapterSpec = new CSVInputAdapterSpec(VaccineDeliveryInputSource, "TemperatureReading");
			VaccineDeliveryAdapterSpec.setUsingTimeSpanEvents(true);
				
			// The timestamp column to schedule events being sent into the CEP engine
			VaccineDeliveryAdapterSpec.setTimestampColumn("timestamp");
				
			// External timing is enabled, so EsperIO will run through the input file at full speed without pausing.
			// The algorithm used sends a time event after all events for a particular time have been received.		
			VaccineDeliveryAdapterSpec.setUsingExternalTimer(true);
			VaccineDeliveryAdapterSpec.setUsingEngineThread(false);
				
			    	
			// AdapterCoordinatorImpl(com.espertech.esper.client.EPServiceProvider epService, boolean usingEngineThread, boolean usingExternalTimer, boolean usingTimeSpanEvents)
			//   usingEngineThread - true if the coordinator should set time by the scheduling service in the engine, false if it should set time externally through the calling thread
			//   usingExternalTimer - true to use esper's external timer mechanism instead of internal timing
			//   usingTimeSpanEvents - true for time span events
			AdapterCoordinator coordinator = new AdapterCoordinatorImpl(epService, false, true, true);
			 		 	
			coordinator.coordinate(new CSVInputAdapter(VaccineDeliveryAdapterSpec));
			//coordinator.coordinate(new CSVInputAdapter(predictionAdapterSpec));
			    
			System.out.println("The simulation has started...");	
			    
			long start = System.currentTimeMillis();
			coordinator.start();
			long delta = System.currentTimeMillis() - start;
			System.out.println("Time execution: " + delta + " milliseconds");
			System.out.println("The simulation has finished.");
	}
	
}
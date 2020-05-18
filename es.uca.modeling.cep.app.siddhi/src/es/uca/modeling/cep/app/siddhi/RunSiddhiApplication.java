package es.uca.modeling.cep.app.siddhi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.wso2.siddhi.core.SiddhiAppRuntime;
import org.wso2.siddhi.core.SiddhiManager;

public class RunSiddhiApplication {
	private static SiddhiManager siddhiManager = new SiddhiManager();
	private SiddhiAppRuntime siddhiAppRuntime;
	
	public void runApp(String file) {
		//Siddhi Application
		try {
			String siddhiApp = new String(Files.readAllBytes(Paths.get(file)));
			
			siddhiAppRuntime = siddhiManager.createSiddhiAppRuntime(siddhiApp);

	        //Start event processing
	        siddhiAppRuntime.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	public void stopApp() {
		siddhiAppRuntime.shutdown();
	}
}

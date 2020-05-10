package app.esper;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;


/**
 * @author Juan Boubeta-Puig <juan.boubeta@uca.es>, University of Cadiz, Spain
 * @date 18th January, 2019
 */
public class TemperatureWarningListener implements UpdateListener {
	
	private static Logger logger = Logger.getLogger(TemperatureWarningListener.class);
	private static ArrayList<String> lines = new ArrayList();
	
	// The detected complex events will be saved in the file located in the folder simulation-output.
	private static Path patternOutput = Paths.get("simulation-output/TemperatureWarning-compex-events_SVR.txt"); 

	@Override
	public void update(EventBean[] arg0, EventBean[] arg1) {
				
		String detectedComplexEvent; 
				
		for (EventBean event : arg0) {
			detectedComplexEvent = event.get("timestamp") 
					+ "," + event.get("shipmentId")
					+ "," + event.get("temperature")
					; 	
				
			//System.out.println(detectedComplexEvent);
			logger.debug(detectedComplexEvent); 
			lines.add(detectedComplexEvent);
		}

		try {
			Files.write(patternOutput, lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
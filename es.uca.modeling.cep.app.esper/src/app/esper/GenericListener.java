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

import eventpattern.CEPEventPattern;

public class GenericListener implements UpdateListener {
	
	private static Logger logger = Logger.getLogger(TemperatureWarningListener.class);
	private static ArrayList<String> lines = new ArrayList();
	
	// The detected complex events will be saved in the file located in the folder simulation-output.
	private static Path patternOutput = Paths.get("Generic-complex-events_SVR.txt"); 
	
	private static CEPEventPattern EventPatternModel;
	
	private static int contador = 0;
	
	public GenericListener(CEPEventPattern patternModel) {
		EventPatternModel = patternModel;
	}
	
	@Override
	public void update(EventBean[] arg0, EventBean[] arg1) {
				
		String detectedComplexEvent = ""; 
				
		for (EventBean event : arg0) {
			if(EventPatternModel.getComplexEvent().getComplexEventProperties().size() == 1) {
				detectedComplexEvent = (String) event.get(EventPatternModel.getComplexEvent().getComplexEventProperties().get(0).getName());
			} else if (EventPatternModel.getComplexEvent().getComplexEventProperties().size() > 1) {
				while(contador < EventPatternModel.getComplexEvent().getComplexEventProperties().size() - 1) {
					
					detectedComplexEvent = detectedComplexEvent + event.get(EventPatternModel.getComplexEvent().getComplexEventProperties().get(contador).getName()) + ",";
					contador++;
				}
				detectedComplexEvent = detectedComplexEvent + event.get(EventPatternModel.getComplexEvent().getComplexEventProperties().get(contador).getName());
			}	
						
			//System.out.println(detectedComplexEvent);
			logger.debug(detectedComplexEvent); 
			lines.add(detectedComplexEvent);
		}
		
		try {
			for(int i = 0; i < EventPatternModel.getSmartContracts().size(); i++) {
				String invokeSmartContract = EventPatternModel.getSmartContracts().get(i).getTypeName() + "_invocation_" + EventPatternModel.getPatternName() + ".java";
				Class c = Class.forName(invokeSmartContract);
				c.newInstance();
			}
		} catch (Exception sce) {
			sce.printStackTrace();
		}
		
		try {
			Files.write(patternOutput, lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
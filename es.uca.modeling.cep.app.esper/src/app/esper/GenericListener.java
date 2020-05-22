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
import eventpattern.ComplexEvent;

public class GenericListener implements UpdateListener {
	
	private static Logger logger = Logger.getLogger(GenericListener.class);
	private static ArrayList<String> lines = new ArrayList();
	
	// The detected complex events will be saved in the file located in the folder simulation-output.
	//private static Path patternOutput = Paths.get("Generic-complex-events_SVR.txt"); 
	
	private static ComplexEvent ComplexEvent;
	
	private static int contador;
	
	public GenericListener(ComplexEvent complexEvent) {
		ComplexEvent = complexEvent;
		//Create the txt file
	}
	
	@Override
	public void update(EventBean[] arg0, EventBean[] arg1) {
		contador = 0;		
		String detectedComplexEvent = ""; 
			
		//Comprobar si el complex event tiene otubound link de file
		//ComplexEvent.getOutboundLink();
		for (EventBean event : arg0) {
			if(ComplexEvent.getComplexEventProperties().size() == 1) {
				detectedComplexEvent = (String) event.get(ComplexEvent.getComplexEventProperties().get(0).getName());
			} else if (ComplexEvent.getComplexEventProperties().size() > 1) {
				while(contador < ComplexEvent.getComplexEventProperties().size() - 1) {
					
					detectedComplexEvent = detectedComplexEvent + event.get(ComplexEvent.getComplexEventProperties().get(contador).getName()) + ",";
					contador++;
				}
				detectedComplexEvent = detectedComplexEvent + event.get(ComplexEvent.getComplexEventProperties().get(contador).getName());
			}	
						
			//System.out.println(detectedComplexEvent);
			logger.debug(detectedComplexEvent); 
			//lines.add(detectedComplexEvent);
		}
		
		try {
			//Cargar la carpeta de runtime necesaria
			//Ver si existe el complexEvent.getName()_invocation.java e invocarlo
			//Invocar el/los smart contract/s
			/*for(int i = 0; i < EventPatternModel.getSmartContracts().size(); i++) {
				String invokeSmartContract = EventPatternModel.getSmartContracts().get(i).getTypeName() + "_invocation_" + EventPatternModel.getPatternName() + ".java";
				Class c = Class.forName(invokeSmartContract);
				c.newInstance();
			}*/
			System.out.println("Invocacion del Smart Contract");
		} catch (Exception sce) {
			sce.printStackTrace();
		}
		
		/*try {
			Files.write(patternOutput, lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}

}
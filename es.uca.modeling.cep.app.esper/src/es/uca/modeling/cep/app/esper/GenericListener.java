package es.uca.modeling.cep.app.esper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class GenericListener implements UpdateListener {
	
	private Logger logger = Logger.getLogger(GenericListener.class);
	private ArrayList<String> lines = new ArrayList();

	@Override
	public void update(EventBean[] arg0, EventBean[] arg1) {
		
		File outputFile = null;
		
		String detectedComplexEvent = ""; 
		
		for (EventBean event : arg0) {
			
			outputFile = new File(event.getEventType().getName() + ".csv");
			
			int i = 0;
			String propiedades[] = event.getEventType().getPropertyNames();
			
			if(event.getEventType().getPropertyNames().length == 1) {
				detectedComplexEvent = event.get(propiedades[0]).toString();
			} else if (event.getEventType().getPropertyNames().length > 1) {
				for(i = 0; i < event.getEventType().getPropertyNames().length -1; i++) {
					detectedComplexEvent += event.get(propiedades[i]).toString() + ",";
				}
				detectedComplexEvent += event.get(propiedades[i]).toString();
			}	
			
			//System.out.println(detectedComplexEvent);
			logger.debug(detectedComplexEvent); 
			lines.add(detectedComplexEvent);
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
			//System.out.println("Invocacion del Smart Contract en " + ComplexEvent.getTypeName());
		} catch (Exception sce) {
			sce.printStackTrace();
		}
		
		try {
			Files.write(Paths.get(outputFile.getAbsolutePath()), lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
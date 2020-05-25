package es.uca.modeling.cep.app.esper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
import cepapp.ComplexEvent;

public class GenericListener implements UpdateListener {
	
	private Logger logger = Logger.getLogger(GenericListener.class);
	private ArrayList<String> lines = new ArrayList();
	
	// The detected complex events will be saved in the file located in the folder simulation-output.
	private File ComplexEventTXT;
	
	private ComplexEvent ComplexEvent;
	
	//private int contador;
	
	public GenericListener(ComplexEvent complexEvent) {
		ComplexEvent = complexEvent;
		//Create the txt file
		ComplexEventTXT = new File(ComplexEvent.getTypeName() + "-complex-events_SVR.txt");
		System.out.println(ComplexEvent.getTypeName() + "-complex-events_SVR.txt");
	}
	
	@Override
	public void update(EventBean[] arg0, EventBean[] arg1) {
		System.out.println("Entrando en UPDATE " + ComplexEvent.getTypeName());
		int contador = 0;		
		String detectedComplexEvent = ""; 
			
		//Comprobar si el complex event tiene otubound link de file
		//ComplexEvent.getOutboundLink();
		
		for (EventBean event : arg0) {
			if(ComplexEvent.getComplexEventProperties().size() == 1) {
				detectedComplexEvent = (String) event.get(ComplexEvent.getComplexEventProperties().get(0).getName());
			} else if (ComplexEvent.getComplexEventProperties().size() > 1) {
				while(contador < ComplexEvent.getComplexEventProperties().size() - 1) {
					System.out.println(ComplexEvent.getComplexEventProperties().get(contador).getName());
					System.out.println("AQUI ESTOY " +ComplexEvent.getTypeName() + " propiedades "+ ComplexEvent.getComplexEventProperties().size());
					System.out.println("CONTADOR " + contador);
					detectedComplexEvent = detectedComplexEvent + event.get(ComplexEvent.getComplexEventProperties().get(contador).getName()) + ",";
					contador++;
					System.out.println(detectedComplexEvent);
				}
				System.out.println("AQUI ESTOY " +ComplexEvent.getTypeName());
				System.out.println("CONTADOR FINAL " + contador);
				detectedComplexEvent = detectedComplexEvent + event.get(ComplexEvent.getComplexEventProperties().get(contador).getName());
			}	
						
			System.out.println(detectedComplexEvent);
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
			System.out.println("Invocacion del Smart Contract en " + ComplexEvent.getTypeName());
		} catch (Exception sce) {
			sce.printStackTrace();
		}
		
		try {
			System.out.println(ComplexEventTXT.getAbsolutePath());
			Files.write(Paths.get(ComplexEventTXT.getAbsolutePath()), lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
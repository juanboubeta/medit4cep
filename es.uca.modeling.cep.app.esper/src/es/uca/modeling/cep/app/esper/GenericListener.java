package es.uca.modeling.cep.app.esper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
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
			
			//System.out.println("Antes de invocar los smart contracts");
			File smartContractsFile = new File(event.getEventType().getName() + "_smartContracts.txt");

			if(smartContractsFile.exists()) {
			    FileReader fr = null;
			    BufferedReader br = null;
	
			    try {
			    	// Apertura del fichero y creacion de BufferedReader para poder
			        // hacer una lectura comoda (disponer del metodo readLine()).
			        fr = new FileReader (smartContractsFile);
			        br = new BufferedReader(fr);
	
			        // Lectura del fichero
			        String smartContractInvoked;
			        String deployedSmartContract;
			        while((smartContractInvoked=br.readLine())!=null) {
			        	System.out.println(smartContractInvoked);
			        	deployedSmartContract = "es.uca.modeling.cep.smartcontract.code." + smartContractInvoked;
			        	System.out.println(deployedSmartContract);
			        	Class c = Class.forName(deployedSmartContract);
						c.newInstance();
			        }
			      } catch(Exception e){
			         e.printStackTrace();
			      }finally{
			         // En el finally cerramos el fichero, para asegurarnos
			         // que se cierra tanto si todo va bien como si salta 
			         // una excepcion.
			         try{                    
			            if( null != fr ){   
			               fr.close();     
			            }                  
			         }catch (Exception e2){ 
			            e2.printStackTrace();
			         }
			      }
			}
		}

		try {
			Files.write(Paths.get(outputFile.getAbsolutePath()), lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
package es.uca.modeling.cep.app.esper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class GenerateVaccineDeliveryCSV {
	
	public static void main(String[] args) throws Exception {
		long epoch = System.currentTimeMillis();
		int cont = 0;
		double temp;		
		String CSVcontent = "timestamp,shipmentId,temperature" + "\n";
		for(int i = 1; i <= 5; i++) {
			if(i==2 || i==5) {
				for(int j = 0; j < 60; j++) {
					if(j >= 9) {
						temp = Math.random()*2;   // Values between 2.0 y 8.0
						CSVcontent += (epoch+60000*cont) + "," + '"' + "id" + i + '"' + "," + temp + "\n";
						cont++;
					} else {
						temp = Math.random()*6 + 2;   // Values between 2.0 y 8.0
						CSVcontent += (epoch+60000*cont) + "," + '"' + "id" + i + '"' + "," + temp + "\n";
						cont++;
					}
				}
				
			}else {
				for(int j = 0; j < 60; j++) {
					temp = Math.random()*6 + 2;   // Values between 2.0 y 8.0
					CSVcontent += (epoch+60000*cont) + "," + '"' + "id" + i + '"' + "," + temp + "\n";
					cont++;
				}
			}
		}	
		
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int respuesta = fc.showOpenDialog(null);
		//Check if accept has been pressed
		File archivoElegido = null;
		if (respuesta == JFileChooser.APPROVE_OPTION) {
            archivoElegido = fc.getSelectedFile();
            try {
    			File CSVPathFile = new File(archivoElegido.toString() + "/Vaccine_Delivery-Events.csv");
    			//System.out.println(CSVPathFile.getAbsolutePath());
    			BufferedWriter bw;
    			if(CSVPathFile.exists()) {
    				bw = new BufferedWriter(new FileWriter(CSVPathFile));
    				bw.write(CSVcontent);
    				bw.close();
    			} else {
    				bw = new BufferedWriter(new FileWriter(CSVPathFile));
    				bw.write(CSVcontent);
    				bw.close();
    			}
    		} catch (IOException ioe){
    			ioe.printStackTrace();
    		}
		}
	}
}
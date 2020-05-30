package es.uca.modeling.cep.app.esper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;

import eventpattern.ComplexEvent;
import eventpattern.SmartContract;

public class SmartContractInvocation {
		
	public SmartContractInvocation(ComplexEvent complexEvent, EList<SmartContract> smartContracts) {
		
		//private HashMap<String, String[]> smartContractsofComplexEvents = new HashMap<String, String[]>();
		
		File smartContractsFile = new File(complexEvent.getTypeName() + "_smartContracts.txt");
		BufferedWriter bw;
		
		String[] smartContractsString= new String[smartContracts.size()];
		for(int i = 0; i < smartContracts.size(); i++) {
			smartContractsString[i] = smartContracts.get(i).getTypeName() + "_invocation_" + complexEvent.getTypeName();
		}
		//smartContractsofComplexEvents.put(complexEvent.getTypeName(), smartContractsString);
		try {
			if(smartContractsFile.exists()) {
				bw = new BufferedWriter(new FileWriter(smartContractsFile));
				for(int i = 0; i < smartContracts.size(); i++) {
					bw.write(smartContracts.get(i).getTypeName() + "_invocation_" + complexEvent.getTypeName() + "\n");
				}
				bw.close();
			} else {
				bw = new BufferedWriter(new FileWriter(smartContractsFile));
				for(int i = 0; i < smartContracts.size(); i++) {
					bw.write(smartContracts.get(i).getTypeName() + "_invocation_" + complexEvent.getTypeName() + "\n");
				}
				bw.close();
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
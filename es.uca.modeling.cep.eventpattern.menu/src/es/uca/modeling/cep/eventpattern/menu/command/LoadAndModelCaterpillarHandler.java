package es.uca.modeling.cep.eventpattern.menu.command;

import java.io.BufferedWriter;
import java.io.File;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import es.uca.modeling.cep.eventpattern.menu.dialog.AutodetectSmartContractDialog;
import es.uca.modeling.cep.eventpattern.menu.dialog.LoadAndModelCaterpillarDialog;
import eventpattern.diagram.status.EventPatternsStatus;
import smartcontract.ContractFunction;
import smartcontract.PropertyTypeValue;
import smartcontract.SmartContract;
import smartcontract.SmartContracts;
import smartcontract.SmartcontractFactory;
import smartcontract.diagram.part.SmartcontractDiagramEditorUtil;



public class LoadAndModelCaterpillarHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject smartcontractsProject = myWorkspaceRoot.getProject("smartcontract");
		
		String caterpillarURL = "";
		
		try {
			
			if (smartcontractsProject.exists()) {
	        	MessageDialog.openError(shell, "Load and Model from Caterpillar", "The editor has already been customised.");
	        	return null;	
			}
			else {
			
				LoadAndModelCaterpillarDialog dialog = new LoadAndModelCaterpillarDialog(shell);
				dialog.create();
				
				if (dialog.open() == Window.OK) {
					
					String host = dialog.getHost();
					String port = dialog.getPort();
					
					caterpillarURL = "http://" + host + ":" + port + "/models";
				} 		
			}
			
			//Connect to the API and get the models
			URL url = new URL(caterpillarURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            Set<String> models = new HashSet<String>();
            HashMap<Object, String> modelsWithSolidity = new HashMap<Object, String>();
            String output;
            
            while ((output = br.readLine()) != null) {
            	models.add(output);
            }
            conn.disconnect();
            
            System.out.println(models);
            
            JSONParser parser = new JSONParser();
            
            JSONObject modelJSON;
            Iterator<String> it = models.iterator();
          	JSONArray jsonArray = (JSONArray) new JSONParser().parse(it.next());
          	
          	String[] options = new String[jsonArray.size()];
          	         	
          	for (int i = 0; i < jsonArray.size(); i++) {
          		modelJSON = (JSONObject) jsonArray.get(i);
          		options[i] = modelJSON.get("name").toString();
          		modelsWithSolidity.put(modelJSON.get("name"), modelJSON.get("solidity").toString());
          	}
                      	          	
            String s = (String)JOptionPane.showInputDialog(
            					null,
                                "Select the BPMN that you want to model",
                                "Selection of BPMN model",
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                options,
                                options[0]);
            
            System.out.println(s);
            
		} catch (Exception e) {
			e.printStackTrace();
		} 						
				
		return null; 

	}

}

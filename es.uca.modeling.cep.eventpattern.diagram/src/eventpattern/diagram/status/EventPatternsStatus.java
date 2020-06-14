/*******************************************************************************
 * Copyright (c) 2011, 2015 Juan Boubeta-Puig
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Boubeta-Puig - modifications marked as @generated NOT
 ******************************************************************************/

package eventpattern.diagram.status;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.resources.ResourcesPlugin;

public class EventPatternsStatus {
	
	// domainName (a static field) is shared among all the instances of the class
	private static String domainName; 
	private static String smartcontractsName; 
	private static String activePatternName; 
	private static HashMap<String, Boolean> patternValidations = new HashMap<String, Boolean>();
	private static HashMap<String, Boolean> complexEventChanges = new HashMap<String, Boolean>();
	private static String generatedEventPatternPath;
	private static String generatedActionPath;
	private static String generatedSmartContractPath;
	private static String eventTypePath;
	private static String projectPath;
	
	public static String getDomainName() {
		return domainName; 
	}
	
	public static void setDomainName(String d) {
		domainName = d; 
	}
	
	public static String getSmartcontractsName() {
		return smartcontractsName; 
	}
	
	public static void setSmartcontractsName(String sc) {
		smartcontractsName = sc; 
	}
	
	
	public static String getActivePatternName() {
		return activePatternName; 
	}
	
	public static void setActivePatternName(String p) {
		activePatternName = p;
	}
	
	public static HashMap<String, Boolean> getPatternValidations() {
		return patternValidations;
	}
	
	public static HashMap<String, Boolean> getComplexEventChanges() {
		return complexEventChanges;
	}

	public static String getGeneratedEventPatternPath() {
		return generatedEventPatternPath;
	}

	public static void setGeneratedEventPatternPath(String path) {
		generatedEventPatternPath = path;
	}

	public static String getGeneratedActionPath() {
		return generatedActionPath;
	}

	public static void setGeneratedActionPath(String path) {
		generatedActionPath = path;
	}

	public static String getEventTypePath() {
		return eventTypePath;
	}

	public static void setEventTypePath(String path) {
		eventTypePath = path;
	}
	
	public static String getGeneratedSmartContractPath() {
		return generatedSmartContractPath;
	}

	public static void setGeneratedSmartContractPath(String path) {
		generatedSmartContractPath = path;
	}
	
	public static String getProjectPath() {
		String WorkspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		File projectPathFile = new File(WorkspaceLocation + "/projectPATH.txt");
		if(projectPathFile.exists()) {
			try {
				FileReader fr = new FileReader (projectPathFile);
				BufferedReader br = new BufferedReader(fr);
				projectPath = br.readLine();
				br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}	
			return projectPath;
		} else {
			return projectPath;
		}	
	}

	public static void setProjectPath(String projectpath) {
		
		projectPath = projectpath;
		
		String WorkspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		//System.out.println(WorkspaceLocation + "/projectPATH.txt");
		try {
			File projectPathFile = new File(WorkspaceLocation + "/projectPATH.txt");
			BufferedWriter bw;
			if(projectPathFile.exists()) {
				bw = new BufferedWriter(new FileWriter(projectPathFile));
				bw.write(projectPath);
				bw.close();
			} else {
				bw = new BufferedWriter(new FileWriter(projectPathFile));
				bw.write(projectPath);
				bw.close();
			}
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
	}
	
}

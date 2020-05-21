/*******************************************************************************
 * Copyright (c) 2011, 2015 Juan Boubeta-Puig
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Boubeta-Puig - initial API and implementation
 *     Jesus Rosa Bilbao - API and implementation
 ******************************************************************************/

package es.uca.modeling.cep.eventpattern.menu.dialog;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class LoadAndModelCaterpillarDialog extends TitleAreaDialog {

	  private Text hostText;
	  private Text portText;
	
	  private String host;
	  private String port;
	
	  public LoadAndModelCaterpillarDialog(Shell parentShell) {
		  
		  super(parentShell);
	  }
	
	  @Override
	  public void create() {
		  
		  super.create();
		  setTitle("Load and Model from Caterpillar");
		  setMessage("Please insert the information of the Caterpillar core to import and model smart contracts", 
				  IMessageProvider.INFORMATION);
	  }
	
	  @Override
	  protected Control createDialogArea(Composite parent) {
		  
		  Composite area = (Composite) super.createDialogArea(parent);
		  Composite container = new Composite(area, SWT.NONE);
		  container.setLayoutData(new GridData(GridData.FILL_BOTH));
		  GridLayout layout = new GridLayout(2, false);
		  container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		  container.setLayout(layout);
		
		  createHostName(container);
		  createPort(container);
		
		  return area;
	  }
		  
	  private void createHostName(Composite container) {
		  
		  Label hostNameLabel = new Label(container, SWT.NONE);
		  hostNameLabel.setText("Caterpillar core Host");
		
		  GridData hostNameData = new GridData();
		  hostNameData.grabExcessHorizontalSpace = true;
		  hostNameData.horizontalAlignment = GridData.FILL;
		  
		  hostText = new Text(container, SWT.BORDER);
		  hostText.setLayoutData(hostNameData);
		  hostText.setText("localhost");
	  }
	  
	  private void createPort(Composite container) {
		  
		  Label portLabel = new Label(container, SWT.NONE);
		  portLabel.setText("Caterpillar core Port");
		    
		  GridData portData = new GridData();
		  portData.grabExcessHorizontalSpace = true;
		  portData.horizontalAlignment = GridData.FILL;
		  portText = new Text(container, SWT.BORDER);
		  portText.setLayoutData(portData);
		  portText.setText("3000");
	  }
	
	  @Override
	  protected boolean isResizable() {
		  
		  return true;
	  }
	
	  private void saveInput() {
		  
		  host = hostText.getText();
		  port = portText.getText();
	  }
	
	  @Override
	  protected void okPressed() {
		  
		  if ((!hostText.getText().matches("^\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}$") 
				  || !hostText.getText().matches("^localhost$"))
				  && !portText.getText().matches("^\\d{1,5}$")) { 
			  setMessage("Caterpillar Core: the host or port entered is wrong, please check it.", 
					  IMessageProvider.ERROR);
		  }
		  else {
			  saveInput();
			  super.okPressed();
		  }
	  }
	
	  public String getHost() {
		  
		  return host;
	  }
	
	  public String getPort() {
		  
		  return port;
	  }
} 
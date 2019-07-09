/*******************************************************************************
 * Copyright (c) 2011, 2015 Juan Boubeta-Puig
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Boubeta-Puig - initial API and implementation
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

public class AutodetectSmartContractDialog extends TitleAreaDialog {

	  private Text smartcontractNameText;
	  private Text smartcontractDescriptionText;
	
	  private String name;
	  private String description;
	
	  public AutodetectSmartContractDialog(Shell parentShell) {
		  
		  super(parentShell);
	  }
	
	  @Override
	  public void create() {
		  
		  super.create();
		  setTitle("Auto-initialize Smart Contracts");
		  setMessage("Please insert the information of the Smart Contracts to be auto-initialized:", 
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
		
		  createSmartContractName(container);
		  createSmartContractDescription(container);
		
		  return area;
	  }
		  
	  private void createSmartContractName(Composite container) {
		  
		  Label smartcontractNameLabel = new Label(container, SWT.NONE);
		  smartcontractNameLabel.setText("Smart Contracts Name");
		
		  GridData smartcontractNameData = new GridData();
		  smartcontractNameData.grabExcessHorizontalSpace = true;
		  smartcontractNameData.horizontalAlignment = GridData.FILL;
		
		  smartcontractNameText = new Text(container, SWT.BORDER);
		  smartcontractNameText.setLayoutData(smartcontractNameData);
	  }
	  
	  private void createSmartContractDescription(Composite container) {
		  
		  Label smartcontractDescriptionLabel = new Label(container, SWT.NONE);
		  smartcontractDescriptionLabel.setText("Smart Contracts Description");
		    
		  GridData smartcontractDescriptionData = new GridData();
		  smartcontractDescriptionData.grabExcessHorizontalSpace = true;
		  smartcontractDescriptionData.horizontalAlignment = GridData.FILL;
		  smartcontractDescriptionText = new Text(container, SWT.BORDER);
		  smartcontractDescriptionText.setLayoutData(smartcontractDescriptionData);
	  }
	
	  @Override
	  protected boolean isResizable() {
		  
		  return true;
	  }
	
	  private void saveInput() {
		  
		  name = smartcontractNameText.getText();
		  description = smartcontractDescriptionText.getText();
	  }
	
	  @Override
	  protected void okPressed() {
		  
		  if (!smartcontractNameText.getText().matches("^[A-Za-z][A-Za-z0-9_]*$")) { 
			  setMessage("Smart Contracts Name: First letter must be alphabetic and the remaining characters must be alphanumeric or underscore.", 
					  IMessageProvider.ERROR);
		  }
		  else {
			  saveInput();
			  super.okPressed();
		  }
	  }
	
	  public String getSmartContractsName() {
		  
		  return name;
	  }
	
	  public String getSmartContractsDescription() {
		  
		  return description;
	  }
} 
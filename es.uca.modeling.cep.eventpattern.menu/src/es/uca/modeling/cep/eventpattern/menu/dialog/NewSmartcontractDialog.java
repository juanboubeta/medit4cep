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

public class NewSmartcontractDialog extends TitleAreaDialog {

	  private Text nameText;
	  private Text descriptionText;
	
	  private String name;
	  private String description;
	
	  public NewSmartcontractDialog(Shell parentShell) {
		  
		  super(parentShell);
	  }
	
	  @Override
	  public void create() {
		  
		  super.create();
		  setTitle("New SmartContracts");
		  setMessage("Please insert the information of the SmartContracs to be created:", 
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
		
		  createSmartcontractsName(container);
		  createSmartcontractsDescription(container);
		
		  return area;
	  }
		  
	  private void createSmartcontractsName(Composite container) {
		  
		  Label smartcontractsNameLabel = new Label(container, SWT.NONE);
		  smartcontractsNameLabel.setText("SmartContracts Name");
		
		  GridData smartcontractsNameData = new GridData();
		  smartcontractsNameData.grabExcessHorizontalSpace = true;
		  smartcontractsNameData.horizontalAlignment = GridData.FILL;
		
		  nameText = new Text(container, SWT.BORDER);
		  nameText.setLayoutData(smartcontractsNameData);
	  }
	  
	  private void createSmartcontractsDescription(Composite container) {
		  
		  Label smartcontractsDescriptionLabel = new Label(container, SWT.NONE);
		  smartcontractsDescriptionLabel.setText("SmartContracts Description");
		    
		  GridData smartcontractsDescriptionData = new GridData();
		  smartcontractsDescriptionData.grabExcessHorizontalSpace = true;
		  smartcontractsDescriptionData.horizontalAlignment = GridData.FILL;
		  descriptionText = new Text(container, SWT.BORDER);
		  descriptionText.setLayoutData(smartcontractsDescriptionData);
	  }
	
	  @Override
	  protected boolean isResizable() {
		  
		  return true;
	  }
	
	  private void saveInput() {
		  
		  name = nameText.getText();
		  description = descriptionText.getText();
	  }
	
	  @Override
	  protected void okPressed() {
		  
		  if (!nameText.getText().matches("^[A-Za-z][A-Za-z0-9_]*$")) { 
			  setMessage("SmartContracts Name: First letter must be alphabetic and the remaining characters must be alphanumeric or underscore.", 
					  IMessageProvider.ERROR);
		  }
		  else {
			  saveInput();
			  super.okPressed();
		  }
	  }
	
	  public String getName() {
		  
		  return name;
	  }
	
	  public String getDescription() {
		  
		  return description;
	  }
} 
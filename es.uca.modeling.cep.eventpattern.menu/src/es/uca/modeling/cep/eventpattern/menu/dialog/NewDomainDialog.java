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

public class NewDomainDialog extends TitleAreaDialog {

	  private Text domainNameText;
	  private Text domainDescriptionText;
	
	  private String domainName;
	  private String domainDescription;
	
	  public NewDomainDialog(Shell parentShell) {
		  
		  super(parentShell);
	  }
	
	  @Override
	  public void create() {
		  
		  super.create();
		  setTitle("New CEP Domain");
		  setMessage("Please insert the information of the domain to be created:", 
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
		
		  createDomainName(container);
		  createDomainDescription(container);
		
		  return area;
	  }
		  
	  private void createDomainName(Composite container) {
		  
		  Label domainNameLabel = new Label(container, SWT.NONE);
		  domainNameLabel.setText("Domain Name");
		
		  GridData domainNameData = new GridData();
		  domainNameData.grabExcessHorizontalSpace = true;
		  domainNameData.horizontalAlignment = GridData.FILL;
		
		  domainNameText = new Text(container, SWT.BORDER);
		  domainNameText.setLayoutData(domainNameData);
	  }
	  
	  private void createDomainDescription(Composite container) {
		  
		  Label domainDescriptionLabel = new Label(container, SWT.NONE);
		  domainDescriptionLabel.setText("Domain Description");
		    
		  GridData domainDescriptionData = new GridData();
		  domainDescriptionData.grabExcessHorizontalSpace = true;
		  domainDescriptionData.horizontalAlignment = GridData.FILL;
		  domainDescriptionText = new Text(container, SWT.BORDER);
		  domainDescriptionText.setLayoutData(domainDescriptionData);
	  }
	
	  @Override
	  protected boolean isResizable() {
		  
		  return true;
	  }
	
	  private void saveInput() {
		  
		  domainName = domainNameText.getText();
		  domainDescription = domainDescriptionText.getText();
	  }
	
	  @Override
	  protected void okPressed() {
		  
		  if (!domainNameText.getText().matches("^[A-Za-z][A-Za-z0-9_]*$")) { 
			  setMessage("Domain Name: First letter must be alphabetic and the remaining characters must be alphanumeric or underscore.", 
					  IMessageProvider.ERROR);
		  }
		  else {
			  saveInput();
			  super.okPressed();
		  }
	  }
	
	  public String getDomainName() {
		  
		  return domainName;
	  }
	
	  public String getDomainDescription() {
		  
		  return domainDescription;
	  }
} 
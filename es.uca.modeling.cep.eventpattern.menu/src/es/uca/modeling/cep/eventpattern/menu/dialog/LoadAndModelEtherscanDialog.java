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

public class LoadAndModelEtherscanDialog extends TitleAreaDialog {

	  private Text addressText;
	
	  private String address;
	
	  public LoadAndModelEtherscanDialog(Shell parentShell) {
		  super(parentShell);
	  }
	
	  @Override
	  public void create() {
		  
		  super.create();
		  setTitle("Load and Model from Etherscan");
		  setMessage("Please insert the address of the contract you want to import", 
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
		
		  createAddress(container);
		
		  return area;
	  }
		  
	  private void createAddress(Composite container) {
		  
		  Label addressLabel = new Label(container, SWT.NONE);
		  addressLabel.setText("Etherscan Address");
		
		  GridData addressData = new GridData();
		  addressData.grabExcessHorizontalSpace = true;
		  addressData.horizontalAlignment = GridData.FILL;
		  
		  addressText = new Text(container, SWT.BORDER);
		  addressText.setLayoutData(addressData);
		  addressText.setText("0x");
	  }
	
	  @Override
	  protected boolean isResizable() {
		  
		  return true;
	  }
	
	  private void saveInput() {
		  address = addressText.getText();
	  }
	
	  @Override
	  protected void okPressed() {
		  
		  if ((!addressText.getText().matches("^0x\\w{40}$"))) { 
			  setMessage("The contract address is incorrect", 
					  IMessageProvider.ERROR);
		  }
		  else {
			  saveInput();
			  super.okPressed();
		  }
	  }
	
	  public String getAddress() {
		  return address;
	  }
} 
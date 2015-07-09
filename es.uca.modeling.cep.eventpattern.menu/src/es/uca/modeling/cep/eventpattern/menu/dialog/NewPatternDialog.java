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

public class NewPatternDialog extends TitleAreaDialog {

	  private Text patternNameText;
	  private Text patternDescriptionText;
	
	  private String patternName;
	  private String patternDescription;
	
	  public NewPatternDialog(Shell parentShell) {
		  
		  super(parentShell);
	  }
	
	  @Override
	  public void create() {
		  
		  super.create();
		  setTitle("New Event Pattern");
		  setMessage("Please insert the information of the event pattern to be created:", 
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
		
		  createPatternName(container);
		  createPatternDescription(container);
		
		  return area;
	  }
		  
	  private void createPatternName(Composite container) {
		  
		  Label patternNameLabel = new Label(container, SWT.NONE);
		  patternNameLabel.setText("Pattern Name");
		
		  GridData patternNameData = new GridData();
		  patternNameData.grabExcessHorizontalSpace = true;
		  patternNameData.horizontalAlignment = GridData.FILL;
		
		  patternNameText = new Text(container, SWT.BORDER);
		  patternNameText.setLayoutData(patternNameData);
	  }
	  
	  private void createPatternDescription(Composite container) {
		  
		  Label patternDescriptionLabel = new Label(container, SWT.NONE);
		  patternDescriptionLabel.setText("Description");
		    
		  GridData patternDescriptionData = new GridData();
		  patternDescriptionData.grabExcessHorizontalSpace = true;
		  patternDescriptionData.horizontalAlignment = GridData.FILL;
		  patternDescriptionText = new Text(container, SWT.BORDER);
		  patternDescriptionText.setLayoutData(patternDescriptionData);
	  }
	
	  @Override
	  protected boolean isResizable() {
		  
		  return true;
	  }
	
	  private void saveInput() {
		  
		  patternName = patternNameText.getText();
		  patternDescription = patternDescriptionText.getText();
	  }
	
	  @Override
	  protected void okPressed() {
		  
		  if (!patternNameText.getText().matches("^[A-Za-z][A-Za-z0-9_]*$")) { 
			  setMessage("First letter must be alphabetic and the remaining characters must be alphanumeric or underscore.", 
					  IMessageProvider.ERROR);
		  }
		  else {
			  saveInput();
			  super.okPressed();
		  }
	  }
	
	  public String getPatternName() {
		  
		  return patternName;
	  }
	
	  public String getPatternDescription() {
		  
		  return patternDescription;
	  }
} 
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

package es.uca.modeling.cep.domain.figures;

import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;

public class PropertyImagePathCellEditor extends DialogCellEditor  {

	  public PropertyImagePathCellEditor(Composite parent) {
	      super(parent);
	  }

	  protected Object openDialogBox(Control cellEditorWindow) {
		    
		    FileDialog dialog = new FileDialog(cellEditorWindow.getShell(), SWT.OPEN);
			dialog.setText("Select Image");
			dialog.setFilterExtensions(new String[] { "*.bmp;*.gif;*.ico;*.jpg;*.jpeg;*.png", "*.bmp", "*.gif", "*.ico", "*.jpg; *.jpeg", "*.png" });
			dialog.setFilterNames(new String[] { "Image Files", "BMP Images (*.bmp)", "GIF Images (*.gif)", "ICO Icons (*.ico)", "JPEG Images (*.jpg, *.jpeg)", "PNG Images (*.png)" });
			dialog.open();
			
			String path = dialog.getFilterPath();
			String fileName = dialog.getFileName();
			String OS = System.getProperty("os.name").toLowerCase();
			
			if (fileName != null && !fileName.equals("")) {
				if (OS.indexOf("win") >= 0) {
					return path + "\\" + fileName;
				}
				else {
					return path + "/" + fileName;
				}
			}
			
			return getValue();
	  }

}
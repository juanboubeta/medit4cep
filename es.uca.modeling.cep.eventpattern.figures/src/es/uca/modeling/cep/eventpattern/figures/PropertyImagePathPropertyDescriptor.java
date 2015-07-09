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

package es.uca.modeling.cep.eventpattern.figures;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositeSourcePropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;

public class PropertyImagePathPropertyDescriptor extends EMFCompositeSourcePropertyDescriptor {

	public PropertyImagePathPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor, String category) {
		super(object, itemPropertyDescriptor, category);
	}

	protected CellEditor doCreateEditor(Composite composite) {
		try {
			if (((EAttribute) getFeature()).getName().equals("imagePath")) {
				return new PropertyImagePathCellEditor(composite);
			}
		}
		catch (Exception ex) {}
		return super.doCreateEditor(composite);
	}
}

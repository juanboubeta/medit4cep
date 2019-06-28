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

package smartcontract.diagram.status;

public class SmartcontractStatus {

    private static Boolean smartcontractModified;

	public static Boolean getSmartcontractModified() {
		return smartcontractModified;
	}
	
	public static void setSmartcontractModified(Boolean value) {
		smartcontractModified = value;
	}
	
}

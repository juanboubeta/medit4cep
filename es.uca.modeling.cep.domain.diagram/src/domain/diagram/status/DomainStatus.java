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

package domain.diagram.status;

public class DomainStatus {

    private static Boolean domainModified;

	public static Boolean getDomainModified() {
		return domainModified;
	}
	
	public static void setDomainModified(Boolean value) {
		domainModified = value;
	}
	
}

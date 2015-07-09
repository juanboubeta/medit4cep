/*******************************************************************************
 * Copyright (c) 2011, 2015 Juan Boubeta-Puig
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Boubeta-Puig - initial transformation and implementation
 ******************************************************************************/

package es.uca.modeling.cep.eventpattern.m2t;

import java.io.File;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringUtil;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.util.FileUtil;
import org.eclipse.epsilon.eol.dt.launching.EclipseContextManager;
import org.eclipse.epsilon.eol.models.Model;


public class TransformEventPatternToCode {
	
	public static void executeEGL(final Model sourceModel, EObject node, final String pathToEGL,
			final File outputFile) throws Exception {
		
		final EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		final EglTemplateFactoryModuleAdapter eglModule = new EglTemplateFactoryModuleAdapter(factory);
		eglModule.parse(TransformEventPatternToCode.class.getResource(pathToEGL).toURI());

		EclipseContextManager.setup(eglModule.getContext());
		eglModule.getContext().getModelRepository().addModel(sourceModel);
		
		if (eglModule.getParseProblems().size() > 0) {
			System.err.println("There are some parse errors: ");
			
			for (ParseProblem problem : eglModule.getParseProblems()) {
			    System.err.println(problem.toString());
			}
			
		 }

		// Save the code generated from an event pattern model to a file
		final String result = StringUtil.toString(eglModule.execute());		
		FileUtil.write(outputFile, result);
		
		eglModule.getContext().getModelRepository().dispose();
		
		System.out.println("Generated pattern code: \n" + result);
	}
	
}

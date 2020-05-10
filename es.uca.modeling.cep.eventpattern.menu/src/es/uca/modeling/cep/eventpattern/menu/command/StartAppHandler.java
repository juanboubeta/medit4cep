package es.uca.modeling.cep.eventpattern.menu.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

//import app.esper.NetworkAttackCSVSimulator.java;

import app.esper.NetworkAttackCSVSimulator;

public class StartAppHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		
		try {
			NetworkAttackCSVSimulator.runApp();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//RunEsperApplication.runApp();
		
		MessageDialog.openInformation(shell, "Application running", "Application succesfully started.");
		
		return null;
	}

}

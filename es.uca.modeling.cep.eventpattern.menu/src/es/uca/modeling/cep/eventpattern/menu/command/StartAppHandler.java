package es.uca.modeling.cep.eventpattern.menu.command;

import app.esper.RunEsperApplication;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;


public class StartAppHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		
		RunEsperApplication.runApp();
		
		MessageDialog.openInformation(shell, "Application running", "Application succesfully started.");
		
		return null;
	}

}

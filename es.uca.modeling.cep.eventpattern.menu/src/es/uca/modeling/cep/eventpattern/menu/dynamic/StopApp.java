package es.uca.modeling.cep.eventpattern.menu.dynamic;

import org.eclipse.jface.action.ContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import es.uca.modeling.cep.app.siddhi.SiddhiApplicationManager;

public class StopApp extends ContributionItem {

	public StopApp() {
		// TODO Auto-generated constructor stub
	}

	public StopApp(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fill(Menu menu, int index) {
		int menuPos = 0;
		
		for(String appName : SiddhiApplicationManager.applications()) {
			MenuItem menuItem = new MenuItem(menu, SWT.CHECK, menuPos);
			menuItem.setText(appName);
			menuItem.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					SiddhiApplicationManager.stopApp(appName);
				}
			});
			menuPos++;
		}
	}
	
	@Override
	public boolean isDynamic() {
		return true;
	}
}

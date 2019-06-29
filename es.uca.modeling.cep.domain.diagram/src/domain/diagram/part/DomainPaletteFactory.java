/*
 * 
 */
package domain.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createEvent1CreationTool());
		paletteContainer.add(createEventProperty2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvent1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Event1CreationTool_title,
				Messages.Event1CreationTool_desc, Collections.singletonList(DomainElementTypes.Event_2001));
		entry.setId("createEvent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.Event_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventProperty2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.EventProperty_3001);
		types.add(DomainElementTypes.EventProperty_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EventProperty2CreationTool_title,
				Messages.EventProperty2CreationTool_desc, types);
		entry.setId("createEventProperty2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.EventProperty_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}

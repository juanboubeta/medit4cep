
/*
 * 
 */
package smartcontract.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import smartcontract.diagram.providers.SmartcontractElementTypes;

/**
 * @generated
 */
public class SmartcontractPaletteFactory {

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
		paletteContainer.add(createContractFunction1CreationTool());
		paletteContainer.add(createInputParameter2CreationTool());
		paletteContainer.add(createOutputParameter3CreationTool());
		paletteContainer.add(createSmartContract4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createContractFunction1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContractFunction1CreationTool_title,
				Messages.ContractFunction1CreationTool_desc,
				Collections.singletonList(SmartcontractElementTypes.ContractFunction_3003));
		entry.setId("createContractFunction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				SmartcontractElementTypes.getImageDescriptor(SmartcontractElementTypes.ContractFunction_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputParameter2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputParameter2CreationTool_title,
				Messages.InputParameter2CreationTool_desc,
				Collections.singletonList(SmartcontractElementTypes.InputParameter_3008));
		entry.setId("createInputParameter2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmartcontractElementTypes.getImageDescriptor(SmartcontractElementTypes.InputParameter_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputParameter3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OutputParameter3CreationTool_title,
				Messages.OutputParameter3CreationTool_desc,
				Collections.singletonList(SmartcontractElementTypes.OutputParameter_3007));
		entry.setId("createOutputParameter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				SmartcontractElementTypes.getImageDescriptor(SmartcontractElementTypes.OutputParameter_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSmartContract4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SmartContract4CreationTool_title,
				Messages.SmartContract4CreationTool_desc,
				Collections.singletonList(SmartcontractElementTypes.SmartContract_2002));
		entry.setId("createSmartContract4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmartcontractElementTypes.getImageDescriptor(SmartcontractElementTypes.SmartContract_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}

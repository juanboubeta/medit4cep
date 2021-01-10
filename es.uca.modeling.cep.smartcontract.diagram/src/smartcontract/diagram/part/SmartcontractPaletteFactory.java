
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
		paletteContainer.add(createConstructorParameter1CreationTool());
		paletteContainer.add(createContractFunction2CreationTool());
		paletteContainer.add(createInputParameter3CreationTool());
		paletteContainer.add(createOutputParameter4CreationTool());
		paletteContainer.add(createSmartContract5CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createConstructorParameter1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ConstructorParameter1CreationTool_title,
				Messages.ConstructorParameter1CreationTool_desc,
				Collections.singletonList(SmartcontractElementTypes.ConstructorParameter_3012));
		entry.setId("createConstructorParameter1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				SmartcontractElementTypes.getImageDescriptor(SmartcontractElementTypes.ConstructorParameter_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContractFunction2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContractFunction2CreationTool_title,
				Messages.ContractFunction2CreationTool_desc,
				Collections.singletonList(SmartcontractElementTypes.ContractFunction_3009));
		entry.setId("createContractFunction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				SmartcontractElementTypes.getImageDescriptor(SmartcontractElementTypes.ContractFunction_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputParameter3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputParameter3CreationTool_title,
				Messages.InputParameter3CreationTool_desc,
				Collections.singletonList(SmartcontractElementTypes.InputParameter_3010));
		entry.setId("createInputParameter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmartcontractElementTypes.getImageDescriptor(SmartcontractElementTypes.InputParameter_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputParameter4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OutputParameter4CreationTool_title,
				Messages.OutputParameter4CreationTool_desc,
				Collections.singletonList(SmartcontractElementTypes.OutputParameter_3011));
		entry.setId("createOutputParameter4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				SmartcontractElementTypes.getImageDescriptor(SmartcontractElementTypes.OutputParameter_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSmartContract5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SmartContract5CreationTool_title,
				Messages.SmartContract5CreationTool_desc,
				Collections.singletonList(SmartcontractElementTypes.SmartContract_2003));
		entry.setId("createSmartContract5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SmartcontractElementTypes.getImageDescriptor(SmartcontractElementTypes.SmartContract_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}

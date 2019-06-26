/*
 * 
 */
package smartcontract.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import smartcontract.SmartcontractPackage;
import smartcontract.diagram.edit.parts.ContractFunctionNameEditPart;
import smartcontract.diagram.edit.parts.InputParameterNameEditPart;
import smartcontract.diagram.edit.parts.OutputParameterNameEditPart;
import smartcontract.diagram.edit.parts.SmartContractTypeNameEditPart;
import smartcontract.diagram.parsers.MessageFormatParser;
import smartcontract.diagram.part.SmartcontractVisualIDRegistry;

/**
 * @generated
 */
public class SmartcontractParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser smartContractTypeName_5006Parser;

	/**
	* @generated
	*/
	private IParser getSmartContractTypeName_5006Parser() {
		if (smartContractTypeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { SmartcontractPackage.eINSTANCE.getSmartContract_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			smartContractTypeName_5006Parser = parser;
		}
		return smartContractTypeName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser contractFunctionName_5005Parser;

	/**
	* @generated
	*/
	private IParser getContractFunctionName_5005Parser() {
		if (contractFunctionName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { SmartcontractPackage.eINSTANCE.getContractFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contractFunctionName_5005Parser = parser;
		}
		return contractFunctionName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser inputParameterName_5010Parser;

	/**
	* @generated
	*/
	private IParser getInputParameterName_5010Parser() {
		if (inputParameterName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { SmartcontractPackage.eINSTANCE.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputParameterName_5010Parser = parser;
		}
		return inputParameterName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser outputParameterName_5009Parser;

	/**
	* @generated
	*/
	private IParser getOutputParameterName_5009Parser() {
		if (outputParameterName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { SmartcontractPackage.eINSTANCE.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputParameterName_5009Parser = parser;
		}
		return outputParameterName_5009Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SmartContractTypeNameEditPart.VISUAL_ID:
			return getSmartContractTypeName_5006Parser();
		case ContractFunctionNameEditPart.VISUAL_ID:
			return getContractFunctionName_5005Parser();
		case InputParameterNameEditPart.VISUAL_ID:
			return getInputParameterName_5010Parser();
		case OutputParameterNameEditPart.VISUAL_ID:
			return getOutputParameterName_5009Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SmartcontractVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SmartcontractVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SmartcontractElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

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
import smartcontract.diagram.edit.parts.ConstructorParameterNameEditPart;
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
	private IParser smartContractTypeName_5014Parser;

	/**
	* @generated
	*/
	private IParser getSmartContractTypeName_5014Parser() {
		if (smartContractTypeName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { SmartcontractPackage.eINSTANCE.getSmartContract_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			smartContractTypeName_5014Parser = parser;
		}
		return smartContractTypeName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser constructorParameterName_5015Parser;

	/**
	* @generated
	*/
	private IParser getConstructorParameterName_5015Parser() {
		if (constructorParameterName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { SmartcontractPackage.eINSTANCE.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			constructorParameterName_5015Parser = parser;
		}
		return constructorParameterName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser contractFunctionName_5013Parser;

	/**
	* @generated
	*/
	private IParser getContractFunctionName_5013Parser() {
		if (contractFunctionName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { SmartcontractPackage.eINSTANCE.getContractFunction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contractFunctionName_5013Parser = parser;
		}
		return contractFunctionName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser inputParameterName_5011Parser;

	/**
	* @generated
	*/
	private IParser getInputParameterName_5011Parser() {
		if (inputParameterName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { SmartcontractPackage.eINSTANCE.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputParameterName_5011Parser = parser;
		}
		return inputParameterName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser outputParameterName_5012Parser;

	/**
	* @generated
	*/
	private IParser getOutputParameterName_5012Parser() {
		if (outputParameterName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { SmartcontractPackage.eINSTANCE.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputParameterName_5012Parser = parser;
		}
		return outputParameterName_5012Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SmartContractTypeNameEditPart.VISUAL_ID:
			return getSmartContractTypeName_5014Parser();
		case ConstructorParameterNameEditPart.VISUAL_ID:
			return getConstructorParameterName_5015Parser();
		case ContractFunctionNameEditPart.VISUAL_ID:
			return getContractFunctionName_5013Parser();
		case InputParameterNameEditPart.VISUAL_ID:
			return getInputParameterName_5011Parser();
		case OutputParameterNameEditPart.VISUAL_ID:
			return getOutputParameterName_5012Parser();
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

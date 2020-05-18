/*
 * 
 */
package cepapp.diagram.providers;

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

import cepapp.CepappPackage;
import cepapp.diagram.edit.parts.ComplexEventPropertyName2EditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyNameEditPart;
import cepapp.diagram.edit.parts.ComplexEventTypeNameEditPart;
import cepapp.diagram.edit.parts.EventPropertyName2EditPart;
import cepapp.diagram.edit.parts.EventPropertyNameEditPart;
import cepapp.diagram.edit.parts.EventTypeNameEditPart;
import cepapp.diagram.edit.parts.LinkOrderEditPart;
import cepapp.diagram.parsers.MessageFormatParser;
import cepapp.diagram.part.CepappVisualIDRegistry;

/**
 * @generated
 */
public class CepappParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser eventTypeName_5003Parser;

	/**
	* @generated
	*/
	private IParser getEventTypeName_5003Parser() {
		if (eventTypeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CepappPackage.eINSTANCE.getEvent_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventTypeName_5003Parser = parser;
		}
		return eventTypeName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser complexEventTypeName_5004Parser;

	/**
	* @generated
	*/
	private IParser getComplexEventTypeName_5004Parser() {
		if (complexEventTypeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { CepappPackage.eINSTANCE.getComplexEvent_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			complexEventTypeName_5004Parser = parser;
		}
		return complexEventTypeName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser eventPropertyName_5002Parser;

	/**
	* @generated
	*/
	private IParser getEventPropertyName_5002Parser() {
		if (eventPropertyName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CepappPackage.eINSTANCE.getEventProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventPropertyName_5002Parser = parser;
		}
		return eventPropertyName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser eventPropertyName_5001Parser;

	/**
	* @generated
	*/
	private IParser getEventPropertyName_5001Parser() {
		if (eventPropertyName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CepappPackage.eINSTANCE.getEventProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventPropertyName_5001Parser = parser;
		}
		return eventPropertyName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser complexEventPropertyName_5005Parser;

	/**
	* @generated
	*/
	private IParser getComplexEventPropertyName_5005Parser() {
		if (complexEventPropertyName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CepappPackage.eINSTANCE.getComplexEventProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			complexEventPropertyName_5005Parser = parser;
		}
		return complexEventPropertyName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser complexEventPropertyName_5006Parser;

	/**
	* @generated
	*/
	private IParser getComplexEventPropertyName_5006Parser() {
		if (complexEventPropertyName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { CepappPackage.eINSTANCE.getComplexEventProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			complexEventPropertyName_5006Parser = parser;
		}
		return complexEventPropertyName_5006Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EventTypeNameEditPart.VISUAL_ID:
			return getEventTypeName_5003Parser();
		case ComplexEventTypeNameEditPart.VISUAL_ID:
			return getComplexEventTypeName_5004Parser();
		case EventPropertyNameEditPart.VISUAL_ID:
			return getEventPropertyName_5002Parser();
		case EventPropertyName2EditPart.VISUAL_ID:
			return getEventPropertyName_5001Parser();
		case ComplexEventPropertyNameEditPart.VISUAL_ID:
			return getComplexEventPropertyName_5005Parser();
		case ComplexEventPropertyName2EditPart.VISUAL_ID:
			return getComplexEventPropertyName_5006Parser();
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
			return getParser(CepappVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CepappVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CepappElementTypes.getElement(hint) == null) {
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

/*
 * 
 */
package domain.diagram.providers;

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

import domain.DomainPackage;
import domain.diagram.edit.parts.EventPropertyName2EditPart;
import domain.diagram.edit.parts.EventPropertyNameEditPart;
import domain.diagram.edit.parts.EventPropertyNameType2EditPart;
import domain.diagram.edit.parts.EventPropertyNameTypeEditPart;
import domain.diagram.edit.parts.EventTypeNameEditPart;
import domain.diagram.parsers.MessageFormatParser;
import domain.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser eventTypeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getEventTypeName_5003Parser() {
		if (eventTypeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getEvent_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventTypeName_5003Parser = parser;
		}
		return eventTypeName_5003Parser;
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
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getEventProperty_Name() };
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
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getEventProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventPropertyName_5001Parser = parser;
		}
		return eventPropertyName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EventTypeNameEditPart.VISUAL_ID:
			return getEventTypeName_5003Parser();
		case EventPropertyNameEditPart.VISUAL_ID:
			return getEventPropertyName_5002Parser();
		case EventPropertyName2EditPart.VISUAL_ID:
			return getEventPropertyName_5001Parser();
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
			return getParser(DomainVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DomainVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DomainElementTypes.getElement(hint) == null) {
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

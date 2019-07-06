/*
 * 
 */
package eventpattern.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import eventpattern.EventpatternPackage;
import eventpattern.diagram.edit.parts.*;
import eventpattern.diagram.part.EventpatternDiagramEditorPlugin;

/**
 * @generated
 */
public class EventpatternElementTypes {

	/**
	 * @generated
	 */
	private EventpatternElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			EventpatternDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType CEPEventPattern_1000 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.CEPEventPattern_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType And_2001 = getElementType("es.uca.modeling.cep.eventpattern.diagram.And_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Or_2002 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Or_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Not_2003 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Not_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Addition_2004 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Addition_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Subtraction_2005 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Subtraction_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Multiplication_2006 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Multiplication_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Division_2007 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Division_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Modulus_2008 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Modulus_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Equal_2009 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Equal_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NotEqual_2010 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.NotEqual_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LessThan_2011 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.LessThan_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GreaterThan_2012 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.GreaterThan_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LessEqual_2013 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.LessEqual_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GreaterEqual_2014 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.GreaterEqual_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Every_2015 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Every_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EveryDistinct_2016 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.EveryDistinct_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Repeat_2017 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Repeat_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Until_2018 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Until_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Range_2019 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Range_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FollowedBy_2020 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.FollowedBy_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_2021 = getElementType("es.uca.modeling.cep.eventpattern.diagram.While_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Max_2022 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Max_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Min_2023 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Min_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Avg_2024 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Avg_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Count_2025 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Count_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sum_2026 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Sum_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2027 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Event_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventProperty_2028 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.EventProperty_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Value_2029 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Value_2029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupBy_2040 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.GroupBy_2040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WithinTimer_2030 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.WithinTimer_2030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TimeInterval_2031 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.TimeInterval_2031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TimeSchedule_2032 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.TimeSchedule_2032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Email_2033 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Email_2033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Twitter_2039 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Twitter_2039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SlidingEventInterval_2034 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.SlidingEventInterval_2034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BatchingEventInterval_2035 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.BatchingEventInterval_2035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SlidingTimeInterval_2036 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.SlidingTimeInterval_2036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BatchingTimeInterval_2037 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.BatchingTimeInterval_2037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComplexEvent_2038 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.ComplexEvent_2038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SmartContract_2041 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.SmartContract_2041"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventProperty_3001 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.EventProperty_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventProperty_3002 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.EventProperty_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType And_3003 = getElementType("es.uca.modeling.cep.eventpattern.diagram.And_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Or_3004 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Or_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Not_3005 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Not_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Addition_3006 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Addition_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Subtraction_3007 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Subtraction_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Multiplication_3008 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Multiplication_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Division_3009 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Division_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Modulus_3010 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Modulus_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Equal_3011 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Equal_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NotEqual_3012 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.NotEqual_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LessThan_3013 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.LessThan_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GreaterThan_3014 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.GreaterThan_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LessEqual_3015 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.LessEqual_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GreaterEqual_3016 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.GreaterEqual_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Every_3017 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Every_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EveryDistinct_3018 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.EveryDistinct_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Repeat_3019 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Repeat_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Until_3020 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Until_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Range_3021 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Range_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FollowedBy_3022 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.FollowedBy_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3023 = getElementType("es.uca.modeling.cep.eventpattern.diagram.While_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_3024 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Event_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventProperty_3025 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.EventProperty_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Value_3026 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Value_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType And_3027 = getElementType("es.uca.modeling.cep.eventpattern.diagram.And_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Or_3028 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Or_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Not_3029 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Not_3029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Addition_3030 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Addition_3030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Subtraction_3031 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Subtraction_3031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Multiplication_3032 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Multiplication_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Division_3033 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Division_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Modulus_3034 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Modulus_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Equal_3035 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Equal_3035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NotEqual_3036 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.NotEqual_3036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LessThan_3037 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.LessThan_3037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GreaterThan_3038 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.GreaterThan_3038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LessEqual_3039 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.LessEqual_3039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GreaterEqual_3040 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.GreaterEqual_3040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Every_3041 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Every_3041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EveryDistinct_3042 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.EveryDistinct_3042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Repeat_3043 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.Repeat_3043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Until_3044 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Until_3044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Range_3045 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Range_3045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FollowedBy_3046 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.FollowedBy_3046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3047 = getElementType("es.uca.modeling.cep.eventpattern.diagram.While_3047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Max_3048 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Max_3048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Min_3049 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Min_3049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Avg_3050 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Avg_3050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Count_3051 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Count_3051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sum_3052 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Sum_3052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_3053 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Event_3053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventProperty_3054 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.EventProperty_3054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Value_3055 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Value_3055"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupBy_3060 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.GroupBy_3060"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WithinTimer_3056 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.WithinTimer_3056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TimeInterval_3057 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.TimeInterval_3057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TimeSchedule_3058 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.TimeSchedule_3058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComplexEventProperty_3059 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.ComplexEventProperty_3059"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContractFunction_3061 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.ContractFunction_3061"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType InputParameter_3062 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.InputParameter_3062"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType OutputParameter_3063 = getElementType(
			"es.uca.modeling.cep.eventpattern.diagram.OutputParameter_3063"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Link_4001 = getElementType("es.uca.modeling.cep.eventpattern.diagram.Link_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(CEPEventPattern_1000, EventpatternPackage.eINSTANCE.getCEPEventPattern());

			elements.put(And_2001, EventpatternPackage.eINSTANCE.getAnd());

			elements.put(Or_2002, EventpatternPackage.eINSTANCE.getOr());

			elements.put(Not_2003, EventpatternPackage.eINSTANCE.getNot());

			elements.put(Addition_2004, EventpatternPackage.eINSTANCE.getAddition());

			elements.put(Subtraction_2005, EventpatternPackage.eINSTANCE.getSubtraction());

			elements.put(Multiplication_2006, EventpatternPackage.eINSTANCE.getMultiplication());

			elements.put(Division_2007, EventpatternPackage.eINSTANCE.getDivision());

			elements.put(Modulus_2008, EventpatternPackage.eINSTANCE.getModulus());

			elements.put(Equal_2009, EventpatternPackage.eINSTANCE.getEqual());

			elements.put(NotEqual_2010, EventpatternPackage.eINSTANCE.getNotEqual());

			elements.put(LessThan_2011, EventpatternPackage.eINSTANCE.getLessThan());

			elements.put(GreaterThan_2012, EventpatternPackage.eINSTANCE.getGreaterThan());

			elements.put(LessEqual_2013, EventpatternPackage.eINSTANCE.getLessEqual());

			elements.put(GreaterEqual_2014, EventpatternPackage.eINSTANCE.getGreaterEqual());

			elements.put(Every_2015, EventpatternPackage.eINSTANCE.getEvery());

			elements.put(EveryDistinct_2016, EventpatternPackage.eINSTANCE.getEveryDistinct());

			elements.put(Repeat_2017, EventpatternPackage.eINSTANCE.getRepeat());

			elements.put(Until_2018, EventpatternPackage.eINSTANCE.getUntil());

			elements.put(Range_2019, EventpatternPackage.eINSTANCE.getRange());

			elements.put(FollowedBy_2020, EventpatternPackage.eINSTANCE.getFollowedBy());

			elements.put(While_2021, EventpatternPackage.eINSTANCE.getWhile());

			elements.put(Max_2022, EventpatternPackage.eINSTANCE.getMax());

			elements.put(Min_2023, EventpatternPackage.eINSTANCE.getMin());

			elements.put(Avg_2024, EventpatternPackage.eINSTANCE.getAvg());

			elements.put(Count_2025, EventpatternPackage.eINSTANCE.getCount());

			elements.put(Sum_2026, EventpatternPackage.eINSTANCE.getSum());

			elements.put(Event_2027, EventpatternPackage.eINSTANCE.getEvent());

			elements.put(EventProperty_2028, EventpatternPackage.eINSTANCE.getEventProperty());

			elements.put(Value_2029, EventpatternPackage.eINSTANCE.getValue());

			elements.put(GroupBy_2040, EventpatternPackage.eINSTANCE.getGroupBy());

			elements.put(WithinTimer_2030, EventpatternPackage.eINSTANCE.getWithinTimer());

			elements.put(TimeInterval_2031, EventpatternPackage.eINSTANCE.getTimeInterval());

			elements.put(TimeSchedule_2032, EventpatternPackage.eINSTANCE.getTimeSchedule());

			elements.put(Email_2033, EventpatternPackage.eINSTANCE.getEmail());

			elements.put(Twitter_2039, EventpatternPackage.eINSTANCE.getTwitter());

			elements.put(SlidingEventInterval_2034, EventpatternPackage.eINSTANCE.getSlidingEventInterval());

			elements.put(BatchingEventInterval_2035, EventpatternPackage.eINSTANCE.getBatchingEventInterval());

			elements.put(SlidingTimeInterval_2036, EventpatternPackage.eINSTANCE.getSlidingTimeInterval());

			elements.put(BatchingTimeInterval_2037, EventpatternPackage.eINSTANCE.getBatchingTimeInterval());

			elements.put(ComplexEvent_2038, EventpatternPackage.eINSTANCE.getComplexEvent());

			elements.put(SmartContract_2041, EventpatternPackage.eINSTANCE.getSmartContract());

			elements.put(EventProperty_3001, EventpatternPackage.eINSTANCE.getEventProperty());

			elements.put(EventProperty_3002, EventpatternPackage.eINSTANCE.getEventProperty());

			elements.put(And_3003, EventpatternPackage.eINSTANCE.getAnd());

			elements.put(Or_3004, EventpatternPackage.eINSTANCE.getOr());

			elements.put(Not_3005, EventpatternPackage.eINSTANCE.getNot());

			elements.put(Addition_3006, EventpatternPackage.eINSTANCE.getAddition());

			elements.put(Subtraction_3007, EventpatternPackage.eINSTANCE.getSubtraction());

			elements.put(Multiplication_3008, EventpatternPackage.eINSTANCE.getMultiplication());

			elements.put(Division_3009, EventpatternPackage.eINSTANCE.getDivision());

			elements.put(Modulus_3010, EventpatternPackage.eINSTANCE.getModulus());

			elements.put(Equal_3011, EventpatternPackage.eINSTANCE.getEqual());

			elements.put(NotEqual_3012, EventpatternPackage.eINSTANCE.getNotEqual());

			elements.put(LessThan_3013, EventpatternPackage.eINSTANCE.getLessThan());

			elements.put(GreaterThan_3014, EventpatternPackage.eINSTANCE.getGreaterThan());

			elements.put(LessEqual_3015, EventpatternPackage.eINSTANCE.getLessEqual());

			elements.put(GreaterEqual_3016, EventpatternPackage.eINSTANCE.getGreaterEqual());

			elements.put(Every_3017, EventpatternPackage.eINSTANCE.getEvery());

			elements.put(EveryDistinct_3018, EventpatternPackage.eINSTANCE.getEveryDistinct());

			elements.put(Repeat_3019, EventpatternPackage.eINSTANCE.getRepeat());

			elements.put(Until_3020, EventpatternPackage.eINSTANCE.getUntil());

			elements.put(Range_3021, EventpatternPackage.eINSTANCE.getRange());

			elements.put(FollowedBy_3022, EventpatternPackage.eINSTANCE.getFollowedBy());

			elements.put(While_3023, EventpatternPackage.eINSTANCE.getWhile());

			elements.put(Event_3024, EventpatternPackage.eINSTANCE.getEvent());

			elements.put(EventProperty_3025, EventpatternPackage.eINSTANCE.getEventProperty());

			elements.put(Value_3026, EventpatternPackage.eINSTANCE.getValue());

			elements.put(And_3027, EventpatternPackage.eINSTANCE.getAnd());

			elements.put(Or_3028, EventpatternPackage.eINSTANCE.getOr());

			elements.put(Not_3029, EventpatternPackage.eINSTANCE.getNot());

			elements.put(Addition_3030, EventpatternPackage.eINSTANCE.getAddition());

			elements.put(Subtraction_3031, EventpatternPackage.eINSTANCE.getSubtraction());

			elements.put(Multiplication_3032, EventpatternPackage.eINSTANCE.getMultiplication());

			elements.put(Division_3033, EventpatternPackage.eINSTANCE.getDivision());

			elements.put(Modulus_3034, EventpatternPackage.eINSTANCE.getModulus());

			elements.put(Equal_3035, EventpatternPackage.eINSTANCE.getEqual());

			elements.put(NotEqual_3036, EventpatternPackage.eINSTANCE.getNotEqual());

			elements.put(LessThan_3037, EventpatternPackage.eINSTANCE.getLessThan());

			elements.put(GreaterThan_3038, EventpatternPackage.eINSTANCE.getGreaterThan());

			elements.put(LessEqual_3039, EventpatternPackage.eINSTANCE.getLessEqual());

			elements.put(GreaterEqual_3040, EventpatternPackage.eINSTANCE.getGreaterEqual());

			elements.put(Every_3041, EventpatternPackage.eINSTANCE.getEvery());

			elements.put(EveryDistinct_3042, EventpatternPackage.eINSTANCE.getEveryDistinct());

			elements.put(Repeat_3043, EventpatternPackage.eINSTANCE.getRepeat());

			elements.put(Until_3044, EventpatternPackage.eINSTANCE.getUntil());

			elements.put(Range_3045, EventpatternPackage.eINSTANCE.getRange());

			elements.put(FollowedBy_3046, EventpatternPackage.eINSTANCE.getFollowedBy());

			elements.put(While_3047, EventpatternPackage.eINSTANCE.getWhile());

			elements.put(Max_3048, EventpatternPackage.eINSTANCE.getMax());

			elements.put(Min_3049, EventpatternPackage.eINSTANCE.getMin());

			elements.put(Avg_3050, EventpatternPackage.eINSTANCE.getAvg());

			elements.put(Count_3051, EventpatternPackage.eINSTANCE.getCount());

			elements.put(Sum_3052, EventpatternPackage.eINSTANCE.getSum());

			elements.put(Event_3053, EventpatternPackage.eINSTANCE.getEvent());

			elements.put(EventProperty_3054, EventpatternPackage.eINSTANCE.getEventProperty());

			elements.put(Value_3055, EventpatternPackage.eINSTANCE.getValue());

			elements.put(GroupBy_3060, EventpatternPackage.eINSTANCE.getGroupBy());

			elements.put(WithinTimer_3056, EventpatternPackage.eINSTANCE.getWithinTimer());

			elements.put(TimeInterval_3057, EventpatternPackage.eINSTANCE.getTimeInterval());

			elements.put(TimeSchedule_3058, EventpatternPackage.eINSTANCE.getTimeSchedule());

			elements.put(ComplexEventProperty_3059, EventpatternPackage.eINSTANCE.getComplexEventProperty());

			elements.put(ContractFunction_3061, EventpatternPackage.eINSTANCE.getContractFunction());

			elements.put(InputParameter_3062, EventpatternPackage.eINSTANCE.getInputParameter());

			elements.put(OutputParameter_3063, EventpatternPackage.eINSTANCE.getOutputParameter());

			elements.put(Link_4001, EventpatternPackage.eINSTANCE.getLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(CEPEventPattern_1000);
			KNOWN_ELEMENT_TYPES.add(And_2001);
			KNOWN_ELEMENT_TYPES.add(Or_2002);
			KNOWN_ELEMENT_TYPES.add(Not_2003);
			KNOWN_ELEMENT_TYPES.add(Addition_2004);
			KNOWN_ELEMENT_TYPES.add(Subtraction_2005);
			KNOWN_ELEMENT_TYPES.add(Multiplication_2006);
			KNOWN_ELEMENT_TYPES.add(Division_2007);
			KNOWN_ELEMENT_TYPES.add(Modulus_2008);
			KNOWN_ELEMENT_TYPES.add(Equal_2009);
			KNOWN_ELEMENT_TYPES.add(NotEqual_2010);
			KNOWN_ELEMENT_TYPES.add(LessThan_2011);
			KNOWN_ELEMENT_TYPES.add(GreaterThan_2012);
			KNOWN_ELEMENT_TYPES.add(LessEqual_2013);
			KNOWN_ELEMENT_TYPES.add(GreaterEqual_2014);
			KNOWN_ELEMENT_TYPES.add(Every_2015);
			KNOWN_ELEMENT_TYPES.add(EveryDistinct_2016);
			KNOWN_ELEMENT_TYPES.add(Repeat_2017);
			KNOWN_ELEMENT_TYPES.add(Until_2018);
			KNOWN_ELEMENT_TYPES.add(Range_2019);
			KNOWN_ELEMENT_TYPES.add(FollowedBy_2020);
			KNOWN_ELEMENT_TYPES.add(While_2021);
			KNOWN_ELEMENT_TYPES.add(Max_2022);
			KNOWN_ELEMENT_TYPES.add(Min_2023);
			KNOWN_ELEMENT_TYPES.add(Avg_2024);
			KNOWN_ELEMENT_TYPES.add(Count_2025);
			KNOWN_ELEMENT_TYPES.add(Sum_2026);
			KNOWN_ELEMENT_TYPES.add(Event_2027);
			KNOWN_ELEMENT_TYPES.add(EventProperty_2028);
			KNOWN_ELEMENT_TYPES.add(Value_2029);
			KNOWN_ELEMENT_TYPES.add(GroupBy_2040);
			KNOWN_ELEMENT_TYPES.add(WithinTimer_2030);
			KNOWN_ELEMENT_TYPES.add(TimeInterval_2031);
			KNOWN_ELEMENT_TYPES.add(TimeSchedule_2032);
			KNOWN_ELEMENT_TYPES.add(Email_2033);
			KNOWN_ELEMENT_TYPES.add(Twitter_2039);
			KNOWN_ELEMENT_TYPES.add(SlidingEventInterval_2034);
			KNOWN_ELEMENT_TYPES.add(BatchingEventInterval_2035);
			KNOWN_ELEMENT_TYPES.add(SlidingTimeInterval_2036);
			KNOWN_ELEMENT_TYPES.add(BatchingTimeInterval_2037);
			KNOWN_ELEMENT_TYPES.add(ComplexEvent_2038);
			KNOWN_ELEMENT_TYPES.add(SmartContract_2041);
			KNOWN_ELEMENT_TYPES.add(EventProperty_3001);
			KNOWN_ELEMENT_TYPES.add(EventProperty_3002);
			KNOWN_ELEMENT_TYPES.add(And_3003);
			KNOWN_ELEMENT_TYPES.add(Or_3004);
			KNOWN_ELEMENT_TYPES.add(Not_3005);
			KNOWN_ELEMENT_TYPES.add(Addition_3006);
			KNOWN_ELEMENT_TYPES.add(Subtraction_3007);
			KNOWN_ELEMENT_TYPES.add(Multiplication_3008);
			KNOWN_ELEMENT_TYPES.add(Division_3009);
			KNOWN_ELEMENT_TYPES.add(Modulus_3010);
			KNOWN_ELEMENT_TYPES.add(Equal_3011);
			KNOWN_ELEMENT_TYPES.add(NotEqual_3012);
			KNOWN_ELEMENT_TYPES.add(LessThan_3013);
			KNOWN_ELEMENT_TYPES.add(GreaterThan_3014);
			KNOWN_ELEMENT_TYPES.add(LessEqual_3015);
			KNOWN_ELEMENT_TYPES.add(GreaterEqual_3016);
			KNOWN_ELEMENT_TYPES.add(Every_3017);
			KNOWN_ELEMENT_TYPES.add(EveryDistinct_3018);
			KNOWN_ELEMENT_TYPES.add(Repeat_3019);
			KNOWN_ELEMENT_TYPES.add(Until_3020);
			KNOWN_ELEMENT_TYPES.add(Range_3021);
			KNOWN_ELEMENT_TYPES.add(FollowedBy_3022);
			KNOWN_ELEMENT_TYPES.add(While_3023);
			KNOWN_ELEMENT_TYPES.add(Event_3024);
			KNOWN_ELEMENT_TYPES.add(EventProperty_3025);
			KNOWN_ELEMENT_TYPES.add(Value_3026);
			KNOWN_ELEMENT_TYPES.add(And_3027);
			KNOWN_ELEMENT_TYPES.add(Or_3028);
			KNOWN_ELEMENT_TYPES.add(Not_3029);
			KNOWN_ELEMENT_TYPES.add(Addition_3030);
			KNOWN_ELEMENT_TYPES.add(Subtraction_3031);
			KNOWN_ELEMENT_TYPES.add(Multiplication_3032);
			KNOWN_ELEMENT_TYPES.add(Division_3033);
			KNOWN_ELEMENT_TYPES.add(Modulus_3034);
			KNOWN_ELEMENT_TYPES.add(Equal_3035);
			KNOWN_ELEMENT_TYPES.add(NotEqual_3036);
			KNOWN_ELEMENT_TYPES.add(LessThan_3037);
			KNOWN_ELEMENT_TYPES.add(GreaterThan_3038);
			KNOWN_ELEMENT_TYPES.add(LessEqual_3039);
			KNOWN_ELEMENT_TYPES.add(GreaterEqual_3040);
			KNOWN_ELEMENT_TYPES.add(Every_3041);
			KNOWN_ELEMENT_TYPES.add(EveryDistinct_3042);
			KNOWN_ELEMENT_TYPES.add(Repeat_3043);
			KNOWN_ELEMENT_TYPES.add(Until_3044);
			KNOWN_ELEMENT_TYPES.add(Range_3045);
			KNOWN_ELEMENT_TYPES.add(FollowedBy_3046);
			KNOWN_ELEMENT_TYPES.add(While_3047);
			KNOWN_ELEMENT_TYPES.add(Max_3048);
			KNOWN_ELEMENT_TYPES.add(Min_3049);
			KNOWN_ELEMENT_TYPES.add(Avg_3050);
			KNOWN_ELEMENT_TYPES.add(Count_3051);
			KNOWN_ELEMENT_TYPES.add(Sum_3052);
			KNOWN_ELEMENT_TYPES.add(Event_3053);
			KNOWN_ELEMENT_TYPES.add(EventProperty_3054);
			KNOWN_ELEMENT_TYPES.add(Value_3055);
			KNOWN_ELEMENT_TYPES.add(GroupBy_3060);
			KNOWN_ELEMENT_TYPES.add(WithinTimer_3056);
			KNOWN_ELEMENT_TYPES.add(TimeInterval_3057);
			KNOWN_ELEMENT_TYPES.add(TimeSchedule_3058);
			KNOWN_ELEMENT_TYPES.add(ComplexEventProperty_3059);
			KNOWN_ELEMENT_TYPES.add(ContractFunction_3061);
			KNOWN_ELEMENT_TYPES.add(InputParameter_3062);
			KNOWN_ELEMENT_TYPES.add(OutputParameter_3063);
			KNOWN_ELEMENT_TYPES.add(Link_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CEPEventPatternEditPart.VISUAL_ID:
			return CEPEventPattern_1000;
		case AndEditPart.VISUAL_ID:
			return And_2001;
		case OrEditPart.VISUAL_ID:
			return Or_2002;
		case NotEditPart.VISUAL_ID:
			return Not_2003;
		case AdditionEditPart.VISUAL_ID:
			return Addition_2004;
		case SubtractionEditPart.VISUAL_ID:
			return Subtraction_2005;
		case MultiplicationEditPart.VISUAL_ID:
			return Multiplication_2006;
		case DivisionEditPart.VISUAL_ID:
			return Division_2007;
		case ModulusEditPart.VISUAL_ID:
			return Modulus_2008;
		case EqualEditPart.VISUAL_ID:
			return Equal_2009;
		case NotEqualEditPart.VISUAL_ID:
			return NotEqual_2010;
		case LessThanEditPart.VISUAL_ID:
			return LessThan_2011;
		case GreaterThanEditPart.VISUAL_ID:
			return GreaterThan_2012;
		case LessEqualEditPart.VISUAL_ID:
			return LessEqual_2013;
		case GreaterEqualEditPart.VISUAL_ID:
			return GreaterEqual_2014;
		case EveryEditPart.VISUAL_ID:
			return Every_2015;
		case EveryDistinctEditPart.VISUAL_ID:
			return EveryDistinct_2016;
		case RepeatEditPart.VISUAL_ID:
			return Repeat_2017;
		case UntilEditPart.VISUAL_ID:
			return Until_2018;
		case RangeEditPart.VISUAL_ID:
			return Range_2019;
		case FollowedByEditPart.VISUAL_ID:
			return FollowedBy_2020;
		case WhileEditPart.VISUAL_ID:
			return While_2021;
		case MaxEditPart.VISUAL_ID:
			return Max_2022;
		case MinEditPart.VISUAL_ID:
			return Min_2023;
		case AvgEditPart.VISUAL_ID:
			return Avg_2024;
		case CountEditPart.VISUAL_ID:
			return Count_2025;
		case SumEditPart.VISUAL_ID:
			return Sum_2026;
		case EventEditPart.VISUAL_ID:
			return Event_2027;
		case EventPropertyEditPart.VISUAL_ID:
			return EventProperty_2028;
		case ValueEditPart.VISUAL_ID:
			return Value_2029;
		case GroupByEditPart.VISUAL_ID:
			return GroupBy_2040;
		case WithinTimerEditPart.VISUAL_ID:
			return WithinTimer_2030;
		case TimeIntervalEditPart.VISUAL_ID:
			return TimeInterval_2031;
		case TimeScheduleEditPart.VISUAL_ID:
			return TimeSchedule_2032;
		case EmailEditPart.VISUAL_ID:
			return Email_2033;
		case TwitterEditPart.VISUAL_ID:
			return Twitter_2039;
		case SlidingEventIntervalEditPart.VISUAL_ID:
			return SlidingEventInterval_2034;
		case BatchingEventIntervalEditPart.VISUAL_ID:
			return BatchingEventInterval_2035;
		case SlidingTimeIntervalEditPart.VISUAL_ID:
			return SlidingTimeInterval_2036;
		case BatchingTimeIntervalEditPart.VISUAL_ID:
			return BatchingTimeInterval_2037;
		case ComplexEventEditPart.VISUAL_ID:
			return ComplexEvent_2038;
		case SmartContractEditPart.VISUAL_ID:
			return SmartContract_2041;
		case EventProperty2EditPart.VISUAL_ID:
			return EventProperty_3001;
		case EventProperty3EditPart.VISUAL_ID:
			return EventProperty_3002;
		case And2EditPart.VISUAL_ID:
			return And_3003;
		case Or2EditPart.VISUAL_ID:
			return Or_3004;
		case Not2EditPart.VISUAL_ID:
			return Not_3005;
		case Addition2EditPart.VISUAL_ID:
			return Addition_3006;
		case Subtraction2EditPart.VISUAL_ID:
			return Subtraction_3007;
		case Multiplication2EditPart.VISUAL_ID:
			return Multiplication_3008;
		case Division2EditPart.VISUAL_ID:
			return Division_3009;
		case Modulus2EditPart.VISUAL_ID:
			return Modulus_3010;
		case Equal2EditPart.VISUAL_ID:
			return Equal_3011;
		case NotEqual2EditPart.VISUAL_ID:
			return NotEqual_3012;
		case LessThan2EditPart.VISUAL_ID:
			return LessThan_3013;
		case GreaterThan2EditPart.VISUAL_ID:
			return GreaterThan_3014;
		case LessEqual2EditPart.VISUAL_ID:
			return LessEqual_3015;
		case GreaterEqual2EditPart.VISUAL_ID:
			return GreaterEqual_3016;
		case Every2EditPart.VISUAL_ID:
			return Every_3017;
		case EveryDistinct2EditPart.VISUAL_ID:
			return EveryDistinct_3018;
		case Repeat2EditPart.VISUAL_ID:
			return Repeat_3019;
		case Until2EditPart.VISUAL_ID:
			return Until_3020;
		case Range2EditPart.VISUAL_ID:
			return Range_3021;
		case FollowedBy2EditPart.VISUAL_ID:
			return FollowedBy_3022;
		case While2EditPart.VISUAL_ID:
			return While_3023;
		case Event2EditPart.VISUAL_ID:
			return Event_3024;
		case EventProperty4EditPart.VISUAL_ID:
			return EventProperty_3025;
		case Value2EditPart.VISUAL_ID:
			return Value_3026;
		case And3EditPart.VISUAL_ID:
			return And_3027;
		case Or3EditPart.VISUAL_ID:
			return Or_3028;
		case Not3EditPart.VISUAL_ID:
			return Not_3029;
		case Addition3EditPart.VISUAL_ID:
			return Addition_3030;
		case Subtraction3EditPart.VISUAL_ID:
			return Subtraction_3031;
		case Multiplication3EditPart.VISUAL_ID:
			return Multiplication_3032;
		case Division3EditPart.VISUAL_ID:
			return Division_3033;
		case Modulus3EditPart.VISUAL_ID:
			return Modulus_3034;
		case Equal3EditPart.VISUAL_ID:
			return Equal_3035;
		case NotEqual3EditPart.VISUAL_ID:
			return NotEqual_3036;
		case LessThan3EditPart.VISUAL_ID:
			return LessThan_3037;
		case GreaterThan3EditPart.VISUAL_ID:
			return GreaterThan_3038;
		case LessEqual3EditPart.VISUAL_ID:
			return LessEqual_3039;
		case GreaterEqual3EditPart.VISUAL_ID:
			return GreaterEqual_3040;
		case Every3EditPart.VISUAL_ID:
			return Every_3041;
		case EveryDistinct3EditPart.VISUAL_ID:
			return EveryDistinct_3042;
		case Repeat3EditPart.VISUAL_ID:
			return Repeat_3043;
		case Until3EditPart.VISUAL_ID:
			return Until_3044;
		case Range3EditPart.VISUAL_ID:
			return Range_3045;
		case FollowedBy3EditPart.VISUAL_ID:
			return FollowedBy_3046;
		case While3EditPart.VISUAL_ID:
			return While_3047;
		case Max2EditPart.VISUAL_ID:
			return Max_3048;
		case Min2EditPart.VISUAL_ID:
			return Min_3049;
		case Avg2EditPart.VISUAL_ID:
			return Avg_3050;
		case Count2EditPart.VISUAL_ID:
			return Count_3051;
		case Sum2EditPart.VISUAL_ID:
			return Sum_3052;
		case Event3EditPart.VISUAL_ID:
			return Event_3053;
		case EventProperty5EditPart.VISUAL_ID:
			return EventProperty_3054;
		case Value3EditPart.VISUAL_ID:
			return Value_3055;
		case GroupBy2EditPart.VISUAL_ID:
			return GroupBy_3060;
		case WithinTimer2EditPart.VISUAL_ID:
			return WithinTimer_3056;
		case TimeInterval2EditPart.VISUAL_ID:
			return TimeInterval_3057;
		case TimeSchedule2EditPart.VISUAL_ID:
			return TimeSchedule_3058;
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return ComplexEventProperty_3059;
		case ContractFunctionEditPart.VISUAL_ID:
			return ContractFunction_3061;
		case InputParameterEditPart.VISUAL_ID:
			return InputParameter_3062;
		case OutputParameterEditPart.VISUAL_ID:
			return OutputParameter_3063;
		case LinkEditPart.VISUAL_ID:
			return Link_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return eventpattern.diagram.providers.EventpatternElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return eventpattern.diagram.providers.EventpatternElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return eventpattern.diagram.providers.EventpatternElementTypes.getElement(elementTypeAdapter);
		}
	};

}

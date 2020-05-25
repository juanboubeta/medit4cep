/**
 */
package cepapp.impl;

import cepapp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CepappFactoryImpl extends EFactoryImpl implements CepappFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CepappFactory init() {
		try {
			CepappFactory theCepappFactory = (CepappFactory)EPackage.Registry.INSTANCE.getEFactory(CepappPackage.eNS_URI);
			if (theCepappFactory != null) {
				return theCepappFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CepappFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CepappFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CepappPackage.CEP_APP: return createCEPApp();
			case CepappPackage.LINK: return createLink();
			case CepappPackage.IN_MEMORY_INPUT: return createInMemoryInput();
			case CepappPackage.INPUT_FILE: return createInputFile();
			case CepappPackage.SOURCE_MQTT: return createSourceMqtt();
			case CepappPackage.EVENT: return createEvent();
			case CepappPackage.EVENT_PROPERTY: return createEventProperty();
			case CepappPackage.IN_MEMORY_OUTPUT: return createInMemoryOutput();
			case CepappPackage.COMPLEX_EVENT: return createComplexEvent();
			case CepappPackage.COMPLEX_EVENT_PROPERTY: return createComplexEventProperty();
			case CepappPackage.OUTPUT_FILE: return createOutputFile();
			case CepappPackage.SINK_MQTT: return createSinkMqtt();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CepappPackage.MAPPING_TYPE:
				return createMappingTypeFromString(eDataType, initialValue);
			case CepappPackage.PROPERTY_TYPE_VALUE:
				return createPropertyTypeValueFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CepappPackage.MAPPING_TYPE:
				return convertMappingTypeToString(eDataType, instanceValue);
			case CepappPackage.PROPERTY_TYPE_VALUE:
				return convertPropertyTypeValueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEPApp createCEPApp() {
		CEPAppImpl cepApp = new CEPAppImpl();
		return cepApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InMemoryInput createInMemoryInput() {
		InMemoryInputImpl inMemoryInput = new InMemoryInputImpl();
		return inMemoryInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFile createInputFile() {
		InputFileImpl inputFile = new InputFileImpl();
		return inputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceMqtt createSourceMqtt() {
		SourceMqttImpl sourceMqtt = new SourceMqttImpl();
		return sourceMqtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventProperty createEventProperty() {
		EventPropertyImpl eventProperty = new EventPropertyImpl();
		return eventProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InMemoryOutput createInMemoryOutput() {
		InMemoryOutputImpl inMemoryOutput = new InMemoryOutputImpl();
		return inMemoryOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEvent createComplexEvent() {
		ComplexEventImpl complexEvent = new ComplexEventImpl();
		return complexEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEventProperty createComplexEventProperty() {
		ComplexEventPropertyImpl complexEventProperty = new ComplexEventPropertyImpl();
		return complexEventProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputFile createOutputFile() {
		OutputFileImpl outputFile = new OutputFileImpl();
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkMqtt createSinkMqtt() {
		SinkMqttImpl sinkMqtt = new SinkMqttImpl();
		return sinkMqtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingType createMappingTypeFromString(EDataType eDataType, String initialValue) {
		MappingType result = MappingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeValue createPropertyTypeValueFromString(EDataType eDataType, String initialValue) {
		PropertyTypeValue result = PropertyTypeValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CepappPackage getCepappPackage() {
		return (CepappPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CepappPackage getPackage() {
		return CepappPackage.eINSTANCE;
	}

} //CepappFactoryImpl

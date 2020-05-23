/**
 */
package cepapp.util;

import cepapp.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cepapp.CepappPackage
 * @generated
 */
public class CepappSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CepappPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CepappSwitch() {
		if (modelPackage == null) {
			modelPackage = CepappPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CepappPackage.CEP_APP: {
				CEPApp cepApp = (CEPApp)theEObject;
				T result = caseCEPApp(cepApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.ORIGIN: {
				Origin origin = (Origin)theEObject;
				T result = caseOrigin(origin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.DESTINATION: {
				Destination destination = (Destination)theEObject;
				T result = caseDestination(destination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.SOURCE_ELEMENT: {
				SourceElement sourceElement = (SourceElement)theEObject;
				T result = caseSourceElement(sourceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.SINK_ELEMENT: {
				SinkElement sinkElement = (SinkElement)theEObject;
				T result = caseSinkElement(sinkElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.MAPPABLE: {
				Mappable mappable = (Mappable)theEObject;
				T result = caseMappable(mappable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseMappable(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.MQTT: {
				MQTT mqtt = (MQTT)theEObject;
				T result = caseMQTT(mqtt);
				if (result == null) result = caseMappable(mqtt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.INPUT_FILE: {
				InputFile inputFile = (InputFile)theEObject;
				T result = caseInputFile(inputFile);
				if (result == null) result = caseFile(inputFile);
				if (result == null) result = caseSourceElement(inputFile);
				if (result == null) result = caseOrigin(inputFile);
				if (result == null) result = caseMappable(inputFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.SOURCE_MQTT: {
				SourceMqtt sourceMqtt = (SourceMqtt)theEObject;
				T result = caseSourceMqtt(sourceMqtt);
				if (result == null) result = caseMQTT(sourceMqtt);
				if (result == null) result = caseSourceElement(sourceMqtt);
				if (result == null) result = caseOrigin(sourceMqtt);
				if (result == null) result = caseMappable(sourceMqtt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseSourceElement(event);
				if (result == null) result = caseDestination(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.EVENT_PROPERTY: {
				EventProperty eventProperty = (EventProperty)theEObject;
				T result = caseEventProperty(eventProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.COMPLEX_EVENT: {
				ComplexEvent complexEvent = (ComplexEvent)theEObject;
				T result = caseComplexEvent(complexEvent);
				if (result == null) result = caseSinkElement(complexEvent);
				if (result == null) result = caseOrigin(complexEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.COMPLEX_EVENT_PROPERTY: {
				ComplexEventProperty complexEventProperty = (ComplexEventProperty)theEObject;
				T result = caseComplexEventProperty(complexEventProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.OUTPUT_FILE: {
				OutputFile outputFile = (OutputFile)theEObject;
				T result = caseOutputFile(outputFile);
				if (result == null) result = caseFile(outputFile);
				if (result == null) result = caseSinkElement(outputFile);
				if (result == null) result = caseDestination(outputFile);
				if (result == null) result = caseMappable(outputFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.SINK_MQTT: {
				SinkMqtt sinkMqtt = (SinkMqtt)theEObject;
				T result = caseSinkMqtt(sinkMqtt);
				if (result == null) result = caseMQTT(sinkMqtt);
				if (result == null) result = caseSinkElement(sinkMqtt);
				if (result == null) result = caseDestination(sinkMqtt);
				if (result == null) result = caseMappable(sinkMqtt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CEP App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CEP App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCEPApp(CEPApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Origin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Origin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrigin(Origin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestination(Destination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceElement(SourceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkElement(SinkElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mappable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mappable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappable(Mappable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MQTT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MQTT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMQTT(MQTT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputFile(InputFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Mqtt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Mqtt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceMqtt(SourceMqtt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventProperty(EventProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexEvent(ComplexEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Event Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Event Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexEventProperty(ComplexEventProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputFile(OutputFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink Mqtt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Mqtt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkMqtt(SinkMqtt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CepappSwitch

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
			case CepappPackage.IN_MEMORY: {
				InMemory inMemory = (InMemory)theEObject;
				T result = caseInMemory(inMemory);
				if (result == null) result = caseMappable(inMemory);
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
			case CepappPackage.EMAIL: {
				Email email = (Email)theEObject;
				T result = caseEmail(email);
				if (result == null) result = caseMappable(email);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.HTTP: {
				Http http = (Http)theEObject;
				T result = caseHttp(http);
				if (result == null) result = caseMappable(http);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseMappable(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.MONGO_DB: {
				MongoDB mongoDB = (MongoDB)theEObject;
				T result = caseMongoDB(mongoDB);
				if (result == null) result = caseDatabase(mongoDB);
				if (result == null) result = caseMappable(mongoDB);
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
			case CepappPackage.IN_MEMORY_INPUT: {
				InMemoryInput inMemoryInput = (InMemoryInput)theEObject;
				T result = caseInMemoryInput(inMemoryInput);
				if (result == null) result = caseInMemory(inMemoryInput);
				if (result == null) result = caseSourceElement(inMemoryInput);
				if (result == null) result = caseOrigin(inMemoryInput);
				if (result == null) result = caseMappable(inMemoryInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.SOURCE_EMAIL: {
				SourceEmail sourceEmail = (SourceEmail)theEObject;
				T result = caseSourceEmail(sourceEmail);
				if (result == null) result = caseEmail(sourceEmail);
				if (result == null) result = caseSourceElement(sourceEmail);
				if (result == null) result = caseOrigin(sourceEmail);
				if (result == null) result = caseMappable(sourceEmail);
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
			case CepappPackage.SOURCE_HTTP: {
				SourceHttp sourceHttp = (SourceHttp)theEObject;
				T result = caseSourceHttp(sourceHttp);
				if (result == null) result = caseHttp(sourceHttp);
				if (result == null) result = caseSourceElement(sourceHttp);
				if (result == null) result = caseOrigin(sourceHttp);
				if (result == null) result = caseMappable(sourceHttp);
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
			case CepappPackage.IN_MEMORY_OUTPUT: {
				InMemoryOutput inMemoryOutput = (InMemoryOutput)theEObject;
				T result = caseInMemoryOutput(inMemoryOutput);
				if (result == null) result = caseInMemory(inMemoryOutput);
				if (result == null) result = caseSinkElement(inMemoryOutput);
				if (result == null) result = caseDestination(inMemoryOutput);
				if (result == null) result = caseMappable(inMemoryOutput);
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
			case CepappPackage.SINK_EMAIL: {
				SinkEmail sinkEmail = (SinkEmail)theEObject;
				T result = caseSinkEmail(sinkEmail);
				if (result == null) result = caseEmail(sinkEmail);
				if (result == null) result = caseSinkElement(sinkEmail);
				if (result == null) result = caseDestination(sinkEmail);
				if (result == null) result = caseMappable(sinkEmail);
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
			case CepappPackage.SINK_MONGO_DB: {
				SinkMongoDB sinkMongoDB = (SinkMongoDB)theEObject;
				T result = caseSinkMongoDB(sinkMongoDB);
				if (result == null) result = caseMongoDB(sinkMongoDB);
				if (result == null) result = caseSinkElement(sinkMongoDB);
				if (result == null) result = caseDestination(sinkMongoDB);
				if (result == null) result = caseDatabase(sinkMongoDB);
				if (result == null) result = caseMappable(sinkMongoDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CepappPackage.SINK_HTTP: {
				SinkHttp sinkHttp = (SinkHttp)theEObject;
				T result = caseSinkHttp(sinkHttp);
				if (result == null) result = caseHttp(sinkHttp);
				if (result == null) result = caseSinkElement(sinkHttp);
				if (result == null) result = caseDestination(sinkHttp);
				if (result == null) result = caseMappable(sinkHttp);
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
	 * Returns the result of interpreting the object as an instance of '<em>In Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInMemory(InMemory object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Email</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmail(Email object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttp(Http object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mongo DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mongo DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMongoDB(MongoDB object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>In Memory Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Memory Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInMemoryInput(InMemoryInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Email</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Email</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceEmail(SourceEmail object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Source Http</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Http</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceHttp(SourceHttp object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>In Memory Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Memory Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInMemoryOutput(InMemoryOutput object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sink Email</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Email</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkEmail(SinkEmail object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sink Mongo DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Mongo DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkMongoDB(SinkMongoDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink Http</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Http</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkHttp(SinkHttp object) {
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

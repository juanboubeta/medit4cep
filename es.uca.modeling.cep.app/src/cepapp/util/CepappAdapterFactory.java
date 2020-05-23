/**
 */
package cepapp.util;

import cepapp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cepapp.CepappPackage
 * @generated
 */
public class CepappAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CepappPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CepappAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CepappPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CepappSwitch<Adapter> modelSwitch =
		new CepappSwitch<Adapter>() {
			@Override
			public Adapter caseCEPApp(CEPApp object) {
				return createCEPAppAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseOrigin(Origin object) {
				return createOriginAdapter();
			}
			@Override
			public Adapter caseDestination(Destination object) {
				return createDestinationAdapter();
			}
			@Override
			public Adapter caseSourceElement(SourceElement object) {
				return createSourceElementAdapter();
			}
			@Override
			public Adapter caseSinkElement(SinkElement object) {
				return createSinkElementAdapter();
			}
			@Override
			public Adapter caseMappable(Mappable object) {
				return createMappableAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseMQTT(MQTT object) {
				return createMQTTAdapter();
			}
			@Override
			public Adapter caseInputFile(InputFile object) {
				return createInputFileAdapter();
			}
			@Override
			public Adapter caseSourceMqtt(SourceMqtt object) {
				return createSourceMqttAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseEventProperty(EventProperty object) {
				return createEventPropertyAdapter();
			}
			@Override
			public Adapter caseComplexEvent(ComplexEvent object) {
				return createComplexEventAdapter();
			}
			@Override
			public Adapter caseComplexEventProperty(ComplexEventProperty object) {
				return createComplexEventPropertyAdapter();
			}
			@Override
			public Adapter caseOutputFile(OutputFile object) {
				return createOutputFileAdapter();
			}
			@Override
			public Adapter caseSinkMqtt(SinkMqtt object) {
				return createSinkMqttAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cepapp.CEPApp <em>CEP App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.CEPApp
	 * @generated
	 */
	public Adapter createCEPAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.Origin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.Origin
	 * @generated
	 */
	public Adapter createOriginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.Destination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.Destination
	 * @generated
	 */
	public Adapter createDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.SourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.SourceElement
	 * @generated
	 */
	public Adapter createSourceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.SinkElement <em>Sink Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.SinkElement
	 * @generated
	 */
	public Adapter createSinkElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.Mappable <em>Mappable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.Mappable
	 * @generated
	 */
	public Adapter createMappableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.MQTT <em>MQTT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.MQTT
	 * @generated
	 */
	public Adapter createMQTTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.InputFile <em>Input File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.InputFile
	 * @generated
	 */
	public Adapter createInputFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.SourceMqtt <em>Source Mqtt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.SourceMqtt
	 * @generated
	 */
	public Adapter createSourceMqttAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.EventProperty <em>Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.EventProperty
	 * @generated
	 */
	public Adapter createEventPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.ComplexEvent <em>Complex Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.ComplexEvent
	 * @generated
	 */
	public Adapter createComplexEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.ComplexEventProperty <em>Complex Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.ComplexEventProperty
	 * @generated
	 */
	public Adapter createComplexEventPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.OutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.OutputFile
	 * @generated
	 */
	public Adapter createOutputFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cepapp.SinkMqtt <em>Sink Mqtt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cepapp.SinkMqtt
	 * @generated
	 */
	public Adapter createSinkMqttAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CepappAdapterFactory

/**
 */
package cepapp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cepapp.CepappPackage
 * @generated
 */
public interface CepappFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CepappFactory eINSTANCE = cepapp.impl.CepappFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CEP App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEP App</em>'.
	 * @generated
	 */
	CEPApp createCEPApp();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Input File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input File</em>'.
	 * @generated
	 */
	InputFile createInputFile();

	/**
	 * Returns a new object of class '<em>Source Mqtt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Mqtt</em>'.
	 * @generated
	 */
	SourceMqtt createSourceMqtt();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Event Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Property</em>'.
	 * @generated
	 */
	EventProperty createEventProperty();

	/**
	 * Returns a new object of class '<em>Complex Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Event</em>'.
	 * @generated
	 */
	ComplexEvent createComplexEvent();

	/**
	 * Returns a new object of class '<em>Complex Event Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Event Property</em>'.
	 * @generated
	 */
	ComplexEventProperty createComplexEventProperty();

	/**
	 * Returns a new object of class '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output File</em>'.
	 * @generated
	 */
	OutputFile createOutputFile();

	/**
	 * Returns a new object of class '<em>Sink Mqtt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink Mqtt</em>'.
	 * @generated
	 */
	SinkMqtt createSinkMqtt();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CepappPackage getCepappPackage();

} //CepappFactory

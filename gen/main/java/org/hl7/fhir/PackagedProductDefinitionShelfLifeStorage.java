/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaged Product Definition Shelf Life Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medically related item or items, in a container or package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionShelfLifeStorage#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionShelfLifeStorage#getPeriodDuration <em>Period Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionShelfLifeStorage#getPeriodString <em>Period String</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionShelfLifeStorage#getSpecialPrecautionsForStorage <em>Special Precautions For Storage</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionShelfLifeStorage()
 * @model extendedMetaData="name='PackagedProductDefinition.ShelfLifeStorage' kind='elementOnly'"
 * @generated
 */
public interface PackagedProductDefinitionShelfLifeStorage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This describes the shelf life, taking into account various scenarios such as shelf life of the packaged Medicinal Product itself, shelf life after transformation where necessary and shelf life after the first opening of a bottle, etc. The shelf life type shall be specified using an appropriate controlled vocabulary The controlled term and the controlled term identifier shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionShelfLifeStorage_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinitionShelfLifeStorage#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Period Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The shelf life time period can be specified using a numerical value for the period of time and its unit of time measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used. (choose any one of period*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period Duration</em>' containment reference.
	 * @see #setPeriodDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionShelfLifeStorage_PeriodDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getPeriodDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinitionShelfLifeStorage#getPeriodDuration <em>Period Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Duration</em>' containment reference.
	 * @see #getPeriodDuration()
	 * @generated
	 */
	void setPeriodDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Period String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The shelf life time period can be specified using a numerical value for the period of time and its unit of time measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used. (choose any one of period*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period String</em>' containment reference.
	 * @see #setPeriodString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionShelfLifeStorage_PeriodString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPeriodString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinitionShelfLifeStorage#getPeriodString <em>Period String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period String</em>' containment reference.
	 * @see #getPeriodString()
	 * @generated
	 */
	void setPeriodString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Special Precautions For Storage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Special precautions for storage, if any, can be specified using an appropriate controlled vocabulary. The controlled term and the controlled term identifier shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Precautions For Storage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionShelfLifeStorage_SpecialPrecautionsForStorage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialPrecautionsForStorage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialPrecautionsForStorage();

} // PackagedProductDefinitionShelfLifeStorage

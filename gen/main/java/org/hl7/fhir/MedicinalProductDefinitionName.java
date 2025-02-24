/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Definition Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medicinal product, being a substance or combination of substances that is intended to treat, prevent or diagnose a disease, or to restore, correct or modify physiological functions by exerting a pharmacological, immunological or metabolic action. This resource is intended to define and detail such products and their properties, for uses other than direct patient care (e.g. regulatory use, or drug catalogs).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionName#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionName#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionName#getNamePart <em>Name Part</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionName#getCountryLanguage <em>Country Language</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionName()
 * @model extendedMetaData="name='MedicinalProductDefinition.Name' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductDefinitionName extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full product name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Name</em>' containment reference.
	 * @see #setProductName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionName_ProductName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='productName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getProductName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDefinitionName#getProductName <em>Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' containment reference.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of product name, such as rINN, BAN, Proprietary, Non-Proprietary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionName_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDefinitionName#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Name Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductDefinitionNamePart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coding words or phrases of the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Part</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionName_NamePart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='namePart' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductDefinitionNamePart> getNamePart();

	/**
	 * Returns the value of the '<em><b>Country Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductDefinitionCountryLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Country and jurisdiction where the name applies, and associated language.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Language</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDefinitionName_CountryLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='countryLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductDefinitionCountryLanguage> getCountryLanguage();

} // MedicinalProductDefinitionName

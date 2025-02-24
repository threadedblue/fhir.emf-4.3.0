/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manufactured Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinition#getManufacturedDoseForm <em>Manufactured Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinition#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinition#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinition#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.ManufacturedItemDefinition#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinition()
 * @model extendedMetaData="name='ManufacturedItemDefinition' kind='elementOnly'"
 * @generated
 */
public interface ManufacturedItemDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this item. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinition_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ManufacturedItemDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Manufactured Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dose form as manufactured and before any transformation into the pharmaceutical product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufactured Dose Form</em>' containment reference.
	 * @see #setManufacturedDoseForm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinition_ManufacturedDoseForm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='manufacturedDoseForm' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getManufacturedDoseForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ManufacturedItemDefinition#getManufacturedDoseForm <em>Manufactured Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufactured Dose Form</em>' containment reference.
	 * @see #getManufacturedDoseForm()
	 * @generated
	 */
	void setManufacturedDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit Of Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The “real world” units in which the quantity of the manufactured item is described.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #setUnitOfPresentation(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinition_UnitOfPresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitOfPresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnitOfPresentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ManufacturedItemDefinition#getUnitOfPresentation <em>Unit Of Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #getUnitOfPresentation()
	 * @generated
	 */
	void setUnitOfPresentation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of the item (Note that this should be named "manufacturer" but it currently causes technical issues).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinition_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ingredients of this manufactured item. This is only needed if the ingredients are not specified by incoming references from the Ingredient resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinition_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIngredient();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ManufacturedItemDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General characteristics of this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getManufacturedItemDefinition_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ManufacturedItemDefinitionProperty> getProperty();

} // ManufacturedItemDefinition

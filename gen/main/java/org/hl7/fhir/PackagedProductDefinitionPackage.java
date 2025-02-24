/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaged Product Definition Package</b></em>'.
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
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackage#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackage#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackage#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackage#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackage#getAlternateMaterial <em>Alternate Material</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackage#getShelfLifeStorage <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackage#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackage#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackage#getContainedItem <em>Contained Item</em>}</li>
 *   <li>{@link org.hl7.fhir.PackagedProductDefinitionPackage#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackage()
 * @model extendedMetaData="name='PackagedProductDefinition.Package' kind='elementOnly'"
 * @generated
 */
public interface PackagedProductDefinitionPackage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that is specific to this particular part of the packaging. Including possibly Data Carrier Identifier (a GS1 barcode).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackage_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical type of the container of the items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackage_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinitionPackage#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of this level of packaging in the package that contains it. If specified, the outermost level is always 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackage_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PackagedProductDefinitionPackage#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material type of the package item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackage_Material()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getMaterial();

	/**
	 * Returns the value of the '<em><b>Alternate Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A possible alternate material for this part of the packaging, that is allowed to be used instead of the usual material (e.g. different types of plastic for a blister sleeve).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternate Material</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackage_AlternateMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternateMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAlternateMaterial();

	/**
	 * Returns the value of the '<em><b>Shelf Life Storage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PackagedProductDefinitionShelfLifeStorage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shelf Life and storage information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shelf Life Storage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackage_ShelfLifeStorage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shelfLifeStorage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackagedProductDefinitionShelfLifeStorage> getShelfLifeStorage();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of this package Item. When there are multiple it means these are all possible manufacturers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackage_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PackagedProductDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General characteristics of this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackage_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackagedProductDefinitionProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Contained Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PackagedProductDefinitionContainedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The item(s) within the packaging.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackage_ContainedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackagedProductDefinitionContainedItem> getContainedItem();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PackagedProductDefinitionPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows containers (and parts of containers) parwithin containers, still a single packaged product.  See also PackagedProductDefinition.package.containedItem.item(PackagedProductDefinition).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPackagedProductDefinitionPackage_Package()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackagedProductDefinitionPackage> getPackage();

} // PackagedProductDefinitionPackage

/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getMoiety <em>Moiety</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceDefinition#getSourceMaterial <em>Source Material</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition()
 * @model extendedMetaData="name='SubstanceDefinition' kind='elementOnly'"
 * @generated
 */
public interface SubstanceDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier by which this substance is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A business level version identifier of the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinition#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of substance within the catalogue e.g. active, retired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A high level categorization, e.g. polymer or nucleic acid, or food, chemical, biological, or a lower level such as the general types of polymer (linear or branch chain) or type of impurity (process related or contaminant).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClassification();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the substance applies to human or veterinary use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Domain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDomain();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinition#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quality standard, established benchmark, to which substance complies (e.g. USP/NF, Ph. Eur, JP, BP, Company Standard).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grade</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Grade()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='grade' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getGrade();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual description of the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting literature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_InformationSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='informationSource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getInformationSource();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual comment about the substance's catalogue or registry record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity that creates, makes, produces or fabricates the substance. This is a set of potential manufacturers but is not necessarily comprehensive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that is the source for the substance. It may be different from the manufacturer. Supplier is synonymous to a distributor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Supplier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupplier();

	/**
	 * Returns the value of the '<em><b>Moiety</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceDefinitionMoiety}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moiety, for structural modifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moiety</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Moiety()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moiety' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionMoiety> getMoiety();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General specifications for this substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceDefinitionMolecularWeight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The molecular weight or weight range (for proteins, polymers or nucleic acids).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_MolecularWeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionMolecularWeight> getMolecularWeight();

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(SubstanceDefinitionStructure)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Structure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceDefinitionStructure getStructure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinition#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(SubstanceDefinitionStructure value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceDefinitionCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes associated with the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionCode> getCode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceDefinitionName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Names applicable to this substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionName> getName();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceDefinitionRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link between this substance and another, with details of the relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceDefinitionRelationship> getRelationship();

	/**
	 * Returns the value of the '<em><b>Source Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material or taxonomic/anatomical source for the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Material</em>' containment reference.
	 * @see #setSourceMaterial(SubstanceDefinitionSourceMaterial)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceDefinition_SourceMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceDefinitionSourceMaterial getSourceMaterial();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceDefinition#getSourceMaterial <em>Source Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Material</em>' containment reference.
	 * @see #getSourceMaterial()
	 * @generated
	 */
	void setSourceMaterial(SubstanceDefinitionSourceMaterial value);

} // SubstanceDefinition

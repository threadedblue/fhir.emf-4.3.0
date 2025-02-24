/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Relates To1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Citation Resource enables reference to any knowledge artifact for purposes of identification and attribution. The Citation Resource supports existing reference structures and developing publication practices such as versioning, expressing complex contributorship roles, and referencing computable resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CitationRelatesTo1#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationRelatesTo1#getTargetClassifier <em>Target Classifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationRelatesTo1#getTargetUri <em>Target Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationRelatesTo1#getTargetIdentifier <em>Target Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationRelatesTo1#getTargetReference <em>Target Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationRelatesTo1#getTargetAttachment <em>Target Attachment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCitationRelatesTo1()
 * @model extendedMetaData="name='Citation.RelatesTo1' kind='elementOnly'"
 * @generated
 */
public interface CitationRelatesTo1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the cited artifact relates to the target artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Type</em>' containment reference.
	 * @see #setRelationshipType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCitationRelatesTo1_RelationshipType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationshipType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRelationshipType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationRelatesTo1#getRelationshipType <em>Relationship Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' containment reference.
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Target Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clasification of the related artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Classifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationRelatesTo1_TargetClassifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetClassifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getTargetClassifier();

	/**
	 * Returns the value of the '<em><b>Target Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The article or artifact that the cited artifact is related to. (choose any one of target*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Uri</em>' containment reference.
	 * @see #setTargetUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getCitationRelatesTo1_TargetUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getTargetUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationRelatesTo1#getTargetUri <em>Target Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Uri</em>' containment reference.
	 * @see #getTargetUri()
	 * @generated
	 */
	void setTargetUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Target Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The article or artifact that the cited artifact is related to. (choose any one of target*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Identifier</em>' containment reference.
	 * @see #setTargetIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getCitationRelatesTo1_TargetIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getTargetIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationRelatesTo1#getTargetIdentifier <em>Target Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Identifier</em>' containment reference.
	 * @see #getTargetIdentifier()
	 * @generated
	 */
	void setTargetIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Target Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The article or artifact that the cited artifact is related to. (choose any one of target*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Reference</em>' containment reference.
	 * @see #setTargetReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCitationRelatesTo1_TargetReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTargetReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationRelatesTo1#getTargetReference <em>Target Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Reference</em>' containment reference.
	 * @see #getTargetReference()
	 * @generated
	 */
	void setTargetReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Target Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The article or artifact that the cited artifact is related to. (choose any one of target*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Attachment</em>' containment reference.
	 * @see #setTargetAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getCitationRelatesTo1_TargetAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getTargetAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationRelatesTo1#getTargetAttachment <em>Target Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Attachment</em>' containment reference.
	 * @see #getTargetAttachment()
	 * @generated
	 */
	void setTargetAttachment(Attachment value);

} // CitationRelatesTo1

/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Classification1</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CitationClassification1#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationClassification1#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationClassification1#getWhoClassified <em>Who Classified</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCitationClassification1()
 * @model extendedMetaData="name='Citation.Classification1' kind='elementOnly'"
 * @generated
 */
public interface CitationClassification1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of classifier (e.g. publication type, keyword).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCitationClassification1_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationClassification1#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific classification value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationClassification1_Classifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClassifier();

	/**
	 * Returns the value of the '<em><b>Who Classified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provenance and copyright of classification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Who Classified</em>' containment reference.
	 * @see #setWhoClassified(CitationWhoClassified)
	 * @see org.hl7.fhir.FhirPackage#getCitationClassification1_WhoClassified()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoClassified' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationWhoClassified getWhoClassified();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationClassification1#getWhoClassified <em>Who Classified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Classified</em>' containment reference.
	 * @see #getWhoClassified()
	 * @generated
	 */
	void setWhoClassified(CitationWhoClassified value);

} // CitationClassification1

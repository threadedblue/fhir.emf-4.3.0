/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Periodic Release</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CitationPeriodicRelease#getCitedMedium <em>Cited Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPeriodicRelease#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPeriodicRelease#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPeriodicRelease#getDateOfPublication <em>Date Of Publication</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCitationPeriodicRelease()
 * @model extendedMetaData="name='Citation.PeriodicRelease' kind='elementOnly'"
 * @generated
 */
public interface CitationPeriodicRelease extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Cited Medium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the form of the medium cited. Common codes are "Internet" or "Print".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cited Medium</em>' containment reference.
	 * @see #setCitedMedium(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCitationPeriodicRelease_CitedMedium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citedMedium' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCitedMedium();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPeriodicRelease#getCitedMedium <em>Cited Medium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited Medium</em>' containment reference.
	 * @see #getCitedMedium()
	 * @generated
	 */
	void setCitedMedium(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Volume number of journal in which the article is published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' containment reference.
	 * @see #setVolume(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationPeriodicRelease_Volume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVolume();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPeriodicRelease#getVolume <em>Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' containment reference.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue, part or supplement of journal in which the article is published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue</em>' containment reference.
	 * @see #setIssue(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationPeriodicRelease_Issue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issue' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getIssue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPeriodicRelease#getIssue <em>Issue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' containment reference.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Date Of Publication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defining the date on which the issue of the journal was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Of Publication</em>' containment reference.
	 * @see #setDateOfPublication(CitationDateOfPublication)
	 * @see org.hl7.fhir.FhirPackage#getCitationPeriodicRelease_DateOfPublication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateOfPublication' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationDateOfPublication getDateOfPublication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPeriodicRelease#getDateOfPublication <em>Date Of Publication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Publication</em>' containment reference.
	 * @see #getDateOfPublication()
	 * @generated
	 */
	void setDateOfPublication(CitationDateOfPublication value);

} // CitationPeriodicRelease

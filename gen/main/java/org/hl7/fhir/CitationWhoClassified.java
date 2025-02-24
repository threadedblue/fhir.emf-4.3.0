/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Who Classified</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CitationWhoClassified#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationWhoClassified#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationWhoClassified#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationWhoClassified#getClassifierCopyright <em>Classifier Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationWhoClassified#getFreeToShare <em>Free To Share</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCitationWhoClassified()
 * @model extendedMetaData="name='Citation.WhoClassified' kind='elementOnly'"
 * @generated
 */
public interface CitationWhoClassified extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person who created the classification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCitationWhoClassified_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='person' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerson();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationWhoClassified#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Reference value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization who created the classification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCitationWhoClassified_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationWhoClassified#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The publisher of the classification, not the publisher of the article or artifact being cited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCitationWhoClassified_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationWhoClassified#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Reference value);

	/**
	 * Returns the value of the '<em><b>Classifier Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rights management statement for the classification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Copyright</em>' containment reference.
	 * @see #setClassifierCopyright(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationWhoClassified_ClassifierCopyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classifierCopyright' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getClassifierCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationWhoClassified#getClassifierCopyright <em>Classifier Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Copyright</em>' containment reference.
	 * @see #getClassifierCopyright()
	 * @generated
	 */
	void setClassifierCopyright(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Free To Share</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Acceptable to re-use the classification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free To Share</em>' containment reference.
	 * @see #setFreeToShare(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCitationWhoClassified_FreeToShare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='freeToShare' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getFreeToShare();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationWhoClassified#getFreeToShare <em>Free To Share</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free To Share</em>' containment reference.
	 * @see #getFreeToShare()
	 * @generated
	 */
	void setFreeToShare(org.hl7.fhir.Boolean value);

} // CitationWhoClassified

/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Date Of Publication</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CitationDateOfPublication#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationDateOfPublication#getYear <em>Year</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationDateOfPublication#getMonth <em>Month</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationDateOfPublication#getDay <em>Day</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationDateOfPublication#getSeason <em>Season</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationDateOfPublication#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCitationDateOfPublication()
 * @model extendedMetaData="name='Citation.DateOfPublication' kind='elementOnly'"
 * @generated
 */
public interface CitationDateOfPublication extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date on which the issue of the journal was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getCitationDateOfPublication_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationDateOfPublication#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Year on which the issue of the journal was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Year</em>' containment reference.
	 * @see #setYear(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationDateOfPublication_Year()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getYear();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationDateOfPublication#getYear <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' containment reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Month on which the issue of the journal was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month</em>' containment reference.
	 * @see #setMonth(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationDateOfPublication_Month()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMonth();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationDateOfPublication#getMonth <em>Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' containment reference.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Day on which the issue of the journal was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day</em>' containment reference.
	 * @see #setDay(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationDateOfPublication_Day()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='day' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationDateOfPublication#getDay <em>Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' containment reference.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spring, Summer, Fall/Autumn, Winter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Season</em>' containment reference.
	 * @see #setSeason(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationDateOfPublication_Season()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='season' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSeason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationDateOfPublication#getSeason <em>Season</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' containment reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text representation of the date of which the issue of the journal was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationDateOfPublication_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationDateOfPublication#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

} // CitationDateOfPublication

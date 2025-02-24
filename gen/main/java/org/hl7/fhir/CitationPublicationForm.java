/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Publication Form</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CitationPublicationForm#getPublishedIn <em>Published In</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPublicationForm#getPeriodicRelease <em>Periodic Release</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPublicationForm#getArticleDate <em>Article Date</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPublicationForm#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPublicationForm#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPublicationForm#getAccessionNumber <em>Accession Number</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPublicationForm#getPageString <em>Page String</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPublicationForm#getFirstPage <em>First Page</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPublicationForm#getLastPage <em>Last Page</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPublicationForm#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationPublicationForm#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm()
 * @model extendedMetaData="name='Citation.PublicationForm' kind='elementOnly'"
 * @generated
 */
public interface CitationPublicationForm extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Published In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection the cited article or artifact is published in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Published In</em>' containment reference.
	 * @see #setPublishedIn(CitationPublishedIn)
	 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm_PublishedIn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publishedIn' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationPublishedIn getPublishedIn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPublicationForm#getPublishedIn <em>Published In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published In</em>' containment reference.
	 * @see #getPublishedIn()
	 * @generated
	 */
	void setPublishedIn(CitationPublishedIn value);

	/**
	 * Returns the value of the '<em><b>Periodic Release</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific issue in which the cited article resides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Periodic Release</em>' containment reference.
	 * @see #setPeriodicRelease(CitationPeriodicRelease)
	 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm_PeriodicRelease()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodicRelease' namespace='##targetNamespace'"
	 * @generated
	 */
	CitationPeriodicRelease getPeriodicRelease();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPublicationForm#getPeriodicRelease <em>Periodic Release</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodic Release</em>' containment reference.
	 * @see #getPeriodicRelease()
	 * @generated
	 */
	void setPeriodicRelease(CitationPeriodicRelease value);

	/**
	 * Returns the value of the '<em><b>Article Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date the article was added to the database, or the date the article was released (which may differ from the journal issue publication date).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Date</em>' containment reference.
	 * @see #setArticleDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm_ArticleDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='articleDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getArticleDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPublicationForm#getArticleDate <em>Article Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Date</em>' containment reference.
	 * @see #getArticleDate()
	 * @generated
	 */
	void setArticleDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Last Revision Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date the article was last revised or updated in the database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Revision Date</em>' containment reference.
	 * @see #setLastRevisionDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm_LastRevisionDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastRevisionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getLastRevisionDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPublicationForm#getLastRevisionDate <em>Last Revision Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Revision Date</em>' containment reference.
	 * @see #getLastRevisionDate()
	 * @generated
	 */
	void setLastRevisionDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language in which this form of the article is published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getLanguage();

	/**
	 * Returns the value of the '<em><b>Accession Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entry number or identifier for inclusion in a database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accession Number</em>' containment reference.
	 * @see #setAccessionNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm_AccessionNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accessionNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAccessionNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPublicationForm#getAccessionNumber <em>Accession Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accession Number</em>' containment reference.
	 * @see #getAccessionNumber()
	 * @generated
	 */
	void setAccessionNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Page String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for full display of pagination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page String</em>' containment reference.
	 * @see #setPageString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm_PageString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pageString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPageString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPublicationForm#getPageString <em>Page String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page String</em>' containment reference.
	 * @see #getPageString()
	 * @generated
	 */
	void setPageString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>First Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for isolated representation of first page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Page</em>' containment reference.
	 * @see #setFirstPage(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm_FirstPage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='firstPage' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getFirstPage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPublicationForm#getFirstPage <em>First Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page</em>' containment reference.
	 * @see #getFirstPage()
	 * @generated
	 */
	void setFirstPage(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Last Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for isolated representation of last page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Page</em>' containment reference.
	 * @see #setLastPage(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm_LastPage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastPage' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLastPage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPublicationForm#getLastPage <em>Last Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Page</em>' containment reference.
	 * @see #getLastPage()
	 * @generated
	 */
	void setLastPage(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Page Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual or approximate number of pages or screens.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Count</em>' containment reference.
	 * @see #setPageCount(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm_PageCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pageCount' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPageCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPublicationForm#getPageCount <em>Page Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Count</em>' containment reference.
	 * @see #getPageCount()
	 * @generated
	 */
	void setPageCount(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copyright notice for the full article or artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getCitationPublicationForm_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationPublicationForm#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Markdown value);

} // CitationPublicationForm

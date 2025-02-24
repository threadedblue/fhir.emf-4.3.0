/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (eg population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Evidence#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getCiteAsReference <em>Cite As Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getCiteAsMarkdown <em>Cite As Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getVariableDefinition <em>Variable Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getSynthesisType <em>Synthesis Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getStudyType <em>Study Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link org.hl7.fhir.Evidence#getCertainty <em>Certainty</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEvidence()
 * @model extendedMetaData="name='Evidence' kind='elementOnly'"
 * @generated
 */
public interface Evidence extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is used to identify this evidence when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this summary is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the summary is stored on different servers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal identifier that is used to identify this summary when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Identifier()
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
	 * The identifier that is used to identify this version of the summary when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the summary author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short, descriptive, user-friendly title for the summary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Cite As Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Citation Resource or display of suggested citation for this evidence. (choose any one of citeAs*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cite As Reference</em>' containment reference.
	 * @see #setCiteAsReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_CiteAsReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citeAsReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCiteAsReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getCiteAsReference <em>Cite As Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite As Reference</em>' containment reference.
	 * @see #getCiteAsReference()
	 * @generated
	 */
	void setCiteAsReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Cite As Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Citation Resource or display of suggested citation for this evidence. (choose any one of citeAs*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cite As Markdown</em>' containment reference.
	 * @see #setCiteAsMarkdown(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_CiteAsMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citeAsMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCiteAsMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getCiteAsMarkdown <em>Cite As Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite As Markdown</em>' containment reference.
	 * @see #getCiteAsMarkdown()
	 * @generated
	 */
	void setCiteAsMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this summary. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date  (and optionally time) when the summary was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the summary changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsageContext> getUseContext();

	/**
	 * Returns the value of the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Date</em>' containment reference.
	 * @see #setApprovalDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_ApprovalDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='approvalDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getApprovalDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getApprovalDate <em>Approval Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Date</em>' containment reference.
	 * @see #getApprovalDate()
	 * @generated
	 */
	void setApprovalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Review Date</em>' containment reference.
	 * @see #setLastReviewDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_LastReviewDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastReviewDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLastReviewDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getLastReviewDate <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Review Date</em>' containment reference.
	 * @see #getLastReviewDate()
	 * @generated
	 */
	void setLastReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the organization or individual that published the evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getContact();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individiual, organization, or device primarily involved in the creation and maintenance of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getAuthor();

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individiual, organization, or device primarily responsible for internal coherence of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Editor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='editor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getEditor();

	/**
	 * Returns the value of the '<em><b>Reviewer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individiual, organization, or device primarily responsible for review of some aspect of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reviewer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Reviewer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reviewer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getReviewer();

	/**
	 * Returns the value of the '<em><b>Endorser</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individiual, organization, or device responsible for officially endorsing the content for use in some setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorser</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Endorser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endorser' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactDetail> getEndorser();

	/**
	 * Returns the value of the '<em><b>Related Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link or citation to artifact associated with the summary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Artifact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_RelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getRelatedArtifact();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language description of the evidence from a consumer's perspective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Declarative description of the Evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assertion</em>' containment reference.
	 * @see #setAssertion(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Assertion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assertion' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getAssertion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getAssertion <em>Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion</em>' containment reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(Markdown value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Footnotes and/or explanatory notes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Variable Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EvidenceVariableDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence variable such as population, exposure, or outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Definition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_VariableDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='variableDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceVariableDefinition> getVariableDefinition();

	/**
	 * Returns the value of the '<em><b>Synthesis Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method to combine studies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synthesis Type</em>' containment reference.
	 * @see #setSynthesisType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_SynthesisType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synthesisType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSynthesisType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getSynthesisType <em>Synthesis Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthesis Type</em>' containment reference.
	 * @see #getSynthesisType()
	 * @generated
	 */
	void setSynthesisType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Study Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of study that produced this evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Type</em>' containment reference.
	 * @see #setStudyType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEvidence_StudyType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studyType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStudyType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Evidence#getStudyType <em>Study Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Type</em>' containment reference.
	 * @see #getStudyType()
	 * @generated
	 */
	void setStudyType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Statistic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EvidenceStatistic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Values and parameters for a single statistic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statistic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Statistic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statistic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceStatistic> getStatistic();

	/**
	 * Returns the value of the '<em><b>Certainty</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EvidenceCertainty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment of certainty, confidence in the estimates, or quality of the evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certainty</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidence_Certainty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='certainty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceCertainty> getCertainty();

} // Evidence

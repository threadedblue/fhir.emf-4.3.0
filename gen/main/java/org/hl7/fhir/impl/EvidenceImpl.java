/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Evidence;
import org.hl7.fhir.EvidenceCertainty;
import org.hl7.fhir.EvidenceStatistic;
import org.hl7.fhir.EvidenceVariableDefinition;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getCiteAsReference <em>Cite As Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getCiteAsMarkdown <em>Cite As Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getVariableDefinition <em>Variable Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getSynthesisType <em>Synthesis Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getStudyType <em>Study Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceImpl#getCertainty <em>Certainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceImpl extends DomainResourceImpl implements Evidence {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getCiteAsReference() <em>Cite As Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiteAsReference()
	 * @generated
	 * @ordered
	 */
	protected Reference citeAsReference;

	/**
	 * The cached value of the '{@link #getCiteAsMarkdown() <em>Cite As Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiteAsMarkdown()
	 * @generated
	 * @ordered
	 */
	protected Markdown citeAsMarkdown;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PublicationStatus status;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getUseContext() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContext()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> useContext;

	/**
	 * The cached value of the '{@link #getApprovalDate() <em>Approval Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDate()
	 * @generated
	 * @ordered
	 */
	protected Date approvalDate;

	/**
	 * The cached value of the '{@link #getLastReviewDate() <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastReviewDate;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publisher;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> contact;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> author;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> editor;

	/**
	 * The cached value of the '{@link #getReviewer() <em>Reviewer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewer()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> reviewer;

	/**
	 * The cached value of the '{@link #getEndorser() <em>Endorser</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorser()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> endorser;

	/**
	 * The cached value of the '{@link #getRelatedArtifact() <em>Related Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> relatedArtifact;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getAssertion() <em>Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertion()
	 * @generated
	 * @ordered
	 */
	protected Markdown assertion;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getVariableDefinition() <em>Variable Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceVariableDefinition> variableDefinition;

	/**
	 * The cached value of the '{@link #getSynthesisType() <em>Synthesis Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynthesisType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept synthesisType;

	/**
	 * The cached value of the '{@link #getStudyType() <em>Study Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept studyType;

	/**
	 * The cached value of the '{@link #getStatistic() <em>Statistic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistic()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceStatistic> statistic;

	/**
	 * The cached value of the '{@link #getCertainty() <em>Certainty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainty()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceCertainty> certainty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.EVIDENCE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCiteAsReference() {
		return citeAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCiteAsReference(Reference newCiteAsReference, NotificationChain msgs) {
		Reference oldCiteAsReference = citeAsReference;
		citeAsReference = newCiteAsReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__CITE_AS_REFERENCE, oldCiteAsReference, newCiteAsReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCiteAsReference(Reference newCiteAsReference) {
		if (newCiteAsReference != citeAsReference) {
			NotificationChain msgs = null;
			if (citeAsReference != null)
				msgs = ((InternalEObject)citeAsReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__CITE_AS_REFERENCE, null, msgs);
			if (newCiteAsReference != null)
				msgs = ((InternalEObject)newCiteAsReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__CITE_AS_REFERENCE, null, msgs);
			msgs = basicSetCiteAsReference(newCiteAsReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__CITE_AS_REFERENCE, newCiteAsReference, newCiteAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getCiteAsMarkdown() {
		return citeAsMarkdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCiteAsMarkdown(Markdown newCiteAsMarkdown, NotificationChain msgs) {
		Markdown oldCiteAsMarkdown = citeAsMarkdown;
		citeAsMarkdown = newCiteAsMarkdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__CITE_AS_MARKDOWN, oldCiteAsMarkdown, newCiteAsMarkdown);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCiteAsMarkdown(Markdown newCiteAsMarkdown) {
		if (newCiteAsMarkdown != citeAsMarkdown) {
			NotificationChain msgs = null;
			if (citeAsMarkdown != null)
				msgs = ((InternalEObject)citeAsMarkdown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__CITE_AS_MARKDOWN, null, msgs);
			if (newCiteAsMarkdown != null)
				msgs = ((InternalEObject)newCiteAsMarkdown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__CITE_AS_MARKDOWN, null, msgs);
			msgs = basicSetCiteAsMarkdown(newCiteAsMarkdown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__CITE_AS_MARKDOWN, newCiteAsMarkdown, newCiteAsMarkdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PublicationStatus newStatus, NotificationChain msgs) {
		PublicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.EVIDENCE__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getApprovalDate() {
		return approvalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovalDate(Date newApprovalDate, NotificationChain msgs) {
		Date oldApprovalDate = approvalDate;
		approvalDate = newApprovalDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalDate(Date newApprovalDate) {
		if (newApprovalDate != approvalDate) {
			NotificationChain msgs = null;
			if (approvalDate != null)
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__APPROVAL_DATE, newApprovalDate, newApprovalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastReviewDate() {
		return lastReviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastReviewDate(Date newLastReviewDate, NotificationChain msgs) {
		Date oldLastReviewDate = lastReviewDate;
		lastReviewDate = newLastReviewDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastReviewDate(Date newLastReviewDate) {
		if (newLastReviewDate != lastReviewDate) {
			NotificationChain msgs = null;
			if (lastReviewDate != null)
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.hl7.fhir.String newPublisher, NotificationChain msgs) {
		org.hl7.fhir.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(org.hl7.fhir.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EVIDENCE__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EVIDENCE__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getEditor() {
		if (editor == null) {
			editor = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EVIDENCE__EDITOR);
		}
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getReviewer() {
		if (reviewer == null) {
			reviewer = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EVIDENCE__REVIEWER);
		}
		return reviewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getEndorser() {
		if (endorser == null) {
			endorser = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EVIDENCE__ENDORSER);
		}
		return endorser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArtifact> getRelatedArtifact() {
		if (relatedArtifact == null) {
			relatedArtifact = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FhirPackage.EVIDENCE__RELATED_ARTIFACT);
		}
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getAssertion() {
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssertion(Markdown newAssertion, NotificationChain msgs) {
		Markdown oldAssertion = assertion;
		assertion = newAssertion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__ASSERTION, oldAssertion, newAssertion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssertion(Markdown newAssertion) {
		if (newAssertion != assertion) {
			NotificationChain msgs = null;
			if (assertion != null)
				msgs = ((InternalEObject)assertion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__ASSERTION, null, msgs);
			if (newAssertion != null)
				msgs = ((InternalEObject)newAssertion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__ASSERTION, null, msgs);
			msgs = basicSetAssertion(newAssertion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__ASSERTION, newAssertion, newAssertion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.EVIDENCE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EvidenceVariableDefinition> getVariableDefinition() {
		if (variableDefinition == null) {
			variableDefinition = new EObjectContainmentEList<EvidenceVariableDefinition>(EvidenceVariableDefinition.class, this, FhirPackage.EVIDENCE__VARIABLE_DEFINITION);
		}
		return variableDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSynthesisType() {
		return synthesisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynthesisType(CodeableConcept newSynthesisType, NotificationChain msgs) {
		CodeableConcept oldSynthesisType = synthesisType;
		synthesisType = newSynthesisType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__SYNTHESIS_TYPE, oldSynthesisType, newSynthesisType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynthesisType(CodeableConcept newSynthesisType) {
		if (newSynthesisType != synthesisType) {
			NotificationChain msgs = null;
			if (synthesisType != null)
				msgs = ((InternalEObject)synthesisType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__SYNTHESIS_TYPE, null, msgs);
			if (newSynthesisType != null)
				msgs = ((InternalEObject)newSynthesisType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__SYNTHESIS_TYPE, null, msgs);
			msgs = basicSetSynthesisType(newSynthesisType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__SYNTHESIS_TYPE, newSynthesisType, newSynthesisType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStudyType() {
		return studyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyType(CodeableConcept newStudyType, NotificationChain msgs) {
		CodeableConcept oldStudyType = studyType;
		studyType = newStudyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__STUDY_TYPE, oldStudyType, newStudyType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyType(CodeableConcept newStudyType) {
		if (newStudyType != studyType) {
			NotificationChain msgs = null;
			if (studyType != null)
				msgs = ((InternalEObject)studyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__STUDY_TYPE, null, msgs);
			if (newStudyType != null)
				msgs = ((InternalEObject)newStudyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE__STUDY_TYPE, null, msgs);
			msgs = basicSetStudyType(newStudyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE__STUDY_TYPE, newStudyType, newStudyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EvidenceStatistic> getStatistic() {
		if (statistic == null) {
			statistic = new EObjectContainmentEList<EvidenceStatistic>(EvidenceStatistic.class, this, FhirPackage.EVIDENCE__STATISTIC);
		}
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EvidenceCertainty> getCertainty() {
		if (certainty == null) {
			certainty = new EObjectContainmentEList<EvidenceCertainty>(EvidenceCertainty.class, this, FhirPackage.EVIDENCE__CERTAINTY);
		}
		return certainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.EVIDENCE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.EVIDENCE__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.EVIDENCE__CITE_AS_REFERENCE:
				return basicSetCiteAsReference(null, msgs);
			case FhirPackage.EVIDENCE__CITE_AS_MARKDOWN:
				return basicSetCiteAsMarkdown(null, msgs);
			case FhirPackage.EVIDENCE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.EVIDENCE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.EVIDENCE__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case FhirPackage.EVIDENCE__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FhirPackage.EVIDENCE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.EVIDENCE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE__REVIEWER:
				return ((InternalEList<?>)getReviewer()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE__ENDORSER:
				return ((InternalEList<?>)getEndorser()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifact()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EVIDENCE__ASSERTION:
				return basicSetAssertion(null, msgs);
			case FhirPackage.EVIDENCE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE__VARIABLE_DEFINITION:
				return ((InternalEList<?>)getVariableDefinition()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE__SYNTHESIS_TYPE:
				return basicSetSynthesisType(null, msgs);
			case FhirPackage.EVIDENCE__STUDY_TYPE:
				return basicSetStudyType(null, msgs);
			case FhirPackage.EVIDENCE__STATISTIC:
				return ((InternalEList<?>)getStatistic()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE__CERTAINTY:
				return ((InternalEList<?>)getCertainty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.EVIDENCE__URL:
				return getUrl();
			case FhirPackage.EVIDENCE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.EVIDENCE__VERSION:
				return getVersion();
			case FhirPackage.EVIDENCE__TITLE:
				return getTitle();
			case FhirPackage.EVIDENCE__CITE_AS_REFERENCE:
				return getCiteAsReference();
			case FhirPackage.EVIDENCE__CITE_AS_MARKDOWN:
				return getCiteAsMarkdown();
			case FhirPackage.EVIDENCE__STATUS:
				return getStatus();
			case FhirPackage.EVIDENCE__DATE:
				return getDate();
			case FhirPackage.EVIDENCE__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.EVIDENCE__APPROVAL_DATE:
				return getApprovalDate();
			case FhirPackage.EVIDENCE__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FhirPackage.EVIDENCE__PUBLISHER:
				return getPublisher();
			case FhirPackage.EVIDENCE__CONTACT:
				return getContact();
			case FhirPackage.EVIDENCE__AUTHOR:
				return getAuthor();
			case FhirPackage.EVIDENCE__EDITOR:
				return getEditor();
			case FhirPackage.EVIDENCE__REVIEWER:
				return getReviewer();
			case FhirPackage.EVIDENCE__ENDORSER:
				return getEndorser();
			case FhirPackage.EVIDENCE__RELATED_ARTIFACT:
				return getRelatedArtifact();
			case FhirPackage.EVIDENCE__DESCRIPTION:
				return getDescription();
			case FhirPackage.EVIDENCE__ASSERTION:
				return getAssertion();
			case FhirPackage.EVIDENCE__NOTE:
				return getNote();
			case FhirPackage.EVIDENCE__VARIABLE_DEFINITION:
				return getVariableDefinition();
			case FhirPackage.EVIDENCE__SYNTHESIS_TYPE:
				return getSynthesisType();
			case FhirPackage.EVIDENCE__STUDY_TYPE:
				return getStudyType();
			case FhirPackage.EVIDENCE__STATISTIC:
				return getStatistic();
			case FhirPackage.EVIDENCE__CERTAINTY:
				return getCertainty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.EVIDENCE__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.EVIDENCE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.EVIDENCE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE__CITE_AS_REFERENCE:
				setCiteAsReference((Reference)newValue);
				return;
			case FhirPackage.EVIDENCE__CITE_AS_MARKDOWN:
				setCiteAsMarkdown((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.EVIDENCE__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.EVIDENCE__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.EVIDENCE__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case FhirPackage.EVIDENCE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FhirPackage.EVIDENCE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EVIDENCE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EVIDENCE__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EVIDENCE__REVIEWER:
				getReviewer().clear();
				getReviewer().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EVIDENCE__ENDORSER:
				getEndorser().clear();
				getEndorser().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EVIDENCE__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				getRelatedArtifact().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FhirPackage.EVIDENCE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE__ASSERTION:
				setAssertion((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.EVIDENCE__VARIABLE_DEFINITION:
				getVariableDefinition().clear();
				getVariableDefinition().addAll((Collection<? extends EvidenceVariableDefinition>)newValue);
				return;
			case FhirPackage.EVIDENCE__SYNTHESIS_TYPE:
				setSynthesisType((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE__STUDY_TYPE:
				setStudyType((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE__STATISTIC:
				getStatistic().clear();
				getStatistic().addAll((Collection<? extends EvidenceStatistic>)newValue);
				return;
			case FhirPackage.EVIDENCE__CERTAINTY:
				getCertainty().clear();
				getCertainty().addAll((Collection<? extends EvidenceCertainty>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.EVIDENCE__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.EVIDENCE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.EVIDENCE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE__CITE_AS_REFERENCE:
				setCiteAsReference((Reference)null);
				return;
			case FhirPackage.EVIDENCE__CITE_AS_MARKDOWN:
				setCiteAsMarkdown((Markdown)null);
				return;
			case FhirPackage.EVIDENCE__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.EVIDENCE__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.EVIDENCE__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.EVIDENCE__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case FhirPackage.EVIDENCE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FhirPackage.EVIDENCE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.EVIDENCE__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.EVIDENCE__EDITOR:
				getEditor().clear();
				return;
			case FhirPackage.EVIDENCE__REVIEWER:
				getReviewer().clear();
				return;
			case FhirPackage.EVIDENCE__ENDORSER:
				getEndorser().clear();
				return;
			case FhirPackage.EVIDENCE__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				return;
			case FhirPackage.EVIDENCE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EVIDENCE__ASSERTION:
				setAssertion((Markdown)null);
				return;
			case FhirPackage.EVIDENCE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.EVIDENCE__VARIABLE_DEFINITION:
				getVariableDefinition().clear();
				return;
			case FhirPackage.EVIDENCE__SYNTHESIS_TYPE:
				setSynthesisType((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE__STUDY_TYPE:
				setStudyType((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE__STATISTIC:
				getStatistic().clear();
				return;
			case FhirPackage.EVIDENCE__CERTAINTY:
				getCertainty().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.EVIDENCE__URL:
				return url != null;
			case FhirPackage.EVIDENCE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.EVIDENCE__VERSION:
				return version != null;
			case FhirPackage.EVIDENCE__TITLE:
				return title != null;
			case FhirPackage.EVIDENCE__CITE_AS_REFERENCE:
				return citeAsReference != null;
			case FhirPackage.EVIDENCE__CITE_AS_MARKDOWN:
				return citeAsMarkdown != null;
			case FhirPackage.EVIDENCE__STATUS:
				return status != null;
			case FhirPackage.EVIDENCE__DATE:
				return date != null;
			case FhirPackage.EVIDENCE__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.EVIDENCE__APPROVAL_DATE:
				return approvalDate != null;
			case FhirPackage.EVIDENCE__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FhirPackage.EVIDENCE__PUBLISHER:
				return publisher != null;
			case FhirPackage.EVIDENCE__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.EVIDENCE__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.EVIDENCE__EDITOR:
				return editor != null && !editor.isEmpty();
			case FhirPackage.EVIDENCE__REVIEWER:
				return reviewer != null && !reviewer.isEmpty();
			case FhirPackage.EVIDENCE__ENDORSER:
				return endorser != null && !endorser.isEmpty();
			case FhirPackage.EVIDENCE__RELATED_ARTIFACT:
				return relatedArtifact != null && !relatedArtifact.isEmpty();
			case FhirPackage.EVIDENCE__DESCRIPTION:
				return description != null;
			case FhirPackage.EVIDENCE__ASSERTION:
				return assertion != null;
			case FhirPackage.EVIDENCE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.EVIDENCE__VARIABLE_DEFINITION:
				return variableDefinition != null && !variableDefinition.isEmpty();
			case FhirPackage.EVIDENCE__SYNTHESIS_TYPE:
				return synthesisType != null;
			case FhirPackage.EVIDENCE__STUDY_TYPE:
				return studyType != null;
			case FhirPackage.EVIDENCE__STATISTIC:
				return statistic != null && !statistic.isEmpty();
			case FhirPackage.EVIDENCE__CERTAINTY:
				return certainty != null && !certainty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceImpl

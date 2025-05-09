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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.ResourceType;
import org.hl7.fhir.SearchComparator;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterComponent;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.XPathUsageType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getXpathUsage <em>Xpath Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getMultipleOr <em>Multiple Or</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getMultipleAnd <em>Multiple And</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getChain <em>Chain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchParameterImpl extends DomainResourceImpl implements SearchParameter {
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
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected Canonical derivedFrom;

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
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean experimental;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

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
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdiction;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected Markdown purpose;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> base;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SearchParamType type;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String expression;

	/**
	 * The cached value of the '{@link #getXpath() <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String xpath;

	/**
	 * The cached value of the '{@link #getXpathUsage() <em>Xpath Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathUsage()
	 * @generated
	 * @ordered
	 */
	protected XPathUsageType xpathUsage;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> target;

	/**
	 * The cached value of the '{@link #getMultipleOr() <em>Multiple Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOr()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean multipleOr;

	/**
	 * The cached value of the '{@link #getMultipleAnd() <em>Multiple And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleAnd()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean multipleAnd;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchComparator> comparator;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchModifierCode> modifier;

	/**
	 * The cached value of the '{@link #getChain() <em>Chain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChain()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> chain;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchParameterComponent> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSearchParameter();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedFrom(Canonical newDerivedFrom, NotificationChain msgs) {
		Canonical oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__DERIVED_FROM, oldDerivedFrom, newDerivedFrom);
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
	public void setDerivedFrom(Canonical newDerivedFrom) {
		if (newDerivedFrom != derivedFrom) {
			NotificationChain msgs = null;
			if (derivedFrom != null)
				msgs = ((InternalEObject)derivedFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__DERIVED_FROM, null, msgs);
			if (newDerivedFrom != null)
				msgs = ((InternalEObject)newDerivedFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__DERIVED_FROM, null, msgs);
			msgs = basicSetDerivedFrom(newDerivedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__DERIVED_FROM, newDerivedFrom, newDerivedFrom));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.hl7.fhir.Boolean newExperimental, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__EXPERIMENTAL, oldExperimental, newExperimental);
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
	public void setExperimental(org.hl7.fhir.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.SEARCH_PARAMETER__CONTACT);
		}
		return contact;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.SEARCH_PARAMETER__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getJurisdiction() {
		if (jurisdiction == null) {
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SEARCH_PARAMETER__JURISDICTION);
		}
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(Markdown newPurpose, NotificationChain msgs) {
		Markdown oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__PURPOSE, oldPurpose, newPurpose);
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
	public void setPurpose(Markdown newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__CODE, oldCode, newCode);
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
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceType> getBase() {
		if (base == null) {
			base = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, FhirPackage.SEARCH_PARAMETER__BASE);
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchParamType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(SearchParamType newType, NotificationChain msgs) {
		SearchParamType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__TYPE, oldType, newType);
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
	public void setType(SearchParamType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(org.hl7.fhir.String newExpression, NotificationChain msgs) {
		org.hl7.fhir.String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(org.hl7.fhir.String newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getXpath() {
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXpath(org.hl7.fhir.String newXpath, NotificationChain msgs) {
		org.hl7.fhir.String oldXpath = xpath;
		xpath = newXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__XPATH, oldXpath, newXpath);
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
	public void setXpath(org.hl7.fhir.String newXpath) {
		if (newXpath != xpath) {
			NotificationChain msgs = null;
			if (xpath != null)
				msgs = ((InternalEObject)xpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__XPATH, null, msgs);
			if (newXpath != null)
				msgs = ((InternalEObject)newXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__XPATH, null, msgs);
			msgs = basicSetXpath(newXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__XPATH, newXpath, newXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XPathUsageType getXpathUsage() {
		return xpathUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXpathUsage(XPathUsageType newXpathUsage, NotificationChain msgs) {
		XPathUsageType oldXpathUsage = xpathUsage;
		xpathUsage = newXpathUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__XPATH_USAGE, oldXpathUsage, newXpathUsage);
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
	public void setXpathUsage(XPathUsageType newXpathUsage) {
		if (newXpathUsage != xpathUsage) {
			NotificationChain msgs = null;
			if (xpathUsage != null)
				msgs = ((InternalEObject)xpathUsage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__XPATH_USAGE, null, msgs);
			if (newXpathUsage != null)
				msgs = ((InternalEObject)newXpathUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__XPATH_USAGE, null, msgs);
			msgs = basicSetXpathUsage(newXpathUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__XPATH_USAGE, newXpathUsage, newXpathUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceType> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, FhirPackage.SEARCH_PARAMETER__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getMultipleOr() {
		return multipleOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleOr(org.hl7.fhir.Boolean newMultipleOr, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMultipleOr = multipleOr;
		multipleOr = newMultipleOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__MULTIPLE_OR, oldMultipleOr, newMultipleOr);
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
	public void setMultipleOr(org.hl7.fhir.Boolean newMultipleOr) {
		if (newMultipleOr != multipleOr) {
			NotificationChain msgs = null;
			if (multipleOr != null)
				msgs = ((InternalEObject)multipleOr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__MULTIPLE_OR, null, msgs);
			if (newMultipleOr != null)
				msgs = ((InternalEObject)newMultipleOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__MULTIPLE_OR, null, msgs);
			msgs = basicSetMultipleOr(newMultipleOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__MULTIPLE_OR, newMultipleOr, newMultipleOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getMultipleAnd() {
		return multipleAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleAnd(org.hl7.fhir.Boolean newMultipleAnd, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMultipleAnd = multipleAnd;
		multipleAnd = newMultipleAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__MULTIPLE_AND, oldMultipleAnd, newMultipleAnd);
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
	public void setMultipleAnd(org.hl7.fhir.Boolean newMultipleAnd) {
		if (newMultipleAnd != multipleAnd) {
			NotificationChain msgs = null;
			if (multipleAnd != null)
				msgs = ((InternalEObject)multipleAnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__MULTIPLE_AND, null, msgs);
			if (newMultipleAnd != null)
				msgs = ((InternalEObject)newMultipleAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEARCH_PARAMETER__MULTIPLE_AND, null, msgs);
			msgs = basicSetMultipleAnd(newMultipleAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEARCH_PARAMETER__MULTIPLE_AND, newMultipleAnd, newMultipleAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SearchComparator> getComparator() {
		if (comparator == null) {
			comparator = new EObjectContainmentEList<SearchComparator>(SearchComparator.class, this, FhirPackage.SEARCH_PARAMETER__COMPARATOR);
		}
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SearchModifierCode> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<SearchModifierCode>(SearchModifierCode.class, this, FhirPackage.SEARCH_PARAMETER__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getChain() {
		if (chain == null) {
			chain = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.SEARCH_PARAMETER__CHAIN);
		}
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SearchParameterComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<SearchParameterComponent>(SearchParameterComponent.class, this, FhirPackage.SEARCH_PARAMETER__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SEARCH_PARAMETER__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return basicSetDerivedFrom(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEARCH_PARAMETER__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEARCH_PARAMETER__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEARCH_PARAMETER__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__BASE:
				return ((InternalEList<?>)getBase()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEARCH_PARAMETER__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__EXPRESSION:
				return basicSetExpression(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__XPATH:
				return basicSetXpath(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__XPATH_USAGE:
				return basicSetXpathUsage(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				return basicSetMultipleOr(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				return basicSetMultipleAnd(null, msgs);
			case FhirPackage.SEARCH_PARAMETER__COMPARATOR:
				return ((InternalEList<?>)getComparator()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEARCH_PARAMETER__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEARCH_PARAMETER__CHAIN:
				return ((InternalEList<?>)getChain()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEARCH_PARAMETER__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SEARCH_PARAMETER__URL:
				return getUrl();
			case FhirPackage.SEARCH_PARAMETER__VERSION:
				return getVersion();
			case FhirPackage.SEARCH_PARAMETER__NAME:
				return getName();
			case FhirPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return getDerivedFrom();
			case FhirPackage.SEARCH_PARAMETER__STATUS:
				return getStatus();
			case FhirPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.SEARCH_PARAMETER__DATE:
				return getDate();
			case FhirPackage.SEARCH_PARAMETER__PUBLISHER:
				return getPublisher();
			case FhirPackage.SEARCH_PARAMETER__CONTACT:
				return getContact();
			case FhirPackage.SEARCH_PARAMETER__DESCRIPTION:
				return getDescription();
			case FhirPackage.SEARCH_PARAMETER__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.SEARCH_PARAMETER__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.SEARCH_PARAMETER__PURPOSE:
				return getPurpose();
			case FhirPackage.SEARCH_PARAMETER__CODE:
				return getCode();
			case FhirPackage.SEARCH_PARAMETER__BASE:
				return getBase();
			case FhirPackage.SEARCH_PARAMETER__TYPE:
				return getType();
			case FhirPackage.SEARCH_PARAMETER__EXPRESSION:
				return getExpression();
			case FhirPackage.SEARCH_PARAMETER__XPATH:
				return getXpath();
			case FhirPackage.SEARCH_PARAMETER__XPATH_USAGE:
				return getXpathUsage();
			case FhirPackage.SEARCH_PARAMETER__TARGET:
				return getTarget();
			case FhirPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				return getMultipleOr();
			case FhirPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				return getMultipleAnd();
			case FhirPackage.SEARCH_PARAMETER__COMPARATOR:
				return getComparator();
			case FhirPackage.SEARCH_PARAMETER__MODIFIER:
				return getModifier();
			case FhirPackage.SEARCH_PARAMETER__CHAIN:
				return getChain();
			case FhirPackage.SEARCH_PARAMETER__COMPONENT:
				return getComponent();
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
			case FhirPackage.SEARCH_PARAMETER__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__DERIVED_FROM:
				setDerivedFrom((Canonical)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__CODE:
				setCode((Code)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__BASE:
				getBase().clear();
				getBase().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__TYPE:
				setType((SearchParamType)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__EXPRESSION:
				setExpression((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__XPATH:
				setXpath((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__XPATH_USAGE:
				setXpathUsage((XPathUsageType)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				setMultipleOr((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				setMultipleAnd((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__COMPARATOR:
				getComparator().clear();
				getComparator().addAll((Collection<? extends SearchComparator>)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends SearchModifierCode>)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__CHAIN:
				getChain().clear();
				getChain().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.SEARCH_PARAMETER__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends SearchParameterComponent>)newValue);
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
			case FhirPackage.SEARCH_PARAMETER__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__DERIVED_FROM:
				setDerivedFrom((Canonical)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.SEARCH_PARAMETER__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.SEARCH_PARAMETER__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.SEARCH_PARAMETER__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__CODE:
				setCode((Code)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__BASE:
				getBase().clear();
				return;
			case FhirPackage.SEARCH_PARAMETER__TYPE:
				setType((SearchParamType)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__EXPRESSION:
				setExpression((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__XPATH:
				setXpath((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__XPATH_USAGE:
				setXpathUsage((XPathUsageType)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__TARGET:
				getTarget().clear();
				return;
			case FhirPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				setMultipleOr((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				setMultipleAnd((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SEARCH_PARAMETER__COMPARATOR:
				getComparator().clear();
				return;
			case FhirPackage.SEARCH_PARAMETER__MODIFIER:
				getModifier().clear();
				return;
			case FhirPackage.SEARCH_PARAMETER__CHAIN:
				getChain().clear();
				return;
			case FhirPackage.SEARCH_PARAMETER__COMPONENT:
				getComponent().clear();
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
			case FhirPackage.SEARCH_PARAMETER__URL:
				return url != null;
			case FhirPackage.SEARCH_PARAMETER__VERSION:
				return version != null;
			case FhirPackage.SEARCH_PARAMETER__NAME:
				return name != null;
			case FhirPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return derivedFrom != null;
			case FhirPackage.SEARCH_PARAMETER__STATUS:
				return status != null;
			case FhirPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.SEARCH_PARAMETER__DATE:
				return date != null;
			case FhirPackage.SEARCH_PARAMETER__PUBLISHER:
				return publisher != null;
			case FhirPackage.SEARCH_PARAMETER__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.SEARCH_PARAMETER__DESCRIPTION:
				return description != null;
			case FhirPackage.SEARCH_PARAMETER__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.SEARCH_PARAMETER__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.SEARCH_PARAMETER__PURPOSE:
				return purpose != null;
			case FhirPackage.SEARCH_PARAMETER__CODE:
				return code != null;
			case FhirPackage.SEARCH_PARAMETER__BASE:
				return base != null && !base.isEmpty();
			case FhirPackage.SEARCH_PARAMETER__TYPE:
				return type != null;
			case FhirPackage.SEARCH_PARAMETER__EXPRESSION:
				return expression != null;
			case FhirPackage.SEARCH_PARAMETER__XPATH:
				return xpath != null;
			case FhirPackage.SEARCH_PARAMETER__XPATH_USAGE:
				return xpathUsage != null;
			case FhirPackage.SEARCH_PARAMETER__TARGET:
				return target != null && !target.isEmpty();
			case FhirPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				return multipleOr != null;
			case FhirPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				return multipleAnd != null;
			case FhirPackage.SEARCH_PARAMETER__COMPARATOR:
				return comparator != null && !comparator.isEmpty();
			case FhirPackage.SEARCH_PARAMETER__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case FhirPackage.SEARCH_PARAMETER__CHAIN:
				return chain != null && !chain.isEmpty();
			case FhirPackage.SEARCH_PARAMETER__COMPONENT:
				return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SearchParameterImpl

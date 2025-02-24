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

import org.hl7.fhir.Address;
import org.hl7.fhir.CitationAffiliationInfo;
import org.hl7.fhir.CitationContributionInstance;
import org.hl7.fhir.CitationEntry;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getInitials <em>Initials</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getCollectiveName <em>Collective Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getAffiliationInfo <em>Affiliation Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getContributionType <em>Contribution Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getContributionInstance <em>Contribution Instance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getCorrespondingContact <em>Corresponding Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationEntryImpl#getListOrder <em>List Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationEntryImpl extends BackboneElementImpl implements CitationEntry {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected HumanName name;

	/**
	 * The cached value of the '{@link #getInitials() <em>Initials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitials()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String initials;

	/**
	 * The cached value of the '{@link #getCollectiveName() <em>Collective Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectiveName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String collectiveName;

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
	 * The cached value of the '{@link #getAffiliationInfo() <em>Affiliation Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliationInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationAffiliationInfo> affiliationInfo;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> address;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecom;

	/**
	 * The cached value of the '{@link #getContributionType() <em>Contribution Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> contributionType;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept role;

	/**
	 * The cached value of the '{@link #getContributionInstance() <em>Contribution Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationContributionInstance> contributionInstance;

	/**
	 * The cached value of the '{@link #getCorrespondingContact() <em>Corresponding Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingContact()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean correspondingContact;

	/**
	 * The cached value of the '{@link #getListOrder() <em>List Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOrder()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt listOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(HumanName newName, NotificationChain msgs) {
		HumanName oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(HumanName newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getInitials() {
		return initials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitials(org.hl7.fhir.String newInitials, NotificationChain msgs) {
		org.hl7.fhir.String oldInitials = initials;
		initials = newInitials;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__INITIALS, oldInitials, newInitials);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitials(org.hl7.fhir.String newInitials) {
		if (newInitials != initials) {
			NotificationChain msgs = null;
			if (initials != null)
				msgs = ((InternalEObject)initials).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__INITIALS, null, msgs);
			if (newInitials != null)
				msgs = ((InternalEObject)newInitials).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__INITIALS, null, msgs);
			msgs = basicSetInitials(newInitials, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__INITIALS, newInitials, newInitials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCollectiveName() {
		return collectiveName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectiveName(org.hl7.fhir.String newCollectiveName, NotificationChain msgs) {
		org.hl7.fhir.String oldCollectiveName = collectiveName;
		collectiveName = newCollectiveName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__COLLECTIVE_NAME, oldCollectiveName, newCollectiveName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectiveName(org.hl7.fhir.String newCollectiveName) {
		if (newCollectiveName != collectiveName) {
			NotificationChain msgs = null;
			if (collectiveName != null)
				msgs = ((InternalEObject)collectiveName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__COLLECTIVE_NAME, null, msgs);
			if (newCollectiveName != null)
				msgs = ((InternalEObject)newCollectiveName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__COLLECTIVE_NAME, null, msgs);
			msgs = basicSetCollectiveName(newCollectiveName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__COLLECTIVE_NAME, newCollectiveName, newCollectiveName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CITATION_ENTRY__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CitationAffiliationInfo> getAffiliationInfo() {
		if (affiliationInfo == null) {
			affiliationInfo = new EObjectContainmentEList<CitationAffiliationInfo>(CitationAffiliationInfo.class, this, FhirPackage.CITATION_ENTRY__AFFILIATION_INFO);
		}
		return affiliationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<Address>(Address.class, this, FhirPackage.CITATION_ENTRY__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.CITATION_ENTRY__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getContributionType() {
		if (contributionType == null) {
			contributionType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE);
		}
		return contributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeableConcept newRole, NotificationChain msgs) {
		CodeableConcept oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(CodeableConcept newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CitationContributionInstance> getContributionInstance() {
		if (contributionInstance == null) {
			contributionInstance = new EObjectContainmentEList<CitationContributionInstance>(CitationContributionInstance.class, this, FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE);
		}
		return contributionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getCorrespondingContact() {
		return correspondingContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrespondingContact(org.hl7.fhir.Boolean newCorrespondingContact, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldCorrespondingContact = correspondingContact;
		correspondingContact = newCorrespondingContact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT, oldCorrespondingContact, newCorrespondingContact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingContact(org.hl7.fhir.Boolean newCorrespondingContact) {
		if (newCorrespondingContact != correspondingContact) {
			NotificationChain msgs = null;
			if (correspondingContact != null)
				msgs = ((InternalEObject)correspondingContact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT, null, msgs);
			if (newCorrespondingContact != null)
				msgs = ((InternalEObject)newCorrespondingContact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT, null, msgs);
			msgs = basicSetCorrespondingContact(newCorrespondingContact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT, newCorrespondingContact, newCorrespondingContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getListOrder() {
		return listOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOrder(PositiveInt newListOrder, NotificationChain msgs) {
		PositiveInt oldListOrder = listOrder;
		listOrder = newListOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__LIST_ORDER, oldListOrder, newListOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOrder(PositiveInt newListOrder) {
		if (newListOrder != listOrder) {
			NotificationChain msgs = null;
			if (listOrder != null)
				msgs = ((InternalEObject)listOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__LIST_ORDER, null, msgs);
			if (newListOrder != null)
				msgs = ((InternalEObject)newListOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_ENTRY__LIST_ORDER, null, msgs);
			msgs = basicSetListOrder(newListOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_ENTRY__LIST_ORDER, newListOrder, newListOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_ENTRY__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.CITATION_ENTRY__INITIALS:
				return basicSetInitials(null, msgs);
			case FhirPackage.CITATION_ENTRY__COLLECTIVE_NAME:
				return basicSetCollectiveName(null, msgs);
			case FhirPackage.CITATION_ENTRY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_ENTRY__AFFILIATION_INFO:
				return ((InternalEList<?>)getAffiliationInfo()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_ENTRY__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_ENTRY__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE:
				return ((InternalEList<?>)getContributionType()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_ENTRY__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE:
				return ((InternalEList<?>)getContributionInstance()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT:
				return basicSetCorrespondingContact(null, msgs);
			case FhirPackage.CITATION_ENTRY__LIST_ORDER:
				return basicSetListOrder(null, msgs);
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
			case FhirPackage.CITATION_ENTRY__NAME:
				return getName();
			case FhirPackage.CITATION_ENTRY__INITIALS:
				return getInitials();
			case FhirPackage.CITATION_ENTRY__COLLECTIVE_NAME:
				return getCollectiveName();
			case FhirPackage.CITATION_ENTRY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CITATION_ENTRY__AFFILIATION_INFO:
				return getAffiliationInfo();
			case FhirPackage.CITATION_ENTRY__ADDRESS:
				return getAddress();
			case FhirPackage.CITATION_ENTRY__TELECOM:
				return getTelecom();
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE:
				return getContributionType();
			case FhirPackage.CITATION_ENTRY__ROLE:
				return getRole();
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE:
				return getContributionInstance();
			case FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT:
				return getCorrespondingContact();
			case FhirPackage.CITATION_ENTRY__LIST_ORDER:
				return getListOrder();
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
			case FhirPackage.CITATION_ENTRY__NAME:
				setName((HumanName)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__INITIALS:
				setInitials((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__COLLECTIVE_NAME:
				setCollectiveName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__AFFILIATION_INFO:
				getAffiliationInfo().clear();
				getAffiliationInfo().addAll((Collection<? extends CitationAffiliationInfo>)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends Address>)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE:
				getContributionType().clear();
				getContributionType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE:
				getContributionInstance().clear();
				getContributionInstance().addAll((Collection<? extends CitationContributionInstance>)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT:
				setCorrespondingContact((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CITATION_ENTRY__LIST_ORDER:
				setListOrder((PositiveInt)newValue);
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
			case FhirPackage.CITATION_ENTRY__NAME:
				setName((HumanName)null);
				return;
			case FhirPackage.CITATION_ENTRY__INITIALS:
				setInitials((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_ENTRY__COLLECTIVE_NAME:
				setCollectiveName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_ENTRY__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CITATION_ENTRY__AFFILIATION_INFO:
				getAffiliationInfo().clear();
				return;
			case FhirPackage.CITATION_ENTRY__ADDRESS:
				getAddress().clear();
				return;
			case FhirPackage.CITATION_ENTRY__TELECOM:
				getTelecom().clear();
				return;
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE:
				getContributionType().clear();
				return;
			case FhirPackage.CITATION_ENTRY__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE:
				getContributionInstance().clear();
				return;
			case FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT:
				setCorrespondingContact((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CITATION_ENTRY__LIST_ORDER:
				setListOrder((PositiveInt)null);
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
			case FhirPackage.CITATION_ENTRY__NAME:
				return name != null;
			case FhirPackage.CITATION_ENTRY__INITIALS:
				return initials != null;
			case FhirPackage.CITATION_ENTRY__COLLECTIVE_NAME:
				return collectiveName != null;
			case FhirPackage.CITATION_ENTRY__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CITATION_ENTRY__AFFILIATION_INFO:
				return affiliationInfo != null && !affiliationInfo.isEmpty();
			case FhirPackage.CITATION_ENTRY__ADDRESS:
				return address != null && !address.isEmpty();
			case FhirPackage.CITATION_ENTRY__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_TYPE:
				return contributionType != null && !contributionType.isEmpty();
			case FhirPackage.CITATION_ENTRY__ROLE:
				return role != null;
			case FhirPackage.CITATION_ENTRY__CONTRIBUTION_INSTANCE:
				return contributionInstance != null && !contributionInstance.isEmpty();
			case FhirPackage.CITATION_ENTRY__CORRESPONDING_CONTACT:
				return correspondingContact != null;
			case FhirPackage.CITATION_ENTRY__LIST_ORDER:
				return listOrder != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationEntryImpl

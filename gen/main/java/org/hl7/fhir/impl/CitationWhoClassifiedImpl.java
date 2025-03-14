/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.hl7.fhir.CitationWhoClassified;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Who Classified</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationWhoClassifiedImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationWhoClassifiedImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationWhoClassifiedImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationWhoClassifiedImpl#getClassifierCopyright <em>Classifier Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationWhoClassifiedImpl#getFreeToShare <em>Free To Share</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationWhoClassifiedImpl extends BackboneElementImpl implements CitationWhoClassified {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Reference person;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference organization;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Reference publisher;

	/**
	 * The cached value of the '{@link #getClassifierCopyright() <em>Classifier Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierCopyright()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String classifierCopyright;

	/**
	 * The cached value of the '{@link #getFreeToShare() <em>Free To Share</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeToShare()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean freeToShare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationWhoClassifiedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationWhoClassified();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Reference newPerson, NotificationChain msgs) {
		Reference oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_WHO_CLASSIFIED__PERSON, oldPerson, newPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Reference newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_WHO_CLASSIFIED__PERSON, null, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_WHO_CLASSIFIED__PERSON, null, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_WHO_CLASSIFIED__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Reference newOrganization, NotificationChain msgs) {
		Reference oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_WHO_CLASSIFIED__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Reference newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_WHO_CLASSIFIED__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_WHO_CLASSIFIED__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_WHO_CLASSIFIED__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(Reference newPublisher, NotificationChain msgs) {
		Reference oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_WHO_CLASSIFIED__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Reference newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_WHO_CLASSIFIED__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_WHO_CLASSIFIED__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_WHO_CLASSIFIED__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getClassifierCopyright() {
		return classifierCopyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifierCopyright(org.hl7.fhir.String newClassifierCopyright, NotificationChain msgs) {
		org.hl7.fhir.String oldClassifierCopyright = classifierCopyright;
		classifierCopyright = newClassifierCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_WHO_CLASSIFIED__CLASSIFIER_COPYRIGHT, oldClassifierCopyright, newClassifierCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierCopyright(org.hl7.fhir.String newClassifierCopyright) {
		if (newClassifierCopyright != classifierCopyright) {
			NotificationChain msgs = null;
			if (classifierCopyright != null)
				msgs = ((InternalEObject)classifierCopyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_WHO_CLASSIFIED__CLASSIFIER_COPYRIGHT, null, msgs);
			if (newClassifierCopyright != null)
				msgs = ((InternalEObject)newClassifierCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_WHO_CLASSIFIED__CLASSIFIER_COPYRIGHT, null, msgs);
			msgs = basicSetClassifierCopyright(newClassifierCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_WHO_CLASSIFIED__CLASSIFIER_COPYRIGHT, newClassifierCopyright, newClassifierCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getFreeToShare() {
		return freeToShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFreeToShare(org.hl7.fhir.Boolean newFreeToShare, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldFreeToShare = freeToShare;
		freeToShare = newFreeToShare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_WHO_CLASSIFIED__FREE_TO_SHARE, oldFreeToShare, newFreeToShare);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeToShare(org.hl7.fhir.Boolean newFreeToShare) {
		if (newFreeToShare != freeToShare) {
			NotificationChain msgs = null;
			if (freeToShare != null)
				msgs = ((InternalEObject)freeToShare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_WHO_CLASSIFIED__FREE_TO_SHARE, null, msgs);
			if (newFreeToShare != null)
				msgs = ((InternalEObject)newFreeToShare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_WHO_CLASSIFIED__FREE_TO_SHARE, null, msgs);
			msgs = basicSetFreeToShare(newFreeToShare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_WHO_CLASSIFIED__FREE_TO_SHARE, newFreeToShare, newFreeToShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_WHO_CLASSIFIED__PERSON:
				return basicSetPerson(null, msgs);
			case FhirPackage.CITATION_WHO_CLASSIFIED__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.CITATION_WHO_CLASSIFIED__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.CITATION_WHO_CLASSIFIED__CLASSIFIER_COPYRIGHT:
				return basicSetClassifierCopyright(null, msgs);
			case FhirPackage.CITATION_WHO_CLASSIFIED__FREE_TO_SHARE:
				return basicSetFreeToShare(null, msgs);
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
			case FhirPackage.CITATION_WHO_CLASSIFIED__PERSON:
				return getPerson();
			case FhirPackage.CITATION_WHO_CLASSIFIED__ORGANIZATION:
				return getOrganization();
			case FhirPackage.CITATION_WHO_CLASSIFIED__PUBLISHER:
				return getPublisher();
			case FhirPackage.CITATION_WHO_CLASSIFIED__CLASSIFIER_COPYRIGHT:
				return getClassifierCopyright();
			case FhirPackage.CITATION_WHO_CLASSIFIED__FREE_TO_SHARE:
				return getFreeToShare();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.CITATION_WHO_CLASSIFIED__PERSON:
				setPerson((Reference)newValue);
				return;
			case FhirPackage.CITATION_WHO_CLASSIFIED__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.CITATION_WHO_CLASSIFIED__PUBLISHER:
				setPublisher((Reference)newValue);
				return;
			case FhirPackage.CITATION_WHO_CLASSIFIED__CLASSIFIER_COPYRIGHT:
				setClassifierCopyright((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_WHO_CLASSIFIED__FREE_TO_SHARE:
				setFreeToShare((org.hl7.fhir.Boolean)newValue);
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
			case FhirPackage.CITATION_WHO_CLASSIFIED__PERSON:
				setPerson((Reference)null);
				return;
			case FhirPackage.CITATION_WHO_CLASSIFIED__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.CITATION_WHO_CLASSIFIED__PUBLISHER:
				setPublisher((Reference)null);
				return;
			case FhirPackage.CITATION_WHO_CLASSIFIED__CLASSIFIER_COPYRIGHT:
				setClassifierCopyright((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_WHO_CLASSIFIED__FREE_TO_SHARE:
				setFreeToShare((org.hl7.fhir.Boolean)null);
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
			case FhirPackage.CITATION_WHO_CLASSIFIED__PERSON:
				return person != null;
			case FhirPackage.CITATION_WHO_CLASSIFIED__ORGANIZATION:
				return organization != null;
			case FhirPackage.CITATION_WHO_CLASSIFIED__PUBLISHER:
				return publisher != null;
			case FhirPackage.CITATION_WHO_CLASSIFIED__CLASSIFIER_COPYRIGHT:
				return classifierCopyright != null;
			case FhirPackage.CITATION_WHO_CLASSIFIED__FREE_TO_SHARE:
				return freeToShare != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationWhoClassifiedImpl

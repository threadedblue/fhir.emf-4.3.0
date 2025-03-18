/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CitationDateOfPublication;
import org.hl7.fhir.CitationPeriodicRelease;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Periodic Release</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationPeriodicReleaseImpl#getCitedMedium <em>Cited Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPeriodicReleaseImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPeriodicReleaseImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationPeriodicReleaseImpl#getDateOfPublication <em>Date Of Publication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationPeriodicReleaseImpl extends BackboneElementImpl implements CitationPeriodicRelease {
	/**
	 * The cached value of the '{@link #getCitedMedium() <em>Cited Medium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedMedium()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept citedMedium;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String volume;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String issue;

	/**
	 * The cached value of the '{@link #getDateOfPublication() <em>Date Of Publication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfPublication()
	 * @generated
	 * @ordered
	 */
	protected CitationDateOfPublication dateOfPublication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationPeriodicReleaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationPeriodicRelease();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCitedMedium() {
		return citedMedium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitedMedium(CodeableConcept newCitedMedium, NotificationChain msgs) {
		CodeableConcept oldCitedMedium = citedMedium;
		citedMedium = newCitedMedium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PERIODIC_RELEASE__CITED_MEDIUM, oldCitedMedium, newCitedMedium);
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
	public void setCitedMedium(CodeableConcept newCitedMedium) {
		if (newCitedMedium != citedMedium) {
			NotificationChain msgs = null;
			if (citedMedium != null)
				msgs = ((InternalEObject)citedMedium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PERIODIC_RELEASE__CITED_MEDIUM, null, msgs);
			if (newCitedMedium != null)
				msgs = ((InternalEObject)newCitedMedium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PERIODIC_RELEASE__CITED_MEDIUM, null, msgs);
			msgs = basicSetCitedMedium(newCitedMedium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PERIODIC_RELEASE__CITED_MEDIUM, newCitedMedium, newCitedMedium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolume(org.hl7.fhir.String newVolume, NotificationChain msgs) {
		org.hl7.fhir.String oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PERIODIC_RELEASE__VOLUME, oldVolume, newVolume);
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
	public void setVolume(org.hl7.fhir.String newVolume) {
		if (newVolume != volume) {
			NotificationChain msgs = null;
			if (volume != null)
				msgs = ((InternalEObject)volume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PERIODIC_RELEASE__VOLUME, null, msgs);
			if (newVolume != null)
				msgs = ((InternalEObject)newVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PERIODIC_RELEASE__VOLUME, null, msgs);
			msgs = basicSetVolume(newVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PERIODIC_RELEASE__VOLUME, newVolume, newVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssue(org.hl7.fhir.String newIssue, NotificationChain msgs) {
		org.hl7.fhir.String oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PERIODIC_RELEASE__ISSUE, oldIssue, newIssue);
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
	public void setIssue(org.hl7.fhir.String newIssue) {
		if (newIssue != issue) {
			NotificationChain msgs = null;
			if (issue != null)
				msgs = ((InternalEObject)issue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PERIODIC_RELEASE__ISSUE, null, msgs);
			if (newIssue != null)
				msgs = ((InternalEObject)newIssue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PERIODIC_RELEASE__ISSUE, null, msgs);
			msgs = basicSetIssue(newIssue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PERIODIC_RELEASE__ISSUE, newIssue, newIssue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationDateOfPublication getDateOfPublication() {
		return dateOfPublication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateOfPublication(CitationDateOfPublication newDateOfPublication, NotificationChain msgs) {
		CitationDateOfPublication oldDateOfPublication = dateOfPublication;
		dateOfPublication = newDateOfPublication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PERIODIC_RELEASE__DATE_OF_PUBLICATION, oldDateOfPublication, newDateOfPublication);
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
	public void setDateOfPublication(CitationDateOfPublication newDateOfPublication) {
		if (newDateOfPublication != dateOfPublication) {
			NotificationChain msgs = null;
			if (dateOfPublication != null)
				msgs = ((InternalEObject)dateOfPublication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PERIODIC_RELEASE__DATE_OF_PUBLICATION, null, msgs);
			if (newDateOfPublication != null)
				msgs = ((InternalEObject)newDateOfPublication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_PERIODIC_RELEASE__DATE_OF_PUBLICATION, null, msgs);
			msgs = basicSetDateOfPublication(newDateOfPublication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_PERIODIC_RELEASE__DATE_OF_PUBLICATION, newDateOfPublication, newDateOfPublication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_PERIODIC_RELEASE__CITED_MEDIUM:
				return basicSetCitedMedium(null, msgs);
			case FhirPackage.CITATION_PERIODIC_RELEASE__VOLUME:
				return basicSetVolume(null, msgs);
			case FhirPackage.CITATION_PERIODIC_RELEASE__ISSUE:
				return basicSetIssue(null, msgs);
			case FhirPackage.CITATION_PERIODIC_RELEASE__DATE_OF_PUBLICATION:
				return basicSetDateOfPublication(null, msgs);
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
			case FhirPackage.CITATION_PERIODIC_RELEASE__CITED_MEDIUM:
				return getCitedMedium();
			case FhirPackage.CITATION_PERIODIC_RELEASE__VOLUME:
				return getVolume();
			case FhirPackage.CITATION_PERIODIC_RELEASE__ISSUE:
				return getIssue();
			case FhirPackage.CITATION_PERIODIC_RELEASE__DATE_OF_PUBLICATION:
				return getDateOfPublication();
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
			case FhirPackage.CITATION_PERIODIC_RELEASE__CITED_MEDIUM:
				setCitedMedium((CodeableConcept)newValue);
				return;
			case FhirPackage.CITATION_PERIODIC_RELEASE__VOLUME:
				setVolume((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PERIODIC_RELEASE__ISSUE:
				setIssue((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_PERIODIC_RELEASE__DATE_OF_PUBLICATION:
				setDateOfPublication((CitationDateOfPublication)newValue);
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
			case FhirPackage.CITATION_PERIODIC_RELEASE__CITED_MEDIUM:
				setCitedMedium((CodeableConcept)null);
				return;
			case FhirPackage.CITATION_PERIODIC_RELEASE__VOLUME:
				setVolume((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PERIODIC_RELEASE__ISSUE:
				setIssue((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_PERIODIC_RELEASE__DATE_OF_PUBLICATION:
				setDateOfPublication((CitationDateOfPublication)null);
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
			case FhirPackage.CITATION_PERIODIC_RELEASE__CITED_MEDIUM:
				return citedMedium != null;
			case FhirPackage.CITATION_PERIODIC_RELEASE__VOLUME:
				return volume != null;
			case FhirPackage.CITATION_PERIODIC_RELEASE__ISSUE:
				return issue != null;
			case FhirPackage.CITATION_PERIODIC_RELEASE__DATE_OF_PUBLICATION:
				return dateOfPublication != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationPeriodicReleaseImpl

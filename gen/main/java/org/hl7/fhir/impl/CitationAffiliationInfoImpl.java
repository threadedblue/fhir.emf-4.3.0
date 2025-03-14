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
import org.hl7.fhir.CitationAffiliationInfo;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Affiliation Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationAffiliationInfoImpl#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationAffiliationInfoImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationAffiliationInfoImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationAffiliationInfoImpl extends BackboneElementImpl implements CitationAffiliationInfo {
	/**
	 * The cached value of the '{@link #getAffiliation() <em>Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String affiliation;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String role;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationAffiliationInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationAffiliationInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAffiliation() {
		return affiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffiliation(org.hl7.fhir.String newAffiliation, NotificationChain msgs) {
		org.hl7.fhir.String oldAffiliation = affiliation;
		affiliation = newAffiliation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_AFFILIATION_INFO__AFFILIATION, oldAffiliation, newAffiliation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffiliation(org.hl7.fhir.String newAffiliation) {
		if (newAffiliation != affiliation) {
			NotificationChain msgs = null;
			if (affiliation != null)
				msgs = ((InternalEObject)affiliation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_AFFILIATION_INFO__AFFILIATION, null, msgs);
			if (newAffiliation != null)
				msgs = ((InternalEObject)newAffiliation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_AFFILIATION_INFO__AFFILIATION, null, msgs);
			msgs = basicSetAffiliation(newAffiliation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_AFFILIATION_INFO__AFFILIATION, newAffiliation, newAffiliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(org.hl7.fhir.String newRole, NotificationChain msgs) {
		org.hl7.fhir.String oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_AFFILIATION_INFO__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(org.hl7.fhir.String newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_AFFILIATION_INFO__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_AFFILIATION_INFO__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_AFFILIATION_INFO__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CITATION_AFFILIATION_INFO__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_AFFILIATION_INFO__AFFILIATION:
				return basicSetAffiliation(null, msgs);
			case FhirPackage.CITATION_AFFILIATION_INFO__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.CITATION_AFFILIATION_INFO__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CITATION_AFFILIATION_INFO__AFFILIATION:
				return getAffiliation();
			case FhirPackage.CITATION_AFFILIATION_INFO__ROLE:
				return getRole();
			case FhirPackage.CITATION_AFFILIATION_INFO__IDENTIFIER:
				return getIdentifier();
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
			case FhirPackage.CITATION_AFFILIATION_INFO__AFFILIATION:
				setAffiliation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_AFFILIATION_INFO__ROLE:
				setRole((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_AFFILIATION_INFO__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
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
			case FhirPackage.CITATION_AFFILIATION_INFO__AFFILIATION:
				setAffiliation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_AFFILIATION_INFO__ROLE:
				setRole((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_AFFILIATION_INFO__IDENTIFIER:
				getIdentifier().clear();
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
			case FhirPackage.CITATION_AFFILIATION_INFO__AFFILIATION:
				return affiliation != null;
			case FhirPackage.CITATION_AFFILIATION_INFO__ROLE:
				return role != null;
			case FhirPackage.CITATION_AFFILIATION_INFO__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CitationAffiliationInfoImpl

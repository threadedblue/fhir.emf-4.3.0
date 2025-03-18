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

import org.hl7.fhir.CitationClassification1;
import org.hl7.fhir.CitationWhoClassified;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Classification1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationClassification1Impl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationClassification1Impl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationClassification1Impl#getWhoClassified <em>Who Classified</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationClassification1Impl extends BackboneElementImpl implements CitationClassification1 {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> classifier;

	/**
	 * The cached value of the '{@link #getWhoClassified() <em>Who Classified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoClassified()
	 * @generated
	 * @ordered
	 */
	protected CitationWhoClassified whoClassified;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationClassification1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationClassification1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CLASSIFICATION1__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CLASSIFICATION1__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CLASSIFICATION1__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CLASSIFICATION1__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getClassifier() {
		if (classifier == null) {
			classifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CITATION_CLASSIFICATION1__CLASSIFIER);
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationWhoClassified getWhoClassified() {
		return whoClassified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoClassified(CitationWhoClassified newWhoClassified, NotificationChain msgs) {
		CitationWhoClassified oldWhoClassified = whoClassified;
		whoClassified = newWhoClassified;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CLASSIFICATION1__WHO_CLASSIFIED, oldWhoClassified, newWhoClassified);
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
	public void setWhoClassified(CitationWhoClassified newWhoClassified) {
		if (newWhoClassified != whoClassified) {
			NotificationChain msgs = null;
			if (whoClassified != null)
				msgs = ((InternalEObject)whoClassified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CLASSIFICATION1__WHO_CLASSIFIED, null, msgs);
			if (newWhoClassified != null)
				msgs = ((InternalEObject)newWhoClassified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CLASSIFICATION1__WHO_CLASSIFIED, null, msgs);
			msgs = basicSetWhoClassified(newWhoClassified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CLASSIFICATION1__WHO_CLASSIFIED, newWhoClassified, newWhoClassified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_CLASSIFICATION1__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CITATION_CLASSIFICATION1__CLASSIFIER:
				return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CLASSIFICATION1__WHO_CLASSIFIED:
				return basicSetWhoClassified(null, msgs);
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
			case FhirPackage.CITATION_CLASSIFICATION1__TYPE:
				return getType();
			case FhirPackage.CITATION_CLASSIFICATION1__CLASSIFIER:
				return getClassifier();
			case FhirPackage.CITATION_CLASSIFICATION1__WHO_CLASSIFIED:
				return getWhoClassified();
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
			case FhirPackage.CITATION_CLASSIFICATION1__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CITATION_CLASSIFICATION1__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CITATION_CLASSIFICATION1__WHO_CLASSIFIED:
				setWhoClassified((CitationWhoClassified)newValue);
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
			case FhirPackage.CITATION_CLASSIFICATION1__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CITATION_CLASSIFICATION1__CLASSIFIER:
				getClassifier().clear();
				return;
			case FhirPackage.CITATION_CLASSIFICATION1__WHO_CLASSIFIED:
				setWhoClassified((CitationWhoClassified)null);
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
			case FhirPackage.CITATION_CLASSIFICATION1__TYPE:
				return type != null;
			case FhirPackage.CITATION_CLASSIFICATION1__CLASSIFIER:
				return classifier != null && !classifier.isEmpty();
			case FhirPackage.CITATION_CLASSIFICATION1__WHO_CLASSIFIED:
				return whoClassified != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationClassification1Impl

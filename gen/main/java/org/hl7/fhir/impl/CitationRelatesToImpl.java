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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CitationRelatesTo;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Relates To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getTargetClassifier <em>Target Classifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getTargetUri <em>Target Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getTargetIdentifier <em>Target Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getTargetReference <em>Target Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationRelatesToImpl#getTargetAttachment <em>Target Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationRelatesToImpl extends BackboneElementImpl implements CitationRelatesTo {
	/**
	 * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationshipType;

	/**
	 * The cached value of the '{@link #getTargetClassifier() <em>Target Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> targetClassifier;

	/**
	 * The cached value of the '{@link #getTargetUri() <em>Target Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUri()
	 * @generated
	 * @ordered
	 */
	protected Uri targetUri;

	/**
	 * The cached value of the '{@link #getTargetIdentifier() <em>Target Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier targetIdentifier;

	/**
	 * The cached value of the '{@link #getTargetReference() <em>Target Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReference()
	 * @generated
	 * @ordered
	 */
	protected Reference targetReference;

	/**
	 * The cached value of the '{@link #getTargetAttachment() <em>Target Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment targetAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationRelatesToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationRelatesTo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRelationshipType() {
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationshipType(CodeableConcept newRelationshipType, NotificationChain msgs) {
		CodeableConcept oldRelationshipType = relationshipType;
		relationshipType = newRelationshipType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__RELATIONSHIP_TYPE, oldRelationshipType, newRelationshipType);
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
	public void setRelationshipType(CodeableConcept newRelationshipType) {
		if (newRelationshipType != relationshipType) {
			NotificationChain msgs = null;
			if (relationshipType != null)
				msgs = ((InternalEObject)relationshipType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__RELATIONSHIP_TYPE, null, msgs);
			if (newRelationshipType != null)
				msgs = ((InternalEObject)newRelationshipType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__RELATIONSHIP_TYPE, null, msgs);
			msgs = basicSetRelationshipType(newRelationshipType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__RELATIONSHIP_TYPE, newRelationshipType, newRelationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getTargetClassifier() {
		if (targetClassifier == null) {
			targetClassifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CITATION_RELATES_TO__TARGET_CLASSIFIER);
		}
		return targetClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getTargetUri() {
		return targetUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetUri(Uri newTargetUri, NotificationChain msgs) {
		Uri oldTargetUri = targetUri;
		targetUri = newTargetUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__TARGET_URI, oldTargetUri, newTargetUri);
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
	public void setTargetUri(Uri newTargetUri) {
		if (newTargetUri != targetUri) {
			NotificationChain msgs = null;
			if (targetUri != null)
				msgs = ((InternalEObject)targetUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__TARGET_URI, null, msgs);
			if (newTargetUri != null)
				msgs = ((InternalEObject)newTargetUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__TARGET_URI, null, msgs);
			msgs = basicSetTargetUri(newTargetUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__TARGET_URI, newTargetUri, newTargetUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getTargetIdentifier() {
		return targetIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetIdentifier(Identifier newTargetIdentifier, NotificationChain msgs) {
		Identifier oldTargetIdentifier = targetIdentifier;
		targetIdentifier = newTargetIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__TARGET_IDENTIFIER, oldTargetIdentifier, newTargetIdentifier);
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
	public void setTargetIdentifier(Identifier newTargetIdentifier) {
		if (newTargetIdentifier != targetIdentifier) {
			NotificationChain msgs = null;
			if (targetIdentifier != null)
				msgs = ((InternalEObject)targetIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__TARGET_IDENTIFIER, null, msgs);
			if (newTargetIdentifier != null)
				msgs = ((InternalEObject)newTargetIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__TARGET_IDENTIFIER, null, msgs);
			msgs = basicSetTargetIdentifier(newTargetIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__TARGET_IDENTIFIER, newTargetIdentifier, newTargetIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getTargetReference() {
		return targetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetReference(Reference newTargetReference, NotificationChain msgs) {
		Reference oldTargetReference = targetReference;
		targetReference = newTargetReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__TARGET_REFERENCE, oldTargetReference, newTargetReference);
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
	public void setTargetReference(Reference newTargetReference) {
		if (newTargetReference != targetReference) {
			NotificationChain msgs = null;
			if (targetReference != null)
				msgs = ((InternalEObject)targetReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__TARGET_REFERENCE, null, msgs);
			if (newTargetReference != null)
				msgs = ((InternalEObject)newTargetReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__TARGET_REFERENCE, null, msgs);
			msgs = basicSetTargetReference(newTargetReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__TARGET_REFERENCE, newTargetReference, newTargetReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getTargetAttachment() {
		return targetAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetAttachment(Attachment newTargetAttachment, NotificationChain msgs) {
		Attachment oldTargetAttachment = targetAttachment;
		targetAttachment = newTargetAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__TARGET_ATTACHMENT, oldTargetAttachment, newTargetAttachment);
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
	public void setTargetAttachment(Attachment newTargetAttachment) {
		if (newTargetAttachment != targetAttachment) {
			NotificationChain msgs = null;
			if (targetAttachment != null)
				msgs = ((InternalEObject)targetAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__TARGET_ATTACHMENT, null, msgs);
			if (newTargetAttachment != null)
				msgs = ((InternalEObject)newTargetAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_RELATES_TO__TARGET_ATTACHMENT, null, msgs);
			msgs = basicSetTargetAttachment(newTargetAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_RELATES_TO__TARGET_ATTACHMENT, newTargetAttachment, newTargetAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_RELATES_TO__RELATIONSHIP_TYPE:
				return basicSetRelationshipType(null, msgs);
			case FhirPackage.CITATION_RELATES_TO__TARGET_CLASSIFIER:
				return ((InternalEList<?>)getTargetClassifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_RELATES_TO__TARGET_URI:
				return basicSetTargetUri(null, msgs);
			case FhirPackage.CITATION_RELATES_TO__TARGET_IDENTIFIER:
				return basicSetTargetIdentifier(null, msgs);
			case FhirPackage.CITATION_RELATES_TO__TARGET_REFERENCE:
				return basicSetTargetReference(null, msgs);
			case FhirPackage.CITATION_RELATES_TO__TARGET_ATTACHMENT:
				return basicSetTargetAttachment(null, msgs);
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
			case FhirPackage.CITATION_RELATES_TO__RELATIONSHIP_TYPE:
				return getRelationshipType();
			case FhirPackage.CITATION_RELATES_TO__TARGET_CLASSIFIER:
				return getTargetClassifier();
			case FhirPackage.CITATION_RELATES_TO__TARGET_URI:
				return getTargetUri();
			case FhirPackage.CITATION_RELATES_TO__TARGET_IDENTIFIER:
				return getTargetIdentifier();
			case FhirPackage.CITATION_RELATES_TO__TARGET_REFERENCE:
				return getTargetReference();
			case FhirPackage.CITATION_RELATES_TO__TARGET_ATTACHMENT:
				return getTargetAttachment();
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
			case FhirPackage.CITATION_RELATES_TO__RELATIONSHIP_TYPE:
				setRelationshipType((CodeableConcept)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__TARGET_CLASSIFIER:
				getTargetClassifier().clear();
				getTargetClassifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__TARGET_URI:
				setTargetUri((Uri)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__TARGET_IDENTIFIER:
				setTargetIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__TARGET_REFERENCE:
				setTargetReference((Reference)newValue);
				return;
			case FhirPackage.CITATION_RELATES_TO__TARGET_ATTACHMENT:
				setTargetAttachment((Attachment)newValue);
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
			case FhirPackage.CITATION_RELATES_TO__RELATIONSHIP_TYPE:
				setRelationshipType((CodeableConcept)null);
				return;
			case FhirPackage.CITATION_RELATES_TO__TARGET_CLASSIFIER:
				getTargetClassifier().clear();
				return;
			case FhirPackage.CITATION_RELATES_TO__TARGET_URI:
				setTargetUri((Uri)null);
				return;
			case FhirPackage.CITATION_RELATES_TO__TARGET_IDENTIFIER:
				setTargetIdentifier((Identifier)null);
				return;
			case FhirPackage.CITATION_RELATES_TO__TARGET_REFERENCE:
				setTargetReference((Reference)null);
				return;
			case FhirPackage.CITATION_RELATES_TO__TARGET_ATTACHMENT:
				setTargetAttachment((Attachment)null);
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
			case FhirPackage.CITATION_RELATES_TO__RELATIONSHIP_TYPE:
				return relationshipType != null;
			case FhirPackage.CITATION_RELATES_TO__TARGET_CLASSIFIER:
				return targetClassifier != null && !targetClassifier.isEmpty();
			case FhirPackage.CITATION_RELATES_TO__TARGET_URI:
				return targetUri != null;
			case FhirPackage.CITATION_RELATES_TO__TARGET_IDENTIFIER:
				return targetIdentifier != null;
			case FhirPackage.CITATION_RELATES_TO__TARGET_REFERENCE:
				return targetReference != null;
			case FhirPackage.CITATION_RELATES_TO__TARGET_ATTACHMENT:
				return targetAttachment != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationRelatesToImpl

/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.EvidenceVariableCharacteristic;
import org.hl7.fhir.EvidenceVariableTimeFromStart;
import org.hl7.fhir.Expression;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GroupMeasure;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Variable Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionExpression <em>Definition Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getTimeFromStart <em>Time From Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getGroupMeasure <em>Group Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceVariableCharacteristicImpl extends BackboneElementImpl implements EvidenceVariableCharacteristic {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getDefinitionReference() <em>Definition Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected Reference definitionReference;

	/**
	 * The cached value of the '{@link #getDefinitionCanonical() <em>Definition Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical definitionCanonical;

	/**
	 * The cached value of the '{@link #getDefinitionCodeableConcept() <em>Definition Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept definitionCodeableConcept;

	/**
	 * The cached value of the '{@link #getDefinitionExpression() <em>Definition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression definitionExpression;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Reference device;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean exclude;

	/**
	 * The cached value of the '{@link #getTimeFromStart() <em>Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFromStart()
	 * @generated
	 * @ordered
	 */
	protected EvidenceVariableTimeFromStart timeFromStart;

	/**
	 * The cached value of the '{@link #getGroupMeasure() <em>Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupMeasure()
	 * @generated
	 * @ordered
	 */
	protected GroupMeasure groupMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceVariableCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceVariableCharacteristic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDefinitionReference() {
		return definitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionReference(Reference newDefinitionReference, NotificationChain msgs) {
		Reference oldDefinitionReference = definitionReference;
		definitionReference = newDefinitionReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, oldDefinitionReference, newDefinitionReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionReference(Reference newDefinitionReference) {
		if (newDefinitionReference != definitionReference) {
			NotificationChain msgs = null;
			if (definitionReference != null)
				msgs = ((InternalEObject)definitionReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, null, msgs);
			if (newDefinitionReference != null)
				msgs = ((InternalEObject)newDefinitionReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, null, msgs);
			msgs = basicSetDefinitionReference(newDefinitionReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, newDefinitionReference, newDefinitionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getDefinitionCanonical() {
		return definitionCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionCanonical(Canonical newDefinitionCanonical, NotificationChain msgs) {
		Canonical oldDefinitionCanonical = definitionCanonical;
		definitionCanonical = newDefinitionCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, oldDefinitionCanonical, newDefinitionCanonical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionCanonical(Canonical newDefinitionCanonical) {
		if (newDefinitionCanonical != definitionCanonical) {
			NotificationChain msgs = null;
			if (definitionCanonical != null)
				msgs = ((InternalEObject)definitionCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, null, msgs);
			if (newDefinitionCanonical != null)
				msgs = ((InternalEObject)newDefinitionCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, null, msgs);
			msgs = basicSetDefinitionCanonical(newDefinitionCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, newDefinitionCanonical, newDefinitionCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDefinitionCodeableConcept() {
		return definitionCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionCodeableConcept(CodeableConcept newDefinitionCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldDefinitionCodeableConcept = definitionCodeableConcept;
		definitionCodeableConcept = newDefinitionCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, oldDefinitionCodeableConcept, newDefinitionCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionCodeableConcept(CodeableConcept newDefinitionCodeableConcept) {
		if (newDefinitionCodeableConcept != definitionCodeableConcept) {
			NotificationChain msgs = null;
			if (definitionCodeableConcept != null)
				msgs = ((InternalEObject)definitionCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, null, msgs);
			if (newDefinitionCodeableConcept != null)
				msgs = ((InternalEObject)newDefinitionCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDefinitionCodeableConcept(newDefinitionCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, newDefinitionCodeableConcept, newDefinitionCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDefinitionExpression() {
		return definitionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionExpression(Expression newDefinitionExpression, NotificationChain msgs) {
		Expression oldDefinitionExpression = definitionExpression;
		definitionExpression = newDefinitionExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, oldDefinitionExpression, newDefinitionExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionExpression(Expression newDefinitionExpression) {
		if (newDefinitionExpression != definitionExpression) {
			NotificationChain msgs = null;
			if (definitionExpression != null)
				msgs = ((InternalEObject)definitionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, null, msgs);
			if (newDefinitionExpression != null)
				msgs = ((InternalEObject)newDefinitionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, null, msgs);
			msgs = basicSetDefinitionExpression(newDefinitionExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, newDefinitionExpression, newDefinitionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Reference newDevice, NotificationChain msgs) {
		Reference oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEVICE, oldDevice, newDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Reference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclude(org.hl7.fhir.Boolean newExclude, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, oldExclude, newExclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclude(org.hl7.fhir.Boolean newExclude) {
		if (newExclude != exclude) {
			NotificationChain msgs = null;
			if (exclude != null)
				msgs = ((InternalEObject)exclude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, null, msgs);
			if (newExclude != null)
				msgs = ((InternalEObject)newExclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, null, msgs);
			msgs = basicSetExclude(newExclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, newExclude, newExclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableTimeFromStart getTimeFromStart() {
		return timeFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeFromStart(EvidenceVariableTimeFromStart newTimeFromStart, NotificationChain msgs) {
		EvidenceVariableTimeFromStart oldTimeFromStart = timeFromStart;
		timeFromStart = newTimeFromStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, oldTimeFromStart, newTimeFromStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeFromStart(EvidenceVariableTimeFromStart newTimeFromStart) {
		if (newTimeFromStart != timeFromStart) {
			NotificationChain msgs = null;
			if (timeFromStart != null)
				msgs = ((InternalEObject)timeFromStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, null, msgs);
			if (newTimeFromStart != null)
				msgs = ((InternalEObject)newTimeFromStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, null, msgs);
			msgs = basicSetTimeFromStart(newTimeFromStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, newTimeFromStart, newTimeFromStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMeasure getGroupMeasure() {
		return groupMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupMeasure(GroupMeasure newGroupMeasure, NotificationChain msgs) {
		GroupMeasure oldGroupMeasure = groupMeasure;
		groupMeasure = newGroupMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, oldGroupMeasure, newGroupMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupMeasure(GroupMeasure newGroupMeasure) {
		if (newGroupMeasure != groupMeasure) {
			NotificationChain msgs = null;
			if (groupMeasure != null)
				msgs = ((InternalEObject)groupMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, null, msgs);
			if (newGroupMeasure != null)
				msgs = ((InternalEObject)newGroupMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, null, msgs);
			msgs = basicSetGroupMeasure(newGroupMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, newGroupMeasure, newGroupMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				return basicSetDefinitionReference(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				return basicSetDefinitionCanonical(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return basicSetDefinitionCodeableConcept(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return basicSetDefinitionExpression(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return basicSetExclude(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				return basicSetTimeFromStart(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				return basicSetGroupMeasure(null, msgs);
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return getDescription();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				return getDefinitionReference();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				return getDefinitionCanonical();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return getDefinitionCodeableConcept();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return getDefinitionExpression();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__METHOD:
				return getMethod();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEVICE:
				return getDevice();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return getExclude();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				return getTimeFromStart();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				return getGroupMeasure();
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				setDefinitionReference((Reference)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				setDefinitionCanonical((Canonical)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				setDefinitionCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				setDefinitionExpression((Expression)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEVICE:
				setDevice((Reference)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				setExclude((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				setTimeFromStart((EvidenceVariableTimeFromStart)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				setGroupMeasure((GroupMeasure)newValue);
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				setDefinitionReference((Reference)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				setDefinitionCanonical((Canonical)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				setDefinitionCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				setDefinitionExpression((Expression)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEVICE:
				setDevice((Reference)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				setExclude((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				setTimeFromStart((EvidenceVariableTimeFromStart)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				setGroupMeasure((GroupMeasure)null);
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return description != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				return definitionReference != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				return definitionCanonical != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return definitionCodeableConcept != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return definitionExpression != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__METHOD:
				return method != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEVICE:
				return device != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return exclude != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				return timeFromStart != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				return groupMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //EvidenceVariableCharacteristicImpl

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

import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.NutritionProductInstance;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Product Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionProductInstanceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionProductInstanceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionProductInstanceImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionProductInstanceImpl#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionProductInstanceImpl#getUseBy <em>Use By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionProductInstanceImpl extends BackboneElementImpl implements NutritionProductInstance {
	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

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
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String lotNumber;

	/**
	 * The cached value of the '{@link #getExpiry() <em>Expiry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiry()
	 * @generated
	 * @ordered
	 */
	protected DateTime expiry;

	/**
	 * The cached value of the '{@link #getUseBy() <em>Use By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseBy()
	 * @generated
	 * @ordered
	 */
	protected DateTime useBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionProductInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionProductInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT_INSTANCE__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT_INSTANCE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT_INSTANCE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT_INSTANCE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.NUTRITION_PRODUCT_INSTANCE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLotNumber(org.hl7.fhir.String newLotNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT_INSTANCE__LOT_NUMBER, oldLotNumber, newLotNumber);
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
	public void setLotNumber(org.hl7.fhir.String newLotNumber) {
		if (newLotNumber != lotNumber) {
			NotificationChain msgs = null;
			if (lotNumber != null)
				msgs = ((InternalEObject)lotNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT_INSTANCE__LOT_NUMBER, null, msgs);
			if (newLotNumber != null)
				msgs = ((InternalEObject)newLotNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT_INSTANCE__LOT_NUMBER, null, msgs);
			msgs = basicSetLotNumber(newLotNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT_INSTANCE__LOT_NUMBER, newLotNumber, newLotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getExpiry() {
		return expiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpiry(DateTime newExpiry, NotificationChain msgs) {
		DateTime oldExpiry = expiry;
		expiry = newExpiry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT_INSTANCE__EXPIRY, oldExpiry, newExpiry);
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
	public void setExpiry(DateTime newExpiry) {
		if (newExpiry != expiry) {
			NotificationChain msgs = null;
			if (expiry != null)
				msgs = ((InternalEObject)expiry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT_INSTANCE__EXPIRY, null, msgs);
			if (newExpiry != null)
				msgs = ((InternalEObject)newExpiry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT_INSTANCE__EXPIRY, null, msgs);
			msgs = basicSetExpiry(newExpiry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT_INSTANCE__EXPIRY, newExpiry, newExpiry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getUseBy() {
		return useBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseBy(DateTime newUseBy, NotificationChain msgs) {
		DateTime oldUseBy = useBy;
		useBy = newUseBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT_INSTANCE__USE_BY, oldUseBy, newUseBy);
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
	public void setUseBy(DateTime newUseBy) {
		if (newUseBy != useBy) {
			NotificationChain msgs = null;
			if (useBy != null)
				msgs = ((InternalEObject)useBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT_INSTANCE__USE_BY, null, msgs);
			if (newUseBy != null)
				msgs = ((InternalEObject)newUseBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_PRODUCT_INSTANCE__USE_BY, null, msgs);
			msgs = basicSetUseBy(newUseBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_PRODUCT_INSTANCE__USE_BY, newUseBy, newUseBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__LOT_NUMBER:
				return basicSetLotNumber(null, msgs);
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__EXPIRY:
				return basicSetExpiry(null, msgs);
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__USE_BY:
				return basicSetUseBy(null, msgs);
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
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__QUANTITY:
				return getQuantity();
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__LOT_NUMBER:
				return getLotNumber();
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__EXPIRY:
				return getExpiry();
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__USE_BY:
				return getUseBy();
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
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__EXPIRY:
				setExpiry((DateTime)newValue);
				return;
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__USE_BY:
				setUseBy((DateTime)newValue);
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
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__EXPIRY:
				setExpiry((DateTime)null);
				return;
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__USE_BY:
				setUseBy((DateTime)null);
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
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__QUANTITY:
				return quantity != null;
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__LOT_NUMBER:
				return lotNumber != null;
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__EXPIRY:
				return expiry != null;
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE__USE_BY:
				return useBy != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionProductInstanceImpl

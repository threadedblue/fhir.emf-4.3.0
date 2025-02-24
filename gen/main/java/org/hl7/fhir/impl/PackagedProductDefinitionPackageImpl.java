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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.PackagedProductDefinitionContainedItem;
import org.hl7.fhir.PackagedProductDefinitionPackage;
import org.hl7.fhir.PackagedProductDefinitionProperty;
import org.hl7.fhir.PackagedProductDefinitionShelfLifeStorage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packaged Product Definition Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionPackageImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionPackageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionPackageImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionPackageImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionPackageImpl#getAlternateMaterial <em>Alternate Material</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionPackageImpl#getShelfLifeStorage <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionPackageImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionPackageImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionPackageImpl#getContainedItem <em>Contained Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PackagedProductDefinitionPackageImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackagedProductDefinitionPackageImpl extends BackboneElementImpl implements PackagedProductDefinitionPackage {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer quantity;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> material;

	/**
	 * The cached value of the '{@link #getAlternateMaterial() <em>Alternate Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> alternateMaterial;

	/**
	 * The cached value of the '{@link #getShelfLifeStorage() <em>Shelf Life Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShelfLifeStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<PackagedProductDefinitionShelfLifeStorage> shelfLifeStorage;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturer;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PackagedProductDefinitionProperty> property;

	/**
	 * The cached value of the '{@link #getContainedItem() <em>Contained Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedItem()
	 * @generated
	 * @ordered
	 */
	protected EList<PackagedProductDefinitionContainedItem> containedItem;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<PackagedProductDefinitionPackage> package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackagedProductDefinitionPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPackagedProductDefinitionPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(org.hl7.fhir.Integer newQuantity, NotificationChain msgs) {
		org.hl7.fhir.Integer oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(org.hl7.fhir.Integer newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getMaterial() {
		if (material == null) {
			material = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MATERIAL);
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAlternateMaterial() {
		if (alternateMaterial == null) {
			alternateMaterial = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__ALTERNATE_MATERIAL);
		}
		return alternateMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackagedProductDefinitionShelfLifeStorage> getShelfLifeStorage() {
		if (shelfLifeStorage == null) {
			shelfLifeStorage = new EObjectContainmentEList<PackagedProductDefinitionShelfLifeStorage>(PackagedProductDefinitionShelfLifeStorage.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__SHELF_LIFE_STORAGE);
		}
		return shelfLifeStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getManufacturer() {
		if (manufacturer == null) {
			manufacturer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MANUFACTURER);
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackagedProductDefinitionProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<PackagedProductDefinitionProperty>(PackagedProductDefinitionProperty.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackagedProductDefinitionContainedItem> getContainedItem() {
		if (containedItem == null) {
			containedItem = new EObjectContainmentEList<PackagedProductDefinitionContainedItem>(PackagedProductDefinitionContainedItem.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__CONTAINED_ITEM);
		}
		return containedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackagedProductDefinitionPackage> getPackage() {
		if (package_ == null) {
			package_ = new EObjectContainmentEList<PackagedProductDefinitionPackage>(PackagedProductDefinitionPackage.class, this, FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MATERIAL:
				return ((InternalEList<?>)getMaterial()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__ALTERNATE_MATERIAL:
				return ((InternalEList<?>)getAlternateMaterial()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__SHELF_LIFE_STORAGE:
				return ((InternalEList<?>)getShelfLifeStorage()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MANUFACTURER:
				return ((InternalEList<?>)getManufacturer()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__CONTAINED_ITEM:
				return ((InternalEList<?>)getContainedItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__TYPE:
				return getType();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__QUANTITY:
				return getQuantity();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MATERIAL:
				return getMaterial();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__ALTERNATE_MATERIAL:
				return getAlternateMaterial();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__SHELF_LIFE_STORAGE:
				return getShelfLifeStorage();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PROPERTY:
				return getProperty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__CONTAINED_ITEM:
				return getContainedItem();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PACKAGE:
				return getPackage();
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__QUANTITY:
				setQuantity((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MATERIAL:
				getMaterial().clear();
				getMaterial().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__ALTERNATE_MATERIAL:
				getAlternateMaterial().clear();
				getAlternateMaterial().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__SHELF_LIFE_STORAGE:
				getShelfLifeStorage().clear();
				getShelfLifeStorage().addAll((Collection<? extends PackagedProductDefinitionShelfLifeStorage>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MANUFACTURER:
				getManufacturer().clear();
				getManufacturer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PackagedProductDefinitionProperty>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__CONTAINED_ITEM:
				getContainedItem().clear();
				getContainedItem().addAll((Collection<? extends PackagedProductDefinitionContainedItem>)newValue);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends PackagedProductDefinitionPackage>)newValue);
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__QUANTITY:
				setQuantity((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MATERIAL:
				getMaterial().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__ALTERNATE_MATERIAL:
				getAlternateMaterial().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__SHELF_LIFE_STORAGE:
				getShelfLifeStorage().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MANUFACTURER:
				getManufacturer().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__CONTAINED_ITEM:
				getContainedItem().clear();
				return;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PACKAGE:
				getPackage().clear();
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
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__TYPE:
				return type != null;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__QUANTITY:
				return quantity != null;
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MATERIAL:
				return material != null && !material.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__ALTERNATE_MATERIAL:
				return alternateMaterial != null && !alternateMaterial.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__SHELF_LIFE_STORAGE:
				return shelfLifeStorage != null && !shelfLifeStorage.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__MANUFACTURER:
				return manufacturer != null && !manufacturer.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__CONTAINED_ITEM:
				return containedItem != null && !containedItem.isEmpty();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE__PACKAGE:
				return package_ != null && !package_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackagedProductDefinitionPackageImpl

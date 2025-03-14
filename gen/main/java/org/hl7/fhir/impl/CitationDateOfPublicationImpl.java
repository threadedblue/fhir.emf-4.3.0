/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.hl7.fhir.CitationDateOfPublication;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Date Of Publication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationDateOfPublicationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationDateOfPublicationImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationDateOfPublicationImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationDateOfPublicationImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationDateOfPublicationImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationDateOfPublicationImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationDateOfPublicationImpl extends BackboneElementImpl implements CitationDateOfPublication {
	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String year;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String month;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String day;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String season;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationDateOfPublicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationDateOfPublication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(org.hl7.fhir.String newYear, NotificationChain msgs) {
		org.hl7.fhir.String oldYear = year;
		year = newYear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__YEAR, oldYear, newYear);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(org.hl7.fhir.String newYear) {
		if (newYear != year) {
			NotificationChain msgs = null;
			if (year != null)
				msgs = ((InternalEObject)year).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__YEAR, null, msgs);
			if (newYear != null)
				msgs = ((InternalEObject)newYear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__YEAR, null, msgs);
			msgs = basicSetYear(newYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__YEAR, newYear, newYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonth(org.hl7.fhir.String newMonth, NotificationChain msgs) {
		org.hl7.fhir.String oldMonth = month;
		month = newMonth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__MONTH, oldMonth, newMonth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(org.hl7.fhir.String newMonth) {
		if (newMonth != month) {
			NotificationChain msgs = null;
			if (month != null)
				msgs = ((InternalEObject)month).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__MONTH, null, msgs);
			if (newMonth != null)
				msgs = ((InternalEObject)newMonth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__MONTH, null, msgs);
			msgs = basicSetMonth(newMonth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__MONTH, newMonth, newMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDay(org.hl7.fhir.String newDay, NotificationChain msgs) {
		org.hl7.fhir.String oldDay = day;
		day = newDay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__DAY, oldDay, newDay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(org.hl7.fhir.String newDay) {
		if (newDay != day) {
			NotificationChain msgs = null;
			if (day != null)
				msgs = ((InternalEObject)day).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__DAY, null, msgs);
			if (newDay != null)
				msgs = ((InternalEObject)newDay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__DAY, null, msgs);
			msgs = basicSetDay(newDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__DAY, newDay, newDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(org.hl7.fhir.String newSeason, NotificationChain msgs) {
		org.hl7.fhir.String oldSeason = season;
		season = newSeason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__SEASON, oldSeason, newSeason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(org.hl7.fhir.String newSeason) {
		if (newSeason != season) {
			NotificationChain msgs = null;
			if (season != null)
				msgs = ((InternalEObject)season).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__SEASON, null, msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__SEASON, null, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__SEASON, newSeason, newSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_DATE_OF_PUBLICATION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_DATE_OF_PUBLICATION__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__YEAR:
				return basicSetYear(null, msgs);
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__MONTH:
				return basicSetMonth(null, msgs);
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__DAY:
				return basicSetDay(null, msgs);
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__SEASON:
				return basicSetSeason(null, msgs);
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__TEXT:
				return basicSetText(null, msgs);
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
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__DATE:
				return getDate();
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__YEAR:
				return getYear();
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__MONTH:
				return getMonth();
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__DAY:
				return getDay();
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__SEASON:
				return getSeason();
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__TEXT:
				return getText();
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
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__DATE:
				setDate((Date)newValue);
				return;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__YEAR:
				setYear((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__MONTH:
				setMonth((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__DAY:
				setDay((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__SEASON:
				setSeason((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__TEXT:
				setText((org.hl7.fhir.String)newValue);
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
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__DATE:
				setDate((Date)null);
				return;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__YEAR:
				setYear((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__MONTH:
				setMonth((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__DAY:
				setDay((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__SEASON:
				setSeason((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__TEXT:
				setText((org.hl7.fhir.String)null);
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
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__DATE:
				return date != null;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__YEAR:
				return year != null;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__MONTH:
				return month != null;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__DAY:
				return day != null;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__SEASON:
				return season != null;
			case FhirPackage.CITATION_DATE_OF_PUBLICATION__TEXT:
				return text != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationDateOfPublicationImpl

/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guide Parameter Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.GuideParameterCode#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGuideParameterCode()
 * @model extendedMetaData="name='GuideParameterCode' kind='elementOnly'"
 * @generated
 */
public interface GuideParameterCode extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.GuideParameterCodeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.GuideParameterCodeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(GuideParameterCodeEnum)
	 * @see org.hl7.fhir.FhirPackage#getGuideParameterCode_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	GuideParameterCodeEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuideParameterCode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.GuideParameterCodeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(GuideParameterCodeEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.GuideParameterCode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(GuideParameterCodeEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.GuideParameterCode#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(GuideParameterCodeEnum)
	 * @generated
	 */
	boolean isSetValue();

} // GuideParameterCode

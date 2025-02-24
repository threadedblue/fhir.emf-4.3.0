/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient Strength</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ingredient of a manufactured item or pharmaceutical product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.IngredientStrength#getPresentationRatio <em>Presentation Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientStrength#getPresentationRatioRange <em>Presentation Ratio Range</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientStrength#getTextPresentation <em>Text Presentation</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientStrength#getConcentrationRatio <em>Concentration Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientStrength#getConcentrationRatioRange <em>Concentration Ratio Range</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientStrength#getTextConcentration <em>Text Concentration</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientStrength#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientStrength#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.fhir.IngredientStrength#getReferenceStrength <em>Reference Strength</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getIngredientStrength()
 * @model extendedMetaData="name='Ingredient.Strength' kind='elementOnly'"
 * @generated
 */
public interface IngredientStrength extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Presentation Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item. Unit of presentation refers to the quantity that the item occurs in e.g. a strength per tablet size, perhaps 'per 20mg' (the size of the tablet). It is not generally normalized as a unitary unit, which would be 'per mg'). (choose any one of presentation*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presentation Ratio</em>' containment reference.
	 * @see #setPresentationRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getIngredientStrength_PresentationRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='presentationRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getPresentationRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientStrength#getPresentationRatio <em>Presentation Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Ratio</em>' containment reference.
	 * @see #getPresentationRatio()
	 * @generated
	 */
	void setPresentationRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Presentation Ratio Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item. Unit of presentation refers to the quantity that the item occurs in e.g. a strength per tablet size, perhaps 'per 20mg' (the size of the tablet). It is not generally normalized as a unitary unit, which would be 'per mg'). (choose any one of presentation*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presentation Ratio Range</em>' containment reference.
	 * @see #setPresentationRatioRange(RatioRange)
	 * @see org.hl7.fhir.FhirPackage#getIngredientStrength_PresentationRatioRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='presentationRatioRange' namespace='##targetNamespace'"
	 * @generated
	 */
	RatioRange getPresentationRatioRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientStrength#getPresentationRatioRange <em>Presentation Ratio Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Ratio Range</em>' containment reference.
	 * @see #getPresentationRatioRange()
	 * @generated
	 */
	void setPresentationRatioRange(RatioRange value);

	/**
	 * Returns the value of the '<em><b>Text Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual represention of either the whole of the presentation strength or a part of it - with the rest being in Strength.presentation as a ratio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Presentation</em>' containment reference.
	 * @see #setTextPresentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getIngredientStrength_TextPresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textPresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTextPresentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientStrength#getTextPresentation <em>Text Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Presentation</em>' containment reference.
	 * @see #getTextPresentation()
	 * @generated
	 */
	void setTextPresentation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Concentration Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The strength per unitary volume (or mass). (choose any one of concentration*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concentration Ratio</em>' containment reference.
	 * @see #setConcentrationRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getIngredientStrength_ConcentrationRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concentrationRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getConcentrationRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientStrength#getConcentrationRatio <em>Concentration Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentration Ratio</em>' containment reference.
	 * @see #getConcentrationRatio()
	 * @generated
	 */
	void setConcentrationRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Concentration Ratio Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The strength per unitary volume (or mass). (choose any one of concentration*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concentration Ratio Range</em>' containment reference.
	 * @see #setConcentrationRatioRange(RatioRange)
	 * @see org.hl7.fhir.FhirPackage#getIngredientStrength_ConcentrationRatioRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concentrationRatioRange' namespace='##targetNamespace'"
	 * @generated
	 */
	RatioRange getConcentrationRatioRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientStrength#getConcentrationRatioRange <em>Concentration Ratio Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentration Ratio Range</em>' containment reference.
	 * @see #getConcentrationRatioRange()
	 * @generated
	 */
	void setConcentrationRatioRange(RatioRange value);

	/**
	 * Returns the value of the '<em><b>Text Concentration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual represention of either the whole of the concentration strength or a part of it - with the rest being in Strength.concentration as a ratio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Concentration</em>' containment reference.
	 * @see #setTextConcentration(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getIngredientStrength_TextConcentration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textConcentration' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTextConcentration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientStrength#getTextConcentration <em>Text Concentration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Concentration</em>' containment reference.
	 * @see #getTextConcentration()
	 * @generated
	 */
	void setTextConcentration(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Measurement Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For when strength is measured at a particular point or distance. There are products where strength is measured at a particular point. For example, the strength of the ingredient in some inhalers is measured at a particular position relative to the point of aerosolization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Point</em>' containment reference.
	 * @see #setMeasurementPoint(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getIngredientStrength_MeasurementPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measurementPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMeasurementPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.IngredientStrength#getMeasurementPoint <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Point</em>' containment reference.
	 * @see #getMeasurementPoint()
	 * @generated
	 */
	void setMeasurementPoint(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The country or countries for which the strength range applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getIngredientStrength_Country()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCountry();

	/**
	 * Returns the value of the '<em><b>Reference Strength</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.IngredientReferenceStrength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strength expressed in terms of a reference substance. For when the ingredient strength is additionally expressed as equivalent to the strength of some other closely related substance (e.g. salt vs. base). Reference strength represents the strength (quantitative composition) of the active moiety of the active substance. There are situations when the active substance and active moiety are different, therefore both a strength and a reference strength are needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Strength</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getIngredientStrength_ReferenceStrength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceStrength' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IngredientReferenceStrength> getReferenceStrength();

} // IngredientStrength

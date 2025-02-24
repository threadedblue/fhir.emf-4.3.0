/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Variable Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionExpression <em>Definition Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getTimeFromStart <em>Time From Start</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getGroupMeasure <em>Group Measure</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic()
 * @model extendedMetaData="name='EvidenceVariable.Characteristic' kind='elementOnly'"
 * @generated
 */
public interface EvidenceVariableCharacteristic extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Reference</em>' containment reference.
	 * @see #setDefinitionReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDefinitionReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionReference <em>Definition Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Reference</em>' containment reference.
	 * @see #getDefinitionReference()
	 * @generated
	 */
	void setDefinitionReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Definition Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #setDefinitionCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getDefinitionCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCanonical <em>Definition Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #getDefinitionCanonical()
	 * @generated
	 */
	void setDefinitionCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Definition Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Codeable Concept</em>' containment reference.
	 * @see #setDefinitionCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDefinitionCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Codeable Concept</em>' containment reference.
	 * @see #getDefinitionCodeableConcept()
	 * @generated
	 */
	void setDefinitionCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Definition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Expression</em>' containment reference.
	 * @see #setDefinitionExpression(Expression)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getDefinitionExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionExpression <em>Definition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Expression</em>' containment reference.
	 * @see #getDefinitionExpression()
	 * @generated
	 */
	void setDefinitionExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method used for describing characteristic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device used for determining characteristic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When true, members with this characteristic are excluded from the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference.
	 * @see #setExclude(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_Exclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExclude();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getExclude <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' containment reference.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Time From Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates duration, period, or point of observation from the participant's study entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time From Start</em>' containment reference.
	 * @see #setTimeFromStart(EvidenceVariableTimeFromStart)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_TimeFromStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeFromStart' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceVariableTimeFromStart getTimeFromStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getTimeFromStart <em>Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time From Start</em>' containment reference.
	 * @see #getTimeFromStart()
	 * @generated
	 */
	void setTimeFromStart(EvidenceVariableTimeFromStart value);

	/**
	 * Returns the value of the '<em><b>Group Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how elements are aggregated within the study effective period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Measure</em>' containment reference.
	 * @see #setGroupMeasure(GroupMeasure)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_GroupMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupMeasure getGroupMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getGroupMeasure <em>Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Measure</em>' containment reference.
	 * @see #getGroupMeasure()
	 * @generated
	 */
	void setGroupMeasure(GroupMeasure value);

} // EvidenceVariableCharacteristic

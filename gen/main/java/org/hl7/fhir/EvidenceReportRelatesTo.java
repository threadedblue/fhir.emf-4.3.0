/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Report Relates To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EvidenceReport Resource is a specialized container for a collection of resources and codable concepts, adapted to support compositions of Evidence, EvidenceVariable, and Citation resources and related concepts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EvidenceReportRelatesTo#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReportRelatesTo#getTargetIdentifier <em>Target Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceReportRelatesTo#getTargetReference <em>Target Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEvidenceReportRelatesTo()
 * @model extendedMetaData="name='EvidenceReport.RelatesTo' kind='elementOnly'"
 * @generated
 */
public interface EvidenceReportRelatesTo extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of relationship that this composition has with anther composition or document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(ReportRelationshipType)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReportRelatesTo_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportRelationshipType getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceReportRelatesTo#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(ReportRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Target Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target composition/document of this relationship. (choose any one of target*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Identifier</em>' containment reference.
	 * @see #setTargetIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReportRelatesTo_TargetIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getTargetIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceReportRelatesTo#getTargetIdentifier <em>Target Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Identifier</em>' containment reference.
	 * @see #getTargetIdentifier()
	 * @generated
	 */
	void setTargetIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Target Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target composition/document of this relationship. (choose any one of target*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Reference</em>' containment reference.
	 * @see #setTargetReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceReportRelatesTo_TargetReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTargetReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceReportRelatesTo#getTargetReference <em>Target Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Reference</em>' containment reference.
	 * @see #getTargetReference()
	 * @generated
	 */
	void setTargetReference(Reference value);

} // EvidenceReportRelatesTo

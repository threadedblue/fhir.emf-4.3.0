/**
 */
package org.hl7.fhir;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Or Request Resource Types Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getEventOrRequestResourceTypesEnum()
 * @model extendedMetaData="name='EventOrRequestResourceTypesEnum'"
 * @generated
 */
public enum EventOrRequestResourceTypesEnum implements Enumerator {
	/**
	 * The '<em><b>Charge Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItem
	 * <!-- end-model-doc -->
	 * @see #CHARGE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGE_ITEM(0, "ChargeItem", "ChargeItem"),

	/**
	 * The '<em><b>Claim Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClaimResponse
	 * <!-- end-model-doc -->
	 * @see #CLAIM_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM_RESPONSE(1, "ClaimResponse", "ClaimResponse"),

	/**
	 * The '<em><b>Clinical Impression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClinicalImpression
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_IMPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL_IMPRESSION(2, "ClinicalImpression", "ClinicalImpression"),

	/**
	 * The '<em><b>Communication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Communication
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION(3, "Communication", "Communication"),

	/**
	 * The '<em><b>Composition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Composition
	 * <!-- end-model-doc -->
	 * @see #COMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION(4, "Composition", "Composition"),

	/**
	 * The '<em><b>Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition
	 * <!-- end-model-doc -->
	 * @see #CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITION(5, "Condition", "Condition"),

	/**
	 * The '<em><b>Consent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consent
	 * <!-- end-model-doc -->
	 * @see #CONSENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENT(6, "Consent", "Consent"),

	/**
	 * The '<em><b>Coverage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage
	 * <!-- end-model-doc -->
	 * @see #COVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGE(7, "Coverage", "Coverage"),

	/**
	 * The '<em><b>Device Use Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceUseStatement
	 * <!-- end-model-doc -->
	 * @see #DEVICE_USE_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_USE_STATEMENT(8, "DeviceUseStatement", "DeviceUseStatement"),

	/**
	 * The '<em><b>Diagnostic Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DiagnosticReport
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTIC_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTIC_REPORT(9, "DiagnosticReport", "DiagnosticReport"),

	/**
	 * The '<em><b>Document Manifest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentManifest
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_MANIFEST_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_MANIFEST(10, "DocumentManifest", "DocumentManifest"),

	/**
	 * The '<em><b>Document Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentReference
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_REFERENCE(11, "DocumentReference", "DocumentReference"),

	/**
	 * The '<em><b>Encounter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENCOUNTER(12, "Encounter", "Encounter"),

	/**
	 * The '<em><b>Enrollment Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentResponse
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	ENROLLMENT_RESPONSE(13, "EnrollmentResponse", "EnrollmentResponse"),

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EpisodeOfCare
	 * <!-- end-model-doc -->
	 * @see #EPISODE_OF_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	EPISODE_OF_CARE(14, "EpisodeOfCare", "EpisodeOfCare"),

	/**
	 * The '<em><b>Explanation Of Benefit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExplanationOfBenefit
	 * <!-- end-model-doc -->
	 * @see #EXPLANATION_OF_BENEFIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLANATION_OF_BENEFIT(15, "ExplanationOfBenefit", "ExplanationOfBenefit"),

	/**
	 * The '<em><b>Family Member History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FamilyMemberHistory
	 * <!-- end-model-doc -->
	 * @see #FAMILY_MEMBER_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY_MEMBER_HISTORY(16, "FamilyMemberHistory", "FamilyMemberHistory"),

	/**
	 * The '<em><b>Guidance Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GuidanceResponse
	 * <!-- end-model-doc -->
	 * @see #GUIDANCE_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	GUIDANCE_RESPONSE(17, "GuidanceResponse", "GuidanceResponse"),

	/**
	 * The '<em><b>Imaging Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingStudy
	 * <!-- end-model-doc -->
	 * @see #IMAGING_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGING_STUDY(18, "ImagingStudy", "ImagingStudy"),

	/**
	 * The '<em><b>Immunization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immunization
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION(19, "Immunization", "Immunization"),

	/**
	 * The '<em><b>Measure Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MeasureReport
	 * <!-- end-model-doc -->
	 * @see #MEASURE_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE_REPORT(20, "MeasureReport", "MeasureReport"),

	/**
	 * The '<em><b>Media</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Media
	 * <!-- end-model-doc -->
	 * @see #MEDIA_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIA(21, "Media", "Media"),

	/**
	 * The '<em><b>Medication Administration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationAdministration
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ADMINISTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION(22, "MedicationAdministration", "MedicationAdministration"),

	/**
	 * The '<em><b>Medication Dispense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationDispense
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_DISPENSE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_DISPENSE(23, "MedicationDispense", "MedicationDispense"),

	/**
	 * The '<em><b>Medication Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationStatement
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_STATEMENT(24, "MedicationStatement", "MedicationStatement"),

	/**
	 * The '<em><b>Observation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Observation
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION(25, "Observation", "Observation"),

	/**
	 * The '<em><b>Payment Notice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentNotice
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_NOTICE_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_NOTICE(26, "PaymentNotice", "PaymentNotice"),

	/**
	 * The '<em><b>Payment Reconciliation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentReconciliation
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_RECONCILIATION_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_RECONCILIATION(27, "PaymentReconciliation", "PaymentReconciliation"),

	/**
	 * The '<em><b>Procedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedure
	 * <!-- end-model-doc -->
	 * @see #PROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE(28, "Procedure", "Procedure"),

	/**
	 * The '<em><b>Process Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProcessResponse
	 * <!-- end-model-doc -->
	 * @see #PROCESS_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS_RESPONSE(29, "ProcessResponse", "ProcessResponse"),

	/**
	 * The '<em><b>Questionnaire Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QuestionnaireResponse
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONNAIRE_RESPONSE(30, "QuestionnaireResponse", "QuestionnaireResponse"),

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RiskAssessment
	 * <!-- end-model-doc -->
	 * @see #RISK_ASSESSMENT_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_ASSESSMENT(31, "RiskAssessment", "RiskAssessment"),

	/**
	 * The '<em><b>Supply Delivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyDelivery
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_DELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY_DELIVERY(32, "SupplyDelivery", "SupplyDelivery"),

	/**
	 * The '<em><b>Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Task
	 * <!-- end-model-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(33, "Task", "Task"),

	/**
	 * The '<em><b>Appointment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appointment
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT_VALUE
	 * @generated
	 * @ordered
	 */
	APPOINTMENT(34, "Appointment", "Appointment"),

	/**
	 * The '<em><b>Appointment Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AppointmentResponse
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	APPOINTMENT_RESPONSE(35, "AppointmentResponse", "AppointmentResponse"),

	/**
	 * The '<em><b>Care Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CarePlan
	 * <!-- end-model-doc -->
	 * @see #CARE_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	CARE_PLAN(36, "CarePlan", "CarePlan"),

	/**
	 * The '<em><b>Claim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Claim
	 * <!-- end-model-doc -->
	 * @see #CLAIM_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM(37, "Claim", "Claim"),

	/**
	 * The '<em><b>Communication Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationRequest
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_REQUEST(38, "CommunicationRequest", "CommunicationRequest"),

	/**
	 * The '<em><b>Contract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract
	 * <!-- end-model-doc -->
	 * @see #CONTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT(39, "Contract", "Contract"),

	/**
	 * The '<em><b>Device Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceRequest
	 * <!-- end-model-doc -->
	 * @see #DEVICE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_REQUEST(40, "DeviceRequest", "DeviceRequest"),

	/**
	 * The '<em><b>Enrollment Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentRequest
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ENROLLMENT_REQUEST(41, "EnrollmentRequest", "EnrollmentRequest"),

	/**
	 * The '<em><b>Immunization Recommendation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationRecommendation
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_RECOMMENDATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION_RECOMMENDATION(42, "ImmunizationRecommendation", "ImmunizationRecommendation"),

	/**
	 * The '<em><b>Medication Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationRequest
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_REQUEST(43, "MedicationRequest", "MedicationRequest"),

	/**
	 * The '<em><b>Nutrition Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionOrder
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	NUTRITION_ORDER(44, "NutritionOrder", "NutritionOrder"),

	/**
	 * The '<em><b>Service Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServiceRequest
	 * <!-- end-model-doc -->
	 * @see #SERVICE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_REQUEST(45, "ServiceRequest", "ServiceRequest"),

	/**
	 * The '<em><b>Supply Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyRequest
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY_REQUEST(46, "SupplyRequest", "SupplyRequest"),

	/**
	 * The '<em><b>Vision Prescription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VisionPrescription
	 * <!-- end-model-doc -->
	 * @see #VISION_PRESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	VISION_PRESCRIPTION(48, "VisionPrescription", "VisionPrescription");

	/**
	 * The '<em><b>Charge Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItem
	 * <!-- end-model-doc -->
	 * @see #CHARGE_ITEM
	 * @model name="ChargeItem"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_ITEM_VALUE = 0;

	/**
	 * The '<em><b>Claim Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClaimResponse
	 * <!-- end-model-doc -->
	 * @see #CLAIM_RESPONSE
	 * @model name="ClaimResponse"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_RESPONSE_VALUE = 1;

	/**
	 * The '<em><b>Clinical Impression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClinicalImpression
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_IMPRESSION
	 * @model name="ClinicalImpression"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_IMPRESSION_VALUE = 2;

	/**
	 * The '<em><b>Communication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Communication
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION
	 * @model name="Communication"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_VALUE = 3;

	/**
	 * The '<em><b>Composition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Composition
	 * <!-- end-model-doc -->
	 * @see #COMPOSITION
	 * @model name="Composition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_VALUE = 4;

	/**
	 * The '<em><b>Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition
	 * <!-- end-model-doc -->
	 * @see #CONDITION
	 * @model name="Condition"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_VALUE = 5;

	/**
	 * The '<em><b>Consent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consent
	 * <!-- end-model-doc -->
	 * @see #CONSENT
	 * @model name="Consent"
	 * @generated
	 * @ordered
	 */
	public static final int CONSENT_VALUE = 6;

	/**
	 * The '<em><b>Coverage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage
	 * <!-- end-model-doc -->
	 * @see #COVERAGE
	 * @model name="Coverage"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGE_VALUE = 7;

	/**
	 * The '<em><b>Device Use Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceUseStatement
	 * <!-- end-model-doc -->
	 * @see #DEVICE_USE_STATEMENT
	 * @model name="DeviceUseStatement"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_USE_STATEMENT_VALUE = 8;

	/**
	 * The '<em><b>Diagnostic Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DiagnosticReport
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTIC_REPORT
	 * @model name="DiagnosticReport"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTIC_REPORT_VALUE = 9;

	/**
	 * The '<em><b>Document Manifest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentManifest
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_MANIFEST
	 * @model name="DocumentManifest"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_MANIFEST_VALUE = 10;

	/**
	 * The '<em><b>Document Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentReference
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_REFERENCE
	 * @model name="DocumentReference"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_REFERENCE_VALUE = 11;

	/**
	 * The '<em><b>Encounter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER
	 * @model name="Encounter"
	 * @generated
	 * @ordered
	 */
	public static final int ENCOUNTER_VALUE = 12;

	/**
	 * The '<em><b>Enrollment Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentResponse
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_RESPONSE
	 * @model name="EnrollmentResponse"
	 * @generated
	 * @ordered
	 */
	public static final int ENROLLMENT_RESPONSE_VALUE = 13;

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EpisodeOfCare
	 * <!-- end-model-doc -->
	 * @see #EPISODE_OF_CARE
	 * @model name="EpisodeOfCare"
	 * @generated
	 * @ordered
	 */
	public static final int EPISODE_OF_CARE_VALUE = 14;

	/**
	 * The '<em><b>Explanation Of Benefit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExplanationOfBenefit
	 * <!-- end-model-doc -->
	 * @see #EXPLANATION_OF_BENEFIT
	 * @model name="ExplanationOfBenefit"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLANATION_OF_BENEFIT_VALUE = 15;

	/**
	 * The '<em><b>Family Member History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FamilyMemberHistory
	 * <!-- end-model-doc -->
	 * @see #FAMILY_MEMBER_HISTORY
	 * @model name="FamilyMemberHistory"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_MEMBER_HISTORY_VALUE = 16;

	/**
	 * The '<em><b>Guidance Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GuidanceResponse
	 * <!-- end-model-doc -->
	 * @see #GUIDANCE_RESPONSE
	 * @model name="GuidanceResponse"
	 * @generated
	 * @ordered
	 */
	public static final int GUIDANCE_RESPONSE_VALUE = 17;

	/**
	 * The '<em><b>Imaging Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingStudy
	 * <!-- end-model-doc -->
	 * @see #IMAGING_STUDY
	 * @model name="ImagingStudy"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGING_STUDY_VALUE = 18;

	/**
	 * The '<em><b>Immunization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immunization
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION
	 * @model name="Immunization"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_VALUE = 19;

	/**
	 * The '<em><b>Measure Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MeasureReport
	 * <!-- end-model-doc -->
	 * @see #MEASURE_REPORT
	 * @model name="MeasureReport"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_REPORT_VALUE = 20;

	/**
	 * The '<em><b>Media</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Media
	 * <!-- end-model-doc -->
	 * @see #MEDIA
	 * @model name="Media"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIA_VALUE = 21;

	/**
	 * The '<em><b>Medication Administration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationAdministration
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ADMINISTRATION
	 * @model name="MedicationAdministration"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_VALUE = 22;

	/**
	 * The '<em><b>Medication Dispense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationDispense
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_DISPENSE
	 * @model name="MedicationDispense"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_DISPENSE_VALUE = 23;

	/**
	 * The '<em><b>Medication Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationStatement
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_STATEMENT
	 * @model name="MedicationStatement"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_STATEMENT_VALUE = 24;

	/**
	 * The '<em><b>Observation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Observation
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION
	 * @model name="Observation"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_VALUE = 25;

	/**
	 * The '<em><b>Payment Notice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentNotice
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_NOTICE
	 * @model name="PaymentNotice"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_NOTICE_VALUE = 26;

	/**
	 * The '<em><b>Payment Reconciliation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentReconciliation
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_RECONCILIATION
	 * @model name="PaymentReconciliation"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_RECONCILIATION_VALUE = 27;

	/**
	 * The '<em><b>Procedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedure
	 * <!-- end-model-doc -->
	 * @see #PROCEDURE
	 * @model name="Procedure"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_VALUE = 28;

	/**
	 * The '<em><b>Process Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProcessResponse
	 * <!-- end-model-doc -->
	 * @see #PROCESS_RESPONSE
	 * @model name="ProcessResponse"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_RESPONSE_VALUE = 29;

	/**
	 * The '<em><b>Questionnaire Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QuestionnaireResponse
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE_RESPONSE
	 * @model name="QuestionnaireResponse"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONNAIRE_RESPONSE_VALUE = 30;

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RiskAssessment
	 * <!-- end-model-doc -->
	 * @see #RISK_ASSESSMENT
	 * @model name="RiskAssessment"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_ASSESSMENT_VALUE = 31;

	/**
	 * The '<em><b>Supply Delivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyDelivery
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_DELIVERY
	 * @model name="SupplyDelivery"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_DELIVERY_VALUE = 32;

	/**
	 * The '<em><b>Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Task
	 * <!-- end-model-doc -->
	 * @see #TASK
	 * @model name="Task"
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 33;

	/**
	 * The '<em><b>Appointment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appointment
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT
	 * @model name="Appointment"
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_VALUE = 34;

	/**
	 * The '<em><b>Appointment Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AppointmentResponse
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT_RESPONSE
	 * @model name="AppointmentResponse"
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_RESPONSE_VALUE = 35;

	/**
	 * The '<em><b>Care Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CarePlan
	 * <!-- end-model-doc -->
	 * @see #CARE_PLAN
	 * @model name="CarePlan"
	 * @generated
	 * @ordered
	 */
	public static final int CARE_PLAN_VALUE = 36;

	/**
	 * The '<em><b>Claim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Claim
	 * <!-- end-model-doc -->
	 * @see #CLAIM
	 * @model name="Claim"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_VALUE = 37;

	/**
	 * The '<em><b>Communication Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationRequest
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_REQUEST
	 * @model name="CommunicationRequest"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_REQUEST_VALUE = 38;

	/**
	 * The '<em><b>Contract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract
	 * <!-- end-model-doc -->
	 * @see #CONTRACT
	 * @model name="Contract"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_VALUE = 39;

	/**
	 * The '<em><b>Device Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceRequest
	 * <!-- end-model-doc -->
	 * @see #DEVICE_REQUEST
	 * @model name="DeviceRequest"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_REQUEST_VALUE = 40;

	/**
	 * The '<em><b>Enrollment Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentRequest
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_REQUEST
	 * @model name="EnrollmentRequest"
	 * @generated
	 * @ordered
	 */
	public static final int ENROLLMENT_REQUEST_VALUE = 41;

	/**
	 * The '<em><b>Immunization Recommendation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationRecommendation
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_RECOMMENDATION
	 * @model name="ImmunizationRecommendation"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_RECOMMENDATION_VALUE = 42;

	/**
	 * The '<em><b>Medication Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationRequest
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_REQUEST
	 * @model name="MedicationRequest"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_REQUEST_VALUE = 43;

	/**
	 * The '<em><b>Nutrition Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionOrder
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_ORDER
	 * @model name="NutritionOrder"
	 * @generated
	 * @ordered
	 */
	public static final int NUTRITION_ORDER_VALUE = 44;

	/**
	 * The '<em><b>Service Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServiceRequest
	 * <!-- end-model-doc -->
	 * @see #SERVICE_REQUEST
	 * @model name="ServiceRequest"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REQUEST_VALUE = 45;

	/**
	 * The '<em><b>Supply Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyRequest
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_REQUEST
	 * @model name="SupplyRequest"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_REQUEST_VALUE = 46;

	/**
	 * The '<em><b>Vision Prescription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VisionPrescription
	 * <!-- end-model-doc -->
	 * @see #VISION_PRESCRIPTION
	 * @model name="VisionPrescription"
	 * @generated
	 * @ordered
	 */
	public static final int VISION_PRESCRIPTION_VALUE = 48;

	/**
	 * An array of all the '<em><b>Event Or Request Resource Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventOrRequestResourceTypesEnum[] VALUES_ARRAY =
		new EventOrRequestResourceTypesEnum[] {
			CHARGE_ITEM,
			CLAIM_RESPONSE,
			CLINICAL_IMPRESSION,
			COMMUNICATION,
			COMPOSITION,
			CONDITION,
			CONSENT,
			COVERAGE,
			DEVICE_USE_STATEMENT,
			DIAGNOSTIC_REPORT,
			DOCUMENT_MANIFEST,
			DOCUMENT_REFERENCE,
			ENCOUNTER,
			ENROLLMENT_RESPONSE,
			EPISODE_OF_CARE,
			EXPLANATION_OF_BENEFIT,
			FAMILY_MEMBER_HISTORY,
			GUIDANCE_RESPONSE,
			IMAGING_STUDY,
			IMMUNIZATION,
			MEASURE_REPORT,
			MEDIA,
			MEDICATION_ADMINISTRATION,
			MEDICATION_DISPENSE,
			MEDICATION_STATEMENT,
			OBSERVATION,
			PAYMENT_NOTICE,
			PAYMENT_RECONCILIATION,
			PROCEDURE,
			PROCESS_RESPONSE,
			QUESTIONNAIRE_RESPONSE,
			RISK_ASSESSMENT,
			SUPPLY_DELIVERY,
			TASK,
			APPOINTMENT,
			APPOINTMENT_RESPONSE,
			CARE_PLAN,
			CLAIM,
			COMMUNICATION_REQUEST,
			CONTRACT,
			DEVICE_REQUEST,
			ENROLLMENT_REQUEST,
			IMMUNIZATION_RECOMMENDATION,
			MEDICATION_REQUEST,
			NUTRITION_ORDER,
			SERVICE_REQUEST,
			SUPPLY_REQUEST,
			VISION_PRESCRIPTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Or Request Resource Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventOrRequestResourceTypesEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Or Request Resource Types Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventOrRequestResourceTypesEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventOrRequestResourceTypesEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Or Request Resource Types Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventOrRequestResourceTypesEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventOrRequestResourceTypesEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Or Request Resource Types Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventOrRequestResourceTypesEnum get(int value) {
		switch (value) {
			case CHARGE_ITEM_VALUE: return CHARGE_ITEM;
			case CLAIM_RESPONSE_VALUE: return CLAIM_RESPONSE;
			case CLINICAL_IMPRESSION_VALUE: return CLINICAL_IMPRESSION;
			case COMMUNICATION_VALUE: return COMMUNICATION;
			case COMPOSITION_VALUE: return COMPOSITION;
			case CONDITION_VALUE: return CONDITION;
			case CONSENT_VALUE: return CONSENT;
			case COVERAGE_VALUE: return COVERAGE;
			case DEVICE_USE_STATEMENT_VALUE: return DEVICE_USE_STATEMENT;
			case DIAGNOSTIC_REPORT_VALUE: return DIAGNOSTIC_REPORT;
			case DOCUMENT_MANIFEST_VALUE: return DOCUMENT_MANIFEST;
			case DOCUMENT_REFERENCE_VALUE: return DOCUMENT_REFERENCE;
			case ENCOUNTER_VALUE: return ENCOUNTER;
			case ENROLLMENT_RESPONSE_VALUE: return ENROLLMENT_RESPONSE;
			case EPISODE_OF_CARE_VALUE: return EPISODE_OF_CARE;
			case EXPLANATION_OF_BENEFIT_VALUE: return EXPLANATION_OF_BENEFIT;
			case FAMILY_MEMBER_HISTORY_VALUE: return FAMILY_MEMBER_HISTORY;
			case GUIDANCE_RESPONSE_VALUE: return GUIDANCE_RESPONSE;
			case IMAGING_STUDY_VALUE: return IMAGING_STUDY;
			case IMMUNIZATION_VALUE: return IMMUNIZATION;
			case MEASURE_REPORT_VALUE: return MEASURE_REPORT;
			case MEDIA_VALUE: return MEDIA;
			case MEDICATION_ADMINISTRATION_VALUE: return MEDICATION_ADMINISTRATION;
			case MEDICATION_DISPENSE_VALUE: return MEDICATION_DISPENSE;
			case MEDICATION_STATEMENT_VALUE: return MEDICATION_STATEMENT;
			case OBSERVATION_VALUE: return OBSERVATION;
			case PAYMENT_NOTICE_VALUE: return PAYMENT_NOTICE;
			case PAYMENT_RECONCILIATION_VALUE: return PAYMENT_RECONCILIATION;
			case PROCEDURE_VALUE: return PROCEDURE;
			case PROCESS_RESPONSE_VALUE: return PROCESS_RESPONSE;
			case QUESTIONNAIRE_RESPONSE_VALUE: return QUESTIONNAIRE_RESPONSE;
			case RISK_ASSESSMENT_VALUE: return RISK_ASSESSMENT;
			case SUPPLY_DELIVERY_VALUE: return SUPPLY_DELIVERY;
			case TASK_VALUE: return TASK;
			case APPOINTMENT_VALUE: return APPOINTMENT;
			case APPOINTMENT_RESPONSE_VALUE: return APPOINTMENT_RESPONSE;
			case CARE_PLAN_VALUE: return CARE_PLAN;
			case CLAIM_VALUE: return CLAIM;
			case COMMUNICATION_REQUEST_VALUE: return COMMUNICATION_REQUEST;
			case CONTRACT_VALUE: return CONTRACT;
			case DEVICE_REQUEST_VALUE: return DEVICE_REQUEST;
			case ENROLLMENT_REQUEST_VALUE: return ENROLLMENT_REQUEST;
			case IMMUNIZATION_RECOMMENDATION_VALUE: return IMMUNIZATION_RECOMMENDATION;
			case MEDICATION_REQUEST_VALUE: return MEDICATION_REQUEST;
			case NUTRITION_ORDER_VALUE: return NUTRITION_ORDER;
			case SERVICE_REQUEST_VALUE: return SERVICE_REQUEST;
			case SUPPLY_REQUEST_VALUE: return SUPPLY_REQUEST;
			case VISION_PRESCRIPTION_VALUE: return VISION_PRESCRIPTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EventOrRequestResourceTypesEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EventOrRequestResourceTypesEnum

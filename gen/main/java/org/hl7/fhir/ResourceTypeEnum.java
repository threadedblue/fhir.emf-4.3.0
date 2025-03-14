/**
 */
package org.hl7.fhir;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getResourceTypeEnum()
 * @model extendedMetaData="name='ResourceTypeEnum'"
 * @generated
 */
public enum ResourceTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource
	 * Recurso
	 * 资源
	 * <!-- end-model-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(0, "Resource", "Resource"),

	/**
	 * The '<em><b>Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binary
	 * Binario
	 * Binaire
	 * Binario
	 * 二进制资源
	 * <!-- end-model-doc -->
	 * @see #BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY(1, "Binary", "Binary"),

	/**
	 * The '<em><b>Bundle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bundle
	 * Paquet
	 * Paquete
	 * 捆束
	 * <!-- end-model-doc -->
	 * @see #BUNDLE_VALUE
	 * @generated
	 * @ordered
	 */
	BUNDLE(2, "Bundle", "Bundle"),

	/**
	 * The '<em><b>Domain Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DomainResource
	 * RecursoDeDominio
	 * 领域资源
	 * <!-- end-model-doc -->
	 * @see #DOMAIN_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN_RESOURCE(3, "DomainResource", "DomainResource"),

	/**
	 * The '<em><b>Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Account
	 * Cuenta
	 * 账户
	 * <!-- end-model-doc -->
	 * @see #ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNT(4, "Account", "Account"),

	/**
	 * The '<em><b>Activity Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityDefinition
	 * DefinizioneAttivita
	 * DefinicionDeActividad
	 * 活动定义
	 * <!-- end-model-doc -->
	 * @see #ACTIVITY_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVITY_DEFINITION(5, "ActivityDefinition", "ActivityDefinition"),

	/**
	 * The '<em><b>Administrable Product Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdministrableProductDefinition
	 * <!-- end-model-doc -->
	 * @see #ADMINISTRABLE_PRODUCT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRABLE_PRODUCT_DEFINITION(6, "AdministrableProductDefinition", "AdministrableProductDefinition"),

	/**
	 * The '<em><b>Adverse Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent
	 * EventoAvverso
	 * EventoAdverso
	 * 不良事件
	 * <!-- end-model-doc -->
	 * @see #ADVERSE_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	ADVERSE_EVENT(7, "AdverseEvent", "AdverseEvent"),

	/**
	 * The '<em><b>Allergy Intolerance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AllergyIntolerance
	 * AllergiaIntolleranza
	 * IntoléranceAllergique
	 * AllergiaIntolerancia
	 * 变态反应与不耐性
	 * <!-- end-model-doc -->
	 * @see #ALLERGY_INTOLERANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ALLERGY_INTOLERANCE(8, "AllergyIntolerance", "AllergyIntolerance"),

	/**
	 * The '<em><b>Appointment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appointment
	 * Appuntamento
	 * RendezVous
	 * Cita
	 * 预约
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT_VALUE
	 * @generated
	 * @ordered
	 */
	APPOINTMENT(9, "Appointment", "Appointment"),

	/**
	 * The '<em><b>Appointment Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AppointmentResponse
	 * RispostaAppuntamento
	 * RéponseRendezVous
	 * CitaRespuesta
	 * 预约响应
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	APPOINTMENT_RESPONSE(10, "AppointmentResponse", "AppointmentResponse"),

	/**
	 * The '<em><b>Audit Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AuditEvent
	 * ÉvènementSécurité
	 * EventoSeguridad
	 * 审计事件
	 * <!-- end-model-doc -->
	 * @see #AUDIT_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIT_EVENT(11, "AuditEvent", "AuditEvent"),

	/**
	 * The '<em><b>Basic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Basic
	 * Basique
	 * Basico
	 * 初级资源
	 * <!-- end-model-doc -->
	 * @see #BASIC_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC(12, "Basic", "Basic"),

	/**
	 * The '<em><b>Biologically Derived Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BiologicallyDerivedProduct
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICALLY_DERIVED_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	BIOLOGICALLY_DERIVED_PRODUCT(13, "BiologicallyDerivedProduct", "BiologicallyDerivedProduct"),

	/**
	 * The '<em><b>Body Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BodyStructure
	 * StrutturaDelCorpo
	 * MorphologieDeCorps
	 * EstructuraDelCuerpo
	 * 身体结构
	 * <!-- end-model-doc -->
	 * @see #BODY_STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	BODY_STRUCTURE(14, "BodyStructure", "BodyStructure"),

	/**
	 * The '<em><b>Capability Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CapabilityStatement
	 * DeclaracionDeCapacidad
	 * 能力声明
	 * <!-- end-model-doc -->
	 * @see #CAPABILITY_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CAPABILITY_STATEMENT(15, "CapabilityStatement", "CapabilityStatement"),

	/**
	 * The '<em><b>Care Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CarePlan
	 * PianoDiCura
	 * PlanDeSoins
	 * PlanDeCuidado
	 * 照护计划
	 * <!-- end-model-doc -->
	 * @see #CARE_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	CARE_PLAN(16, "CarePlan", "CarePlan"),

	/**
	 * The '<em><b>Care Team</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CareTeam
	 * EquipoDeCuidado
	 * 照护团队
	 * <!-- end-model-doc -->
	 * @see #CARE_TEAM_VALUE
	 * @generated
	 * @ordered
	 */
	CARE_TEAM(17, "CareTeam", "CareTeam"),

	/**
	 * The '<em><b>Catalog Entry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CatalogEntry
	 * EntradaDeCatalogo
	 * 条目定义
	 * <!-- end-model-doc -->
	 * @see #CATALOG_ENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	CATALOG_ENTRY(18, "CatalogEntry", "CatalogEntry"),

	/**
	 * The '<em><b>Charge Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItem
	 * CargoDeItem
	 * 收费项目
	 * <!-- end-model-doc -->
	 * @see #CHARGE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGE_ITEM(19, "ChargeItem", "ChargeItem"),

	/**
	 * The '<em><b>Charge Item Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItemDefinition
	 * <!-- end-model-doc -->
	 * @see #CHARGE_ITEM_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGE_ITEM_DEFINITION(20, "ChargeItemDefinition", "ChargeItemDefinition"),

	/**
	 * The '<em><b>Citation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Citation
	 * <!-- end-model-doc -->
	 * @see #CITATION_VALUE
	 * @generated
	 * @ordered
	 */
	CITATION(21, "Citation", "Citation"),

	/**
	 * The '<em><b>Claim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Claim
	 * Réclamation
	 * Reclamación / Factura
	 * 赔单
	 * <!-- end-model-doc -->
	 * @see #CLAIM_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM(22, "Claim", "Claim"),

	/**
	 * The '<em><b>Claim Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClaimResponse
	 * RéponseARéclamation
	 * 赔单请求
	 * <!-- end-model-doc -->
	 * @see #CLAIM_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM_RESPONSE(23, "ClaimResponse", "ClaimResponse"),

	/**
	 * The '<em><b>Clinical Impression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClinicalImpression
	 * ImpressioneClinica
	 * ImpressionClinique
	 * HallazgoClinico
	 * 临床印象
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_IMPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL_IMPRESSION(24, "ClinicalImpression", "ClinicalImpression"),

	/**
	 * The '<em><b>Clinical Use Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClinicalUseDefinition
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_USE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL_USE_DEFINITION(25, "ClinicalUseDefinition", "ClinicalUseDefinition"),

	/**
	 * The '<em><b>Code System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CodeSystem
	 * SistemaDiCodifica
	 * SistemaDeCodigos
	 * 代码系统
	 * <!-- end-model-doc -->
	 * @see #CODE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_SYSTEM(26, "CodeSystem", "CodeSystem"),

	/**
	 * The '<em><b>Communication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Communication
	 * Comunicazione
	 * Communication
	 * Comunicación
	 * 通讯
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION(27, "Communication", "Communication"),

	/**
	 * The '<em><b>Communication Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationRequest
	 * RichiestaDiComunicazione
	 * DemandeDeCommunication
	 * ComunicaciónRequerimiento
	 * 通讯请求
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_REQUEST(28, "CommunicationRequest", "CommunicationRequest"),

	/**
	 * The '<em><b>Compartment Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CompartmentDefinition
	 * DefinicionDeCompartimento
	 * 逻辑区块定义
	 * <!-- end-model-doc -->
	 * @see #COMPARTMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPARTMENT_DEFINITION(29, "CompartmentDefinition", "CompartmentDefinition"),

	/**
	 * The '<em><b>Composition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Composition
	 * Composizione
	 * Composition
	 * Composición
	 * 组合式文书
	 * <!-- end-model-doc -->
	 * @see #COMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION(30, "Composition", "Composition"),

	/**
	 * The '<em><b>Concept Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ConceptMap
	 * MappaDiConcetti
	 * CarteDeConcepts
	 * MapaDeConceptos
	 * 概念映射
	 * <!-- end-model-doc -->
	 * @see #CONCEPT_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPT_MAP(31, "ConceptMap", "ConceptMap"),

	/**
	 * The '<em><b>Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition
	 * Condizione
	 * Condition
	 * Condición
	 * 情况
	 * <!-- end-model-doc -->
	 * @see #CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITION(32, "Condition", "Condition"),

	/**
	 * The '<em><b>Consent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consent
	 * Consenso
	 * Consentimiento
	 * 同意书
	 * <!-- end-model-doc -->
	 * @see #CONSENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENT(33, "Consent", "Consent"),

	/**
	 * The '<em><b>Contract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract
	 * Contratto
	 * Contrat
	 * Contato
	 * 合同
	 * <!-- end-model-doc -->
	 * @see #CONTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT(34, "Contract", "Contract"),

	/**
	 * The '<em><b>Coverage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage
	 * Copertura
	 * Couverture
	 * Cobertura
	 * 保险责任
	 * <!-- end-model-doc -->
	 * @see #COVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGE(35, "Coverage", "Coverage"),

	/**
	 * The '<em><b>Coverage Eligibility Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CoverageEligibilityRequest
	 * RichiestaEleggibilitaCopertura
	 * CouvertureDemandeEligibilité
	 * 资格请求
	 * <!-- end-model-doc -->
	 * @see #COVERAGE_ELIGIBILITY_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGE_ELIGIBILITY_REQUEST(36, "CoverageEligibilityRequest", "CoverageEligibilityRequest"),

	/**
	 * The '<em><b>Coverage Eligibility Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CoverageEligibilityResponse
	 * RispostaEleggibilitaCopertura
	 * RéponseEligibilitéCouverture
	 * 资格响应
	 * <!-- end-model-doc -->
	 * @see #COVERAGE_ELIGIBILITY_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGE_ELIGIBILITY_RESPONSE(37, "CoverageEligibilityResponse", "CoverageEligibilityResponse"),

	/**
	 * The '<em><b>Detected Issue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DetectedIssue
	 * ProblemaRilevato
	 * Problème Détecté
	 * Problema-Detectado /ProblemaDetectado
	 * 已发现问题
	 * <!-- end-model-doc -->
	 * @see #DETECTED_ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	DETECTED_ISSUE(38, "DetectedIssue", "DetectedIssue"),

	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device
	 * Dispositivo
	 * Dispositif
	 * Dispositivo
	 * 装置
	 * <!-- end-model-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(39, "Device", "Device"),

	/**
	 * The '<em><b>Device Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceDefinition
	 * DéfinitionDeDispositif
	 * DefiniciónDeDispositivo
	 * 装置组件
	 * <!-- end-model-doc -->
	 * @see #DEVICE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_DEFINITION(40, "DeviceDefinition", "DeviceDefinition"),

	/**
	 * The '<em><b>Device Metric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceMetric
	 * MétriqueDispositif
	 * MetricaDeDispositivo
	 * 装置指标
	 * <!-- end-model-doc -->
	 * @see #DEVICE_METRIC_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_METRIC(41, "DeviceMetric", "DeviceMetric"),

	/**
	 * The '<em><b>Device Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceRequest
	 * RichiestaDispositivo
	 * DemandeUtilisationDispositif
	 * SolicitudDeDispositivo
	 * 装置请求
	 * <!-- end-model-doc -->
	 * @see #DEVICE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_REQUEST(42, "DeviceRequest", "DeviceRequest"),

	/**
	 * The '<em><b>Device Use Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceUseStatement
	 * 装置使用声明
	 * <!-- end-model-doc -->
	 * @see #DEVICE_USE_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_USE_STATEMENT(43, "DeviceUseStatement", "DeviceUseStatement"),

	/**
	 * The '<em><b>Diagnostic Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DiagnosticReport
	 * RefertoDiagnostico
	 * RapportDiagnostique
	 * 诊断报告
	 * InformeDiagnostico
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTIC_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTIC_REPORT(44, "DiagnosticReport", "DiagnosticReport"),

	/**
	 * The '<em><b>Document Manifest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentManifest
	 * Manifeste
	 * 文档清单
	 * ManifestoDocumento
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_MANIFEST_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_MANIFEST(45, "DocumentManifest", "DocumentManifest"),

	/**
	 * The '<em><b>Document Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentReference
	 * RiferimentoDocumento
	 * RéférenceDocument
	 * ReferenciaDocumento
	 * 文档引用
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_REFERENCE(46, "DocumentReference", "DocumentReference"),

	/**
	 * The '<em><b>Encounter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter
	 * Venue
	 * 就医过程
	 * Encuentro
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENCOUNTER(47, "Encounter", "Encounter"),

	/**
	 * The '<em><b>Endpoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Endpoint
	 * Endpoint
	 * 端点
	 * <!-- end-model-doc -->
	 * @see #ENDPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	ENDPOINT(48, "Endpoint", "Endpoint"),

	/**
	 * The '<em><b>Enrollment Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentRequest
	 * RichiestaIscrizione
	 * DemandeInscription
	 * SolicitudDeEnrolamiento
	 * 保险注册请求
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ENROLLMENT_REQUEST(49, "EnrollmentRequest", "EnrollmentRequest"),

	/**
	 * The '<em><b>Enrollment Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentResponse
	 * RispostaIscrizione
	 * RéponseInscription
	 * RespuestaDeEnrolamiento
	 * 保险注册响应
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	ENROLLMENT_RESPONSE(50, "EnrollmentResponse", "EnrollmentResponse"),

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EpisodeOfCare
	 * EpisodioDiCura
	 * ÉpisodeDeSoins
	 * EpisodioDeCuidado
	 * 照护服务节段
	 * <!-- end-model-doc -->
	 * @see #EPISODE_OF_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	EPISODE_OF_CARE(51, "EpisodeOfCare", "EpisodeOfCare"),

	/**
	 * The '<em><b>Event Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EventDefinition
	 * DefinizioneEvento
	 * DefinitionDeEvento
	 * 事件定义
	 * <!-- end-model-doc -->
	 * @see #EVENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_DEFINITION(52, "EventDefinition", "EventDefinition"),

	/**
	 * The '<em><b>Evidence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	EVIDENCE(53, "Evidence", "Evidence"),

	/**
	 * The '<em><b>Evidence Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EvidenceReport
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	EVIDENCE_REPORT(54, "EvidenceReport", "EvidenceReport"),

	/**
	 * The '<em><b>Evidence Variable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EvidenceVariable
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE_VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	EVIDENCE_VARIABLE(55, "EvidenceVariable", "EvidenceVariable"),

	/**
	 * The '<em><b>Example Scenario</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExampleScenario
	 * ScenarioDiEsempio
	 * EjemploDeEscenario
	 * 示例场景
	 * <!-- end-model-doc -->
	 * @see #EXAMPLE_SCENARIO_VALUE
	 * @generated
	 * @ordered
	 */
	EXAMPLE_SCENARIO(56, "ExampleScenario", "ExampleScenario"),

	/**
	 * The '<em><b>Explanation Of Benefit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExplanationOfBenefit
	 * ExplicationDuBénéfice
	 * 赔付说明
	 * <!-- end-model-doc -->
	 * @see #EXPLANATION_OF_BENEFIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLANATION_OF_BENEFIT(57, "ExplanationOfBenefit", "ExplanationOfBenefit"),

	/**
	 * The '<em><b>Family Member History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FamilyMemberHistory
	 * HistoireMembreFamille
	 * HistorialMiembroFamiliar
	 * 家族史
	 * <!-- end-model-doc -->
	 * @see #FAMILY_MEMBER_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY_MEMBER_HISTORY(58, "FamilyMemberHistory", "FamilyMemberHistory"),

	/**
	 * The '<em><b>Flag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag
	 * Drapeau
	 * Bandera
	 * 标记
	 * <!-- end-model-doc -->
	 * @see #FLAG_VALUE
	 * @generated
	 * @ordered
	 */
	FLAG(59, "Flag", "Flag"),

	/**
	 * The '<em><b>Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goal
	 * But
	 * Objetivo
	 * 目标
	 * <!-- end-model-doc -->
	 * @see #GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL(60, "Goal", "Goal"),

	/**
	 * The '<em><b>Graph Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GraphDefinition
	 * DefinitionGrafico
	 * 图形定义
	 * <!-- end-model-doc -->
	 * @see #GRAPH_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPH_DEFINITION(61, "GraphDefinition", "GraphDefinition"),

	/**
	 * The '<em><b>Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group
	 * Gruppo
	 * Groupe
	 * Grupo
	 * 群组
	 * <!-- end-model-doc -->
	 * @see #GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP(62, "Group", "Group"),

	/**
	 * The '<em><b>Guidance Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GuidanceResponse
	 * RespuestaDeOrientacion
	 * 指导意见响应
	 * <!-- end-model-doc -->
	 * @see #GUIDANCE_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	GUIDANCE_RESPONSE(63, "GuidanceResponse", "GuidanceResponse"),

	/**
	 * The '<em><b>Healthcare Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HealthcareService
	 * ServizioSanitario
	 * ServiceDeSanté
	 * ServicioDeCuidado
	 * 医疗保健服务项目
	 * <!-- end-model-doc -->
	 * @see #HEALTHCARE_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTHCARE_SERVICE(64, "HealthcareService", "HealthcareService"),

	/**
	 * The '<em><b>Imaging Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingStudy
	 * EtudeImagerie
	 * EstudioImagen  / EstudioImagen
	 * 成像检查
	 * <!-- end-model-doc -->
	 * @see #IMAGING_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGING_STUDY(65, "ImagingStudy", "ImagingStudy"),

	/**
	 * The '<em><b>Immunization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immunization
	 * Immunizzazione
	 * Immunisation
	 * 免疫接种
	 * Inmunización
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION(66, "Immunization", "Immunization"),

	/**
	 * The '<em><b>Immunization Evaluation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationEvaluation
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_EVALUATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION_EVALUATION(67, "ImmunizationEvaluation", "ImmunizationEvaluation"),

	/**
	 * The '<em><b>Immunization Recommendation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationRecommendation
	 * RecommendationImmunisation
	 * 免疫接种建议
	 * RecomendaciónInmunización /
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_RECOMMENDATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION_RECOMMENDATION(68, "ImmunizationRecommendation", "ImmunizationRecommendation"),

	/**
	 * The '<em><b>Implementation Guide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImplementationGuide
	 * GuiaDeImplementacion
	 * 实施指南
	 * <!-- end-model-doc -->
	 * @see #IMPLEMENTATION_GUIDE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTATION_GUIDE(69, "ImplementationGuide", "ImplementationGuide"),

	/**
	 * The '<em><b>Ingredient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ingredient
	 * <!-- end-model-doc -->
	 * @see #INGREDIENT_VALUE
	 * @generated
	 * @ordered
	 */
	INGREDIENT(70, "Ingredient", "Ingredient"),

	/**
	 * The '<em><b>Insurance Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InsurancePlan
	 * <!-- end-model-doc -->
	 * @see #INSURANCE_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	INSURANCE_PLAN(71, "InsurancePlan", "InsurancePlan"),

	/**
	 * The '<em><b>Invoice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice
	 * <!-- end-model-doc -->
	 * @see #INVOICE_VALUE
	 * @generated
	 * @ordered
	 */
	INVOICE(72, "Invoice", "Invoice"),

	/**
	 * The '<em><b>Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Library
	 * Librería
	 * 库
	 * <!-- end-model-doc -->
	 * @see #LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	LIBRARY(73, "Library", "Library"),

	/**
	 * The '<em><b>Linkage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linkage
	 * Enlace / Conexión / Vinculo / Acoplamiento 
	 * 链接关系
	 * <!-- end-model-doc -->
	 * @see #LINKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LINKAGE(74, "Linkage", "Linkage"),

	/**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List
	 * Lista
	 * Liste
	 * 列表
	 * Lista
	 * <!-- end-model-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(75, "List", "List"),

	/**
	 * The '<em><b>Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location
	 * Localisation
	 * 位置
	 * Locacion
	 * <!-- end-model-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(76, "Location", "Location"),

	/**
	 * The '<em><b>Manufactured Item Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ManufacturedItemDefinition
	 * <!-- end-model-doc -->
	 * @see #MANUFACTURED_ITEM_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	MANUFACTURED_ITEM_DEFINITION(77, "ManufacturedItemDefinition", "ManufacturedItemDefinition"),

	/**
	 * The '<em><b>Measure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure
	 * Misura
	 * Medida
	 * 指标
	 * <!-- end-model-doc -->
	 * @see #MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE(78, "Measure", "Measure"),

	/**
	 * The '<em><b>Measure Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MeasureReport
	 * ReporteMedida
	 * 指标报告
	 * <!-- end-model-doc -->
	 * @see #MEASURE_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE_REPORT(79, "MeasureReport", "MeasureReport"),

	/**
	 * The '<em><b>Media</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Media
	 * Media
	 * Média
	 * Medio
	 * 媒体
	 * <!-- end-model-doc -->
	 * @see #MEDIA_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIA(80, "Media", "Media"),

	/**
	 * The '<em><b>Medication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medication
	 * Médication
	 * 药物
	 * Medicación /Medicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION(81, "Medication", "Medication"),

	/**
	 * The '<em><b>Medication Administration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationAdministration
	 * AdministrationMédicaments
	 * 药物施用
	 * AdministraciónMedicación / AdministracionMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ADMINISTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION(82, "MedicationAdministration", "MedicationAdministration"),

	/**
	 * The '<em><b>Medication Dispense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationDispense
	 * DispensationMédicaments
	 * 药物配发
	 * DispensaciónMedicación /DispensacionMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_DISPENSE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_DISPENSE(83, "MedicationDispense", "MedicationDispense"),

	/**
	 * The '<em><b>Medication Knowledge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationKnowledge
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_KNOWLEDGE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_KNOWLEDGE(84, "MedicationKnowledge", "MedicationKnowledge"),

	/**
	 * The '<em><b>Medication Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationRequest
	 * PrescriptionMédicamenteuseTODO
	 * 药物请求
	 * PrescripciónMedicaciónTODO  /PrescripcionMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_REQUEST(85, "MedicationRequest", "MedicationRequest"),

	/**
	 * The '<em><b>Medication Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationStatement
	 * ÉtatMédication
	 * 药物声明
	 * ResumenMedicación /ResumenMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_STATEMENT(86, "MedicationStatement", "MedicationStatement"),

	/**
	 * The '<em><b>Medicinal Product Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductDefinition
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_DEFINITION(87, "MedicinalProductDefinition", "MedicinalProductDefinition"),

	/**
	 * The '<em><b>Message Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageDefinition
	 * DefinizioneMessaggio
	 * DefinicionMensaje
	 * 消息定义
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_DEFINITION(88, "MessageDefinition", "MessageDefinition"),

	/**
	 * The '<em><b>Message Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageHeader
	 * EntêteMessage
	 * 消息标头
	 * CabeceraMensaje
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_HEADER(89, "MessageHeader", "MessageHeader"),

	/**
	 * The '<em><b>Molecular Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MolecularSequence
	 * SecuenciaMolecular
	 * 分子序列
	 * <!-- end-model-doc -->
	 * @see #MOLECULAR_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	MOLECULAR_SEQUENCE(90, "MolecularSequence", "MolecularSequence"),

	/**
	 * The '<em><b>Naming System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NamingSystem
	 * SystèmeDeNommage
	 * SistemaDeNombres
	 * 命名系统
	 * <!-- end-model-doc -->
	 * @see #NAMING_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	NAMING_SYSTEM(91, "NamingSystem", "NamingSystem"),

	/**
	 * The '<em><b>Nutrition Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionOrder
	 * OrdreNutrition
	 * OrdenNutrición
	 * 营养医嘱
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	NUTRITION_ORDER(92, "NutritionOrder", "NutritionOrder"),

	/**
	 * The '<em><b>Nutrition Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionProduct
	 * ProduitNutritionnel
	 * ProductoNutricional
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	NUTRITION_PRODUCT(93, "NutritionProduct", "NutritionProduct"),

	/**
	 * The '<em><b>Observation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Observation
	 * Osservazione
	 * Observation
	 * 观察
	 * Observación
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION(94, "Observation", "Observation"),

	/**
	 * The '<em><b>Observation Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ObservationDefinition
	 * DefinizioneOsservazione
	 * DefinicionDeEspecimen
	 * 观察定义
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION_DEFINITION(95, "ObservationDefinition", "ObservationDefinition"),

	/**
	 * The '<em><b>Operation Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationDefinition
	 * DefinizioneOperazione
	 * DéfinitionOpération
	 * DefinicionDeOperacion
	 * 操作定义
	 * <!-- end-model-doc -->
	 * @see #OPERATION_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_DEFINITION(96, "OperationDefinition", "OperationDefinition"),

	/**
	 * The '<em><b>Operation Outcome</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationOutcome
	 * RisultatoOperazione
	 * RésultatOpération
	 * 操作结局
	 * ResultadoOperación
	 * <!-- end-model-doc -->
	 * @see #OPERATION_OUTCOME_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_OUTCOME(97, "OperationOutcome", "OperationOutcome"),

	/**
	 * The '<em><b>Organization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization
	 * Organizzazione
	 * Organisation
	 * 组织机构
	 * Organización
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION(98, "Organization", "Organization"),

	/**
	 * The '<em><b>Organization Affiliation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OrganizationAffiliation
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION_AFFILIATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION_AFFILIATION(99, "OrganizationAffiliation", "OrganizationAffiliation"),

	/**
	 * The '<em><b>Packaged Product Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PackagedProductDefinition
	 * <!-- end-model-doc -->
	 * @see #PACKAGED_PRODUCT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGED_PRODUCT_DEFINITION(100, "PackagedProductDefinition", "PackagedProductDefinition"),

	/**
	 * The '<em><b>Patient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient
	 * Paziente
	 * Patient
	 * 患者
	 * Paciente
	 * <!-- end-model-doc -->
	 * @see #PATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT(101, "Patient", "Patient"),

	/**
	 * The '<em><b>Payment Notice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentNotice
	 * AvvisoDiPagamento
	 * AvisPaiement
	 * AvisoDePago
	 * 付款通知
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_NOTICE_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_NOTICE(102, "PaymentNotice", "PaymentNotice"),

	/**
	 * The '<em><b>Payment Reconciliation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentReconciliation
	 * RiconciliazionePagamento
	 * RéconciliationPaiement
	 * ConciliacionDePago
	 * 付款对账
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_RECONCILIATION_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_RECONCILIATION(103, "PaymentReconciliation", "PaymentReconciliation"),

	/**
	 * The '<em><b>Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person
	 * Persona
	 * Personne
	 * Persona
	 * 人员
	 * <!-- end-model-doc -->
	 * @see #PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON(104, "Person", "Person"),

	/**
	 * The '<em><b>Plan Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PlanDefinition
	 * DefinicionDePlan
	 * 计划定义
	 * <!-- end-model-doc -->
	 * @see #PLAN_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN_DEFINITION(105, "PlanDefinition", "PlanDefinition"),

	/**
	 * The '<em><b>Practitioner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Practitioner
	 * Praticien
	 * 执业人员
	 * Practicante / Profesional
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONER(106, "Practitioner", "Practitioner"),

	/**
	 * The '<em><b>Practitioner Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PractitionerRole
	 * RolProfesional
	 * 执业人员角色
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONER_ROLE(107, "PractitionerRole", "PractitionerRole"),

	/**
	 * The '<em><b>Procedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedure
	 * Procedura
	 * Procédure
	 * 操作项目
	 * Procedimiento
	 * <!-- end-model-doc -->
	 * @see #PROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE(108, "Procedure", "Procedure"),

	/**
	 * The '<em><b>Provenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provenance
	 * Provenienza
	 * Provenance
	 * 出处
	 * Procedencia
	 * <!-- end-model-doc -->
	 * @see #PROVENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PROVENANCE(109, "Provenance", "Provenance"),

	/**
	 * The '<em><b>Questionnaire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Questionnaire
	 * Questionario
	 * Questionnaire
	 * 调查问卷
	 * Cuestionario
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONNAIRE(110, "Questionnaire", "Questionnaire"),

	/**
	 * The '<em><b>Questionnaire Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QuestionnaireResponse
	 * RispostaQuestionario
	 * RéponseQuestionnaire
	 * RespuestaAlCuestionario
	 * 调查问卷答复
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONNAIRE_RESPONSE(111, "QuestionnaireResponse", "QuestionnaireResponse"),

	/**
	 * The '<em><b>Regulated Authorization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RegulatedAuthorization
	 * <!-- end-model-doc -->
	 * @see #REGULATED_AUTHORIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	REGULATED_AUTHORIZATION(112, "RegulatedAuthorization", "RegulatedAuthorization"),

	/**
	 * The '<em><b>Related Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedPerson
	 * PersonaCorrelata
	 * PersonneEnRelation
	 * PersonaRelacionada
	 * 相关人员
	 * <!-- end-model-doc -->
	 * @see #RELATED_PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED_PERSON(113, "RelatedPerson", "RelatedPerson"),

	/**
	 * The '<em><b>Request Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestGroup
	 * GruppoDiRichieste
	 * GrupoDeSolicitudes
	 * 请求分组
	 * <!-- end-model-doc -->
	 * @see #REQUEST_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_GROUP(114, "RequestGroup", "RequestGroup"),

	/**
	 * The '<em><b>Research Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchDefinition
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_DEFINITION(115, "ResearchDefinition", "ResearchDefinition"),

	/**
	 * The '<em><b>Research Element Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchElementDefinition
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_ELEMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_ELEMENT_DEFINITION(116, "ResearchElementDefinition", "ResearchElementDefinition"),

	/**
	 * The '<em><b>Research Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchStudy
	 * EstudioDeInvestigacion
	 * 调查研究
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_STUDY(117, "ResearchStudy", "ResearchStudy"),

	/**
	 * The '<em><b>Research Subject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchSubject
	 * SujetoDeInvestigacion
	 * 研究主题
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_SUBJECT(118, "ResearchSubject", "ResearchSubject"),

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RiskAssessment
	 * ÉvaluationRisques
	 * EvaluacionDeRiesgo
	 * 风险评估
	 * <!-- end-model-doc -->
	 * @see #RISK_ASSESSMENT_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_ASSESSMENT(119, "RiskAssessment", "RiskAssessment"),

	/**
	 * The '<em><b>Schedule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedule
	 * Agenda
	 * 日程安排
	 * <!-- end-model-doc -->
	 * @see #SCHEDULE_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULE(120, "Schedule", "Schedule"),

	/**
	 * The '<em><b>Search Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SearchParameter
	 * ParametroDiRicerca
	 * ParamètreRecherche
	 * ParametroDeBusqueda
	 * 搜索参数
	 * <!-- end-model-doc -->
	 * @see #SEARCH_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH_PARAMETER(121, "SearchParameter", "SearchParameter"),

	/**
	 * The '<em><b>Service Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServiceRequest
	 * RichiestaDiServizio
	 * DemandeService
	 * PeticiónServicio
	 * 服务项目请求
	 * <!-- end-model-doc -->
	 * @see #SERVICE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_REQUEST(122, "ServiceRequest", "ServiceRequest"),

	/**
	 * The '<em><b>Slot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Slot
	 * Slot
	 * 槽位
	 * Hueco / Zocalo / Espacio
	 * <!-- end-model-doc -->
	 * @see #SLOT_VALUE
	 * @generated
	 * @ordered
	 */
	SLOT(123, "Slot", "Slot"),

	/**
	 * The '<em><b>Specimen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specimen
	 * Campione
	 * Spécimen
	 * 标本
	 * Especimen
	 * <!-- end-model-doc -->
	 * @see #SPECIMEN_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIMEN(124, "Specimen", "Specimen"),

	/**
	 * The '<em><b>Specimen Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SpecimenDefinition
	 * DefinizioneCampione
	 * DefinicionDeEspecimen
	 * 标本定义
	 * <!-- end-model-doc -->
	 * @see #SPECIMEN_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIMEN_DEFINITION(125, "SpecimenDefinition", "SpecimenDefinition"),

	/**
	 * The '<em><b>Structure Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StructureDefinition
	 * DefinizioneStruttura
	 * DéfinitionStructure
	 * DefinicionDeEstructura
	 * 结构定义
	 * <!-- end-model-doc -->
	 * @see #STRUCTURE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE_DEFINITION(126, "StructureDefinition", "StructureDefinition"),

	/**
	 * The '<em><b>Structure Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StructureMap
	 * MapaDeEstructura
	 * 结构映射
	 * <!-- end-model-doc -->
	 * @see #STRUCTURE_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE_MAP(127, "StructureMap", "StructureMap"),

	/**
	 * The '<em><b>Subscription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subscription
	 * Sottoscrizione
	 * Souscription
	 * 订阅
	 * Suscripción
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION(128, "Subscription", "Subscription"),

	/**
	 * The '<em><b>Subscription Status</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionStatus
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION_STATUS(129, "SubscriptionStatus", "SubscriptionStatus"),

	/**
	 * The '<em><b>Subscription Topic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionTopic
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION_TOPIC_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION_TOPIC(130, "SubscriptionTopic", "SubscriptionTopic"),

	/**
	 * The '<em><b>Substance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substance
	 * Sostanza
	 * Substance
	 * 物质
	 * Sustancia
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE(131, "Substance", "Substance"),

	/**
	 * The '<em><b>Substance Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceDefinition
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_DEFINITION(132, "SubstanceDefinition", "SubstanceDefinition"),

	/**
	 * The '<em><b>Supply Delivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyDelivery
	 * Supply Livraison
	 * 供应交付
	 * Entrega de Suministro
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_DELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY_DELIVERY(133, "SupplyDelivery", "SupplyDelivery"),

	/**
	 * The '<em><b>Supply Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyRequest
	 * Demande d'approvisionnement
	 * 供应请求
	 * Solicitud de Suministro
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY_REQUEST(134, "SupplyRequest", "SupplyRequest"),

	/**
	 * The '<em><b>Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Task
	 * Tarea
	 * 任务
	 * <!-- end-model-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(135, "Task", "Task"),

	/**
	 * The '<em><b>Terminology Capabilities</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TerminologyCapabilities
	 * CapacidadTerminologica
	 * 术语服务能力
	 * <!-- end-model-doc -->
	 * @see #TERMINOLOGY_CAPABILITIES_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINOLOGY_CAPABILITIES(136, "TerminologyCapabilities", "TerminologyCapabilities"),

	/**
	 * The '<em><b>Test Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestReport
	 * RapportTest
	 * ReporteDePrueba
	 * 测试报告
	 * <!-- end-model-doc -->
	 * @see #TEST_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_REPORT(137, "TestReport", "TestReport"),

	/**
	 * The '<em><b>Test Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestScript
	 * ScriptTest
	 * ScriptDePrueba
	 * 测试脚本
	 * <!-- end-model-doc -->
	 * @see #TEST_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_SCRIPT(138, "TestScript", "TestScript"),

	/**
	 * The '<em><b>Value Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ValueSet
	 * EnsembleValeurs
	 * 取值集合
	 * ConjuntoValores / ConjuntoDeValores
	 * <!-- end-model-doc -->
	 * @see #VALUE_SET_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_SET(139, "ValueSet", "ValueSet"),

	/**
	 * The '<em><b>Verification Result</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VerificationResult
	 * <!-- end-model-doc -->
	 * @see #VERIFICATION_RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFICATION_RESULT(140, "VerificationResult", "VerificationResult"),

	/**
	 * The '<em><b>Vision Prescription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VisionPrescription
	 * PrescriptionVision
	 * PrescripcionDeVision
	 * 视力处方
	 * <!-- end-model-doc -->
	 * @see #VISION_PRESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	VISION_PRESCRIPTION(141, "VisionPrescription", "VisionPrescription"),

	/**
	 * The '<em><b>Parameters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters
	 * Parametros
	 * 参数
	 * <!-- end-model-doc -->
	 * @see #PARAMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETERS(142, "Parameters", "Parameters");

	/**
	 * The '<em><b>Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource
	 * Recurso
	 * 资源
	 * <!-- end-model-doc -->
	 * @see #RESOURCE
	 * @model name="Resource"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 0;

	/**
	 * The '<em><b>Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binary
	 * Binario
	 * Binaire
	 * Binario
	 * 二进制资源
	 * <!-- end-model-doc -->
	 * @see #BINARY
	 * @model name="Binary"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VALUE = 1;

	/**
	 * The '<em><b>Bundle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bundle
	 * Paquet
	 * Paquete
	 * 捆束
	 * <!-- end-model-doc -->
	 * @see #BUNDLE
	 * @model name="Bundle"
	 * @generated
	 * @ordered
	 */
	public static final int BUNDLE_VALUE = 2;

	/**
	 * The '<em><b>Domain Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DomainResource
	 * RecursoDeDominio
	 * 领域资源
	 * <!-- end-model-doc -->
	 * @see #DOMAIN_RESOURCE
	 * @model name="DomainResource"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_RESOURCE_VALUE = 3;

	/**
	 * The '<em><b>Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Account
	 * Cuenta
	 * 账户
	 * <!-- end-model-doc -->
	 * @see #ACCOUNT
	 * @model name="Account"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_VALUE = 4;

	/**
	 * The '<em><b>Activity Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityDefinition
	 * DefinizioneAttivita
	 * DefinicionDeActividad
	 * 活动定义
	 * <!-- end-model-doc -->
	 * @see #ACTIVITY_DEFINITION
	 * @model name="ActivityDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_DEFINITION_VALUE = 5;

	/**
	 * The '<em><b>Administrable Product Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdministrableProductDefinition
	 * <!-- end-model-doc -->
	 * @see #ADMINISTRABLE_PRODUCT_DEFINITION
	 * @model name="AdministrableProductDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRABLE_PRODUCT_DEFINITION_VALUE = 6;

	/**
	 * The '<em><b>Adverse Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent
	 * EventoAvverso
	 * EventoAdverso
	 * 不良事件
	 * <!-- end-model-doc -->
	 * @see #ADVERSE_EVENT
	 * @model name="AdverseEvent"
	 * @generated
	 * @ordered
	 */
	public static final int ADVERSE_EVENT_VALUE = 7;

	/**
	 * The '<em><b>Allergy Intolerance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AllergyIntolerance
	 * AllergiaIntolleranza
	 * IntoléranceAllergique
	 * AllergiaIntolerancia
	 * 变态反应与不耐性
	 * <!-- end-model-doc -->
	 * @see #ALLERGY_INTOLERANCE
	 * @model name="AllergyIntolerance"
	 * @generated
	 * @ordered
	 */
	public static final int ALLERGY_INTOLERANCE_VALUE = 8;

	/**
	 * The '<em><b>Appointment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appointment
	 * Appuntamento
	 * RendezVous
	 * Cita
	 * 预约
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT
	 * @model name="Appointment"
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_VALUE = 9;

	/**
	 * The '<em><b>Appointment Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AppointmentResponse
	 * RispostaAppuntamento
	 * RéponseRendezVous
	 * CitaRespuesta
	 * 预约响应
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT_RESPONSE
	 * @model name="AppointmentResponse"
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_RESPONSE_VALUE = 10;

	/**
	 * The '<em><b>Audit Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AuditEvent
	 * ÉvènementSécurité
	 * EventoSeguridad
	 * 审计事件
	 * <!-- end-model-doc -->
	 * @see #AUDIT_EVENT
	 * @model name="AuditEvent"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIT_EVENT_VALUE = 11;

	/**
	 * The '<em><b>Basic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Basic
	 * Basique
	 * Basico
	 * 初级资源
	 * <!-- end-model-doc -->
	 * @see #BASIC
	 * @model name="Basic"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_VALUE = 12;

	/**
	 * The '<em><b>Biologically Derived Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BiologicallyDerivedProduct
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICALLY_DERIVED_PRODUCT
	 * @model name="BiologicallyDerivedProduct"
	 * @generated
	 * @ordered
	 */
	public static final int BIOLOGICALLY_DERIVED_PRODUCT_VALUE = 13;

	/**
	 * The '<em><b>Body Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BodyStructure
	 * StrutturaDelCorpo
	 * MorphologieDeCorps
	 * EstructuraDelCuerpo
	 * 身体结构
	 * <!-- end-model-doc -->
	 * @see #BODY_STRUCTURE
	 * @model name="BodyStructure"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_STRUCTURE_VALUE = 14;

	/**
	 * The '<em><b>Capability Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CapabilityStatement
	 * DeclaracionDeCapacidad
	 * 能力声明
	 * <!-- end-model-doc -->
	 * @see #CAPABILITY_STATEMENT
	 * @model name="CapabilityStatement"
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY_STATEMENT_VALUE = 15;

	/**
	 * The '<em><b>Care Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CarePlan
	 * PianoDiCura
	 * PlanDeSoins
	 * PlanDeCuidado
	 * 照护计划
	 * <!-- end-model-doc -->
	 * @see #CARE_PLAN
	 * @model name="CarePlan"
	 * @generated
	 * @ordered
	 */
	public static final int CARE_PLAN_VALUE = 16;

	/**
	 * The '<em><b>Care Team</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CareTeam
	 * EquipoDeCuidado
	 * 照护团队
	 * <!-- end-model-doc -->
	 * @see #CARE_TEAM
	 * @model name="CareTeam"
	 * @generated
	 * @ordered
	 */
	public static final int CARE_TEAM_VALUE = 17;

	/**
	 * The '<em><b>Catalog Entry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CatalogEntry
	 * EntradaDeCatalogo
	 * 条目定义
	 * <!-- end-model-doc -->
	 * @see #CATALOG_ENTRY
	 * @model name="CatalogEntry"
	 * @generated
	 * @ordered
	 */
	public static final int CATALOG_ENTRY_VALUE = 18;

	/**
	 * The '<em><b>Charge Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItem
	 * CargoDeItem
	 * 收费项目
	 * <!-- end-model-doc -->
	 * @see #CHARGE_ITEM
	 * @model name="ChargeItem"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_ITEM_VALUE = 19;

	/**
	 * The '<em><b>Charge Item Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItemDefinition
	 * <!-- end-model-doc -->
	 * @see #CHARGE_ITEM_DEFINITION
	 * @model name="ChargeItemDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_ITEM_DEFINITION_VALUE = 20;

	/**
	 * The '<em><b>Citation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Citation
	 * <!-- end-model-doc -->
	 * @see #CITATION
	 * @model name="Citation"
	 * @generated
	 * @ordered
	 */
	public static final int CITATION_VALUE = 21;

	/**
	 * The '<em><b>Claim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Claim
	 * Réclamation
	 * Reclamación / Factura
	 * 赔单
	 * <!-- end-model-doc -->
	 * @see #CLAIM
	 * @model name="Claim"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_VALUE = 22;

	/**
	 * The '<em><b>Claim Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClaimResponse
	 * RéponseARéclamation
	 * 赔单请求
	 * <!-- end-model-doc -->
	 * @see #CLAIM_RESPONSE
	 * @model name="ClaimResponse"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_RESPONSE_VALUE = 23;

	/**
	 * The '<em><b>Clinical Impression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClinicalImpression
	 * ImpressioneClinica
	 * ImpressionClinique
	 * HallazgoClinico
	 * 临床印象
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_IMPRESSION
	 * @model name="ClinicalImpression"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_IMPRESSION_VALUE = 24;

	/**
	 * The '<em><b>Clinical Use Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClinicalUseDefinition
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_USE_DEFINITION
	 * @model name="ClinicalUseDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_USE_DEFINITION_VALUE = 25;

	/**
	 * The '<em><b>Code System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CodeSystem
	 * SistemaDiCodifica
	 * SistemaDeCodigos
	 * 代码系统
	 * <!-- end-model-doc -->
	 * @see #CODE_SYSTEM
	 * @model name="CodeSystem"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_SYSTEM_VALUE = 26;

	/**
	 * The '<em><b>Communication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Communication
	 * Comunicazione
	 * Communication
	 * Comunicación
	 * 通讯
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION
	 * @model name="Communication"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_VALUE = 27;

	/**
	 * The '<em><b>Communication Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationRequest
	 * RichiestaDiComunicazione
	 * DemandeDeCommunication
	 * ComunicaciónRequerimiento
	 * 通讯请求
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_REQUEST
	 * @model name="CommunicationRequest"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_REQUEST_VALUE = 28;

	/**
	 * The '<em><b>Compartment Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CompartmentDefinition
	 * DefinicionDeCompartimento
	 * 逻辑区块定义
	 * <!-- end-model-doc -->
	 * @see #COMPARTMENT_DEFINITION
	 * @model name="CompartmentDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPARTMENT_DEFINITION_VALUE = 29;

	/**
	 * The '<em><b>Composition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Composition
	 * Composizione
	 * Composition
	 * Composición
	 * 组合式文书
	 * <!-- end-model-doc -->
	 * @see #COMPOSITION
	 * @model name="Composition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_VALUE = 30;

	/**
	 * The '<em><b>Concept Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ConceptMap
	 * MappaDiConcetti
	 * CarteDeConcepts
	 * MapaDeConceptos
	 * 概念映射
	 * <!-- end-model-doc -->
	 * @see #CONCEPT_MAP
	 * @model name="ConceptMap"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPT_MAP_VALUE = 31;

	/**
	 * The '<em><b>Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition
	 * Condizione
	 * Condition
	 * Condición
	 * 情况
	 * <!-- end-model-doc -->
	 * @see #CONDITION
	 * @model name="Condition"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_VALUE = 32;

	/**
	 * The '<em><b>Consent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consent
	 * Consenso
	 * Consentimiento
	 * 同意书
	 * <!-- end-model-doc -->
	 * @see #CONSENT
	 * @model name="Consent"
	 * @generated
	 * @ordered
	 */
	public static final int CONSENT_VALUE = 33;

	/**
	 * The '<em><b>Contract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract
	 * Contratto
	 * Contrat
	 * Contato
	 * 合同
	 * <!-- end-model-doc -->
	 * @see #CONTRACT
	 * @model name="Contract"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_VALUE = 34;

	/**
	 * The '<em><b>Coverage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage
	 * Copertura
	 * Couverture
	 * Cobertura
	 * 保险责任
	 * <!-- end-model-doc -->
	 * @see #COVERAGE
	 * @model name="Coverage"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGE_VALUE = 35;

	/**
	 * The '<em><b>Coverage Eligibility Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CoverageEligibilityRequest
	 * RichiestaEleggibilitaCopertura
	 * CouvertureDemandeEligibilité
	 * 资格请求
	 * <!-- end-model-doc -->
	 * @see #COVERAGE_ELIGIBILITY_REQUEST
	 * @model name="CoverageEligibilityRequest"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGE_ELIGIBILITY_REQUEST_VALUE = 36;

	/**
	 * The '<em><b>Coverage Eligibility Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CoverageEligibilityResponse
	 * RispostaEleggibilitaCopertura
	 * RéponseEligibilitéCouverture
	 * 资格响应
	 * <!-- end-model-doc -->
	 * @see #COVERAGE_ELIGIBILITY_RESPONSE
	 * @model name="CoverageEligibilityResponse"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGE_ELIGIBILITY_RESPONSE_VALUE = 37;

	/**
	 * The '<em><b>Detected Issue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DetectedIssue
	 * ProblemaRilevato
	 * Problème Détecté
	 * Problema-Detectado /ProblemaDetectado
	 * 已发现问题
	 * <!-- end-model-doc -->
	 * @see #DETECTED_ISSUE
	 * @model name="DetectedIssue"
	 * @generated
	 * @ordered
	 */
	public static final int DETECTED_ISSUE_VALUE = 38;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device
	 * Dispositivo
	 * Dispositif
	 * Dispositivo
	 * 装置
	 * <!-- end-model-doc -->
	 * @see #DEVICE
	 * @model name="Device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 39;

	/**
	 * The '<em><b>Device Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceDefinition
	 * DéfinitionDeDispositif
	 * DefiniciónDeDispositivo
	 * 装置组件
	 * <!-- end-model-doc -->
	 * @see #DEVICE_DEFINITION
	 * @model name="DeviceDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_DEFINITION_VALUE = 40;

	/**
	 * The '<em><b>Device Metric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceMetric
	 * MétriqueDispositif
	 * MetricaDeDispositivo
	 * 装置指标
	 * <!-- end-model-doc -->
	 * @see #DEVICE_METRIC
	 * @model name="DeviceMetric"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_METRIC_VALUE = 41;

	/**
	 * The '<em><b>Device Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceRequest
	 * RichiestaDispositivo
	 * DemandeUtilisationDispositif
	 * SolicitudDeDispositivo
	 * 装置请求
	 * <!-- end-model-doc -->
	 * @see #DEVICE_REQUEST
	 * @model name="DeviceRequest"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_REQUEST_VALUE = 42;

	/**
	 * The '<em><b>Device Use Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceUseStatement
	 * 装置使用声明
	 * <!-- end-model-doc -->
	 * @see #DEVICE_USE_STATEMENT
	 * @model name="DeviceUseStatement"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_USE_STATEMENT_VALUE = 43;

	/**
	 * The '<em><b>Diagnostic Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DiagnosticReport
	 * RefertoDiagnostico
	 * RapportDiagnostique
	 * 诊断报告
	 * InformeDiagnostico
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTIC_REPORT
	 * @model name="DiagnosticReport"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTIC_REPORT_VALUE = 44;

	/**
	 * The '<em><b>Document Manifest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentManifest
	 * Manifeste
	 * 文档清单
	 * ManifestoDocumento
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_MANIFEST
	 * @model name="DocumentManifest"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_MANIFEST_VALUE = 45;

	/**
	 * The '<em><b>Document Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentReference
	 * RiferimentoDocumento
	 * RéférenceDocument
	 * ReferenciaDocumento
	 * 文档引用
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_REFERENCE
	 * @model name="DocumentReference"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_REFERENCE_VALUE = 46;

	/**
	 * The '<em><b>Encounter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter
	 * Venue
	 * 就医过程
	 * Encuentro
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER
	 * @model name="Encounter"
	 * @generated
	 * @ordered
	 */
	public static final int ENCOUNTER_VALUE = 47;

	/**
	 * The '<em><b>Endpoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Endpoint
	 * Endpoint
	 * 端点
	 * <!-- end-model-doc -->
	 * @see #ENDPOINT
	 * @model name="Endpoint"
	 * @generated
	 * @ordered
	 */
	public static final int ENDPOINT_VALUE = 48;

	/**
	 * The '<em><b>Enrollment Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentRequest
	 * RichiestaIscrizione
	 * DemandeInscription
	 * SolicitudDeEnrolamiento
	 * 保险注册请求
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_REQUEST
	 * @model name="EnrollmentRequest"
	 * @generated
	 * @ordered
	 */
	public static final int ENROLLMENT_REQUEST_VALUE = 49;

	/**
	 * The '<em><b>Enrollment Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentResponse
	 * RispostaIscrizione
	 * RéponseInscription
	 * RespuestaDeEnrolamiento
	 * 保险注册响应
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_RESPONSE
	 * @model name="EnrollmentResponse"
	 * @generated
	 * @ordered
	 */
	public static final int ENROLLMENT_RESPONSE_VALUE = 50;

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EpisodeOfCare
	 * EpisodioDiCura
	 * ÉpisodeDeSoins
	 * EpisodioDeCuidado
	 * 照护服务节段
	 * <!-- end-model-doc -->
	 * @see #EPISODE_OF_CARE
	 * @model name="EpisodeOfCare"
	 * @generated
	 * @ordered
	 */
	public static final int EPISODE_OF_CARE_VALUE = 51;

	/**
	 * The '<em><b>Event Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EventDefinition
	 * DefinizioneEvento
	 * DefinitionDeEvento
	 * 事件定义
	 * <!-- end-model-doc -->
	 * @see #EVENT_DEFINITION
	 * @model name="EventDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_DEFINITION_VALUE = 52;

	/**
	 * The '<em><b>Evidence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE
	 * @model name="Evidence"
	 * @generated
	 * @ordered
	 */
	public static final int EVIDENCE_VALUE = 53;

	/**
	 * The '<em><b>Evidence Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EvidenceReport
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE_REPORT
	 * @model name="EvidenceReport"
	 * @generated
	 * @ordered
	 */
	public static final int EVIDENCE_REPORT_VALUE = 54;

	/**
	 * The '<em><b>Evidence Variable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EvidenceVariable
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE_VARIABLE
	 * @model name="EvidenceVariable"
	 * @generated
	 * @ordered
	 */
	public static final int EVIDENCE_VARIABLE_VALUE = 55;

	/**
	 * The '<em><b>Example Scenario</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExampleScenario
	 * ScenarioDiEsempio
	 * EjemploDeEscenario
	 * 示例场景
	 * <!-- end-model-doc -->
	 * @see #EXAMPLE_SCENARIO
	 * @model name="ExampleScenario"
	 * @generated
	 * @ordered
	 */
	public static final int EXAMPLE_SCENARIO_VALUE = 56;

	/**
	 * The '<em><b>Explanation Of Benefit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExplanationOfBenefit
	 * ExplicationDuBénéfice
	 * 赔付说明
	 * <!-- end-model-doc -->
	 * @see #EXPLANATION_OF_BENEFIT
	 * @model name="ExplanationOfBenefit"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLANATION_OF_BENEFIT_VALUE = 57;

	/**
	 * The '<em><b>Family Member History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FamilyMemberHistory
	 * HistoireMembreFamille
	 * HistorialMiembroFamiliar
	 * 家族史
	 * <!-- end-model-doc -->
	 * @see #FAMILY_MEMBER_HISTORY
	 * @model name="FamilyMemberHistory"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_MEMBER_HISTORY_VALUE = 58;

	/**
	 * The '<em><b>Flag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag
	 * Drapeau
	 * Bandera
	 * 标记
	 * <!-- end-model-doc -->
	 * @see #FLAG
	 * @model name="Flag"
	 * @generated
	 * @ordered
	 */
	public static final int FLAG_VALUE = 59;

	/**
	 * The '<em><b>Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goal
	 * But
	 * Objetivo
	 * 目标
	 * <!-- end-model-doc -->
	 * @see #GOAL
	 * @model name="Goal"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_VALUE = 60;

	/**
	 * The '<em><b>Graph Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GraphDefinition
	 * DefinitionGrafico
	 * 图形定义
	 * <!-- end-model-doc -->
	 * @see #GRAPH_DEFINITION
	 * @model name="GraphDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPH_DEFINITION_VALUE = 61;

	/**
	 * The '<em><b>Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group
	 * Gruppo
	 * Groupe
	 * Grupo
	 * 群组
	 * <!-- end-model-doc -->
	 * @see #GROUP
	 * @model name="Group"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_VALUE = 62;

	/**
	 * The '<em><b>Guidance Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GuidanceResponse
	 * RespuestaDeOrientacion
	 * 指导意见响应
	 * <!-- end-model-doc -->
	 * @see #GUIDANCE_RESPONSE
	 * @model name="GuidanceResponse"
	 * @generated
	 * @ordered
	 */
	public static final int GUIDANCE_RESPONSE_VALUE = 63;

	/**
	 * The '<em><b>Healthcare Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HealthcareService
	 * ServizioSanitario
	 * ServiceDeSanté
	 * ServicioDeCuidado
	 * 医疗保健服务项目
	 * <!-- end-model-doc -->
	 * @see #HEALTHCARE_SERVICE
	 * @model name="HealthcareService"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTHCARE_SERVICE_VALUE = 64;

	/**
	 * The '<em><b>Imaging Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingStudy
	 * EtudeImagerie
	 * EstudioImagen  / EstudioImagen
	 * 成像检查
	 * <!-- end-model-doc -->
	 * @see #IMAGING_STUDY
	 * @model name="ImagingStudy"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGING_STUDY_VALUE = 65;

	/**
	 * The '<em><b>Immunization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immunization
	 * Immunizzazione
	 * Immunisation
	 * 免疫接种
	 * Inmunización
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION
	 * @model name="Immunization"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_VALUE = 66;

	/**
	 * The '<em><b>Immunization Evaluation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationEvaluation
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_EVALUATION
	 * @model name="ImmunizationEvaluation"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_EVALUATION_VALUE = 67;

	/**
	 * The '<em><b>Immunization Recommendation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationRecommendation
	 * RecommendationImmunisation
	 * 免疫接种建议
	 * RecomendaciónInmunización /
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_RECOMMENDATION
	 * @model name="ImmunizationRecommendation"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_RECOMMENDATION_VALUE = 68;

	/**
	 * The '<em><b>Implementation Guide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImplementationGuide
	 * GuiaDeImplementacion
	 * 实施指南
	 * <!-- end-model-doc -->
	 * @see #IMPLEMENTATION_GUIDE
	 * @model name="ImplementationGuide"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTATION_GUIDE_VALUE = 69;

	/**
	 * The '<em><b>Ingredient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ingredient
	 * <!-- end-model-doc -->
	 * @see #INGREDIENT
	 * @model name="Ingredient"
	 * @generated
	 * @ordered
	 */
	public static final int INGREDIENT_VALUE = 70;

	/**
	 * The '<em><b>Insurance Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InsurancePlan
	 * <!-- end-model-doc -->
	 * @see #INSURANCE_PLAN
	 * @model name="InsurancePlan"
	 * @generated
	 * @ordered
	 */
	public static final int INSURANCE_PLAN_VALUE = 71;

	/**
	 * The '<em><b>Invoice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice
	 * <!-- end-model-doc -->
	 * @see #INVOICE
	 * @model name="Invoice"
	 * @generated
	 * @ordered
	 */
	public static final int INVOICE_VALUE = 72;

	/**
	 * The '<em><b>Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Library
	 * Librería
	 * 库
	 * <!-- end-model-doc -->
	 * @see #LIBRARY
	 * @model name="Library"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_VALUE = 73;

	/**
	 * The '<em><b>Linkage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linkage
	 * Enlace / Conexión / Vinculo / Acoplamiento 
	 * 链接关系
	 * <!-- end-model-doc -->
	 * @see #LINKAGE
	 * @model name="Linkage"
	 * @generated
	 * @ordered
	 */
	public static final int LINKAGE_VALUE = 74;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List
	 * Lista
	 * Liste
	 * 列表
	 * Lista
	 * <!-- end-model-doc -->
	 * @see #LIST
	 * @model name="List"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 75;

	/**
	 * The '<em><b>Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location
	 * Localisation
	 * 位置
	 * Locacion
	 * <!-- end-model-doc -->
	 * @see #LOCATION
	 * @model name="Location"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 76;

	/**
	 * The '<em><b>Manufactured Item Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ManufacturedItemDefinition
	 * <!-- end-model-doc -->
	 * @see #MANUFACTURED_ITEM_DEFINITION
	 * @model name="ManufacturedItemDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int MANUFACTURED_ITEM_DEFINITION_VALUE = 77;

	/**
	 * The '<em><b>Measure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure
	 * Misura
	 * Medida
	 * 指标
	 * <!-- end-model-doc -->
	 * @see #MEASURE
	 * @model name="Measure"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_VALUE = 78;

	/**
	 * The '<em><b>Measure Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MeasureReport
	 * ReporteMedida
	 * 指标报告
	 * <!-- end-model-doc -->
	 * @see #MEASURE_REPORT
	 * @model name="MeasureReport"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_REPORT_VALUE = 79;

	/**
	 * The '<em><b>Media</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Media
	 * Media
	 * Média
	 * Medio
	 * 媒体
	 * <!-- end-model-doc -->
	 * @see #MEDIA
	 * @model name="Media"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIA_VALUE = 80;

	/**
	 * The '<em><b>Medication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medication
	 * Médication
	 * 药物
	 * Medicación /Medicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION
	 * @model name="Medication"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_VALUE = 81;

	/**
	 * The '<em><b>Medication Administration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationAdministration
	 * AdministrationMédicaments
	 * 药物施用
	 * AdministraciónMedicación / AdministracionMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ADMINISTRATION
	 * @model name="MedicationAdministration"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_VALUE = 82;

	/**
	 * The '<em><b>Medication Dispense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationDispense
	 * DispensationMédicaments
	 * 药物配发
	 * DispensaciónMedicación /DispensacionMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_DISPENSE
	 * @model name="MedicationDispense"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_DISPENSE_VALUE = 83;

	/**
	 * The '<em><b>Medication Knowledge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationKnowledge
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_KNOWLEDGE
	 * @model name="MedicationKnowledge"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_KNOWLEDGE_VALUE = 84;

	/**
	 * The '<em><b>Medication Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationRequest
	 * PrescriptionMédicamenteuseTODO
	 * 药物请求
	 * PrescripciónMedicaciónTODO  /PrescripcionMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_REQUEST
	 * @model name="MedicationRequest"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_REQUEST_VALUE = 85;

	/**
	 * The '<em><b>Medication Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationStatement
	 * ÉtatMédication
	 * 药物声明
	 * ResumenMedicación /ResumenMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_STATEMENT
	 * @model name="MedicationStatement"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_STATEMENT_VALUE = 86;

	/**
	 * The '<em><b>Medicinal Product Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductDefinition
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_DEFINITION
	 * @model name="MedicinalProductDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_DEFINITION_VALUE = 87;

	/**
	 * The '<em><b>Message Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageDefinition
	 * DefinizioneMessaggio
	 * DefinicionMensaje
	 * 消息定义
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_DEFINITION
	 * @model name="MessageDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_DEFINITION_VALUE = 88;

	/**
	 * The '<em><b>Message Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageHeader
	 * EntêteMessage
	 * 消息标头
	 * CabeceraMensaje
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_HEADER
	 * @model name="MessageHeader"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_HEADER_VALUE = 89;

	/**
	 * The '<em><b>Molecular Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MolecularSequence
	 * SecuenciaMolecular
	 * 分子序列
	 * <!-- end-model-doc -->
	 * @see #MOLECULAR_SEQUENCE
	 * @model name="MolecularSequence"
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SEQUENCE_VALUE = 90;

	/**
	 * The '<em><b>Naming System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NamingSystem
	 * SystèmeDeNommage
	 * SistemaDeNombres
	 * 命名系统
	 * <!-- end-model-doc -->
	 * @see #NAMING_SYSTEM
	 * @model name="NamingSystem"
	 * @generated
	 * @ordered
	 */
	public static final int NAMING_SYSTEM_VALUE = 91;

	/**
	 * The '<em><b>Nutrition Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionOrder
	 * OrdreNutrition
	 * OrdenNutrición
	 * 营养医嘱
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_ORDER
	 * @model name="NutritionOrder"
	 * @generated
	 * @ordered
	 */
	public static final int NUTRITION_ORDER_VALUE = 92;

	/**
	 * The '<em><b>Nutrition Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionProduct
	 * ProduitNutritionnel
	 * ProductoNutricional
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_PRODUCT
	 * @model name="NutritionProduct"
	 * @generated
	 * @ordered
	 */
	public static final int NUTRITION_PRODUCT_VALUE = 93;

	/**
	 * The '<em><b>Observation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Observation
	 * Osservazione
	 * Observation
	 * 观察
	 * Observación
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION
	 * @model name="Observation"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_VALUE = 94;

	/**
	 * The '<em><b>Observation Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ObservationDefinition
	 * DefinizioneOsservazione
	 * DefinicionDeEspecimen
	 * 观察定义
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION_DEFINITION
	 * @model name="ObservationDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_DEFINITION_VALUE = 95;

	/**
	 * The '<em><b>Operation Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationDefinition
	 * DefinizioneOperazione
	 * DéfinitionOpération
	 * DefinicionDeOperacion
	 * 操作定义
	 * <!-- end-model-doc -->
	 * @see #OPERATION_DEFINITION
	 * @model name="OperationDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_DEFINITION_VALUE = 96;

	/**
	 * The '<em><b>Operation Outcome</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationOutcome
	 * RisultatoOperazione
	 * RésultatOpération
	 * 操作结局
	 * ResultadoOperación
	 * <!-- end-model-doc -->
	 * @see #OPERATION_OUTCOME
	 * @model name="OperationOutcome"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_OUTCOME_VALUE = 97;

	/**
	 * The '<em><b>Organization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization
	 * Organizzazione
	 * Organisation
	 * 组织机构
	 * Organización
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION
	 * @model name="Organization"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_VALUE = 98;

	/**
	 * The '<em><b>Organization Affiliation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OrganizationAffiliation
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION_AFFILIATION
	 * @model name="OrganizationAffiliation"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_AFFILIATION_VALUE = 99;

	/**
	 * The '<em><b>Packaged Product Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PackagedProductDefinition
	 * <!-- end-model-doc -->
	 * @see #PACKAGED_PRODUCT_DEFINITION
	 * @model name="PackagedProductDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGED_PRODUCT_DEFINITION_VALUE = 100;

	/**
	 * The '<em><b>Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient
	 * Paziente
	 * Patient
	 * 患者
	 * Paciente
	 * <!-- end-model-doc -->
	 * @see #PATIENT
	 * @model name="Patient"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_VALUE = 101;

	/**
	 * The '<em><b>Payment Notice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentNotice
	 * AvvisoDiPagamento
	 * AvisPaiement
	 * AvisoDePago
	 * 付款通知
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_NOTICE
	 * @model name="PaymentNotice"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_NOTICE_VALUE = 102;

	/**
	 * The '<em><b>Payment Reconciliation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentReconciliation
	 * RiconciliazionePagamento
	 * RéconciliationPaiement
	 * ConciliacionDePago
	 * 付款对账
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_RECONCILIATION
	 * @model name="PaymentReconciliation"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_RECONCILIATION_VALUE = 103;

	/**
	 * The '<em><b>Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person
	 * Persona
	 * Personne
	 * Persona
	 * 人员
	 * <!-- end-model-doc -->
	 * @see #PERSON
	 * @model name="Person"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_VALUE = 104;

	/**
	 * The '<em><b>Plan Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PlanDefinition
	 * DefinicionDePlan
	 * 计划定义
	 * <!-- end-model-doc -->
	 * @see #PLAN_DEFINITION
	 * @model name="PlanDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_DEFINITION_VALUE = 105;

	/**
	 * The '<em><b>Practitioner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Practitioner
	 * Praticien
	 * 执业人员
	 * Practicante / Profesional
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER
	 * @model name="Practitioner"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_VALUE = 106;

	/**
	 * The '<em><b>Practitioner Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PractitionerRole
	 * RolProfesional
	 * 执业人员角色
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER_ROLE
	 * @model name="PractitionerRole"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_ROLE_VALUE = 107;

	/**
	 * The '<em><b>Procedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedure
	 * Procedura
	 * Procédure
	 * 操作项目
	 * Procedimiento
	 * <!-- end-model-doc -->
	 * @see #PROCEDURE
	 * @model name="Procedure"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_VALUE = 108;

	/**
	 * The '<em><b>Provenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provenance
	 * Provenienza
	 * Provenance
	 * 出处
	 * Procedencia
	 * <!-- end-model-doc -->
	 * @see #PROVENANCE
	 * @model name="Provenance"
	 * @generated
	 * @ordered
	 */
	public static final int PROVENANCE_VALUE = 109;

	/**
	 * The '<em><b>Questionnaire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Questionnaire
	 * Questionario
	 * Questionnaire
	 * 调查问卷
	 * Cuestionario
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE
	 * @model name="Questionnaire"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONNAIRE_VALUE = 110;

	/**
	 * The '<em><b>Questionnaire Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QuestionnaireResponse
	 * RispostaQuestionario
	 * RéponseQuestionnaire
	 * RespuestaAlCuestionario
	 * 调查问卷答复
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE_RESPONSE
	 * @model name="QuestionnaireResponse"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONNAIRE_RESPONSE_VALUE = 111;

	/**
	 * The '<em><b>Regulated Authorization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RegulatedAuthorization
	 * <!-- end-model-doc -->
	 * @see #REGULATED_AUTHORIZATION
	 * @model name="RegulatedAuthorization"
	 * @generated
	 * @ordered
	 */
	public static final int REGULATED_AUTHORIZATION_VALUE = 112;

	/**
	 * The '<em><b>Related Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedPerson
	 * PersonaCorrelata
	 * PersonneEnRelation
	 * PersonaRelacionada
	 * 相关人员
	 * <!-- end-model-doc -->
	 * @see #RELATED_PERSON
	 * @model name="RelatedPerson"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_PERSON_VALUE = 113;

	/**
	 * The '<em><b>Request Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestGroup
	 * GruppoDiRichieste
	 * GrupoDeSolicitudes
	 * 请求分组
	 * <!-- end-model-doc -->
	 * @see #REQUEST_GROUP
	 * @model name="RequestGroup"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_GROUP_VALUE = 114;

	/**
	 * The '<em><b>Research Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchDefinition
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_DEFINITION
	 * @model name="ResearchDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_DEFINITION_VALUE = 115;

	/**
	 * The '<em><b>Research Element Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchElementDefinition
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_ELEMENT_DEFINITION
	 * @model name="ResearchElementDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_ELEMENT_DEFINITION_VALUE = 116;

	/**
	 * The '<em><b>Research Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchStudy
	 * EstudioDeInvestigacion
	 * 调查研究
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_STUDY
	 * @model name="ResearchStudy"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_STUDY_VALUE = 117;

	/**
	 * The '<em><b>Research Subject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchSubject
	 * SujetoDeInvestigacion
	 * 研究主题
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_SUBJECT
	 * @model name="ResearchSubject"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_SUBJECT_VALUE = 118;

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RiskAssessment
	 * ÉvaluationRisques
	 * EvaluacionDeRiesgo
	 * 风险评估
	 * <!-- end-model-doc -->
	 * @see #RISK_ASSESSMENT
	 * @model name="RiskAssessment"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_ASSESSMENT_VALUE = 119;

	/**
	 * The '<em><b>Schedule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedule
	 * Agenda
	 * 日程安排
	 * <!-- end-model-doc -->
	 * @see #SCHEDULE
	 * @model name="Schedule"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULE_VALUE = 120;

	/**
	 * The '<em><b>Search Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SearchParameter
	 * ParametroDiRicerca
	 * ParamètreRecherche
	 * ParametroDeBusqueda
	 * 搜索参数
	 * <!-- end-model-doc -->
	 * @see #SEARCH_PARAMETER
	 * @model name="SearchParameter"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_PARAMETER_VALUE = 121;

	/**
	 * The '<em><b>Service Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServiceRequest
	 * RichiestaDiServizio
	 * DemandeService
	 * PeticiónServicio
	 * 服务项目请求
	 * <!-- end-model-doc -->
	 * @see #SERVICE_REQUEST
	 * @model name="ServiceRequest"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REQUEST_VALUE = 122;

	/**
	 * The '<em><b>Slot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Slot
	 * Slot
	 * 槽位
	 * Hueco / Zocalo / Espacio
	 * <!-- end-model-doc -->
	 * @see #SLOT
	 * @model name="Slot"
	 * @generated
	 * @ordered
	 */
	public static final int SLOT_VALUE = 123;

	/**
	 * The '<em><b>Specimen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specimen
	 * Campione
	 * Spécimen
	 * 标本
	 * Especimen
	 * <!-- end-model-doc -->
	 * @see #SPECIMEN
	 * @model name="Specimen"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIMEN_VALUE = 124;

	/**
	 * The '<em><b>Specimen Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SpecimenDefinition
	 * DefinizioneCampione
	 * DefinicionDeEspecimen
	 * 标本定义
	 * <!-- end-model-doc -->
	 * @see #SPECIMEN_DEFINITION
	 * @model name="SpecimenDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIMEN_DEFINITION_VALUE = 125;

	/**
	 * The '<em><b>Structure Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StructureDefinition
	 * DefinizioneStruttura
	 * DéfinitionStructure
	 * DefinicionDeEstructura
	 * 结构定义
	 * <!-- end-model-doc -->
	 * @see #STRUCTURE_DEFINITION
	 * @model name="StructureDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_DEFINITION_VALUE = 126;

	/**
	 * The '<em><b>Structure Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StructureMap
	 * MapaDeEstructura
	 * 结构映射
	 * <!-- end-model-doc -->
	 * @see #STRUCTURE_MAP
	 * @model name="StructureMap"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_MAP_VALUE = 127;

	/**
	 * The '<em><b>Subscription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subscription
	 * Sottoscrizione
	 * Souscription
	 * 订阅
	 * Suscripción
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION
	 * @model name="Subscription"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_VALUE = 128;

	/**
	 * The '<em><b>Subscription Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionStatus
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION_STATUS
	 * @model name="SubscriptionStatus"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_STATUS_VALUE = 129;

	/**
	 * The '<em><b>Subscription Topic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionTopic
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION_TOPIC
	 * @model name="SubscriptionTopic"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_TOPIC_VALUE = 130;

	/**
	 * The '<em><b>Substance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substance
	 * Sostanza
	 * Substance
	 * 物质
	 * Sustancia
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE
	 * @model name="Substance"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_VALUE = 131;

	/**
	 * The '<em><b>Substance Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceDefinition
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_DEFINITION
	 * @model name="SubstanceDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_DEFINITION_VALUE = 132;

	/**
	 * The '<em><b>Supply Delivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyDelivery
	 * Supply Livraison
	 * 供应交付
	 * Entrega de Suministro
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_DELIVERY
	 * @model name="SupplyDelivery"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_DELIVERY_VALUE = 133;

	/**
	 * The '<em><b>Supply Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyRequest
	 * Demande d'approvisionnement
	 * 供应请求
	 * Solicitud de Suministro
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_REQUEST
	 * @model name="SupplyRequest"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_REQUEST_VALUE = 134;

	/**
	 * The '<em><b>Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Task
	 * Tarea
	 * 任务
	 * <!-- end-model-doc -->
	 * @see #TASK
	 * @model name="Task"
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 135;

	/**
	 * The '<em><b>Terminology Capabilities</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TerminologyCapabilities
	 * CapacidadTerminologica
	 * 术语服务能力
	 * <!-- end-model-doc -->
	 * @see #TERMINOLOGY_CAPABILITIES
	 * @model name="TerminologyCapabilities"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINOLOGY_CAPABILITIES_VALUE = 136;

	/**
	 * The '<em><b>Test Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestReport
	 * RapportTest
	 * ReporteDePrueba
	 * 测试报告
	 * <!-- end-model-doc -->
	 * @see #TEST_REPORT
	 * @model name="TestReport"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_REPORT_VALUE = 137;

	/**
	 * The '<em><b>Test Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestScript
	 * ScriptTest
	 * ScriptDePrueba
	 * 测试脚本
	 * <!-- end-model-doc -->
	 * @see #TEST_SCRIPT
	 * @model name="TestScript"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_SCRIPT_VALUE = 138;

	/**
	 * The '<em><b>Value Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ValueSet
	 * EnsembleValeurs
	 * 取值集合
	 * ConjuntoValores / ConjuntoDeValores
	 * <!-- end-model-doc -->
	 * @see #VALUE_SET
	 * @model name="ValueSet"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_SET_VALUE = 139;

	/**
	 * The '<em><b>Verification Result</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VerificationResult
	 * <!-- end-model-doc -->
	 * @see #VERIFICATION_RESULT
	 * @model name="VerificationResult"
	 * @generated
	 * @ordered
	 */
	public static final int VERIFICATION_RESULT_VALUE = 140;

	/**
	 * The '<em><b>Vision Prescription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VisionPrescription
	 * PrescriptionVision
	 * PrescripcionDeVision
	 * 视力处方
	 * <!-- end-model-doc -->
	 * @see #VISION_PRESCRIPTION
	 * @model name="VisionPrescription"
	 * @generated
	 * @ordered
	 */
	public static final int VISION_PRESCRIPTION_VALUE = 141;

	/**
	 * The '<em><b>Parameters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters
	 * Parametros
	 * 参数
	 * <!-- end-model-doc -->
	 * @see #PARAMETERS
	 * @model name="Parameters"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETERS_VALUE = 142;

	/**
	 * An array of all the '<em><b>Resource Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceTypeEnum[] VALUES_ARRAY =
		new ResourceTypeEnum[] {
			RESOURCE,
			BINARY,
			BUNDLE,
			DOMAIN_RESOURCE,
			ACCOUNT,
			ACTIVITY_DEFINITION,
			ADMINISTRABLE_PRODUCT_DEFINITION,
			ADVERSE_EVENT,
			ALLERGY_INTOLERANCE,
			APPOINTMENT,
			APPOINTMENT_RESPONSE,
			AUDIT_EVENT,
			BASIC,
			BIOLOGICALLY_DERIVED_PRODUCT,
			BODY_STRUCTURE,
			CAPABILITY_STATEMENT,
			CARE_PLAN,
			CARE_TEAM,
			CATALOG_ENTRY,
			CHARGE_ITEM,
			CHARGE_ITEM_DEFINITION,
			CITATION,
			CLAIM,
			CLAIM_RESPONSE,
			CLINICAL_IMPRESSION,
			CLINICAL_USE_DEFINITION,
			CODE_SYSTEM,
			COMMUNICATION,
			COMMUNICATION_REQUEST,
			COMPARTMENT_DEFINITION,
			COMPOSITION,
			CONCEPT_MAP,
			CONDITION,
			CONSENT,
			CONTRACT,
			COVERAGE,
			COVERAGE_ELIGIBILITY_REQUEST,
			COVERAGE_ELIGIBILITY_RESPONSE,
			DETECTED_ISSUE,
			DEVICE,
			DEVICE_DEFINITION,
			DEVICE_METRIC,
			DEVICE_REQUEST,
			DEVICE_USE_STATEMENT,
			DIAGNOSTIC_REPORT,
			DOCUMENT_MANIFEST,
			DOCUMENT_REFERENCE,
			ENCOUNTER,
			ENDPOINT,
			ENROLLMENT_REQUEST,
			ENROLLMENT_RESPONSE,
			EPISODE_OF_CARE,
			EVENT_DEFINITION,
			EVIDENCE,
			EVIDENCE_REPORT,
			EVIDENCE_VARIABLE,
			EXAMPLE_SCENARIO,
			EXPLANATION_OF_BENEFIT,
			FAMILY_MEMBER_HISTORY,
			FLAG,
			GOAL,
			GRAPH_DEFINITION,
			GROUP,
			GUIDANCE_RESPONSE,
			HEALTHCARE_SERVICE,
			IMAGING_STUDY,
			IMMUNIZATION,
			IMMUNIZATION_EVALUATION,
			IMMUNIZATION_RECOMMENDATION,
			IMPLEMENTATION_GUIDE,
			INGREDIENT,
			INSURANCE_PLAN,
			INVOICE,
			LIBRARY,
			LINKAGE,
			LIST,
			LOCATION,
			MANUFACTURED_ITEM_DEFINITION,
			MEASURE,
			MEASURE_REPORT,
			MEDIA,
			MEDICATION,
			MEDICATION_ADMINISTRATION,
			MEDICATION_DISPENSE,
			MEDICATION_KNOWLEDGE,
			MEDICATION_REQUEST,
			MEDICATION_STATEMENT,
			MEDICINAL_PRODUCT_DEFINITION,
			MESSAGE_DEFINITION,
			MESSAGE_HEADER,
			MOLECULAR_SEQUENCE,
			NAMING_SYSTEM,
			NUTRITION_ORDER,
			NUTRITION_PRODUCT,
			OBSERVATION,
			OBSERVATION_DEFINITION,
			OPERATION_DEFINITION,
			OPERATION_OUTCOME,
			ORGANIZATION,
			ORGANIZATION_AFFILIATION,
			PACKAGED_PRODUCT_DEFINITION,
			PATIENT,
			PAYMENT_NOTICE,
			PAYMENT_RECONCILIATION,
			PERSON,
			PLAN_DEFINITION,
			PRACTITIONER,
			PRACTITIONER_ROLE,
			PROCEDURE,
			PROVENANCE,
			QUESTIONNAIRE,
			QUESTIONNAIRE_RESPONSE,
			REGULATED_AUTHORIZATION,
			RELATED_PERSON,
			REQUEST_GROUP,
			RESEARCH_DEFINITION,
			RESEARCH_ELEMENT_DEFINITION,
			RESEARCH_STUDY,
			RESEARCH_SUBJECT,
			RISK_ASSESSMENT,
			SCHEDULE,
			SEARCH_PARAMETER,
			SERVICE_REQUEST,
			SLOT,
			SPECIMEN,
			SPECIMEN_DEFINITION,
			STRUCTURE_DEFINITION,
			STRUCTURE_MAP,
			SUBSCRIPTION,
			SUBSCRIPTION_STATUS,
			SUBSCRIPTION_TOPIC,
			SUBSTANCE,
			SUBSTANCE_DEFINITION,
			SUPPLY_DELIVERY,
			SUPPLY_REQUEST,
			TASK,
			TERMINOLOGY_CAPABILITIES,
			TEST_REPORT,
			TEST_SCRIPT,
			VALUE_SET,
			VERIFICATION_RESULT,
			VISION_PRESCRIPTION,
			PARAMETERS,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceTypeEnum get(int value) {
		switch (value) {
			case RESOURCE_VALUE: return RESOURCE;
			case BINARY_VALUE: return BINARY;
			case BUNDLE_VALUE: return BUNDLE;
			case DOMAIN_RESOURCE_VALUE: return DOMAIN_RESOURCE;
			case ACCOUNT_VALUE: return ACCOUNT;
			case ACTIVITY_DEFINITION_VALUE: return ACTIVITY_DEFINITION;
			case ADMINISTRABLE_PRODUCT_DEFINITION_VALUE: return ADMINISTRABLE_PRODUCT_DEFINITION;
			case ADVERSE_EVENT_VALUE: return ADVERSE_EVENT;
			case ALLERGY_INTOLERANCE_VALUE: return ALLERGY_INTOLERANCE;
			case APPOINTMENT_VALUE: return APPOINTMENT;
			case APPOINTMENT_RESPONSE_VALUE: return APPOINTMENT_RESPONSE;
			case AUDIT_EVENT_VALUE: return AUDIT_EVENT;
			case BASIC_VALUE: return BASIC;
			case BIOLOGICALLY_DERIVED_PRODUCT_VALUE: return BIOLOGICALLY_DERIVED_PRODUCT;
			case BODY_STRUCTURE_VALUE: return BODY_STRUCTURE;
			case CAPABILITY_STATEMENT_VALUE: return CAPABILITY_STATEMENT;
			case CARE_PLAN_VALUE: return CARE_PLAN;
			case CARE_TEAM_VALUE: return CARE_TEAM;
			case CATALOG_ENTRY_VALUE: return CATALOG_ENTRY;
			case CHARGE_ITEM_VALUE: return CHARGE_ITEM;
			case CHARGE_ITEM_DEFINITION_VALUE: return CHARGE_ITEM_DEFINITION;
			case CITATION_VALUE: return CITATION;
			case CLAIM_VALUE: return CLAIM;
			case CLAIM_RESPONSE_VALUE: return CLAIM_RESPONSE;
			case CLINICAL_IMPRESSION_VALUE: return CLINICAL_IMPRESSION;
			case CLINICAL_USE_DEFINITION_VALUE: return CLINICAL_USE_DEFINITION;
			case CODE_SYSTEM_VALUE: return CODE_SYSTEM;
			case COMMUNICATION_VALUE: return COMMUNICATION;
			case COMMUNICATION_REQUEST_VALUE: return COMMUNICATION_REQUEST;
			case COMPARTMENT_DEFINITION_VALUE: return COMPARTMENT_DEFINITION;
			case COMPOSITION_VALUE: return COMPOSITION;
			case CONCEPT_MAP_VALUE: return CONCEPT_MAP;
			case CONDITION_VALUE: return CONDITION;
			case CONSENT_VALUE: return CONSENT;
			case CONTRACT_VALUE: return CONTRACT;
			case COVERAGE_VALUE: return COVERAGE;
			case COVERAGE_ELIGIBILITY_REQUEST_VALUE: return COVERAGE_ELIGIBILITY_REQUEST;
			case COVERAGE_ELIGIBILITY_RESPONSE_VALUE: return COVERAGE_ELIGIBILITY_RESPONSE;
			case DETECTED_ISSUE_VALUE: return DETECTED_ISSUE;
			case DEVICE_VALUE: return DEVICE;
			case DEVICE_DEFINITION_VALUE: return DEVICE_DEFINITION;
			case DEVICE_METRIC_VALUE: return DEVICE_METRIC;
			case DEVICE_REQUEST_VALUE: return DEVICE_REQUEST;
			case DEVICE_USE_STATEMENT_VALUE: return DEVICE_USE_STATEMENT;
			case DIAGNOSTIC_REPORT_VALUE: return DIAGNOSTIC_REPORT;
			case DOCUMENT_MANIFEST_VALUE: return DOCUMENT_MANIFEST;
			case DOCUMENT_REFERENCE_VALUE: return DOCUMENT_REFERENCE;
			case ENCOUNTER_VALUE: return ENCOUNTER;
			case ENDPOINT_VALUE: return ENDPOINT;
			case ENROLLMENT_REQUEST_VALUE: return ENROLLMENT_REQUEST;
			case ENROLLMENT_RESPONSE_VALUE: return ENROLLMENT_RESPONSE;
			case EPISODE_OF_CARE_VALUE: return EPISODE_OF_CARE;
			case EVENT_DEFINITION_VALUE: return EVENT_DEFINITION;
			case EVIDENCE_VALUE: return EVIDENCE;
			case EVIDENCE_REPORT_VALUE: return EVIDENCE_REPORT;
			case EVIDENCE_VARIABLE_VALUE: return EVIDENCE_VARIABLE;
			case EXAMPLE_SCENARIO_VALUE: return EXAMPLE_SCENARIO;
			case EXPLANATION_OF_BENEFIT_VALUE: return EXPLANATION_OF_BENEFIT;
			case FAMILY_MEMBER_HISTORY_VALUE: return FAMILY_MEMBER_HISTORY;
			case FLAG_VALUE: return FLAG;
			case GOAL_VALUE: return GOAL;
			case GRAPH_DEFINITION_VALUE: return GRAPH_DEFINITION;
			case GROUP_VALUE: return GROUP;
			case GUIDANCE_RESPONSE_VALUE: return GUIDANCE_RESPONSE;
			case HEALTHCARE_SERVICE_VALUE: return HEALTHCARE_SERVICE;
			case IMAGING_STUDY_VALUE: return IMAGING_STUDY;
			case IMMUNIZATION_VALUE: return IMMUNIZATION;
			case IMMUNIZATION_EVALUATION_VALUE: return IMMUNIZATION_EVALUATION;
			case IMMUNIZATION_RECOMMENDATION_VALUE: return IMMUNIZATION_RECOMMENDATION;
			case IMPLEMENTATION_GUIDE_VALUE: return IMPLEMENTATION_GUIDE;
			case INGREDIENT_VALUE: return INGREDIENT;
			case INSURANCE_PLAN_VALUE: return INSURANCE_PLAN;
			case INVOICE_VALUE: return INVOICE;
			case LIBRARY_VALUE: return LIBRARY;
			case LINKAGE_VALUE: return LINKAGE;
			case LIST_VALUE: return LIST;
			case LOCATION_VALUE: return LOCATION;
			case MANUFACTURED_ITEM_DEFINITION_VALUE: return MANUFACTURED_ITEM_DEFINITION;
			case MEASURE_VALUE: return MEASURE;
			case MEASURE_REPORT_VALUE: return MEASURE_REPORT;
			case MEDIA_VALUE: return MEDIA;
			case MEDICATION_VALUE: return MEDICATION;
			case MEDICATION_ADMINISTRATION_VALUE: return MEDICATION_ADMINISTRATION;
			case MEDICATION_DISPENSE_VALUE: return MEDICATION_DISPENSE;
			case MEDICATION_KNOWLEDGE_VALUE: return MEDICATION_KNOWLEDGE;
			case MEDICATION_REQUEST_VALUE: return MEDICATION_REQUEST;
			case MEDICATION_STATEMENT_VALUE: return MEDICATION_STATEMENT;
			case MEDICINAL_PRODUCT_DEFINITION_VALUE: return MEDICINAL_PRODUCT_DEFINITION;
			case MESSAGE_DEFINITION_VALUE: return MESSAGE_DEFINITION;
			case MESSAGE_HEADER_VALUE: return MESSAGE_HEADER;
			case MOLECULAR_SEQUENCE_VALUE: return MOLECULAR_SEQUENCE;
			case NAMING_SYSTEM_VALUE: return NAMING_SYSTEM;
			case NUTRITION_ORDER_VALUE: return NUTRITION_ORDER;
			case NUTRITION_PRODUCT_VALUE: return NUTRITION_PRODUCT;
			case OBSERVATION_VALUE: return OBSERVATION;
			case OBSERVATION_DEFINITION_VALUE: return OBSERVATION_DEFINITION;
			case OPERATION_DEFINITION_VALUE: return OPERATION_DEFINITION;
			case OPERATION_OUTCOME_VALUE: return OPERATION_OUTCOME;
			case ORGANIZATION_VALUE: return ORGANIZATION;
			case ORGANIZATION_AFFILIATION_VALUE: return ORGANIZATION_AFFILIATION;
			case PACKAGED_PRODUCT_DEFINITION_VALUE: return PACKAGED_PRODUCT_DEFINITION;
			case PATIENT_VALUE: return PATIENT;
			case PAYMENT_NOTICE_VALUE: return PAYMENT_NOTICE;
			case PAYMENT_RECONCILIATION_VALUE: return PAYMENT_RECONCILIATION;
			case PERSON_VALUE: return PERSON;
			case PLAN_DEFINITION_VALUE: return PLAN_DEFINITION;
			case PRACTITIONER_VALUE: return PRACTITIONER;
			case PRACTITIONER_ROLE_VALUE: return PRACTITIONER_ROLE;
			case PROCEDURE_VALUE: return PROCEDURE;
			case PROVENANCE_VALUE: return PROVENANCE;
			case QUESTIONNAIRE_VALUE: return QUESTIONNAIRE;
			case QUESTIONNAIRE_RESPONSE_VALUE: return QUESTIONNAIRE_RESPONSE;
			case REGULATED_AUTHORIZATION_VALUE: return REGULATED_AUTHORIZATION;
			case RELATED_PERSON_VALUE: return RELATED_PERSON;
			case REQUEST_GROUP_VALUE: return REQUEST_GROUP;
			case RESEARCH_DEFINITION_VALUE: return RESEARCH_DEFINITION;
			case RESEARCH_ELEMENT_DEFINITION_VALUE: return RESEARCH_ELEMENT_DEFINITION;
			case RESEARCH_STUDY_VALUE: return RESEARCH_STUDY;
			case RESEARCH_SUBJECT_VALUE: return RESEARCH_SUBJECT;
			case RISK_ASSESSMENT_VALUE: return RISK_ASSESSMENT;
			case SCHEDULE_VALUE: return SCHEDULE;
			case SEARCH_PARAMETER_VALUE: return SEARCH_PARAMETER;
			case SERVICE_REQUEST_VALUE: return SERVICE_REQUEST;
			case SLOT_VALUE: return SLOT;
			case SPECIMEN_VALUE: return SPECIMEN;
			case SPECIMEN_DEFINITION_VALUE: return SPECIMEN_DEFINITION;
			case STRUCTURE_DEFINITION_VALUE: return STRUCTURE_DEFINITION;
			case STRUCTURE_MAP_VALUE: return STRUCTURE_MAP;
			case SUBSCRIPTION_VALUE: return SUBSCRIPTION;
			case SUBSCRIPTION_STATUS_VALUE: return SUBSCRIPTION_STATUS;
			case SUBSCRIPTION_TOPIC_VALUE: return SUBSCRIPTION_TOPIC;
			case SUBSTANCE_VALUE: return SUBSTANCE;
			case SUBSTANCE_DEFINITION_VALUE: return SUBSTANCE_DEFINITION;
			case SUPPLY_DELIVERY_VALUE: return SUPPLY_DELIVERY;
			case SUPPLY_REQUEST_VALUE: return SUPPLY_REQUEST;
			case TASK_VALUE: return TASK;
			case TERMINOLOGY_CAPABILITIES_VALUE: return TERMINOLOGY_CAPABILITIES;
			case TEST_REPORT_VALUE: return TEST_REPORT;
			case TEST_SCRIPT_VALUE: return TEST_SCRIPT;
			case VALUE_SET_VALUE: return VALUE_SET;
			case VERIFICATION_RESULT_VALUE: return VERIFICATION_RESULT;
			case VISION_PRESCRIPTION_VALUE: return VISION_PRESCRIPTION;
			case PARAMETERS_VALUE: return PARAMETERS;
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
	private ResourceTypeEnum(int value, String name, String literal) {
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
	
} //ResourceTypeEnum

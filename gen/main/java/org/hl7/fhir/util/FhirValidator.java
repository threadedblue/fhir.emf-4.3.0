/**
 */
package org.hl7.fhir.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountCoverage;
import org.hl7.fhir.AccountGuarantor;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.AccountStatusEnum;
import org.hl7.fhir.ActionCardinalityBehavior;
import org.hl7.fhir.ActionCardinalityBehaviorEnum;
import org.hl7.fhir.ActionConditionKind;
import org.hl7.fhir.ActionConditionKindEnum;
import org.hl7.fhir.ActionGroupingBehavior;
import org.hl7.fhir.ActionGroupingBehaviorEnum;
import org.hl7.fhir.ActionParticipantType;
import org.hl7.fhir.ActionParticipantTypeEnum;
import org.hl7.fhir.ActionPrecheckBehavior;
import org.hl7.fhir.ActionPrecheckBehaviorEnum;
import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.ActionRelationshipTypeEnum;
import org.hl7.fhir.ActionRequiredBehavior;
import org.hl7.fhir.ActionRequiredBehaviorEnum;
import org.hl7.fhir.ActionSelectionBehavior;
import org.hl7.fhir.ActionSelectionBehaviorEnum;
import org.hl7.fhir.ActivityDefinition;
import org.hl7.fhir.ActivityDefinitionDynamicValue;
import org.hl7.fhir.ActivityDefinitionParticipant;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressTypeEnum;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AddressUseEnum;
import org.hl7.fhir.AdministrableProductDefinition;
import org.hl7.fhir.AdministrableProductDefinitionProperty;
import org.hl7.fhir.AdministrableProductDefinitionRouteOfAdministration;
import org.hl7.fhir.AdministrableProductDefinitionTargetSpecies;
import org.hl7.fhir.AdministrableProductDefinitionWithdrawalPeriod;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.AdministrativeGenderEnum;
import org.hl7.fhir.AdverseEvent;
import org.hl7.fhir.AdverseEventActuality;
import org.hl7.fhir.AdverseEventActualityEnum;
import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.AdverseEventSuspectEntity;
import org.hl7.fhir.Age;
import org.hl7.fhir.AgeUnits;
import org.hl7.fhir.AgeUnitsEnum;
import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.AggregationModeEnum;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCategoryEnum;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceCriticalityEnum;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.AllergyIntoleranceSeverityEnum;
import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.AllergyIntoleranceTypeEnum;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AppointmentStatusEnum;
import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionDirectionTypeEnum;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionOperatorTypeEnum;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.AssertionResponseTypesEnum;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventActionEnum;
import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.AuditEventAgentNetworkType;
import org.hl7.fhir.AuditEventAgentNetworkTypeEnum;
import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.AuditEventNetwork;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventOutcomeEnum;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.BindingStrengthEnum;
import org.hl7.fhir.BiologicallyDerivedProduct;
import org.hl7.fhir.BiologicallyDerivedProductCategory;
import org.hl7.fhir.BiologicallyDerivedProductCategoryEnum;
import org.hl7.fhir.BiologicallyDerivedProductCollection;
import org.hl7.fhir.BiologicallyDerivedProductManipulation;
import org.hl7.fhir.BiologicallyDerivedProductProcessing;
import org.hl7.fhir.BiologicallyDerivedProductStatus;
import org.hl7.fhir.BiologicallyDerivedProductStatusEnum;
import org.hl7.fhir.BiologicallyDerivedProductStorage;
import org.hl7.fhir.BiologicallyDerivedProductStorageScale;
import org.hl7.fhir.BiologicallyDerivedProductStorageScaleEnum;
import org.hl7.fhir.BodyStructure;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleLink;
import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.BundleTypeEnum;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CapabilityStatement;
import org.hl7.fhir.CapabilityStatementDocument;
import org.hl7.fhir.CapabilityStatementEndpoint;
import org.hl7.fhir.CapabilityStatementImplementation;
import org.hl7.fhir.CapabilityStatementInteraction;
import org.hl7.fhir.CapabilityStatementInteraction1;
import org.hl7.fhir.CapabilityStatementKind;
import org.hl7.fhir.CapabilityStatementKindEnum;
import org.hl7.fhir.CapabilityStatementMessaging;
import org.hl7.fhir.CapabilityStatementOperation;
import org.hl7.fhir.CapabilityStatementResource;
import org.hl7.fhir.CapabilityStatementRest;
import org.hl7.fhir.CapabilityStatementSearchParam;
import org.hl7.fhir.CapabilityStatementSecurity;
import org.hl7.fhir.CapabilityStatementSoftware;
import org.hl7.fhir.CapabilityStatementSupportedMessage;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanActivityKind;
import org.hl7.fhir.CarePlanActivityKindEnum;
import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.CarePlanActivityStatusEnum;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.CarePlanIntent;
import org.hl7.fhir.CarePlanIntentEnum;
import org.hl7.fhir.CareTeam;
import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.CareTeamStatus;
import org.hl7.fhir.CareTeamStatusEnum;
import org.hl7.fhir.CatalogEntry;
import org.hl7.fhir.CatalogEntryRelatedEntry;
import org.hl7.fhir.CatalogEntryRelationType;
import org.hl7.fhir.CatalogEntryRelationTypeEnum;
import org.hl7.fhir.CharacteristicCombination;
import org.hl7.fhir.CharacteristicCombinationEnum;
import org.hl7.fhir.ChargeItem;
import org.hl7.fhir.ChargeItemDefinition;
import org.hl7.fhir.ChargeItemDefinitionApplicability;
import org.hl7.fhir.ChargeItemDefinitionPriceComponent;
import org.hl7.fhir.ChargeItemDefinitionPropertyGroup;
import org.hl7.fhir.ChargeItemPerformer;
import org.hl7.fhir.ChargeItemStatus;
import org.hl7.fhir.ChargeItemStatusEnum;
import org.hl7.fhir.Citation;
import org.hl7.fhir.CitationAbstract;
import org.hl7.fhir.CitationAffiliationInfo;
import org.hl7.fhir.CitationCitedArtifact;
import org.hl7.fhir.CitationClassification;
import org.hl7.fhir.CitationClassification1;
import org.hl7.fhir.CitationContributionInstance;
import org.hl7.fhir.CitationContributorship;
import org.hl7.fhir.CitationDateOfPublication;
import org.hl7.fhir.CitationEntry;
import org.hl7.fhir.CitationPart;
import org.hl7.fhir.CitationPeriodicRelease;
import org.hl7.fhir.CitationPublicationForm;
import org.hl7.fhir.CitationPublishedIn;
import org.hl7.fhir.CitationRelatesTo;
import org.hl7.fhir.CitationRelatesTo1;
import org.hl7.fhir.CitationStatusDate;
import org.hl7.fhir.CitationStatusDate1;
import org.hl7.fhir.CitationSummary;
import org.hl7.fhir.CitationSummary1;
import org.hl7.fhir.CitationTitle;
import org.hl7.fhir.CitationVersion;
import org.hl7.fhir.CitationWebLocation;
import org.hl7.fhir.CitationWhoClassified;
import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimAccident;
import org.hl7.fhir.ClaimCareTeam;
import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimInsurance;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.ClaimRelated;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseInsurance;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponsePayment;
import org.hl7.fhir.ClaimResponseProcessNote;
import org.hl7.fhir.ClaimResponseSubDetail;
import org.hl7.fhir.ClaimResponseSubDetail1;
import org.hl7.fhir.ClaimResponseTotal;
import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.ClaimSupportingInfo;
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.ClinicalImpressionInvestigation;
import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.ClinicalImpressionStatusEnum;
import org.hl7.fhir.ClinicalUseDefinition;
import org.hl7.fhir.ClinicalUseDefinitionContraindication;
import org.hl7.fhir.ClinicalUseDefinitionIndication;
import org.hl7.fhir.ClinicalUseDefinitionInteractant;
import org.hl7.fhir.ClinicalUseDefinitionInteraction;
import org.hl7.fhir.ClinicalUseDefinitionOtherTherapy;
import org.hl7.fhir.ClinicalUseDefinitionType;
import org.hl7.fhir.ClinicalUseDefinitionTypeEnum;
import org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect;
import org.hl7.fhir.ClinicalUseDefinitionWarning;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeSearchSupport;
import org.hl7.fhir.CodeSearchSupportEnum;
import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.CodeSystemContentModeEnum;
import org.hl7.fhir.CodeSystemDesignation;
import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.CodeSystemHierarchyMeaning;
import org.hl7.fhir.CodeSystemHierarchyMeaningEnum;
import org.hl7.fhir.CodeSystemProperty;
import org.hl7.fhir.CodeSystemProperty1;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CompartmentDefinition;
import org.hl7.fhir.CompartmentDefinitionResource;
import org.hl7.fhir.CompartmentType;
import org.hl7.fhir.CompartmentTypeEnum;
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.CompositionAttestationModeEnum;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionRelatesTo;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.CompositionStatusEnum;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapEquivalenceEnum;
import org.hl7.fhir.ConceptMapGroup;
import org.hl7.fhir.ConceptMapGroupUnmappedMode;
import org.hl7.fhir.ConceptMapGroupUnmappedModeEnum;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.ConceptMapUnmapped;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionEvidence;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.ConditionalDeleteStatusEnum;
import org.hl7.fhir.ConditionalReadStatus;
import org.hl7.fhir.ConditionalReadStatusEnum;
import org.hl7.fhir.Confidentiality;
import org.hl7.fhir.ConfidentialityEnum;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.ConsentData;
import org.hl7.fhir.ConsentDataMeaning;
import org.hl7.fhir.ConsentDataMeaningEnum;
import org.hl7.fhir.ConsentPolicy;
import org.hl7.fhir.ConsentProvision;
import org.hl7.fhir.ConsentProvisionType;
import org.hl7.fhir.ConsentProvisionTypeEnum;
import org.hl7.fhir.ConsentState;
import org.hl7.fhir.ConsentStateEnum;
import org.hl7.fhir.ConsentVerification;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ConstraintSeverityEnum;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointSystemEnum;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContactPointUseEnum;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractAction;
import org.hl7.fhir.ContractAnswer;
import org.hl7.fhir.ContractAsset;
import org.hl7.fhir.ContractContentDefinition;
import org.hl7.fhir.ContractContext;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractOffer;
import org.hl7.fhir.ContractParty;
import org.hl7.fhir.ContractResourcePublicationStatusCodes;
import org.hl7.fhir.ContractResourcePublicationStatusCodesEnum;
import org.hl7.fhir.ContractResourceStatusCodes;
import org.hl7.fhir.ContractResourceStatusCodesEnum;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSecurityLabel;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractSubject;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.Contributor;
import org.hl7.fhir.ContributorType;
import org.hl7.fhir.ContributorTypeEnum;
import org.hl7.fhir.Count;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.CoverageClass;
import org.hl7.fhir.CoverageCostToBeneficiary;
import org.hl7.fhir.CoverageEligibilityRequest;
import org.hl7.fhir.CoverageEligibilityRequestDiagnosis;
import org.hl7.fhir.CoverageEligibilityRequestInsurance;
import org.hl7.fhir.CoverageEligibilityRequestItem;
import org.hl7.fhir.CoverageEligibilityRequestSupportingInfo;
import org.hl7.fhir.CoverageEligibilityResponse;
import org.hl7.fhir.CoverageEligibilityResponseBenefit;
import org.hl7.fhir.CoverageEligibilityResponseError;
import org.hl7.fhir.CoverageEligibilityResponseInsurance;
import org.hl7.fhir.CoverageEligibilityResponseItem;
import org.hl7.fhir.CoverageException;
import org.hl7.fhir.CriteriaNotExistsBehavior;
import org.hl7.fhir.CriteriaNotExistsBehaviorEnum;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.DataRequirementSort;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.DaysOfWeekEnum;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.DefinitionResourceType;
import org.hl7.fhir.DefinitionResourceTypeEnum;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.DetectedIssueEvidence;
import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.DetectedIssueSeverityEnum;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceDefinition;
import org.hl7.fhir.DeviceDefinitionCapability;
import org.hl7.fhir.DeviceDefinitionDeviceName;
import org.hl7.fhir.DeviceDefinitionMaterial;
import org.hl7.fhir.DeviceDefinitionProperty;
import org.hl7.fhir.DeviceDefinitionSpecialization;
import org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier;
import org.hl7.fhir.DeviceDeviceName;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.DeviceMetricCalibrationStateEnum;
import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.DeviceMetricCalibrationTypeEnum;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricCategoryEnum;
import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.DeviceMetricColorEnum;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.DeviceMetricOperationalStatusEnum;
import org.hl7.fhir.DeviceNameType;
import org.hl7.fhir.DeviceNameTypeEnum;
import org.hl7.fhir.DeviceProperty;
import org.hl7.fhir.DeviceRequest;
import org.hl7.fhir.DeviceRequestParameter;
import org.hl7.fhir.DeviceSpecialization;
import org.hl7.fhir.DeviceUdiCarrier;
import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.DeviceUseStatementStatus;
import org.hl7.fhir.DeviceUseStatementStatusEnum;
import org.hl7.fhir.DeviceVersion;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportMedia;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DiagnosticReportStatusEnum;
import org.hl7.fhir.DiscriminatorType;
import org.hl7.fhir.DiscriminatorTypeEnum;
import org.hl7.fhir.Distance;
import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.DocumentManifestRelated;
import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.DocumentModeEnum;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.DocumentReferenceStatusEnum;
import org.hl7.fhir.DocumentRelationshipType;
import org.hl7.fhir.DocumentRelationshipTypeEnum;
import org.hl7.fhir.DocumentRoot;
import org.hl7.fhir.DomainResource;
import org.hl7.fhir.Dosage;
import org.hl7.fhir.DosageDoseAndRate;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Element;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionBase;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionDiscriminator;
import org.hl7.fhir.ElementDefinitionExample;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.EligibilityRequestPurpose;
import org.hl7.fhir.EligibilityRequestPurposeEnum;
import org.hl7.fhir.EligibilityResponsePurpose;
import org.hl7.fhir.EligibilityResponsePurposeEnum;
import org.hl7.fhir.EnableWhenBehavior;
import org.hl7.fhir.EnableWhenBehaviorEnum;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterClassHistory;
import org.hl7.fhir.EncounterDiagnosis;
import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.EncounterLocationStatusEnum;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.EncounterStatusEnum;
import org.hl7.fhir.EncounterStatusHistory;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.EndpointStatusEnum;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareDiagnosis;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusEnum;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.EventCapabilityMode;
import org.hl7.fhir.EventCapabilityModeEnum;
import org.hl7.fhir.EventDefinition;
import org.hl7.fhir.EventOrRequestResourceTypes;
import org.hl7.fhir.EventOrRequestResourceTypesEnum;
import org.hl7.fhir.EventResourceType;
import org.hl7.fhir.EventResourceTypeEnum;
import org.hl7.fhir.EventStatus;
import org.hl7.fhir.EventStatusEnum;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.EventTimingEnum;
import org.hl7.fhir.Evidence;
import org.hl7.fhir.EvidenceAttributeEstimate;
import org.hl7.fhir.EvidenceCertainty;
import org.hl7.fhir.EvidenceModelCharacteristic;
import org.hl7.fhir.EvidenceReport;
import org.hl7.fhir.EvidenceReportCharacteristic;
import org.hl7.fhir.EvidenceReportRelatesTo;
import org.hl7.fhir.EvidenceReportSection;
import org.hl7.fhir.EvidenceReportSubject;
import org.hl7.fhir.EvidenceSampleSize;
import org.hl7.fhir.EvidenceStatistic;
import org.hl7.fhir.EvidenceVariable;
import org.hl7.fhir.EvidenceVariable1;
import org.hl7.fhir.EvidenceVariableCategory;
import org.hl7.fhir.EvidenceVariableCharacteristic;
import org.hl7.fhir.EvidenceVariableDefinition;
import org.hl7.fhir.EvidenceVariableHandling;
import org.hl7.fhir.EvidenceVariableHandlingEnum;
import org.hl7.fhir.EvidenceVariableTimeFromStart;
import org.hl7.fhir.ExampleScenario;
import org.hl7.fhir.ExampleScenarioActor;
import org.hl7.fhir.ExampleScenarioActorType;
import org.hl7.fhir.ExampleScenarioActorTypeEnum;
import org.hl7.fhir.ExampleScenarioAlternative;
import org.hl7.fhir.ExampleScenarioContainedInstance;
import org.hl7.fhir.ExampleScenarioInstance;
import org.hl7.fhir.ExampleScenarioOperation;
import org.hl7.fhir.ExampleScenarioProcess;
import org.hl7.fhir.ExampleScenarioStep;
import org.hl7.fhir.ExampleScenarioVersion;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.ExplanationOfBenefitAccident;
import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitCareTeam;
import org.hl7.fhir.ExplanationOfBenefitDetail;
import org.hl7.fhir.ExplanationOfBenefitDetail1;
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.ExplanationOfBenefitFinancial;
import org.hl7.fhir.ExplanationOfBenefitInsurance;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.ExplanationOfBenefitPayment;
import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.ExplanationOfBenefitProcessNote;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.ExplanationOfBenefitStatus;
import org.hl7.fhir.ExplanationOfBenefitStatusEnum;
import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.ExplanationOfBenefitSubDetail1;
import org.hl7.fhir.ExplanationOfBenefitSupportingInfo;
import org.hl7.fhir.ExplanationOfBenefitTotal;
import org.hl7.fhir.Expression;
import org.hl7.fhir.ExpressionLanguage;
import org.hl7.fhir.ExpressionLanguageEnum;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContextType;
import org.hl7.fhir.ExtensionContextTypeEnum;
import org.hl7.fhir.FHIRAllTypes;
import org.hl7.fhir.FHIRAllTypesEnum;
import org.hl7.fhir.FHIRDefinedType;
import org.hl7.fhir.FHIRDefinedTypeEnum;
import org.hl7.fhir.FHIRDeviceStatus;
import org.hl7.fhir.FHIRDeviceStatusEnum;
import org.hl7.fhir.FHIRPathTypes;
import org.hl7.fhir.FHIRPathTypesEnum;
import org.hl7.fhir.FHIRSubstanceStatus;
import org.hl7.fhir.FHIRSubstanceStatusEnum;
import org.hl7.fhir.FHIRVersion;
import org.hl7.fhir.FHIRVersionEnum;
import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FamilyHistoryStatusEnum;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FilterOperator;
import org.hl7.fhir.FilterOperatorEnum;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.FinancialResourceStatusCodesEnum;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FlagStatus;
import org.hl7.fhir.FlagStatusEnum;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalLifecycleStatus;
import org.hl7.fhir.GoalLifecycleStatusEnum;
import org.hl7.fhir.GoalTarget;
import org.hl7.fhir.GraphCompartmentRule;
import org.hl7.fhir.GraphCompartmentRuleEnum;
import org.hl7.fhir.GraphCompartmentUse;
import org.hl7.fhir.GraphCompartmentUseEnum;
import org.hl7.fhir.GraphDefinition;
import org.hl7.fhir.GraphDefinitionCompartment;
import org.hl7.fhir.GraphDefinitionLink;
import org.hl7.fhir.GraphDefinitionTarget;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupMeasure;
import org.hl7.fhir.GroupMeasureEnum;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.GroupTypeEnum;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.GuidanceResponseStatusEnum;
import org.hl7.fhir.GuidePageGeneration;
import org.hl7.fhir.GuidePageGenerationEnum;
import org.hl7.fhir.GuideParameterCode;
import org.hl7.fhir.GuideParameterCodeEnum;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.HTTPVerbEnum;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.HealthcareServiceEligibility;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentifierUseEnum;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.IdentityAssuranceLevelEnum;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudyPerformer;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.ImagingStudyStatus;
import org.hl7.fhir.ImagingStudyStatusEnum;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationEducation;
import org.hl7.fhir.ImmunizationEvaluation;
import org.hl7.fhir.ImmunizationEvaluationStatusCodes;
import org.hl7.fhir.ImmunizationEvaluationStatusCodesEnum;
import org.hl7.fhir.ImmunizationPerformer;
import org.hl7.fhir.ImmunizationProtocolApplied;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationStatusCodes;
import org.hl7.fhir.ImmunizationStatusCodesEnum;
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.ImplementationGuideDefinition;
import org.hl7.fhir.ImplementationGuideDependsOn;
import org.hl7.fhir.ImplementationGuideGlobal;
import org.hl7.fhir.ImplementationGuideGrouping;
import org.hl7.fhir.ImplementationGuideManifest;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.ImplementationGuidePage1;
import org.hl7.fhir.ImplementationGuideParameter;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.ImplementationGuideResource1;
import org.hl7.fhir.ImplementationGuideTemplate;
import org.hl7.fhir.Ingredient;
import org.hl7.fhir.IngredientManufacturer;
import org.hl7.fhir.IngredientManufacturerRole;
import org.hl7.fhir.IngredientManufacturerRoleEnum;
import org.hl7.fhir.IngredientReferenceStrength;
import org.hl7.fhir.IngredientStrength;
import org.hl7.fhir.IngredientSubstance;
import org.hl7.fhir.Instant;
import org.hl7.fhir.InsurancePlan;
import org.hl7.fhir.InsurancePlanBenefit;
import org.hl7.fhir.InsurancePlanBenefit1;
import org.hl7.fhir.InsurancePlanContact;
import org.hl7.fhir.InsurancePlanCost;
import org.hl7.fhir.InsurancePlanCoverage;
import org.hl7.fhir.InsurancePlanGeneralCost;
import org.hl7.fhir.InsurancePlanLimit;
import org.hl7.fhir.InsurancePlanPlan;
import org.hl7.fhir.InsurancePlanSpecificCost;
import org.hl7.fhir.InteractionTrigger;
import org.hl7.fhir.InteractionTriggerEnum;
import org.hl7.fhir.Invoice;
import org.hl7.fhir.InvoiceLineItem;
import org.hl7.fhir.InvoiceParticipant;
import org.hl7.fhir.InvoicePriceComponent;
import org.hl7.fhir.InvoicePriceComponentType;
import org.hl7.fhir.InvoicePriceComponentTypeEnum;
import org.hl7.fhir.InvoiceStatus;
import org.hl7.fhir.InvoiceStatusEnum;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.IssueSeverityEnum;
import org.hl7.fhir.IssueType;
import org.hl7.fhir.IssueTypeEnum;
import org.hl7.fhir.KnowledgeResourceType;
import org.hl7.fhir.KnowledgeResourceTypeEnum;
import org.hl7.fhir.Library;
import org.hl7.fhir.LinkType;
import org.hl7.fhir.LinkTypeEnum;
import org.hl7.fhir.Linkage;
import org.hl7.fhir.LinkageItem;
import org.hl7.fhir.LinkageType;
import org.hl7.fhir.LinkageTypeEnum;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListModeEnum;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.ListStatusEnum;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationHoursOfOperation;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationModeEnum;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
import org.hl7.fhir.LocationStatusEnum;
import org.hl7.fhir.ManufacturedItemDefinition;
import org.hl7.fhir.ManufacturedItemDefinitionProperty;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MarketingStatus;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasureComponent;
import org.hl7.fhir.MeasureGroup;
import org.hl7.fhir.MeasurePopulation;
import org.hl7.fhir.MeasureReport;
import org.hl7.fhir.MeasureReportComponent;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportPopulation;
import org.hl7.fhir.MeasureReportPopulation1;
import org.hl7.fhir.MeasureReportStatus;
import org.hl7.fhir.MeasureReportStatusEnum;
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.MeasureReportStratum;
import org.hl7.fhir.MeasureReportType;
import org.hl7.fhir.MeasureReportTypeEnum;
import org.hl7.fhir.MeasureStratifier;
import org.hl7.fhir.MeasureSupplementalData;
import org.hl7.fhir.Media;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationPerformer;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispensePerformer;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.MedicationKnowledge;
import org.hl7.fhir.MedicationKnowledgeAdministrationGuidelines;
import org.hl7.fhir.MedicationKnowledgeCost;
import org.hl7.fhir.MedicationKnowledgeDosage;
import org.hl7.fhir.MedicationKnowledgeDrugCharacteristic;
import org.hl7.fhir.MedicationKnowledgeIngredient;
import org.hl7.fhir.MedicationKnowledgeKinetics;
import org.hl7.fhir.MedicationKnowledgeMaxDispense;
import org.hl7.fhir.MedicationKnowledgeMedicineClassification;
import org.hl7.fhir.MedicationKnowledgeMonitoringProgram;
import org.hl7.fhir.MedicationKnowledgeMonograph;
import org.hl7.fhir.MedicationKnowledgePackaging;
import org.hl7.fhir.MedicationKnowledgePatientCharacteristics;
import org.hl7.fhir.MedicationKnowledgeRegulatory;
import org.hl7.fhir.MedicationKnowledgeRelatedMedicationKnowledge;
import org.hl7.fhir.MedicationKnowledgeSchedule;
import org.hl7.fhir.MedicationKnowledgeSubstitution;
import org.hl7.fhir.MedicationRequest;
import org.hl7.fhir.MedicationRequestDispenseRequest;
import org.hl7.fhir.MedicationRequestInitialFill;
import org.hl7.fhir.MedicationRequestIntent;
import org.hl7.fhir.MedicationRequestIntentEnum;
import org.hl7.fhir.MedicationRequestSubstitution;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementStatusCodes;
import org.hl7.fhir.MedicationStatementStatusCodesEnum;
import org.hl7.fhir.MedicationStatusCodes;
import org.hl7.fhir.MedicationStatusCodesEnum;
import org.hl7.fhir.MedicationrequestStatus;
import org.hl7.fhir.MedicationrequestStatusEnum;
import org.hl7.fhir.MedicinalProductDefinition;
import org.hl7.fhir.MedicinalProductDefinitionCharacteristic;
import org.hl7.fhir.MedicinalProductDefinitionContact;
import org.hl7.fhir.MedicinalProductDefinitionCountryLanguage;
import org.hl7.fhir.MedicinalProductDefinitionCrossReference;
import org.hl7.fhir.MedicinalProductDefinitionName;
import org.hl7.fhir.MedicinalProductDefinitionNamePart;
import org.hl7.fhir.MedicinalProductDefinitionOperation;
import org.hl7.fhir.MessageDefinition;
import org.hl7.fhir.MessageDefinitionAllowedResponse;
import org.hl7.fhir.MessageDefinitionFocus;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.MessageSignificanceCategory;
import org.hl7.fhir.MessageSignificanceCategoryEnum;
import org.hl7.fhir.MessageheaderResponseRequest;
import org.hl7.fhir.MessageheaderResponseRequestEnum;
import org.hl7.fhir.Meta;
import org.hl7.fhir.MolecularSequence;
import org.hl7.fhir.MolecularSequenceInner;
import org.hl7.fhir.MolecularSequenceOuter;
import org.hl7.fhir.MolecularSequenceQuality;
import org.hl7.fhir.MolecularSequenceReferenceSeq;
import org.hl7.fhir.MolecularSequenceRepository;
import org.hl7.fhir.MolecularSequenceRoc;
import org.hl7.fhir.MolecularSequenceStructureVariant;
import org.hl7.fhir.MolecularSequenceVariant;
import org.hl7.fhir.Money;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.NameUseEnum;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemIdentifierTypeEnum;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemTypeEnum;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NarrativeStatusEnum;
import org.hl7.fhir.NoteType;
import org.hl7.fhir.NoteTypeEnum;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.NutritionOrderAdministration;
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.NutritionOrderNutrient;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderSupplement;
import org.hl7.fhir.NutritionOrderTexture;
import org.hl7.fhir.NutritionProduct;
import org.hl7.fhir.NutritionProductIngredient;
import org.hl7.fhir.NutritionProductInstance;
import org.hl7.fhir.NutritionProductNutrient;
import org.hl7.fhir.NutritionProductProductCharacteristic;
import org.hl7.fhir.NutritionProductStatus;
import org.hl7.fhir.NutritionProductStatusEnum;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.ObservationDataType;
import org.hl7.fhir.ObservationDataTypeEnum;
import org.hl7.fhir.ObservationDefinition;
import org.hl7.fhir.ObservationDefinitionQualifiedInterval;
import org.hl7.fhir.ObservationDefinitionQuantitativeDetails;
import org.hl7.fhir.ObservationRangeCategory;
import org.hl7.fhir.ObservationRangeCategoryEnum;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.ObservationStatusEnum;
import org.hl7.fhir.Oid;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionOverload;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationDefinitionReferencedFrom;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.OperationKindEnum;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.OperationOutcomeIssue;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.OperationParameterUseEnum;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationAffiliation;
import org.hl7.fhir.OrganizationContact;
import org.hl7.fhir.OrientationType;
import org.hl7.fhir.OrientationTypeEnum;
import org.hl7.fhir.PackagedProductDefinition;
import org.hl7.fhir.PackagedProductDefinitionContainedItem;
import org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply;
import org.hl7.fhir.PackagedProductDefinitionPackage;
import org.hl7.fhir.PackagedProductDefinitionProperty;
import org.hl7.fhir.PackagedProductDefinitionShelfLifeStorage;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ParticipantRequired;
import org.hl7.fhir.ParticipantRequiredEnum;
import org.hl7.fhir.ParticipationStatus;
import org.hl7.fhir.ParticipationStatusEnum;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PatientCommunication;
import org.hl7.fhir.PatientContact;
import org.hl7.fhir.PatientLink;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.PaymentReconciliationProcessNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Person;
import org.hl7.fhir.PersonLink;
import org.hl7.fhir.PlanDefinition;
import org.hl7.fhir.PlanDefinitionAction;
import org.hl7.fhir.PlanDefinitionCondition;
import org.hl7.fhir.PlanDefinitionDynamicValue;
import org.hl7.fhir.PlanDefinitionGoal;
import org.hl7.fhir.PlanDefinitionParticipant;
import org.hl7.fhir.PlanDefinitionRelatedAction;
import org.hl7.fhir.PlanDefinitionTarget;
import org.hl7.fhir.Population;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerQualification;
import org.hl7.fhir.PractitionerRole;
import org.hl7.fhir.PractitionerRoleAvailableTime;
import org.hl7.fhir.PractitionerRoleNotAvailable;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProdCharacteristic;
import org.hl7.fhir.ProductShelfLife;
import org.hl7.fhir.PropertyRepresentation;
import org.hl7.fhir.PropertyRepresentationEnum;
import org.hl7.fhir.PropertyType;
import org.hl7.fhir.PropertyTypeEnum;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.ProvenanceEntityRoleEnum;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.PublicationStatusEnum;
import org.hl7.fhir.QualityType;
import org.hl7.fhir.QualityTypeEnum;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.QuantityComparatorEnum;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireAnswerOption;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireInitial;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemOperator;
import org.hl7.fhir.QuestionnaireItemOperatorEnum;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.QuestionnaireItemTypeEnum;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.QuestionnaireResponseAnswer;
import org.hl7.fhir.QuestionnaireResponseItem;
import org.hl7.fhir.QuestionnaireResponseStatus;
import org.hl7.fhir.QuestionnaireResponseStatusEnum;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.RatioRange;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferenceHandlingPolicy;
import org.hl7.fhir.ReferenceHandlingPolicyEnum;
import org.hl7.fhir.ReferenceVersionRules;
import org.hl7.fhir.ReferenceVersionRulesEnum;
import org.hl7.fhir.RegulatedAuthorization;
import org.hl7.fhir.RegulatedAuthorizationCase;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.RelatedArtifactType;
import org.hl7.fhir.RelatedArtifactTypeEnum;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RelatedPersonCommunication;
import org.hl7.fhir.RemittanceOutcome;
import org.hl7.fhir.RemittanceOutcomeEnum;
import org.hl7.fhir.ReportRelationshipType;
import org.hl7.fhir.ReportRelationshipTypeEnum;
import org.hl7.fhir.RepositoryType;
import org.hl7.fhir.RepositoryTypeEnum;
import org.hl7.fhir.RequestGroup;
import org.hl7.fhir.RequestGroupAction;
import org.hl7.fhir.RequestGroupCondition;
import org.hl7.fhir.RequestGroupRelatedAction;
import org.hl7.fhir.RequestIntent;
import org.hl7.fhir.RequestIntentEnum;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.RequestPriorityEnum;
import org.hl7.fhir.RequestResourceType;
import org.hl7.fhir.RequestResourceTypeEnum;
import org.hl7.fhir.RequestStatus;
import org.hl7.fhir.RequestStatusEnum;
import org.hl7.fhir.ResearchDefinition;
import org.hl7.fhir.ResearchElementDefinition;
import org.hl7.fhir.ResearchElementDefinitionCharacteristic;
import org.hl7.fhir.ResearchElementType;
import org.hl7.fhir.ResearchElementTypeEnum;
import org.hl7.fhir.ResearchStudy;
import org.hl7.fhir.ResearchStudyArm;
import org.hl7.fhir.ResearchStudyObjective;
import org.hl7.fhir.ResearchStudyStatus;
import org.hl7.fhir.ResearchStudyStatusEnum;
import org.hl7.fhir.ResearchSubject;
import org.hl7.fhir.ResearchSubjectStatus;
import org.hl7.fhir.ResearchSubjectStatusEnum;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.ResourceType;
import org.hl7.fhir.ResourceTypeEnum;
import org.hl7.fhir.ResourceVersionPolicy;
import org.hl7.fhir.ResourceVersionPolicyEnum;
import org.hl7.fhir.ResponseType;
import org.hl7.fhir.ResponseTypeEnum;
import org.hl7.fhir.RestfulCapabilityMode;
import org.hl7.fhir.RestfulCapabilityModeEnum;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;
import org.hl7.fhir.SPDXLicense;
import org.hl7.fhir.SPDXLicenseEnum;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchComparator;
import org.hl7.fhir.SearchComparatorEnum;
import org.hl7.fhir.SearchEntryMode;
import org.hl7.fhir.SearchEntryModeEnum;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchModifierCodeEnum;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParamTypeEnum;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterComponent;
import org.hl7.fhir.SequenceType;
import org.hl7.fhir.SequenceTypeEnum;
import org.hl7.fhir.ServiceRequest;
import org.hl7.fhir.Signature;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.SlicingRulesEnum;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;
import org.hl7.fhir.SlotStatusEnum;
import org.hl7.fhir.SortDirection;
import org.hl7.fhir.SortDirectionEnum;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenContainedPreference;
import org.hl7.fhir.SpecimenContainedPreferenceEnum;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenDefinition;
import org.hl7.fhir.SpecimenDefinitionAdditive;
import org.hl7.fhir.SpecimenDefinitionContainer;
import org.hl7.fhir.SpecimenDefinitionHandling;
import org.hl7.fhir.SpecimenDefinitionTypeTested;
import org.hl7.fhir.SpecimenProcessing;
import org.hl7.fhir.SpecimenStatus;
import org.hl7.fhir.SpecimenStatusEnum;
import org.hl7.fhir.Status;
import org.hl7.fhir.StatusEnum;
import org.hl7.fhir.StrandType;
import org.hl7.fhir.StrandTypeEnum;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionContext;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionKindEnum;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureMap;
import org.hl7.fhir.StructureMapContextType;
import org.hl7.fhir.StructureMapContextTypeEnum;
import org.hl7.fhir.StructureMapDependent;
import org.hl7.fhir.StructureMapGroup;
import org.hl7.fhir.StructureMapGroupTypeMode;
import org.hl7.fhir.StructureMapGroupTypeModeEnum;
import org.hl7.fhir.StructureMapInput;
import org.hl7.fhir.StructureMapInputMode;
import org.hl7.fhir.StructureMapInputModeEnum;
import org.hl7.fhir.StructureMapModelMode;
import org.hl7.fhir.StructureMapModelModeEnum;
import org.hl7.fhir.StructureMapParameter;
import org.hl7.fhir.StructureMapRule;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapSourceListMode;
import org.hl7.fhir.StructureMapSourceListModeEnum;
import org.hl7.fhir.StructureMapStructure;
import org.hl7.fhir.StructureMapTarget;
import org.hl7.fhir.StructureMapTargetListMode;
import org.hl7.fhir.StructureMapTargetListModeEnum;
import org.hl7.fhir.StructureMapTransform;
import org.hl7.fhir.StructureMapTransformEnum;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionChannel;
import org.hl7.fhir.SubscriptionChannelType;
import org.hl7.fhir.SubscriptionChannelTypeEnum;
import org.hl7.fhir.SubscriptionNotificationType;
import org.hl7.fhir.SubscriptionNotificationTypeEnum;
import org.hl7.fhir.SubscriptionStatus;
import org.hl7.fhir.SubscriptionStatusCodes;
import org.hl7.fhir.SubscriptionStatusCodesEnum;
import org.hl7.fhir.SubscriptionStatusNotificationEvent;
import org.hl7.fhir.SubscriptionTopic;
import org.hl7.fhir.SubscriptionTopicCanFilterBy;
import org.hl7.fhir.SubscriptionTopicEventTrigger;
import org.hl7.fhir.SubscriptionTopicNotificationShape;
import org.hl7.fhir.SubscriptionTopicQueryCriteria;
import org.hl7.fhir.SubscriptionTopicResourceTrigger;
import org.hl7.fhir.Substance;
import org.hl7.fhir.SubstanceDefinition;
import org.hl7.fhir.SubstanceDefinitionCode;
import org.hl7.fhir.SubstanceDefinitionMoiety;
import org.hl7.fhir.SubstanceDefinitionMolecularWeight;
import org.hl7.fhir.SubstanceDefinitionName;
import org.hl7.fhir.SubstanceDefinitionOfficial;
import org.hl7.fhir.SubstanceDefinitionProperty;
import org.hl7.fhir.SubstanceDefinitionRelationship;
import org.hl7.fhir.SubstanceDefinitionRepresentation;
import org.hl7.fhir.SubstanceDefinitionSourceMaterial;
import org.hl7.fhir.SubstanceDefinitionStructure;
import org.hl7.fhir.SubstanceIngredient;
import org.hl7.fhir.SubstanceInstance;
import org.hl7.fhir.SupplyDelivery;
import org.hl7.fhir.SupplyDeliveryStatus;
import org.hl7.fhir.SupplyDeliveryStatusEnum;
import org.hl7.fhir.SupplyDeliverySuppliedItem;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestParameter;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.SupplyRequestStatusEnum;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.SystemRestfulInteractionEnum;
import org.hl7.fhir.Task;
import org.hl7.fhir.TaskInput;
import org.hl7.fhir.TaskIntent;
import org.hl7.fhir.TaskIntentEnum;
import org.hl7.fhir.TaskOutput;
import org.hl7.fhir.TaskRestriction;
import org.hl7.fhir.TaskStatus;
import org.hl7.fhir.TaskStatusEnum;
import org.hl7.fhir.TerminologyCapabilities;
import org.hl7.fhir.TerminologyCapabilitiesClosure;
import org.hl7.fhir.TerminologyCapabilitiesCodeSystem;
import org.hl7.fhir.TerminologyCapabilitiesExpansion;
import org.hl7.fhir.TerminologyCapabilitiesFilter;
import org.hl7.fhir.TerminologyCapabilitiesImplementation;
import org.hl7.fhir.TerminologyCapabilitiesParameter;
import org.hl7.fhir.TerminologyCapabilitiesSoftware;
import org.hl7.fhir.TerminologyCapabilitiesTranslation;
import org.hl7.fhir.TerminologyCapabilitiesValidateCode;
import org.hl7.fhir.TerminologyCapabilitiesVersion;
import org.hl7.fhir.TestReport;
import org.hl7.fhir.TestReportAction;
import org.hl7.fhir.TestReportAction1;
import org.hl7.fhir.TestReportAction2;
import org.hl7.fhir.TestReportActionResult;
import org.hl7.fhir.TestReportActionResultEnum;
import org.hl7.fhir.TestReportAssert;
import org.hl7.fhir.TestReportOperation;
import org.hl7.fhir.TestReportParticipant;
import org.hl7.fhir.TestReportParticipantType;
import org.hl7.fhir.TestReportParticipantTypeEnum;
import org.hl7.fhir.TestReportResult;
import org.hl7.fhir.TestReportResultEnum;
import org.hl7.fhir.TestReportSetup;
import org.hl7.fhir.TestReportStatus;
import org.hl7.fhir.TestReportStatusEnum;
import org.hl7.fhir.TestReportTeardown;
import org.hl7.fhir.TestReportTest;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.TestScriptAction;
import org.hl7.fhir.TestScriptAction1;
import org.hl7.fhir.TestScriptAction2;
import org.hl7.fhir.TestScriptAssert;
import org.hl7.fhir.TestScriptCapability;
import org.hl7.fhir.TestScriptDestination;
import org.hl7.fhir.TestScriptFixture;
import org.hl7.fhir.TestScriptLink;
import org.hl7.fhir.TestScriptMetadata;
import org.hl7.fhir.TestScriptOperation;
import org.hl7.fhir.TestScriptOrigin;
import org.hl7.fhir.TestScriptRequestHeader;
import org.hl7.fhir.TestScriptRequestMethodCode;
import org.hl7.fhir.TestScriptRequestMethodCodeEnum;
import org.hl7.fhir.TestScriptSetup;
import org.hl7.fhir.TestScriptTeardown;
import org.hl7.fhir.TestScriptTest;
import org.hl7.fhir.TestScriptVariable;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.TriggerType;
import org.hl7.fhir.TriggerTypeEnum;
import org.hl7.fhir.TypeDerivationRule;
import org.hl7.fhir.TypeDerivationRuleEnum;
import org.hl7.fhir.TypeRestfulInteraction;
import org.hl7.fhir.TypeRestfulInteractionEnum;
import org.hl7.fhir.UDIEntryType;
import org.hl7.fhir.UDIEntryTypeEnum;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnitsOfTimeEnum;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Url;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.Use;
import org.hl7.fhir.UseEnum;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.ValueSetDesignation;
import org.hl7.fhir.ValueSetExpansion;
import org.hl7.fhir.ValueSetFilter;
import org.hl7.fhir.ValueSetInclude;
import org.hl7.fhir.ValueSetParameter;
import org.hl7.fhir.VariableType;
import org.hl7.fhir.VariableTypeEnum;
import org.hl7.fhir.VerificationResult;
import org.hl7.fhir.VerificationResultAttestation;
import org.hl7.fhir.VerificationResultPrimarySource;
import org.hl7.fhir.VerificationResultValidator;
import org.hl7.fhir.VisionBase;
import org.hl7.fhir.VisionBaseEnum;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionEyesEnum;
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionLensSpecification;
import org.hl7.fhir.VisionPrescriptionPrism;
import org.hl7.fhir.XPathUsageType;
import org.hl7.fhir.XPathUsageTypeEnum;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage
 * @generated
 */
public class FhirValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FhirValidator INSTANCE = new FhirValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.hl7.fhir";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FhirPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FhirPackage.ACCOUNT:
				return validateAccount((Account)value, diagnostics, context);
			case FhirPackage.ACCOUNT_COVERAGE:
				return validateAccountCoverage((AccountCoverage)value, diagnostics, context);
			case FhirPackage.ACCOUNT_GUARANTOR:
				return validateAccountGuarantor((AccountGuarantor)value, diagnostics, context);
			case FhirPackage.ACCOUNT_STATUS:
				return validateAccountStatus((AccountStatus)value, diagnostics, context);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR:
				return validateActionCardinalityBehavior((ActionCardinalityBehavior)value, diagnostics, context);
			case FhirPackage.ACTION_CONDITION_KIND:
				return validateActionConditionKind((ActionConditionKind)value, diagnostics, context);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR:
				return validateActionGroupingBehavior((ActionGroupingBehavior)value, diagnostics, context);
			case FhirPackage.ACTION_PARTICIPANT_TYPE:
				return validateActionParticipantType((ActionParticipantType)value, diagnostics, context);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR:
				return validateActionPrecheckBehavior((ActionPrecheckBehavior)value, diagnostics, context);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE:
				return validateActionRelationshipType((ActionRelationshipType)value, diagnostics, context);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR:
				return validateActionRequiredBehavior((ActionRequiredBehavior)value, diagnostics, context);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR:
				return validateActionSelectionBehavior((ActionSelectionBehavior)value, diagnostics, context);
			case FhirPackage.ACTIVITY_DEFINITION:
				return validateActivityDefinition((ActivityDefinition)value, diagnostics, context);
			case FhirPackage.ACTIVITY_DEFINITION_DYNAMIC_VALUE:
				return validateActivityDefinitionDynamicValue((ActivityDefinitionDynamicValue)value, diagnostics, context);
			case FhirPackage.ACTIVITY_DEFINITION_PARTICIPANT:
				return validateActivityDefinitionParticipant((ActivityDefinitionParticipant)value, diagnostics, context);
			case FhirPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case FhirPackage.ADDRESS_TYPE:
				return validateAddressType((AddressType)value, diagnostics, context);
			case FhirPackage.ADDRESS_USE:
				return validateAddressUse((AddressUse)value, diagnostics, context);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION:
				return validateAdministrableProductDefinition((AdministrableProductDefinition)value, diagnostics, context);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY:
				return validateAdministrableProductDefinitionProperty((AdministrableProductDefinitionProperty)value, diagnostics, context);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION:
				return validateAdministrableProductDefinitionRouteOfAdministration((AdministrableProductDefinitionRouteOfAdministration)value, diagnostics, context);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES:
				return validateAdministrableProductDefinitionTargetSpecies((AdministrableProductDefinitionTargetSpecies)value, diagnostics, context);
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD:
				return validateAdministrableProductDefinitionWithdrawalPeriod((AdministrableProductDefinitionWithdrawalPeriod)value, diagnostics, context);
			case FhirPackage.ADMINISTRATIVE_GENDER:
				return validateAdministrativeGender((AdministrativeGender)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT:
				return validateAdverseEvent((AdverseEvent)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_ACTUALITY:
				return validateAdverseEventActuality((AdverseEventActuality)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY:
				return validateAdverseEventCausality((AdverseEventCausality)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY:
				return validateAdverseEventSuspectEntity((AdverseEventSuspectEntity)value, diagnostics, context);
			case FhirPackage.AGE:
				return validateAge((Age)value, diagnostics, context);
			case FhirPackage.AGE_UNITS:
				return validateAgeUnits((AgeUnits)value, diagnostics, context);
			case FhirPackage.AGGREGATION_MODE:
				return validateAggregationMode((AggregationMode)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE:
				return validateAllergyIntolerance((AllergyIntolerance)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY:
				return validateAllergyIntoleranceCategory((AllergyIntoleranceCategory)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY:
				return validateAllergyIntoleranceCriticality((AllergyIntoleranceCriticality)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION:
				return validateAllergyIntoleranceReaction((AllergyIntoleranceReaction)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY:
				return validateAllergyIntoleranceSeverity((AllergyIntoleranceSeverity)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE:
				return validateAllergyIntoleranceType((AllergyIntoleranceType)value, diagnostics, context);
			case FhirPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case FhirPackage.APPOINTMENT:
				return validateAppointment((Appointment)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_PARTICIPANT:
				return validateAppointmentParticipant((AppointmentParticipant)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_RESPONSE:
				return validateAppointmentResponse((AppointmentResponse)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_STATUS:
				return validateAppointmentStatus((AppointmentStatus)value, diagnostics, context);
			case FhirPackage.ASSERTION_DIRECTION_TYPE:
				return validateAssertionDirectionType((AssertionDirectionType)value, diagnostics, context);
			case FhirPackage.ASSERTION_OPERATOR_TYPE:
				return validateAssertionOperatorType((AssertionOperatorType)value, diagnostics, context);
			case FhirPackage.ASSERTION_RESPONSE_TYPES:
				return validateAssertionResponseTypes((AssertionResponseTypes)value, diagnostics, context);
			case FhirPackage.ATTACHMENT:
				return validateAttachment((Attachment)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT:
				return validateAuditEvent((AuditEvent)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ACTION:
				return validateAuditEventAction((AuditEventAction)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_AGENT:
				return validateAuditEventAgent((AuditEventAgent)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE:
				return validateAuditEventAgentNetworkType((AuditEventAgentNetworkType)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_DETAIL:
				return validateAuditEventDetail((AuditEventDetail)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ENTITY:
				return validateAuditEventEntity((AuditEventEntity)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_NETWORK:
				return validateAuditEventNetwork((AuditEventNetwork)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OUTCOME:
				return validateAuditEventOutcome((AuditEventOutcome)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_SOURCE:
				return validateAuditEventSource((AuditEventSource)value, diagnostics, context);
			case FhirPackage.BACKBONE_ELEMENT:
				return validateBackboneElement((BackboneElement)value, diagnostics, context);
			case FhirPackage.BASE64_BINARY:
				return validateBase64Binary((Base64Binary)value, diagnostics, context);
			case FhirPackage.BASIC:
				return validateBasic((Basic)value, diagnostics, context);
			case FhirPackage.BINARY:
				return validateBinary((Binary)value, diagnostics, context);
			case FhirPackage.BINDING_STRENGTH:
				return validateBindingStrength((BindingStrength)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT:
				return validateBiologicallyDerivedProduct((BiologicallyDerivedProduct)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_CATEGORY:
				return validateBiologicallyDerivedProductCategory((BiologicallyDerivedProductCategory)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION:
				return validateBiologicallyDerivedProductCollection((BiologicallyDerivedProductCollection)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION:
				return validateBiologicallyDerivedProductManipulation((BiologicallyDerivedProductManipulation)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING:
				return validateBiologicallyDerivedProductProcessing((BiologicallyDerivedProductProcessing)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STATUS:
				return validateBiologicallyDerivedProductStatus((BiologicallyDerivedProductStatus)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE:
				return validateBiologicallyDerivedProductStorage((BiologicallyDerivedProductStorage)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE_SCALE:
				return validateBiologicallyDerivedProductStorageScale((BiologicallyDerivedProductStorageScale)value, diagnostics, context);
			case FhirPackage.BODY_STRUCTURE:
				return validateBodyStructure((BodyStructure)value, diagnostics, context);
			case FhirPackage.BOOLEAN:
				return validateBoolean((org.hl7.fhir.Boolean)value, diagnostics, context);
			case FhirPackage.BUNDLE:
				return validateBundle((Bundle)value, diagnostics, context);
			case FhirPackage.BUNDLE_ENTRY:
				return validateBundleEntry((BundleEntry)value, diagnostics, context);
			case FhirPackage.BUNDLE_LINK:
				return validateBundleLink((BundleLink)value, diagnostics, context);
			case FhirPackage.BUNDLE_REQUEST:
				return validateBundleRequest((BundleRequest)value, diagnostics, context);
			case FhirPackage.BUNDLE_RESPONSE:
				return validateBundleResponse((BundleResponse)value, diagnostics, context);
			case FhirPackage.BUNDLE_SEARCH:
				return validateBundleSearch((BundleSearch)value, diagnostics, context);
			case FhirPackage.BUNDLE_TYPE:
				return validateBundleType((BundleType)value, diagnostics, context);
			case FhirPackage.CANONICAL:
				return validateCanonical((Canonical)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT:
				return validateCapabilityStatement((CapabilityStatement)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_DOCUMENT:
				return validateCapabilityStatementDocument((CapabilityStatementDocument)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_ENDPOINT:
				return validateCapabilityStatementEndpoint((CapabilityStatementEndpoint)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_IMPLEMENTATION:
				return validateCapabilityStatementImplementation((CapabilityStatementImplementation)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION:
				return validateCapabilityStatementInteraction((CapabilityStatementInteraction)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION1:
				return validateCapabilityStatementInteraction1((CapabilityStatementInteraction1)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_KIND:
				return validateCapabilityStatementKind((CapabilityStatementKind)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING:
				return validateCapabilityStatementMessaging((CapabilityStatementMessaging)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_OPERATION:
				return validateCapabilityStatementOperation((CapabilityStatementOperation)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_RESOURCE:
				return validateCapabilityStatementResource((CapabilityStatementResource)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_REST:
				return validateCapabilityStatementRest((CapabilityStatementRest)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM:
				return validateCapabilityStatementSearchParam((CapabilityStatementSearchParam)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY:
				return validateCapabilityStatementSecurity((CapabilityStatementSecurity)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_SOFTWARE:
				return validateCapabilityStatementSoftware((CapabilityStatementSoftware)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_SUPPORTED_MESSAGE:
				return validateCapabilityStatementSupportedMessage((CapabilityStatementSupportedMessage)value, diagnostics, context);
			case FhirPackage.CARE_PLAN:
				return validateCarePlan((CarePlan)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY:
				return validateCarePlanActivity((CarePlanActivity)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_KIND:
				return validateCarePlanActivityKind((CarePlanActivityKind)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS:
				return validateCarePlanActivityStatus((CarePlanActivityStatus)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_DETAIL:
				return validateCarePlanDetail((CarePlanDetail)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_INTENT:
				return validateCarePlanIntent((CarePlanIntent)value, diagnostics, context);
			case FhirPackage.CARE_TEAM:
				return validateCareTeam((CareTeam)value, diagnostics, context);
			case FhirPackage.CARE_TEAM_PARTICIPANT:
				return validateCareTeamParticipant((CareTeamParticipant)value, diagnostics, context);
			case FhirPackage.CARE_TEAM_STATUS:
				return validateCareTeamStatus((CareTeamStatus)value, diagnostics, context);
			case FhirPackage.CATALOG_ENTRY:
				return validateCatalogEntry((CatalogEntry)value, diagnostics, context);
			case FhirPackage.CATALOG_ENTRY_RELATED_ENTRY:
				return validateCatalogEntryRelatedEntry((CatalogEntryRelatedEntry)value, diagnostics, context);
			case FhirPackage.CATALOG_ENTRY_RELATION_TYPE:
				return validateCatalogEntryRelationType((CatalogEntryRelationType)value, diagnostics, context);
			case FhirPackage.CHARACTERISTIC_COMBINATION:
				return validateCharacteristicCombination((CharacteristicCombination)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM:
				return validateChargeItem((ChargeItem)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_DEFINITION:
				return validateChargeItemDefinition((ChargeItemDefinition)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY:
				return validateChargeItemDefinitionApplicability((ChargeItemDefinitionApplicability)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_DEFINITION_PRICE_COMPONENT:
				return validateChargeItemDefinitionPriceComponent((ChargeItemDefinitionPriceComponent)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP:
				return validateChargeItemDefinitionPropertyGroup((ChargeItemDefinitionPropertyGroup)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_PERFORMER:
				return validateChargeItemPerformer((ChargeItemPerformer)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_STATUS:
				return validateChargeItemStatus((ChargeItemStatus)value, diagnostics, context);
			case FhirPackage.CITATION:
				return validateCitation((Citation)value, diagnostics, context);
			case FhirPackage.CITATION_ABSTRACT:
				return validateCitationAbstract((CitationAbstract)value, diagnostics, context);
			case FhirPackage.CITATION_AFFILIATION_INFO:
				return validateCitationAffiliationInfo((CitationAffiliationInfo)value, diagnostics, context);
			case FhirPackage.CITATION_CITED_ARTIFACT:
				return validateCitationCitedArtifact((CitationCitedArtifact)value, diagnostics, context);
			case FhirPackage.CITATION_CLASSIFICATION:
				return validateCitationClassification((CitationClassification)value, diagnostics, context);
			case FhirPackage.CITATION_CLASSIFICATION1:
				return validateCitationClassification1((CitationClassification1)value, diagnostics, context);
			case FhirPackage.CITATION_CONTRIBUTION_INSTANCE:
				return validateCitationContributionInstance((CitationContributionInstance)value, diagnostics, context);
			case FhirPackage.CITATION_CONTRIBUTORSHIP:
				return validateCitationContributorship((CitationContributorship)value, diagnostics, context);
			case FhirPackage.CITATION_DATE_OF_PUBLICATION:
				return validateCitationDateOfPublication((CitationDateOfPublication)value, diagnostics, context);
			case FhirPackage.CITATION_ENTRY:
				return validateCitationEntry((CitationEntry)value, diagnostics, context);
			case FhirPackage.CITATION_PART:
				return validateCitationPart((CitationPart)value, diagnostics, context);
			case FhirPackage.CITATION_PERIODIC_RELEASE:
				return validateCitationPeriodicRelease((CitationPeriodicRelease)value, diagnostics, context);
			case FhirPackage.CITATION_PUBLICATION_FORM:
				return validateCitationPublicationForm((CitationPublicationForm)value, diagnostics, context);
			case FhirPackage.CITATION_PUBLISHED_IN:
				return validateCitationPublishedIn((CitationPublishedIn)value, diagnostics, context);
			case FhirPackage.CITATION_RELATES_TO:
				return validateCitationRelatesTo((CitationRelatesTo)value, diagnostics, context);
			case FhirPackage.CITATION_RELATES_TO1:
				return validateCitationRelatesTo1((CitationRelatesTo1)value, diagnostics, context);
			case FhirPackage.CITATION_STATUS_DATE:
				return validateCitationStatusDate((CitationStatusDate)value, diagnostics, context);
			case FhirPackage.CITATION_STATUS_DATE1:
				return validateCitationStatusDate1((CitationStatusDate1)value, diagnostics, context);
			case FhirPackage.CITATION_SUMMARY:
				return validateCitationSummary((CitationSummary)value, diagnostics, context);
			case FhirPackage.CITATION_SUMMARY1:
				return validateCitationSummary1((CitationSummary1)value, diagnostics, context);
			case FhirPackage.CITATION_TITLE:
				return validateCitationTitle((CitationTitle)value, diagnostics, context);
			case FhirPackage.CITATION_VERSION:
				return validateCitationVersion((CitationVersion)value, diagnostics, context);
			case FhirPackage.CITATION_WEB_LOCATION:
				return validateCitationWebLocation((CitationWebLocation)value, diagnostics, context);
			case FhirPackage.CITATION_WHO_CLASSIFIED:
				return validateCitationWhoClassified((CitationWhoClassified)value, diagnostics, context);
			case FhirPackage.CLAIM:
				return validateClaim((Claim)value, diagnostics, context);
			case FhirPackage.CLAIM_ACCIDENT:
				return validateClaimAccident((ClaimAccident)value, diagnostics, context);
			case FhirPackage.CLAIM_CARE_TEAM:
				return validateClaimCareTeam((ClaimCareTeam)value, diagnostics, context);
			case FhirPackage.CLAIM_DETAIL:
				return validateClaimDetail((ClaimDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_DIAGNOSIS:
				return validateClaimDiagnosis((ClaimDiagnosis)value, diagnostics, context);
			case FhirPackage.CLAIM_INSURANCE:
				return validateClaimInsurance((ClaimInsurance)value, diagnostics, context);
			case FhirPackage.CLAIM_ITEM:
				return validateClaimItem((ClaimItem)value, diagnostics, context);
			case FhirPackage.CLAIM_PAYEE:
				return validateClaimPayee((ClaimPayee)value, diagnostics, context);
			case FhirPackage.CLAIM_PROCEDURE:
				return validateClaimProcedure((ClaimProcedure)value, diagnostics, context);
			case FhirPackage.CLAIM_RELATED:
				return validateClaimRelated((ClaimRelated)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE:
				return validateClaimResponse((ClaimResponse)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM:
				return validateClaimResponseAddItem((ClaimResponseAddItem)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION:
				return validateClaimResponseAdjudication((ClaimResponseAdjudication)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_DETAIL:
				return validateClaimResponseDetail((ClaimResponseDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_DETAIL1:
				return validateClaimResponseDetail1((ClaimResponseDetail1)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ERROR:
				return validateClaimResponseError((ClaimResponseError)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_INSURANCE:
				return validateClaimResponseInsurance((ClaimResponseInsurance)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ITEM:
				return validateClaimResponseItem((ClaimResponseItem)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_PAYMENT:
				return validateClaimResponsePayment((ClaimResponsePayment)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_PROCESS_NOTE:
				return validateClaimResponseProcessNote((ClaimResponseProcessNote)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL:
				return validateClaimResponseSubDetail((ClaimResponseSubDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL1:
				return validateClaimResponseSubDetail1((ClaimResponseSubDetail1)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_TOTAL:
				return validateClaimResponseTotal((ClaimResponseTotal)value, diagnostics, context);
			case FhirPackage.CLAIM_SUB_DETAIL:
				return validateClaimSubDetail((ClaimSubDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_SUPPORTING_INFO:
				return validateClaimSupportingInfo((ClaimSupportingInfo)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION:
				return validateClinicalImpression((ClinicalImpression)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_FINDING:
				return validateClinicalImpressionFinding((ClinicalImpressionFinding)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_INVESTIGATION:
				return validateClinicalImpressionInvestigation((ClinicalImpressionInvestigation)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS:
				return validateClinicalImpressionStatus((ClinicalImpressionStatus)value, diagnostics, context);
			case FhirPackage.CLINICAL_USE_DEFINITION:
				return validateClinicalUseDefinition((ClinicalUseDefinition)value, diagnostics, context);
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION:
				return validateClinicalUseDefinitionContraindication((ClinicalUseDefinitionContraindication)value, diagnostics, context);
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION:
				return validateClinicalUseDefinitionIndication((ClinicalUseDefinitionIndication)value, diagnostics, context);
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTANT:
				return validateClinicalUseDefinitionInteractant((ClinicalUseDefinitionInteractant)value, diagnostics, context);
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION:
				return validateClinicalUseDefinitionInteraction((ClinicalUseDefinitionInteraction)value, diagnostics, context);
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY:
				return validateClinicalUseDefinitionOtherTherapy((ClinicalUseDefinitionOtherTherapy)value, diagnostics, context);
			case FhirPackage.CLINICAL_USE_DEFINITION_TYPE:
				return validateClinicalUseDefinitionType((ClinicalUseDefinitionType)value, diagnostics, context);
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT:
				return validateClinicalUseDefinitionUndesirableEffect((ClinicalUseDefinitionUndesirableEffect)value, diagnostics, context);
			case FhirPackage.CLINICAL_USE_DEFINITION_WARNING:
				return validateClinicalUseDefinitionWarning((ClinicalUseDefinitionWarning)value, diagnostics, context);
			case FhirPackage.CODE:
				return validateCode((Code)value, diagnostics, context);
			case FhirPackage.CODEABLE_CONCEPT:
				return validateCodeableConcept((CodeableConcept)value, diagnostics, context);
			case FhirPackage.CODEABLE_REFERENCE:
				return validateCodeableReference((CodeableReference)value, diagnostics, context);
			case FhirPackage.CODE_SEARCH_SUPPORT:
				return validateCodeSearchSupport((CodeSearchSupport)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM:
				return validateCodeSystem((CodeSystem)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONCEPT:
				return validateCodeSystemConcept((CodeSystemConcept)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE:
				return validateCodeSystemContentMode((CodeSystemContentMode)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_DESIGNATION:
				return validateCodeSystemDesignation((CodeSystemDesignation)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_FILTER:
				return validateCodeSystemFilter((CodeSystemFilter)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING:
				return validateCodeSystemHierarchyMeaning((CodeSystemHierarchyMeaning)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_PROPERTY:
				return validateCodeSystemProperty((CodeSystemProperty)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_PROPERTY1:
				return validateCodeSystemProperty1((CodeSystemProperty1)value, diagnostics, context);
			case FhirPackage.CODING:
				return validateCoding((Coding)value, diagnostics, context);
			case FhirPackage.COMMUNICATION:
				return validateCommunication((Communication)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_PAYLOAD:
				return validateCommunicationPayload((CommunicationPayload)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST:
				return validateCommunicationRequest((CommunicationRequest)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD:
				return validateCommunicationRequestPayload((CommunicationRequestPayload)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_DEFINITION:
				return validateCompartmentDefinition((CompartmentDefinition)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE:
				return validateCompartmentDefinitionResource((CompartmentDefinitionResource)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_TYPE:
				return validateCompartmentType((CompartmentType)value, diagnostics, context);
			case FhirPackage.COMPOSITION:
				return validateComposition((Composition)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE:
				return validateCompositionAttestationMode((CompositionAttestationMode)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTER:
				return validateCompositionAttester((CompositionAttester)value, diagnostics, context);
			case FhirPackage.COMPOSITION_EVENT:
				return validateCompositionEvent((CompositionEvent)value, diagnostics, context);
			case FhirPackage.COMPOSITION_RELATES_TO:
				return validateCompositionRelatesTo((CompositionRelatesTo)value, diagnostics, context);
			case FhirPackage.COMPOSITION_SECTION:
				return validateCompositionSection((CompositionSection)value, diagnostics, context);
			case FhirPackage.COMPOSITION_STATUS:
				return validateCompositionStatus((CompositionStatus)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP:
				return validateConceptMap((ConceptMap)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_DEPENDS_ON:
				return validateConceptMapDependsOn((ConceptMapDependsOn)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_ELEMENT:
				return validateConceptMapElement((ConceptMapElement)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE:
				return validateConceptMapEquivalence((ConceptMapEquivalence)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_GROUP:
				return validateConceptMapGroup((ConceptMapGroup)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE:
				return validateConceptMapGroupUnmappedMode((ConceptMapGroupUnmappedMode)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_TARGET:
				return validateConceptMapTarget((ConceptMapTarget)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_UNMAPPED:
				return validateConceptMapUnmapped((ConceptMapUnmapped)value, diagnostics, context);
			case FhirPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_DELETE_STATUS:
				return validateConditionalDeleteStatus((ConditionalDeleteStatus)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_READ_STATUS:
				return validateConditionalReadStatus((ConditionalReadStatus)value, diagnostics, context);
			case FhirPackage.CONDITION_EVIDENCE:
				return validateConditionEvidence((ConditionEvidence)value, diagnostics, context);
			case FhirPackage.CONDITION_STAGE:
				return validateConditionStage((ConditionStage)value, diagnostics, context);
			case FhirPackage.CONFIDENTIALITY:
				return validateConfidentiality((Confidentiality)value, diagnostics, context);
			case FhirPackage.CONSENT:
				return validateConsent((Consent)value, diagnostics, context);
			case FhirPackage.CONSENT_ACTOR:
				return validateConsentActor((ConsentActor)value, diagnostics, context);
			case FhirPackage.CONSENT_DATA:
				return validateConsentData((ConsentData)value, diagnostics, context);
			case FhirPackage.CONSENT_DATA_MEANING:
				return validateConsentDataMeaning((ConsentDataMeaning)value, diagnostics, context);
			case FhirPackage.CONSENT_POLICY:
				return validateConsentPolicy((ConsentPolicy)value, diagnostics, context);
			case FhirPackage.CONSENT_PROVISION:
				return validateConsentProvision((ConsentProvision)value, diagnostics, context);
			case FhirPackage.CONSENT_PROVISION_TYPE:
				return validateConsentProvisionType((ConsentProvisionType)value, diagnostics, context);
			case FhirPackage.CONSENT_STATE:
				return validateConsentState((ConsentState)value, diagnostics, context);
			case FhirPackage.CONSENT_VERIFICATION:
				return validateConsentVerification((ConsentVerification)value, diagnostics, context);
			case FhirPackage.CONSTRAINT_SEVERITY:
				return validateConstraintSeverity((ConstraintSeverity)value, diagnostics, context);
			case FhirPackage.CONTACT_DETAIL:
				return validateContactDetail((ContactDetail)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT:
				return validateContactPoint((ContactPoint)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_SYSTEM:
				return validateContactPointSystem((ContactPointSystem)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_USE:
				return validateContactPointUse((ContactPointUse)value, diagnostics, context);
			case FhirPackage.CONTRACT:
				return validateContract((Contract)value, diagnostics, context);
			case FhirPackage.CONTRACT_ACTION:
				return validateContractAction((ContractAction)value, diagnostics, context);
			case FhirPackage.CONTRACT_ANSWER:
				return validateContractAnswer((ContractAnswer)value, diagnostics, context);
			case FhirPackage.CONTRACT_ASSET:
				return validateContractAsset((ContractAsset)value, diagnostics, context);
			case FhirPackage.CONTRACT_CONTENT_DEFINITION:
				return validateContractContentDefinition((ContractContentDefinition)value, diagnostics, context);
			case FhirPackage.CONTRACT_CONTEXT:
				return validateContractContext((ContractContext)value, diagnostics, context);
			case FhirPackage.CONTRACT_FRIENDLY:
				return validateContractFriendly((ContractFriendly)value, diagnostics, context);
			case FhirPackage.CONTRACT_LEGAL:
				return validateContractLegal((ContractLegal)value, diagnostics, context);
			case FhirPackage.CONTRACT_OFFER:
				return validateContractOffer((ContractOffer)value, diagnostics, context);
			case FhirPackage.CONTRACT_PARTY:
				return validateContractParty((ContractParty)value, diagnostics, context);
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES:
				return validateContractResourcePublicationStatusCodes((ContractResourcePublicationStatusCodes)value, diagnostics, context);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES:
				return validateContractResourceStatusCodes((ContractResourceStatusCodes)value, diagnostics, context);
			case FhirPackage.CONTRACT_RULE:
				return validateContractRule((ContractRule)value, diagnostics, context);
			case FhirPackage.CONTRACT_SECURITY_LABEL:
				return validateContractSecurityLabel((ContractSecurityLabel)value, diagnostics, context);
			case FhirPackage.CONTRACT_SIGNER:
				return validateContractSigner((ContractSigner)value, diagnostics, context);
			case FhirPackage.CONTRACT_SUBJECT:
				return validateContractSubject((ContractSubject)value, diagnostics, context);
			case FhirPackage.CONTRACT_TERM:
				return validateContractTerm((ContractTerm)value, diagnostics, context);
			case FhirPackage.CONTRACT_VALUED_ITEM:
				return validateContractValuedItem((ContractValuedItem)value, diagnostics, context);
			case FhirPackage.CONTRIBUTOR:
				return validateContributor((Contributor)value, diagnostics, context);
			case FhirPackage.CONTRIBUTOR_TYPE:
				return validateContributorType((ContributorType)value, diagnostics, context);
			case FhirPackage.COUNT:
				return validateCount((Count)value, diagnostics, context);
			case FhirPackage.COVERAGE:
				return validateCoverage((Coverage)value, diagnostics, context);
			case FhirPackage.COVERAGE_CLASS:
				return validateCoverageClass((CoverageClass)value, diagnostics, context);
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY:
				return validateCoverageCostToBeneficiary((CoverageCostToBeneficiary)value, diagnostics, context);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST:
				return validateCoverageEligibilityRequest((CoverageEligibilityRequest)value, diagnostics, context);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS:
				return validateCoverageEligibilityRequestDiagnosis((CoverageEligibilityRequestDiagnosis)value, diagnostics, context);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_INSURANCE:
				return validateCoverageEligibilityRequestInsurance((CoverageEligibilityRequestInsurance)value, diagnostics, context);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM:
				return validateCoverageEligibilityRequestItem((CoverageEligibilityRequestItem)value, diagnostics, context);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO:
				return validateCoverageEligibilityRequestSupportingInfo((CoverageEligibilityRequestSupportingInfo)value, diagnostics, context);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE:
				return validateCoverageEligibilityResponse((CoverageEligibilityResponse)value, diagnostics, context);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT:
				return validateCoverageEligibilityResponseBenefit((CoverageEligibilityResponseBenefit)value, diagnostics, context);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ERROR:
				return validateCoverageEligibilityResponseError((CoverageEligibilityResponseError)value, diagnostics, context);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE:
				return validateCoverageEligibilityResponseInsurance((CoverageEligibilityResponseInsurance)value, diagnostics, context);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM:
				return validateCoverageEligibilityResponseItem((CoverageEligibilityResponseItem)value, diagnostics, context);
			case FhirPackage.COVERAGE_EXCEPTION:
				return validateCoverageException((CoverageException)value, diagnostics, context);
			case FhirPackage.CRITERIA_NOT_EXISTS_BEHAVIOR:
				return validateCriteriaNotExistsBehavior((CriteriaNotExistsBehavior)value, diagnostics, context);
			case FhirPackage.DATA_REQUIREMENT:
				return validateDataRequirement((DataRequirement)value, diagnostics, context);
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER:
				return validateDataRequirementCodeFilter((DataRequirementCodeFilter)value, diagnostics, context);
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER:
				return validateDataRequirementDateFilter((DataRequirementDateFilter)value, diagnostics, context);
			case FhirPackage.DATA_REQUIREMENT_SORT:
				return validateDataRequirementSort((DataRequirementSort)value, diagnostics, context);
			case FhirPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case FhirPackage.DATE_TIME:
				return validateDateTime((DateTime)value, diagnostics, context);
			case FhirPackage.DAYS_OF_WEEK:
				return validateDaysOfWeek((DaysOfWeek)value, diagnostics, context);
			case FhirPackage.DECIMAL:
				return validateDecimal((Decimal)value, diagnostics, context);
			case FhirPackage.DEFINITION_RESOURCE_TYPE:
				return validateDefinitionResourceType((DefinitionResourceType)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE:
				return validateDetectedIssue((DetectedIssue)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_EVIDENCE:
				return validateDetectedIssueEvidence((DetectedIssueEvidence)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_MITIGATION:
				return validateDetectedIssueMitigation((DetectedIssueMitigation)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_SEVERITY:
				return validateDetectedIssueSeverity((DetectedIssueSeverity)value, diagnostics, context);
			case FhirPackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case FhirPackage.DEVICE_DEFINITION:
				return validateDeviceDefinition((DeviceDefinition)value, diagnostics, context);
			case FhirPackage.DEVICE_DEFINITION_CAPABILITY:
				return validateDeviceDefinitionCapability((DeviceDefinitionCapability)value, diagnostics, context);
			case FhirPackage.DEVICE_DEFINITION_DEVICE_NAME:
				return validateDeviceDefinitionDeviceName((DeviceDefinitionDeviceName)value, diagnostics, context);
			case FhirPackage.DEVICE_DEFINITION_MATERIAL:
				return validateDeviceDefinitionMaterial((DeviceDefinitionMaterial)value, diagnostics, context);
			case FhirPackage.DEVICE_DEFINITION_PROPERTY:
				return validateDeviceDefinitionProperty((DeviceDefinitionProperty)value, diagnostics, context);
			case FhirPackage.DEVICE_DEFINITION_SPECIALIZATION:
				return validateDeviceDefinitionSpecialization((DeviceDefinitionSpecialization)value, diagnostics, context);
			case FhirPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER:
				return validateDeviceDefinitionUdiDeviceIdentifier((DeviceDefinitionUdiDeviceIdentifier)value, diagnostics, context);
			case FhirPackage.DEVICE_DEVICE_NAME:
				return validateDeviceDeviceName((DeviceDeviceName)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC:
				return validateDeviceMetric((DeviceMetric)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION:
				return validateDeviceMetricCalibration((DeviceMetricCalibration)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE:
				return validateDeviceMetricCalibrationState((DeviceMetricCalibrationState)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE:
				return validateDeviceMetricCalibrationType((DeviceMetricCalibrationType)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CATEGORY:
				return validateDeviceMetricCategory((DeviceMetricCategory)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_COLOR:
				return validateDeviceMetricColor((DeviceMetricColor)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS:
				return validateDeviceMetricOperationalStatus((DeviceMetricOperationalStatus)value, diagnostics, context);
			case FhirPackage.DEVICE_NAME_TYPE:
				return validateDeviceNameType((DeviceNameType)value, diagnostics, context);
			case FhirPackage.DEVICE_PROPERTY:
				return validateDeviceProperty((DeviceProperty)value, diagnostics, context);
			case FhirPackage.DEVICE_REQUEST:
				return validateDeviceRequest((DeviceRequest)value, diagnostics, context);
			case FhirPackage.DEVICE_REQUEST_PARAMETER:
				return validateDeviceRequestParameter((DeviceRequestParameter)value, diagnostics, context);
			case FhirPackage.DEVICE_SPECIALIZATION:
				return validateDeviceSpecialization((DeviceSpecialization)value, diagnostics, context);
			case FhirPackage.DEVICE_UDI_CARRIER:
				return validateDeviceUdiCarrier((DeviceUdiCarrier)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_STATEMENT:
				return validateDeviceUseStatement((DeviceUseStatement)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS:
				return validateDeviceUseStatementStatus((DeviceUseStatementStatus)value, diagnostics, context);
			case FhirPackage.DEVICE_VERSION:
				return validateDeviceVersion((DeviceVersion)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT:
				return validateDiagnosticReport((DiagnosticReport)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_MEDIA:
				return validateDiagnosticReportMedia((DiagnosticReportMedia)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS:
				return validateDiagnosticReportStatus((DiagnosticReportStatus)value, diagnostics, context);
			case FhirPackage.DISCRIMINATOR_TYPE:
				return validateDiscriminatorType((DiscriminatorType)value, diagnostics, context);
			case FhirPackage.DISTANCE:
				return validateDistance((Distance)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MANIFEST:
				return validateDocumentManifest((DocumentManifest)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MANIFEST_RELATED:
				return validateDocumentManifestRelated((DocumentManifestRelated)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MODE:
				return validateDocumentMode((DocumentMode)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE:
				return validateDocumentReference((DocumentReference)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT:
				return validateDocumentReferenceContent((DocumentReferenceContent)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT:
				return validateDocumentReferenceContext((DocumentReferenceContext)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_RELATES_TO:
				return validateDocumentReferenceRelatesTo((DocumentReferenceRelatesTo)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS:
				return validateDocumentReferenceStatus((DocumentReferenceStatus)value, diagnostics, context);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE:
				return validateDocumentRelationshipType((DocumentRelationshipType)value, diagnostics, context);
			case FhirPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case FhirPackage.DOMAIN_RESOURCE:
				return validateDomainResource((DomainResource)value, diagnostics, context);
			case FhirPackage.DOSAGE:
				return validateDosage((Dosage)value, diagnostics, context);
			case FhirPackage.DOSAGE_DOSE_AND_RATE:
				return validateDosageDoseAndRate((DosageDoseAndRate)value, diagnostics, context);
			case FhirPackage.DURATION:
				return validateDuration((Duration)value, diagnostics, context);
			case FhirPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION:
				return validateElementDefinition((ElementDefinition)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_BASE:
				return validateElementDefinitionBase((ElementDefinitionBase)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_BINDING:
				return validateElementDefinitionBinding((ElementDefinitionBinding)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_CONSTRAINT:
				return validateElementDefinitionConstraint((ElementDefinitionConstraint)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_DISCRIMINATOR:
				return validateElementDefinitionDiscriminator((ElementDefinitionDiscriminator)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_EXAMPLE:
				return validateElementDefinitionExample((ElementDefinitionExample)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_MAPPING:
				return validateElementDefinitionMapping((ElementDefinitionMapping)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_SLICING:
				return validateElementDefinitionSlicing((ElementDefinitionSlicing)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_TYPE:
				return validateElementDefinitionType((ElementDefinitionType)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE:
				return validateEligibilityRequestPurpose((EligibilityRequestPurpose)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE:
				return validateEligibilityResponsePurpose((EligibilityResponsePurpose)value, diagnostics, context);
			case FhirPackage.ENABLE_WHEN_BEHAVIOR:
				return validateEnableWhenBehavior((EnableWhenBehavior)value, diagnostics, context);
			case FhirPackage.ENCOUNTER:
				return validateEncounter((Encounter)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_CLASS_HISTORY:
				return validateEncounterClassHistory((EncounterClassHistory)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_DIAGNOSIS:
				return validateEncounterDiagnosis((EncounterDiagnosis)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION:
				return validateEncounterHospitalization((EncounterHospitalization)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION:
				return validateEncounterLocation((EncounterLocation)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS:
				return validateEncounterLocationStatus((EncounterLocationStatus)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_PARTICIPANT:
				return validateEncounterParticipant((EncounterParticipant)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATUS:
				return validateEncounterStatus((EncounterStatus)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATUS_HISTORY:
				return validateEncounterStatusHistory((EncounterStatusHistory)value, diagnostics, context);
			case FhirPackage.ENDPOINT:
				return validateEndpoint((Endpoint)value, diagnostics, context);
			case FhirPackage.ENDPOINT_STATUS:
				return validateEndpointStatus((EndpointStatus)value, diagnostics, context);
			case FhirPackage.ENROLLMENT_REQUEST:
				return validateEnrollmentRequest((EnrollmentRequest)value, diagnostics, context);
			case FhirPackage.ENROLLMENT_RESPONSE:
				return validateEnrollmentResponse((EnrollmentResponse)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE:
				return validateEpisodeOfCare((EpisodeOfCare)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS:
				return validateEpisodeOfCareDiagnosis((EpisodeOfCareDiagnosis)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS:
				return validateEpisodeOfCareStatus((EpisodeOfCareStatus)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS_HISTORY:
				return validateEpisodeOfCareStatusHistory((EpisodeOfCareStatusHistory)value, diagnostics, context);
			case FhirPackage.EVENT_CAPABILITY_MODE:
				return validateEventCapabilityMode((EventCapabilityMode)value, diagnostics, context);
			case FhirPackage.EVENT_DEFINITION:
				return validateEventDefinition((EventDefinition)value, diagnostics, context);
			case FhirPackage.EVENT_OR_REQUEST_RESOURCE_TYPES:
				return validateEventOrRequestResourceTypes((EventOrRequestResourceTypes)value, diagnostics, context);
			case FhirPackage.EVENT_RESOURCE_TYPE:
				return validateEventResourceType((EventResourceType)value, diagnostics, context);
			case FhirPackage.EVENT_STATUS:
				return validateEventStatus((EventStatus)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING:
				return validateEventTiming((EventTiming)value, diagnostics, context);
			case FhirPackage.EVIDENCE:
				return validateEvidence((Evidence)value, diagnostics, context);
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE:
				return validateEvidenceAttributeEstimate((EvidenceAttributeEstimate)value, diagnostics, context);
			case FhirPackage.EVIDENCE_CERTAINTY:
				return validateEvidenceCertainty((EvidenceCertainty)value, diagnostics, context);
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC:
				return validateEvidenceModelCharacteristic((EvidenceModelCharacteristic)value, diagnostics, context);
			case FhirPackage.EVIDENCE_REPORT:
				return validateEvidenceReport((EvidenceReport)value, diagnostics, context);
			case FhirPackage.EVIDENCE_REPORT_CHARACTERISTIC:
				return validateEvidenceReportCharacteristic((EvidenceReportCharacteristic)value, diagnostics, context);
			case FhirPackage.EVIDENCE_REPORT_RELATES_TO:
				return validateEvidenceReportRelatesTo((EvidenceReportRelatesTo)value, diagnostics, context);
			case FhirPackage.EVIDENCE_REPORT_SECTION:
				return validateEvidenceReportSection((EvidenceReportSection)value, diagnostics, context);
			case FhirPackage.EVIDENCE_REPORT_SUBJECT:
				return validateEvidenceReportSubject((EvidenceReportSubject)value, diagnostics, context);
			case FhirPackage.EVIDENCE_SAMPLE_SIZE:
				return validateEvidenceSampleSize((EvidenceSampleSize)value, diagnostics, context);
			case FhirPackage.EVIDENCE_STATISTIC:
				return validateEvidenceStatistic((EvidenceStatistic)value, diagnostics, context);
			case FhirPackage.EVIDENCE_VARIABLE:
				return validateEvidenceVariable((EvidenceVariable)value, diagnostics, context);
			case FhirPackage.EVIDENCE_VARIABLE1:
				return validateEvidenceVariable1((EvidenceVariable1)value, diagnostics, context);
			case FhirPackage.EVIDENCE_VARIABLE_CATEGORY:
				return validateEvidenceVariableCategory((EvidenceVariableCategory)value, diagnostics, context);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC:
				return validateEvidenceVariableCharacteristic((EvidenceVariableCharacteristic)value, diagnostics, context);
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION:
				return validateEvidenceVariableDefinition((EvidenceVariableDefinition)value, diagnostics, context);
			case FhirPackage.EVIDENCE_VARIABLE_HANDLING:
				return validateEvidenceVariableHandling((EvidenceVariableHandling)value, diagnostics, context);
			case FhirPackage.EVIDENCE_VARIABLE_TIME_FROM_START:
				return validateEvidenceVariableTimeFromStart((EvidenceVariableTimeFromStart)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO:
				return validateExampleScenario((ExampleScenario)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR:
				return validateExampleScenarioActor((ExampleScenarioActor)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE:
				return validateExampleScenarioActorType((ExampleScenarioActorType)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO_ALTERNATIVE:
				return validateExampleScenarioAlternative((ExampleScenarioAlternative)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE:
				return validateExampleScenarioContainedInstance((ExampleScenarioContainedInstance)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE:
				return validateExampleScenarioInstance((ExampleScenarioInstance)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION:
				return validateExampleScenarioOperation((ExampleScenarioOperation)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS:
				return validateExampleScenarioProcess((ExampleScenarioProcess)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO_STEP:
				return validateExampleScenarioStep((ExampleScenarioStep)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO_VERSION:
				return validateExampleScenarioVersion((ExampleScenarioVersion)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT:
				return validateExplanationOfBenefit((ExplanationOfBenefit)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT:
				return validateExplanationOfBenefitAccident((ExplanationOfBenefitAccident)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADD_ITEM:
				return validateExplanationOfBenefitAddItem((ExplanationOfBenefitAddItem)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION:
				return validateExplanationOfBenefitAdjudication((ExplanationOfBenefitAdjudication)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE:
				return validateExplanationOfBenefitBenefitBalance((ExplanationOfBenefitBenefitBalance)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM:
				return validateExplanationOfBenefitCareTeam((ExplanationOfBenefitCareTeam)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL:
				return validateExplanationOfBenefitDetail((ExplanationOfBenefitDetail)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL1:
				return validateExplanationOfBenefitDetail1((ExplanationOfBenefitDetail1)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS:
				return validateExplanationOfBenefitDiagnosis((ExplanationOfBenefitDiagnosis)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_FINANCIAL:
				return validateExplanationOfBenefitFinancial((ExplanationOfBenefitFinancial)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE:
				return validateExplanationOfBenefitInsurance((ExplanationOfBenefitInsurance)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM:
				return validateExplanationOfBenefitItem((ExplanationOfBenefitItem)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE:
				return validateExplanationOfBenefitPayee((ExplanationOfBenefitPayee)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYMENT:
				return validateExplanationOfBenefitPayment((ExplanationOfBenefitPayment)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCEDURE:
				return validateExplanationOfBenefitProcedure((ExplanationOfBenefitProcedure)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCESS_NOTE:
				return validateExplanationOfBenefitProcessNote((ExplanationOfBenefitProcessNote)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED:
				return validateExplanationOfBenefitRelated((ExplanationOfBenefitRelated)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS:
				return validateExplanationOfBenefitStatus((ExplanationOfBenefitStatus)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL:
				return validateExplanationOfBenefitSubDetail((ExplanationOfBenefitSubDetail)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL1:
				return validateExplanationOfBenefitSubDetail1((ExplanationOfBenefitSubDetail1)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUPPORTING_INFO:
				return validateExplanationOfBenefitSupportingInfo((ExplanationOfBenefitSupportingInfo)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_TOTAL:
				return validateExplanationOfBenefitTotal((ExplanationOfBenefitTotal)value, diagnostics, context);
			case FhirPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case FhirPackage.EXPRESSION_LANGUAGE:
				return validateExpressionLanguage((ExpressionLanguage)value, diagnostics, context);
			case FhirPackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case FhirPackage.EXTENSION_CONTEXT_TYPE:
				return validateExtensionContextType((ExtensionContextType)value, diagnostics, context);
			case FhirPackage.FAMILY_HISTORY_STATUS:
				return validateFamilyHistoryStatus((FamilyHistoryStatus)value, diagnostics, context);
			case FhirPackage.FAMILY_MEMBER_HISTORY:
				return validateFamilyMemberHistory((FamilyMemberHistory)value, diagnostics, context);
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION:
				return validateFamilyMemberHistoryCondition((FamilyMemberHistoryCondition)value, diagnostics, context);
			case FhirPackage.FHIR_ALL_TYPES:
				return validateFHIRAllTypes((FHIRAllTypes)value, diagnostics, context);
			case FhirPackage.FHIR_DEFINED_TYPE:
				return validateFHIRDefinedType((FHIRDefinedType)value, diagnostics, context);
			case FhirPackage.FHIR_DEVICE_STATUS:
				return validateFHIRDeviceStatus((FHIRDeviceStatus)value, diagnostics, context);
			case FhirPackage.FHIR_PATH_TYPES:
				return validateFHIRPathTypes((FHIRPathTypes)value, diagnostics, context);
			case FhirPackage.FHIR_SUBSTANCE_STATUS:
				return validateFHIRSubstanceStatus((FHIRSubstanceStatus)value, diagnostics, context);
			case FhirPackage.FHIR_VERSION:
				return validateFHIRVersion((FHIRVersion)value, diagnostics, context);
			case FhirPackage.FILTER_OPERATOR:
				return validateFilterOperator((FilterOperator)value, diagnostics, context);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES:
				return validateFinancialResourceStatusCodes((FinancialResourceStatusCodes)value, diagnostics, context);
			case FhirPackage.FLAG:
				return validateFlag((Flag)value, diagnostics, context);
			case FhirPackage.FLAG_STATUS:
				return validateFlagStatus((FlagStatus)value, diagnostics, context);
			case FhirPackage.GOAL:
				return validateGoal((Goal)value, diagnostics, context);
			case FhirPackage.GOAL_LIFECYCLE_STATUS:
				return validateGoalLifecycleStatus((GoalLifecycleStatus)value, diagnostics, context);
			case FhirPackage.GOAL_TARGET:
				return validateGoalTarget((GoalTarget)value, diagnostics, context);
			case FhirPackage.GRAPH_COMPARTMENT_RULE:
				return validateGraphCompartmentRule((GraphCompartmentRule)value, diagnostics, context);
			case FhirPackage.GRAPH_COMPARTMENT_USE:
				return validateGraphCompartmentUse((GraphCompartmentUse)value, diagnostics, context);
			case FhirPackage.GRAPH_DEFINITION:
				return validateGraphDefinition((GraphDefinition)value, diagnostics, context);
			case FhirPackage.GRAPH_DEFINITION_COMPARTMENT:
				return validateGraphDefinitionCompartment((GraphDefinitionCompartment)value, diagnostics, context);
			case FhirPackage.GRAPH_DEFINITION_LINK:
				return validateGraphDefinitionLink((GraphDefinitionLink)value, diagnostics, context);
			case FhirPackage.GRAPH_DEFINITION_TARGET:
				return validateGraphDefinitionTarget((GraphDefinitionTarget)value, diagnostics, context);
			case FhirPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case FhirPackage.GROUP_CHARACTERISTIC:
				return validateGroupCharacteristic((GroupCharacteristic)value, diagnostics, context);
			case FhirPackage.GROUP_MEASURE:
				return validateGroupMeasure((GroupMeasure)value, diagnostics, context);
			case FhirPackage.GROUP_MEMBER:
				return validateGroupMember((GroupMember)value, diagnostics, context);
			case FhirPackage.GROUP_TYPE:
				return validateGroupType((GroupType)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE:
				return validateGuidanceResponse((GuidanceResponse)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS:
				return validateGuidanceResponseStatus((GuidanceResponseStatus)value, diagnostics, context);
			case FhirPackage.GUIDE_PAGE_GENERATION:
				return validateGuidePageGeneration((GuidePageGeneration)value, diagnostics, context);
			case FhirPackage.GUIDE_PARAMETER_CODE:
				return validateGuideParameterCode((GuideParameterCode)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE:
				return validateHealthcareService((HealthcareService)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME:
				return validateHealthcareServiceAvailableTime((HealthcareServiceAvailableTime)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE_ELIGIBILITY:
				return validateHealthcareServiceEligibility((HealthcareServiceEligibility)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE:
				return validateHealthcareServiceNotAvailable((HealthcareServiceNotAvailable)value, diagnostics, context);
			case FhirPackage.HTTP_VERB:
				return validateHTTPVerb((HTTPVerb)value, diagnostics, context);
			case FhirPackage.HUMAN_NAME:
				return validateHumanName((HumanName)value, diagnostics, context);
			case FhirPackage.ID:
				return validateId((Id)value, diagnostics, context);
			case FhirPackage.IDENTIFIER:
				return validateIdentifier((Identifier)value, diagnostics, context);
			case FhirPackage.IDENTIFIER_USE:
				return validateIdentifierUse((IdentifierUse)value, diagnostics, context);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL:
				return validateIdentityAssuranceLevel((IdentityAssuranceLevel)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY:
				return validateImagingStudy((ImagingStudy)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_INSTANCE:
				return validateImagingStudyInstance((ImagingStudyInstance)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_PERFORMER:
				return validateImagingStudyPerformer((ImagingStudyPerformer)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_SERIES:
				return validateImagingStudySeries((ImagingStudySeries)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_STATUS:
				return validateImagingStudyStatus((ImagingStudyStatus)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION:
				return validateImmunization((Immunization)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_EDUCATION:
				return validateImmunizationEducation((ImmunizationEducation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_EVALUATION:
				return validateImmunizationEvaluation((ImmunizationEvaluation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES:
				return validateImmunizationEvaluationStatusCodes((ImmunizationEvaluationStatusCodes)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_PERFORMER:
				return validateImmunizationPerformer((ImmunizationPerformer)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED:
				return validateImmunizationProtocolApplied((ImmunizationProtocolApplied)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_REACTION:
				return validateImmunizationReaction((ImmunizationReaction)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION:
				return validateImmunizationRecommendation((ImmunizationRecommendation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION:
				return validateImmunizationRecommendationDateCriterion((ImmunizationRecommendationDateCriterion)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION:
				return validateImmunizationRecommendationRecommendation((ImmunizationRecommendationRecommendation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_STATUS_CODES:
				return validateImmunizationStatusCodes((ImmunizationStatusCodes)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE:
				return validateImplementationGuide((ImplementationGuide)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION:
				return validateImplementationGuideDefinition((ImplementationGuideDefinition)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_DEPENDS_ON:
				return validateImplementationGuideDependsOn((ImplementationGuideDependsOn)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_GLOBAL:
				return validateImplementationGuideGlobal((ImplementationGuideGlobal)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_GROUPING:
				return validateImplementationGuideGrouping((ImplementationGuideGrouping)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST:
				return validateImplementationGuideManifest((ImplementationGuideManifest)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE:
				return validateImplementationGuidePage((ImplementationGuidePage)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE1:
				return validateImplementationGuidePage1((ImplementationGuidePage1)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_PARAMETER:
				return validateImplementationGuideParameter((ImplementationGuideParameter)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE:
				return validateImplementationGuideResource((ImplementationGuideResource)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1:
				return validateImplementationGuideResource1((ImplementationGuideResource1)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_TEMPLATE:
				return validateImplementationGuideTemplate((ImplementationGuideTemplate)value, diagnostics, context);
			case FhirPackage.INGREDIENT:
				return validateIngredient((Ingredient)value, diagnostics, context);
			case FhirPackage.INGREDIENT_MANUFACTURER:
				return validateIngredientManufacturer((IngredientManufacturer)value, diagnostics, context);
			case FhirPackage.INGREDIENT_MANUFACTURER_ROLE:
				return validateIngredientManufacturerRole((IngredientManufacturerRole)value, diagnostics, context);
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH:
				return validateIngredientReferenceStrength((IngredientReferenceStrength)value, diagnostics, context);
			case FhirPackage.INGREDIENT_STRENGTH:
				return validateIngredientStrength((IngredientStrength)value, diagnostics, context);
			case FhirPackage.INGREDIENT_SUBSTANCE:
				return validateIngredientSubstance((IngredientSubstance)value, diagnostics, context);
			case FhirPackage.INSTANT:
				return validateInstant((Instant)value, diagnostics, context);
			case FhirPackage.INSURANCE_PLAN:
				return validateInsurancePlan((InsurancePlan)value, diagnostics, context);
			case FhirPackage.INSURANCE_PLAN_BENEFIT:
				return validateInsurancePlanBenefit((InsurancePlanBenefit)value, diagnostics, context);
			case FhirPackage.INSURANCE_PLAN_BENEFIT1:
				return validateInsurancePlanBenefit1((InsurancePlanBenefit1)value, diagnostics, context);
			case FhirPackage.INSURANCE_PLAN_CONTACT:
				return validateInsurancePlanContact((InsurancePlanContact)value, diagnostics, context);
			case FhirPackage.INSURANCE_PLAN_COST:
				return validateInsurancePlanCost((InsurancePlanCost)value, diagnostics, context);
			case FhirPackage.INSURANCE_PLAN_COVERAGE:
				return validateInsurancePlanCoverage((InsurancePlanCoverage)value, diagnostics, context);
			case FhirPackage.INSURANCE_PLAN_GENERAL_COST:
				return validateInsurancePlanGeneralCost((InsurancePlanGeneralCost)value, diagnostics, context);
			case FhirPackage.INSURANCE_PLAN_LIMIT:
				return validateInsurancePlanLimit((InsurancePlanLimit)value, diagnostics, context);
			case FhirPackage.INSURANCE_PLAN_PLAN:
				return validateInsurancePlanPlan((InsurancePlanPlan)value, diagnostics, context);
			case FhirPackage.INSURANCE_PLAN_SPECIFIC_COST:
				return validateInsurancePlanSpecificCost((InsurancePlanSpecificCost)value, diagnostics, context);
			case FhirPackage.INTEGER:
				return validateInteger((org.hl7.fhir.Integer)value, diagnostics, context);
			case FhirPackage.INTERACTION_TRIGGER:
				return validateInteractionTrigger((InteractionTrigger)value, diagnostics, context);
			case FhirPackage.INVOICE:
				return validateInvoice((Invoice)value, diagnostics, context);
			case FhirPackage.INVOICE_LINE_ITEM:
				return validateInvoiceLineItem((InvoiceLineItem)value, diagnostics, context);
			case FhirPackage.INVOICE_PARTICIPANT:
				return validateInvoiceParticipant((InvoiceParticipant)value, diagnostics, context);
			case FhirPackage.INVOICE_PRICE_COMPONENT:
				return validateInvoicePriceComponent((InvoicePriceComponent)value, diagnostics, context);
			case FhirPackage.INVOICE_PRICE_COMPONENT_TYPE:
				return validateInvoicePriceComponentType((InvoicePriceComponentType)value, diagnostics, context);
			case FhirPackage.INVOICE_STATUS:
				return validateInvoiceStatus((InvoiceStatus)value, diagnostics, context);
			case FhirPackage.ISSUE_SEVERITY:
				return validateIssueSeverity((IssueSeverity)value, diagnostics, context);
			case FhirPackage.ISSUE_TYPE:
				return validateIssueType((IssueType)value, diagnostics, context);
			case FhirPackage.KNOWLEDGE_RESOURCE_TYPE:
				return validateKnowledgeResourceType((KnowledgeResourceType)value, diagnostics, context);
			case FhirPackage.LIBRARY:
				return validateLibrary((Library)value, diagnostics, context);
			case FhirPackage.LINKAGE:
				return validateLinkage((Linkage)value, diagnostics, context);
			case FhirPackage.LINKAGE_ITEM:
				return validateLinkageItem((LinkageItem)value, diagnostics, context);
			case FhirPackage.LINKAGE_TYPE:
				return validateLinkageType((LinkageType)value, diagnostics, context);
			case FhirPackage.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			case FhirPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case FhirPackage.LIST_ENTRY:
				return validateListEntry((ListEntry)value, diagnostics, context);
			case FhirPackage.LIST_MODE:
				return validateListMode((ListMode)value, diagnostics, context);
			case FhirPackage.LIST_STATUS:
				return validateListStatus((ListStatus)value, diagnostics, context);
			case FhirPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case FhirPackage.LOCATION_HOURS_OF_OPERATION:
				return validateLocationHoursOfOperation((LocationHoursOfOperation)value, diagnostics, context);
			case FhirPackage.LOCATION_MODE:
				return validateLocationMode((LocationMode)value, diagnostics, context);
			case FhirPackage.LOCATION_POSITION:
				return validateLocationPosition((LocationPosition)value, diagnostics, context);
			case FhirPackage.LOCATION_STATUS:
				return validateLocationStatus((LocationStatus)value, diagnostics, context);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION:
				return validateManufacturedItemDefinition((ManufacturedItemDefinition)value, diagnostics, context);
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_PROPERTY:
				return validateManufacturedItemDefinitionProperty((ManufacturedItemDefinitionProperty)value, diagnostics, context);
			case FhirPackage.MARKDOWN:
				return validateMarkdown((Markdown)value, diagnostics, context);
			case FhirPackage.MARKETING_STATUS:
				return validateMarketingStatus((MarketingStatus)value, diagnostics, context);
			case FhirPackage.MEASURE:
				return validateMeasure((Measure)value, diagnostics, context);
			case FhirPackage.MEASURE_COMPONENT:
				return validateMeasureComponent((MeasureComponent)value, diagnostics, context);
			case FhirPackage.MEASURE_GROUP:
				return validateMeasureGroup((MeasureGroup)value, diagnostics, context);
			case FhirPackage.MEASURE_POPULATION:
				return validateMeasurePopulation((MeasurePopulation)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT:
				return validateMeasureReport((MeasureReport)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_COMPONENT:
				return validateMeasureReportComponent((MeasureReportComponent)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_GROUP:
				return validateMeasureReportGroup((MeasureReportGroup)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_POPULATION:
				return validateMeasureReportPopulation((MeasureReportPopulation)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_POPULATION1:
				return validateMeasureReportPopulation1((MeasureReportPopulation1)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STATUS:
				return validateMeasureReportStatus((MeasureReportStatus)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STRATIFIER:
				return validateMeasureReportStratifier((MeasureReportStratifier)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STRATUM:
				return validateMeasureReportStratum((MeasureReportStratum)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_TYPE:
				return validateMeasureReportType((MeasureReportType)value, diagnostics, context);
			case FhirPackage.MEASURE_STRATIFIER:
				return validateMeasureStratifier((MeasureStratifier)value, diagnostics, context);
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA:
				return validateMeasureSupplementalData((MeasureSupplementalData)value, diagnostics, context);
			case FhirPackage.MEDIA:
				return validateMedia((Media)value, diagnostics, context);
			case FhirPackage.MEDICATION:
				return validateMedication((Medication)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION:
				return validateMedicationAdministration((MedicationAdministration)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE:
				return validateMedicationAdministrationDosage((MedicationAdministrationDosage)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_PERFORMER:
				return validateMedicationAdministrationPerformer((MedicationAdministrationPerformer)value, diagnostics, context);
			case FhirPackage.MEDICATION_BATCH:
				return validateMedicationBatch((MedicationBatch)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE:
				return validateMedicationDispense((MedicationDispense)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_PERFORMER:
				return validateMedicationDispensePerformer((MedicationDispensePerformer)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION:
				return validateMedicationDispenseSubstitution((MedicationDispenseSubstitution)value, diagnostics, context);
			case FhirPackage.MEDICATION_INGREDIENT:
				return validateMedicationIngredient((MedicationIngredient)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE:
				return validateMedicationKnowledge((MedicationKnowledge)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES:
				return validateMedicationKnowledgeAdministrationGuidelines((MedicationKnowledgeAdministrationGuidelines)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_COST:
				return validateMedicationKnowledgeCost((MedicationKnowledgeCost)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSAGE:
				return validateMedicationKnowledgeDosage((MedicationKnowledgeDosage)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_DRUG_CHARACTERISTIC:
				return validateMedicationKnowledgeDrugCharacteristic((MedicationKnowledgeDrugCharacteristic)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT:
				return validateMedicationKnowledgeIngredient((MedicationKnowledgeIngredient)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS:
				return validateMedicationKnowledgeKinetics((MedicationKnowledgeKinetics)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_MAX_DISPENSE:
				return validateMedicationKnowledgeMaxDispense((MedicationKnowledgeMaxDispense)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION:
				return validateMedicationKnowledgeMedicineClassification((MedicationKnowledgeMedicineClassification)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_MONITORING_PROGRAM:
				return validateMedicationKnowledgeMonitoringProgram((MedicationKnowledgeMonitoringProgram)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_MONOGRAPH:
				return validateMedicationKnowledgeMonograph((MedicationKnowledgeMonograph)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING:
				return validateMedicationKnowledgePackaging((MedicationKnowledgePackaging)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS:
				return validateMedicationKnowledgePatientCharacteristics((MedicationKnowledgePatientCharacteristics)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY:
				return validateMedicationKnowledgeRegulatory((MedicationKnowledgeRegulatory)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_RELATED_MEDICATION_KNOWLEDGE:
				return validateMedicationKnowledgeRelatedMedicationKnowledge((MedicationKnowledgeRelatedMedicationKnowledge)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_SCHEDULE:
				return validateMedicationKnowledgeSchedule((MedicationKnowledgeSchedule)value, diagnostics, context);
			case FhirPackage.MEDICATION_KNOWLEDGE_SUBSTITUTION:
				return validateMedicationKnowledgeSubstitution((MedicationKnowledgeSubstitution)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST:
				return validateMedicationRequest((MedicationRequest)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST:
				return validateMedicationRequestDispenseRequest((MedicationRequestDispenseRequest)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_INITIAL_FILL:
				return validateMedicationRequestInitialFill((MedicationRequestInitialFill)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_INTENT:
				return validateMedicationRequestIntent((MedicationRequestIntent)value, diagnostics, context);
			case FhirPackage.MEDICATIONREQUEST_STATUS:
				return validateMedicationrequestStatus((MedicationrequestStatus)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION:
				return validateMedicationRequestSubstitution((MedicationRequestSubstitution)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT:
				return validateMedicationStatement((MedicationStatement)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_CODES:
				return validateMedicationStatementStatusCodes((MedicationStatementStatusCodes)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATUS_CODES:
				return validateMedicationStatusCodes((MedicationStatusCodes)value, diagnostics, context);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION:
				return validateMedicinalProductDefinition((MedicinalProductDefinition)value, diagnostics, context);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC:
				return validateMedicinalProductDefinitionCharacteristic((MedicinalProductDefinitionCharacteristic)value, diagnostics, context);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CONTACT:
				return validateMedicinalProductDefinitionContact((MedicinalProductDefinitionContact)value, diagnostics, context);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_COUNTRY_LANGUAGE:
				return validateMedicinalProductDefinitionCountryLanguage((MedicinalProductDefinitionCountryLanguage)value, diagnostics, context);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CROSS_REFERENCE:
				return validateMedicinalProductDefinitionCrossReference((MedicinalProductDefinitionCrossReference)value, diagnostics, context);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME:
				return validateMedicinalProductDefinitionName((MedicinalProductDefinitionName)value, diagnostics, context);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME_PART:
				return validateMedicinalProductDefinitionNamePart((MedicinalProductDefinitionNamePart)value, diagnostics, context);
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION:
				return validateMedicinalProductDefinitionOperation((MedicinalProductDefinitionOperation)value, diagnostics, context);
			case FhirPackage.MESSAGE_DEFINITION:
				return validateMessageDefinition((MessageDefinition)value, diagnostics, context);
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE:
				return validateMessageDefinitionAllowedResponse((MessageDefinitionAllowedResponse)value, diagnostics, context);
			case FhirPackage.MESSAGE_DEFINITION_FOCUS:
				return validateMessageDefinitionFocus((MessageDefinitionFocus)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER:
				return validateMessageHeader((MessageHeader)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_DESTINATION:
				return validateMessageHeaderDestination((MessageHeaderDestination)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_RESPONSE:
				return validateMessageHeaderResponse((MessageHeaderResponse)value, diagnostics, context);
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST:
				return validateMessageheaderResponseRequest((MessageheaderResponseRequest)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_SOURCE:
				return validateMessageHeaderSource((MessageHeaderSource)value, diagnostics, context);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY:
				return validateMessageSignificanceCategory((MessageSignificanceCategory)value, diagnostics, context);
			case FhirPackage.META:
				return validateMeta((Meta)value, diagnostics, context);
			case FhirPackage.MOLECULAR_SEQUENCE:
				return validateMolecularSequence((MolecularSequence)value, diagnostics, context);
			case FhirPackage.MOLECULAR_SEQUENCE_INNER:
				return validateMolecularSequenceInner((MolecularSequenceInner)value, diagnostics, context);
			case FhirPackage.MOLECULAR_SEQUENCE_OUTER:
				return validateMolecularSequenceOuter((MolecularSequenceOuter)value, diagnostics, context);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY:
				return validateMolecularSequenceQuality((MolecularSequenceQuality)value, diagnostics, context);
			case FhirPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ:
				return validateMolecularSequenceReferenceSeq((MolecularSequenceReferenceSeq)value, diagnostics, context);
			case FhirPackage.MOLECULAR_SEQUENCE_REPOSITORY:
				return validateMolecularSequenceRepository((MolecularSequenceRepository)value, diagnostics, context);
			case FhirPackage.MOLECULAR_SEQUENCE_ROC:
				return validateMolecularSequenceRoc((MolecularSequenceRoc)value, diagnostics, context);
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT:
				return validateMolecularSequenceStructureVariant((MolecularSequenceStructureVariant)value, diagnostics, context);
			case FhirPackage.MOLECULAR_SEQUENCE_VARIANT:
				return validateMolecularSequenceVariant((MolecularSequenceVariant)value, diagnostics, context);
			case FhirPackage.MONEY:
				return validateMoney((Money)value, diagnostics, context);
			case FhirPackage.NAME_USE:
				return validateNameUse((NameUse)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM:
				return validateNamingSystem((NamingSystem)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE:
				return validateNamingSystemIdentifierType((NamingSystemIdentifierType)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_TYPE:
				return validateNamingSystemType((NamingSystemType)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_UNIQUE_ID:
				return validateNamingSystemUniqueId((NamingSystemUniqueId)value, diagnostics, context);
			case FhirPackage.NARRATIVE:
				return validateNarrative((Narrative)value, diagnostics, context);
			case FhirPackage.NARRATIVE_STATUS:
				return validateNarrativeStatus((NarrativeStatus)value, diagnostics, context);
			case FhirPackage.NOTE_TYPE:
				return validateNoteType((NoteType)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER:
				return validateNutritionOrder((NutritionOrder)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ADMINISTRATION:
				return validateNutritionOrderAdministration((NutritionOrderAdministration)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA:
				return validateNutritionOrderEnteralFormula((NutritionOrderEnteralFormula)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_NUTRIENT:
				return validateNutritionOrderNutrient((NutritionOrderNutrient)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ORAL_DIET:
				return validateNutritionOrderOralDiet((NutritionOrderOralDiet)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT:
				return validateNutritionOrderSupplement((NutritionOrderSupplement)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_TEXTURE:
				return validateNutritionOrderTexture((NutritionOrderTexture)value, diagnostics, context);
			case FhirPackage.NUTRITION_PRODUCT:
				return validateNutritionProduct((NutritionProduct)value, diagnostics, context);
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT:
				return validateNutritionProductIngredient((NutritionProductIngredient)value, diagnostics, context);
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE:
				return validateNutritionProductInstance((NutritionProductInstance)value, diagnostics, context);
			case FhirPackage.NUTRITION_PRODUCT_NUTRIENT:
				return validateNutritionProductNutrient((NutritionProductNutrient)value, diagnostics, context);
			case FhirPackage.NUTRITION_PRODUCT_PRODUCT_CHARACTERISTIC:
				return validateNutritionProductProductCharacteristic((NutritionProductProductCharacteristic)value, diagnostics, context);
			case FhirPackage.NUTRITION_PRODUCT_STATUS:
				return validateNutritionProductStatus((NutritionProductStatus)value, diagnostics, context);
			case FhirPackage.OBSERVATION:
				return validateObservation((Observation)value, diagnostics, context);
			case FhirPackage.OBSERVATION_COMPONENT:
				return validateObservationComponent((ObservationComponent)value, diagnostics, context);
			case FhirPackage.OBSERVATION_DATA_TYPE:
				return validateObservationDataType((ObservationDataType)value, diagnostics, context);
			case FhirPackage.OBSERVATION_DEFINITION:
				return validateObservationDefinition((ObservationDefinition)value, diagnostics, context);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL:
				return validateObservationDefinitionQualifiedInterval((ObservationDefinitionQualifiedInterval)value, diagnostics, context);
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS:
				return validateObservationDefinitionQuantitativeDetails((ObservationDefinitionQuantitativeDetails)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RANGE_CATEGORY:
				return validateObservationRangeCategory((ObservationRangeCategory)value, diagnostics, context);
			case FhirPackage.OBSERVATION_REFERENCE_RANGE:
				return validateObservationReferenceRange((ObservationReferenceRange)value, diagnostics, context);
			case FhirPackage.OBSERVATION_STATUS:
				return validateObservationStatus((ObservationStatus)value, diagnostics, context);
			case FhirPackage.OID:
				return validateOid((Oid)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION:
				return validateOperationDefinition((OperationDefinition)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_BINDING:
				return validateOperationDefinitionBinding((OperationDefinitionBinding)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_OVERLOAD:
				return validateOperationDefinitionOverload((OperationDefinitionOverload)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_PARAMETER:
				return validateOperationDefinitionParameter((OperationDefinitionParameter)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_REFERENCED_FROM:
				return validateOperationDefinitionReferencedFrom((OperationDefinitionReferencedFrom)value, diagnostics, context);
			case FhirPackage.OPERATION_KIND:
				return validateOperationKind((OperationKind)value, diagnostics, context);
			case FhirPackage.OPERATION_OUTCOME:
				return validateOperationOutcome((OperationOutcome)value, diagnostics, context);
			case FhirPackage.OPERATION_OUTCOME_ISSUE:
				return validateOperationOutcomeIssue((OperationOutcomeIssue)value, diagnostics, context);
			case FhirPackage.OPERATION_PARAMETER_USE:
				return validateOperationParameterUse((OperationParameterUse)value, diagnostics, context);
			case FhirPackage.ORGANIZATION:
				return validateOrganization((Organization)value, diagnostics, context);
			case FhirPackage.ORGANIZATION_AFFILIATION:
				return validateOrganizationAffiliation((OrganizationAffiliation)value, diagnostics, context);
			case FhirPackage.ORGANIZATION_CONTACT:
				return validateOrganizationContact((OrganizationContact)value, diagnostics, context);
			case FhirPackage.ORIENTATION_TYPE:
				return validateOrientationType((OrientationType)value, diagnostics, context);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION:
				return validatePackagedProductDefinition((PackagedProductDefinition)value, diagnostics, context);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_CONTAINED_ITEM:
				return validatePackagedProductDefinitionContainedItem((PackagedProductDefinitionContainedItem)value, diagnostics, context);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY:
				return validatePackagedProductDefinitionLegalStatusOfSupply((PackagedProductDefinitionLegalStatusOfSupply)value, diagnostics, context);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGE:
				return validatePackagedProductDefinitionPackage((PackagedProductDefinitionPackage)value, diagnostics, context);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PROPERTY:
				return validatePackagedProductDefinitionProperty((PackagedProductDefinitionProperty)value, diagnostics, context);
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_SHELF_LIFE_STORAGE:
				return validatePackagedProductDefinitionShelfLifeStorage((PackagedProductDefinitionShelfLifeStorage)value, diagnostics, context);
			case FhirPackage.PARAMETER_DEFINITION:
				return validateParameterDefinition((ParameterDefinition)value, diagnostics, context);
			case FhirPackage.PARAMETERS:
				return validateParameters((Parameters)value, diagnostics, context);
			case FhirPackage.PARAMETERS_PARAMETER:
				return validateParametersParameter((ParametersParameter)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_REQUIRED:
				return validateParticipantRequired((ParticipantRequired)value, diagnostics, context);
			case FhirPackage.PARTICIPATION_STATUS:
				return validateParticipationStatus((ParticipationStatus)value, diagnostics, context);
			case FhirPackage.PATIENT:
				return validatePatient((Patient)value, diagnostics, context);
			case FhirPackage.PATIENT_COMMUNICATION:
				return validatePatientCommunication((PatientCommunication)value, diagnostics, context);
			case FhirPackage.PATIENT_CONTACT:
				return validatePatientContact((PatientContact)value, diagnostics, context);
			case FhirPackage.PATIENT_LINK:
				return validatePatientLink((PatientLink)value, diagnostics, context);
			case FhirPackage.PAYMENT_NOTICE:
				return validatePaymentNotice((PaymentNotice)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION:
				return validatePaymentReconciliation((PaymentReconciliation)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL:
				return validatePaymentReconciliationDetail((PaymentReconciliationDetail)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION_PROCESS_NOTE:
				return validatePaymentReconciliationProcessNote((PaymentReconciliationProcessNote)value, diagnostics, context);
			case FhirPackage.PERIOD:
				return validatePeriod((Period)value, diagnostics, context);
			case FhirPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case FhirPackage.PERSON_LINK:
				return validatePersonLink((PersonLink)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION:
				return validatePlanDefinition((PlanDefinition)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION_ACTION:
				return validatePlanDefinitionAction((PlanDefinitionAction)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION_CONDITION:
				return validatePlanDefinitionCondition((PlanDefinitionCondition)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION_DYNAMIC_VALUE:
				return validatePlanDefinitionDynamicValue((PlanDefinitionDynamicValue)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION_GOAL:
				return validatePlanDefinitionGoal((PlanDefinitionGoal)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION_PARTICIPANT:
				return validatePlanDefinitionParticipant((PlanDefinitionParticipant)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION:
				return validatePlanDefinitionRelatedAction((PlanDefinitionRelatedAction)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION_TARGET:
				return validatePlanDefinitionTarget((PlanDefinitionTarget)value, diagnostics, context);
			case FhirPackage.POPULATION:
				return validatePopulation((Population)value, diagnostics, context);
			case FhirPackage.POSITIVE_INT:
				return validatePositiveInt((PositiveInt)value, diagnostics, context);
			case FhirPackage.PRACTITIONER:
				return validatePractitioner((Practitioner)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_QUALIFICATION:
				return validatePractitionerQualification((PractitionerQualification)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_ROLE:
				return validatePractitionerRole((PractitionerRole)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_ROLE_AVAILABLE_TIME:
				return validatePractitionerRoleAvailableTime((PractitionerRoleAvailableTime)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_ROLE_NOT_AVAILABLE:
				return validatePractitionerRoleNotAvailable((PractitionerRoleNotAvailable)value, diagnostics, context);
			case FhirPackage.PROCEDURE:
				return validateProcedure((Procedure)value, diagnostics, context);
			case FhirPackage.PROCEDURE_FOCAL_DEVICE:
				return validateProcedureFocalDevice((ProcedureFocalDevice)value, diagnostics, context);
			case FhirPackage.PROCEDURE_PERFORMER:
				return validateProcedurePerformer((ProcedurePerformer)value, diagnostics, context);
			case FhirPackage.PROD_CHARACTERISTIC:
				return validateProdCharacteristic((ProdCharacteristic)value, diagnostics, context);
			case FhirPackage.PRODUCT_SHELF_LIFE:
				return validateProductShelfLife((ProductShelfLife)value, diagnostics, context);
			case FhirPackage.PROPERTY_REPRESENTATION:
				return validatePropertyRepresentation((PropertyRepresentation)value, diagnostics, context);
			case FhirPackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case FhirPackage.PROVENANCE:
				return validateProvenance((Provenance)value, diagnostics, context);
			case FhirPackage.PROVENANCE_AGENT:
				return validateProvenanceAgent((ProvenanceAgent)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY:
				return validateProvenanceEntity((ProvenanceEntity)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY_ROLE:
				return validateProvenanceEntityRole((ProvenanceEntityRole)value, diagnostics, context);
			case FhirPackage.PUBLICATION_STATUS:
				return validatePublicationStatus((PublicationStatus)value, diagnostics, context);
			case FhirPackage.QUALITY_TYPE:
				return validateQualityType((QualityType)value, diagnostics, context);
			case FhirPackage.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case FhirPackage.QUANTITY_COMPARATOR:
				return validateQuantityComparator((QuantityComparator)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE:
				return validateQuestionnaire((Questionnaire)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ANSWER_OPTION:
				return validateQuestionnaireAnswerOption((QuestionnaireAnswerOption)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN:
				return validateQuestionnaireEnableWhen((QuestionnaireEnableWhen)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_INITIAL:
				return validateQuestionnaireInitial((QuestionnaireInitial)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM:
				return validateQuestionnaireItem((QuestionnaireItem)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR:
				return validateQuestionnaireItemOperator((QuestionnaireItemOperator)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE:
				return validateQuestionnaireItemType((QuestionnaireItemType)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE:
				return validateQuestionnaireResponse((QuestionnaireResponse)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ANSWER:
				return validateQuestionnaireResponseAnswer((QuestionnaireResponseAnswer)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ITEM:
				return validateQuestionnaireResponseItem((QuestionnaireResponseItem)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS:
				return validateQuestionnaireResponseStatus((QuestionnaireResponseStatus)value, diagnostics, context);
			case FhirPackage.RANGE:
				return validateRange((Range)value, diagnostics, context);
			case FhirPackage.RATIO:
				return validateRatio((Ratio)value, diagnostics, context);
			case FhirPackage.RATIO_RANGE:
				return validateRatioRange((RatioRange)value, diagnostics, context);
			case FhirPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case FhirPackage.REFERENCE_HANDLING_POLICY:
				return validateReferenceHandlingPolicy((ReferenceHandlingPolicy)value, diagnostics, context);
			case FhirPackage.REFERENCE_VERSION_RULES:
				return validateReferenceVersionRules((ReferenceVersionRules)value, diagnostics, context);
			case FhirPackage.REGULATED_AUTHORIZATION:
				return validateRegulatedAuthorization((RegulatedAuthorization)value, diagnostics, context);
			case FhirPackage.REGULATED_AUTHORIZATION_CASE:
				return validateRegulatedAuthorizationCase((RegulatedAuthorizationCase)value, diagnostics, context);
			case FhirPackage.RELATED_ARTIFACT:
				return validateRelatedArtifact((RelatedArtifact)value, diagnostics, context);
			case FhirPackage.RELATED_ARTIFACT_TYPE:
				return validateRelatedArtifactType((RelatedArtifactType)value, diagnostics, context);
			case FhirPackage.RELATED_PERSON:
				return validateRelatedPerson((RelatedPerson)value, diagnostics, context);
			case FhirPackage.RELATED_PERSON_COMMUNICATION:
				return validateRelatedPersonCommunication((RelatedPersonCommunication)value, diagnostics, context);
			case FhirPackage.REMITTANCE_OUTCOME:
				return validateRemittanceOutcome((RemittanceOutcome)value, diagnostics, context);
			case FhirPackage.REPORT_RELATIONSHIP_TYPE:
				return validateReportRelationshipType((ReportRelationshipType)value, diagnostics, context);
			case FhirPackage.REPOSITORY_TYPE:
				return validateRepositoryType((RepositoryType)value, diagnostics, context);
			case FhirPackage.REQUEST_GROUP:
				return validateRequestGroup((RequestGroup)value, diagnostics, context);
			case FhirPackage.REQUEST_GROUP_ACTION:
				return validateRequestGroupAction((RequestGroupAction)value, diagnostics, context);
			case FhirPackage.REQUEST_GROUP_CONDITION:
				return validateRequestGroupCondition((RequestGroupCondition)value, diagnostics, context);
			case FhirPackage.REQUEST_GROUP_RELATED_ACTION:
				return validateRequestGroupRelatedAction((RequestGroupRelatedAction)value, diagnostics, context);
			case FhirPackage.REQUEST_INTENT:
				return validateRequestIntent((RequestIntent)value, diagnostics, context);
			case FhirPackage.REQUEST_PRIORITY:
				return validateRequestPriority((RequestPriority)value, diagnostics, context);
			case FhirPackage.REQUEST_RESOURCE_TYPE:
				return validateRequestResourceType((RequestResourceType)value, diagnostics, context);
			case FhirPackage.REQUEST_STATUS:
				return validateRequestStatus((RequestStatus)value, diagnostics, context);
			case FhirPackage.RESEARCH_DEFINITION:
				return validateResearchDefinition((ResearchDefinition)value, diagnostics, context);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION:
				return validateResearchElementDefinition((ResearchElementDefinition)value, diagnostics, context);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC:
				return validateResearchElementDefinitionCharacteristic((ResearchElementDefinitionCharacteristic)value, diagnostics, context);
			case FhirPackage.RESEARCH_ELEMENT_TYPE:
				return validateResearchElementType((ResearchElementType)value, diagnostics, context);
			case FhirPackage.RESEARCH_STUDY:
				return validateResearchStudy((ResearchStudy)value, diagnostics, context);
			case FhirPackage.RESEARCH_STUDY_ARM:
				return validateResearchStudyArm((ResearchStudyArm)value, diagnostics, context);
			case FhirPackage.RESEARCH_STUDY_OBJECTIVE:
				return validateResearchStudyObjective((ResearchStudyObjective)value, diagnostics, context);
			case FhirPackage.RESEARCH_STUDY_STATUS:
				return validateResearchStudyStatus((ResearchStudyStatus)value, diagnostics, context);
			case FhirPackage.RESEARCH_SUBJECT:
				return validateResearchSubject((ResearchSubject)value, diagnostics, context);
			case FhirPackage.RESEARCH_SUBJECT_STATUS:
				return validateResearchSubjectStatus((ResearchSubjectStatus)value, diagnostics, context);
			case FhirPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case FhirPackage.RESOURCE_CONTAINER:
				return validateResourceContainer((ResourceContainer)value, diagnostics, context);
			case FhirPackage.RESOURCE_TYPE:
				return validateResourceType((ResourceType)value, diagnostics, context);
			case FhirPackage.RESOURCE_VERSION_POLICY:
				return validateResourceVersionPolicy((ResourceVersionPolicy)value, diagnostics, context);
			case FhirPackage.RESPONSE_TYPE:
				return validateResponseType((ResponseType)value, diagnostics, context);
			case FhirPackage.RESTFUL_CAPABILITY_MODE:
				return validateRestfulCapabilityMode((RestfulCapabilityMode)value, diagnostics, context);
			case FhirPackage.RISK_ASSESSMENT:
				return validateRiskAssessment((RiskAssessment)value, diagnostics, context);
			case FhirPackage.RISK_ASSESSMENT_PREDICTION:
				return validateRiskAssessmentPrediction((RiskAssessmentPrediction)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA:
				return validateSampledData((SampledData)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE:
				return validateSampledDataDataType((SampledDataDataType)value, diagnostics, context);
			case FhirPackage.SCHEDULE:
				return validateSchedule((Schedule)value, diagnostics, context);
			case FhirPackage.SEARCH_COMPARATOR:
				return validateSearchComparator((SearchComparator)value, diagnostics, context);
			case FhirPackage.SEARCH_ENTRY_MODE:
				return validateSearchEntryMode((SearchEntryMode)value, diagnostics, context);
			case FhirPackage.SEARCH_MODIFIER_CODE:
				return validateSearchModifierCode((SearchModifierCode)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAMETER:
				return validateSearchParameter((SearchParameter)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAMETER_COMPONENT:
				return validateSearchParameterComponent((SearchParameterComponent)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAM_TYPE:
				return validateSearchParamType((SearchParamType)value, diagnostics, context);
			case FhirPackage.SEQUENCE_TYPE:
				return validateSequenceType((SequenceType)value, diagnostics, context);
			case FhirPackage.SERVICE_REQUEST:
				return validateServiceRequest((ServiceRequest)value, diagnostics, context);
			case FhirPackage.SIGNATURE:
				return validateSignature((Signature)value, diagnostics, context);
			case FhirPackage.SLICING_RULES:
				return validateSlicingRules((SlicingRules)value, diagnostics, context);
			case FhirPackage.SLOT:
				return validateSlot((Slot)value, diagnostics, context);
			case FhirPackage.SLOT_STATUS:
				return validateSlotStatus((SlotStatus)value, diagnostics, context);
			case FhirPackage.SORT_DIRECTION:
				return validateSortDirection((SortDirection)value, diagnostics, context);
			case FhirPackage.SPDX_LICENSE:
				return validateSPDXLicense((SPDXLicense)value, diagnostics, context);
			case FhirPackage.SPECIMEN:
				return validateSpecimen((Specimen)value, diagnostics, context);
			case FhirPackage.SPECIMEN_COLLECTION:
				return validateSpecimenCollection((SpecimenCollection)value, diagnostics, context);
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE:
				return validateSpecimenContainedPreference((SpecimenContainedPreference)value, diagnostics, context);
			case FhirPackage.SPECIMEN_CONTAINER:
				return validateSpecimenContainer((SpecimenContainer)value, diagnostics, context);
			case FhirPackage.SPECIMEN_DEFINITION:
				return validateSpecimenDefinition((SpecimenDefinition)value, diagnostics, context);
			case FhirPackage.SPECIMEN_DEFINITION_ADDITIVE:
				return validateSpecimenDefinitionAdditive((SpecimenDefinitionAdditive)value, diagnostics, context);
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER:
				return validateSpecimenDefinitionContainer((SpecimenDefinitionContainer)value, diagnostics, context);
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING:
				return validateSpecimenDefinitionHandling((SpecimenDefinitionHandling)value, diagnostics, context);
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED:
				return validateSpecimenDefinitionTypeTested((SpecimenDefinitionTypeTested)value, diagnostics, context);
			case FhirPackage.SPECIMEN_PROCESSING:
				return validateSpecimenProcessing((SpecimenProcessing)value, diagnostics, context);
			case FhirPackage.SPECIMEN_STATUS:
				return validateSpecimenStatus((SpecimenStatus)value, diagnostics, context);
			case FhirPackage.STATUS:
				return validateStatus((Status)value, diagnostics, context);
			case FhirPackage.STRAND_TYPE:
				return validateStrandType((StrandType)value, diagnostics, context);
			case FhirPackage.STRING:
				return validateString((org.hl7.fhir.String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION:
				return validateStructureDefinition((StructureDefinition)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_CONTEXT:
				return validateStructureDefinitionContext((StructureDefinitionContext)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_DIFFERENTIAL:
				return validateStructureDefinitionDifferential((StructureDefinitionDifferential)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_KIND:
				return validateStructureDefinitionKind((StructureDefinitionKind)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING:
				return validateStructureDefinitionMapping((StructureDefinitionMapping)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_SNAPSHOT:
				return validateStructureDefinitionSnapshot((StructureDefinitionSnapshot)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP:
				return validateStructureMap((StructureMap)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE:
				return validateStructureMapContextType((StructureMapContextType)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_DEPENDENT:
				return validateStructureMapDependent((StructureMapDependent)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_GROUP:
				return validateStructureMapGroup((StructureMapGroup)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE:
				return validateStructureMapGroupTypeMode((StructureMapGroupTypeMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_INPUT:
				return validateStructureMapInput((StructureMapInput)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE:
				return validateStructureMapInputMode((StructureMapInputMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE:
				return validateStructureMapModelMode((StructureMapModelMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_PARAMETER:
				return validateStructureMapParameter((StructureMapParameter)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_RULE:
				return validateStructureMapRule((StructureMapRule)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_SOURCE:
				return validateStructureMapSource((StructureMapSource)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE:
				return validateStructureMapSourceListMode((StructureMapSourceListMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_STRUCTURE:
				return validateStructureMapStructure((StructureMapStructure)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TARGET:
				return validateStructureMapTarget((StructureMapTarget)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE:
				return validateStructureMapTargetListMode((StructureMapTargetListMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM:
				return validateStructureMapTransform((StructureMapTransform)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION:
				return validateSubscription((Subscription)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL:
				return validateSubscriptionChannel((SubscriptionChannel)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE:
				return validateSubscriptionChannelType((SubscriptionChannelType)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_NOTIFICATION_TYPE:
				return validateSubscriptionNotificationType((SubscriptionNotificationType)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS:
				return validateSubscriptionStatus((SubscriptionStatus)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS_CODES:
				return validateSubscriptionStatusCodes((SubscriptionStatusCodes)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT:
				return validateSubscriptionStatusNotificationEvent((SubscriptionStatusNotificationEvent)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_TOPIC:
				return validateSubscriptionTopic((SubscriptionTopic)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY:
				return validateSubscriptionTopicCanFilterBy((SubscriptionTopicCanFilterBy)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_TOPIC_EVENT_TRIGGER:
				return validateSubscriptionTopicEventTrigger((SubscriptionTopicEventTrigger)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE:
				return validateSubscriptionTopicNotificationShape((SubscriptionTopicNotificationShape)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA:
				return validateSubscriptionTopicQueryCriteria((SubscriptionTopicQueryCriteria)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER:
				return validateSubscriptionTopicResourceTrigger((SubscriptionTopicResourceTrigger)value, diagnostics, context);
			case FhirPackage.SUBSTANCE:
				return validateSubstance((Substance)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_DEFINITION:
				return validateSubstanceDefinition((SubstanceDefinition)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_DEFINITION_CODE:
				return validateSubstanceDefinitionCode((SubstanceDefinitionCode)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_DEFINITION_MOIETY:
				return validateSubstanceDefinitionMoiety((SubstanceDefinitionMoiety)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_DEFINITION_MOLECULAR_WEIGHT:
				return validateSubstanceDefinitionMolecularWeight((SubstanceDefinitionMolecularWeight)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_DEFINITION_NAME:
				return validateSubstanceDefinitionName((SubstanceDefinitionName)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_DEFINITION_OFFICIAL:
				return validateSubstanceDefinitionOfficial((SubstanceDefinitionOfficial)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_DEFINITION_PROPERTY:
				return validateSubstanceDefinitionProperty((SubstanceDefinitionProperty)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP:
				return validateSubstanceDefinitionRelationship((SubstanceDefinitionRelationship)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_DEFINITION_REPRESENTATION:
				return validateSubstanceDefinitionRepresentation((SubstanceDefinitionRepresentation)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL:
				return validateSubstanceDefinitionSourceMaterial((SubstanceDefinitionSourceMaterial)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_DEFINITION_STRUCTURE:
				return validateSubstanceDefinitionStructure((SubstanceDefinitionStructure)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_INGREDIENT:
				return validateSubstanceIngredient((SubstanceIngredient)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_INSTANCE:
				return validateSubstanceInstance((SubstanceInstance)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY:
				return validateSupplyDelivery((SupplyDelivery)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_STATUS:
				return validateSupplyDeliveryStatus((SupplyDeliveryStatus)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM:
				return validateSupplyDeliverySuppliedItem((SupplyDeliverySuppliedItem)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST:
				return validateSupplyRequest((SupplyRequest)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_PARAMETER:
				return validateSupplyRequestParameter((SupplyRequestParameter)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_STATUS:
				return validateSupplyRequestStatus((SupplyRequestStatus)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION:
				return validateSystemRestfulInteraction((SystemRestfulInteraction)value, diagnostics, context);
			case FhirPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case FhirPackage.TASK_INPUT:
				return validateTaskInput((TaskInput)value, diagnostics, context);
			case FhirPackage.TASK_INTENT:
				return validateTaskIntent((TaskIntent)value, diagnostics, context);
			case FhirPackage.TASK_OUTPUT:
				return validateTaskOutput((TaskOutput)value, diagnostics, context);
			case FhirPackage.TASK_RESTRICTION:
				return validateTaskRestriction((TaskRestriction)value, diagnostics, context);
			case FhirPackage.TASK_STATUS:
				return validateTaskStatus((TaskStatus)value, diagnostics, context);
			case FhirPackage.TERMINOLOGY_CAPABILITIES:
				return validateTerminologyCapabilities((TerminologyCapabilities)value, diagnostics, context);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CLOSURE:
				return validateTerminologyCapabilitiesClosure((TerminologyCapabilitiesClosure)value, diagnostics, context);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM:
				return validateTerminologyCapabilitiesCodeSystem((TerminologyCapabilitiesCodeSystem)value, diagnostics, context);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION:
				return validateTerminologyCapabilitiesExpansion((TerminologyCapabilitiesExpansion)value, diagnostics, context);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_FILTER:
				return validateTerminologyCapabilitiesFilter((TerminologyCapabilitiesFilter)value, diagnostics, context);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_IMPLEMENTATION:
				return validateTerminologyCapabilitiesImplementation((TerminologyCapabilitiesImplementation)value, diagnostics, context);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_PARAMETER:
				return validateTerminologyCapabilitiesParameter((TerminologyCapabilitiesParameter)value, diagnostics, context);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_SOFTWARE:
				return validateTerminologyCapabilitiesSoftware((TerminologyCapabilitiesSoftware)value, diagnostics, context);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION:
				return validateTerminologyCapabilitiesTranslation((TerminologyCapabilitiesTranslation)value, diagnostics, context);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VALIDATE_CODE:
				return validateTerminologyCapabilitiesValidateCode((TerminologyCapabilitiesValidateCode)value, diagnostics, context);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION:
				return validateTerminologyCapabilitiesVersion((TerminologyCapabilitiesVersion)value, diagnostics, context);
			case FhirPackage.TEST_REPORT:
				return validateTestReport((TestReport)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION:
				return validateTestReportAction((TestReportAction)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION1:
				return validateTestReportAction1((TestReportAction1)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION2:
				return validateTestReportAction2((TestReportAction2)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION_RESULT:
				return validateTestReportActionResult((TestReportActionResult)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ASSERT:
				return validateTestReportAssert((TestReportAssert)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_OPERATION:
				return validateTestReportOperation((TestReportOperation)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_PARTICIPANT:
				return validateTestReportParticipant((TestReportParticipant)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE:
				return validateTestReportParticipantType((TestReportParticipantType)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_RESULT:
				return validateTestReportResult((TestReportResult)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_SETUP:
				return validateTestReportSetup((TestReportSetup)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_STATUS:
				return validateTestReportStatus((TestReportStatus)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_TEARDOWN:
				return validateTestReportTeardown((TestReportTeardown)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_TEST:
				return validateTestReportTest((TestReportTest)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT:
				return validateTestScript((TestScript)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION:
				return validateTestScriptAction((TestScriptAction)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION1:
				return validateTestScriptAction1((TestScriptAction1)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION2:
				return validateTestScriptAction2((TestScriptAction2)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ASSERT:
				return validateTestScriptAssert((TestScriptAssert)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_CAPABILITY:
				return validateTestScriptCapability((TestScriptCapability)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_DESTINATION:
				return validateTestScriptDestination((TestScriptDestination)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_FIXTURE:
				return validateTestScriptFixture((TestScriptFixture)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_LINK:
				return validateTestScriptLink((TestScriptLink)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_METADATA:
				return validateTestScriptMetadata((TestScriptMetadata)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_OPERATION:
				return validateTestScriptOperation((TestScriptOperation)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ORIGIN:
				return validateTestScriptOrigin((TestScriptOrigin)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_REQUEST_HEADER:
				return validateTestScriptRequestHeader((TestScriptRequestHeader)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE:
				return validateTestScriptRequestMethodCode((TestScriptRequestMethodCode)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_SETUP:
				return validateTestScriptSetup((TestScriptSetup)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_TEARDOWN:
				return validateTestScriptTeardown((TestScriptTeardown)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_TEST:
				return validateTestScriptTest((TestScriptTest)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_VARIABLE:
				return validateTestScriptVariable((TestScriptVariable)value, diagnostics, context);
			case FhirPackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case FhirPackage.TIMING:
				return validateTiming((Timing)value, diagnostics, context);
			case FhirPackage.TIMING_REPEAT:
				return validateTimingRepeat((TimingRepeat)value, diagnostics, context);
			case FhirPackage.TRIGGER_DEFINITION:
				return validateTriggerDefinition((TriggerDefinition)value, diagnostics, context);
			case FhirPackage.TRIGGER_TYPE:
				return validateTriggerType((TriggerType)value, diagnostics, context);
			case FhirPackage.TYPE_DERIVATION_RULE:
				return validateTypeDerivationRule((TypeDerivationRule)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION:
				return validateTypeRestfulInteraction((TypeRestfulInteraction)value, diagnostics, context);
			case FhirPackage.UDI_ENTRY_TYPE:
				return validateUDIEntryType((UDIEntryType)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME:
				return validateUnitsOfTime((UnitsOfTime)value, diagnostics, context);
			case FhirPackage.UNSIGNED_INT:
				return validateUnsignedInt((UnsignedInt)value, diagnostics, context);
			case FhirPackage.URI:
				return validateUri((Uri)value, diagnostics, context);
			case FhirPackage.URL:
				return validateUrl((Url)value, diagnostics, context);
			case FhirPackage.USAGE_CONTEXT:
				return validateUsageContext((UsageContext)value, diagnostics, context);
			case FhirPackage.USE:
				return validateUse((Use)value, diagnostics, context);
			case FhirPackage.UUID:
				return validateUuid((Uuid)value, diagnostics, context);
			case FhirPackage.VALUE_SET:
				return validateValueSet((ValueSet)value, diagnostics, context);
			case FhirPackage.VALUE_SET_COMPOSE:
				return validateValueSetCompose((ValueSetCompose)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CONCEPT:
				return validateValueSetConcept((ValueSetConcept)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CONTAINS:
				return validateValueSetContains((ValueSetContains)value, diagnostics, context);
			case FhirPackage.VALUE_SET_DESIGNATION:
				return validateValueSetDesignation((ValueSetDesignation)value, diagnostics, context);
			case FhirPackage.VALUE_SET_EXPANSION:
				return validateValueSetExpansion((ValueSetExpansion)value, diagnostics, context);
			case FhirPackage.VALUE_SET_FILTER:
				return validateValueSetFilter((ValueSetFilter)value, diagnostics, context);
			case FhirPackage.VALUE_SET_INCLUDE:
				return validateValueSetInclude((ValueSetInclude)value, diagnostics, context);
			case FhirPackage.VALUE_SET_PARAMETER:
				return validateValueSetParameter((ValueSetParameter)value, diagnostics, context);
			case FhirPackage.VARIABLE_TYPE:
				return validateVariableType((VariableType)value, diagnostics, context);
			case FhirPackage.VERIFICATION_RESULT:
				return validateVerificationResult((VerificationResult)value, diagnostics, context);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION:
				return validateVerificationResultAttestation((VerificationResultAttestation)value, diagnostics, context);
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE:
				return validateVerificationResultPrimarySource((VerificationResultPrimarySource)value, diagnostics, context);
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR:
				return validateVerificationResultValidator((VerificationResultValidator)value, diagnostics, context);
			case FhirPackage.VISION_BASE:
				return validateVisionBase((VisionBase)value, diagnostics, context);
			case FhirPackage.VISION_EYES:
				return validateVisionEyes((VisionEyes)value, diagnostics, context);
			case FhirPackage.VISION_PRESCRIPTION:
				return validateVisionPrescription((VisionPrescription)value, diagnostics, context);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION:
				return validateVisionPrescriptionLensSpecification((VisionPrescriptionLensSpecification)value, diagnostics, context);
			case FhirPackage.VISION_PRESCRIPTION_PRISM:
				return validateVisionPrescriptionPrism((VisionPrescriptionPrism)value, diagnostics, context);
			case FhirPackage.XPATH_USAGE_TYPE:
				return validateXPathUsageType((XPathUsageType)value, diagnostics, context);
			case FhirPackage.ACCOUNT_STATUS_ENUM:
				return validateAccountStatusEnum((AccountStatusEnum)value, diagnostics, context);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_ENUM:
				return validateActionCardinalityBehaviorEnum((ActionCardinalityBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ACTION_CONDITION_KIND_ENUM:
				return validateActionConditionKindEnum((ActionConditionKindEnum)value, diagnostics, context);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_ENUM:
				return validateActionGroupingBehaviorEnum((ActionGroupingBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_ENUM:
				return validateActionParticipantTypeEnum((ActionParticipantTypeEnum)value, diagnostics, context);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_ENUM:
				return validateActionPrecheckBehaviorEnum((ActionPrecheckBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_ENUM:
				return validateActionRelationshipTypeEnum((ActionRelationshipTypeEnum)value, diagnostics, context);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_ENUM:
				return validateActionRequiredBehaviorEnum((ActionRequiredBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_ENUM:
				return validateActionSelectionBehaviorEnum((ActionSelectionBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ADDRESS_TYPE_ENUM:
				return validateAddressTypeEnum((AddressTypeEnum)value, diagnostics, context);
			case FhirPackage.ADDRESS_USE_ENUM:
				return validateAddressUseEnum((AddressUseEnum)value, diagnostics, context);
			case FhirPackage.ADMINISTRATIVE_GENDER_ENUM:
				return validateAdministrativeGenderEnum((AdministrativeGenderEnum)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_ACTUALITY_ENUM:
				return validateAdverseEventActualityEnum((AdverseEventActualityEnum)value, diagnostics, context);
			case FhirPackage.AGE_UNITS_ENUM:
				return validateAgeUnitsEnum((AgeUnitsEnum)value, diagnostics, context);
			case FhirPackage.AGGREGATION_MODE_ENUM:
				return validateAggregationModeEnum((AggregationModeEnum)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_ENUM:
				return validateAllergyIntoleranceCategoryEnum((AllergyIntoleranceCategoryEnum)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_ENUM:
				return validateAllergyIntoleranceCriticalityEnum((AllergyIntoleranceCriticalityEnum)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_ENUM:
				return validateAllergyIntoleranceSeverityEnum((AllergyIntoleranceSeverityEnum)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_ENUM:
				return validateAllergyIntoleranceTypeEnum((AllergyIntoleranceTypeEnum)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_STATUS_ENUM:
				return validateAppointmentStatusEnum((AppointmentStatusEnum)value, diagnostics, context);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_ENUM:
				return validateAssertionDirectionTypeEnum((AssertionDirectionTypeEnum)value, diagnostics, context);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_ENUM:
				return validateAssertionOperatorTypeEnum((AssertionOperatorTypeEnum)value, diagnostics, context);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_ENUM:
				return validateAssertionResponseTypesEnum((AssertionResponseTypesEnum)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ACTION_ENUM:
				return validateAuditEventActionEnum((AuditEventActionEnum)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_ENUM:
				return validateAuditEventAgentNetworkTypeEnum((AuditEventAgentNetworkTypeEnum)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OUTCOME_ENUM:
				return validateAuditEventOutcomeEnum((AuditEventOutcomeEnum)value, diagnostics, context);
			case FhirPackage.BINDING_STRENGTH_ENUM:
				return validateBindingStrengthEnum((BindingStrengthEnum)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_CATEGORY_ENUM:
				return validateBiologicallyDerivedProductCategoryEnum((BiologicallyDerivedProductCategoryEnum)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STATUS_ENUM:
				return validateBiologicallyDerivedProductStatusEnum((BiologicallyDerivedProductStatusEnum)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE_SCALE_ENUM:
				return validateBiologicallyDerivedProductStorageScaleEnum((BiologicallyDerivedProductStorageScaleEnum)value, diagnostics, context);
			case FhirPackage.BUNDLE_TYPE_ENUM:
				return validateBundleTypeEnum((BundleTypeEnum)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_ENUM:
				return validateCapabilityStatementKindEnum((CapabilityStatementKindEnum)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_KIND_ENUM:
				return validateCarePlanActivityKindEnum((CarePlanActivityKindEnum)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_ENUM:
				return validateCarePlanActivityStatusEnum((CarePlanActivityStatusEnum)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_INTENT_ENUM:
				return validateCarePlanIntentEnum((CarePlanIntentEnum)value, diagnostics, context);
			case FhirPackage.CARE_TEAM_STATUS_ENUM:
				return validateCareTeamStatusEnum((CareTeamStatusEnum)value, diagnostics, context);
			case FhirPackage.CATALOG_ENTRY_RELATION_TYPE_ENUM:
				return validateCatalogEntryRelationTypeEnum((CatalogEntryRelationTypeEnum)value, diagnostics, context);
			case FhirPackage.CHARACTERISTIC_COMBINATION_ENUM:
				return validateCharacteristicCombinationEnum((CharacteristicCombinationEnum)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_STATUS_ENUM:
				return validateChargeItemStatusEnum((ChargeItemStatusEnum)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_ENUM:
				return validateClinicalImpressionStatusEnum((ClinicalImpressionStatusEnum)value, diagnostics, context);
			case FhirPackage.CLINICAL_USE_DEFINITION_TYPE_ENUM:
				return validateClinicalUseDefinitionTypeEnum((ClinicalUseDefinitionTypeEnum)value, diagnostics, context);
			case FhirPackage.CODE_SEARCH_SUPPORT_ENUM:
				return validateCodeSearchSupportEnum((CodeSearchSupportEnum)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_ENUM:
				return validateCodeSystemContentModeEnum((CodeSystemContentModeEnum)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_ENUM:
				return validateCodeSystemHierarchyMeaningEnum((CodeSystemHierarchyMeaningEnum)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_TYPE_ENUM:
				return validateCompartmentTypeEnum((CompartmentTypeEnum)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_ENUM:
				return validateCompositionAttestationModeEnum((CompositionAttestationModeEnum)value, diagnostics, context);
			case FhirPackage.COMPOSITION_STATUS_ENUM:
				return validateCompositionStatusEnum((CompositionStatusEnum)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_ENUM:
				return validateConceptMapEquivalenceEnum((ConceptMapEquivalenceEnum)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_ENUM:
				return validateConceptMapGroupUnmappedModeEnum((ConceptMapGroupUnmappedModeEnum)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_ENUM:
				return validateConditionalDeleteStatusEnum((ConditionalDeleteStatusEnum)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_READ_STATUS_ENUM:
				return validateConditionalReadStatusEnum((ConditionalReadStatusEnum)value, diagnostics, context);
			case FhirPackage.CONFIDENTIALITY_ENUM:
				return validateConfidentialityEnum((ConfidentialityEnum)value, diagnostics, context);
			case FhirPackage.CONSENT_DATA_MEANING_ENUM:
				return validateConsentDataMeaningEnum((ConsentDataMeaningEnum)value, diagnostics, context);
			case FhirPackage.CONSENT_PROVISION_TYPE_ENUM:
				return validateConsentProvisionTypeEnum((ConsentProvisionTypeEnum)value, diagnostics, context);
			case FhirPackage.CONSENT_STATE_ENUM:
				return validateConsentStateEnum((ConsentStateEnum)value, diagnostics, context);
			case FhirPackage.CONSTRAINT_SEVERITY_ENUM:
				return validateConstraintSeverityEnum((ConstraintSeverityEnum)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_SYSTEM_ENUM:
				return validateContactPointSystemEnum((ContactPointSystemEnum)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_USE_ENUM:
				return validateContactPointUseEnum((ContactPointUseEnum)value, diagnostics, context);
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES_ENUM:
				return validateContractResourcePublicationStatusCodesEnum((ContractResourcePublicationStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_ENUM:
				return validateContractResourceStatusCodesEnum((ContractResourceStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.CONTRIBUTOR_TYPE_ENUM:
				return validateContributorTypeEnum((ContributorTypeEnum)value, diagnostics, context);
			case FhirPackage.CRITERIA_NOT_EXISTS_BEHAVIOR_ENUM:
				return validateCriteriaNotExistsBehaviorEnum((CriteriaNotExistsBehaviorEnum)value, diagnostics, context);
			case FhirPackage.DAYS_OF_WEEK_ENUM:
				return validateDaysOfWeekEnum((DaysOfWeekEnum)value, diagnostics, context);
			case FhirPackage.DEFINITION_RESOURCE_TYPE_ENUM:
				return validateDefinitionResourceTypeEnum((DefinitionResourceTypeEnum)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_ENUM:
				return validateDetectedIssueSeverityEnum((DetectedIssueSeverityEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_ENUM:
				return validateDeviceMetricCalibrationStateEnum((DeviceMetricCalibrationStateEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_ENUM:
				return validateDeviceMetricCalibrationTypeEnum((DeviceMetricCalibrationTypeEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CATEGORY_ENUM:
				return validateDeviceMetricCategoryEnum((DeviceMetricCategoryEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_COLOR_ENUM:
				return validateDeviceMetricColorEnum((DeviceMetricColorEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_ENUM:
				return validateDeviceMetricOperationalStatusEnum((DeviceMetricOperationalStatusEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_NAME_TYPE_ENUM:
				return validateDeviceNameTypeEnum((DeviceNameTypeEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS_ENUM:
				return validateDeviceUseStatementStatusEnum((DeviceUseStatementStatusEnum)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_ENUM:
				return validateDiagnosticReportStatusEnum((DiagnosticReportStatusEnum)value, diagnostics, context);
			case FhirPackage.DISCRIMINATOR_TYPE_ENUM:
				return validateDiscriminatorTypeEnum((DiscriminatorTypeEnum)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MODE_ENUM:
				return validateDocumentModeEnum((DocumentModeEnum)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_ENUM:
				return validateDocumentReferenceStatusEnum((DocumentReferenceStatusEnum)value, diagnostics, context);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_ENUM:
				return validateDocumentRelationshipTypeEnum((DocumentRelationshipTypeEnum)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE_ENUM:
				return validateEligibilityRequestPurposeEnum((EligibilityRequestPurposeEnum)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE_ENUM:
				return validateEligibilityResponsePurposeEnum((EligibilityResponsePurposeEnum)value, diagnostics, context);
			case FhirPackage.ENABLE_WHEN_BEHAVIOR_ENUM:
				return validateEnableWhenBehaviorEnum((EnableWhenBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_ENUM:
				return validateEncounterLocationStatusEnum((EncounterLocationStatusEnum)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATUS_ENUM:
				return validateEncounterStatusEnum((EncounterStatusEnum)value, diagnostics, context);
			case FhirPackage.ENDPOINT_STATUS_ENUM:
				return validateEndpointStatusEnum((EndpointStatusEnum)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS_ENUM:
				return validateEpisodeOfCareStatusEnum((EpisodeOfCareStatusEnum)value, diagnostics, context);
			case FhirPackage.EVENT_CAPABILITY_MODE_ENUM:
				return validateEventCapabilityModeEnum((EventCapabilityModeEnum)value, diagnostics, context);
			case FhirPackage.EVENT_OR_REQUEST_RESOURCE_TYPES_ENUM:
				return validateEventOrRequestResourceTypesEnum((EventOrRequestResourceTypesEnum)value, diagnostics, context);
			case FhirPackage.EVENT_RESOURCE_TYPE_ENUM:
				return validateEventResourceTypeEnum((EventResourceTypeEnum)value, diagnostics, context);
			case FhirPackage.EVENT_STATUS_ENUM:
				return validateEventStatusEnum((EventStatusEnum)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING_ENUM:
				return validateEventTimingEnum((EventTimingEnum)value, diagnostics, context);
			case FhirPackage.EVIDENCE_VARIABLE_HANDLING_ENUM:
				return validateEvidenceVariableHandlingEnum((EvidenceVariableHandlingEnum)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE_ENUM:
				return validateExampleScenarioActorTypeEnum((ExampleScenarioActorTypeEnum)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_ENUM:
				return validateExplanationOfBenefitStatusEnum((ExplanationOfBenefitStatusEnum)value, diagnostics, context);
			case FhirPackage.EXPRESSION_LANGUAGE_ENUM:
				return validateExpressionLanguageEnum((ExpressionLanguageEnum)value, diagnostics, context);
			case FhirPackage.EXTENSION_CONTEXT_TYPE_ENUM:
				return validateExtensionContextTypeEnum((ExtensionContextTypeEnum)value, diagnostics, context);
			case FhirPackage.FAMILY_HISTORY_STATUS_ENUM:
				return validateFamilyHistoryStatusEnum((FamilyHistoryStatusEnum)value, diagnostics, context);
			case FhirPackage.FHIR_ALL_TYPES_ENUM:
				return validateFHIRAllTypesEnum((FHIRAllTypesEnum)value, diagnostics, context);
			case FhirPackage.FHIR_DEFINED_TYPE_ENUM:
				return validateFHIRDefinedTypeEnum((FHIRDefinedTypeEnum)value, diagnostics, context);
			case FhirPackage.FHIR_DEVICE_STATUS_ENUM:
				return validateFHIRDeviceStatusEnum((FHIRDeviceStatusEnum)value, diagnostics, context);
			case FhirPackage.FHIR_PATH_TYPES_ENUM:
				return validateFHIRPathTypesEnum((FHIRPathTypesEnum)value, diagnostics, context);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_ENUM:
				return validateFHIRSubstanceStatusEnum((FHIRSubstanceStatusEnum)value, diagnostics, context);
			case FhirPackage.FHIR_VERSION_ENUM:
				return validateFHIRVersionEnum((FHIRVersionEnum)value, diagnostics, context);
			case FhirPackage.FILTER_OPERATOR_ENUM:
				return validateFilterOperatorEnum((FilterOperatorEnum)value, diagnostics, context);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_ENUM:
				return validateFinancialResourceStatusCodesEnum((FinancialResourceStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.FLAG_STATUS_ENUM:
				return validateFlagStatusEnum((FlagStatusEnum)value, diagnostics, context);
			case FhirPackage.GOAL_LIFECYCLE_STATUS_ENUM:
				return validateGoalLifecycleStatusEnum((GoalLifecycleStatusEnum)value, diagnostics, context);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_ENUM:
				return validateGraphCompartmentRuleEnum((GraphCompartmentRuleEnum)value, diagnostics, context);
			case FhirPackage.GRAPH_COMPARTMENT_USE_ENUM:
				return validateGraphCompartmentUseEnum((GraphCompartmentUseEnum)value, diagnostics, context);
			case FhirPackage.GROUP_MEASURE_ENUM:
				return validateGroupMeasureEnum((GroupMeasureEnum)value, diagnostics, context);
			case FhirPackage.GROUP_TYPE_ENUM:
				return validateGroupTypeEnum((GroupTypeEnum)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_ENUM:
				return validateGuidanceResponseStatusEnum((GuidanceResponseStatusEnum)value, diagnostics, context);
			case FhirPackage.GUIDE_PAGE_GENERATION_ENUM:
				return validateGuidePageGenerationEnum((GuidePageGenerationEnum)value, diagnostics, context);
			case FhirPackage.GUIDE_PARAMETER_CODE_ENUM:
				return validateGuideParameterCodeEnum((GuideParameterCodeEnum)value, diagnostics, context);
			case FhirPackage.HTTP_VERB_ENUM:
				return validateHTTPVerbEnum((HTTPVerbEnum)value, diagnostics, context);
			case FhirPackage.IDENTIFIER_USE_ENUM:
				return validateIdentifierUseEnum((IdentifierUseEnum)value, diagnostics, context);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_ENUM:
				return validateIdentityAssuranceLevelEnum((IdentityAssuranceLevelEnum)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_STATUS_ENUM:
				return validateImagingStudyStatusEnum((ImagingStudyStatusEnum)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES_ENUM:
				return validateImmunizationEvaluationStatusCodesEnum((ImmunizationEvaluationStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_ENUM:
				return validateImmunizationStatusCodesEnum((ImmunizationStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.INGREDIENT_MANUFACTURER_ROLE_ENUM:
				return validateIngredientManufacturerRoleEnum((IngredientManufacturerRoleEnum)value, diagnostics, context);
			case FhirPackage.INTERACTION_TRIGGER_ENUM:
				return validateInteractionTriggerEnum((InteractionTriggerEnum)value, diagnostics, context);
			case FhirPackage.INVOICE_PRICE_COMPONENT_TYPE_ENUM:
				return validateInvoicePriceComponentTypeEnum((InvoicePriceComponentTypeEnum)value, diagnostics, context);
			case FhirPackage.INVOICE_STATUS_ENUM:
				return validateInvoiceStatusEnum((InvoiceStatusEnum)value, diagnostics, context);
			case FhirPackage.ISSUE_SEVERITY_ENUM:
				return validateIssueSeverityEnum((IssueSeverityEnum)value, diagnostics, context);
			case FhirPackage.ISSUE_TYPE_ENUM:
				return validateIssueTypeEnum((IssueTypeEnum)value, diagnostics, context);
			case FhirPackage.KNOWLEDGE_RESOURCE_TYPE_ENUM:
				return validateKnowledgeResourceTypeEnum((KnowledgeResourceTypeEnum)value, diagnostics, context);
			case FhirPackage.LINKAGE_TYPE_ENUM:
				return validateLinkageTypeEnum((LinkageTypeEnum)value, diagnostics, context);
			case FhirPackage.LINK_TYPE_ENUM:
				return validateLinkTypeEnum((LinkTypeEnum)value, diagnostics, context);
			case FhirPackage.LIST_MODE_ENUM:
				return validateListModeEnum((ListModeEnum)value, diagnostics, context);
			case FhirPackage.LIST_STATUS_ENUM:
				return validateListStatusEnum((ListStatusEnum)value, diagnostics, context);
			case FhirPackage.LOCATION_MODE_ENUM:
				return validateLocationModeEnum((LocationModeEnum)value, diagnostics, context);
			case FhirPackage.LOCATION_STATUS_ENUM:
				return validateLocationStatusEnum((LocationStatusEnum)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STATUS_ENUM:
				return validateMeasureReportStatusEnum((MeasureReportStatusEnum)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_TYPE_ENUM:
				return validateMeasureReportTypeEnum((MeasureReportTypeEnum)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_INTENT_ENUM:
				return validateMedicationRequestIntentEnum((MedicationRequestIntentEnum)value, diagnostics, context);
			case FhirPackage.MEDICATIONREQUEST_STATUS_ENUM:
				return validateMedicationrequestStatusEnum((MedicationrequestStatusEnum)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_CODES_ENUM:
				return validateMedicationStatementStatusCodesEnum((MedicationStatementStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATUS_CODES_ENUM:
				return validateMedicationStatusCodesEnum((MedicationStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST_ENUM:
				return validateMessageheaderResponseRequestEnum((MessageheaderResponseRequestEnum)value, diagnostics, context);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_ENUM:
				return validateMessageSignificanceCategoryEnum((MessageSignificanceCategoryEnum)value, diagnostics, context);
			case FhirPackage.NAME_USE_ENUM:
				return validateNameUseEnum((NameUseEnum)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_ENUM:
				return validateNamingSystemIdentifierTypeEnum((NamingSystemIdentifierTypeEnum)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_TYPE_ENUM:
				return validateNamingSystemTypeEnum((NamingSystemTypeEnum)value, diagnostics, context);
			case FhirPackage.NARRATIVE_STATUS_ENUM:
				return validateNarrativeStatusEnum((NarrativeStatusEnum)value, diagnostics, context);
			case FhirPackage.NOTE_TYPE_ENUM:
				return validateNoteTypeEnum((NoteTypeEnum)value, diagnostics, context);
			case FhirPackage.NUTRITION_PRODUCT_STATUS_ENUM:
				return validateNutritionProductStatusEnum((NutritionProductStatusEnum)value, diagnostics, context);
			case FhirPackage.OBSERVATION_DATA_TYPE_ENUM:
				return validateObservationDataTypeEnum((ObservationDataTypeEnum)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RANGE_CATEGORY_ENUM:
				return validateObservationRangeCategoryEnum((ObservationRangeCategoryEnum)value, diagnostics, context);
			case FhirPackage.OBSERVATION_STATUS_ENUM:
				return validateObservationStatusEnum((ObservationStatusEnum)value, diagnostics, context);
			case FhirPackage.OPERATION_KIND_ENUM:
				return validateOperationKindEnum((OperationKindEnum)value, diagnostics, context);
			case FhirPackage.OPERATION_PARAMETER_USE_ENUM:
				return validateOperationParameterUseEnum((OperationParameterUseEnum)value, diagnostics, context);
			case FhirPackage.ORIENTATION_TYPE_ENUM:
				return validateOrientationTypeEnum((OrientationTypeEnum)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_REQUIRED_ENUM:
				return validateParticipantRequiredEnum((ParticipantRequiredEnum)value, diagnostics, context);
			case FhirPackage.PARTICIPATION_STATUS_ENUM:
				return validateParticipationStatusEnum((ParticipationStatusEnum)value, diagnostics, context);
			case FhirPackage.PROPERTY_REPRESENTATION_ENUM:
				return validatePropertyRepresentationEnum((PropertyRepresentationEnum)value, diagnostics, context);
			case FhirPackage.PROPERTY_TYPE_ENUM:
				return validatePropertyTypeEnum((PropertyTypeEnum)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_ENUM:
				return validateProvenanceEntityRoleEnum((ProvenanceEntityRoleEnum)value, diagnostics, context);
			case FhirPackage.PUBLICATION_STATUS_ENUM:
				return validatePublicationStatusEnum((PublicationStatusEnum)value, diagnostics, context);
			case FhirPackage.QUALITY_TYPE_ENUM:
				return validateQualityTypeEnum((QualityTypeEnum)value, diagnostics, context);
			case FhirPackage.QUANTITY_COMPARATOR_ENUM:
				return validateQuantityComparatorEnum((QuantityComparatorEnum)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR_ENUM:
				return validateQuestionnaireItemOperatorEnum((QuestionnaireItemOperatorEnum)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_ENUM:
				return validateQuestionnaireItemTypeEnum((QuestionnaireItemTypeEnum)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_ENUM:
				return validateQuestionnaireResponseStatusEnum((QuestionnaireResponseStatusEnum)value, diagnostics, context);
			case FhirPackage.REFERENCE_HANDLING_POLICY_ENUM:
				return validateReferenceHandlingPolicyEnum((ReferenceHandlingPolicyEnum)value, diagnostics, context);
			case FhirPackage.REFERENCE_VERSION_RULES_ENUM:
				return validateReferenceVersionRulesEnum((ReferenceVersionRulesEnum)value, diagnostics, context);
			case FhirPackage.RELATED_ARTIFACT_TYPE_ENUM:
				return validateRelatedArtifactTypeEnum((RelatedArtifactTypeEnum)value, diagnostics, context);
			case FhirPackage.REMITTANCE_OUTCOME_ENUM:
				return validateRemittanceOutcomeEnum((RemittanceOutcomeEnum)value, diagnostics, context);
			case FhirPackage.REPORT_RELATIONSHIP_TYPE_ENUM:
				return validateReportRelationshipTypeEnum((ReportRelationshipTypeEnum)value, diagnostics, context);
			case FhirPackage.REPOSITORY_TYPE_ENUM:
				return validateRepositoryTypeEnum((RepositoryTypeEnum)value, diagnostics, context);
			case FhirPackage.REQUEST_INTENT_ENUM:
				return validateRequestIntentEnum((RequestIntentEnum)value, diagnostics, context);
			case FhirPackage.REQUEST_PRIORITY_ENUM:
				return validateRequestPriorityEnum((RequestPriorityEnum)value, diagnostics, context);
			case FhirPackage.REQUEST_RESOURCE_TYPE_ENUM:
				return validateRequestResourceTypeEnum((RequestResourceTypeEnum)value, diagnostics, context);
			case FhirPackage.REQUEST_STATUS_ENUM:
				return validateRequestStatusEnum((RequestStatusEnum)value, diagnostics, context);
			case FhirPackage.RESEARCH_ELEMENT_TYPE_ENUM:
				return validateResearchElementTypeEnum((ResearchElementTypeEnum)value, diagnostics, context);
			case FhirPackage.RESEARCH_STUDY_STATUS_ENUM:
				return validateResearchStudyStatusEnum((ResearchStudyStatusEnum)value, diagnostics, context);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_ENUM:
				return validateResearchSubjectStatusEnum((ResearchSubjectStatusEnum)value, diagnostics, context);
			case FhirPackage.RESOURCE_TYPE_ENUM:
				return validateResourceTypeEnum((ResourceTypeEnum)value, diagnostics, context);
			case FhirPackage.RESOURCE_VERSION_POLICY_ENUM:
				return validateResourceVersionPolicyEnum((ResourceVersionPolicyEnum)value, diagnostics, context);
			case FhirPackage.RESPONSE_TYPE_ENUM:
				return validateResponseTypeEnum((ResponseTypeEnum)value, diagnostics, context);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_ENUM:
				return validateRestfulCapabilityModeEnum((RestfulCapabilityModeEnum)value, diagnostics, context);
			case FhirPackage.SEARCH_COMPARATOR_ENUM:
				return validateSearchComparatorEnum((SearchComparatorEnum)value, diagnostics, context);
			case FhirPackage.SEARCH_ENTRY_MODE_ENUM:
				return validateSearchEntryModeEnum((SearchEntryModeEnum)value, diagnostics, context);
			case FhirPackage.SEARCH_MODIFIER_CODE_ENUM:
				return validateSearchModifierCodeEnum((SearchModifierCodeEnum)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAM_TYPE_ENUM:
				return validateSearchParamTypeEnum((SearchParamTypeEnum)value, diagnostics, context);
			case FhirPackage.SEQUENCE_TYPE_ENUM:
				return validateSequenceTypeEnum((SequenceTypeEnum)value, diagnostics, context);
			case FhirPackage.SLICING_RULES_ENUM:
				return validateSlicingRulesEnum((SlicingRulesEnum)value, diagnostics, context);
			case FhirPackage.SLOT_STATUS_ENUM:
				return validateSlotStatusEnum((SlotStatusEnum)value, diagnostics, context);
			case FhirPackage.SORT_DIRECTION_ENUM:
				return validateSortDirectionEnum((SortDirectionEnum)value, diagnostics, context);
			case FhirPackage.SPDX_LICENSE_ENUM:
				return validateSPDXLicenseEnum((SPDXLicenseEnum)value, diagnostics, context);
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE_ENUM:
				return validateSpecimenContainedPreferenceEnum((SpecimenContainedPreferenceEnum)value, diagnostics, context);
			case FhirPackage.SPECIMEN_STATUS_ENUM:
				return validateSpecimenStatusEnum((SpecimenStatusEnum)value, diagnostics, context);
			case FhirPackage.STATUS_ENUM:
				return validateStatusEnum((StatusEnum)value, diagnostics, context);
			case FhirPackage.STRAND_TYPE_ENUM:
				return validateStrandTypeEnum((StrandTypeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_ENUM:
				return validateStructureDefinitionKindEnum((StructureDefinitionKindEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_ENUM:
				return validateStructureMapContextTypeEnum((StructureMapContextTypeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_ENUM:
				return validateStructureMapGroupTypeModeEnum((StructureMapGroupTypeModeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_ENUM:
				return validateStructureMapInputModeEnum((StructureMapInputModeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_ENUM:
				return validateStructureMapModelModeEnum((StructureMapModelModeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_ENUM:
				return validateStructureMapSourceListModeEnum((StructureMapSourceListModeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_ENUM:
				return validateStructureMapTargetListModeEnum((StructureMapTargetListModeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_ENUM:
				return validateStructureMapTransformEnum((StructureMapTransformEnum)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_ENUM:
				return validateSubscriptionChannelTypeEnum((SubscriptionChannelTypeEnum)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_NOTIFICATION_TYPE_ENUM:
				return validateSubscriptionNotificationTypeEnum((SubscriptionNotificationTypeEnum)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS_CODES_ENUM:
				return validateSubscriptionStatusCodesEnum((SubscriptionStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_ENUM:
				return validateSupplyDeliveryStatusEnum((SupplyDeliveryStatusEnum)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_STATUS_ENUM:
				return validateSupplyRequestStatusEnum((SupplyRequestStatusEnum)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_ENUM:
				return validateSystemRestfulInteractionEnum((SystemRestfulInteractionEnum)value, diagnostics, context);
			case FhirPackage.TASK_INTENT_ENUM:
				return validateTaskIntentEnum((TaskIntentEnum)value, diagnostics, context);
			case FhirPackage.TASK_STATUS_ENUM:
				return validateTaskStatusEnum((TaskStatusEnum)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_ENUM:
				return validateTestReportActionResultEnum((TestReportActionResultEnum)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_ENUM:
				return validateTestReportParticipantTypeEnum((TestReportParticipantTypeEnum)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_RESULT_ENUM:
				return validateTestReportResultEnum((TestReportResultEnum)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_STATUS_ENUM:
				return validateTestReportStatusEnum((TestReportStatusEnum)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_ENUM:
				return validateTestScriptRequestMethodCodeEnum((TestScriptRequestMethodCodeEnum)value, diagnostics, context);
			case FhirPackage.TRIGGER_TYPE_ENUM:
				return validateTriggerTypeEnum((TriggerTypeEnum)value, diagnostics, context);
			case FhirPackage.TYPE_DERIVATION_RULE_ENUM:
				return validateTypeDerivationRuleEnum((TypeDerivationRuleEnum)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_ENUM:
				return validateTypeRestfulInteractionEnum((TypeRestfulInteractionEnum)value, diagnostics, context);
			case FhirPackage.UDI_ENTRY_TYPE_ENUM:
				return validateUDIEntryTypeEnum((UDIEntryTypeEnum)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME_ENUM:
				return validateUnitsOfTimeEnum((UnitsOfTimeEnum)value, diagnostics, context);
			case FhirPackage.USE_ENUM:
				return validateUseEnum((UseEnum)value, diagnostics, context);
			case FhirPackage.VARIABLE_TYPE_ENUM:
				return validateVariableTypeEnum((VariableTypeEnum)value, diagnostics, context);
			case FhirPackage.VISION_BASE_ENUM:
				return validateVisionBaseEnum((VisionBaseEnum)value, diagnostics, context);
			case FhirPackage.VISION_EYES_ENUM:
				return validateVisionEyesEnum((VisionEyesEnum)value, diagnostics, context);
			case FhirPackage.XPATH_USAGE_TYPE_ENUM:
				return validateXPathUsageTypeEnum((XPathUsageTypeEnum)value, diagnostics, context);
			case FhirPackage.ACCOUNT_STATUS_ENUM_OBJECT:
				return validateAccountStatusEnumObject((AccountStatusEnum)value, diagnostics, context);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_ENUM_OBJECT:
				return validateActionCardinalityBehaviorEnumObject((ActionCardinalityBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ACTION_CONDITION_KIND_ENUM_OBJECT:
				return validateActionConditionKindEnumObject((ActionConditionKindEnum)value, diagnostics, context);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_ENUM_OBJECT:
				return validateActionGroupingBehaviorEnumObject((ActionGroupingBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_ENUM_OBJECT:
				return validateActionParticipantTypeEnumObject((ActionParticipantTypeEnum)value, diagnostics, context);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_ENUM_OBJECT:
				return validateActionPrecheckBehaviorEnumObject((ActionPrecheckBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_ENUM_OBJECT:
				return validateActionRelationshipTypeEnumObject((ActionRelationshipTypeEnum)value, diagnostics, context);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_ENUM_OBJECT:
				return validateActionRequiredBehaviorEnumObject((ActionRequiredBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_ENUM_OBJECT:
				return validateActionSelectionBehaviorEnumObject((ActionSelectionBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ADDRESS_TYPE_ENUM_OBJECT:
				return validateAddressTypeEnumObject((AddressTypeEnum)value, diagnostics, context);
			case FhirPackage.ADDRESS_USE_ENUM_OBJECT:
				return validateAddressUseEnumObject((AddressUseEnum)value, diagnostics, context);
			case FhirPackage.ADMINISTRATIVE_GENDER_ENUM_OBJECT:
				return validateAdministrativeGenderEnumObject((AdministrativeGenderEnum)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_ACTUALITY_ENUM_OBJECT:
				return validateAdverseEventActualityEnumObject((AdverseEventActualityEnum)value, diagnostics, context);
			case FhirPackage.AGE_UNITS_ENUM_OBJECT:
				return validateAgeUnitsEnumObject((AgeUnitsEnum)value, diagnostics, context);
			case FhirPackage.AGGREGATION_MODE_ENUM_OBJECT:
				return validateAggregationModeEnumObject((AggregationModeEnum)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_ENUM_OBJECT:
				return validateAllergyIntoleranceCategoryEnumObject((AllergyIntoleranceCategoryEnum)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_ENUM_OBJECT:
				return validateAllergyIntoleranceCriticalityEnumObject((AllergyIntoleranceCriticalityEnum)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_ENUM_OBJECT:
				return validateAllergyIntoleranceSeverityEnumObject((AllergyIntoleranceSeverityEnum)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_ENUM_OBJECT:
				return validateAllergyIntoleranceTypeEnumObject((AllergyIntoleranceTypeEnum)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_STATUS_ENUM_OBJECT:
				return validateAppointmentStatusEnumObject((AppointmentStatusEnum)value, diagnostics, context);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_ENUM_OBJECT:
				return validateAssertionDirectionTypeEnumObject((AssertionDirectionTypeEnum)value, diagnostics, context);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_ENUM_OBJECT:
				return validateAssertionOperatorTypeEnumObject((AssertionOperatorTypeEnum)value, diagnostics, context);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_ENUM_OBJECT:
				return validateAssertionResponseTypesEnumObject((AssertionResponseTypesEnum)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ACTION_ENUM_OBJECT:
				return validateAuditEventActionEnumObject((AuditEventActionEnum)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_ENUM_OBJECT:
				return validateAuditEventAgentNetworkTypeEnumObject((AuditEventAgentNetworkTypeEnum)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OUTCOME_ENUM_OBJECT:
				return validateAuditEventOutcomeEnumObject((AuditEventOutcomeEnum)value, diagnostics, context);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return validateBase64BinaryPrimitive((byte[])value, diagnostics, context);
			case FhirPackage.BINDING_STRENGTH_ENUM_OBJECT:
				return validateBindingStrengthEnumObject((BindingStrengthEnum)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_CATEGORY_ENUM_OBJECT:
				return validateBiologicallyDerivedProductCategoryEnumObject((BiologicallyDerivedProductCategoryEnum)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STATUS_ENUM_OBJECT:
				return validateBiologicallyDerivedProductStatusEnumObject((BiologicallyDerivedProductStatusEnum)value, diagnostics, context);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE_SCALE_ENUM_OBJECT:
				return validateBiologicallyDerivedProductStorageScaleEnumObject((BiologicallyDerivedProductStorageScaleEnum)value, diagnostics, context);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return validateBooleanPrimitive((Boolean)value, diagnostics, context);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return validateBooleanPrimitiveObject((Boolean)value, diagnostics, context);
			case FhirPackage.BUNDLE_TYPE_ENUM_OBJECT:
				return validateBundleTypeEnumObject((BundleTypeEnum)value, diagnostics, context);
			case FhirPackage.CANONICAL_PRIMITIVE:
				return validateCanonicalPrimitive((String)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_ENUM_OBJECT:
				return validateCapabilityStatementKindEnumObject((CapabilityStatementKindEnum)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_KIND_ENUM_OBJECT:
				return validateCarePlanActivityKindEnumObject((CarePlanActivityKindEnum)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_ENUM_OBJECT:
				return validateCarePlanActivityStatusEnumObject((CarePlanActivityStatusEnum)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_INTENT_ENUM_OBJECT:
				return validateCarePlanIntentEnumObject((CarePlanIntentEnum)value, diagnostics, context);
			case FhirPackage.CARE_TEAM_STATUS_ENUM_OBJECT:
				return validateCareTeamStatusEnumObject((CareTeamStatusEnum)value, diagnostics, context);
			case FhirPackage.CATALOG_ENTRY_RELATION_TYPE_ENUM_OBJECT:
				return validateCatalogEntryRelationTypeEnumObject((CatalogEntryRelationTypeEnum)value, diagnostics, context);
			case FhirPackage.CHARACTERISTIC_COMBINATION_ENUM_OBJECT:
				return validateCharacteristicCombinationEnumObject((CharacteristicCombinationEnum)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_STATUS_ENUM_OBJECT:
				return validateChargeItemStatusEnumObject((ChargeItemStatusEnum)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_ENUM_OBJECT:
				return validateClinicalImpressionStatusEnumObject((ClinicalImpressionStatusEnum)value, diagnostics, context);
			case FhirPackage.CLINICAL_USE_DEFINITION_TYPE_ENUM_OBJECT:
				return validateClinicalUseDefinitionTypeEnumObject((ClinicalUseDefinitionTypeEnum)value, diagnostics, context);
			case FhirPackage.CODE_PRIMITIVE:
				return validateCodePrimitive((String)value, diagnostics, context);
			case FhirPackage.CODE_SEARCH_SUPPORT_ENUM_OBJECT:
				return validateCodeSearchSupportEnumObject((CodeSearchSupportEnum)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_ENUM_OBJECT:
				return validateCodeSystemContentModeEnumObject((CodeSystemContentModeEnum)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_ENUM_OBJECT:
				return validateCodeSystemHierarchyMeaningEnumObject((CodeSystemHierarchyMeaningEnum)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_TYPE_ENUM_OBJECT:
				return validateCompartmentTypeEnumObject((CompartmentTypeEnum)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_ENUM_OBJECT:
				return validateCompositionAttestationModeEnumObject((CompositionAttestationModeEnum)value, diagnostics, context);
			case FhirPackage.COMPOSITION_STATUS_ENUM_OBJECT:
				return validateCompositionStatusEnumObject((CompositionStatusEnum)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_ENUM_OBJECT:
				return validateConceptMapEquivalenceEnumObject((ConceptMapEquivalenceEnum)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_ENUM_OBJECT:
				return validateConceptMapGroupUnmappedModeEnumObject((ConceptMapGroupUnmappedModeEnum)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_ENUM_OBJECT:
				return validateConditionalDeleteStatusEnumObject((ConditionalDeleteStatusEnum)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_READ_STATUS_ENUM_OBJECT:
				return validateConditionalReadStatusEnumObject((ConditionalReadStatusEnum)value, diagnostics, context);
			case FhirPackage.CONFIDENTIALITY_ENUM_OBJECT:
				return validateConfidentialityEnumObject((ConfidentialityEnum)value, diagnostics, context);
			case FhirPackage.CONSENT_DATA_MEANING_ENUM_OBJECT:
				return validateConsentDataMeaningEnumObject((ConsentDataMeaningEnum)value, diagnostics, context);
			case FhirPackage.CONSENT_PROVISION_TYPE_ENUM_OBJECT:
				return validateConsentProvisionTypeEnumObject((ConsentProvisionTypeEnum)value, diagnostics, context);
			case FhirPackage.CONSENT_STATE_ENUM_OBJECT:
				return validateConsentStateEnumObject((ConsentStateEnum)value, diagnostics, context);
			case FhirPackage.CONSTRAINT_SEVERITY_ENUM_OBJECT:
				return validateConstraintSeverityEnumObject((ConstraintSeverityEnum)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_SYSTEM_ENUM_OBJECT:
				return validateContactPointSystemEnumObject((ContactPointSystemEnum)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_USE_ENUM_OBJECT:
				return validateContactPointUseEnumObject((ContactPointUseEnum)value, diagnostics, context);
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES_ENUM_OBJECT:
				return validateContractResourcePublicationStatusCodesEnumObject((ContractResourcePublicationStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_ENUM_OBJECT:
				return validateContractResourceStatusCodesEnumObject((ContractResourceStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.CONTRIBUTOR_TYPE_ENUM_OBJECT:
				return validateContributorTypeEnumObject((ContributorTypeEnum)value, diagnostics, context);
			case FhirPackage.CRITERIA_NOT_EXISTS_BEHAVIOR_ENUM_OBJECT:
				return validateCriteriaNotExistsBehaviorEnumObject((CriteriaNotExistsBehaviorEnum)value, diagnostics, context);
			case FhirPackage.DATE_PRIMITIVE:
				return validateDatePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return validateDatePrimitiveBase((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return validateDateTimePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return validateDateTimePrimitiveBase((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DAYS_OF_WEEK_ENUM_OBJECT:
				return validateDaysOfWeekEnumObject((DaysOfWeekEnum)value, diagnostics, context);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return validateDecimalPrimitive(value, diagnostics, context);
			case FhirPackage.DEFINITION_RESOURCE_TYPE_ENUM_OBJECT:
				return validateDefinitionResourceTypeEnumObject((DefinitionResourceTypeEnum)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_ENUM_OBJECT:
				return validateDetectedIssueSeverityEnumObject((DetectedIssueSeverityEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_ENUM_OBJECT:
				return validateDeviceMetricCalibrationStateEnumObject((DeviceMetricCalibrationStateEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_ENUM_OBJECT:
				return validateDeviceMetricCalibrationTypeEnumObject((DeviceMetricCalibrationTypeEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CATEGORY_ENUM_OBJECT:
				return validateDeviceMetricCategoryEnumObject((DeviceMetricCategoryEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_COLOR_ENUM_OBJECT:
				return validateDeviceMetricColorEnumObject((DeviceMetricColorEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_ENUM_OBJECT:
				return validateDeviceMetricOperationalStatusEnumObject((DeviceMetricOperationalStatusEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_NAME_TYPE_ENUM_OBJECT:
				return validateDeviceNameTypeEnumObject((DeviceNameTypeEnum)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS_ENUM_OBJECT:
				return validateDeviceUseStatementStatusEnumObject((DeviceUseStatementStatusEnum)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_ENUM_OBJECT:
				return validateDiagnosticReportStatusEnumObject((DiagnosticReportStatusEnum)value, diagnostics, context);
			case FhirPackage.DISCRIMINATOR_TYPE_ENUM_OBJECT:
				return validateDiscriminatorTypeEnumObject((DiscriminatorTypeEnum)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MODE_ENUM_OBJECT:
				return validateDocumentModeEnumObject((DocumentModeEnum)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_ENUM_OBJECT:
				return validateDocumentReferenceStatusEnumObject((DocumentReferenceStatusEnum)value, diagnostics, context);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_ENUM_OBJECT:
				return validateDocumentRelationshipTypeEnumObject((DocumentRelationshipTypeEnum)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE_ENUM_OBJECT:
				return validateEligibilityRequestPurposeEnumObject((EligibilityRequestPurposeEnum)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE_ENUM_OBJECT:
				return validateEligibilityResponsePurposeEnumObject((EligibilityResponsePurposeEnum)value, diagnostics, context);
			case FhirPackage.ENABLE_WHEN_BEHAVIOR_ENUM_OBJECT:
				return validateEnableWhenBehaviorEnumObject((EnableWhenBehaviorEnum)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_ENUM_OBJECT:
				return validateEncounterLocationStatusEnumObject((EncounterLocationStatusEnum)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATUS_ENUM_OBJECT:
				return validateEncounterStatusEnumObject((EncounterStatusEnum)value, diagnostics, context);
			case FhirPackage.ENDPOINT_STATUS_ENUM_OBJECT:
				return validateEndpointStatusEnumObject((EndpointStatusEnum)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS_ENUM_OBJECT:
				return validateEpisodeOfCareStatusEnumObject((EpisodeOfCareStatusEnum)value, diagnostics, context);
			case FhirPackage.EVENT_CAPABILITY_MODE_ENUM_OBJECT:
				return validateEventCapabilityModeEnumObject((EventCapabilityModeEnum)value, diagnostics, context);
			case FhirPackage.EVENT_OR_REQUEST_RESOURCE_TYPES_ENUM_OBJECT:
				return validateEventOrRequestResourceTypesEnumObject((EventOrRequestResourceTypesEnum)value, diagnostics, context);
			case FhirPackage.EVENT_RESOURCE_TYPE_ENUM_OBJECT:
				return validateEventResourceTypeEnumObject((EventResourceTypeEnum)value, diagnostics, context);
			case FhirPackage.EVENT_STATUS_ENUM_OBJECT:
				return validateEventStatusEnumObject((EventStatusEnum)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING_ENUM_OBJECT:
				return validateEventTimingEnumObject((EventTimingEnum)value, diagnostics, context);
			case FhirPackage.EVIDENCE_VARIABLE_HANDLING_ENUM_OBJECT:
				return validateEvidenceVariableHandlingEnumObject((EvidenceVariableHandlingEnum)value, diagnostics, context);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE_ENUM_OBJECT:
				return validateExampleScenarioActorTypeEnumObject((ExampleScenarioActorTypeEnum)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_ENUM_OBJECT:
				return validateExplanationOfBenefitStatusEnumObject((ExplanationOfBenefitStatusEnum)value, diagnostics, context);
			case FhirPackage.EXPRESSION_LANGUAGE_ENUM_OBJECT:
				return validateExpressionLanguageEnumObject((ExpressionLanguageEnum)value, diagnostics, context);
			case FhirPackage.EXTENSION_CONTEXT_TYPE_ENUM_OBJECT:
				return validateExtensionContextTypeEnumObject((ExtensionContextTypeEnum)value, diagnostics, context);
			case FhirPackage.FAMILY_HISTORY_STATUS_ENUM_OBJECT:
				return validateFamilyHistoryStatusEnumObject((FamilyHistoryStatusEnum)value, diagnostics, context);
			case FhirPackage.FHIR_ALL_TYPES_ENUM_OBJECT:
				return validateFHIRAllTypesEnumObject((FHIRAllTypesEnum)value, diagnostics, context);
			case FhirPackage.FHIR_DEFINED_TYPE_ENUM_OBJECT:
				return validateFHIRDefinedTypeEnumObject((FHIRDefinedTypeEnum)value, diagnostics, context);
			case FhirPackage.FHIR_DEVICE_STATUS_ENUM_OBJECT:
				return validateFHIRDeviceStatusEnumObject((FHIRDeviceStatusEnum)value, diagnostics, context);
			case FhirPackage.FHIR_PATH_TYPES_ENUM_OBJECT:
				return validateFHIRPathTypesEnumObject((FHIRPathTypesEnum)value, diagnostics, context);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_ENUM_OBJECT:
				return validateFHIRSubstanceStatusEnumObject((FHIRSubstanceStatusEnum)value, diagnostics, context);
			case FhirPackage.FHIR_VERSION_ENUM_OBJECT:
				return validateFHIRVersionEnumObject((FHIRVersionEnum)value, diagnostics, context);
			case FhirPackage.FILTER_OPERATOR_ENUM_OBJECT:
				return validateFilterOperatorEnumObject((FilterOperatorEnum)value, diagnostics, context);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_ENUM_OBJECT:
				return validateFinancialResourceStatusCodesEnumObject((FinancialResourceStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.FLAG_STATUS_ENUM_OBJECT:
				return validateFlagStatusEnumObject((FlagStatusEnum)value, diagnostics, context);
			case FhirPackage.GOAL_LIFECYCLE_STATUS_ENUM_OBJECT:
				return validateGoalLifecycleStatusEnumObject((GoalLifecycleStatusEnum)value, diagnostics, context);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_ENUM_OBJECT:
				return validateGraphCompartmentRuleEnumObject((GraphCompartmentRuleEnum)value, diagnostics, context);
			case FhirPackage.GRAPH_COMPARTMENT_USE_ENUM_OBJECT:
				return validateGraphCompartmentUseEnumObject((GraphCompartmentUseEnum)value, diagnostics, context);
			case FhirPackage.GROUP_MEASURE_ENUM_OBJECT:
				return validateGroupMeasureEnumObject((GroupMeasureEnum)value, diagnostics, context);
			case FhirPackage.GROUP_TYPE_ENUM_OBJECT:
				return validateGroupTypeEnumObject((GroupTypeEnum)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_ENUM_OBJECT:
				return validateGuidanceResponseStatusEnumObject((GuidanceResponseStatusEnum)value, diagnostics, context);
			case FhirPackage.GUIDE_PAGE_GENERATION_ENUM_OBJECT:
				return validateGuidePageGenerationEnumObject((GuidePageGenerationEnum)value, diagnostics, context);
			case FhirPackage.GUIDE_PARAMETER_CODE_ENUM_OBJECT:
				return validateGuideParameterCodeEnumObject((GuideParameterCodeEnum)value, diagnostics, context);
			case FhirPackage.HTTP_VERB_ENUM_OBJECT:
				return validateHTTPVerbEnumObject((HTTPVerbEnum)value, diagnostics, context);
			case FhirPackage.IDENTIFIER_USE_ENUM_OBJECT:
				return validateIdentifierUseEnumObject((IdentifierUseEnum)value, diagnostics, context);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_ENUM_OBJECT:
				return validateIdentityAssuranceLevelEnumObject((IdentityAssuranceLevelEnum)value, diagnostics, context);
			case FhirPackage.ID_PRIMITIVE:
				return validateIdPrimitive((String)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_STATUS_ENUM_OBJECT:
				return validateImagingStudyStatusEnumObject((ImagingStudyStatusEnum)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES_ENUM_OBJECT:
				return validateImmunizationEvaluationStatusCodesEnumObject((ImmunizationEvaluationStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_ENUM_OBJECT:
				return validateImmunizationStatusCodesEnumObject((ImmunizationStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.INGREDIENT_MANUFACTURER_ROLE_ENUM_OBJECT:
				return validateIngredientManufacturerRoleEnumObject((IngredientManufacturerRoleEnum)value, diagnostics, context);
			case FhirPackage.INSTANT_PRIMITIVE:
				return validateInstantPrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.INTEGER_PRIMITIVE:
				return validateIntegerPrimitive((Integer)value, diagnostics, context);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return validateIntegerPrimitiveObject((Integer)value, diagnostics, context);
			case FhirPackage.INTERACTION_TRIGGER_ENUM_OBJECT:
				return validateInteractionTriggerEnumObject((InteractionTriggerEnum)value, diagnostics, context);
			case FhirPackage.INVOICE_PRICE_COMPONENT_TYPE_ENUM_OBJECT:
				return validateInvoicePriceComponentTypeEnumObject((InvoicePriceComponentTypeEnum)value, diagnostics, context);
			case FhirPackage.INVOICE_STATUS_ENUM_OBJECT:
				return validateInvoiceStatusEnumObject((InvoiceStatusEnum)value, diagnostics, context);
			case FhirPackage.ISSUE_SEVERITY_ENUM_OBJECT:
				return validateIssueSeverityEnumObject((IssueSeverityEnum)value, diagnostics, context);
			case FhirPackage.ISSUE_TYPE_ENUM_OBJECT:
				return validateIssueTypeEnumObject((IssueTypeEnum)value, diagnostics, context);
			case FhirPackage.KNOWLEDGE_RESOURCE_TYPE_ENUM_OBJECT:
				return validateKnowledgeResourceTypeEnumObject((KnowledgeResourceTypeEnum)value, diagnostics, context);
			case FhirPackage.LINKAGE_TYPE_ENUM_OBJECT:
				return validateLinkageTypeEnumObject((LinkageTypeEnum)value, diagnostics, context);
			case FhirPackage.LINK_TYPE_ENUM_OBJECT:
				return validateLinkTypeEnumObject((LinkTypeEnum)value, diagnostics, context);
			case FhirPackage.LIST_MODE_ENUM_OBJECT:
				return validateListModeEnumObject((ListModeEnum)value, diagnostics, context);
			case FhirPackage.LIST_STATUS_ENUM_OBJECT:
				return validateListStatusEnumObject((ListStatusEnum)value, diagnostics, context);
			case FhirPackage.LOCATION_MODE_ENUM_OBJECT:
				return validateLocationModeEnumObject((LocationModeEnum)value, diagnostics, context);
			case FhirPackage.LOCATION_STATUS_ENUM_OBJECT:
				return validateLocationStatusEnumObject((LocationStatusEnum)value, diagnostics, context);
			case FhirPackage.MARKDOWN_PRIMITIVE:
				return validateMarkdownPrimitive((String)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STATUS_ENUM_OBJECT:
				return validateMeasureReportStatusEnumObject((MeasureReportStatusEnum)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_TYPE_ENUM_OBJECT:
				return validateMeasureReportTypeEnumObject((MeasureReportTypeEnum)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_INTENT_ENUM_OBJECT:
				return validateMedicationRequestIntentEnumObject((MedicationRequestIntentEnum)value, diagnostics, context);
			case FhirPackage.MEDICATIONREQUEST_STATUS_ENUM_OBJECT:
				return validateMedicationrequestStatusEnumObject((MedicationrequestStatusEnum)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_CODES_ENUM_OBJECT:
				return validateMedicationStatementStatusCodesEnumObject((MedicationStatementStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATUS_CODES_ENUM_OBJECT:
				return validateMedicationStatusCodesEnumObject((MedicationStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST_ENUM_OBJECT:
				return validateMessageheaderResponseRequestEnumObject((MessageheaderResponseRequestEnum)value, diagnostics, context);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_ENUM_OBJECT:
				return validateMessageSignificanceCategoryEnumObject((MessageSignificanceCategoryEnum)value, diagnostics, context);
			case FhirPackage.NAME_USE_ENUM_OBJECT:
				return validateNameUseEnumObject((NameUseEnum)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_ENUM_OBJECT:
				return validateNamingSystemIdentifierTypeEnumObject((NamingSystemIdentifierTypeEnum)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_TYPE_ENUM_OBJECT:
				return validateNamingSystemTypeEnumObject((NamingSystemTypeEnum)value, diagnostics, context);
			case FhirPackage.NARRATIVE_STATUS_ENUM_OBJECT:
				return validateNarrativeStatusEnumObject((NarrativeStatusEnum)value, diagnostics, context);
			case FhirPackage.NOTE_TYPE_ENUM_OBJECT:
				return validateNoteTypeEnumObject((NoteTypeEnum)value, diagnostics, context);
			case FhirPackage.NUTRITION_PRODUCT_STATUS_ENUM_OBJECT:
				return validateNutritionProductStatusEnumObject((NutritionProductStatusEnum)value, diagnostics, context);
			case FhirPackage.OBSERVATION_DATA_TYPE_ENUM_OBJECT:
				return validateObservationDataTypeEnumObject((ObservationDataTypeEnum)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RANGE_CATEGORY_ENUM_OBJECT:
				return validateObservationRangeCategoryEnumObject((ObservationRangeCategoryEnum)value, diagnostics, context);
			case FhirPackage.OBSERVATION_STATUS_ENUM_OBJECT:
				return validateObservationStatusEnumObject((ObservationStatusEnum)value, diagnostics, context);
			case FhirPackage.OID_PRIMITIVE:
				return validateOidPrimitive((String)value, diagnostics, context);
			case FhirPackage.OPERATION_KIND_ENUM_OBJECT:
				return validateOperationKindEnumObject((OperationKindEnum)value, diagnostics, context);
			case FhirPackage.OPERATION_PARAMETER_USE_ENUM_OBJECT:
				return validateOperationParameterUseEnumObject((OperationParameterUseEnum)value, diagnostics, context);
			case FhirPackage.ORIENTATION_TYPE_ENUM_OBJECT:
				return validateOrientationTypeEnumObject((OrientationTypeEnum)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_REQUIRED_ENUM_OBJECT:
				return validateParticipantRequiredEnumObject((ParticipantRequiredEnum)value, diagnostics, context);
			case FhirPackage.PARTICIPATION_STATUS_ENUM_OBJECT:
				return validateParticipationStatusEnumObject((ParticipationStatusEnum)value, diagnostics, context);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return validatePositiveIntPrimitive((BigInteger)value, diagnostics, context);
			case FhirPackage.PROPERTY_REPRESENTATION_ENUM_OBJECT:
				return validatePropertyRepresentationEnumObject((PropertyRepresentationEnum)value, diagnostics, context);
			case FhirPackage.PROPERTY_TYPE_ENUM_OBJECT:
				return validatePropertyTypeEnumObject((PropertyTypeEnum)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_ENUM_OBJECT:
				return validateProvenanceEntityRoleEnumObject((ProvenanceEntityRoleEnum)value, diagnostics, context);
			case FhirPackage.PUBLICATION_STATUS_ENUM_OBJECT:
				return validatePublicationStatusEnumObject((PublicationStatusEnum)value, diagnostics, context);
			case FhirPackage.QUALITY_TYPE_ENUM_OBJECT:
				return validateQualityTypeEnumObject((QualityTypeEnum)value, diagnostics, context);
			case FhirPackage.QUANTITY_COMPARATOR_ENUM_OBJECT:
				return validateQuantityComparatorEnumObject((QuantityComparatorEnum)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR_ENUM_OBJECT:
				return validateQuestionnaireItemOperatorEnumObject((QuestionnaireItemOperatorEnum)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_ENUM_OBJECT:
				return validateQuestionnaireItemTypeEnumObject((QuestionnaireItemTypeEnum)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_ENUM_OBJECT:
				return validateQuestionnaireResponseStatusEnumObject((QuestionnaireResponseStatusEnum)value, diagnostics, context);
			case FhirPackage.REFERENCE_HANDLING_POLICY_ENUM_OBJECT:
				return validateReferenceHandlingPolicyEnumObject((ReferenceHandlingPolicyEnum)value, diagnostics, context);
			case FhirPackage.REFERENCE_VERSION_RULES_ENUM_OBJECT:
				return validateReferenceVersionRulesEnumObject((ReferenceVersionRulesEnum)value, diagnostics, context);
			case FhirPackage.RELATED_ARTIFACT_TYPE_ENUM_OBJECT:
				return validateRelatedArtifactTypeEnumObject((RelatedArtifactTypeEnum)value, diagnostics, context);
			case FhirPackage.REMITTANCE_OUTCOME_ENUM_OBJECT:
				return validateRemittanceOutcomeEnumObject((RemittanceOutcomeEnum)value, diagnostics, context);
			case FhirPackage.REPORT_RELATIONSHIP_TYPE_ENUM_OBJECT:
				return validateReportRelationshipTypeEnumObject((ReportRelationshipTypeEnum)value, diagnostics, context);
			case FhirPackage.REPOSITORY_TYPE_ENUM_OBJECT:
				return validateRepositoryTypeEnumObject((RepositoryTypeEnum)value, diagnostics, context);
			case FhirPackage.REQUEST_INTENT_ENUM_OBJECT:
				return validateRequestIntentEnumObject((RequestIntentEnum)value, diagnostics, context);
			case FhirPackage.REQUEST_PRIORITY_ENUM_OBJECT:
				return validateRequestPriorityEnumObject((RequestPriorityEnum)value, diagnostics, context);
			case FhirPackage.REQUEST_RESOURCE_TYPE_ENUM_OBJECT:
				return validateRequestResourceTypeEnumObject((RequestResourceTypeEnum)value, diagnostics, context);
			case FhirPackage.REQUEST_STATUS_ENUM_OBJECT:
				return validateRequestStatusEnumObject((RequestStatusEnum)value, diagnostics, context);
			case FhirPackage.RESEARCH_ELEMENT_TYPE_ENUM_OBJECT:
				return validateResearchElementTypeEnumObject((ResearchElementTypeEnum)value, diagnostics, context);
			case FhirPackage.RESEARCH_STUDY_STATUS_ENUM_OBJECT:
				return validateResearchStudyStatusEnumObject((ResearchStudyStatusEnum)value, diagnostics, context);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_ENUM_OBJECT:
				return validateResearchSubjectStatusEnumObject((ResearchSubjectStatusEnum)value, diagnostics, context);
			case FhirPackage.RESOURCE_TYPE_ENUM_OBJECT:
				return validateResourceTypeEnumObject((ResourceTypeEnum)value, diagnostics, context);
			case FhirPackage.RESOURCE_VERSION_POLICY_ENUM_OBJECT:
				return validateResourceVersionPolicyEnumObject((ResourceVersionPolicyEnum)value, diagnostics, context);
			case FhirPackage.RESPONSE_TYPE_ENUM_OBJECT:
				return validateResponseTypeEnumObject((ResponseTypeEnum)value, diagnostics, context);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_ENUM_OBJECT:
				return validateRestfulCapabilityModeEnumObject((RestfulCapabilityModeEnum)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return validateSampledDataDataTypePrimitive((String)value, diagnostics, context);
			case FhirPackage.SEARCH_COMPARATOR_ENUM_OBJECT:
				return validateSearchComparatorEnumObject((SearchComparatorEnum)value, diagnostics, context);
			case FhirPackage.SEARCH_ENTRY_MODE_ENUM_OBJECT:
				return validateSearchEntryModeEnumObject((SearchEntryModeEnum)value, diagnostics, context);
			case FhirPackage.SEARCH_MODIFIER_CODE_ENUM_OBJECT:
				return validateSearchModifierCodeEnumObject((SearchModifierCodeEnum)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAM_TYPE_ENUM_OBJECT:
				return validateSearchParamTypeEnumObject((SearchParamTypeEnum)value, diagnostics, context);
			case FhirPackage.SEQUENCE_TYPE_ENUM_OBJECT:
				return validateSequenceTypeEnumObject((SequenceTypeEnum)value, diagnostics, context);
			case FhirPackage.SLICING_RULES_ENUM_OBJECT:
				return validateSlicingRulesEnumObject((SlicingRulesEnum)value, diagnostics, context);
			case FhirPackage.SLOT_STATUS_ENUM_OBJECT:
				return validateSlotStatusEnumObject((SlotStatusEnum)value, diagnostics, context);
			case FhirPackage.SORT_DIRECTION_ENUM_OBJECT:
				return validateSortDirectionEnumObject((SortDirectionEnum)value, diagnostics, context);
			case FhirPackage.SPDX_LICENSE_ENUM_OBJECT:
				return validateSPDXLicenseEnumObject((SPDXLicenseEnum)value, diagnostics, context);
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE_ENUM_OBJECT:
				return validateSpecimenContainedPreferenceEnumObject((SpecimenContainedPreferenceEnum)value, diagnostics, context);
			case FhirPackage.SPECIMEN_STATUS_ENUM_OBJECT:
				return validateSpecimenStatusEnumObject((SpecimenStatusEnum)value, diagnostics, context);
			case FhirPackage.STATUS_ENUM_OBJECT:
				return validateStatusEnumObject((StatusEnum)value, diagnostics, context);
			case FhirPackage.STRAND_TYPE_ENUM_OBJECT:
				return validateStrandTypeEnumObject((StrandTypeEnum)value, diagnostics, context);
			case FhirPackage.STRING_PRIMITIVE:
				return validateStringPrimitive((String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_ENUM_OBJECT:
				return validateStructureDefinitionKindEnumObject((StructureDefinitionKindEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_ENUM_OBJECT:
				return validateStructureMapContextTypeEnumObject((StructureMapContextTypeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_ENUM_OBJECT:
				return validateStructureMapGroupTypeModeEnumObject((StructureMapGroupTypeModeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_ENUM_OBJECT:
				return validateStructureMapInputModeEnumObject((StructureMapInputModeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_ENUM_OBJECT:
				return validateStructureMapModelModeEnumObject((StructureMapModelModeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_ENUM_OBJECT:
				return validateStructureMapSourceListModeEnumObject((StructureMapSourceListModeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_ENUM_OBJECT:
				return validateStructureMapTargetListModeEnumObject((StructureMapTargetListModeEnum)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_ENUM_OBJECT:
				return validateStructureMapTransformEnumObject((StructureMapTransformEnum)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_ENUM_OBJECT:
				return validateSubscriptionChannelTypeEnumObject((SubscriptionChannelTypeEnum)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_NOTIFICATION_TYPE_ENUM_OBJECT:
				return validateSubscriptionNotificationTypeEnumObject((SubscriptionNotificationTypeEnum)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS_CODES_ENUM_OBJECT:
				return validateSubscriptionStatusCodesEnumObject((SubscriptionStatusCodesEnum)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_ENUM_OBJECT:
				return validateSupplyDeliveryStatusEnumObject((SupplyDeliveryStatusEnum)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_STATUS_ENUM_OBJECT:
				return validateSupplyRequestStatusEnumObject((SupplyRequestStatusEnum)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_ENUM_OBJECT:
				return validateSystemRestfulInteractionEnumObject((SystemRestfulInteractionEnum)value, diagnostics, context);
			case FhirPackage.TASK_INTENT_ENUM_OBJECT:
				return validateTaskIntentEnumObject((TaskIntentEnum)value, diagnostics, context);
			case FhirPackage.TASK_STATUS_ENUM_OBJECT:
				return validateTaskStatusEnumObject((TaskStatusEnum)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_ENUM_OBJECT:
				return validateTestReportActionResultEnumObject((TestReportActionResultEnum)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_ENUM_OBJECT:
				return validateTestReportParticipantTypeEnumObject((TestReportParticipantTypeEnum)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_RESULT_ENUM_OBJECT:
				return validateTestReportResultEnumObject((TestReportResultEnum)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_STATUS_ENUM_OBJECT:
				return validateTestReportStatusEnumObject((TestReportStatusEnum)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_ENUM_OBJECT:
				return validateTestScriptRequestMethodCodeEnumObject((TestScriptRequestMethodCodeEnum)value, diagnostics, context);
			case FhirPackage.TIME_PRIMITIVE:
				return validateTimePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.TRIGGER_TYPE_ENUM_OBJECT:
				return validateTriggerTypeEnumObject((TriggerTypeEnum)value, diagnostics, context);
			case FhirPackage.TYPE_DERIVATION_RULE_ENUM_OBJECT:
				return validateTypeDerivationRuleEnumObject((TypeDerivationRuleEnum)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_ENUM_OBJECT:
				return validateTypeRestfulInteractionEnumObject((TypeRestfulInteractionEnum)value, diagnostics, context);
			case FhirPackage.UDI_ENTRY_TYPE_ENUM_OBJECT:
				return validateUDIEntryTypeEnumObject((UDIEntryTypeEnum)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME_ENUM_OBJECT:
				return validateUnitsOfTimeEnumObject((UnitsOfTimeEnum)value, diagnostics, context);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return validateUnsignedIntPrimitive((BigInteger)value, diagnostics, context);
			case FhirPackage.URI_PRIMITIVE:
				return validateUriPrimitive((String)value, diagnostics, context);
			case FhirPackage.URL_PRIMITIVE:
				return validateUrlPrimitive((String)value, diagnostics, context);
			case FhirPackage.USE_ENUM_OBJECT:
				return validateUseEnumObject((UseEnum)value, diagnostics, context);
			case FhirPackage.UUID_PRIMITIVE:
				return validateUuidPrimitive((String)value, diagnostics, context);
			case FhirPackage.VARIABLE_TYPE_ENUM_OBJECT:
				return validateVariableTypeEnumObject((VariableTypeEnum)value, diagnostics, context);
			case FhirPackage.VISION_BASE_ENUM_OBJECT:
				return validateVisionBaseEnumObject((VisionBaseEnum)value, diagnostics, context);
			case FhirPackage.VISION_EYES_ENUM_OBJECT:
				return validateVisionEyesEnumObject((VisionEyesEnum)value, diagnostics, context);
			case FhirPackage.XPATH_USAGE_TYPE_ENUM_OBJECT:
				return validateXPathUsageTypeEnumObject((XPathUsageTypeEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccount(Account account, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(account, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountCoverage(AccountCoverage accountCoverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountCoverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountGuarantor(AccountGuarantor accountGuarantor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountGuarantor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountStatus(AccountStatus accountStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionCardinalityBehavior(ActionCardinalityBehavior actionCardinalityBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionCardinalityBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionConditionKind(ActionConditionKind actionConditionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionConditionKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionGroupingBehavior(ActionGroupingBehavior actionGroupingBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionGroupingBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionParticipantType(ActionParticipantType actionParticipantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionParticipantType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionPrecheckBehavior(ActionPrecheckBehavior actionPrecheckBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionPrecheckBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRelationshipType(ActionRelationshipType actionRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRequiredBehavior(ActionRequiredBehavior actionRequiredBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionRequiredBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionSelectionBehavior(ActionSelectionBehavior actionSelectionBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionSelectionBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefinition(ActivityDefinition activityDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefinitionDynamicValue(ActivityDefinitionDynamicValue activityDefinitionDynamicValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityDefinitionDynamicValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefinitionParticipant(ActivityDefinitionParticipant activityDefinitionParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityDefinitionParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressType(AddressType addressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUse(AddressUse addressUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrableProductDefinition(AdministrableProductDefinition administrableProductDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(administrableProductDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrableProductDefinitionProperty(AdministrableProductDefinitionProperty administrableProductDefinitionProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(administrableProductDefinitionProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrableProductDefinitionRouteOfAdministration(AdministrableProductDefinitionRouteOfAdministration administrableProductDefinitionRouteOfAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(administrableProductDefinitionRouteOfAdministration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrableProductDefinitionTargetSpecies(AdministrableProductDefinitionTargetSpecies administrableProductDefinitionTargetSpecies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(administrableProductDefinitionTargetSpecies, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrableProductDefinitionWithdrawalPeriod(AdministrableProductDefinitionWithdrawalPeriod administrableProductDefinitionWithdrawalPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(administrableProductDefinitionWithdrawalPeriod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGender(AdministrativeGender administrativeGender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(administrativeGender, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEvent(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adverseEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventActuality(AdverseEventActuality adverseEventActuality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adverseEventActuality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventCausality(AdverseEventCausality adverseEventCausality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adverseEventCausality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventSuspectEntity(AdverseEventSuspectEntity adverseEventSuspectEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adverseEventSuspectEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAge(Age age, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(age, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeUnits(AgeUnits ageUnits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ageUnits, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationMode(AggregationMode aggregationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance(AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntolerance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCategory(AllergyIntoleranceCategory allergyIntoleranceCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCriticality(AllergyIntoleranceCriticality allergyIntoleranceCriticality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceCriticality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceReaction(AllergyIntoleranceReaction allergyIntoleranceReaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceReaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverity(AllergyIntoleranceSeverity allergyIntoleranceSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceType(AllergyIntoleranceType allergyIntoleranceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointment(Appointment appointment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentParticipant(AppointmentParticipant appointmentParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentResponse(AppointmentResponse appointmentResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentStatus(AppointmentStatus appointmentStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionDirectionType(AssertionDirectionType assertionDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionDirectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionOperatorType(AssertionOperatorType assertionOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionOperatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionResponseTypes(AssertionResponseTypes assertionResponseTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionResponseTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttachment(Attachment attachment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEvent(AuditEvent auditEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAction(AuditEventAction auditEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAgent(AuditEventAgent auditEventAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventAgent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAgentNetworkType(AuditEventAgentNetworkType auditEventAgentNetworkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventAgentNetworkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventDetail(AuditEventDetail auditEventDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventEntity(AuditEventEntity auditEventEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventNetwork(AuditEventNetwork auditEventNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventNetwork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventOutcome(AuditEventOutcome auditEventOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventSource(AuditEventSource auditEventSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackboneElement(BackboneElement backboneElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backboneElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64Binary(Base64Binary base64Binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(base64Binary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasic(Basic basic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinary(Binary binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingStrength(BindingStrength bindingStrength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindingStrength, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProduct(BiologicallyDerivedProduct biologicallyDerivedProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(biologicallyDerivedProduct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductCategory(BiologicallyDerivedProductCategory biologicallyDerivedProductCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(biologicallyDerivedProductCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductCollection(BiologicallyDerivedProductCollection biologicallyDerivedProductCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(biologicallyDerivedProductCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductManipulation(BiologicallyDerivedProductManipulation biologicallyDerivedProductManipulation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(biologicallyDerivedProductManipulation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductProcessing(BiologicallyDerivedProductProcessing biologicallyDerivedProductProcessing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(biologicallyDerivedProductProcessing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductStatus(BiologicallyDerivedProductStatus biologicallyDerivedProductStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(biologicallyDerivedProductStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductStorage(BiologicallyDerivedProductStorage biologicallyDerivedProductStorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(biologicallyDerivedProductStorage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductStorageScale(BiologicallyDerivedProductStorageScale biologicallyDerivedProductStorageScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(biologicallyDerivedProductStorageScale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyStructure(BodyStructure bodyStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bodyStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(org.hl7.fhir.Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleEntry(BundleEntry bundleEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleLink(BundleLink bundleLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleRequest(BundleRequest bundleRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleResponse(BundleResponse bundleResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleSearch(BundleSearch bundleSearch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleSearch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleType(BundleType bundleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCanonical(Canonical canonical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(canonical, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatement(CapabilityStatement capabilityStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementDocument(CapabilityStatementDocument capabilityStatementDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementEndpoint(CapabilityStatementEndpoint capabilityStatementEndpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementEndpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementImplementation(CapabilityStatementImplementation capabilityStatementImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementInteraction(CapabilityStatementInteraction capabilityStatementInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementInteraction1(CapabilityStatementInteraction1 capabilityStatementInteraction1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementInteraction1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementKind(CapabilityStatementKind capabilityStatementKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementMessaging(CapabilityStatementMessaging capabilityStatementMessaging, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementMessaging, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementOperation(CapabilityStatementOperation capabilityStatementOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementResource(CapabilityStatementResource capabilityStatementResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementRest(CapabilityStatementRest capabilityStatementRest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementRest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementSearchParam(CapabilityStatementSearchParam capabilityStatementSearchParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementSearchParam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementSecurity(CapabilityStatementSecurity capabilityStatementSecurity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementSecurity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementSoftware(CapabilityStatementSoftware capabilityStatementSoftware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementSoftware, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementSupportedMessage(CapabilityStatementSupportedMessage capabilityStatementSupportedMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementSupportedMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlan(CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivity(CarePlanActivity carePlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityKind(CarePlanActivityKind carePlanActivityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanActivityKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityStatus(CarePlanActivityStatus carePlanActivityStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanActivityStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDetail(CarePlanDetail carePlanDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanIntent(CarePlanIntent carePlanIntent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanIntent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeam(CareTeam careTeam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(careTeam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamParticipant(CareTeamParticipant careTeamParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(careTeamParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamStatus(CareTeamStatus careTeamStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(careTeamStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogEntry(CatalogEntry catalogEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalogEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogEntryRelatedEntry(CatalogEntryRelatedEntry catalogEntryRelatedEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalogEntryRelatedEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogEntryRelationType(CatalogEntryRelationType catalogEntryRelationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalogEntryRelationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicCombination(CharacteristicCombination characteristicCombination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characteristicCombination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItem(ChargeItem chargeItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargeItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemDefinition(ChargeItemDefinition chargeItemDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargeItemDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemDefinitionApplicability(ChargeItemDefinitionApplicability chargeItemDefinitionApplicability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargeItemDefinitionApplicability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemDefinitionPriceComponent(ChargeItemDefinitionPriceComponent chargeItemDefinitionPriceComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargeItemDefinitionPriceComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemDefinitionPropertyGroup(ChargeItemDefinitionPropertyGroup chargeItemDefinitionPropertyGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargeItemDefinitionPropertyGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemPerformer(ChargeItemPerformer chargeItemPerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargeItemPerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemStatus(ChargeItemStatus chargeItemStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargeItemStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitation(Citation citation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationAbstract(CitationAbstract citationAbstract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationAbstract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationAffiliationInfo(CitationAffiliationInfo citationAffiliationInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationAffiliationInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationCitedArtifact(CitationCitedArtifact citationCitedArtifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationCitedArtifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationClassification(CitationClassification citationClassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationClassification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationClassification1(CitationClassification1 citationClassification1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationClassification1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationContributionInstance(CitationContributionInstance citationContributionInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationContributionInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationContributorship(CitationContributorship citationContributorship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationContributorship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationDateOfPublication(CitationDateOfPublication citationDateOfPublication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationDateOfPublication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationEntry(CitationEntry citationEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationPart(CitationPart citationPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationPeriodicRelease(CitationPeriodicRelease citationPeriodicRelease, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationPeriodicRelease, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationPublicationForm(CitationPublicationForm citationPublicationForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationPublicationForm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationPublishedIn(CitationPublishedIn citationPublishedIn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationPublishedIn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationRelatesTo(CitationRelatesTo citationRelatesTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationRelatesTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationRelatesTo1(CitationRelatesTo1 citationRelatesTo1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationRelatesTo1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationStatusDate(CitationStatusDate citationStatusDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationStatusDate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationStatusDate1(CitationStatusDate1 citationStatusDate1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationStatusDate1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationSummary(CitationSummary citationSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationSummary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationSummary1(CitationSummary1 citationSummary1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationSummary1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationTitle(CitationTitle citationTitle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationTitle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationVersion(CitationVersion citationVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationVersion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationWebLocation(CitationWebLocation citationWebLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationWebLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationWhoClassified(CitationWhoClassified citationWhoClassified, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citationWhoClassified, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaim(Claim claim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claim, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimAccident(ClaimAccident claimAccident, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimAccident, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimCareTeam(ClaimCareTeam claimCareTeam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimCareTeam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimDetail(ClaimDetail claimDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimDiagnosis(ClaimDiagnosis claimDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimDiagnosis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimInsurance(ClaimInsurance claimInsurance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimInsurance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimItem(ClaimItem claimItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimPayee(ClaimPayee claimPayee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimPayee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimProcedure(ClaimProcedure claimProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimProcedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimRelated(ClaimRelated claimRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponse(ClaimResponse claimResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAddItem(ClaimResponseAddItem claimResponseAddItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAddItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication(ClaimResponseAdjudication claimResponseAdjudication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseDetail(ClaimResponseDetail claimResponseDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseDetail1(ClaimResponseDetail1 claimResponseDetail1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseDetail1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseError(ClaimResponseError claimResponseError, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseError, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseInsurance(ClaimResponseInsurance claimResponseInsurance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseInsurance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseItem(ClaimResponseItem claimResponseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponsePayment(ClaimResponsePayment claimResponsePayment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponsePayment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseProcessNote(ClaimResponseProcessNote claimResponseProcessNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseProcessNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseSubDetail(ClaimResponseSubDetail claimResponseSubDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseSubDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseSubDetail1(ClaimResponseSubDetail1 claimResponseSubDetail1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseSubDetail1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseTotal(ClaimResponseTotal claimResponseTotal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseTotal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimSubDetail(ClaimSubDetail claimSubDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimSubDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimSupportingInfo(ClaimSupportingInfo claimSupportingInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimSupportingInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpression(ClinicalImpression clinicalImpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionFinding(ClinicalImpressionFinding clinicalImpressionFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionFinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionInvestigation(ClinicalImpressionInvestigation clinicalImpressionInvestigation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionInvestigation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionStatus(ClinicalImpressionStatus clinicalImpressionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalUseDefinition(ClinicalUseDefinition clinicalUseDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalUseDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalUseDefinitionContraindication(ClinicalUseDefinitionContraindication clinicalUseDefinitionContraindication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalUseDefinitionContraindication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalUseDefinitionIndication(ClinicalUseDefinitionIndication clinicalUseDefinitionIndication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalUseDefinitionIndication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalUseDefinitionInteractant(ClinicalUseDefinitionInteractant clinicalUseDefinitionInteractant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalUseDefinitionInteractant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalUseDefinitionInteraction(ClinicalUseDefinitionInteraction clinicalUseDefinitionInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalUseDefinitionInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalUseDefinitionOtherTherapy(ClinicalUseDefinitionOtherTherapy clinicalUseDefinitionOtherTherapy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalUseDefinitionOtherTherapy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalUseDefinitionType(ClinicalUseDefinitionType clinicalUseDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalUseDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalUseDefinitionUndesirableEffect(ClinicalUseDefinitionUndesirableEffect clinicalUseDefinitionUndesirableEffect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalUseDefinitionUndesirableEffect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalUseDefinitionWarning(ClinicalUseDefinitionWarning clinicalUseDefinitionWarning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalUseDefinitionWarning, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCode(Code code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(code, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeableConcept(CodeableConcept codeableConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeableConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeableReference(CodeableReference codeableReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeableReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSearchSupport(CodeSearchSupport codeSearchSupport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSearchSupport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystem(CodeSystem codeSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemConcept(CodeSystemConcept codeSystemConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemContentMode(CodeSystemContentMode codeSystemContentMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemContentMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemDesignation(CodeSystemDesignation codeSystemDesignation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemDesignation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemFilter(CodeSystemFilter codeSystemFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemHierarchyMeaning(CodeSystemHierarchyMeaning codeSystemHierarchyMeaning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemHierarchyMeaning, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemProperty(CodeSystemProperty codeSystemProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemProperty1(CodeSystemProperty1 codeSystemProperty1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemProperty1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoding(Coding coding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunication(Communication communication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationPayload(CommunicationPayload communicationPayload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationPayload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequest(CommunicationRequest communicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequestPayload(CommunicationRequestPayload communicationRequestPayload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationRequestPayload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentDefinition(CompartmentDefinition compartmentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentDefinitionResource(CompartmentDefinitionResource compartmentDefinitionResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentDefinitionResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentType(CompartmentType compartmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposition(Composition composition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(composition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttestationMode(CompositionAttestationMode compositionAttestationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionAttestationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttester(CompositionAttester compositionAttester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionAttester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionEvent(CompositionEvent compositionEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionRelatesTo(CompositionRelatesTo compositionRelatesTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionRelatesTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionSection(CompositionSection compositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionSection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionStatus(CompositionStatus compositionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMap(ConceptMap conceptMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapDependsOn(ConceptMapDependsOn conceptMapDependsOn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapDependsOn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapElement(ConceptMapElement conceptMapElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapEquivalence(ConceptMapEquivalence conceptMapEquivalence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapEquivalence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapGroup(ConceptMapGroup conceptMapGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapGroupUnmappedMode(ConceptMapGroupUnmappedMode conceptMapGroupUnmappedMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapGroupUnmappedMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapTarget(ConceptMapTarget conceptMapTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapUnmapped(ConceptMapUnmapped conceptMapUnmapped, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapUnmapped, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDeleteStatus(ConditionalDeleteStatus conditionalDeleteStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionalDeleteStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalReadStatus(ConditionalReadStatus conditionalReadStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionalReadStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEvidence(ConditionEvidence conditionEvidence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionEvidence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionStage(ConditionStage conditionStage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionStage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentiality(Confidentiality confidentiality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confidentiality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsent(Consent consent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentActor(ConsentActor consentActor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentActor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentData(ConsentData consentData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDataMeaning(ConsentDataMeaning consentDataMeaning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentDataMeaning, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentPolicy(ConsentPolicy consentPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentProvision(ConsentProvision consentProvision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentProvision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentProvisionType(ConsentProvisionType consentProvisionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentProvisionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentState(ConsentState consentState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentVerification(ConsentVerification consentVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentVerification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSeverity(ConstraintSeverity constraintSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactDetail(ContactDetail contactDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPoint(ContactPoint contactPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystem(ContactPointSystem contactPointSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPointSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUse(ContactPointUse contactPointUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPointUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractAction(ContractAction contractAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractAnswer(ContractAnswer contractAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractAsset(ContractAsset contractAsset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractAsset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractContentDefinition(ContractContentDefinition contractContentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractContentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractContext(ContractContext contractContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractFriendly(ContractFriendly contractFriendly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractFriendly, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractLegal(ContractLegal contractLegal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractLegal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractOffer(ContractOffer contractOffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractOffer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractParty(ContractParty contractParty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractParty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractResourcePublicationStatusCodes(ContractResourcePublicationStatusCodes contractResourcePublicationStatusCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractResourcePublicationStatusCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractResourceStatusCodes(ContractResourceStatusCodes contractResourceStatusCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractResourceStatusCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractRule(ContractRule contractRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractSecurityLabel(ContractSecurityLabel contractSecurityLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractSecurityLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractSigner(ContractSigner contractSigner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractSigner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractSubject(ContractSubject contractSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractSubject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractTerm(ContractTerm contractTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractTerm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractValuedItem(ContractValuedItem contractValuedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractValuedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributor(Contributor contributor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contributor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributorType(ContributorType contributorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contributorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCount(Count count, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(count, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverage(Coverage coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageClass(CoverageClass coverageClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageCostToBeneficiary(CoverageCostToBeneficiary coverageCostToBeneficiary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageCostToBeneficiary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEligibilityRequest(CoverageEligibilityRequest coverageEligibilityRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageEligibilityRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEligibilityRequestDiagnosis(CoverageEligibilityRequestDiagnosis coverageEligibilityRequestDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageEligibilityRequestDiagnosis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEligibilityRequestInsurance(CoverageEligibilityRequestInsurance coverageEligibilityRequestInsurance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageEligibilityRequestInsurance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEligibilityRequestItem(CoverageEligibilityRequestItem coverageEligibilityRequestItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageEligibilityRequestItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEligibilityRequestSupportingInfo(CoverageEligibilityRequestSupportingInfo coverageEligibilityRequestSupportingInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageEligibilityRequestSupportingInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEligibilityResponse(CoverageEligibilityResponse coverageEligibilityResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageEligibilityResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEligibilityResponseBenefit(CoverageEligibilityResponseBenefit coverageEligibilityResponseBenefit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageEligibilityResponseBenefit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEligibilityResponseError(CoverageEligibilityResponseError coverageEligibilityResponseError, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageEligibilityResponseError, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEligibilityResponseInsurance(CoverageEligibilityResponseInsurance coverageEligibilityResponseInsurance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageEligibilityResponseInsurance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEligibilityResponseItem(CoverageEligibilityResponseItem coverageEligibilityResponseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageEligibilityResponseItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageException(CoverageException coverageException, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageException, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriaNotExistsBehavior(CriteriaNotExistsBehavior criteriaNotExistsBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(criteriaNotExistsBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirement(DataRequirement dataRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirementCodeFilter(DataRequirementCodeFilter dataRequirementCodeFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirementCodeFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirementDateFilter(DataRequirementDateFilter dataRequirementDateFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirementDateFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirementSort(DataRequirementSort dataRequirementSort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirementSort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(date, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(DateTime dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaysOfWeek(DaysOfWeek daysOfWeek, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daysOfWeek, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimal(Decimal decimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionResourceType(DefinitionResourceType definitionResourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitionResourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssue(DetectedIssue detectedIssue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectedIssue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueEvidence(DetectedIssueEvidence detectedIssueEvidence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectedIssueEvidence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueMitigation(DetectedIssueMitigation detectedIssueMitigation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectedIssueMitigation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueSeverity(DetectedIssueSeverity detectedIssueSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectedIssueSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(device, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDefinition(DeviceDefinition deviceDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDefinitionCapability(DeviceDefinitionCapability deviceDefinitionCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceDefinitionCapability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDefinitionDeviceName(DeviceDefinitionDeviceName deviceDefinitionDeviceName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceDefinitionDeviceName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDefinitionMaterial(DeviceDefinitionMaterial deviceDefinitionMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceDefinitionMaterial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDefinitionProperty(DeviceDefinitionProperty deviceDefinitionProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceDefinitionProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDefinitionSpecialization(DeviceDefinitionSpecialization deviceDefinitionSpecialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceDefinitionSpecialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDefinitionUdiDeviceIdentifier(DeviceDefinitionUdiDeviceIdentifier deviceDefinitionUdiDeviceIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceDefinitionUdiDeviceIdentifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDeviceName(DeviceDeviceName deviceDeviceName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceDeviceName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetric(DeviceMetric deviceMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetric, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibration(DeviceMetricCalibration deviceMetricCalibration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationState(DeviceMetricCalibrationState deviceMetricCalibrationState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibrationState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationType(DeviceMetricCalibrationType deviceMetricCalibrationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibrationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCategory(DeviceMetricCategory deviceMetricCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricColor(DeviceMetricColor deviceMetricColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricColor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricOperationalStatus(DeviceMetricOperationalStatus deviceMetricOperationalStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricOperationalStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceNameType(DeviceNameType deviceNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceProperty(DeviceProperty deviceProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceRequest(DeviceRequest deviceRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceRequestParameter(DeviceRequestParameter deviceRequestParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceRequestParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceSpecialization(DeviceSpecialization deviceSpecialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceSpecialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUdiCarrier(DeviceUdiCarrier deviceUdiCarrier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUdiCarrier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseStatement(DeviceUseStatement deviceUseStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUseStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseStatementStatus(DeviceUseStatementStatus deviceUseStatementStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUseStatementStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceVersion(DeviceVersion deviceVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceVersion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReport(DiagnosticReport diagnosticReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportMedia(DiagnosticReportMedia diagnosticReportMedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReportMedia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportStatus(DiagnosticReportStatus diagnosticReportStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReportStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscriminatorType(DiscriminatorType discriminatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discriminatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistance(Distance distance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentManifest(DocumentManifest documentManifest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentManifest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentManifestRelated(DocumentManifestRelated documentManifestRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentManifestRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentMode(DocumentMode documentMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReference(DocumentReference documentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceContent(DocumentReferenceContent documentReferenceContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceContext(DocumentReferenceContext documentReferenceContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceRelatesTo(DocumentReferenceRelatesTo documentReferenceRelatesTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceRelatesTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceStatus(DocumentReferenceStatus documentReferenceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRelationshipType(DocumentRelationshipType documentRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainResource(DomainResource domainResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDosage(Dosage dosage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dosage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDosageDoseAndRate(DosageDoseAndRate dosageDoseAndRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dosageDoseAndRate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration(Duration duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(duration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinition(ElementDefinition elementDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionBase(ElementDefinitionBase elementDefinitionBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionBinding(ElementDefinitionBinding elementDefinitionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionConstraint(ElementDefinitionConstraint elementDefinitionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionDiscriminator(ElementDefinitionDiscriminator elementDefinitionDiscriminator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionDiscriminator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionExample(ElementDefinitionExample elementDefinitionExample, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionExample, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionMapping(ElementDefinitionMapping elementDefinitionMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionSlicing(ElementDefinitionSlicing elementDefinitionSlicing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionSlicing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionType(ElementDefinitionType elementDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityRequestPurpose(EligibilityRequestPurpose eligibilityRequestPurpose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityRequestPurpose, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponsePurpose(EligibilityResponsePurpose eligibilityResponsePurpose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityResponsePurpose, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableWhenBehavior(EnableWhenBehavior enableWhenBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableWhenBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter(Encounter encounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterClassHistory(EncounterClassHistory encounterClassHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterClassHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterDiagnosis(EncounterDiagnosis encounterDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterDiagnosis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterHospitalization(EncounterHospitalization encounterHospitalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterHospitalization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationStatus(EncounterLocationStatus encounterLocationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterLocationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterParticipant(EncounterParticipant encounterParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStatus(EncounterStatus encounterStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStatusHistory(EncounterStatusHistory encounterStatusHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterStatusHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpoint(Endpoint endpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointStatus(EndpointStatus endpointStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnrollmentRequest(EnrollmentRequest enrollmentRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enrollmentRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnrollmentResponse(EnrollmentResponse enrollmentResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enrollmentResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCare(EpisodeOfCare episodeOfCare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCare, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareDiagnosis(EpisodeOfCareDiagnosis episodeOfCareDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCareDiagnosis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatus(EpisodeOfCareStatus episodeOfCareStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCareStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatusHistory(EpisodeOfCareStatusHistory episodeOfCareStatusHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCareStatusHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventCapabilityMode(EventCapabilityMode eventCapabilityMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventCapabilityMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventDefinition(EventDefinition eventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventOrRequestResourceTypes(EventOrRequestResourceTypes eventOrRequestResourceTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventOrRequestResourceTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventResourceType(EventResourceType eventResourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventResourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventStatus(EventStatus eventStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTiming(EventTiming eventTiming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventTiming, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidence(Evidence evidence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceAttributeEstimate(EvidenceAttributeEstimate evidenceAttributeEstimate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceAttributeEstimate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceCertainty(EvidenceCertainty evidenceCertainty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceCertainty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceModelCharacteristic(EvidenceModelCharacteristic evidenceModelCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceModelCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceReport(EvidenceReport evidenceReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceReport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceReportCharacteristic(EvidenceReportCharacteristic evidenceReportCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceReportCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceReportRelatesTo(EvidenceReportRelatesTo evidenceReportRelatesTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceReportRelatesTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceReportSection(EvidenceReportSection evidenceReportSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceReportSection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceReportSubject(EvidenceReportSubject evidenceReportSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceReportSubject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceSampleSize(EvidenceSampleSize evidenceSampleSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceSampleSize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceStatistic(EvidenceStatistic evidenceStatistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceStatistic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceVariable(EvidenceVariable evidenceVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceVariable1(EvidenceVariable1 evidenceVariable1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceVariable1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceVariableCategory(EvidenceVariableCategory evidenceVariableCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceVariableCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceVariableCharacteristic(EvidenceVariableCharacteristic evidenceVariableCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceVariableCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceVariableDefinition(EvidenceVariableDefinition evidenceVariableDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceVariableDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceVariableHandling(EvidenceVariableHandling evidenceVariableHandling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceVariableHandling, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceVariableTimeFromStart(EvidenceVariableTimeFromStart evidenceVariableTimeFromStart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceVariableTimeFromStart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenario(ExampleScenario exampleScenario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleScenario, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenarioActor(ExampleScenarioActor exampleScenarioActor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleScenarioActor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenarioActorType(ExampleScenarioActorType exampleScenarioActorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleScenarioActorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenarioAlternative(ExampleScenarioAlternative exampleScenarioAlternative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleScenarioAlternative, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenarioContainedInstance(ExampleScenarioContainedInstance exampleScenarioContainedInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleScenarioContainedInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenarioInstance(ExampleScenarioInstance exampleScenarioInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleScenarioInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenarioOperation(ExampleScenarioOperation exampleScenarioOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleScenarioOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenarioProcess(ExampleScenarioProcess exampleScenarioProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleScenarioProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenarioStep(ExampleScenarioStep exampleScenarioStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleScenarioStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenarioVersion(ExampleScenarioVersion exampleScenarioVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleScenarioVersion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefit(ExplanationOfBenefit explanationOfBenefit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAccident(ExplanationOfBenefitAccident explanationOfBenefitAccident, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAccident, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAddItem(ExplanationOfBenefitAddItem explanationOfBenefitAddItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAddItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAdjudication(ExplanationOfBenefitAdjudication explanationOfBenefitAdjudication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAdjudication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitBenefitBalance(ExplanationOfBenefitBenefitBalance explanationOfBenefitBenefitBalance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitBenefitBalance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitCareTeam(ExplanationOfBenefitCareTeam explanationOfBenefitCareTeam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitCareTeam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitDetail(ExplanationOfBenefitDetail explanationOfBenefitDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitDetail1(ExplanationOfBenefitDetail1 explanationOfBenefitDetail1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitDetail1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitDiagnosis(ExplanationOfBenefitDiagnosis explanationOfBenefitDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitDiagnosis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitFinancial(ExplanationOfBenefitFinancial explanationOfBenefitFinancial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitFinancial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitInsurance(ExplanationOfBenefitInsurance explanationOfBenefitInsurance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitInsurance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitItem(ExplanationOfBenefitItem explanationOfBenefitItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitPayee(ExplanationOfBenefitPayee explanationOfBenefitPayee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitPayee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitPayment(ExplanationOfBenefitPayment explanationOfBenefitPayment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitPayment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitProcedure(ExplanationOfBenefitProcedure explanationOfBenefitProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitProcedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitProcessNote(ExplanationOfBenefitProcessNote explanationOfBenefitProcessNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitProcessNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitRelated(ExplanationOfBenefitRelated explanationOfBenefitRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitStatus(ExplanationOfBenefitStatus explanationOfBenefitStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitSubDetail(ExplanationOfBenefitSubDetail explanationOfBenefitSubDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitSubDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitSubDetail1(ExplanationOfBenefitSubDetail1 explanationOfBenefitSubDetail1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitSubDetail1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitSupportingInfo(ExplanationOfBenefitSupportingInfo explanationOfBenefitSupportingInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitSupportingInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitTotal(ExplanationOfBenefitTotal explanationOfBenefitTotal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitTotal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionLanguage(ExpressionLanguage expressionLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionLanguage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionContextType(ExtensionContextType extensionContextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionContextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryStatus(FamilyHistoryStatus familyHistoryStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familyHistoryStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMemberHistory(FamilyMemberHistory familyMemberHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familyMemberHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMemberHistoryCondition(FamilyMemberHistoryCondition familyMemberHistoryCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familyMemberHistoryCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRAllTypes(FHIRAllTypes fhirAllTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fhirAllTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRDefinedType(FHIRDefinedType fhirDefinedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fhirDefinedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRDeviceStatus(FHIRDeviceStatus fhirDeviceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fhirDeviceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRPathTypes(FHIRPathTypes fhirPathTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fhirPathTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRSubstanceStatus(FHIRSubstanceStatus fhirSubstanceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fhirSubstanceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRVersion(FHIRVersion fhirVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fhirVersion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOperator(FilterOperator filterOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinancialResourceStatusCodes(FinancialResourceStatusCodes financialResourceStatusCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(financialResourceStatusCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlag(Flag flag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagStatus(FlagStatus flagStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flagStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalLifecycleStatus(GoalLifecycleStatus goalLifecycleStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalLifecycleStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalTarget(GoalTarget goalTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphCompartmentRule(GraphCompartmentRule graphCompartmentRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphCompartmentRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphCompartmentUse(GraphCompartmentUse graphCompartmentUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphCompartmentUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphDefinition(GraphDefinition graphDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphDefinitionCompartment(GraphDefinitionCompartment graphDefinitionCompartment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphDefinitionCompartment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphDefinitionLink(GraphDefinitionLink graphDefinitionLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphDefinitionLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphDefinitionTarget(GraphDefinitionTarget graphDefinitionTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphDefinitionTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupCharacteristic(GroupCharacteristic groupCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupMeasure(GroupMeasure groupMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupMeasure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupMember(GroupMember groupMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupType(GroupType groupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponse(GuidanceResponse guidanceResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidanceResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponseStatus(GuidanceResponseStatus guidanceResponseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidanceResponseStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidePageGeneration(GuidePageGeneration guidePageGeneration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidePageGeneration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideParameterCode(GuideParameterCode guideParameterCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guideParameterCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareService(HealthcareService healthcareService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareServiceAvailableTime(HealthcareServiceAvailableTime healthcareServiceAvailableTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareServiceAvailableTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareServiceEligibility(HealthcareServiceEligibility healthcareServiceEligibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareServiceEligibility, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareServiceNotAvailable(HealthcareServiceNotAvailable healthcareServiceNotAvailable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareServiceNotAvailable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerb(HTTPVerb httpVerb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpVerb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHumanName(HumanName humanName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(humanName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateId(Id id, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(id, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier(Identifier identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUse(IdentifierUse identifierUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifierUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityAssuranceLevel(IdentityAssuranceLevel identityAssuranceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identityAssuranceLevel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudy(ImagingStudy imagingStudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudyInstance(ImagingStudyInstance imagingStudyInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudyInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudyPerformer(ImagingStudyPerformer imagingStudyPerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudyPerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudySeries(ImagingStudySeries imagingStudySeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudySeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudyStatus(ImagingStudyStatus imagingStudyStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudyStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization(Immunization immunization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationEducation(ImmunizationEducation immunizationEducation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationEducation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationEvaluation(ImmunizationEvaluation immunizationEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationEvaluation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationEvaluationStatusCodes(ImmunizationEvaluationStatusCodes immunizationEvaluationStatusCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationEvaluationStatusCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationPerformer(ImmunizationPerformer immunizationPerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationPerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationProtocolApplied(ImmunizationProtocolApplied immunizationProtocolApplied, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationProtocolApplied, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationReaction(ImmunizationReaction immunizationReaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationReaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendation(ImmunizationRecommendation immunizationRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendationDateCriterion(ImmunizationRecommendationDateCriterion immunizationRecommendationDateCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendationDateCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendationRecommendation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationStatusCodes(ImmunizationStatusCodes immunizationStatusCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationStatusCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuide(ImplementationGuide implementationGuide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideDefinition(ImplementationGuideDefinition implementationGuideDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideDependsOn(ImplementationGuideDependsOn implementationGuideDependsOn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideDependsOn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideGlobal(ImplementationGuideGlobal implementationGuideGlobal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideGlobal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideGrouping(ImplementationGuideGrouping implementationGuideGrouping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideGrouping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideManifest(ImplementationGuideManifest implementationGuideManifest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideManifest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuidePage(ImplementationGuidePage implementationGuidePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuidePage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuidePage1(ImplementationGuidePage1 implementationGuidePage1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuidePage1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideParameter(ImplementationGuideParameter implementationGuideParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideResource(ImplementationGuideResource implementationGuideResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideResource1(ImplementationGuideResource1 implementationGuideResource1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideResource1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideTemplate(ImplementationGuideTemplate implementationGuideTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredient(Ingredient ingredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ingredient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredientManufacturer(IngredientManufacturer ingredientManufacturer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ingredientManufacturer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredientManufacturerRole(IngredientManufacturerRole ingredientManufacturerRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ingredientManufacturerRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredientReferenceStrength(IngredientReferenceStrength ingredientReferenceStrength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ingredientReferenceStrength, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredientStrength(IngredientStrength ingredientStrength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ingredientStrength, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredientSubstance(IngredientSubstance ingredientSubstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ingredientSubstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstant(Instant instant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurancePlan(InsurancePlan insurancePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insurancePlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurancePlanBenefit(InsurancePlanBenefit insurancePlanBenefit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insurancePlanBenefit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurancePlanBenefit1(InsurancePlanBenefit1 insurancePlanBenefit1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insurancePlanBenefit1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurancePlanContact(InsurancePlanContact insurancePlanContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insurancePlanContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurancePlanCost(InsurancePlanCost insurancePlanCost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insurancePlanCost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurancePlanCoverage(InsurancePlanCoverage insurancePlanCoverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insurancePlanCoverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurancePlanGeneralCost(InsurancePlanGeneralCost insurancePlanGeneralCost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insurancePlanGeneralCost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurancePlanLimit(InsurancePlanLimit insurancePlanLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insurancePlanLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurancePlanPlan(InsurancePlanPlan insurancePlanPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insurancePlanPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurancePlanSpecificCost(InsurancePlanSpecificCost insurancePlanSpecificCost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insurancePlanSpecificCost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(org.hl7.fhir.Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionTrigger(InteractionTrigger interactionTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoice(Invoice invoice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invoice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceLineItem(InvoiceLineItem invoiceLineItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invoiceLineItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceParticipant(InvoiceParticipant invoiceParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invoiceParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoicePriceComponent(InvoicePriceComponent invoicePriceComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invoicePriceComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoicePriceComponentType(InvoicePriceComponentType invoicePriceComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invoicePriceComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceStatus(InvoiceStatus invoiceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invoiceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverity(IssueSeverity issueSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(issueSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueType(IssueType issueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(issueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnowledgeResourceType(KnowledgeResourceType knowledgeResourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(knowledgeResourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibrary(Library library, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(library, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkage(Linkage linkage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkageItem(LinkageItem linkageItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkageItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkageType(LinkageType linkageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(list, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListEntry(ListEntry listEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListMode(ListMode listMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStatus(ListStatus listStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationHoursOfOperation(LocationHoursOfOperation locationHoursOfOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationHoursOfOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationMode(LocationMode locationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationPosition(LocationPosition locationPosition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationPosition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationStatus(LocationStatus locationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturedItemDefinition(ManufacturedItemDefinition manufacturedItemDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(manufacturedItemDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturedItemDefinitionProperty(ManufacturedItemDefinitionProperty manufacturedItemDefinitionProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(manufacturedItemDefinitionProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdown(Markdown markdown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(markdown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarketingStatus(MarketingStatus marketingStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(marketingStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasure(Measure measure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureComponent(MeasureComponent measureComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroup(MeasureGroup measureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurePopulation(MeasurePopulation measurePopulation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurePopulation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReport(MeasureReport measureReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportComponent(MeasureReportComponent measureReportComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportGroup(MeasureReportGroup measureReportGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportPopulation(MeasureReportPopulation measureReportPopulation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportPopulation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportPopulation1(MeasureReportPopulation1 measureReportPopulation1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportPopulation1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStatus(MeasureReportStatus measureReportStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStratifier(MeasureReportStratifier measureReportStratifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportStratifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStratum(MeasureReportStratum measureReportStratum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportStratum, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportType(MeasureReportType measureReportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureStratifier(MeasureStratifier measureStratifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureStratifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureSupplementalData(MeasureSupplementalData measureSupplementalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureSupplementalData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedia(Media media, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(media, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministration(MedicationAdministration medicationAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationDosage(MedicationAdministrationDosage medicationAdministrationDosage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministrationDosage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationPerformer(MedicationAdministrationPerformer medicationAdministrationPerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministrationPerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationBatch(MedicationBatch medicationBatch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationBatch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispense(MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformer(MedicationDispensePerformer medicationDispensePerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispensePerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseSubstitution(MedicationDispenseSubstitution medicationDispenseSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispenseSubstitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationIngredient(MedicationIngredient medicationIngredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationIngredient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledge(MedicationKnowledge medicationKnowledge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeAdministrationGuidelines(MedicationKnowledgeAdministrationGuidelines medicationKnowledgeAdministrationGuidelines, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeAdministrationGuidelines, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeCost(MedicationKnowledgeCost medicationKnowledgeCost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeCost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeDosage(MedicationKnowledgeDosage medicationKnowledgeDosage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeDosage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeDrugCharacteristic(MedicationKnowledgeDrugCharacteristic medicationKnowledgeDrugCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeDrugCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeIngredient(MedicationKnowledgeIngredient medicationKnowledgeIngredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeIngredient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeKinetics(MedicationKnowledgeKinetics medicationKnowledgeKinetics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeKinetics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeMaxDispense(MedicationKnowledgeMaxDispense medicationKnowledgeMaxDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeMaxDispense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeMedicineClassification(MedicationKnowledgeMedicineClassification medicationKnowledgeMedicineClassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeMedicineClassification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeMonitoringProgram(MedicationKnowledgeMonitoringProgram medicationKnowledgeMonitoringProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeMonitoringProgram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeMonograph(MedicationKnowledgeMonograph medicationKnowledgeMonograph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeMonograph, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgePackaging(MedicationKnowledgePackaging medicationKnowledgePackaging, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgePackaging, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgePatientCharacteristics(MedicationKnowledgePatientCharacteristics medicationKnowledgePatientCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgePatientCharacteristics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeRegulatory(MedicationKnowledgeRegulatory medicationKnowledgeRegulatory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeRegulatory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeRelatedMedicationKnowledge(MedicationKnowledgeRelatedMedicationKnowledge medicationKnowledgeRelatedMedicationKnowledge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeRelatedMedicationKnowledge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeSchedule(MedicationKnowledgeSchedule medicationKnowledgeSchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeSchedule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKnowledgeSubstitution(MedicationKnowledgeSubstitution medicationKnowledgeSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKnowledgeSubstitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequest(MedicationRequest medicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestDispenseRequest(MedicationRequestDispenseRequest medicationRequestDispenseRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequestDispenseRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestInitialFill(MedicationRequestInitialFill medicationRequestInitialFill, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequestInitialFill, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestIntent(MedicationRequestIntent medicationRequestIntent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequestIntent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationrequestStatus(MedicationrequestStatus medicationrequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationrequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestSubstitution(MedicationRequestSubstitution medicationRequestSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequestSubstitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatement(MedicationStatement medicationStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementStatusCodes(MedicationStatementStatusCodes medicationStatementStatusCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatementStatusCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusCodes(MedicationStatusCodes medicationStatusCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatusCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicinalProductDefinition(MedicinalProductDefinition medicinalProductDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicinalProductDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicinalProductDefinitionCharacteristic(MedicinalProductDefinitionCharacteristic medicinalProductDefinitionCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicinalProductDefinitionCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicinalProductDefinitionContact(MedicinalProductDefinitionContact medicinalProductDefinitionContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicinalProductDefinitionContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicinalProductDefinitionCountryLanguage(MedicinalProductDefinitionCountryLanguage medicinalProductDefinitionCountryLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicinalProductDefinitionCountryLanguage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicinalProductDefinitionCrossReference(MedicinalProductDefinitionCrossReference medicinalProductDefinitionCrossReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicinalProductDefinitionCrossReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicinalProductDefinitionName(MedicinalProductDefinitionName medicinalProductDefinitionName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicinalProductDefinitionName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicinalProductDefinitionNamePart(MedicinalProductDefinitionNamePart medicinalProductDefinitionNamePart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicinalProductDefinitionNamePart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicinalProductDefinitionOperation(MedicinalProductDefinitionOperation medicinalProductDefinitionOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicinalProductDefinitionOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDefinition(MessageDefinition messageDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDefinitionAllowedResponse(MessageDefinitionAllowedResponse messageDefinitionAllowedResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDefinitionAllowedResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDefinitionFocus(MessageDefinitionFocus messageDefinitionFocus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDefinitionFocus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeader(MessageHeader messageHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeader, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderDestination(MessageHeaderDestination messageHeaderDestination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderDestination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderResponse(MessageHeaderResponse messageHeaderResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageheaderResponseRequest(MessageheaderResponseRequest messageheaderResponseRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageheaderResponseRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderSource(MessageHeaderSource messageHeaderSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSignificanceCategory(MessageSignificanceCategory messageSignificanceCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageSignificanceCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeta(Meta meta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularSequence(MolecularSequence molecularSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(molecularSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularSequenceInner(MolecularSequenceInner molecularSequenceInner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(molecularSequenceInner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularSequenceOuter(MolecularSequenceOuter molecularSequenceOuter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(molecularSequenceOuter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularSequenceQuality(MolecularSequenceQuality molecularSequenceQuality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(molecularSequenceQuality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularSequenceReferenceSeq(MolecularSequenceReferenceSeq molecularSequenceReferenceSeq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(molecularSequenceReferenceSeq, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularSequenceRepository(MolecularSequenceRepository molecularSequenceRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(molecularSequenceRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularSequenceRoc(MolecularSequenceRoc molecularSequenceRoc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(molecularSequenceRoc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularSequenceStructureVariant(MolecularSequenceStructureVariant molecularSequenceStructureVariant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(molecularSequenceStructureVariant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularSequenceVariant(MolecularSequenceVariant molecularSequenceVariant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(molecularSequenceVariant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoney(Money money, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(money, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUse(NameUse nameUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystem(NamingSystem namingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemIdentifierType(NamingSystemIdentifierType namingSystemIdentifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemIdentifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemType(NamingSystemType namingSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemUniqueId(NamingSystemUniqueId namingSystemUniqueId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemUniqueId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrative(Narrative narrative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narrative, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatus(NarrativeStatus narrativeStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narrativeStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteType(NoteType noteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrder(NutritionOrder nutritionOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderAdministration(NutritionOrderAdministration nutritionOrderAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderAdministration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderEnteralFormula(NutritionOrderEnteralFormula nutritionOrderEnteralFormula, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderEnteralFormula, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderNutrient(NutritionOrderNutrient nutritionOrderNutrient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderNutrient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderOralDiet(NutritionOrderOralDiet nutritionOrderOralDiet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderOralDiet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderSupplement(NutritionOrderSupplement nutritionOrderSupplement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderSupplement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderTexture(NutritionOrderTexture nutritionOrderTexture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderTexture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionProduct(NutritionProduct nutritionProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionProduct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionProductIngredient(NutritionProductIngredient nutritionProductIngredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionProductIngredient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionProductInstance(NutritionProductInstance nutritionProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionProductInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionProductNutrient(NutritionProductNutrient nutritionProductNutrient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionProductNutrient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionProductProductCharacteristic(NutritionProductProductCharacteristic nutritionProductProductCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionProductProductCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionProductStatus(NutritionProductStatus nutritionProductStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionProductStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservation(Observation observation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationComponent(ObservationComponent observationComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationDataType(ObservationDataType observationDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationDefinition(ObservationDefinition observationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationDefinitionQualifiedInterval(ObservationDefinitionQualifiedInterval observationDefinitionQualifiedInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationDefinitionQualifiedInterval, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationDefinitionQuantitativeDetails(ObservationDefinitionQuantitativeDetails observationDefinitionQuantitativeDetails, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationDefinitionQuantitativeDetails, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRangeCategory(ObservationRangeCategory observationRangeCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationRangeCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationReferenceRange(ObservationReferenceRange observationReferenceRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationReferenceRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationStatus(ObservationStatus observationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOid(Oid oid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinition(OperationDefinition operationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionBinding(OperationDefinitionBinding operationDefinitionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionOverload(OperationDefinitionOverload operationDefinitionOverload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionOverload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionParameter(OperationDefinitionParameter operationDefinitionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionReferencedFrom(OperationDefinitionReferencedFrom operationDefinitionReferencedFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionReferencedFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationKind(OperationKind operationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationOutcome(OperationOutcome operationOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationOutcomeIssue(OperationOutcomeIssue operationOutcomeIssue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationOutcomeIssue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterUse(OperationParameterUse operationParameterUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationParameterUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationAffiliation(OrganizationAffiliation organizationAffiliation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationAffiliation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationContact(OrganizationContact organizationContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationType(OrientationType orientationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orientationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackagedProductDefinition(PackagedProductDefinition packagedProductDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packagedProductDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackagedProductDefinitionContainedItem(PackagedProductDefinitionContainedItem packagedProductDefinitionContainedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packagedProductDefinitionContainedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackagedProductDefinitionLegalStatusOfSupply(PackagedProductDefinitionLegalStatusOfSupply packagedProductDefinitionLegalStatusOfSupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packagedProductDefinitionLegalStatusOfSupply, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackagedProductDefinitionPackage(PackagedProductDefinitionPackage packagedProductDefinitionPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packagedProductDefinitionPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackagedProductDefinitionProperty(PackagedProductDefinitionProperty packagedProductDefinitionProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packagedProductDefinitionProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackagedProductDefinitionShelfLifeStorage(PackagedProductDefinitionShelfLifeStorage packagedProductDefinitionShelfLifeStorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packagedProductDefinitionShelfLifeStorage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDefinition(ParameterDefinition parameterDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameters(Parameters parameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametersParameter(ParametersParameter parametersParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametersParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRequired(ParticipantRequired participantRequired, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantRequired, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationStatus(ParticipationStatus participationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient(Patient patient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCommunication(PatientCommunication patientCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContact(PatientContact patientContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLink(PatientLink patientLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentNotice(PaymentNotice paymentNotice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentNotice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliation(PaymentReconciliation paymentReconciliation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliationDetail(PaymentReconciliationDetail paymentReconciliationDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliationDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliationProcessNote(PaymentReconciliationProcessNote paymentReconciliationProcessNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliationProcessNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriod(Period period, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(period, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonLink(PersonLink personLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinition(PlanDefinition planDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinitionAction(PlanDefinitionAction planDefinitionAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinitionAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinitionCondition(PlanDefinitionCondition planDefinitionCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinitionCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinitionDynamicValue(PlanDefinitionDynamicValue planDefinitionDynamicValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinitionDynamicValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinitionGoal(PlanDefinitionGoal planDefinitionGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinitionGoal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinitionParticipant(PlanDefinitionParticipant planDefinitionParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinitionParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinitionRelatedAction(PlanDefinitionRelatedAction planDefinitionRelatedAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinitionRelatedAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinitionTarget(PlanDefinitionTarget planDefinitionTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinitionTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePopulation(Population population, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(population, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt(PositiveInt positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positiveInt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitioner(Practitioner practitioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitioner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerQualification(PractitionerQualification practitionerQualification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerQualification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerRole(PractitionerRole practitionerRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerRoleAvailableTime(PractitionerRoleAvailableTime practitionerRoleAvailableTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerRoleAvailableTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerRoleNotAvailable(PractitionerRoleNotAvailable practitionerRoleNotAvailable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerRoleNotAvailable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureFocalDevice(ProcedureFocalDevice procedureFocalDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureFocalDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformer(ProcedurePerformer procedurePerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedurePerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProdCharacteristic(ProdCharacteristic prodCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prodCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductShelfLife(ProductShelfLife productShelfLife, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productShelfLife, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRepresentation(PropertyRepresentation propertyRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenance(Provenance provenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAgent(ProvenanceAgent provenanceAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceAgent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntity(ProvenanceEntity provenanceEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntityRole(ProvenanceEntityRole provenanceEntityRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceEntityRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationStatus(PublicationStatus publicationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityType(QualityType qualityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparator(QuantityComparator quantityComparator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityComparator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaire(Questionnaire questionnaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireAnswerOption(QuestionnaireAnswerOption questionnaireAnswerOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireAnswerOption, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireEnableWhen(QuestionnaireEnableWhen questionnaireEnableWhen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireEnableWhen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireInitial(QuestionnaireInitial questionnaireInitial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireInitial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItem(QuestionnaireItem questionnaireItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItemOperator(QuestionnaireItemOperator questionnaireItemOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireItemOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItemType(QuestionnaireItemType questionnaireItemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireItemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponse(QuestionnaireResponse questionnaireResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseAnswer(QuestionnaireResponseAnswer questionnaireResponseAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponseAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseItem(QuestionnaireResponseItem questionnaireResponseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponseItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseStatus(QuestionnaireResponseStatus questionnaireResponseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponseStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(range, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRatio(Ratio ratio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ratio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRatioRange(RatioRange ratioRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ratioRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceHandlingPolicy(ReferenceHandlingPolicy referenceHandlingPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceHandlingPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceVersionRules(ReferenceVersionRules referenceVersionRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceVersionRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegulatedAuthorization(RegulatedAuthorization regulatedAuthorization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regulatedAuthorization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegulatedAuthorizationCase(RegulatedAuthorizationCase regulatedAuthorizationCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regulatedAuthorizationCase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedArtifact(RelatedArtifact relatedArtifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedArtifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedArtifactType(RelatedArtifactType relatedArtifactType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedArtifactType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedPerson(RelatedPerson relatedPerson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedPerson, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedPersonCommunication(RelatedPersonCommunication relatedPersonCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedPersonCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemittanceOutcome(RemittanceOutcome remittanceOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remittanceOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportRelationshipType(ReportRelationshipType reportRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryType(RepositoryType repositoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repositoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestGroup(RequestGroup requestGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestGroupAction(RequestGroupAction requestGroupAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestGroupAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestGroupCondition(RequestGroupCondition requestGroupCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestGroupCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestGroupRelatedAction(RequestGroupRelatedAction requestGroupRelatedAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestGroupRelatedAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestIntent(RequestIntent requestIntent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestIntent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestPriority(RequestPriority requestPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestResourceType(RequestResourceType requestResourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestResourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestStatus(RequestStatus requestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchDefinition(ResearchDefinition researchDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchElementDefinition(ResearchElementDefinition researchElementDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchElementDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchElementDefinitionCharacteristic(ResearchElementDefinitionCharacteristic researchElementDefinitionCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchElementDefinitionCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchElementType(ResearchElementType researchElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchStudy(ResearchStudy researchStudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchStudy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchStudyArm(ResearchStudyArm researchStudyArm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchStudyArm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchStudyObjective(ResearchStudyObjective researchStudyObjective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchStudyObjective, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchStudyStatus(ResearchStudyStatus researchStudyStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchStudyStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchSubject(ResearchSubject researchSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchSubject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchSubjectStatus(ResearchSubjectStatus researchSubjectStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchSubjectStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceContainer(ResourceContainer resourceContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceType(ResourceType resourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceVersionPolicy(ResourceVersionPolicy resourceVersionPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceVersionPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseType(ResponseType responseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestfulCapabilityMode(RestfulCapabilityMode restfulCapabilityMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restfulCapabilityMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskAssessment(RiskAssessment riskAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(riskAssessment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskAssessmentPrediction(RiskAssessmentPrediction riskAssessmentPrediction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(riskAssessmentPrediction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledData(SampledData sampledData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampledData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataType(SampledDataDataType sampledDataDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampledDataDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule(Schedule schedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchComparator(SearchComparator searchComparator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchComparator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryMode(SearchEntryMode searchEntryMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchEntryMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchModifierCode(SearchModifierCode searchModifierCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchModifierCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParameter(SearchParameter searchParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParameterComponent(SearchParameterComponent searchParameterComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParameterComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParamType(SearchParamType searchParamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceType(SequenceType sequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRequest(ServiceRequest serviceRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlicingRules(SlicingRules slicingRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slicingRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotStatus(SlotStatus slotStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slotStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortDirection(SortDirection sortDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortDirection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSPDXLicense(SPDXLicense spdxLicense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spdxLicense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimen(Specimen specimen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenCollection(SpecimenCollection specimenCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenContainedPreference(SpecimenContainedPreference specimenContainedPreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenContainedPreference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenContainer(SpecimenContainer specimenContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenDefinition(SpecimenDefinition specimenDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenDefinitionAdditive(SpecimenDefinitionAdditive specimenDefinitionAdditive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenDefinitionAdditive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenDefinitionContainer(SpecimenDefinitionContainer specimenDefinitionContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenDefinitionContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenDefinitionHandling(SpecimenDefinitionHandling specimenDefinitionHandling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenDefinitionHandling, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenDefinitionTypeTested(SpecimenDefinitionTypeTested specimenDefinitionTypeTested, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenDefinitionTypeTested, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenProcessing(SpecimenProcessing specimenProcessing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenProcessing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenStatus(SpecimenStatus specimenStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(status, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrandType(StrandType strandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(org.hl7.fhir.String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinition(StructureDefinition structureDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionContext(StructureDefinitionContext structureDefinitionContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionDifferential(StructureDefinitionDifferential structureDefinitionDifferential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionDifferential, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionKind(StructureDefinitionKind structureDefinitionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionMapping(StructureDefinitionMapping structureDefinitionMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionSnapshot(StructureDefinitionSnapshot structureDefinitionSnapshot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionSnapshot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMap(StructureMap structureMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapContextType(StructureMapContextType structureMapContextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapContextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapDependent(StructureMapDependent structureMapDependent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapDependent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapGroup(StructureMapGroup structureMapGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapGroupTypeMode(StructureMapGroupTypeMode structureMapGroupTypeMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapGroupTypeMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapInput(StructureMapInput structureMapInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapInputMode(StructureMapInputMode structureMapInputMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapInputMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapModelMode(StructureMapModelMode structureMapModelMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapModelMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapParameter(StructureMapParameter structureMapParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapRule(StructureMapRule structureMapRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapSource(StructureMapSource structureMapSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapSourceListMode(StructureMapSourceListMode structureMapSourceListMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapSourceListMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapStructure(StructureMapStructure structureMapStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTarget(StructureMapTarget structureMapTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTargetListMode(StructureMapTargetListMode structureMapTargetListMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapTargetListMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTransform(StructureMapTransform structureMapTransform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapTransform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscription(Subscription subscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannel(SubscriptionChannel subscriptionChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionChannel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannelType(SubscriptionChannelType subscriptionChannelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionChannelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionNotificationType(SubscriptionNotificationType subscriptionNotificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionNotificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatus(SubscriptionStatus subscriptionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatusCodes(SubscriptionStatusCodes subscriptionStatusCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionStatusCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatusNotificationEvent(SubscriptionStatusNotificationEvent subscriptionStatusNotificationEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionStatusNotificationEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionTopic(SubscriptionTopic subscriptionTopic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionTopic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionTopicCanFilterBy(SubscriptionTopicCanFilterBy subscriptionTopicCanFilterBy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionTopicCanFilterBy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionTopicEventTrigger(SubscriptionTopicEventTrigger subscriptionTopicEventTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionTopicEventTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionTopicNotificationShape(SubscriptionTopicNotificationShape subscriptionTopicNotificationShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionTopicNotificationShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionTopicQueryCriteria(SubscriptionTopicQueryCriteria subscriptionTopicQueryCriteria, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionTopicQueryCriteria, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionTopicResourceTrigger(SubscriptionTopicResourceTrigger subscriptionTopicResourceTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionTopicResourceTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstance(Substance substance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceDefinition(SubstanceDefinition substanceDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceDefinitionCode(SubstanceDefinitionCode substanceDefinitionCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceDefinitionCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceDefinitionMoiety(SubstanceDefinitionMoiety substanceDefinitionMoiety, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceDefinitionMoiety, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceDefinitionMolecularWeight(SubstanceDefinitionMolecularWeight substanceDefinitionMolecularWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceDefinitionMolecularWeight, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceDefinitionName(SubstanceDefinitionName substanceDefinitionName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceDefinitionName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceDefinitionOfficial(SubstanceDefinitionOfficial substanceDefinitionOfficial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceDefinitionOfficial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceDefinitionProperty(SubstanceDefinitionProperty substanceDefinitionProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceDefinitionProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceDefinitionRelationship(SubstanceDefinitionRelationship substanceDefinitionRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceDefinitionRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceDefinitionRepresentation(SubstanceDefinitionRepresentation substanceDefinitionRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceDefinitionRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceDefinitionSourceMaterial(SubstanceDefinitionSourceMaterial substanceDefinitionSourceMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceDefinitionSourceMaterial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceDefinitionStructure(SubstanceDefinitionStructure substanceDefinitionStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceDefinitionStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceIngredient(SubstanceIngredient substanceIngredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceIngredient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceInstance(SubstanceInstance substanceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDelivery(SupplyDelivery supplyDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDelivery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliveryStatus(SupplyDeliveryStatus supplyDeliveryStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDeliveryStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliverySuppliedItem(SupplyDeliverySuppliedItem supplyDeliverySuppliedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDeliverySuppliedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequest(SupplyRequest supplyRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestParameter(SupplyRequestParameter supplyRequestParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequestParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestStatus(SupplyRequestStatus supplyRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteraction(SystemRestfulInteraction systemRestfulInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemRestfulInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskInput(TaskInput taskInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskIntent(TaskIntent taskIntent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskIntent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskOutput(TaskOutput taskOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskOutput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskRestriction(TaskRestriction taskRestriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskRestriction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskStatus(TaskStatus taskStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyCapabilities(TerminologyCapabilities terminologyCapabilities, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyCapabilities, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyCapabilitiesClosure(TerminologyCapabilitiesClosure terminologyCapabilitiesClosure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyCapabilitiesClosure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyCapabilitiesCodeSystem(TerminologyCapabilitiesCodeSystem terminologyCapabilitiesCodeSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyCapabilitiesCodeSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyCapabilitiesExpansion(TerminologyCapabilitiesExpansion terminologyCapabilitiesExpansion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyCapabilitiesExpansion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyCapabilitiesFilter(TerminologyCapabilitiesFilter terminologyCapabilitiesFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyCapabilitiesFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyCapabilitiesImplementation(TerminologyCapabilitiesImplementation terminologyCapabilitiesImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyCapabilitiesImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyCapabilitiesParameter(TerminologyCapabilitiesParameter terminologyCapabilitiesParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyCapabilitiesParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyCapabilitiesSoftware(TerminologyCapabilitiesSoftware terminologyCapabilitiesSoftware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyCapabilitiesSoftware, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyCapabilitiesTranslation(TerminologyCapabilitiesTranslation terminologyCapabilitiesTranslation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyCapabilitiesTranslation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyCapabilitiesValidateCode(TerminologyCapabilitiesValidateCode terminologyCapabilitiesValidateCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyCapabilitiesValidateCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyCapabilitiesVersion(TerminologyCapabilitiesVersion terminologyCapabilitiesVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyCapabilitiesVersion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReport(TestReport testReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportAction(TestReportAction testReportAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportAction1(TestReportAction1 testReportAction1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportAction1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportAction2(TestReportAction2 testReportAction2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportAction2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportActionResult(TestReportActionResult testReportActionResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportActionResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportAssert(TestReportAssert testReportAssert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportAssert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportOperation(TestReportOperation testReportOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportParticipant(TestReportParticipant testReportParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportParticipantType(TestReportParticipantType testReportParticipantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportParticipantType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportResult(TestReportResult testReportResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportSetup(TestReportSetup testReportSetup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportSetup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportStatus(TestReportStatus testReportStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportTeardown(TestReportTeardown testReportTeardown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportTeardown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportTest(TestReportTest testReportTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScript(TestScript testScript, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScript, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction(TestScriptAction testScriptAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction1(TestScriptAction1 testScriptAction1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction2(TestScriptAction2 testScriptAction2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAssert(TestScriptAssert testScriptAssert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAssert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptCapability(TestScriptCapability testScriptCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptCapability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptDestination(TestScriptDestination testScriptDestination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptDestination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptFixture(TestScriptFixture testScriptFixture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptFixture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptLink(TestScriptLink testScriptLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptMetadata(TestScriptMetadata testScriptMetadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptMetadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptOperation(TestScriptOperation testScriptOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptOrigin(TestScriptOrigin testScriptOrigin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptOrigin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRequestHeader(TestScriptRequestHeader testScriptRequestHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRequestHeader, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRequestMethodCode(TestScriptRequestMethodCode testScriptRequestMethodCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRequestMethodCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptSetup(TestScriptSetup testScriptSetup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptSetup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptTeardown(TestScriptTeardown testScriptTeardown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptTeardown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptTest(TestScriptTest testScriptTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptVariable(TestScriptVariable testScriptVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(time, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTiming(Timing timing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimingRepeat(TimingRepeat timingRepeat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timingRepeat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerDefinition(TriggerDefinition triggerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerType(TriggerType triggerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDerivationRule(TypeDerivationRule typeDerivationRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDerivationRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteraction(TypeRestfulInteraction typeRestfulInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeRestfulInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIEntryType(UDIEntryType udiEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(udiEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTime(UnitsOfTime unitsOfTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitsOfTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedInt(UnsignedInt unsignedInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unsignedInt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUri(Uri uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uri, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrl(Url url, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(url, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageContext(UsageContext usageContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usageContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUse(Use use, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(use, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuid(Uuid uuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uuid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSet(ValueSet valueSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetCompose(ValueSetCompose valueSetCompose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetCompose, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetConcept(ValueSetConcept valueSetConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetContains(ValueSetContains valueSetContains, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetContains, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetDesignation(ValueSetDesignation valueSetDesignation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetDesignation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetExpansion(ValueSetExpansion valueSetExpansion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetExpansion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetFilter(ValueSetFilter valueSetFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetInclude(ValueSetInclude valueSetInclude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetInclude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetParameter(ValueSetParameter valueSetParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType(VariableType variableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerificationResult(VerificationResult verificationResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verificationResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerificationResultAttestation(VerificationResultAttestation verificationResultAttestation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verificationResultAttestation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerificationResultPrimarySource(VerificationResultPrimarySource verificationResultPrimarySource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verificationResultPrimarySource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerificationResultValidator(VerificationResultValidator verificationResultValidator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verificationResultValidator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionBase(VisionBase visionBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionEyes(VisionEyes visionEyes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionEyes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionPrescription(VisionPrescription visionPrescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionPrescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionPrescriptionLensSpecification(VisionPrescriptionLensSpecification visionPrescriptionLensSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionPrescriptionLensSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionPrescriptionPrism(VisionPrescriptionPrism visionPrescriptionPrism, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionPrescriptionPrism, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXPathUsageType(XPathUsageType xPathUsageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xPathUsageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountStatusEnum(AccountStatusEnum accountStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionCardinalityBehaviorEnum(ActionCardinalityBehaviorEnum actionCardinalityBehaviorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionConditionKindEnum(ActionConditionKindEnum actionConditionKindEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionGroupingBehaviorEnum(ActionGroupingBehaviorEnum actionGroupingBehaviorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionParticipantTypeEnum(ActionParticipantTypeEnum actionParticipantTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionPrecheckBehaviorEnum(ActionPrecheckBehaviorEnum actionPrecheckBehaviorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRelationshipTypeEnum(ActionRelationshipTypeEnum actionRelationshipTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRequiredBehaviorEnum(ActionRequiredBehaviorEnum actionRequiredBehaviorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionSelectionBehaviorEnum(ActionSelectionBehaviorEnum actionSelectionBehaviorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressTypeEnum(AddressTypeEnum addressTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUseEnum(AddressUseEnum addressUseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGenderEnum(AdministrativeGenderEnum administrativeGenderEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventActualityEnum(AdverseEventActualityEnum adverseEventActualityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeUnitsEnum(AgeUnitsEnum ageUnitsEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationModeEnum(AggregationModeEnum aggregationModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCategoryEnum(AllergyIntoleranceCategoryEnum allergyIntoleranceCategoryEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCriticalityEnum(AllergyIntoleranceCriticalityEnum allergyIntoleranceCriticalityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverityEnum(AllergyIntoleranceSeverityEnum allergyIntoleranceSeverityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceTypeEnum(AllergyIntoleranceTypeEnum allergyIntoleranceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentStatusEnum(AppointmentStatusEnum appointmentStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionDirectionTypeEnum(AssertionDirectionTypeEnum assertionDirectionTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionOperatorTypeEnum(AssertionOperatorTypeEnum assertionOperatorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionResponseTypesEnum(AssertionResponseTypesEnum assertionResponseTypesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventActionEnum(AuditEventActionEnum auditEventActionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAgentNetworkTypeEnum(AuditEventAgentNetworkTypeEnum auditEventAgentNetworkTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventOutcomeEnum(AuditEventOutcomeEnum auditEventOutcomeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingStrengthEnum(BindingStrengthEnum bindingStrengthEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductCategoryEnum(BiologicallyDerivedProductCategoryEnum biologicallyDerivedProductCategoryEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductStatusEnum(BiologicallyDerivedProductStatusEnum biologicallyDerivedProductStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductStorageScaleEnum(BiologicallyDerivedProductStorageScaleEnum biologicallyDerivedProductStorageScaleEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleTypeEnum(BundleTypeEnum bundleTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementKindEnum(CapabilityStatementKindEnum capabilityStatementKindEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityKindEnum(CarePlanActivityKindEnum carePlanActivityKindEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityStatusEnum(CarePlanActivityStatusEnum carePlanActivityStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanIntentEnum(CarePlanIntentEnum carePlanIntentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamStatusEnum(CareTeamStatusEnum careTeamStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogEntryRelationTypeEnum(CatalogEntryRelationTypeEnum catalogEntryRelationTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicCombinationEnum(CharacteristicCombinationEnum characteristicCombinationEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemStatusEnum(ChargeItemStatusEnum chargeItemStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionStatusEnum(ClinicalImpressionStatusEnum clinicalImpressionStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalUseDefinitionTypeEnum(ClinicalUseDefinitionTypeEnum clinicalUseDefinitionTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSearchSupportEnum(CodeSearchSupportEnum codeSearchSupportEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemContentModeEnum(CodeSystemContentModeEnum codeSystemContentModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemHierarchyMeaningEnum(CodeSystemHierarchyMeaningEnum codeSystemHierarchyMeaningEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentTypeEnum(CompartmentTypeEnum compartmentTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttestationModeEnum(CompositionAttestationModeEnum compositionAttestationModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionStatusEnum(CompositionStatusEnum compositionStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapEquivalenceEnum(ConceptMapEquivalenceEnum conceptMapEquivalenceEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapGroupUnmappedModeEnum(ConceptMapGroupUnmappedModeEnum conceptMapGroupUnmappedModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDeleteStatusEnum(ConditionalDeleteStatusEnum conditionalDeleteStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalReadStatusEnum(ConditionalReadStatusEnum conditionalReadStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialityEnum(ConfidentialityEnum confidentialityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDataMeaningEnum(ConsentDataMeaningEnum consentDataMeaningEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentProvisionTypeEnum(ConsentProvisionTypeEnum consentProvisionTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentStateEnum(ConsentStateEnum consentStateEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSeverityEnum(ConstraintSeverityEnum constraintSeverityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystemEnum(ContactPointSystemEnum contactPointSystemEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUseEnum(ContactPointUseEnum contactPointUseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractResourcePublicationStatusCodesEnum(ContractResourcePublicationStatusCodesEnum contractResourcePublicationStatusCodesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractResourceStatusCodesEnum(ContractResourceStatusCodesEnum contractResourceStatusCodesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributorTypeEnum(ContributorTypeEnum contributorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriaNotExistsBehaviorEnum(CriteriaNotExistsBehaviorEnum criteriaNotExistsBehaviorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaysOfWeekEnum(DaysOfWeekEnum daysOfWeekEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionResourceTypeEnum(DefinitionResourceTypeEnum definitionResourceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueSeverityEnum(DetectedIssueSeverityEnum detectedIssueSeverityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationStateEnum(DeviceMetricCalibrationStateEnum deviceMetricCalibrationStateEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationTypeEnum(DeviceMetricCalibrationTypeEnum deviceMetricCalibrationTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCategoryEnum(DeviceMetricCategoryEnum deviceMetricCategoryEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricColorEnum(DeviceMetricColorEnum deviceMetricColorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricOperationalStatusEnum(DeviceMetricOperationalStatusEnum deviceMetricOperationalStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceNameTypeEnum(DeviceNameTypeEnum deviceNameTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseStatementStatusEnum(DeviceUseStatementStatusEnum deviceUseStatementStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportStatusEnum(DiagnosticReportStatusEnum diagnosticReportStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscriminatorTypeEnum(DiscriminatorTypeEnum discriminatorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentModeEnum(DocumentModeEnum documentModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceStatusEnum(DocumentReferenceStatusEnum documentReferenceStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRelationshipTypeEnum(DocumentRelationshipTypeEnum documentRelationshipTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityRequestPurposeEnum(EligibilityRequestPurposeEnum eligibilityRequestPurposeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponsePurposeEnum(EligibilityResponsePurposeEnum eligibilityResponsePurposeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableWhenBehaviorEnum(EnableWhenBehaviorEnum enableWhenBehaviorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationStatusEnum(EncounterLocationStatusEnum encounterLocationStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStatusEnum(EncounterStatusEnum encounterStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointStatusEnum(EndpointStatusEnum endpointStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatusEnum(EpisodeOfCareStatusEnum episodeOfCareStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventCapabilityModeEnum(EventCapabilityModeEnum eventCapabilityModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventOrRequestResourceTypesEnum(EventOrRequestResourceTypesEnum eventOrRequestResourceTypesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventResourceTypeEnum(EventResourceTypeEnum eventResourceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventStatusEnum(EventStatusEnum eventStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTimingEnum(EventTimingEnum eventTimingEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceVariableHandlingEnum(EvidenceVariableHandlingEnum evidenceVariableHandlingEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenarioActorTypeEnum(ExampleScenarioActorTypeEnum exampleScenarioActorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitStatusEnum(ExplanationOfBenefitStatusEnum explanationOfBenefitStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionLanguageEnum(ExpressionLanguageEnum expressionLanguageEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionContextTypeEnum(ExtensionContextTypeEnum extensionContextTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryStatusEnum(FamilyHistoryStatusEnum familyHistoryStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRAllTypesEnum(FHIRAllTypesEnum fhirAllTypesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRDefinedTypeEnum(FHIRDefinedTypeEnum fhirDefinedTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRDeviceStatusEnum(FHIRDeviceStatusEnum fhirDeviceStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRPathTypesEnum(FHIRPathTypesEnum fhirPathTypesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRSubstanceStatusEnum(FHIRSubstanceStatusEnum fhirSubstanceStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRVersionEnum(FHIRVersionEnum fhirVersionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOperatorEnum(FilterOperatorEnum filterOperatorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinancialResourceStatusCodesEnum(FinancialResourceStatusCodesEnum financialResourceStatusCodesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagStatusEnum(FlagStatusEnum flagStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalLifecycleStatusEnum(GoalLifecycleStatusEnum goalLifecycleStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphCompartmentRuleEnum(GraphCompartmentRuleEnum graphCompartmentRuleEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphCompartmentUseEnum(GraphCompartmentUseEnum graphCompartmentUseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupMeasureEnum(GroupMeasureEnum groupMeasureEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupTypeEnum(GroupTypeEnum groupTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponseStatusEnum(GuidanceResponseStatusEnum guidanceResponseStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidePageGenerationEnum(GuidePageGenerationEnum guidePageGenerationEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideParameterCodeEnum(GuideParameterCodeEnum guideParameterCodeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerbEnum(HTTPVerbEnum httpVerbEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUseEnum(IdentifierUseEnum identifierUseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityAssuranceLevelEnum(IdentityAssuranceLevelEnum identityAssuranceLevelEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudyStatusEnum(ImagingStudyStatusEnum imagingStudyStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationEvaluationStatusCodesEnum(ImmunizationEvaluationStatusCodesEnum immunizationEvaluationStatusCodesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationStatusCodesEnum(ImmunizationStatusCodesEnum immunizationStatusCodesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredientManufacturerRoleEnum(IngredientManufacturerRoleEnum ingredientManufacturerRoleEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionTriggerEnum(InteractionTriggerEnum interactionTriggerEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoicePriceComponentTypeEnum(InvoicePriceComponentTypeEnum invoicePriceComponentTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceStatusEnum(InvoiceStatusEnum invoiceStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverityEnum(IssueSeverityEnum issueSeverityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueTypeEnum(IssueTypeEnum issueTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnowledgeResourceTypeEnum(KnowledgeResourceTypeEnum knowledgeResourceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkageTypeEnum(LinkageTypeEnum linkageTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkTypeEnum(LinkTypeEnum linkTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListModeEnum(ListModeEnum listModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStatusEnum(ListStatusEnum listStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationModeEnum(LocationModeEnum locationModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationStatusEnum(LocationStatusEnum locationStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStatusEnum(MeasureReportStatusEnum measureReportStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportTypeEnum(MeasureReportTypeEnum measureReportTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestIntentEnum(MedicationRequestIntentEnum medicationRequestIntentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationrequestStatusEnum(MedicationrequestStatusEnum medicationrequestStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementStatusCodesEnum(MedicationStatementStatusCodesEnum medicationStatementStatusCodesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusCodesEnum(MedicationStatusCodesEnum medicationStatusCodesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageheaderResponseRequestEnum(MessageheaderResponseRequestEnum messageheaderResponseRequestEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSignificanceCategoryEnum(MessageSignificanceCategoryEnum messageSignificanceCategoryEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUseEnum(NameUseEnum nameUseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemIdentifierTypeEnum(NamingSystemIdentifierTypeEnum namingSystemIdentifierTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemTypeEnum(NamingSystemTypeEnum namingSystemTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatusEnum(NarrativeStatusEnum narrativeStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteTypeEnum(NoteTypeEnum noteTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionProductStatusEnum(NutritionProductStatusEnum nutritionProductStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationDataTypeEnum(ObservationDataTypeEnum observationDataTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRangeCategoryEnum(ObservationRangeCategoryEnum observationRangeCategoryEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationStatusEnum(ObservationStatusEnum observationStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationKindEnum(OperationKindEnum operationKindEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterUseEnum(OperationParameterUseEnum operationParameterUseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationTypeEnum(OrientationTypeEnum orientationTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRequiredEnum(ParticipantRequiredEnum participantRequiredEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationStatusEnum(ParticipationStatusEnum participationStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRepresentationEnum(PropertyRepresentationEnum propertyRepresentationEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTypeEnum(PropertyTypeEnum propertyTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntityRoleEnum(ProvenanceEntityRoleEnum provenanceEntityRoleEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationStatusEnum(PublicationStatusEnum publicationStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityTypeEnum(QualityTypeEnum qualityTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparatorEnum(QuantityComparatorEnum quantityComparatorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItemOperatorEnum(QuestionnaireItemOperatorEnum questionnaireItemOperatorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItemTypeEnum(QuestionnaireItemTypeEnum questionnaireItemTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseStatusEnum(QuestionnaireResponseStatusEnum questionnaireResponseStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceHandlingPolicyEnum(ReferenceHandlingPolicyEnum referenceHandlingPolicyEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceVersionRulesEnum(ReferenceVersionRulesEnum referenceVersionRulesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedArtifactTypeEnum(RelatedArtifactTypeEnum relatedArtifactTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemittanceOutcomeEnum(RemittanceOutcomeEnum remittanceOutcomeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportRelationshipTypeEnum(ReportRelationshipTypeEnum reportRelationshipTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryTypeEnum(RepositoryTypeEnum repositoryTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestIntentEnum(RequestIntentEnum requestIntentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestPriorityEnum(RequestPriorityEnum requestPriorityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestResourceTypeEnum(RequestResourceTypeEnum requestResourceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestStatusEnum(RequestStatusEnum requestStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchElementTypeEnum(ResearchElementTypeEnum researchElementTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchStudyStatusEnum(ResearchStudyStatusEnum researchStudyStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchSubjectStatusEnum(ResearchSubjectStatusEnum researchSubjectStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceTypeEnum(ResourceTypeEnum resourceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceVersionPolicyEnum(ResourceVersionPolicyEnum resourceVersionPolicyEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseTypeEnum(ResponseTypeEnum responseTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestfulCapabilityModeEnum(RestfulCapabilityModeEnum restfulCapabilityModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchComparatorEnum(SearchComparatorEnum searchComparatorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryModeEnum(SearchEntryModeEnum searchEntryModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchModifierCodeEnum(SearchModifierCodeEnum searchModifierCodeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParamTypeEnum(SearchParamTypeEnum searchParamTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceTypeEnum(SequenceTypeEnum sequenceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlicingRulesEnum(SlicingRulesEnum slicingRulesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotStatusEnum(SlotStatusEnum slotStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortDirectionEnum(SortDirectionEnum sortDirectionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSPDXLicenseEnum(SPDXLicenseEnum spdxLicenseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenContainedPreferenceEnum(SpecimenContainedPreferenceEnum specimenContainedPreferenceEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenStatusEnum(SpecimenStatusEnum specimenStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusEnum(StatusEnum statusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrandTypeEnum(StrandTypeEnum strandTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionKindEnum(StructureDefinitionKindEnum structureDefinitionKindEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapContextTypeEnum(StructureMapContextTypeEnum structureMapContextTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapGroupTypeModeEnum(StructureMapGroupTypeModeEnum structureMapGroupTypeModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapInputModeEnum(StructureMapInputModeEnum structureMapInputModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapModelModeEnum(StructureMapModelModeEnum structureMapModelModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapSourceListModeEnum(StructureMapSourceListModeEnum structureMapSourceListModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTargetListModeEnum(StructureMapTargetListModeEnum structureMapTargetListModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTransformEnum(StructureMapTransformEnum structureMapTransformEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannelTypeEnum(SubscriptionChannelTypeEnum subscriptionChannelTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionNotificationTypeEnum(SubscriptionNotificationTypeEnum subscriptionNotificationTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatusCodesEnum(SubscriptionStatusCodesEnum subscriptionStatusCodesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliveryStatusEnum(SupplyDeliveryStatusEnum supplyDeliveryStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestStatusEnum(SupplyRequestStatusEnum supplyRequestStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteractionEnum(SystemRestfulInteractionEnum systemRestfulInteractionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskIntentEnum(TaskIntentEnum taskIntentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskStatusEnum(TaskStatusEnum taskStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportActionResultEnum(TestReportActionResultEnum testReportActionResultEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportParticipantTypeEnum(TestReportParticipantTypeEnum testReportParticipantTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportResultEnum(TestReportResultEnum testReportResultEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportStatusEnum(TestReportStatusEnum testReportStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRequestMethodCodeEnum(TestScriptRequestMethodCodeEnum testScriptRequestMethodCodeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerTypeEnum(TriggerTypeEnum triggerTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDerivationRuleEnum(TypeDerivationRuleEnum typeDerivationRuleEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteractionEnum(TypeRestfulInteractionEnum typeRestfulInteractionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIEntryTypeEnum(UDIEntryTypeEnum udiEntryTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTimeEnum(UnitsOfTimeEnum unitsOfTimeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseEnum(UseEnum useEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableTypeEnum(VariableTypeEnum variableTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionBaseEnum(VisionBaseEnum visionBaseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionEyesEnum(VisionEyesEnum visionEyesEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXPathUsageTypeEnum(XPathUsageTypeEnum xPathUsageTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountStatusEnumObject(AccountStatusEnum accountStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionCardinalityBehaviorEnumObject(ActionCardinalityBehaviorEnum actionCardinalityBehaviorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionConditionKindEnumObject(ActionConditionKindEnum actionConditionKindEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionGroupingBehaviorEnumObject(ActionGroupingBehaviorEnum actionGroupingBehaviorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionParticipantTypeEnumObject(ActionParticipantTypeEnum actionParticipantTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionPrecheckBehaviorEnumObject(ActionPrecheckBehaviorEnum actionPrecheckBehaviorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRelationshipTypeEnumObject(ActionRelationshipTypeEnum actionRelationshipTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRequiredBehaviorEnumObject(ActionRequiredBehaviorEnum actionRequiredBehaviorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionSelectionBehaviorEnumObject(ActionSelectionBehaviorEnum actionSelectionBehaviorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressTypeEnumObject(AddressTypeEnum addressTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUseEnumObject(AddressUseEnum addressUseEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGenderEnumObject(AdministrativeGenderEnum administrativeGenderEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventActualityEnumObject(AdverseEventActualityEnum adverseEventActualityEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeUnitsEnumObject(AgeUnitsEnum ageUnitsEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationModeEnumObject(AggregationModeEnum aggregationModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCategoryEnumObject(AllergyIntoleranceCategoryEnum allergyIntoleranceCategoryEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCriticalityEnumObject(AllergyIntoleranceCriticalityEnum allergyIntoleranceCriticalityEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverityEnumObject(AllergyIntoleranceSeverityEnum allergyIntoleranceSeverityEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceTypeEnumObject(AllergyIntoleranceTypeEnum allergyIntoleranceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentStatusEnumObject(AppointmentStatusEnum appointmentStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionDirectionTypeEnumObject(AssertionDirectionTypeEnum assertionDirectionTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionOperatorTypeEnumObject(AssertionOperatorTypeEnum assertionOperatorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionResponseTypesEnumObject(AssertionResponseTypesEnum assertionResponseTypesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventActionEnumObject(AuditEventActionEnum auditEventActionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAgentNetworkTypeEnumObject(AuditEventAgentNetworkTypeEnum auditEventAgentNetworkTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventOutcomeEnumObject(AuditEventOutcomeEnum auditEventOutcomeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64BinaryPrimitive(byte[] base64BinaryPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBase64BinaryPrimitive_Pattern(base64BinaryPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBase64BinaryPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] BASE64_BINARY_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(\\s*([0-9a-zA-Z\\+/=]){4}\\s*)+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Base64 Binary Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64BinaryPrimitive_Pattern(byte[] base64BinaryPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getBase64BinaryPrimitive(), base64BinaryPrimitive, BASE64_BINARY_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingStrengthEnumObject(BindingStrengthEnum bindingStrengthEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductCategoryEnumObject(BiologicallyDerivedProductCategoryEnum biologicallyDerivedProductCategoryEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductStatusEnumObject(BiologicallyDerivedProductStatusEnum biologicallyDerivedProductStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBiologicallyDerivedProductStorageScaleEnumObject(BiologicallyDerivedProductStorageScaleEnum biologicallyDerivedProductStorageScaleEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitive(boolean booleanPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanPrimitive_Pattern(booleanPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBooleanPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] BOOLEAN_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("true|false")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Boolean Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitive_Pattern(boolean booleanPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getBooleanPrimitive(), booleanPrimitive, BOOLEAN_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitiveObject(Boolean booleanPrimitiveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanPrimitive_Pattern(booleanPrimitiveObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleTypeEnumObject(BundleTypeEnum bundleTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCanonicalPrimitive(String canonicalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCanonicalPrimitive_Pattern(canonicalPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateCanonicalPrimitive_MinLength(canonicalPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCanonicalPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] CANONICAL_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Canonical Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCanonicalPrimitive_Pattern(String canonicalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getCanonicalPrimitive(), canonicalPrimitive, CANONICAL_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Canonical Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCanonicalPrimitive_MinLength(String canonicalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = canonicalPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getCanonicalPrimitive(), canonicalPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementKindEnumObject(CapabilityStatementKindEnum capabilityStatementKindEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityKindEnumObject(CarePlanActivityKindEnum carePlanActivityKindEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityStatusEnumObject(CarePlanActivityStatusEnum carePlanActivityStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanIntentEnumObject(CarePlanIntentEnum carePlanIntentEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamStatusEnumObject(CareTeamStatusEnum careTeamStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogEntryRelationTypeEnumObject(CatalogEntryRelationTypeEnum catalogEntryRelationTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicCombinationEnumObject(CharacteristicCombinationEnum characteristicCombinationEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemStatusEnumObject(ChargeItemStatusEnum chargeItemStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionStatusEnumObject(ClinicalImpressionStatusEnum clinicalImpressionStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalUseDefinitionTypeEnumObject(ClinicalUseDefinitionTypeEnum clinicalUseDefinitionTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCodePrimitive_Pattern(codePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodePrimitive_MinLength(codePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCodePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] CODE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\s]+(\\s[^\\s]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Code Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive_Pattern(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getCodePrimitive(), codePrimitive, CODE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Code Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive_MinLength(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = codePrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getCodePrimitive(), codePrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSearchSupportEnumObject(CodeSearchSupportEnum codeSearchSupportEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemContentModeEnumObject(CodeSystemContentModeEnum codeSystemContentModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemHierarchyMeaningEnumObject(CodeSystemHierarchyMeaningEnum codeSystemHierarchyMeaningEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentTypeEnumObject(CompartmentTypeEnum compartmentTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttestationModeEnumObject(CompositionAttestationModeEnum compositionAttestationModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionStatusEnumObject(CompositionStatusEnum compositionStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapEquivalenceEnumObject(ConceptMapEquivalenceEnum conceptMapEquivalenceEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapGroupUnmappedModeEnumObject(ConceptMapGroupUnmappedModeEnum conceptMapGroupUnmappedModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDeleteStatusEnumObject(ConditionalDeleteStatusEnum conditionalDeleteStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalReadStatusEnumObject(ConditionalReadStatusEnum conditionalReadStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialityEnumObject(ConfidentialityEnum confidentialityEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDataMeaningEnumObject(ConsentDataMeaningEnum consentDataMeaningEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentProvisionTypeEnumObject(ConsentProvisionTypeEnum consentProvisionTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentStateEnumObject(ConsentStateEnum consentStateEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSeverityEnumObject(ConstraintSeverityEnum constraintSeverityEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystemEnumObject(ContactPointSystemEnum contactPointSystemEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUseEnumObject(ContactPointUseEnum contactPointUseEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractResourcePublicationStatusCodesEnumObject(ContractResourcePublicationStatusCodesEnum contractResourcePublicationStatusCodesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractResourceStatusCodesEnumObject(ContractResourceStatusCodesEnum contractResourceStatusCodesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributorTypeEnumObject(ContributorTypeEnum contributorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriaNotExistsBehaviorEnumObject(CriteriaNotExistsBehaviorEnum criteriaNotExistsBehaviorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitive(XMLGregorianCalendar datePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatePrimitiveBase_MemberTypes(datePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateDatePrimitive_Pattern(datePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DATE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitive_Pattern(XMLGregorianCalendar datePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getDatePrimitive(), datePrimitive, DATE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitiveBase(XMLGregorianCalendar datePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatePrimitiveBase_MemberTypes(datePrimitiveBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Primitive Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitiveBase_MemberTypes(XMLGregorianCalendar datePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.GYEAR.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.GYEAR.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(datePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(datePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(datePrimitiveBase, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitive(XMLGregorianCalendar dateTimePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimePrimitiveBase_MemberTypes(dateTimePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTimePrimitive_Pattern(dateTimePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateTimePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DATE_TIME_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Time Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitive_Pattern(XMLGregorianCalendar dateTimePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getDateTimePrimitive(), dateTimePrimitive, DATE_TIME_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitiveBase(XMLGregorianCalendar dateTimePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimePrimitiveBase_MemberTypes(dateTimePrimitiveBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Time Primitive Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitiveBase_MemberTypes(XMLGregorianCalendar dateTimePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDateTime(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDateTime(dateTimePrimitiveBase, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaysOfWeekEnumObject(DaysOfWeekEnum daysOfWeekEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPrimitive(Object decimalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimalPrimitive_MemberTypes(decimalPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Decimal Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPrimitive_MemberTypes(Object decimalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DECIMAL.isInstance(decimalPrimitive)) {
				if (xmlTypeValidator.validateDecimal((BigDecimal)decimalPrimitive, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DOUBLE.isInstance(decimalPrimitive)) {
				if (xmlTypeValidator.validateDouble((Double)decimalPrimitive, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DECIMAL.isInstance(decimalPrimitive)) {
				if (xmlTypeValidator.validateDecimal((BigDecimal)decimalPrimitive, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DOUBLE.isInstance(decimalPrimitive)) {
				if (xmlTypeValidator.validateDouble((Double)decimalPrimitive, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionResourceTypeEnumObject(DefinitionResourceTypeEnum definitionResourceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueSeverityEnumObject(DetectedIssueSeverityEnum detectedIssueSeverityEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationStateEnumObject(DeviceMetricCalibrationStateEnum deviceMetricCalibrationStateEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationTypeEnumObject(DeviceMetricCalibrationTypeEnum deviceMetricCalibrationTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCategoryEnumObject(DeviceMetricCategoryEnum deviceMetricCategoryEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricColorEnumObject(DeviceMetricColorEnum deviceMetricColorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricOperationalStatusEnumObject(DeviceMetricOperationalStatusEnum deviceMetricOperationalStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceNameTypeEnumObject(DeviceNameTypeEnum deviceNameTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseStatementStatusEnumObject(DeviceUseStatementStatusEnum deviceUseStatementStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportStatusEnumObject(DiagnosticReportStatusEnum diagnosticReportStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscriminatorTypeEnumObject(DiscriminatorTypeEnum discriminatorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentModeEnumObject(DocumentModeEnum documentModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceStatusEnumObject(DocumentReferenceStatusEnum documentReferenceStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRelationshipTypeEnumObject(DocumentRelationshipTypeEnum documentRelationshipTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityRequestPurposeEnumObject(EligibilityRequestPurposeEnum eligibilityRequestPurposeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponsePurposeEnumObject(EligibilityResponsePurposeEnum eligibilityResponsePurposeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableWhenBehaviorEnumObject(EnableWhenBehaviorEnum enableWhenBehaviorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationStatusEnumObject(EncounterLocationStatusEnum encounterLocationStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStatusEnumObject(EncounterStatusEnum encounterStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointStatusEnumObject(EndpointStatusEnum endpointStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatusEnumObject(EpisodeOfCareStatusEnum episodeOfCareStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventCapabilityModeEnumObject(EventCapabilityModeEnum eventCapabilityModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventOrRequestResourceTypesEnumObject(EventOrRequestResourceTypesEnum eventOrRequestResourceTypesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventResourceTypeEnumObject(EventResourceTypeEnum eventResourceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventStatusEnumObject(EventStatusEnum eventStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTimingEnumObject(EventTimingEnum eventTimingEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceVariableHandlingEnumObject(EvidenceVariableHandlingEnum evidenceVariableHandlingEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleScenarioActorTypeEnumObject(ExampleScenarioActorTypeEnum exampleScenarioActorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitStatusEnumObject(ExplanationOfBenefitStatusEnum explanationOfBenefitStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionLanguageEnumObject(ExpressionLanguageEnum expressionLanguageEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionContextTypeEnumObject(ExtensionContextTypeEnum extensionContextTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryStatusEnumObject(FamilyHistoryStatusEnum familyHistoryStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRAllTypesEnumObject(FHIRAllTypesEnum fhirAllTypesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRDefinedTypeEnumObject(FHIRDefinedTypeEnum fhirDefinedTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRDeviceStatusEnumObject(FHIRDeviceStatusEnum fhirDeviceStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRPathTypesEnumObject(FHIRPathTypesEnum fhirPathTypesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRSubstanceStatusEnumObject(FHIRSubstanceStatusEnum fhirSubstanceStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFHIRVersionEnumObject(FHIRVersionEnum fhirVersionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOperatorEnumObject(FilterOperatorEnum filterOperatorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinancialResourceStatusCodesEnumObject(FinancialResourceStatusCodesEnum financialResourceStatusCodesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagStatusEnumObject(FlagStatusEnum flagStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalLifecycleStatusEnumObject(GoalLifecycleStatusEnum goalLifecycleStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphCompartmentRuleEnumObject(GraphCompartmentRuleEnum graphCompartmentRuleEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphCompartmentUseEnumObject(GraphCompartmentUseEnum graphCompartmentUseEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupMeasureEnumObject(GroupMeasureEnum groupMeasureEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupTypeEnumObject(GroupTypeEnum groupTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponseStatusEnumObject(GuidanceResponseStatusEnum guidanceResponseStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidePageGenerationEnumObject(GuidePageGenerationEnum guidePageGenerationEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideParameterCodeEnumObject(GuideParameterCodeEnum guideParameterCodeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerbEnumObject(HTTPVerbEnum httpVerbEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUseEnumObject(IdentifierUseEnum identifierUseEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityAssuranceLevelEnumObject(IdentityAssuranceLevelEnum identityAssuranceLevelEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdPrimitive_Pattern(idPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdPrimitive_MinLength(idPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdPrimitive_MaxLength(idPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] ID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z0-9\\-\\.]{1,64}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_Pattern(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getIdPrimitive(), idPrimitive, ID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_MinLength(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = idPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getIdPrimitive(), idPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_MaxLength(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = idPrimitive.length();
		boolean result = length <= 64;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(FhirPackage.eINSTANCE.getIdPrimitive(), idPrimitive, length, 64, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudyStatusEnumObject(ImagingStudyStatusEnum imagingStudyStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationEvaluationStatusCodesEnumObject(ImmunizationEvaluationStatusCodesEnum immunizationEvaluationStatusCodesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationStatusCodesEnumObject(ImmunizationStatusCodesEnum immunizationStatusCodesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredientManufacturerRoleEnumObject(IngredientManufacturerRoleEnum ingredientManufacturerRoleEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantPrimitive(XMLGregorianCalendar instantPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInstantPrimitive_Pattern(instantPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateInstantPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] INSTANT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]([0-9]([0-9][1-9]|[1-9]0)|[1-9]00)|[1-9]000)-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])T([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Instant Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantPrimitive_Pattern(XMLGregorianCalendar instantPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getInstantPrimitive(), instantPrimitive, INSTANT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitive(int integerPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerPrimitive_Pattern(integerPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIntegerPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] INTEGER_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?([0]|([1-9][0-9]*))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Integer Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitive_Pattern(int integerPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getIntegerPrimitive(), integerPrimitive, INTEGER_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitiveObject(Integer integerPrimitiveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerPrimitive_Pattern(integerPrimitiveObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionTriggerEnumObject(InteractionTriggerEnum interactionTriggerEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoicePriceComponentTypeEnumObject(InvoicePriceComponentTypeEnum invoicePriceComponentTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceStatusEnumObject(InvoiceStatusEnum invoiceStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverityEnumObject(IssueSeverityEnum issueSeverityEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueTypeEnumObject(IssueTypeEnum issueTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnowledgeResourceTypeEnumObject(KnowledgeResourceTypeEnum knowledgeResourceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkageTypeEnumObject(LinkageTypeEnum linkageTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkTypeEnumObject(LinkTypeEnum linkTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListModeEnumObject(ListModeEnum listModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStatusEnumObject(ListStatusEnum listStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationModeEnumObject(LocationModeEnum locationModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationStatusEnumObject(LocationStatusEnum locationStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdownPrimitive(String markdownPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarkdownPrimitive_Pattern(markdownPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateMarkdownPrimitive_MinLength(markdownPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMarkdownPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] MARKDOWN_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[ \\r\\n\\t\\S]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Markdown Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdownPrimitive_Pattern(String markdownPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getMarkdownPrimitive(), markdownPrimitive, MARKDOWN_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Markdown Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdownPrimitive_MinLength(String markdownPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = markdownPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getMarkdownPrimitive(), markdownPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStatusEnumObject(MeasureReportStatusEnum measureReportStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportTypeEnumObject(MeasureReportTypeEnum measureReportTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestIntentEnumObject(MedicationRequestIntentEnum medicationRequestIntentEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationrequestStatusEnumObject(MedicationrequestStatusEnum medicationrequestStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementStatusCodesEnumObject(MedicationStatementStatusCodesEnum medicationStatementStatusCodesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusCodesEnumObject(MedicationStatusCodesEnum medicationStatusCodesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageheaderResponseRequestEnumObject(MessageheaderResponseRequestEnum messageheaderResponseRequestEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSignificanceCategoryEnumObject(MessageSignificanceCategoryEnum messageSignificanceCategoryEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUseEnumObject(NameUseEnum nameUseEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemIdentifierTypeEnumObject(NamingSystemIdentifierTypeEnum namingSystemIdentifierTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemTypeEnumObject(NamingSystemTypeEnum namingSystemTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatusEnumObject(NarrativeStatusEnum narrativeStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteTypeEnumObject(NoteTypeEnum noteTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionProductStatusEnumObject(NutritionProductStatusEnum nutritionProductStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationDataTypeEnumObject(ObservationDataTypeEnum observationDataTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRangeCategoryEnumObject(ObservationRangeCategoryEnum observationRangeCategoryEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationStatusEnumObject(ObservationStatusEnum observationStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOidPrimitive_Pattern(oidPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateOidPrimitive_MinLength(oidPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOidPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] OID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:oid:[0-2](\\.(0|[1-9][0-9]*))+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive_Pattern(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getOidPrimitive(), oidPrimitive, OID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Oid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive_MinLength(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = oidPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getOidPrimitive(), oidPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationKindEnumObject(OperationKindEnum operationKindEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterUseEnumObject(OperationParameterUseEnum operationParameterUseEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationTypeEnumObject(OrientationTypeEnum orientationTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRequiredEnumObject(ParticipantRequiredEnum participantRequiredEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationStatusEnumObject(ParticipationStatusEnum participationStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntPrimitive(BigInteger positiveIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(positiveIntPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositiveIntPrimitive_Pattern(positiveIntPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveIntPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] POSITIVE_INT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Positive Int Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntPrimitive_Pattern(BigInteger positiveIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getPositiveIntPrimitive(), positiveIntPrimitive, POSITIVE_INT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRepresentationEnumObject(PropertyRepresentationEnum propertyRepresentationEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTypeEnumObject(PropertyTypeEnum propertyTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntityRoleEnumObject(ProvenanceEntityRoleEnum provenanceEntityRoleEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationStatusEnumObject(PublicationStatusEnum publicationStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityTypeEnumObject(QualityTypeEnum qualityTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparatorEnumObject(QuantityComparatorEnum quantityComparatorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItemOperatorEnumObject(QuestionnaireItemOperatorEnum questionnaireItemOperatorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItemTypeEnumObject(QuestionnaireItemTypeEnum questionnaireItemTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseStatusEnumObject(QuestionnaireResponseStatusEnum questionnaireResponseStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceHandlingPolicyEnumObject(ReferenceHandlingPolicyEnum referenceHandlingPolicyEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceVersionRulesEnumObject(ReferenceVersionRulesEnum referenceVersionRulesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedArtifactTypeEnumObject(RelatedArtifactTypeEnum relatedArtifactTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemittanceOutcomeEnumObject(RemittanceOutcomeEnum remittanceOutcomeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportRelationshipTypeEnumObject(ReportRelationshipTypeEnum reportRelationshipTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryTypeEnumObject(RepositoryTypeEnum repositoryTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestIntentEnumObject(RequestIntentEnum requestIntentEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestPriorityEnumObject(RequestPriorityEnum requestPriorityEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestResourceTypeEnumObject(RequestResourceTypeEnum requestResourceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestStatusEnumObject(RequestStatusEnum requestStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchElementTypeEnumObject(ResearchElementTypeEnum researchElementTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchStudyStatusEnumObject(ResearchStudyStatusEnum researchStudyStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchSubjectStatusEnumObject(ResearchSubjectStatusEnum researchSubjectStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceTypeEnumObject(ResourceTypeEnum resourceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceVersionPolicyEnumObject(ResourceVersionPolicyEnum resourceVersionPolicyEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseTypeEnumObject(ResponseTypeEnum responseTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestfulCapabilityModeEnumObject(RestfulCapabilityModeEnum restfulCapabilityModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataTypePrimitive(String sampledDataDataTypePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSampledDataDataTypePrimitive_Pattern(sampledDataDataTypePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSampledDataDataTypePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] SAMPLED_DATA_DATA_TYPE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((-{0,1}\\d*\\.{0,1}\\d+)|[EUL])( ((-{0,1}\\d*\\.{0,1}\\d+)|[EUL]))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Sampled Data Data Type Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataTypePrimitive_Pattern(String sampledDataDataTypePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getSampledDataDataTypePrimitive(), sampledDataDataTypePrimitive, SAMPLED_DATA_DATA_TYPE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchComparatorEnumObject(SearchComparatorEnum searchComparatorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryModeEnumObject(SearchEntryModeEnum searchEntryModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchModifierCodeEnumObject(SearchModifierCodeEnum searchModifierCodeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParamTypeEnumObject(SearchParamTypeEnum searchParamTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceTypeEnumObject(SequenceTypeEnum sequenceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlicingRulesEnumObject(SlicingRulesEnum slicingRulesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotStatusEnumObject(SlotStatusEnum slotStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortDirectionEnumObject(SortDirectionEnum sortDirectionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSPDXLicenseEnumObject(SPDXLicenseEnum spdxLicenseEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenContainedPreferenceEnumObject(SpecimenContainedPreferenceEnum specimenContainedPreferenceEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenStatusEnumObject(SpecimenStatusEnum specimenStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusEnumObject(StatusEnum statusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrandTypeEnumObject(StrandTypeEnum strandTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringPrimitive(String stringPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringPrimitive_MinLength(stringPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>String Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringPrimitive_MinLength(String stringPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = stringPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getStringPrimitive(), stringPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionKindEnumObject(StructureDefinitionKindEnum structureDefinitionKindEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapContextTypeEnumObject(StructureMapContextTypeEnum structureMapContextTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapGroupTypeModeEnumObject(StructureMapGroupTypeModeEnum structureMapGroupTypeModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapInputModeEnumObject(StructureMapInputModeEnum structureMapInputModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapModelModeEnumObject(StructureMapModelModeEnum structureMapModelModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapSourceListModeEnumObject(StructureMapSourceListModeEnum structureMapSourceListModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTargetListModeEnumObject(StructureMapTargetListModeEnum structureMapTargetListModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTransformEnumObject(StructureMapTransformEnum structureMapTransformEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannelTypeEnumObject(SubscriptionChannelTypeEnum subscriptionChannelTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionNotificationTypeEnumObject(SubscriptionNotificationTypeEnum subscriptionNotificationTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatusCodesEnumObject(SubscriptionStatusCodesEnum subscriptionStatusCodesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliveryStatusEnumObject(SupplyDeliveryStatusEnum supplyDeliveryStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestStatusEnumObject(SupplyRequestStatusEnum supplyRequestStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteractionEnumObject(SystemRestfulInteractionEnum systemRestfulInteractionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskIntentEnumObject(TaskIntentEnum taskIntentEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskStatusEnumObject(TaskStatusEnum taskStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportActionResultEnumObject(TestReportActionResultEnum testReportActionResultEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportParticipantTypeEnumObject(TestReportParticipantTypeEnum testReportParticipantTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportResultEnumObject(TestReportResultEnum testReportResultEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportStatusEnumObject(TestReportStatusEnum testReportStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRequestMethodCodeEnumObject(TestScriptRequestMethodCodeEnum testScriptRequestMethodCodeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitive(XMLGregorianCalendar timePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimePrimitive_Pattern(timePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] TIME_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([01][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)(\\.[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitive_Pattern(XMLGregorianCalendar timePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getTimePrimitive(), timePrimitive, TIME_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerTypeEnumObject(TriggerTypeEnum triggerTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDerivationRuleEnumObject(TypeDerivationRuleEnum typeDerivationRuleEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteractionEnumObject(TypeRestfulInteractionEnum typeRestfulInteractionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIEntryTypeEnumObject(UDIEntryTypeEnum udiEntryTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTimeEnumObject(UnitsOfTimeEnum unitsOfTimeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntPrimitive(BigInteger unsignedIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(unsignedIntPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnsignedIntPrimitive_Pattern(unsignedIntPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnsignedIntPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] UNSIGNED_INT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0]|([1-9][0-9]*)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Unsigned Int Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntPrimitive_Pattern(BigInteger unsignedIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getUnsignedIntPrimitive(), unsignedIntPrimitive, UNSIGNED_INT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriPrimitive(String uriPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUriPrimitive_Pattern(uriPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUriPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] URI_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uri Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriPrimitive_Pattern(String uriPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getUriPrimitive(), uriPrimitive, URI_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlPrimitive(String urlPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUrlPrimitive_Pattern(urlPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUrlPrimitive_MinLength(urlPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUrlPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] URL_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Url Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlPrimitive_Pattern(String urlPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getUrlPrimitive(), urlPrimitive, URL_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Url Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlPrimitive_MinLength(String urlPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = urlPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getUrlPrimitive(), urlPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseEnumObject(UseEnum useEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUuidPrimitive_Pattern(uuidPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUuidPrimitive_MinLength(uuidPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUuidPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] UUID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uuid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive_Pattern(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getUuidPrimitive(), uuidPrimitive, UUID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Uuid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive_MinLength(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uuidPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getUuidPrimitive(), uuidPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableTypeEnumObject(VariableTypeEnum variableTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionBaseEnumObject(VisionBaseEnum visionBaseEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionEyesEnumObject(VisionEyesEnum visionEyesEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXPathUsageTypeEnumObject(XPathUsageTypeEnum xPathUsageTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FhirValidator

/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Citation Resource enables reference to any knowledge artifact for purposes of identification and attribution. The Citation Resource supports existing reference structures and developing publication practices such as versioning, expressing complex contributorship roles, and referencing computable resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CitationEntry#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getInitials <em>Initials</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getCollectiveName <em>Collective Name</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getAffiliationInfo <em>Affiliation Info</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getContributionType <em>Contribution Type</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getContributionInstance <em>Contribution Instance</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getCorrespondingContact <em>Corresponding Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationEntry#getListOrder <em>List Order</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCitationEntry()
 * @model extendedMetaData="name='Citation.Entry' kind='elementOnly'"
 * @generated
 */
public interface CitationEntry extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name associated with the individual.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationEntry#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Initials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initials for forename.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initials</em>' containment reference.
	 * @see #setInitials(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_Initials()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initials' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getInitials();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationEntry#getInitials <em>Initials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initials</em>' containment reference.
	 * @see #getInitials()
	 * @generated
	 */
	void setInitials(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Collective Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for collective or corporate name as an author.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collective Name</em>' containment reference.
	 * @see #setCollectiveName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_CollectiveName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collectiveName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCollectiveName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationEntry#getCollectiveName <em>Collective Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collective Name</em>' containment reference.
	 * @see #getCollectiveName()
	 * @generated
	 */
	void setCollectiveName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique person identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Affiliation Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationAffiliationInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization affiliated with the entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affiliation Info</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_AffiliationInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='affiliationInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationAffiliationInfo> getAffiliationInfo();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical mailing address for the author or contributor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Address> getAddress();

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Email or telephone contact methods for the author or contributor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getTelecom();

	/**
	 * Returns the value of the '<em><b>Contribution Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element identifies the specific nature of an individual’s contribution with respect to the cited work.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contribution Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_ContributionType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributionType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getContributionType();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role of the contributor (e.g. author, editor, reviewer).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationEntry#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Contribution Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationContributionInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contributions with accounting for time or number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contribution Instance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_ContributionInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributionInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationContributionInstance> getContributionInstance();

	/**
	 * Returns the value of the '<em><b>Corresponding Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication of which contributor is the corresponding contributor for the role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Corresponding Contact</em>' containment reference.
	 * @see #setCorrespondingContact(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_CorrespondingContact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='correspondingContact' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getCorrespondingContact();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationEntry#getCorrespondingContact <em>Corresponding Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Contact</em>' containment reference.
	 * @see #getCorrespondingContact()
	 * @generated
	 */
	void setCorrespondingContact(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>List Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to code order of authors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Order</em>' containment reference.
	 * @see #setListOrder(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getCitationEntry_ListOrder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='listOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getListOrder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationEntry#getListOrder <em>List Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Order</em>' containment reference.
	 * @see #getListOrder()
	 * @generated
	 */
	void setListOrder(PositiveInt value);

} // CitationEntry

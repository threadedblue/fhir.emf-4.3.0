/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Affiliation Info</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CitationAffiliationInfo#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationAffiliationInfo#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationAffiliationInfo#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCitationAffiliationInfo()
 * @model extendedMetaData="name='Citation.AffiliationInfo' kind='elementOnly'"
 * @generated
 */
public interface CitationAffiliationInfo extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affiliation</em>' containment reference.
	 * @see #setAffiliation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationAffiliationInfo_Affiliation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='affiliation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAffiliation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationAffiliationInfo#getAffiliation <em>Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliation</em>' containment reference.
	 * @see #getAffiliation()
	 * @generated
	 */
	void setAffiliation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role within the organization, such as professional title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCitationAffiliationInfo_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationAffiliationInfo#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCitationAffiliationInfo_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

} // CitationAffiliationInfo

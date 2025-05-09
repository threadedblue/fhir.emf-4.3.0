/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allergy Intolerance Severity Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceSeverityEnum()
 * @model extendedMetaData="name='AllergyIntoleranceSeverityEnum'"
 * @generated
 */
public enum AllergyIntoleranceSeverityEnum implements Enumerator {
	/**
	 * The '<em><b>Mild</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mild
	 * <!-- end-model-doc -->
	 * @see #MILD_VALUE
	 * @generated
	 * @ordered
	 */
	MILD(0, "mild", "mild"),

	/**
	 * The '<em><b>Moderate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moderate
	 * <!-- end-model-doc -->
	 * @see #MODERATE_VALUE
	 * @generated
	 * @ordered
	 */
	MODERATE(1, "moderate", "moderate"),

	/**
	 * The '<em><b>Severe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Severe
	 * <!-- end-model-doc -->
	 * @see #SEVERE_VALUE
	 * @generated
	 * @ordered
	 */
	SEVERE(2, "severe", "severe");

	/**
	 * The '<em><b>Mild</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mild
	 * <!-- end-model-doc -->
	 * @see #MILD
	 * @model name="mild"
	 * @generated
	 * @ordered
	 */
	public static final int MILD_VALUE = 0;

	/**
	 * The '<em><b>Moderate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moderate
	 * <!-- end-model-doc -->
	 * @see #MODERATE
	 * @model name="moderate"
	 * @generated
	 * @ordered
	 */
	public static final int MODERATE_VALUE = 1;

	/**
	 * The '<em><b>Severe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Severe
	 * <!-- end-model-doc -->
	 * @see #SEVERE
	 * @model name="severe"
	 * @generated
	 * @ordered
	 */
	public static final int SEVERE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Allergy Intolerance Severity Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllergyIntoleranceSeverityEnum[] VALUES_ARRAY =
		new AllergyIntoleranceSeverityEnum[] {
			MILD,
			MODERATE,
			SEVERE,
		};

	/**
	 * A public read-only list of all the '<em><b>Allergy Intolerance Severity Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllergyIntoleranceSeverityEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allergy Intolerance Severity Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceSeverityEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllergyIntoleranceSeverityEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergy Intolerance Severity Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceSeverityEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllergyIntoleranceSeverityEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergy Intolerance Severity Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceSeverityEnum get(int value) {
		switch (value) {
			case MILD_VALUE: return MILD;
			case MODERATE_VALUE: return MODERATE;
			case SEVERE_VALUE: return SEVERE;
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
	private AllergyIntoleranceSeverityEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //AllergyIntoleranceSeverityEnum

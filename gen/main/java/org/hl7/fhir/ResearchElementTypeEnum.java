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
 * A representation of the literals of the enumeration '<em><b>Research Element Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getResearchElementTypeEnum()
 * @model extendedMetaData="name='ResearchElementTypeEnum'"
 * @generated
 */
public enum ResearchElementTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Population</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Population
	 * <!-- end-model-doc -->
	 * @see #POPULATION_VALUE
	 * @generated
	 * @ordered
	 */
	POPULATION(0, "population", "population"),

	/**
	 * The '<em><b>Exposure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exposure
	 * <!-- end-model-doc -->
	 * @see #EXPOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPOSURE(1, "exposure", "exposure"),

	/**
	 * The '<em><b>Outcome</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outcome
	 * <!-- end-model-doc -->
	 * @see #OUTCOME_VALUE
	 * @generated
	 * @ordered
	 */
	OUTCOME(2, "outcome", "outcome");

	/**
	 * The '<em><b>Population</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Population
	 * <!-- end-model-doc -->
	 * @see #POPULATION
	 * @model name="population"
	 * @generated
	 * @ordered
	 */
	public static final int POPULATION_VALUE = 0;

	/**
	 * The '<em><b>Exposure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exposure
	 * <!-- end-model-doc -->
	 * @see #EXPOSURE
	 * @model name="exposure"
	 * @generated
	 * @ordered
	 */
	public static final int EXPOSURE_VALUE = 1;

	/**
	 * The '<em><b>Outcome</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outcome
	 * <!-- end-model-doc -->
	 * @see #OUTCOME
	 * @model name="outcome"
	 * @generated
	 * @ordered
	 */
	public static final int OUTCOME_VALUE = 2;

	/**
	 * An array of all the '<em><b>Research Element Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResearchElementTypeEnum[] VALUES_ARRAY =
		new ResearchElementTypeEnum[] {
			POPULATION,
			EXPOSURE,
			OUTCOME,
		};

	/**
	 * A public read-only list of all the '<em><b>Research Element Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResearchElementTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Research Element Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResearchElementTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResearchElementTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Research Element Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResearchElementTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResearchElementTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Research Element Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResearchElementTypeEnum get(int value) {
		switch (value) {
			case POPULATION_VALUE: return POPULATION;
			case EXPOSURE_VALUE: return EXPOSURE;
			case OUTCOME_VALUE: return OUTCOME;
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
	private ResearchElementTypeEnum(int value, String name, String literal) {
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
	
} //ResearchElementTypeEnum

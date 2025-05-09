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
 * A representation of the literals of the enumeration '<em><b>Search Entry Mode Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSearchEntryModeEnum()
 * @model extendedMetaData="name='SearchEntryModeEnum'"
 * @generated
 */
public enum SearchEntryModeEnum implements Enumerator {
	/**
	 * The '<em><b>Match</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Match
	 * <!-- end-model-doc -->
	 * @see #MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	MATCH(0, "match", "match"),

	/**
	 * The '<em><b>Include</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Include
	 * <!-- end-model-doc -->
	 * @see #INCLUDE_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDE(1, "include", "include"),

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
	 * The '<em><b>Match</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Match
	 * <!-- end-model-doc -->
	 * @see #MATCH
	 * @model name="match"
	 * @generated
	 * @ordered
	 */
	public static final int MATCH_VALUE = 0;

	/**
	 * The '<em><b>Include</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Include
	 * <!-- end-model-doc -->
	 * @see #INCLUDE
	 * @model name="include"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDE_VALUE = 1;

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
	 * An array of all the '<em><b>Search Entry Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SearchEntryModeEnum[] VALUES_ARRAY =
		new SearchEntryModeEnum[] {
			MATCH,
			INCLUDE,
			OUTCOME,
		};

	/**
	 * A public read-only list of all the '<em><b>Search Entry Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SearchEntryModeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Search Entry Mode Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchEntryModeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SearchEntryModeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Search Entry Mode Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchEntryModeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SearchEntryModeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Search Entry Mode Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchEntryModeEnum get(int value) {
		switch (value) {
			case MATCH_VALUE: return MATCH;
			case INCLUDE_VALUE: return INCLUDE;
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
	private SearchEntryModeEnum(int value, String name, String literal) {
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
	
} //SearchEntryModeEnum

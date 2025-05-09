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
 * A representation of the literals of the enumeration '<em><b>Filter Operator Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getFilterOperatorEnum()
 * @model extendedMetaData="name='FilterOperatorEnum'"
 * @generated
 */
public enum FilterOperatorEnum implements Enumerator {
	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equals
	 * <!-- end-model-doc -->
	 * @see #___VALUE
	 * @generated
	 * @ordered
	 */
	__(0, "__", "="),

	/**
	 * The '<em><b>Is A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is A (by subsumption)
	 * <!-- end-model-doc -->
	 * @see #IS_A_VALUE
	 * @generated
	 * @ordered
	 */
	IS_A(1, "isA", "is-a"),

	/**
	 * The '<em><b>Descendent Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descendent Of (by subsumption)
	 * <!-- end-model-doc -->
	 * @see #DESCENDENT_OF_VALUE
	 * @generated
	 * @ordered
	 */
	DESCENDENT_OF(2, "descendentOf", "descendent-of"),

	/**
	 * The '<em><b>Is Not A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not (Is A) (by subsumption)
	 * <!-- end-model-doc -->
	 * @see #IS_NOT_A_VALUE
	 * @generated
	 * @ordered
	 */
	IS_NOT_A(3, "isNotA", "is-not-a"),

	/**
	 * The '<em><b>Regex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regular Expression
	 * <!-- end-model-doc -->
	 * @see #REGEX_VALUE
	 * @generated
	 * @ordered
	 */
	REGEX(4, "regex", "regex"),

	/**
	 * The '<em><b>In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Set
	 * <!-- end-model-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(5, "in", "in"),

	/**
	 * The '<em><b>Not In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not in Set
	 * <!-- end-model-doc -->
	 * @see #NOT_IN_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_IN(6, "notIn", "not-in"),

	/**
	 * The '<em><b>Generalizes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalizes (by Subsumption)
	 * <!-- end-model-doc -->
	 * @see #GENERALIZES_VALUE
	 * @generated
	 * @ordered
	 */
	GENERALIZES(7, "generalizes", "generalizes"),

	/**
	 * The '<em><b>Exists</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exists
	 * <!-- end-model-doc -->
	 * @see #EXISTS_VALUE
	 * @generated
	 * @ordered
	 */
	EXISTS(8, "exists", "exists");

	/**
	 * The '<em><b></b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equals
	 * <!-- end-model-doc -->
	 * @see #__
	 * @model literal="="
	 * @generated
	 * @ordered
	 */
	public static final int ___VALUE = 0;

	/**
	 * The '<em><b>Is A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is A (by subsumption)
	 * <!-- end-model-doc -->
	 * @see #IS_A
	 * @model name="isA" literal="is-a"
	 * @generated
	 * @ordered
	 */
	public static final int IS_A_VALUE = 1;

	/**
	 * The '<em><b>Descendent Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descendent Of (by subsumption)
	 * <!-- end-model-doc -->
	 * @see #DESCENDENT_OF
	 * @model name="descendentOf" literal="descendent-of"
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDENT_OF_VALUE = 2;

	/**
	 * The '<em><b>Is Not A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not (Is A) (by subsumption)
	 * <!-- end-model-doc -->
	 * @see #IS_NOT_A
	 * @model name="isNotA" literal="is-not-a"
	 * @generated
	 * @ordered
	 */
	public static final int IS_NOT_A_VALUE = 3;

	/**
	 * The '<em><b>Regex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regular Expression
	 * <!-- end-model-doc -->
	 * @see #REGEX
	 * @model name="regex"
	 * @generated
	 * @ordered
	 */
	public static final int REGEX_VALUE = 4;

	/**
	 * The '<em><b>In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Set
	 * <!-- end-model-doc -->
	 * @see #IN
	 * @model name="in"
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 5;

	/**
	 * The '<em><b>Not In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not in Set
	 * <!-- end-model-doc -->
	 * @see #NOT_IN
	 * @model name="notIn" literal="not-in"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_IN_VALUE = 6;

	/**
	 * The '<em><b>Generalizes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalizes (by Subsumption)
	 * <!-- end-model-doc -->
	 * @see #GENERALIZES
	 * @model name="generalizes"
	 * @generated
	 * @ordered
	 */
	public static final int GENERALIZES_VALUE = 7;

	/**
	 * The '<em><b>Exists</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exists
	 * <!-- end-model-doc -->
	 * @see #EXISTS
	 * @model name="exists"
	 * @generated
	 * @ordered
	 */
	public static final int EXISTS_VALUE = 8;

	/**
	 * An array of all the '<em><b>Filter Operator Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FilterOperatorEnum[] VALUES_ARRAY =
		new FilterOperatorEnum[] {
			__,
			IS_A,
			DESCENDENT_OF,
			IS_NOT_A,
			REGEX,
			IN,
			NOT_IN,
			GENERALIZES,
			EXISTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Filter Operator Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FilterOperatorEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Filter Operator Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperatorEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterOperatorEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Operator Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperatorEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterOperatorEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Operator Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperatorEnum get(int value) {
		switch (value) {
			case ___VALUE: return __;
			case IS_A_VALUE: return IS_A;
			case DESCENDENT_OF_VALUE: return DESCENDENT_OF;
			case IS_NOT_A_VALUE: return IS_NOT_A;
			case REGEX_VALUE: return REGEX;
			case IN_VALUE: return IN;
			case NOT_IN_VALUE: return NOT_IN;
			case GENERALIZES_VALUE: return GENERALIZES;
			case EXISTS_VALUE: return EXISTS;
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
	private FilterOperatorEnum(int value, String name, String literal) {
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
	
} //FilterOperatorEnum

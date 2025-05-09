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
 * A representation of the literals of the enumeration '<em><b>Search Modifier Code Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSearchModifierCodeEnum()
 * @model extendedMetaData="name='SearchModifierCodeEnum'"
 * @generated
 */
public enum SearchModifierCodeEnum implements Enumerator {
	/**
	 * The '<em><b>Missing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing
	 * <!-- end-model-doc -->
	 * @see #MISSING_VALUE
	 * @generated
	 * @ordered
	 */
	MISSING(0, "missing", "missing"),

	/**
	 * The '<em><b>Exact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exact
	 * <!-- end-model-doc -->
	 * @see #EXACT_VALUE
	 * @generated
	 * @ordered
	 */
	EXACT(1, "exact", "exact"),

	/**
	 * The '<em><b>Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains
	 * <!-- end-model-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(2, "contains", "contains"),

	/**
	 * The '<em><b>Not</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not
	 * <!-- end-model-doc -->
	 * @see #NOT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT(3, "not", "not"),

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text
	 * <!-- end-model-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(4, "text", "text"),

	/**
	 * The '<em><b>In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In
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
	 * Not In
	 * <!-- end-model-doc -->
	 * @see #NOT_IN_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_IN(6, "notIn", "not-in"),

	/**
	 * The '<em><b>Below</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Below
	 * <!-- end-model-doc -->
	 * @see #BELOW_VALUE
	 * @generated
	 * @ordered
	 */
	BELOW(7, "below", "below"),

	/**
	 * The '<em><b>Above</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Above
	 * <!-- end-model-doc -->
	 * @see #ABOVE_VALUE
	 * @generated
	 * @ordered
	 */
	ABOVE(8, "above", "above"),

	/**
	 * The '<em><b>Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type
	 * <!-- end-model-doc -->
	 * @see #TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE(9, "type", "type"),

	/**
	 * The '<em><b>Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier
	 * <!-- end-model-doc -->
	 * @see #IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIER(10, "identifier", "identifier"),

	/**
	 * The '<em><b>Of Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Of Type
	 * <!-- end-model-doc -->
	 * @see #OF_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	OF_TYPE(11, "ofType", "ofType");

	/**
	 * The '<em><b>Missing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing
	 * <!-- end-model-doc -->
	 * @see #MISSING
	 * @model name="missing"
	 * @generated
	 * @ordered
	 */
	public static final int MISSING_VALUE = 0;

	/**
	 * The '<em><b>Exact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exact
	 * <!-- end-model-doc -->
	 * @see #EXACT
	 * @model name="exact"
	 * @generated
	 * @ordered
	 */
	public static final int EXACT_VALUE = 1;

	/**
	 * The '<em><b>Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains
	 * <!-- end-model-doc -->
	 * @see #CONTAINS
	 * @model name="contains"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 2;

	/**
	 * The '<em><b>Not</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not
	 * <!-- end-model-doc -->
	 * @see #NOT
	 * @model name="not"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_VALUE = 3;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text
	 * <!-- end-model-doc -->
	 * @see #TEXT
	 * @model name="text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 4;

	/**
	 * The '<em><b>In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In
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
	 * Not In
	 * <!-- end-model-doc -->
	 * @see #NOT_IN
	 * @model name="notIn" literal="not-in"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_IN_VALUE = 6;

	/**
	 * The '<em><b>Below</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Below
	 * <!-- end-model-doc -->
	 * @see #BELOW
	 * @model name="below"
	 * @generated
	 * @ordered
	 */
	public static final int BELOW_VALUE = 7;

	/**
	 * The '<em><b>Above</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Above
	 * <!-- end-model-doc -->
	 * @see #ABOVE
	 * @model name="above"
	 * @generated
	 * @ordered
	 */
	public static final int ABOVE_VALUE = 8;

	/**
	 * The '<em><b>Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type
	 * <!-- end-model-doc -->
	 * @see #TYPE
	 * @model name="type"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_VALUE = 9;

	/**
	 * The '<em><b>Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier
	 * <!-- end-model-doc -->
	 * @see #IDENTIFIER
	 * @model name="identifier"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIER_VALUE = 10;

	/**
	 * The '<em><b>Of Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Of Type
	 * <!-- end-model-doc -->
	 * @see #OF_TYPE
	 * @model name="ofType"
	 * @generated
	 * @ordered
	 */
	public static final int OF_TYPE_VALUE = 11;

	/**
	 * An array of all the '<em><b>Search Modifier Code Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SearchModifierCodeEnum[] VALUES_ARRAY =
		new SearchModifierCodeEnum[] {
			MISSING,
			EXACT,
			CONTAINS,
			NOT,
			TEXT,
			IN,
			NOT_IN,
			BELOW,
			ABOVE,
			TYPE,
			IDENTIFIER,
			OF_TYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Search Modifier Code Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SearchModifierCodeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Search Modifier Code Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchModifierCodeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SearchModifierCodeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Search Modifier Code Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchModifierCodeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SearchModifierCodeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Search Modifier Code Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchModifierCodeEnum get(int value) {
		switch (value) {
			case MISSING_VALUE: return MISSING;
			case EXACT_VALUE: return EXACT;
			case CONTAINS_VALUE: return CONTAINS;
			case NOT_VALUE: return NOT;
			case TEXT_VALUE: return TEXT;
			case IN_VALUE: return IN;
			case NOT_IN_VALUE: return NOT_IN;
			case BELOW_VALUE: return BELOW;
			case ABOVE_VALUE: return ABOVE;
			case TYPE_VALUE: return TYPE;
			case IDENTIFIER_VALUE: return IDENTIFIER;
			case OF_TYPE_VALUE: return OF_TYPE;
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
	private SearchModifierCodeEnum(int value, String name, String literal) {
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
	
} //SearchModifierCodeEnum

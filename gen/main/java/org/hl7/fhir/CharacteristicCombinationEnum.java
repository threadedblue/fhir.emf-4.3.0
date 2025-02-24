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
 * A representation of the literals of the enumeration '<em><b>Characteristic Combination Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getCharacteristicCombinationEnum()
 * @model extendedMetaData="name='CharacteristicCombinationEnum'"
 * @generated
 */
public enum CharacteristicCombinationEnum implements Enumerator {
	/**
	 * The '<em><b>Intersection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * intersection
	 * <!-- end-model-doc -->
	 * @see #INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERSECTION(0, "intersection", "intersection"),

	/**
	 * The '<em><b>Union</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * union
	 * <!-- end-model-doc -->
	 * @see #UNION_VALUE
	 * @generated
	 * @ordered
	 */
	UNION(1, "union", "union");

	/**
	 * The '<em><b>Intersection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * intersection
	 * <!-- end-model-doc -->
	 * @see #INTERSECTION
	 * @model name="intersection"
	 * @generated
	 * @ordered
	 */
	public static final int INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>Union</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * union
	 * <!-- end-model-doc -->
	 * @see #UNION
	 * @model name="union"
	 * @generated
	 * @ordered
	 */
	public static final int UNION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Characteristic Combination Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CharacteristicCombinationEnum[] VALUES_ARRAY =
		new CharacteristicCombinationEnum[] {
			INTERSECTION,
			UNION,
		};

	/**
	 * A public read-only list of all the '<em><b>Characteristic Combination Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CharacteristicCombinationEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Characteristic Combination Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CharacteristicCombinationEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CharacteristicCombinationEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Characteristic Combination Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CharacteristicCombinationEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CharacteristicCombinationEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Characteristic Combination Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CharacteristicCombinationEnum get(int value) {
		switch (value) {
			case INTERSECTION_VALUE: return INTERSECTION;
			case UNION_VALUE: return UNION;
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
	private CharacteristicCombinationEnum(int value, String name, String literal) {
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
	
} //CharacteristicCombinationEnum

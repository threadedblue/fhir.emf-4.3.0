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
 * A representation of the literals of the enumeration '<em><b>Sequence Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSequenceTypeEnum()
 * @model extendedMetaData="name='sequenceTypeEnum'"
 * @generated
 */
public enum SequenceTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Aa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AA Sequence
	 * <!-- end-model-doc -->
	 * @see #AA_VALUE
	 * @generated
	 * @ordered
	 */
	AA(0, "aa", "aa"),

	/**
	 * The '<em><b>Dna</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DNA Sequence
	 * <!-- end-model-doc -->
	 * @see #DNA_VALUE
	 * @generated
	 * @ordered
	 */
	DNA(1, "dna", "dna"),

	/**
	 * The '<em><b>Rna</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RNA Sequence
	 * <!-- end-model-doc -->
	 * @see #RNA_VALUE
	 * @generated
	 * @ordered
	 */
	RNA(2, "rna", "rna");

	/**
	 * The '<em><b>Aa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AA Sequence
	 * <!-- end-model-doc -->
	 * @see #AA
	 * @model name="aa"
	 * @generated
	 * @ordered
	 */
	public static final int AA_VALUE = 0;

	/**
	 * The '<em><b>Dna</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DNA Sequence
	 * <!-- end-model-doc -->
	 * @see #DNA
	 * @model name="dna"
	 * @generated
	 * @ordered
	 */
	public static final int DNA_VALUE = 1;

	/**
	 * The '<em><b>Rna</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RNA Sequence
	 * <!-- end-model-doc -->
	 * @see #RNA
	 * @model name="rna"
	 * @generated
	 * @ordered
	 */
	public static final int RNA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Sequence Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SequenceTypeEnum[] VALUES_ARRAY =
		new SequenceTypeEnum[] {
			AA,
			DNA,
			RNA,
		};

	/**
	 * A public read-only list of all the '<em><b>Sequence Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SequenceTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sequence Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SequenceTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SequenceTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sequence Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SequenceTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SequenceTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sequence Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SequenceTypeEnum get(int value) {
		switch (value) {
			case AA_VALUE: return AA;
			case DNA_VALUE: return DNA;
			case RNA_VALUE: return RNA;
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
	private SequenceTypeEnum(int value, String name, String literal) {
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
	
} //SequenceTypeEnum

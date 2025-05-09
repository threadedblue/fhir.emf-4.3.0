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
 * A representation of the literals of the enumeration '<em><b>Narrative Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getNarrativeStatusEnum()
 * @model extendedMetaData="name='NarrativeStatusEnum'"
 * @generated
 */
public enum NarrativeStatusEnum implements Enumerator {
	/**
	 * The '<em><b>Generated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generated
	 * <!-- end-model-doc -->
	 * @see #GENERATED_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATED(0, "generated", "generated"),

	/**
	 * The '<em><b>Extensions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extensions
	 * <!-- end-model-doc -->
	 * @see #EXTENSIONS_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSIONS(1, "extensions", "extensions"),

	/**
	 * The '<em><b>Additional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional
	 * <!-- end-model-doc -->
	 * @see #ADDITIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITIONAL(2, "additional", "additional"),

	/**
	 * The '<em><b>Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Empty
	 * <!-- end-model-doc -->
	 * @see #EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	EMPTY(3, "empty", "empty");

	/**
	 * The '<em><b>Generated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generated
	 * <!-- end-model-doc -->
	 * @see #GENERATED
	 * @model name="generated"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATED_VALUE = 0;

	/**
	 * The '<em><b>Extensions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extensions
	 * <!-- end-model-doc -->
	 * @see #EXTENSIONS
	 * @model name="extensions"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSIONS_VALUE = 1;

	/**
	 * The '<em><b>Additional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional
	 * <!-- end-model-doc -->
	 * @see #ADDITIONAL
	 * @model name="additional"
	 * @generated
	 * @ordered
	 */
	public static final int ADDITIONAL_VALUE = 2;

	/**
	 * The '<em><b>Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Empty
	 * <!-- end-model-doc -->
	 * @see #EMPTY
	 * @model name="empty"
	 * @generated
	 * @ordered
	 */
	public static final int EMPTY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Narrative Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NarrativeStatusEnum[] VALUES_ARRAY =
		new NarrativeStatusEnum[] {
			GENERATED,
			EXTENSIONS,
			ADDITIONAL,
			EMPTY,
		};

	/**
	 * A public read-only list of all the '<em><b>Narrative Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NarrativeStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Narrative Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NarrativeStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NarrativeStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Narrative Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NarrativeStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NarrativeStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Narrative Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NarrativeStatusEnum get(int value) {
		switch (value) {
			case GENERATED_VALUE: return GENERATED;
			case EXTENSIONS_VALUE: return EXTENSIONS;
			case ADDITIONAL_VALUE: return ADDITIONAL;
			case EMPTY_VALUE: return EMPTY;
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
	private NarrativeStatusEnum(int value, String name, String literal) {
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
	
} //NarrativeStatusEnum

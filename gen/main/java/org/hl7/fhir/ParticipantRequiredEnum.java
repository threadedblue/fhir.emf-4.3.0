/**
 */
package org.hl7.fhir;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Participant Required Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getParticipantRequiredEnum()
 * @model extendedMetaData="name='ParticipantRequiredEnum'"
 * @generated
 */
public enum ParticipantRequiredEnum implements Enumerator {
	/**
	 * The '<em><b>Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required
	 * <!-- end-model-doc -->
	 * @see #REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRED(0, "required", "required"),

	/**
	 * The '<em><b>Optional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional
	 * <!-- end-model-doc -->
	 * @see #OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONAL(1, "optional", "optional"),

	/**
	 * The '<em><b>Information Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information Only
	 * <!-- end-model-doc -->
	 * @see #INFORMATION_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION_ONLY(2, "informationOnly", "information-only");

	/**
	 * The '<em><b>Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required
	 * <!-- end-model-doc -->
	 * @see #REQUIRED
	 * @model name="required"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED_VALUE = 0;

	/**
	 * The '<em><b>Optional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional
	 * <!-- end-model-doc -->
	 * @see #OPTIONAL
	 * @model name="optional"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL_VALUE = 1;

	/**
	 * The '<em><b>Information Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information Only
	 * <!-- end-model-doc -->
	 * @see #INFORMATION_ONLY
	 * @model name="informationOnly" literal="information-only"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION_ONLY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Participant Required Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParticipantRequiredEnum[] VALUES_ARRAY =
		new ParticipantRequiredEnum[] {
			REQUIRED,
			OPTIONAL,
			INFORMATION_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Participant Required Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParticipantRequiredEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Participant Required Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipantRequiredEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipantRequiredEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participant Required Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipantRequiredEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipantRequiredEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participant Required Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipantRequiredEnum get(int value) {
		switch (value) {
			case REQUIRED_VALUE: return REQUIRED;
			case OPTIONAL_VALUE: return OPTIONAL;
			case INFORMATION_ONLY_VALUE: return INFORMATION_ONLY;
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
	private ParticipantRequiredEnum(int value, String name, String literal) {
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
	
} //ParticipantRequiredEnum

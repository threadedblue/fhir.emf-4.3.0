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
 * A representation of the literals of the enumeration '<em><b>Observation Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getObservationStatusEnum()
 * @model extendedMetaData="name='ObservationStatusEnum'"
 * @generated
 */
public enum ObservationStatusEnum implements Enumerator {
	/**
	 * The '<em><b>Registered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Registered
	 * <!-- end-model-doc -->
	 * @see #REGISTERED_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTERED(0, "registered", "registered"),

	/**
	 * The '<em><b>Preliminary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preliminary
	 * <!-- end-model-doc -->
	 * @see #PRELIMINARY_VALUE
	 * @generated
	 * @ordered
	 */
	PRELIMINARY(1, "preliminary", "preliminary"),

	/**
	 * The '<em><b>Final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Final
	 * <!-- end-model-doc -->
	 * @see #FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	FINAL(2, "final", "final"),

	/**
	 * The '<em><b>Amended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amended
	 * <!-- end-model-doc -->
	 * @see #AMENDED_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDED(3, "amended", "amended"),

	/**
	 * The '<em><b>Corrected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Corrected
	 * <!-- end-model-doc -->
	 * @see #CORRECTED_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTED(4, "corrected", "corrected"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(5, "cancelled", "cancelled"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(6, "enteredInError", "entered-in-error"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(7, "unknown", "unknown");

	/**
	 * The '<em><b>Registered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Registered
	 * <!-- end-model-doc -->
	 * @see #REGISTERED
	 * @model name="registered"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTERED_VALUE = 0;

	/**
	 * The '<em><b>Preliminary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preliminary
	 * <!-- end-model-doc -->
	 * @see #PRELIMINARY
	 * @model name="preliminary"
	 * @generated
	 * @ordered
	 */
	public static final int PRELIMINARY_VALUE = 1;

	/**
	 * The '<em><b>Final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Final
	 * <!-- end-model-doc -->
	 * @see #FINAL
	 * @model name="final"
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_VALUE = 2;

	/**
	 * The '<em><b>Amended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amended
	 * <!-- end-model-doc -->
	 * @see #AMENDED
	 * @model name="amended"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDED_VALUE = 3;

	/**
	 * The '<em><b>Corrected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Corrected
	 * <!-- end-model-doc -->
	 * @see #CORRECTED
	 * @model name="corrected"
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTED_VALUE = 4;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 5;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 6;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 7;

	/**
	 * An array of all the '<em><b>Observation Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObservationStatusEnum[] VALUES_ARRAY =
		new ObservationStatusEnum[] {
			REGISTERED,
			PRELIMINARY,
			FINAL,
			AMENDED,
			CORRECTED,
			CANCELLED,
			ENTERED_IN_ERROR,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Observation Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObservationStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Observation Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationStatusEnum get(int value) {
		switch (value) {
			case REGISTERED_VALUE: return REGISTERED;
			case PRELIMINARY_VALUE: return PRELIMINARY;
			case FINAL_VALUE: return FINAL;
			case AMENDED_VALUE: return AMENDED;
			case CORRECTED_VALUE: return CORRECTED;
			case CANCELLED_VALUE: return CANCELLED;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private ObservationStatusEnum(int value, String name, String literal) {
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
	
} //ObservationStatusEnum

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
 * A representation of the literals of the enumeration '<em><b>Request Priority Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getRequestPriorityEnum()
 * @model extendedMetaData="name='RequestPriorityEnum'"
 * @generated
 */
public enum RequestPriorityEnum implements Enumerator {
	/**
	 * The '<em><b>Routine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Routine
	 * <!-- end-model-doc -->
	 * @see #ROUTINE_VALUE
	 * @generated
	 * @ordered
	 */
	ROUTINE(0, "routine", "routine"),

	/**
	 * The '<em><b>Urgent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Urgent
	 * <!-- end-model-doc -->
	 * @see #URGENT_VALUE
	 * @generated
	 * @ordered
	 */
	URGENT(1, "urgent", "urgent"),

	/**
	 * The '<em><b>Asap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ASAP
	 * <!-- end-model-doc -->
	 * @see #ASAP_VALUE
	 * @generated
	 * @ordered
	 */
	ASAP(2, "asap", "asap"),

	/**
	 * The '<em><b>Stat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * STAT
	 * <!-- end-model-doc -->
	 * @see #STAT_VALUE
	 * @generated
	 * @ordered
	 */
	STAT(3, "stat", "stat");

	/**
	 * The '<em><b>Routine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Routine
	 * <!-- end-model-doc -->
	 * @see #ROUTINE
	 * @model name="routine"
	 * @generated
	 * @ordered
	 */
	public static final int ROUTINE_VALUE = 0;

	/**
	 * The '<em><b>Urgent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Urgent
	 * <!-- end-model-doc -->
	 * @see #URGENT
	 * @model name="urgent"
	 * @generated
	 * @ordered
	 */
	public static final int URGENT_VALUE = 1;

	/**
	 * The '<em><b>Asap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ASAP
	 * <!-- end-model-doc -->
	 * @see #ASAP
	 * @model name="asap"
	 * @generated
	 * @ordered
	 */
	public static final int ASAP_VALUE = 2;

	/**
	 * The '<em><b>Stat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * STAT
	 * <!-- end-model-doc -->
	 * @see #STAT
	 * @model name="stat"
	 * @generated
	 * @ordered
	 */
	public static final int STAT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Request Priority Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequestPriorityEnum[] VALUES_ARRAY =
		new RequestPriorityEnum[] {
			ROUTINE,
			URGENT,
			ASAP,
			STAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Request Priority Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequestPriorityEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Request Priority Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequestPriorityEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequestPriorityEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request Priority Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequestPriorityEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequestPriorityEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request Priority Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequestPriorityEnum get(int value) {
		switch (value) {
			case ROUTINE_VALUE: return ROUTINE;
			case URGENT_VALUE: return URGENT;
			case ASAP_VALUE: return ASAP;
			case STAT_VALUE: return STAT;
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
	private RequestPriorityEnum(int value, String name, String literal) {
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
	
} //RequestPriorityEnum

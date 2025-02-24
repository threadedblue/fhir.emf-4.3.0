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
 * A representation of the literals of the enumeration '<em><b>Graph Compartment Use Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getGraphCompartmentUseEnum()
 * @model extendedMetaData="name='GraphCompartmentUseEnum'"
 * @generated
 */
public enum GraphCompartmentUseEnum implements Enumerator {
	/**
	 * The '<em><b>Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition
	 * <!-- end-model-doc -->
	 * @see #CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITION(0, "condition", "condition"),

	/**
	 * The '<em><b>Requirement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirement
	 * <!-- end-model-doc -->
	 * @see #REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREMENT(1, "requirement", "requirement");

	/**
	 * The '<em><b>Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition
	 * <!-- end-model-doc -->
	 * @see #CONDITION
	 * @model name="condition"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_VALUE = 0;

	/**
	 * The '<em><b>Requirement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirement
	 * <!-- end-model-doc -->
	 * @see #REQUIREMENT
	 * @model name="requirement"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Graph Compartment Use Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GraphCompartmentUseEnum[] VALUES_ARRAY =
		new GraphCompartmentUseEnum[] {
			CONDITION,
			REQUIREMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Graph Compartment Use Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GraphCompartmentUseEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Graph Compartment Use Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GraphCompartmentUseEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GraphCompartmentUseEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Graph Compartment Use Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GraphCompartmentUseEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GraphCompartmentUseEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Graph Compartment Use Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GraphCompartmentUseEnum get(int value) {
		switch (value) {
			case CONDITION_VALUE: return CONDITION;
			case REQUIREMENT_VALUE: return REQUIREMENT;
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
	private GraphCompartmentUseEnum(int value, String name, String literal) {
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
	
} //GraphCompartmentUseEnum

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
 * A representation of the literals of the enumeration '<em><b>Concept Map Equivalence Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getConceptMapEquivalenceEnum()
 * @model extendedMetaData="name='ConceptMapEquivalenceEnum'"
 * @generated
 */
public enum ConceptMapEquivalenceEnum implements Enumerator {
	/**
	 * The '<em><b>Relatedto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related To
	 * <!-- end-model-doc -->
	 * @see #RELATEDTO_VALUE
	 * @generated
	 * @ordered
	 */
	RELATEDTO(0, "relatedto", "relatedto"),

	/**
	 * The '<em><b>Equivalent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equivalent
	 * <!-- end-model-doc -->
	 * @see #EQUIVALENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIVALENT(1, "equivalent", "equivalent"),

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equal
	 * <!-- end-model-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(2, "equal", "equal"),

	/**
	 * The '<em><b>Wider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wider
	 * <!-- end-model-doc -->
	 * @see #WIDER_VALUE
	 * @generated
	 * @ordered
	 */
	WIDER(3, "wider", "wider"),

	/**
	 * The '<em><b>Subsumes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subsumes
	 * <!-- end-model-doc -->
	 * @see #SUBSUMES_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSUMES(4, "subsumes", "subsumes"),

	/**
	 * The '<em><b>Narrower</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Narrower
	 * <!-- end-model-doc -->
	 * @see #NARROWER_VALUE
	 * @generated
	 * @ordered
	 */
	NARROWER(5, "narrower", "narrower"),

	/**
	 * The '<em><b>Specializes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specializes
	 * <!-- end-model-doc -->
	 * @see #SPECIALIZES_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIALIZES(6, "specializes", "specializes"),

	/**
	 * The '<em><b>Inexact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inexact
	 * <!-- end-model-doc -->
	 * @see #INEXACT_VALUE
	 * @generated
	 * @ordered
	 */
	INEXACT(7, "inexact", "inexact"),

	/**
	 * The '<em><b>Unmatched</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unmatched
	 * <!-- end-model-doc -->
	 * @see #UNMATCHED_VALUE
	 * @generated
	 * @ordered
	 */
	UNMATCHED(8, "unmatched", "unmatched"),

	/**
	 * The '<em><b>Disjoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disjoint
	 * <!-- end-model-doc -->
	 * @see #DISJOINT_VALUE
	 * @generated
	 * @ordered
	 */
	DISJOINT(9, "disjoint", "disjoint");

	/**
	 * The '<em><b>Relatedto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related To
	 * <!-- end-model-doc -->
	 * @see #RELATEDTO
	 * @model name="relatedto"
	 * @generated
	 * @ordered
	 */
	public static final int RELATEDTO_VALUE = 0;

	/**
	 * The '<em><b>Equivalent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equivalent
	 * <!-- end-model-doc -->
	 * @see #EQUIVALENT
	 * @model name="equivalent"
	 * @generated
	 * @ordered
	 */
	public static final int EQUIVALENT_VALUE = 1;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equal
	 * <!-- end-model-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 2;

	/**
	 * The '<em><b>Wider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wider
	 * <!-- end-model-doc -->
	 * @see #WIDER
	 * @model name="wider"
	 * @generated
	 * @ordered
	 */
	public static final int WIDER_VALUE = 3;

	/**
	 * The '<em><b>Subsumes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subsumes
	 * <!-- end-model-doc -->
	 * @see #SUBSUMES
	 * @model name="subsumes"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSUMES_VALUE = 4;

	/**
	 * The '<em><b>Narrower</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Narrower
	 * <!-- end-model-doc -->
	 * @see #NARROWER
	 * @model name="narrower"
	 * @generated
	 * @ordered
	 */
	public static final int NARROWER_VALUE = 5;

	/**
	 * The '<em><b>Specializes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specializes
	 * <!-- end-model-doc -->
	 * @see #SPECIALIZES
	 * @model name="specializes"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIALIZES_VALUE = 6;

	/**
	 * The '<em><b>Inexact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inexact
	 * <!-- end-model-doc -->
	 * @see #INEXACT
	 * @model name="inexact"
	 * @generated
	 * @ordered
	 */
	public static final int INEXACT_VALUE = 7;

	/**
	 * The '<em><b>Unmatched</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unmatched
	 * <!-- end-model-doc -->
	 * @see #UNMATCHED
	 * @model name="unmatched"
	 * @generated
	 * @ordered
	 */
	public static final int UNMATCHED_VALUE = 8;

	/**
	 * The '<em><b>Disjoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disjoint
	 * <!-- end-model-doc -->
	 * @see #DISJOINT
	 * @model name="disjoint"
	 * @generated
	 * @ordered
	 */
	public static final int DISJOINT_VALUE = 9;

	/**
	 * An array of all the '<em><b>Concept Map Equivalence Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConceptMapEquivalenceEnum[] VALUES_ARRAY =
		new ConceptMapEquivalenceEnum[] {
			RELATEDTO,
			EQUIVALENT,
			EQUAL,
			WIDER,
			SUBSUMES,
			NARROWER,
			SPECIALIZES,
			INEXACT,
			UNMATCHED,
			DISJOINT,
		};

	/**
	 * A public read-only list of all the '<em><b>Concept Map Equivalence Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConceptMapEquivalenceEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Concept Map Equivalence Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapEquivalenceEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptMapEquivalenceEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Map Equivalence Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapEquivalenceEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptMapEquivalenceEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Map Equivalence Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapEquivalenceEnum get(int value) {
		switch (value) {
			case RELATEDTO_VALUE: return RELATEDTO;
			case EQUIVALENT_VALUE: return EQUIVALENT;
			case EQUAL_VALUE: return EQUAL;
			case WIDER_VALUE: return WIDER;
			case SUBSUMES_VALUE: return SUBSUMES;
			case NARROWER_VALUE: return NARROWER;
			case SPECIALIZES_VALUE: return SPECIALIZES;
			case INEXACT_VALUE: return INEXACT;
			case UNMATCHED_VALUE: return UNMATCHED;
			case DISJOINT_VALUE: return DISJOINT;
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
	private ConceptMapEquivalenceEnum(int value, String name, String literal) {
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
	
} //ConceptMapEquivalenceEnum

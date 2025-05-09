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
 * A representation of the literals of the enumeration '<em><b>Type Restful Interaction Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getTypeRestfulInteractionEnum()
 * @model extendedMetaData="name='TypeRestfulInteractionEnum'"
 * @generated
 */
public enum TypeRestfulInteractionEnum implements Enumerator {
	/**
	 * The '<em><b>Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * read
	 * <!-- end-model-doc -->
	 * @see #READ_VALUE
	 * @generated
	 * @ordered
	 */
	READ(0, "read", "read"),

	/**
	 * The '<em><b>Vread</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * vread
	 * <!-- end-model-doc -->
	 * @see #VREAD_VALUE
	 * @generated
	 * @ordered
	 */
	VREAD(1, "vread", "vread"),

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * update
	 * <!-- end-model-doc -->
	 * @see #UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE(2, "update", "update"),

	/**
	 * The '<em><b>Patch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * patch
	 * <!-- end-model-doc -->
	 * @see #PATCH_VALUE
	 * @generated
	 * @ordered
	 */
	PATCH(3, "patch", "patch"),

	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * delete
	 * <!-- end-model-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(4, "delete", "delete"),

	/**
	 * The '<em><b>History Instance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * history-instance
	 * <!-- end-model-doc -->
	 * @see #HISTORY_INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORY_INSTANCE(5, "historyInstance", "history-instance"),

	/**
	 * The '<em><b>History Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * history-type
	 * <!-- end-model-doc -->
	 * @see #HISTORY_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORY_TYPE(6, "historyType", "history-type"),

	/**
	 * The '<em><b>Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * create
	 * <!-- end-model-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(7, "create", "create"),

	/**
	 * The '<em><b>Search Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * search-type
	 * <!-- end-model-doc -->
	 * @see #SEARCH_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH_TYPE(8, "searchType", "search-type");

	/**
	 * The '<em><b>Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * read
	 * <!-- end-model-doc -->
	 * @see #READ
	 * @model name="read"
	 * @generated
	 * @ordered
	 */
	public static final int READ_VALUE = 0;

	/**
	 * The '<em><b>Vread</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * vread
	 * <!-- end-model-doc -->
	 * @see #VREAD
	 * @model name="vread"
	 * @generated
	 * @ordered
	 */
	public static final int VREAD_VALUE = 1;

	/**
	 * The '<em><b>Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * update
	 * <!-- end-model-doc -->
	 * @see #UPDATE
	 * @model name="update"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_VALUE = 2;

	/**
	 * The '<em><b>Patch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * patch
	 * <!-- end-model-doc -->
	 * @see #PATCH
	 * @model name="patch"
	 * @generated
	 * @ordered
	 */
	public static final int PATCH_VALUE = 3;

	/**
	 * The '<em><b>Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * delete
	 * <!-- end-model-doc -->
	 * @see #DELETE
	 * @model name="delete"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 4;

	/**
	 * The '<em><b>History Instance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * history-instance
	 * <!-- end-model-doc -->
	 * @see #HISTORY_INSTANCE
	 * @model name="historyInstance" literal="history-instance"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORY_INSTANCE_VALUE = 5;

	/**
	 * The '<em><b>History Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * history-type
	 * <!-- end-model-doc -->
	 * @see #HISTORY_TYPE
	 * @model name="historyType" literal="history-type"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORY_TYPE_VALUE = 6;

	/**
	 * The '<em><b>Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * create
	 * <!-- end-model-doc -->
	 * @see #CREATE
	 * @model name="create"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 7;

	/**
	 * The '<em><b>Search Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * search-type
	 * <!-- end-model-doc -->
	 * @see #SEARCH_TYPE
	 * @model name="searchType" literal="search-type"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_TYPE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Type Restful Interaction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeRestfulInteractionEnum[] VALUES_ARRAY =
		new TypeRestfulInteractionEnum[] {
			READ,
			VREAD,
			UPDATE,
			PATCH,
			DELETE,
			HISTORY_INSTANCE,
			HISTORY_TYPE,
			CREATE,
			SEARCH_TYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Restful Interaction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeRestfulInteractionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Restful Interaction Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeRestfulInteractionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeRestfulInteractionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Restful Interaction Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeRestfulInteractionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeRestfulInteractionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Restful Interaction Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeRestfulInteractionEnum get(int value) {
		switch (value) {
			case READ_VALUE: return READ;
			case VREAD_VALUE: return VREAD;
			case UPDATE_VALUE: return UPDATE;
			case PATCH_VALUE: return PATCH;
			case DELETE_VALUE: return DELETE;
			case HISTORY_INSTANCE_VALUE: return HISTORY_INSTANCE;
			case HISTORY_TYPE_VALUE: return HISTORY_TYPE;
			case CREATE_VALUE: return CREATE;
			case SEARCH_TYPE_VALUE: return SEARCH_TYPE;
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
	private TypeRestfulInteractionEnum(int value, String name, String literal) {
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
	
} //TypeRestfulInteractionEnum

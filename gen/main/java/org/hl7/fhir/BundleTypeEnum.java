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
 * A representation of the literals of the enumeration '<em><b>Bundle Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getBundleTypeEnum()
 * @model extendedMetaData="name='BundleTypeEnum'"
 * @generated
 */
public enum BundleTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT(0, "document", "document"),

	/**
	 * The '<em><b>Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Message
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE(1, "message", "message"),

	/**
	 * The '<em><b>Transaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transaction
	 * <!-- end-model-doc -->
	 * @see #TRANSACTION_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION(2, "transaction", "transaction"),

	/**
	 * The '<em><b>Transaction Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transaction Response
	 * <!-- end-model-doc -->
	 * @see #TRANSACTION_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_RESPONSE(3, "transactionResponse", "transaction-response"),

	/**
	 * The '<em><b>Batch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Batch
	 * <!-- end-model-doc -->
	 * @see #BATCH_VALUE
	 * @generated
	 * @ordered
	 */
	BATCH(4, "batch", "batch"),

	/**
	 * The '<em><b>Batch Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Batch Response
	 * <!-- end-model-doc -->
	 * @see #BATCH_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	BATCH_RESPONSE(5, "batchResponse", "batch-response"),

	/**
	 * The '<em><b>History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * History List
	 * <!-- end-model-doc -->
	 * @see #HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORY(6, "history", "history"),

	/**
	 * The '<em><b>Searchset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search Results
	 * <!-- end-model-doc -->
	 * @see #SEARCHSET_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCHSET(7, "searchset", "searchset"),

	/**
	 * The '<em><b>Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collection
	 * <!-- end-model-doc -->
	 * @see #COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION(8, "collection", "collection");

	/**
	 * The '<em><b>Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT
	 * @model name="document"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_VALUE = 0;

	/**
	 * The '<em><b>Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Message
	 * <!-- end-model-doc -->
	 * @see #MESSAGE
	 * @model name="message"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_VALUE = 1;

	/**
	 * The '<em><b>Transaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transaction
	 * <!-- end-model-doc -->
	 * @see #TRANSACTION
	 * @model name="transaction"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_VALUE = 2;

	/**
	 * The '<em><b>Transaction Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transaction Response
	 * <!-- end-model-doc -->
	 * @see #TRANSACTION_RESPONSE
	 * @model name="transactionResponse" literal="transaction-response"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_RESPONSE_VALUE = 3;

	/**
	 * The '<em><b>Batch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Batch
	 * <!-- end-model-doc -->
	 * @see #BATCH
	 * @model name="batch"
	 * @generated
	 * @ordered
	 */
	public static final int BATCH_VALUE = 4;

	/**
	 * The '<em><b>Batch Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Batch Response
	 * <!-- end-model-doc -->
	 * @see #BATCH_RESPONSE
	 * @model name="batchResponse" literal="batch-response"
	 * @generated
	 * @ordered
	 */
	public static final int BATCH_RESPONSE_VALUE = 5;

	/**
	 * The '<em><b>History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * History List
	 * <!-- end-model-doc -->
	 * @see #HISTORY
	 * @model name="history"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORY_VALUE = 6;

	/**
	 * The '<em><b>Searchset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search Results
	 * <!-- end-model-doc -->
	 * @see #SEARCHSET
	 * @model name="searchset"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCHSET_VALUE = 7;

	/**
	 * The '<em><b>Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collection
	 * <!-- end-model-doc -->
	 * @see #COLLECTION
	 * @model name="collection"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_VALUE = 8;

	/**
	 * An array of all the '<em><b>Bundle Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BundleTypeEnum[] VALUES_ARRAY =
		new BundleTypeEnum[] {
			DOCUMENT,
			MESSAGE,
			TRANSACTION,
			TRANSACTION_RESPONSE,
			BATCH,
			BATCH_RESPONSE,
			HISTORY,
			SEARCHSET,
			COLLECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Bundle Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BundleTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bundle Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BundleTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BundleTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bundle Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BundleTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BundleTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bundle Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BundleTypeEnum get(int value) {
		switch (value) {
			case DOCUMENT_VALUE: return DOCUMENT;
			case MESSAGE_VALUE: return MESSAGE;
			case TRANSACTION_VALUE: return TRANSACTION;
			case TRANSACTION_RESPONSE_VALUE: return TRANSACTION_RESPONSE;
			case BATCH_VALUE: return BATCH;
			case BATCH_RESPONSE_VALUE: return BATCH_RESPONSE;
			case HISTORY_VALUE: return HISTORY;
			case SEARCHSET_VALUE: return SEARCHSET;
			case COLLECTION_VALUE: return COLLECTION;
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
	private BundleTypeEnum(int value, String name, String literal) {
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
	
} //BundleTypeEnum

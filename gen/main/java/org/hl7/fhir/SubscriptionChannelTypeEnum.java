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
 * A representation of the literals of the enumeration '<em><b>Subscription Channel Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSubscriptionChannelTypeEnum()
 * @model extendedMetaData="name='SubscriptionChannelTypeEnum'"
 * @generated
 */
public enum SubscriptionChannelTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Rest Hook</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rest Hook
	 * <!-- end-model-doc -->
	 * @see #REST_HOOK_VALUE
	 * @generated
	 * @ordered
	 */
	REST_HOOK(0, "restHook", "rest-hook"),

	/**
	 * The '<em><b>Websocket</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Websocket
	 * <!-- end-model-doc -->
	 * @see #WEBSOCKET_VALUE
	 * @generated
	 * @ordered
	 */
	WEBSOCKET(1, "websocket", "websocket"),

	/**
	 * The '<em><b>Email</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Email
	 * <!-- end-model-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(2, "email", "email"),

	/**
	 * The '<em><b>Sms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SMS
	 * <!-- end-model-doc -->
	 * @see #SMS_VALUE
	 * @generated
	 * @ordered
	 */
	SMS(3, "sms", "sms"),

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
	MESSAGE(4, "message", "message");

	/**
	 * The '<em><b>Rest Hook</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rest Hook
	 * <!-- end-model-doc -->
	 * @see #REST_HOOK
	 * @model name="restHook" literal="rest-hook"
	 * @generated
	 * @ordered
	 */
	public static final int REST_HOOK_VALUE = 0;

	/**
	 * The '<em><b>Websocket</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Websocket
	 * <!-- end-model-doc -->
	 * @see #WEBSOCKET
	 * @model name="websocket"
	 * @generated
	 * @ordered
	 */
	public static final int WEBSOCKET_VALUE = 1;

	/**
	 * The '<em><b>Email</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Email
	 * <!-- end-model-doc -->
	 * @see #EMAIL
	 * @model name="email"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 2;

	/**
	 * The '<em><b>Sms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SMS
	 * <!-- end-model-doc -->
	 * @see #SMS
	 * @model name="sms"
	 * @generated
	 * @ordered
	 */
	public static final int SMS_VALUE = 3;

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
	public static final int MESSAGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Subscription Channel Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubscriptionChannelTypeEnum[] VALUES_ARRAY =
		new SubscriptionChannelTypeEnum[] {
			REST_HOOK,
			WEBSOCKET,
			EMAIL,
			SMS,
			MESSAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Subscription Channel Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubscriptionChannelTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Subscription Channel Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionChannelTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubscriptionChannelTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Subscription Channel Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionChannelTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubscriptionChannelTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Subscription Channel Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionChannelTypeEnum get(int value) {
		switch (value) {
			case REST_HOOK_VALUE: return REST_HOOK;
			case WEBSOCKET_VALUE: return WEBSOCKET;
			case EMAIL_VALUE: return EMAIL;
			case SMS_VALUE: return SMS;
			case MESSAGE_VALUE: return MESSAGE;
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
	private SubscriptionChannelTypeEnum(int value, String name, String literal) {
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
	
} //SubscriptionChannelTypeEnum

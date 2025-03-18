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
 * A representation of the literals of the enumeration '<em><b>Expression Language Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getExpressionLanguageEnum()
 * @model extendedMetaData="name='ExpressionLanguageEnum'"
 * @generated
 */
public enum ExpressionLanguageEnum implements Enumerator {
	/**
	 * The '<em><b>Text Cql</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CQL
	 * <!-- end-model-doc -->
	 * @see #TEXT_CQL_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_CQL(0, "textCql", "text/cql"),

	/**
	 * The '<em><b>Text Fhirpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIRPath
	 * <!-- end-model-doc -->
	 * @see #TEXT_FHIRPATH_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_FHIRPATH(1, "textFhirpath", "text/fhirpath"),

	/**
	 * The '<em><b>Application XFhir Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIR Query
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_XFHIR_QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_XFHIR_QUERY(2, "applicationXFhirQuery", "application/x-fhir-query"),

	/**
	 * The '<em><b>Text Cql Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CQL Identifier
	 * <!-- end-model-doc -->
	 * @see #TEXT_CQL_IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_CQL_IDENTIFIER(3, "textCqlIdentifier", "text/cql-identifier"),

	/**
	 * The '<em><b>Text Cql Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CQL Expression
	 * <!-- end-model-doc -->
	 * @see #TEXT_CQL_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_CQL_EXPRESSION(4, "textCqlExpression", "text/cql-expression");

	/**
	 * The '<em><b>Text Cql</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CQL
	 * <!-- end-model-doc -->
	 * @see #TEXT_CQL
	 * @model name="textCql" literal="text/cql"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_CQL_VALUE = 0;

	/**
	 * The '<em><b>Text Fhirpath</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIRPath
	 * <!-- end-model-doc -->
	 * @see #TEXT_FHIRPATH
	 * @model name="textFhirpath" literal="text/fhirpath"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_FHIRPATH_VALUE = 1;

	/**
	 * The '<em><b>Application XFhir Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIR Query
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_XFHIR_QUERY
	 * @model name="applicationXFhirQuery" literal="application/x-fhir-query"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_XFHIR_QUERY_VALUE = 2;

	/**
	 * The '<em><b>Text Cql Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CQL Identifier
	 * <!-- end-model-doc -->
	 * @see #TEXT_CQL_IDENTIFIER
	 * @model name="textCqlIdentifier" literal="text/cql-identifier"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_CQL_IDENTIFIER_VALUE = 3;

	/**
	 * The '<em><b>Text Cql Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CQL Expression
	 * <!-- end-model-doc -->
	 * @see #TEXT_CQL_EXPRESSION
	 * @model name="textCqlExpression" literal="text/cql-expression"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_CQL_EXPRESSION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Expression Language Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExpressionLanguageEnum[] VALUES_ARRAY =
		new ExpressionLanguageEnum[] {
			TEXT_CQL,
			TEXT_FHIRPATH,
			APPLICATION_XFHIR_QUERY,
			TEXT_CQL_IDENTIFIER,
			TEXT_CQL_EXPRESSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Expression Language Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExpressionLanguageEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expression Language Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionLanguageEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionLanguageEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Language Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionLanguageEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionLanguageEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Language Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionLanguageEnum get(int value) {
		switch (value) {
			case TEXT_CQL_VALUE: return TEXT_CQL;
			case TEXT_FHIRPATH_VALUE: return TEXT_FHIRPATH;
			case APPLICATION_XFHIR_QUERY_VALUE: return APPLICATION_XFHIR_QUERY;
			case TEXT_CQL_IDENTIFIER_VALUE: return TEXT_CQL_IDENTIFIER;
			case TEXT_CQL_EXPRESSION_VALUE: return TEXT_CQL_EXPRESSION;
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
	private ExpressionLanguageEnum(int value, String name, String literal) {
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
	
} //ExpressionLanguageEnum

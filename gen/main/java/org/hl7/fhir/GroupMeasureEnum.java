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
 * A representation of the literals of the enumeration '<em><b>Group Measure Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getGroupMeasureEnum()
 * @model extendedMetaData="name='GroupMeasureEnum'"
 * @generated
 */
public enum GroupMeasureEnum implements Enumerator {
	/**
	 * The '<em><b>Mean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mean
	 * <!-- end-model-doc -->
	 * @see #MEAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEAN(0, "mean", "mean"),

	/**
	 * The '<em><b>Median</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Median
	 * <!-- end-model-doc -->
	 * @see #MEDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIAN(1, "median", "median"),

	/**
	 * The '<em><b>Mean Of Mean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mean of Study Means
	 * <!-- end-model-doc -->
	 * @see #MEAN_OF_MEAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEAN_OF_MEAN(2, "meanOfMean", "mean-of-mean"),

	/**
	 * The '<em><b>Mean Of Median</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mean of Study Medins
	 * <!-- end-model-doc -->
	 * @see #MEAN_OF_MEDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEAN_OF_MEDIAN(3, "meanOfMedian", "mean-of-median"),

	/**
	 * The '<em><b>Median Of Mean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Median of Study Means
	 * <!-- end-model-doc -->
	 * @see #MEDIAN_OF_MEAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIAN_OF_MEAN(4, "medianOfMean", "median-of-mean"),

	/**
	 * The '<em><b>Median Of Median</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Median of Study Medians
	 * <!-- end-model-doc -->
	 * @see #MEDIAN_OF_MEDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIAN_OF_MEDIAN(5, "medianOfMedian", "median-of-median");

	/**
	 * The '<em><b>Mean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mean
	 * <!-- end-model-doc -->
	 * @see #MEAN
	 * @model name="mean"
	 * @generated
	 * @ordered
	 */
	public static final int MEAN_VALUE = 0;

	/**
	 * The '<em><b>Median</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Median
	 * <!-- end-model-doc -->
	 * @see #MEDIAN
	 * @model name="median"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIAN_VALUE = 1;

	/**
	 * The '<em><b>Mean Of Mean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mean of Study Means
	 * <!-- end-model-doc -->
	 * @see #MEAN_OF_MEAN
	 * @model name="meanOfMean" literal="mean-of-mean"
	 * @generated
	 * @ordered
	 */
	public static final int MEAN_OF_MEAN_VALUE = 2;

	/**
	 * The '<em><b>Mean Of Median</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mean of Study Medins
	 * <!-- end-model-doc -->
	 * @see #MEAN_OF_MEDIAN
	 * @model name="meanOfMedian" literal="mean-of-median"
	 * @generated
	 * @ordered
	 */
	public static final int MEAN_OF_MEDIAN_VALUE = 3;

	/**
	 * The '<em><b>Median Of Mean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Median of Study Means
	 * <!-- end-model-doc -->
	 * @see #MEDIAN_OF_MEAN
	 * @model name="medianOfMean" literal="median-of-mean"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIAN_OF_MEAN_VALUE = 4;

	/**
	 * The '<em><b>Median Of Median</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Median of Study Medians
	 * <!-- end-model-doc -->
	 * @see #MEDIAN_OF_MEDIAN
	 * @model name="medianOfMedian" literal="median-of-median"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIAN_OF_MEDIAN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Group Measure Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GroupMeasureEnum[] VALUES_ARRAY =
		new GroupMeasureEnum[] {
			MEAN,
			MEDIAN,
			MEAN_OF_MEAN,
			MEAN_OF_MEDIAN,
			MEDIAN_OF_MEAN,
			MEDIAN_OF_MEDIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Group Measure Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GroupMeasureEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Group Measure Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupMeasureEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupMeasureEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Measure Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupMeasureEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupMeasureEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Measure Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupMeasureEnum get(int value) {
		switch (value) {
			case MEAN_VALUE: return MEAN;
			case MEDIAN_VALUE: return MEDIAN;
			case MEAN_OF_MEAN_VALUE: return MEAN_OF_MEAN;
			case MEAN_OF_MEDIAN_VALUE: return MEAN_OF_MEDIAN;
			case MEDIAN_OF_MEAN_VALUE: return MEDIAN_OF_MEAN;
			case MEDIAN_OF_MEDIAN_VALUE: return MEDIAN_OF_MEDIAN;
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
	private GroupMeasureEnum(int value, String name, String literal) {
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
	
} //GroupMeasureEnum

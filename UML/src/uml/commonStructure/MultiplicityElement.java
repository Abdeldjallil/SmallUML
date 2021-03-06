/**
 */
package uml.commonStructure;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A multiplicity is a definition of an inclusive interval of non-negative integers beginning with a lower bound and ending with a (possibly infinite) upper bound. A MultiplicityElement embeds this information to specify the allowable cardinalities for an instantiation of the Element.
 * upperBound() >= lowerBound()
 * lowerBound() >= 0
 * lowerValue <> null implies lowerValue.integerValue() <> null
 * upperValue <> null implies upperValue.unlimitedValue() <> null
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.commonStructure.MultiplicityElement#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.commonStructure.MultiplicityElement#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.commonStructure.MultiplicityElement#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml.commonStructure.MultiplicityElement#getUpper <em>Upper</em>}</li>
 *   <li>{@link uml.commonStructure.MultiplicityElement#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getMultiplicityElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='upper_ge_lower lower_ge_0 value_specification_no_side_effects value_specification_constant lower_is_integer upper_is_unlimitedNatural'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL upper_ge_lower='upperBound() >= lowerBound()' lower_ge_0='lowerBound() >= 0' lower_is_integer='lowerValue <> null implies lowerValue.integerValue() <> null' upper_is_unlimitedNatural='upperValue <> null implies upperValue.unlimitedValue() <> null'"
 * @generated
 */
public interface MultiplicityElement extends Element {
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this MultiplicityElement are sequentially ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see uml.commonStructure.CommonStructurePackage#getMultiplicityElement_IsOrdered()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link uml.commonStructure.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a multivalued multiplicity, this attributes specifies whether the values in an instantiation of this MultiplicityElement are unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see uml.commonStructure.CommonStructurePackage#getMultiplicityElement_IsUnique()
	 * @model default="true" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link uml.commonStructure.MultiplicityElement#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower bound of the multiplicity interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see uml.commonStructure.CommonStructurePackage#getMultiplicityElement_Lower()
	 * @model dataType="types.Integer" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link uml.commonStructure.MultiplicityElement#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specification of the lower bound for this multiplicity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference.
	 * @see #setLowerValue(ValueSpecification)
	 * @see uml.commonStructure.CommonStructurePackage#getMultiplicityElement_LowerValue()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningLower'"
	 * @generated
	 */
	ValueSpecification getLowerValue();

	/**
	 * Sets the value of the '{@link uml.commonStructure.MultiplicityElement#getLowerValue <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' containment reference.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound of the multiplicity interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see uml.commonStructure.CommonStructurePackage#getMultiplicityElement_Upper()
	 * @model dataType="types.UnlimitedNatural" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link uml.commonStructure.MultiplicityElement#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specification of the upper bound for this multiplicity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference.
	 * @see #setUpperValue(ValueSpecification)
	 * @see uml.commonStructure.CommonStructurePackage#getMultiplicityElement_UpperValue()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningUpper'"
	 * @generated
	 */
	ValueSpecification getUpperValue();

	/**
	 * Sets the value of the '{@link uml.commonStructure.MultiplicityElement#getUpperValue <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' containment reference.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(ValueSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation compatibleWith takes another multiplicity as input. It returns true if the other multiplicity is wider than, or the same as, self.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" otherRequired="true" otherOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='(other.lowerBound() <= self.lowerBound()) and ((other.upperBound() = *) or (self.upperBound() <= other.upperBound()))'"
	 * @generated
	 */
	boolean compatibleWith(MultiplicityElement other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query includesMultiplicity() checks whether this multiplicity includes all the cardinalities allowed by the specified multiplicity.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" mRequired="true" mOrdered="false"
	 *        mAnnotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='M'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='(self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())'"
	 * @generated
	 */
	boolean includesMultiplicity(MultiplicityElement m);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation is determines if the upper and lower bound of the ranges are the ones given.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" lowerboundDataType="types.Integer" lowerboundRequired="true" lowerboundOrdered="false" upperboundDataType="types.UnlimitedNatural" upperboundRequired="true" upperboundOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='lowerbound = self.lowerBound() and upperbound = self.upperBound()'"
	 * @generated
	 */
	boolean is(int lowerbound, int upperbound);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isMultivalued() checks whether this multiplicity has an upper bound greater than one.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='upperBound() > 1'"
	 * @generated
	 */
	boolean isMultivalued();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived lower attribute must equal the lowerBound.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Integer" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='lowerBound()'"
	 * @generated
	 */
	int lower();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query lowerBound() returns the lower bound of the multiplicity as an integer, which is the integerValue of lowerValue, if this is given, and 1 otherwise.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Integer" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (lowerValue=null or lowerValue.integerValue()=null) then 1 else lowerValue.integerValue() endif'"
	 * @generated
	 */
	int lowerBound();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived upper attribute must equal the upperBound.
	 * <!-- end-model-doc -->
	 * @model dataType="types.UnlimitedNatural" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='upperBound()'"
	 * @generated
	 */
	int upper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query upperBound() returns the upper bound of the multiplicity for a bounded multiplicity as an unlimited natural, which is the unlimitedNaturalValue of upperValue, if given, and 1, otherwise.
	 * <!-- end-model-doc -->
	 * @model dataType="types.UnlimitedNatural" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (upperValue=null or upperValue.unlimitedValue()=null) then 1 else upperValue.unlimitedValue() endif'"
	 * @generated
	 */
	int upperBound();

} // MultiplicityElement

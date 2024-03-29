/******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Diagram</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Diagram#getMeasurementUnit <em>Measurement Unit</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Diagram#getPersistedEdges <em>Persisted Edges</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Diagram#getTransientEdges <em>Transient Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends View {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagram_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Measurement Unit</b></em>' attribute.
	 * The default value is <code>"Himetric"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.MeasurementUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Unit</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.MeasurementUnit
	 * @see #isSetMeasurementUnit()
	 * @see #unsetMeasurementUnit()
	 * @see #setMeasurementUnit(MeasurementUnit)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagram_MeasurementUnit()
	 * @model default="Himetric" unsettable="true"
	 * @generated
	 */
	MeasurementUnit getMeasurementUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Diagram#getMeasurementUnit <em>Measurement Unit</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Measurement Unit</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.MeasurementUnit
	 * @see #isSetMeasurementUnit()
	 * @see #unsetMeasurementUnit()
	 * @see #getMeasurementUnit()
	 * @generated
	 */
	void setMeasurementUnit(MeasurementUnit value);

	/**
	 * Unsets the value of the '{@link org.eclipse.gmf.runtime.notation.Diagram#getMeasurementUnit <em>Measurement Unit</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isSetMeasurementUnit()
	 * @see #getMeasurementUnit()
	 * @see #setMeasurementUnit(MeasurementUnit)
	 * @generated
	 */
	void unsetMeasurementUnit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.gmf.runtime.notation.Diagram#getMeasurementUnit <em>Measurement Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Measurement Unit</em>' attribute is set.
	 * @see #unsetMeasurementUnit()
	 * @see #getMeasurementUnit()
	 * @see #setMeasurementUnit(MeasurementUnit)
	 * @generated
	 */
	boolean isSetMeasurementUnit();

	/**
	 * Returns the value of the '<em><b>Persisted Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persisted Edges</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persisted Edges</em>' containment reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagram_PersistedEdges()
	 * @model type="org.eclipse.gmf.runtime.notation.Edge" containment="true"
	 * @generated
	 */
	EList getPersistedEdges();

	/**
	 * Returns the value of the '<em><b>Transient Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Edges</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Edges</em>' containment reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagram_TransientEdges()
	 * @model type="org.eclipse.gmf.runtime.notation.Edge" containment="true" transient="true"
	 * @generated
	 */
	EList getTransientEdges();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Edge createEdge(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' list. The list contents
	 * are of type {@link org.eclipse.gmf.runtime.notation.Edge}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Edges</em>' list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagram_Edges()
	 */
	EList getEdges();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to insert a persisted edge
	 * </p>
	 * 
	 * @param edge
	 *            the '<em>Edge</em>' to insert. <!-- end-user-doc -->
	 */
	void insertEdge(Edge edge);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to insert a persisted edge at a specific index
	 * </p>
	 * 
	 * @param edge
	 *            the '<em>Edge</em>' to insert.
	 * @param the
	 *            index of the child <!-- end-user-doc -->
	 */
	void insertEdgeAt(Edge edge, int index);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to insert a persisted or transient edge
	 * </p>
	 * 
	 * @param edge
	 *            the '<em>Edge</em>' to insert.
	 * @param persisted
	 *            , indicate if the Edge will be persisted or not <!--
	 *            end-user-doc -->
	 */
	void insertEdge(Edge edge, boolean persisted);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to persist all diagram's edges
	 * </p>
	 * <!-- end-user-doc -->
	 */
	void persistEdges();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to remove an edge form a diagram
	 * </p>
	 * 
	 * @param edge
	 *            the '<em>Edge</em>' to remove <!-- end-user-doc -->
	 */
	void removeEdge(Edge edge);
} // Diagram

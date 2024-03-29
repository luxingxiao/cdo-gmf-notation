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

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Guide#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Guide#getNodeMap <em>Node Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getGuide()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Guide extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getGuide_Position()
	 * @model default="0"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Guide#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Node Map</b></em>' map.
	 * The key is of type {@link org.eclipse.gmf.runtime.notation.Node},
	 * and the value is of type {@link org.eclipse.gmf.runtime.notation.Alignment},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Map</em>' map.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getGuide_NodeMap()
	 * @model mapType="org.eclipse.gmf.runtime.notation.NodeEntry" keyType="org.eclipse.gmf.runtime.notation.Node" valueType="org.eclipse.gmf.runtime.notation.Alignment"
	 * @generated
	 */
	EMap getNodeMap();

} // Guide

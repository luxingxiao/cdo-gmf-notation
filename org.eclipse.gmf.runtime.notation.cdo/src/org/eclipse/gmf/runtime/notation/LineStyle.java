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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.LineStyle#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.LineStyle#getLineWidth <em>Line Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getLineStyle()
 * @model
 * @generated
 */
public interface LineStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Line Color</b></em>' attribute.
	 * The default value is <code>"11579568"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Color</em>' attribute.
	 * @see #setLineColor(int)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getLineStyle_LineColor()
	 * @model default="11579568"
	 * @generated
	 */
	int getLineColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.LineStyle#getLineColor <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Color</em>' attribute.
	 * @see #getLineColor()
	 * @generated
	 */
	void setLineColor(int value);

	/**
	 * Returns the value of the '<em><b>Line Width</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Width</em>' attribute.
	 * @see #setLineWidth(int)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getLineStyle_LineWidth()
	 * @model default="-1"
	 * @generated
	 */
	int getLineWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.LineStyle#getLineWidth <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Width</em>' attribute.
	 * @see #getLineWidth()
	 * @generated
	 */
	void setLineWidth(int value);

} // LineStyle

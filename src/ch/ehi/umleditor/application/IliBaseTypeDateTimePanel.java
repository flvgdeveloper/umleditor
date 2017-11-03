/* This file is part of the umleditor project.
 * For more information, please see <http://www.interlis.ch>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package ch.ehi.umleditor.application;
<<<<<<< HEAD
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.softenvironment.view.*;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
import ch.softenvironment.util.*;

/**
 * @author ce
 * @version $Revision: 1.2 $ $Date: 2006-11-29 17:48:52 $
 */
public class IliBaseTypeDateTimePanel extends BasePanel implements DataPanel {
<<<<<<< HEAD
	private static java.util.ResourceBundle res = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/IliBaseTypeDateTimePanel");  //$NON-NLS-1$
=======
	
	private static final long serialVersionUID = 724362923662442412L;

	private static java.util.ResourceBundle res = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/IliBaseTypeDateTimePanel"); //$NON-NLS-1$
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

	private javax.swing.JLabel lblMin = null;
	private javax.swing.JLabel lblMax = null;
	private ch.ehi.umleditor.application.IliDateTimeValuePanel pnlMin = null;
	private ch.ehi.umleditor.application.IliDateTimeValuePanel pnlMax = null;
<<<<<<< HEAD
	/**
	 * This method initializes 
	 * 
=======

	/**
	 * This method initializes
	 *
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	 */
	public IliBaseTypeDateTimePanel() {
		super();
		initialize();
	}
<<<<<<< HEAD
	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
        java.awt.GridBagConstraints consGridBagConstraints2 = new java.awt.GridBagConstraints();
        java.awt.GridBagConstraints consGridBagConstraints1 = new java.awt.GridBagConstraints();
        java.awt.GridBagConstraints consGridBagConstraints4 = new java.awt.GridBagConstraints();
        java.awt.GridBagConstraints consGridBagConstraints3 = new java.awt.GridBagConstraints();
        consGridBagConstraints2.gridx = 1;
        consGridBagConstraints2.gridy = 2;
        consGridBagConstraints2.anchor = java.awt.GridBagConstraints.NORTHWEST;
        consGridBagConstraints2.insets = new java.awt.Insets(5,5,5,5);
        consGridBagConstraints1.gridx = 1;
        consGridBagConstraints1.gridy = 1;
        consGridBagConstraints1.insets = new java.awt.Insets(5,5,5,5);
        consGridBagConstraints1.anchor = java.awt.GridBagConstraints.NORTHWEST;
        consGridBagConstraints4.gridx = 2;
        consGridBagConstraints4.gridy = 2;
        consGridBagConstraints4.anchor = java.awt.GridBagConstraints.NORTHWEST;
        consGridBagConstraints3.gridx = 2;
        consGridBagConstraints3.gridy = 1;
        consGridBagConstraints3.insets = new java.awt.Insets(0,0,0,0);
        consGridBagConstraints3.anchor = java.awt.GridBagConstraints.NORTHWEST;
        this.setLayout(new java.awt.GridBagLayout());
        this.add(getLblMin(), consGridBagConstraints1);
        this.add(getLblMax(), consGridBagConstraints2);
        this.add(getPnlMin(), consGridBagConstraints3);
        this.add(getPnlMax(), consGridBagConstraints4);
			
	}
=======

	/**
	 * This method initializes this
	 *
	 * @return void
	 */
	private void initialize() {
		java.awt.GridBagConstraints consGridBagConstraints2 = new java.awt.GridBagConstraints();
		java.awt.GridBagConstraints consGridBagConstraints1 = new java.awt.GridBagConstraints();
		java.awt.GridBagConstraints consGridBagConstraints4 = new java.awt.GridBagConstraints();
		java.awt.GridBagConstraints consGridBagConstraints3 = new java.awt.GridBagConstraints();
		consGridBagConstraints2.gridx = 1;
		consGridBagConstraints2.gridy = 2;
		consGridBagConstraints2.anchor = java.awt.GridBagConstraints.NORTHWEST;
		consGridBagConstraints2.insets = new java.awt.Insets(5, 5, 5, 5);
		consGridBagConstraints1.gridx = 1;
		consGridBagConstraints1.gridy = 1;
		consGridBagConstraints1.insets = new java.awt.Insets(5, 5, 5, 5);
		consGridBagConstraints1.anchor = java.awt.GridBagConstraints.NORTHWEST;
		consGridBagConstraints4.gridx = 2;
		consGridBagConstraints4.gridy = 2;
		consGridBagConstraints4.anchor = java.awt.GridBagConstraints.NORTHWEST;
		consGridBagConstraints3.gridx = 2;
		consGridBagConstraints3.gridy = 1;
		consGridBagConstraints3.insets = new java.awt.Insets(0, 0, 0, 0);
		consGridBagConstraints3.anchor = java.awt.GridBagConstraints.NORTHWEST;
		this.setLayout(new java.awt.GridBagLayout());
		this.add(getLblMin(), consGridBagConstraints1);
		this.add(getLblMax(), consGridBagConstraints2);
		this.add(getPnlMin(), consGridBagConstraints3);
		this.add(getPnlMax(), consGridBagConstraints4);

	}

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	public Object getObject() {
		DateTimeType type = null;
		type = ElementFactory.createDateTimeType();
		// Range
<<<<<<< HEAD
		type.setMin((DateTimeValue)getPnlMin().getObject());
		type.setMax((DateTimeValue)getPnlMax().getObject());
=======
		type.setMin((DateTimeValue) getPnlMin().getObject());
		type.setMax((DateTimeValue) getPnlMax().getObject());
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		return type;
	}

	public void setObject(Object arg0) {
		throw new DeveloperException("call setObject(Object, ModelElement) instead");//$NON-NLS-1$
	}
<<<<<<< HEAD
	/**
	 * Set the Object to be displayed by panel.
	 */
	public void setObject(java.lang.Object object, ch.ehi.uml1_4.foundation.core.ModelElement modelElement) 
	{
		DateTimeType type = (DateTimeType)object;
=======

	/**
	 * Set the Object to be displayed by panel.
	 */
	public void setObject(java.lang.Object object, ch.ehi.uml1_4.foundation.core.ModelElement modelElement) {
		DateTimeType type = (DateTimeType) object;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		getPnlMin().setObject(type.getMin());
		getPnlMax().setObject(type.getMax());
	}

	/**
	 * This method initializes lblMin
<<<<<<< HEAD
	 * 
	 * @return javax.swing.JLabel
	 */
	private javax.swing.JLabel getLblMin() {
		if(lblMin == null) {
=======
	 *
	 * @return javax.swing.JLabel
	 */
	private javax.swing.JLabel getLblMin() {
		if (lblMin == null) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			lblMin = new javax.swing.JLabel();
			lblMin.setText(res.getString("lblMin_text"));
		}
		return lblMin;
	}
<<<<<<< HEAD
	/**
	 * This method initializes lblMax
	 * 
	 * @return javax.swing.JLabel
	 */
	private javax.swing.JLabel getLblMax() {
		if(lblMax == null) {
=======

	/**
	 * This method initializes lblMax
	 *
	 * @return javax.swing.JLabel
	 */
	private javax.swing.JLabel getLblMax() {
		if (lblMax == null) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			lblMax = new javax.swing.JLabel();
			lblMax.setText(res.getString("lblMax_text"));
		}
		return lblMax;
	}
<<<<<<< HEAD
	/**
	 * This method initializes pnlMin
	 * 
	 * @return ch.ehi.umleditor.application.IliDateTimeValuePanel
	 */
	private ch.ehi.umleditor.application.IliDateTimeValuePanel getPnlMin() {
		if(pnlMin == null) {
=======

	/**
	 * This method initializes pnlMin
	 *
	 * @return ch.ehi.umleditor.application.IliDateTimeValuePanel
	 */
	private ch.ehi.umleditor.application.IliDateTimeValuePanel getPnlMin() {
		if (pnlMin == null) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			pnlMin = new ch.ehi.umleditor.application.IliDateTimeValuePanel();
		}
		return pnlMin;
	}
<<<<<<< HEAD
	/**
	 * This method initializes pnlMax
	 * 
	 * @return ch.ehi.umleditor.application.IliDateTimeValuePanel
	 */
	private ch.ehi.umleditor.application.IliDateTimeValuePanel getPnlMax() {
		if(pnlMax == null) {
=======

	/**
	 * This method initializes pnlMax
	 *
	 * @return ch.ehi.umleditor.application.IliDateTimeValuePanel
	 */
	private ch.ehi.umleditor.application.IliDateTimeValuePanel getPnlMax() {
		if (pnlMax == null) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			pnlMax = new ch.ehi.umleditor.application.IliDateTimeValuePanel();
		}
		return pnlMax;
	}
}

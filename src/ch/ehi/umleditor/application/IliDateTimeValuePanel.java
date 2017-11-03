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
import javax.swing.*;

/**
 * @author ce
 * @version $Revision: 1.1 $ $Date: 2006-07-03 09:01:42 $
 */
public class IliDateTimeValuePanel extends BasePanel implements DataPanel {
<<<<<<< HEAD
	private static java.util.ResourceBundle res = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/IliDateTimeValuePanel");  //$NON-NLS-1$
=======
	
	private static final long serialVersionUID = -2869513677823436490L;

	private static java.util.ResourceBundle res = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/IliDateTimeValuePanel"); //$NON-NLS-1$
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

	private javax.swing.JTextField txtYear = null;
	private javax.swing.JTextField txtMonth = null;
	private javax.swing.JTextField txtDay = null;
	private javax.swing.JTextField txtHours = null;
	private javax.swing.JTextField txtMinutes = null;
	private javax.swing.JTextField txtSeconds = null;
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
	public IliDateTimeValuePanel() {
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
        this.add(getTxtYear(), null);
        this.add(getTxtMonth(), null);
		this.add(getTxtDay(), null);
		this.add(getTxtHours(), null);
        this.add(getTxtMinutes(), null);
		this.add(getTxtSeconds(), null);
        this.setSize(103, 29);
			
	}
=======

	/**
	 * This method initializes this
	 *
	 * @return void
	 */
	private void initialize() {
		this.add(getTxtYear(), null);
		this.add(getTxtMonth(), null);
		this.add(getTxtDay(), null);
		this.add(getTxtHours(), null);
		this.add(getTxtMinutes(), null);
		this.add(getTxtSeconds(), null);
		this.setSize(103, 29);

	}

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	public Object getObject() {
		if ((getTxtYear().getText() == null) || (getTxtYear().getText().length() == 0)) {
			return null;
		} else {
			DateTimeValue value = new DateTimeValue();
			value.setYear(Integer.parseInt(getTxtYear().getText()));
			value.setMonth(Integer.parseInt(getTxtMonth().getText()));
			value.setDay(Integer.parseInt(getTxtDay().getText()));
			value.setHours(Integer.parseInt(getTxtHours().getText()));
			value.setMinutes(Integer.parseInt(getTxtMinutes().getText()));
			value.setSeconds(Float.parseFloat(getTxtSeconds().getText()));
			return value;
		}
	}

	public void setObject(Object object) {
<<<<<<< HEAD
		DateTimeValue value = (DateTimeValue)object;
=======
		DateTimeValue value = (DateTimeValue) object;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		if (value == null) {
			getTxtYear().setText(null);
			getTxtMonth().setText(null);
			getTxtDay().setText(null);
			getTxtHours().setText(null);
			getTxtMinutes().setText(null);
			getTxtSeconds().setText(null);
		} else {
			getTxtYear().setText(Integer.toString(value.getYear()));
			getTxtMonth().setText(Integer.toString(value.getMonth()));
			getTxtDay().setText(Integer.toString(value.getDay()));
			getTxtHours().setText(Integer.toString(value.getHours()));
			getTxtMinutes().setText(Integer.toString(value.getMinutes()));
			getTxtSeconds().setText(Float.toString(value.getSeconds()));
		}
	}

	/**
	 * This method initializes txtYear
<<<<<<< HEAD
	 * 
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtYear() {
		if(txtYear == null) {
=======
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtYear() {
		if (txtYear == null) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			txtYear = new javax.swing.JTextField(4);
			txtYear.setToolTipText(res.getString("txtYear_toolTipText"));
		}
		return txtYear;
	}
<<<<<<< HEAD
	/**
	 * This method initializes txtMonth
	 * 
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtMonth() {
		if(txtMonth == null) {
=======

	/**
	 * This method initializes txtMonth
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtMonth() {
		if (txtMonth == null) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			txtMonth = new javax.swing.JTextField();
			txtMonth.setToolTipText(res.getString("txtMonth_toolTipText"));
			txtMonth.setColumns(2);
		}
		return txtMonth;
	}
<<<<<<< HEAD
	/**
	 * This method initializes txtDay
	 * 
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtDay() {
		if(txtDay == null) {
=======

	/**
	 * This method initializes txtDay
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtDay() {
		if (txtDay == null) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			txtDay = new javax.swing.JTextField();
			txtDay.setToolTipText(res.getString("txtDay_toolTipText"));
			txtDay.setColumns(2);
		}
		return txtDay;
	}
<<<<<<< HEAD
	/**
	 * This method initializes txtHours
	 * 
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtHours() {
		if(txtHours == null) {
=======

	/**
	 * This method initializes txtHours
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtHours() {
		if (txtHours == null) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			txtHours = new javax.swing.JTextField();
			txtHours.setToolTipText(res.getString("txtHours_toolTipText"));
			txtHours.setColumns(2);
		}
		return txtHours;
	}
<<<<<<< HEAD
	/**
	 * This method initializes txtMinutes
	 * 
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtMinutes() {
		if(txtMinutes == null) {
=======

	/**
	 * This method initializes txtMinutes
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtMinutes() {
		if (txtMinutes == null) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			txtMinutes = new javax.swing.JTextField();
			txtMinutes.setToolTipText(res.getString("txtMinutes_toolTipText"));
			txtMinutes.setColumns(2);
		}
		return txtMinutes;
	}
<<<<<<< HEAD
	/**
	 * This method initializes txtSeconds
	 * 
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtSeconds() {
		if(txtSeconds == null) {
=======

	/**
	 * This method initializes txtSeconds
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtSeconds() {
		if (txtSeconds == null) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			txtSeconds = new javax.swing.JTextField();
			txtSeconds.setToolTipText(res.getString("txtSeconds_toolTipText"));
			txtSeconds.setColumns(6);
		}
		return txtSeconds;
	}
<<<<<<< HEAD
}  //  @jve:visual-info  decl-index=0 visual-constraint="37,10"
=======
} // @jve:visual-info decl-index=0 visual-constraint="37,10"
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

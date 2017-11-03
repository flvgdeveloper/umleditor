package ch.ehi.umleditor.umldrawingtools;

/* This file is part of the UML/INTERLIS-Editor.
 * For more information, please see <http://www.umleditor.org/>.
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
import CH.ifa.draw.framework.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.util.FloatingTextField;
import CH.ifa.draw.util.UndoableAdapter;
import CH.ifa.draw.util.Undoable;
import java.awt.*;
import java.awt.event.*;

/**
 * Advanced clone of
<<<<<<< HEAD
 * @see CH.ifa.draw.figures.TextTool
 *
 * Handles keyBoard ENTER.
 *
 * @see TextHolder
 * @see FloatingTextField
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
=======
 * 
 * @see CH.ifa.draw.figures.TextTool
 *
 *      Handles keyBoard ENTER.
 *
 * @see TextHolder
 * @see FloatingTextField
 *
 * @author: Peter Hirzel <i>soft</i>Environment
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
 * @version $Revision: 1.3 $ $Date: 2007-12-19 07:56:06 $
 */
public class JHotDrawTextTool extends CreationTool implements ActionListener {

<<<<<<< HEAD
	private FloatingTextField   fTextField;
	private TextHolder  fTypingTarget;
=======
	private FloatingTextField fTextField;
	private TextHolder fTypingTarget;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

	public static class UndoActivity extends UndoableAdapter {
		private String myOriginalText;
		private String myBackupText;
<<<<<<< HEAD
		
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		public UndoActivity(DrawingView newDrawingView, String newOriginalText) {
			super(newDrawingView);
			setOriginalText(newOriginalText);
			setUndoable(true);
			setRedoable(true);
		}

		/*
		 * Undo the activity
<<<<<<< HEAD
=======
		 * 
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		 * @return true if the activity could be undone, false otherwise
		 */
		public boolean undo() {
			if (!super.undo()) {
				return false;
			}

			getDrawingView().clearSelection();

			if (!isValidText(getOriginalText())) {
<<<<<<< HEAD
				FigureEnumeration fe  = getAffectedFigures();
=======
				FigureEnumeration fe = getAffectedFigures();
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
				while (fe.hasMoreElements()) {
					getDrawingView().drawing().orphan(fe.nextFigure());
				}
			}
			// add text figure if it has been removed (no backup text)
			else if (!isValidText(getBackupText())) {
<<<<<<< HEAD
				FigureEnumeration fe  = getAffectedFigures();
=======
				FigureEnumeration fe = getAffectedFigures();
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
				while (fe.hasMoreElements()) {
					getDrawingView().add(fe.nextFigure());
				}
				setText(getOriginalText());
<<<<<<< HEAD
			}
			else {
				setText(getOriginalText());
			}
			
=======
			} else {
				setText(getOriginalText());
			}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

			return true;
		}

		/*
		 * Redo the activity
<<<<<<< HEAD
=======
		 * 
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		 * @return true if the activity could be redone, false otherwise
		 */
		public boolean redo() {
			if (!super.redo()) {
				return false;
			}

			getDrawingView().clearSelection();
<<<<<<< HEAD
				
			// the text figure did exist but was remove
			if (!isValidText(getBackupText())) {
				FigureEnumeration fe  = getAffectedFigures();
=======

			// the text figure did exist but was remove
			if (!isValidText(getBackupText())) {
				FigureEnumeration fe = getAffectedFigures();
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
				while (fe.hasMoreElements()) {
					getDrawingView().drawing().orphan(fe.nextFigure());
				}
			}
			// the text figure didn't exist before
			else if (!isValidText(getOriginalText())) {
<<<<<<< HEAD
				FigureEnumeration fe  = getAffectedFigures();
=======
				FigureEnumeration fe = getAffectedFigures();
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
				while (fe.hasMoreElements()) {
					getDrawingView().drawing().add(fe.nextFigure());
					setText(getBackupText());
				}
<<<<<<< HEAD
			}
			else {
=======
			} else {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
				setText(getBackupText());
			}

			return true;
		}
<<<<<<< HEAD
		
		protected boolean isValidText(String toBeChecked) {
			return ((toBeChecked != null) && (toBeChecked.length() > 0));
		}
		
=======

		protected boolean isValidText(String toBeChecked) {
			return ((toBeChecked != null) && (toBeChecked.length() > 0));
		}

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		protected void setText(String newText) {
			FigureEnumeration fe = getAffectedFigures();
			while (fe.hasMoreElements()) {
				Figure currentFigure = fe.nextFigure();
				if (currentFigure instanceof DecoratorFigure) {
<<<<<<< HEAD
					currentFigure = ((DecoratorFigure)currentFigure).getDecoratedFigure();
				}
				if (currentFigure instanceof TextHolder) {
					((TextHolder)currentFigure).setText(newText);
				}
			}
		}
		
		public void setBackupText(String newBackupText) {
			myBackupText = newBackupText;
		}
		
		public String getBackupText() {
			return myBackupText;
		}
		
		public void setOriginalText(String newOriginalText) {
			myOriginalText = newOriginalText;
		}
		
=======
					currentFigure = ((DecoratorFigure) currentFigure).getDecoratedFigure();
				}
				if (currentFigure instanceof TextHolder) {
					((TextHolder) currentFigure).setText(newText);
				}
			}
		}

		public void setBackupText(String newBackupText) {
			myBackupText = newBackupText;
		}

		public String getBackupText() {
			return myBackupText;
		}

		public void setOriginalText(String newOriginalText) {
			myOriginalText = newOriginalText;
		}

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		public String getOriginalText() {
			return myOriginalText;
		}
	}
<<<<<<< HEAD
	public JHotDrawTextTool(DrawingEditor newDrawingEditor, Figure prototype) {
		super(newDrawingEditor, prototype);
	}
/**
 * Stop Editing at Keyboard-ENTER.
 * Extended by Peter Hirzel.
 * @see #beginEdit(TextHolder)
 */
public void actionPerformed(java.awt.event.ActionEvent e) {
//TODO Patch: Extended for KeyBoard-ENTER handling
	endEdit();
}
=======

	public JHotDrawTextTool(DrawingEditor newDrawingEditor, Figure prototype) {
		super(newDrawingEditor, prototype);
	}

	/**
	 * Stop Editing at Keyboard-ENTER. Extended by Peter Hirzel.
	 * 
	 * @see #beginEdit(TextHolder)
	 */
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Patch: Extended for KeyBoard-ENTER handling
		endEdit();
	}

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	/**
	 * Sets the text cursor.
	 */
	public void activate() {
		super.activate();
		view().clearSelection();
		// JDK1.1 TEXT_CURSOR has an incorrect hot spot
<<<<<<< HEAD
		//view().setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
	}
	protected void beginEdit(TextHolder figure) {
		if (fTextField == null) {
			fTextField = new FloatingTextField();
//TODO Patch: Extended by Peter Hirzel for KeyBoard-ENTER handling		
fTextField.addActionListener(this);
=======
		// view().setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
	}

	protected void beginEdit(TextHolder figure) {
		if (fTextField == null) {
			fTextField = new FloatingTextField();
			// TODO Patch: Extended by Peter Hirzel for KeyBoard-ENTER handling
			fTextField.addActionListener(this);
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		}

		if (figure != getTypingTarget() && getTypingTarget() != null) {
			endEdit();
		}

<<<<<<< HEAD
		fTextField.createOverlay((Container)view(), figure.getFont());
		// scale position, paint() of FloatingTextField.fEditWidget (JTextField)
		// uses the scaled position
		Rectangle rect=fieldBounds(figure);
		double scale=1.0;
        DrawingView v=view();
        if (v instanceof CH.ifa.draw.contrib.zoom.ZoomDrawingView) {
            scale=((CH.ifa.draw.contrib.zoom.ZoomDrawingView)v).getScale();
        }
        rect.x=(int)(rect.x*scale);
        rect.y=(int)(rect.y*scale);
=======
		fTextField.createOverlay((Container) view(), figure.getFont());
		// scale position, paint() of FloatingTextField.fEditWidget (JTextField)
		// uses the scaled position
		Rectangle rect = fieldBounds(figure);
		double scale = 1.0;
		DrawingView v = view();
		if (v instanceof CH.ifa.draw.contrib.zoom.ZoomDrawingView) {
			scale = ((CH.ifa.draw.contrib.zoom.ZoomDrawingView) v).getScale();
		}
		rect.x = (int) (rect.x * scale);
		rect.y = (int) (rect.y * scale);
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		fTextField.setBounds(rect, figure.getText());

		setTypingTarget(figure);
		setUndoActivity(createUndoActivity());
	}
<<<<<<< HEAD
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	/**
	 * Factory method for undo activity
	 */
	protected Undoable createUndoActivity() {
		return new JHotDrawTextTool.UndoActivity(view(), getTypingTarget().getText());
	}
<<<<<<< HEAD
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	/**
	 * Terminates the editing of a text figure.
	 */
	public void deactivate() {
		endEdit();
<<<<<<< HEAD
        super.deactivate();
	}
=======
		super.deactivate();
	}

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	protected void endEdit() {
		if (getTypingTarget() != null) {
			if (fTextField.getText().length() > 0) {
				getTypingTarget().setText(fTextField.getText());
<<<<<<< HEAD
			}
			else {
				drawing().orphan((Figure)getAddedFigure());

				// nothing to undo
//	            setUndoActivity(null);
			}

			// put created figure into a figure enumeration
			getUndoActivity().setAffectedFigures(
				new SingleFigureEnumerator(getAddedFigure()));
			((JHotDrawTextTool.UndoActivity)getUndoActivity()).setBackupText(
				getTypingTarget().getText());

			setTypingTarget(null);
			fTextField.endOverlay();
//	        view().checkDamage();
		}
	}
=======
			} else {
				drawing().orphan((Figure) getAddedFigure());

				// nothing to undo
				// setUndoActivity(null);
			}

			// put created figure into a figure enumeration
			getUndoActivity().setAffectedFigures(new SingleFigureEnumerator(getAddedFigure()));
			((JHotDrawTextTool.UndoActivity) getUndoActivity()).setBackupText(getTypingTarget().getText());

			setTypingTarget(null);
			fTextField.endOverlay();
			// view().checkDamage();
		}
	}

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	private Rectangle fieldBounds(TextHolder figure) {
		Rectangle box = figure.textDisplayBox();
		int nChars = figure.overlayColumns();
		Dimension d = fTextField.getPreferredSize(nChars);
		return new Rectangle(box.x, box.y, d.width, d.height);
	}
<<<<<<< HEAD
	protected TextHolder getTypingTarget() {
		return fTypingTarget;
	}
	/**
	 * Test whether the text tool is currently activated and is displaying
	 * a overlay TextFigure for accepting input.
	 *
	 * @return true, if the text tool has a accepting target TextFigure for its input, false otherwise
=======

	protected TextHolder getTypingTarget() {
		return fTypingTarget;
	}

	/**
	 * Test whether the text tool is currently activated and is displaying a
	 * overlay TextFigure for accepting input.
	 *
	 * @return true, if the text tool has a accepting target TextFigure for its
	 *         input, false otherwise
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	 */
	public boolean isActivated() {
		return getTypingTarget() != null;
	}
<<<<<<< HEAD
	/**
	 * If the pressed figure is a TextHolder it can be edited otherwise
	 * a new text figure is created.
	 */
	public void mouseDown(MouseEvent e, int x, int y)
	{
=======

	/**
	 * If the pressed figure is a TextHolder it can be edited otherwise a new
	 * text figure is created.
	 */
	public void mouseDown(MouseEvent e, int x, int y) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		TextHolder textHolder = null;
		Figure pressedFigure = drawing().findFigureInside(x, y);
		if (pressedFigure instanceof TextHolder) {
			textHolder = (TextHolder) pressedFigure;
			if (!textHolder.acceptsTyping())
				textHolder = null;
		}
		if (textHolder != null) {
			beginEdit(textHolder);
			return;
		}
		if (getTypingTarget() != null) {
			endEdit();
			editor().toolDone();
		} else {
			super.mouseDown(e, x, y);
<<<<<<< HEAD
			// update view so the created figure is drawn before the floating text
			// figure is overlaid. (Note, fDamage should be null in StandardDrawingView
			// when the overlay figure is drawn because a JTextField cannot be scrolled)
			view().checkDamage();
			textHolder = (TextHolder)getCreatedFigure();
			beginEdit(textHolder);
		}
	}
	public void mouseDrag(MouseEvent e, int x, int y) {
	}
	public void mouseUp(MouseEvent e, int x, int y) {
	}
=======
			// update view so the created figure is drawn before the floating
			// text
			// figure is overlaid. (Note, fDamage should be null in
			// StandardDrawingView
			// when the overlay figure is drawn because a JTextField cannot be
			// scrolled)
			view().checkDamage();
			textHolder = (TextHolder) getCreatedFigure();
			beginEdit(textHolder);
		}
	}

	public void mouseDrag(MouseEvent e, int x, int y) {
	}

	public void mouseUp(MouseEvent e, int x, int y) {
	}

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	protected void setTypingTarget(TextHolder newTypingTarget) {
		fTypingTarget = newTypingTarget;
	}
}

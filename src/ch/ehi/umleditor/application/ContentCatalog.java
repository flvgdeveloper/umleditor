package ch.ehi.umleditor.application;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import ch.softenvironment.view.BaseDialog;

public class ContentCatalog extends BaseDialog{

	private static final long serialVersionUID = 8140042830420220193L;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	
	private javax.swing.JLabel ivjLblContent = null;
	private javax.swing.JScrollPane ivjScpEditor = null;
	public javax.swing.JTextArea ivjTxtAIntro = null;
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	
	class IvjEventHandler implements java.awt.event.ActionListener,  java.awt.event.KeyListener{
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == ContentCatalog.this.getBtnCancel())
				connEtoC1(e);
			if (e.getSource() == ContentCatalog.this.getBtnOk())
				connEtoC2(e);
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		};
	};
	
	protected ContentCatalog(Component owner, boolean modal) {
		super(owner, modal);
		initialize();
		addEscapeKey();
	}
	
	public ContentCatalog(java.awt.Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		initialize();
		if (title != null) {
			setTitle(title);
		}
		show();
	}
	
	/**
	 * Handle escape key to close the dialog
	 */
	 private void addEscapeKey() {
		 
		 KeyStroke escape = KeyStroke.getKeyStroke (KeyEvent.VK_ESCAPE, 0, false);
		 Action escapeAction = new AbstractAction() {
			
			private static final long serialVersionUID = 1410051176024257413L;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				dispose();
			}
		 };
		 getRootPane ().getInputMap (JComponent.WHEN_IN_FOCUSED_WINDOW).put (escape, "ESCAPE");
		 getRootPane ().getActionMap ().put ("ESCAPE", escapeAction);
	 }
	 
	 /**
		 * Initialize the class.
		 */
		/* WARNING: THIS METHOD WILL BE REGENERATED. */
		private void initialize() {
			try {
				// user code begin {1}
				// user code end
				setName("ContentDialog");
				setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
				setTitle("Content");
				setSize(600, 570);
				setContentPane(getBaseDialogContentPane());
				initConnections();
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		
		/**
		 * Initializes connections
		 * 
		 * @exception java.lang.Exception
		 *                The exception description.
		 */
		private void initConnections() throws java.lang.Exception {
			// user code begin {1}
			// user code end
			getTxtAIntro().addKeyListener(ivjEventHandler);
			getBtnCancel().addActionListener(ivjEventHandler);
			getBtnOk().addActionListener(ivjEventHandler);
		}
		
		
		private javax.swing.JLabel getLblContent() {
			if (ivjLblContent == null) {
				try {
					ivjLblContent = new javax.swing.JLabel();
					ivjLblContent.setName("LblVersionControl");
					ivjLblContent.setText("Contenido:");
					//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjLblContent;
		}
		
		public javax.swing.JTextArea getTxtAIntro() {
			if (ivjTxtAIntro == null) {
				try {
					ivjTxtAIntro = new javax.swing.JTextArea();
					ivjTxtAIntro.setName("TxtAIntro");
					ivjTxtAIntro.setLineWrap(true);
					ivjTxtAIntro.setWrapStyleWord(true);
					ivjTxtAIntro.setRows(14);
					ivjTxtAIntro.setColumns(34);
					//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjTxtAIntro;
		}
		
		private javax.swing.JScrollPane getScpEditor() {
			if (ivjScpEditor == null) {
				try {
					ivjScpEditor = new javax.swing.JScrollPane();
					ivjScpEditor.setName("ScpEditor");
					ivjScpEditor.setAutoscrolls(true);
					ivjScpEditor.setViewportView(getTxtAIntro());
					ivjScpEditor.setBounds(10, 11, 455, 249);
					// user code begin {1}
					// user code end
				} catch (java.lang.Throwable ivjExc) {
					// user code begin {2}
					// user code end
					handleException(ivjExc);
				}
			}
			return ivjScpEditor;
	}
	
		private javax.swing.JPanel getBaseDialogContentPane() {
			if (ivjBaseDialogContentPane == null) {
				try {
					
					ivjBaseDialogContentPane = new javax.swing.JPanel();
					ivjBaseDialogContentPane.setName("BaseDialogContentPane");
					ivjBaseDialogContentPane.setLayout(new java.awt.GridBagLayout());

					java.awt.GridBagConstraints constraintsLblContent = new java.awt.GridBagConstraints();
					constraintsLblContent.gridx = 0;
					constraintsLblContent.gridy = 0;
					constraintsLblContent.ipadx = 104;
					constraintsLblContent.insets = new java.awt.Insets(29, 15, 15, 250);
					getBaseDialogContentPane().add(getLblContent(), constraintsLblContent);
					
					java.awt.GridBagConstraints constraintsTxtContent = new java.awt.GridBagConstraints();
					constraintsTxtContent.gridx = 0;
					constraintsTxtContent.gridy = 1;
					constraintsTxtContent.ipadx = 425;
					constraintsTxtContent.ipady = 360;
					constraintsTxtContent.insets = new java.awt.Insets(14, 5, 42, 5);
					ivjBaseDialogContentPane.add(getScpEditor(), constraintsTxtContent);
					
					java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
					constraintsBtnOk.gridx = 0;
					constraintsBtnOk.gridy = 2;
					constraintsBtnOk.ipadx = 64;
					constraintsBtnOk.insets = new java.awt.Insets(17, 5, 44, 250);
					getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

					java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
					constraintsBtnCancel.gridx = 0;
					constraintsBtnCancel.gridy = 2;
					constraintsBtnCancel.ipadx = 64;
					constraintsBtnCancel.insets = new java.awt.Insets(17, 40, 44, 50);
					getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjBaseDialogContentPane;
		}
		
		/**
		 * Return the BtnCancel property value.
		 * 
		 * @return javax.swing.JButton
		 */
		/* WARNING: THIS METHOD WILL BE REGENERATED. */
		private javax.swing.JButton getBtnCancel() {
			if (ivjBtnCancel == null) {
				try {
					ivjBtnCancel = new javax.swing.JButton();
					ivjBtnCancel.setName("BtnCancel");
					// user code begin {1}
					ivjBtnCancel.setText("Cancel");
					// user code end
				} catch (java.lang.Throwable ivjExc) {
					// user code begin {2}
					// user code end
					handleException(ivjExc);
				}
			}
			return ivjBtnCancel;
		}

		/**
		 * Return the BtnOk property value.
		 * 
		 * @return javax.swing.JButton
		 */
		/* WARNING: THIS METHOD WILL BE REGENERATED. */
		private javax.swing.JButton getBtnOk() {
			if (ivjBtnOk == null) {
				try {
					ivjBtnOk = new javax.swing.JButton();
					ivjBtnOk.setName("BtnOk");
					ivjBtnOk.setText("OK");
					// user code end
				} catch (java.lang.Throwable ivjExc) {
					// user code begin {2}
					// user code end
					handleException(ivjExc);
				}
			}
			return ivjBtnOk;
		}
		
		/**
		 * connEtoC1: (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent)
		 * --> PackageSelectionDialog.cancelPressed()V)
		 * 
		 * @param arg1
		 *            java.awt.event.ActionEvent
		 */
		/* WARNING: THIS METHOD WILL BE REGENERATED. */
		private void connEtoC1(java.awt.event.ActionEvent arg1) {
			try {
				// user code begin {1}
				// user code end
				this.cancelPressed();
				// user code begin {2}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {3}
				// user code end
				handleException(ivjExc);
			}
		}

		/**
		 * connEtoC2: (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) -->
		 * PackageSelectionDialog.okPressed()V)
		 * 
		 * @param arg1
		 *            java.awt.event.ActionEvent
		 */
		/* WARNING: THIS METHOD WILL BE REGENERATED. */
		private void connEtoC2(java.awt.event.ActionEvent arg1) {
			try {
				// user code begin {1}
				// user code end
				this.okPressed();
				// user code begin {2}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {3}
				// user code end
				handleException(ivjExc);
			}
		}
}

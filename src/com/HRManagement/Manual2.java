package com.HRManagement;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class Manual2 extends JDialog {

	private final JPanel contentPanel = new JPanel();


	/**
	 * Create the dialog.
	 */
	public Manual2() {
		setBounds(100, 100, 479, 338);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblManual = new JLabel("MANUAL \u03A7\u03A1\u0397\u03A3\u0397\u03A3 \u03A0\u03A1\u039F\u0393\u03A1\u0391\u039C\u039C\u0391\u03A4\u039F\u03A3");
			lblManual.setHorizontalAlignment(SwingConstants.CENTER);
			lblManual.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblManual.setBounds(0, 11, 516, 32);
			contentPanel.add(lblManual);
		}
		
		JTextPane txtpnhr = new JTextPane();
		txtpnhr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnhr.setText("\u039A\u03B1\u03C1\u03C4\u03AD\u03BB\u03B1 \u03A0\u03C1\u03BF\u03B9\u03C3\u03C4\u03B1\u03BC\u03AD\u03BD\u03C9\u03BD (Administrators).\r\n\u039F\u03B9 \u03B2\u03B1\u03C3\u03B9\u03BA\u03B5\u03C2 \u03BB\u03B5\u03B9\u03C4\u03BF\u03C5\u03C1\u03B3\u03B9\u03B5\u03C2 \u03BF\u03B9 \u03BF\u03C0\u03BF\u03B9\u03B5\u03C2 \u03C0\u03C1\u03BF\u03C3\u03C6\u03AD\u03C1\u03BF\u03BD\u03C4\u03B1\u03B9 \u03BC\u03B5\u03C3\u03B1 \u03B1\u03C0\u03BF \u03C4\u03BF \u03C0\u03B1\u03C1\u03C9\u03BD \u03BB\u03BF\u03B3\u03B9\u03C3\u03BC\u03B9\u03BA\u03BF \u03C0\u03B1\u03C1\u03BF\u03C5\u03C3\u03B9\u03AC\u03B6\u03BF\u03BD\u03C4\u03B1\u03B9 \u03C0\u03B1\u03C1\u03B1\u03BA\u03AC\u03C4\u03C9.\r\n\r\n\r\n1.\u0395\u03C0\u03B9\u03BB\u03B5\u03BA\u03C4\u03B9\u03BA\u03B7 \u03B5\u03B9\u03C3\u03BF\u03B4\u03BF\u03C2 \u03C3\u03C4\u03BF \u03C3\u03C5\u03C3\u03C4\u03B7\u03BC\u03B1 \u03BC\u03B5 \u03C3\u03C5\u03B3\u03BA\u03B5\u03BA\u03C1\u03B9\u03BC\u03B5\u03BD\u03B1 logins.\r\n2.\u0394\u03B9\u03B1\u03C6\u03BF\u03C1\u03B5\u03C4\u03B9\u03BA\u03B5\u03C2 \u03B4\u03C5\u03BD\u03B1\u03C4\u03BF\u03C4\u03B7\u03C4\u03B5\u03C2 \u03BA\u03B1\u03B9 \u03BB\u03B5\u03B9\u03C4\u03BF\u03C5\u03C1\u03B3\u03B9\u03B5\u03C2 ,\u03B1\u03BD\u03B1\u03BB\u03BF\u03B3\u03C9\u03C2 \u03C4\u03BF\u03BD \u03C4\u03C5\u03C0\u03BF \u03C4\u03BF\u03C5 \u03C5\u03C0\u03B1\u03BB\u03BB\u03B7\u03BB\u03BF\u03C5.\r\n3.\u0391\u03BD\u03B1\u03B6\u03B7\u03C4\u03B7\u03C3\u03B7 \u03C5\u03C0\u03B1\u03BB\u03BB\u03B7\u03BB\u03BF\u03C5 \u03BA\u03B1\u03B9 \u03C0\u03C1\u03BF\u03B2\u03BF\u03BB\u03B7 \u03C3\u03C4\u03BF\u03B9\u03C7\u03B5\u03B9\u03C9\u03BD \u03C4\u03BF\u03C5.\r\n\t(\u0391\u03C1\u03C7\u03B9\u03BA\u03AE \u039F\u03B8\u03CC\u03BD\u03B7)\r\n4.\u03A0\u03C1\u03BF\u03C3\u03B8\u03B7\u03BA\u03B7 \u03B1\u03BE\u03B9\u03BF\u03BB\u03BF\u03B3\u03AE\u03C3\u03B5\u03C9\u03BD \u03C5\u03C0\u03B1\u03BB\u03BB\u03B7\u03BB\u03C9\u03BD \u03C3\u03C4\u03B7\u03BD \u03B5\u03C4\u03B1\u03B9\u03C1\u03B9\u03B1.\r\n\t(\u0391\u03C1\u03C7\u03B9\u03BA\u03AE \u039F\u03B8\u03CC\u03BD\u03B7>\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B7\u03C3\u03B7 \u03A0\u03C1\u03BF\u03C3\u03C9\u03C0\u03B9\u03BA\u03BF\u03CD>\u0391\u03BE\u03B9\u03BF\u03BB\u03CC\u03B3\u03B7\u03C3\u03B7 \u03A5\u03C0\u03B1\u03BB\u03BB\u03B7\u03BB\u03BF\u03C5)\r\n");
		txtpnhr.setEditable(false);
		txtpnhr.setBackground(SystemColor.menu);
		txtpnhr.setBounds(10, 62, 506, 210);
		contentPanel.add(txtpnhr);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("\u039A\u03BB\u03B5\u03AF\u03C3\u03B9\u03BC\u03BF");
				cancelButton.setIcon(new ImageIcon(Manual.class.getResource("/Pictures/error_button.png")));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

package com.HRManagement;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AboutUs extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public AboutUs() {
		setBounds(100, 100, 449, 335);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\u0395\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03B3\u03B9\u03B1 \u03C4\u03BF \u03BC\u03AC\u03B8\u03B7\u03BC\u03B1 \u039C\u03B7\u03C7\u03B1\u03BD\u03B9\u03BA\u03AE \u039B\u03BF\u03B3\u03B9\u03C3\u03BC\u03B9\u03BA\u03BF\u03CD (\u0395)\r\n\r\n\u03A5\u03BB\u03BF\u03C0\u03BF\u03B9\u03AE\u03B8\u03B7\u03BA\u03B5 \u03B1\u03C0\u03CC \u03C4\u03BF\u03C5\u03C2 \u03C3\u03C0\u03BF\u03C5\u03B4\u03B1\u03C3\u03C4\u03AD\u03C2:\r\n\r\n\u039F\u03BD\u03BF\u03BC\u03B1\u03C4\u03B5\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF: \u0392\u03B1\u03C3\u03B9\u03BB\u03B5\u03B9\u03BF\u03C5 \u03A6\u03B9\u03BB\u03B9\u03C0\u03C0\u03BF\u03C2\r\nA.M. : 43521\r\n\r\n\u039F\u03BD\u03BF\u03BC\u03B1\u03C4\u03B5\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF: \u03A0\u03B1\u03C0\u03B1\u03B2\u03B1\u03B9\u03C4\u03C3\u03B7\u03C2 \u0391\u03BB\u03BA\u03B9\u03B2\u03B9\u03B1\u03B4\u03B7\u03C2\r\nA.M. : 40554\r\n\r\n\u039F\u03BD\u03BF\u03BC\u03B1\u03C4\u03B5\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF: \u03A0\u03B1\u03C3\u03C3\u03AC\u03C2 \u0393\u03B5\u03CE\u03C1\u03B3\u03B9\u03BF\u03C2-\u0391\u03BB\u03AD\u03BE\u03B1\u03BD\u03B4\u03C1\u03BF\u03C2\r\nA.M. : 40746");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPane.setBounds(10, 54, 399, 199);
		textPane.setEditable(false);
		textPane.setBackground(SystemColor.menu);
		contentPanel.add(textPane);
		
		JLabel label = new JLabel("\u03A3\u03A7\u0395\u03A4\u0399\u039A\u0391 \u039C\u0395 \u03A4\u0397\u039D \u0395\u03A1\u0393\u0391\u03A3\u0399\u0391 & \u0395\u039C\u0391\u03A3");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(0, 11, 434, 32);
		contentPanel.add(label);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("\u039A\u03BB\u03B5\u03AF\u03C3\u03B9\u03BC\u03BF");
				cancelButton.setIcon(new ImageIcon(AboutUs.class.getResource("/Pictures/error_button.png")));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

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

public class Help extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	Help i = this;

	/**
	 * Create the dialog.
	 */
	public Help() {
		setBounds(100, 100, 506, 410);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setBounds(10, 41, 469, 297);
			contentPanel.add(panel);
			{
				JTextPane textPane = new JTextPane();
				textPane.setBackground(SystemColor.control);
				textPane.setEditable(false);
				textPane.setText("\u03A4\u03BF \u03C0\u03B1\u03C1\u03CE\u03BD \u03C0\u03C1\u03BF\u03B9\u03CC\u03BD \u03B1\u03C0\u03BF\u03C4\u03B5\u03BB\u03B5\u03B9 \u03BC\u03B9\u03B1 \u03C5\u03C0\u03B7\u03C1\u03B5\u03C3\u03B9\u03B1 \u03BC\u03B5 \u03C3\u03BA\u03BF\u03C0\u03BF \u03C4\u03B7\u03BD \u03BA\u03B1\u03BB\u03C5\u03C8\u03B7 \u03B1\u03BD\u03B1\u03B3\u03BA\u03C9\u03BD \u03C0\u03BF\u03C5 \u03B1\u03C6\u03BF\u03C1\u03BF\u03C5\u03BD \r\n\u03C4\u03B7\u03BD \u03B4\u03B9\u03B1\u03C7\u03B5\u03B9\u03C1\u03B7\u03C3\u03B7 \u03C4\u03BF\u03C5 \u03B1\u03BD\u03B8\u03C1\u03C9\u03C0\u03B9\u03BD\u03BF\u03C5 \u03B4\u03C5\u03BD\u03B1\u03BC\u03B9\u03BA\u03BF\u03C5 \u03BC\u03B5\u03C3\u03B1 \u03C3\u03B5 \u03BC\u03B9\u03B1 \u03B5\u03C4\u03B1\u03B9\u03C1\u03B9\u03B1.\r\n\r\n\u03A0\u03C1\u03BF\u03C3\u03C6\u03B5\u03C1\u03B5\u03C4\u03B1\u03B9 \u03B5\u03BD\u03B1 \u03C0\u03BB\u03B7\u03B8\u03BF\u03C2 \u03B4\u03C5\u03BD\u03B1\u03C4\u03BF\u03C4\u03B7\u03C4\u03C9\u03BD (\u03B1\u03BD\u03B1\u03BB\u03BF\u03B3\u03C9\u03C2 \u03C4\u03B7\u03C2 \u03B8\u03B5\u03C3\u03B7\u03C2 \u03C4\u03BF\u03C5 \u03BA\u03B1\u03B8\u03B5 \u03C5\u03C0\u03B1\u03BB\u03BB\u03B7\u03BB\u03BF\u03C5) \u03BF\u03C0\u03BF\u03C5 \u03C3\u03C5\u03BC\u03C0\u03B5\u03C1\u03B9\u03BB\u03B1\u03BC\u03B2\u03B1\u03BD\u03B5\u03B9 :\r\n\r\n\t\u03A0\u03C1\u03BF\u03C3\u03B8\u03B7\u03BA\u03B7 \u03BD\u03B5\u03BF\u03C5 \u03C5\u03C0\u03B1\u03BB\u03BB\u03B7\u03BB\u03BF\u03C5 \u03C3\u03C4\u03B7\u03BD \u03B5\u03C4\u03B1\u03B9\u03C1\u03B9\u03B1\r\n\t\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03B9\u03B1 \u03C3\u03C4\u03BF\u03B9\u03C7\u03B5\u03B9\u03C9\u03BD \u03C5\u03C0\u03B1\u03BB\u03BB\u03B7\u03BB\u03BF\u03C5\r\n\t\u03A0\u03C1\u03BF\u03C3\u03B8\u03B7\u03BA\u03B7 \u03BD\u03B5\u03BF\u03C5 \u03C4\u03BC\u03B7\u03BC\u03B1\u03C4\u03BF\u03C2 \u03C3\u03C4\u03B7\u03BD \u03B5\u03C4\u03B1\u03B9\u03C1\u03B9\u03B1\r\n\t\u03A3\u03C5\u03C3\u03C4\u03B7\u03BC\u03B1 \u03B1\u03BE\u03B9\u03BF\u03BB\u03CC\u03B3\u03B7\u03C3\u03B7\u03C2 \u03C5\u03C0\u03B1\u03BB\u03BB\u03AE\u03BB\u03C9\u03BD\r\n\t\u03BA\u03BB\u03C0.\r\n\r\n\u0393\u03B9\u03B1 \u03C0\u03B5\u03C1\u03B9\u03C3\u03C3\u03CC\u03C4\u03B5\u03C1\u03B5\u03C2 \u03C0\u03BB\u03B7\u03C1\u03BF\u03C6\u03BF\u03C1\u03B9\u03B5\u03C2 \u03C3\u03C7\u03B5\u03C4\u03B9\u03BA\u03B1 \u03BC\u03B5 \u03C4\u03B9\u03C2 \u03B4\u03C5\u03BD\u03B1\u03C4\u03BF\u03C4\u03B7\u03C4\u03B5\u03C2 \u03C4\u03BF\u03C5 \u03C0\u03C1\u03BF\u03B3\u03C1\u03B1\u03BC\u03BC\u03B1\u03C4\u03BF\u03C2 \u03B4\u03B9\u03B1\u03C7\u03B5\u03B9\u03C1\u03B7\u03C3\u03B7\u03C2 \u03C0\u03C1\u03BF\u03C3\u03C9\u03C0\u03B9\u03BA\u03BF\u03C5 \u03BF\u03C0\u03C9\u03C2 \u03B5\u03C0\u03B9\u03C3\u03B7\u03C2 \u03BA\u03B1\u03B9 \u03B3\u03B9\u03B1 \u03B1\u03BD\u03B1\u03BB\u03C5\u03C4\u03B9\u03BA\u03B5\u03C2 \u03BF\u03B4\u03B7\u03B3\u03B9\u03B5\u03C2 \u03C3\u03C7\u03B5\u03C4\u03B9\u03BA\u03B1 \u03BC\u03B5 \u03C4\u03B7\u03BD \u03C7\u03C1\u03B7\u03C3\u03B7 \u03C4\u03BF\u03C5 , \u03B1\u03C0\u03B5\u03C5\u03B8\u03C5\u03BD\u03B8\u03B5\u03B9\u03C4\u03B5 \u03C3\u03C4\u03B7\u03BD \u03BA\u03B1\u03C1\u03C4\u03B5\u03BB\u03B1 \"\u039F\u03B4\u03B7\u03B3\u03AF\u03B5\u03C2 \u03A7\u03C1\u03AE\u03C3\u03B7\u03C2\".");
				textPane.setBounds(0, 21, 459, 290);
				panel.add(textPane);
			}
		}
		{
			JLabel label = new JLabel("\u03A0\u0395\u03A1\u0399\u0395\u03A7\u039F\u039C\u0395\u039D\u0391 \u0392\u039F\u0397\u0398\u0395\u0399\u0391\u03A3");
			label.setBounds(10, 11, 469, 32);
			contentPanel.add(label);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("\u039A\u03BB\u03B5\u03AF\u03C3\u03B9\u03BC\u03BF");
				cancelButton.setIcon(new ImageIcon(Help.class.getResource("/Pictures/error_button.png")));
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
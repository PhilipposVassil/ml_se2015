package com.HRManagement;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.sql.*;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MyDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	
	protected Connection conn;


	MyDialog i = this;
	private JTextField textField2;

	/**
	 * Create the dialog.
	 */
	public MyDialog() {
		
		conn = MySQL.connectDB();
		
		setBounds(100, 100, 404, 216);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setBounds(0, 37, 414, 189);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("\u039F\u039D\u039F\u039C\u0391 \u03A4\u039C\u0397\u039C\u0391\u03A4\u039F\u03A3:");
				label.setBounds(10, 29, 164, 24);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("\u0397\u039C\u0395\u03A1\u039F\u039C\u0397\u039D\u0399\u0391 \u0394\u0397\u039C\u0399\u039F\u03A5\u03A1\u0393\u0399\u0391\u03A3:");
				label.setBounds(10, 54, 164, 24);
				panel.add(label);
			}
			{
				textField2 = new JTextField();
				textField2.setColumns(10);
				textField2.setBounds(184, 56, 170, 20);
				panel.add(textField2);
			}
			{
				textField = new JTextField();
				textField.setBounds(184, 31, 170, 20);
				panel.add(textField);
				textField.setColumns(10);
			}
		}
		{
			JLabel label = new JLabel("\u03A0\u03A1\u039F\u03A3\u0398\u0397\u039A\u0397 \u039D\u0395\u039F\u03A5 \u03A4\u039C\u0397\u039C\u0391\u03A4\u039F\u03A3");
			label.setBounds(0, 11, 388, 32);
			contentPanel.add(label);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("\u0395\u03BD\u03C4\u03AC\u03BE\u03B5\u03B9");
				okButton.setIcon(new ImageIcon(MyDialog.class.getResource("/Pictures/green_globe_ok_tic_584.png")));
				okButton.setActionCommand("OK");
				okButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String text = textField.getText();
						String text1 = textField2.getText();
						
						String query = "Insert into divisions values('"+text+"','"+text1+"')";
						MySQL.executeUpdate(query, conn);
						i.setVisible(false);
					}
					
				});
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("\u0386\u03BA\u03C5\u03C1\u03BF");
				cancelButton.setIcon(new ImageIcon(MyDialog.class.getResource("/Pictures/error_button.png")));
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

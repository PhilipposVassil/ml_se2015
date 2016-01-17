package com.HRManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class MyDialog3 extends JDialog {
	private JComboBox<String> cboDemo;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	
	protected Connection conn;

	MyDialog3 i = this;
	private JTextField textField2;
	private JTextField textField4;
	private JTextField textField5;

	/**
	 * Create the dialog.
	 */
	public MyDialog3() {
		setBounds(100, 100, 413, 292);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setBounds(10, 39, 414, 189);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("\u039F\u039D\u039F\u039C\u0391\u03A4\u0395\u03A0\u03A9\u039D\u03A5\u039C\u039F:");
				label.setBounds(10, 29, 164, 24);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("\u0397\u039C\u0395\u03A1\u039F\u039C\u0397\u039D\u0399\u0391 \u0393\u0395\u039D\u039D\u0397\u03A3\u0397\u03A3:");
				label.setBounds(10, 79, 164, 24);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("\u03A4\u039C\u0397\u039C\u0391:");
				label.setBounds(10, 54, 164, 24);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("\u0397\u039C\u0395\u03A1\u039F\u039C\u0397\u039D\u0399\u0391 \u03A0\u03A1\u039F\u03A3\u039B\u0397\u03A8\u0397\u03A3:");
				label.setBounds(10, 104, 164, 24);
				panel.add(label);
			}
			
			JLabel label = new JLabel("\u0391\u03A6\u039C");
			label.setBounds(10, 129, 164, 24);
			panel.add(label);
			{
				textField2 = new JTextField();
				textField2.setColumns(10);
				textField2.setBounds(206, 81, 155, 20);
				panel.add(textField2);
			}
			{
				textField4 = new JTextField();
				textField4.setColumns(10);
				textField4.setBounds(206, 106, 155, 20);
				panel.add(textField4);
			}
			{
				textField = new JTextField();
				textField.setBounds(206, 31, 155, 20);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				textField5 = new JTextField();
				textField5.setColumns(10);
				textField5.setBounds(206, 131, 155, 20);
				panel.add(textField5);
			}
			{
						cboDemo = new JComboBox<String>();
						cboDemo.setBorder(UIManager.getBorder("ComboBox.border"));
						cboDemo.setBackground(Color.WHITE);
						cboDemo.setForeground(Color.BLACK);
						cboDemo.setBounds(206, 56, 155, 20);
						panel.add(cboDemo);

						try {
							String query = "Select name from divisions;";
							ResultSet rs = MySQL.executeQuery(query, conn);
							while(rs.next()){
								cboDemo.addItem(rs.getString(1));
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			}
		}
		{
			JLabel label = new JLabel("\u03A0\u03A1\u039F\u03A3\u0398\u0397\u039A\u0397 \u039D\u0395\u039F\u03A5 \u03A5\u03A0\u0391\u039B\u039B\u0397\u039B\u039F\u03A5");
			label.setBounds(0, 11, 397, 32);
			contentPanel.add(label);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
				okButton.setIcon(new ImageIcon(MyDialog3.class.getResource("/Pictures/green_globe_ok_tic_584.png")));
				okButton.setActionCommand("OK");
				okButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String text1 = textField.getText();
						String text2 = textField2.getText();
						String text3 = (String) cboDemo.getSelectedItem();
						String text4 = textField4.getText();
						String text5 = textField5.getText();
						
						String query = "Insert into employees values('"+text1+"','"+text2+"','"+text3+"','"+text4+"','"+text5+"')";
						MySQL.executeUpdate(query, conn);
						i.setVisible(false);

						try {
							String query8 = "Select name from employees;";
							ResultSet rs = MySQL.executeQuery(query8, conn);
							HRDialog.cb.removeAllItems();
							while(rs.next()){
								HRDialog.cb.addItem(rs.getString(1));
							}
							 
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
						
						
						
					}
					
				});
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("\u0386\u03BA\u03C5\u03C1\u03BF");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				cancelButton.setIcon(new ImageIcon(MyDialog3.class.getResource("/Pictures/error_button.png")));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

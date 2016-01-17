package com.HRManagement;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MyDialog2 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	protected Connection conn;

	MyDialog2 i = this;
	private JComboBox<String> ccb;

	/**
	 * Create the dialog.
	 */
	public MyDialog2() {
		conn = MySQL.connectDB();
		
		getContentPane().setLayout(null);
		setBounds(100, 100, 395, 187);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("\u0394\u0399\u0391\u0393\u03A1\u0391\u03A6\u0397 \u03A5\u03A0\u0391\u039B\u039B\u0397\u039B\u039F\u03A5");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(0, 11, 379, 32);
		contentPanel.add(label);
		
		JLabel label1 = new JLabel("\u039F\u039D\u039F\u039C\u0391\u03A4\u0395\u03A0\u03A9\u039D\u03A5\u039C\u039F:");
		label1.setBounds(10, 54, 164, 24);
		contentPanel.add(label1);
		
		ccb = new JComboBox<String>();
		ccb.setBounds(154, 56, 202, 20);
		contentPanel.add(ccb);

		try {
			String query = "Select name from employees;";
			ResultSet rs = MySQL.executeQuery(query, conn);
			while(rs.next()){
				ccb.addItem(rs.getString(1));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("\u0395\u03BD\u03C4\u03AC\u03BE\u03B5\u03B9");
				okButton.setIcon(new ImageIcon(MyDialog2.class.getResource("/Pictures/green_globe_ok_tic_584.png")));
				okButton.setActionCommand("OK");
				okButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String text33 = (String) ccb.getSelectedItem();

						String query = "Delete from employees where name = '"+text33+"' ";
						MySQL.executeUpdate(query, conn);
						i.setVisible(false);
					}
					
				});
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("\u0386\u03BA\u03C5\u03C1\u03BF");
				cancelButton.setIcon(new ImageIcon(MyDialog2.class.getResource("/Pictures/error_button.png")));
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

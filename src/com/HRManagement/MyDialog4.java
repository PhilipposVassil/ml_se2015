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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class MyDialog4 extends JDialog {
	static JComboBox<String> cb;
	private JComboBox<String> cbb;
	static String onoma="";
	
	protected Connection conn;
	
	MyDialog4 i = this;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JLabel label1;


	/**
	 * Create the dialog.
	 */
	public MyDialog4() {
		
		conn = MySQL.connectDB();
		
		setVisible(true);
		setTitle("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03C9\u03BD \u03A5\u03C0\u03B1\u03BB\u03BB\u03AE\u03BB\u03BF\u03C5");
		
		
		
		
		//setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 321);
		
		
		
		
		
		setBounds(100, 100, 467, 321);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setAutoscrolls(true);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel cboo = new JLabel("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7 \u039F\u03BD\u03BF\u03BC\u03B1\u03C4\u03BF\u03C2 \u03A5\u03C0\u03B1\u03BB\u03BB\u03AE\u03BB\u03BF\u03C5:");
		cboo.setBounds(10, 11, 214, 26);
		cboo.setBackground(Color.WHITE);
		contentPanel.add(cboo);
		
		
		
		
		{

			cb = new JComboBox<String>();
			cb.setBounds(10, 38, 294, 23);
			contentPanel.add(cb);
			
			JLabel lblNewLabel = new JLabel("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03C9\u03BD \u0395\u03C0\u03B9\u03BB\u03B5\u03B3\u03BC\u03AD\u03BD\u03BF\u03C5 \u03A5\u03C0\u03B1\u03BB\u03BB\u03AE\u03BB\u03BF\u03C5");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(10, 111, 420, 14);
			contentPanel.add(lblNewLabel);
			
			JLabel label = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1\u03C4\u03B5\u03C0\u03C9\u03BD\u03C5\u03BC\u03BF :");
			label.setBounds(10, 136, 175, 14);
			contentPanel.add(label);
			
			JLabel label1 = new JLabel("\u03A4\u03BC\u03B7\u03BC\u03B1 \u0395\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1\u03C2 :");
			label1.setBounds(10, 156, 175, 14);
			contentPanel.add(label1);
			
			JLabel label2 = new JLabel("\u0391\u03A6\u039C :");
			label2.setBounds(10, 176, 175, 14);
			contentPanel.add(label2);
			
			JLabel label3 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03B9\u03B1 \u0393\u03B5\u03BD\u03BD\u03B7\u03C3\u03B5\u03C9\u03C2 :");
			label3.setBounds(10, 196, 175, 14);
			contentPanel.add(label3);
			
			JLabel label4 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03B9\u03B1 \u03A0\u03C1\u03BF\u03C3\u03BB\u03B7\u03C8\u03B7\u03C2 :");
			label4.setBounds(10, 216, 175, 14);
			contentPanel.add(label4);
			
			textField = new JTextField();
			textField.setBackground(Color.WHITE);
			textField.setBounds(203, 133, 227, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
			
			textField2 = new JTextField();
			textField2.setBackground(Color.WHITE);
			textField2.setBounds(203, 173, 227, 20);
			contentPanel.add(textField2);
			textField2.setColumns(10);
			
			textField3 = new JTextField();
			textField3.setBackground(Color.WHITE);
			textField3.setBounds(203, 193, 227, 20);
			contentPanel.add(textField3);
			textField3.setColumns(10);
			
			textField4 = new JTextField();
			textField4.setBackground(Color.WHITE);
			textField4.setBounds(203, 213, 227, 20);
			contentPanel.add(textField4);
			textField4.setColumns(10);
				
			try {
				String query = "Select name from employees;";
				ResultSet rs = MySQL.executeQuery(query, conn);
				while(rs.next()){
					cb.addItem(rs.getString(1));
				}
				 
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		
		{
			cbb = new JComboBox<String>();
			cbb.setToolTipText("");
			cbb.setName("");
			cbb.setBounds(203, 153, 226, 20);
			contentPanel.add(cbb);

			try {
				String query = "Select name from divisions;";
				ResultSet rs9 = MySQL.executeQuery(query, conn);
				while(rs9.next()){
					cbb.addItem(rs9.getString(1));
				}
				cbb.setSelectedIndex(-1);	 
					
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
}
		
		{
			label1 = new JLabel("");
			label1.setToolTipText("\u0393\u03B9\u03B1 \u03C0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u03C4\u03BF\u03C5 \u03AE\u03B4\u03B7 \u03BA\u03B1\u03C4\u03B1\u03C7\u03C9\u03C1\u03B7\u03BC\u03AD\u03BD\u03BF\u03C5 \u03C4\u03BC\u03AE\u03BC\u03B1\u03C4\u03BF\u03C2, \u03BC\u03B5\u03C4\u03B1\u03BA\u03B9\u03BD\u03AE\u03C3\u03C4\u03B5 \u03C4\u03BF \u03B2\u03B5\u03BB\u03AC\u03BA\u03B9 \u03B5\u03C0\u03AC\u03BD\u03C9 \u03C3\u03C4\u03BF \u03C0\u03B5\u03B4\u03AF\u03BF");
			label1.setIcon(new ImageIcon(MyDialog4.class.getResource("/Pictures/information.png")));
			label1.setBounds(432, 147, 23, 32);
			contentPanel.add(label1);
			label1.setVisible(false);
			
		}
		
		
		JButton button = new JButton("\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03C9\u03BD \u03C0\u03C1\u03BF\u03C2 \u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label1.setVisible(true);
				Object text30 = cb.getSelectedItem();

				try {

					String query1 = "Select * from employees where name='"+text30+"';";
					ResultSet rs1 = MySQL.executeQuery(query1, conn);
					while(rs1.next())
					{
						textField.setText(rs1.getString(1));
						cbb.setToolTipText(rs1.getString(3));
						textField2.setText(rs1.getString(5));
						textField3.setText(rs1.getString(2));
						textField4.setText(rs1.getString(4));
						onoma = rs1.getString(1) ;

					}  
						
					 
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(10, 72, 260, 23);
		contentPanel.add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MyDialog4.class.getResource("/Pictures/person_edit.png")));
		label.setBounds(314, 0, 126, 118);
		contentPanel.add(label);
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnSave = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
											
					String query10 = "Delete from employees where name='"+onoma+"' ";
					MySQL.executeUpdate(query10, conn);
					
					String text1 = textField.getText();
					String text2 = textField2.getText();
					String text3 = (String) cbb.getSelectedItem();
					String text4 = textField3.getText();
					String text5 = textField4.getText();
					
					String query = "Insert into employees values('"+text1+"','"+text4+"','"+text3+"','"+text5+"','"+text2+"')";
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
			btnSave.setIcon(new ImageIcon(MyDialog4.class.getResource("/Pictures/floppy-disk-icon.png")));
			buttonPane.add(btnSave);
			{
				JButton cancelButton = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
				cancelButton.setIcon(new ImageIcon(HRDialog.class.getResource("/Pictures/error_button.png")));
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

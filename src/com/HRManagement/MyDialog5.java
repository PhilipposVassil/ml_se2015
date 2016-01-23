package com.HRManagement;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class MyDialog5 extends JDialog {
	static JComboBox<String> cb;
	static String onoma="";
	static String axiol="";
	private JTextPane textPane;
	
	protected Connection conn;

	MyDialog5 i = this;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;


	/**
	 * Create the dialog.
	 */
	public MyDialog5(int permission) {
		
		conn = MySQL.connectDB();
		
		setVisible(true);
		setTitle("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03C9\u03BD \u03A5\u03C0\u03B1\u03BB\u03BB\u03AE\u03BB\u03BF\u03C5");
		
		
		
		
		//setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 365);
		
		
		
		
		
		setBounds(100, 100, 467, 365);
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
			
			JLabel label1 = new JLabel("\u0391\u03BE\u03B9\u03BF\u03BB\u03CC\u03B3\u03B7\u03C3\u03B7 \u03A5\u03C0\u03B1\u03BB\u03BB\u03AE\u03BB\u03BF\u03C5 : ");
			label1.setBounds(10, 170, 175, 14);
			contentPanel.add(label1);
			
			textPane = new JTextPane();
			textPane.setBounds(203, 170, 227, 80);
			contentPanel.add(textPane);
			
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBackground(Color.WHITE);
			textField.setBounds(203, 133, 227, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
				
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
		
		
		
		
		JButton button = new JButton("\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03C9\u03BD \u03C0\u03C1\u03BF\u03C2 \u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object text30 = cb.getSelectedItem();
				

				try {
					String query1 = "Select * from employees where name='"+text30+"';";
					ResultSet rs1 = MySQL.executeQuery(query1, conn);
					while(rs1.next())
					{
						textField.setText(rs1.getString(1));
						onoma = rs1.getString(1) ;
					}  
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				

				try {
					String query12 = "Select * from report where name='"+text30+"';";
					ResultSet rs1 = MySQL.executeQuery(query12, conn);
					while(rs1.next())
					{
						textPane.setText(rs1.getString(2));
						axiol = rs1.getString(2) ;
					}
						
					 
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
		
			}
		}
				
);
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
					
					if(textField.getText().equals("")){
						JOptionPane.showMessageDialog(null, "Δεν καταχωρήθηκαν δεδομένα");
						//btnSave.setEnabled(false);
					}else{
						String query80 = "Delete from report where name='"+onoma+"' ";
						MySQL.executeUpdate(query80, conn);
										
						String text4 = textPane.getText();
						String text1 = textField.getText();
						
						String query = "Insert into report values('"+text1+"','"+text4+"')";
						boolean saved = MySQL.executeUpdate(query, conn);
						//i.setVisible(false);
						if (saved){
							JOptionPane.showMessageDialog(contentPanel,"Αποθηκεύτικε επιτυχώς!","Info",JOptionPane.INFORMATION_MESSAGE);
						}else{
							JOptionPane.showMessageDialog(contentPanel,"Αποτυχία Αποθήκευσης!","Error",JOptionPane.ERROR_MESSAGE);
						}
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
						if (permission == 2){
							HRDialog hr =  new HRDialog(2);
							hr.setVisible(true);
						}else{
							ProistamenosDialog pr = new ProistamenosDialog(1);
							pr.setVisible(true);
						}
						i.setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}	
}

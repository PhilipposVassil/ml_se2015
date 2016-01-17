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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MyDialog1 extends JDialog {
	private JLabel label1;
	private JLabel label;
	private JComboBox<String> comboBox ;
	private final JPanel contentPanel = new JPanel();
	
	protected Connection conn;

	MyDialog1 i = this;

	/**
	 * Create the dialog.
	 */
	public MyDialog1() {
		conn = MySQL.connectDB();
		
		setBounds(100, 100, 391, 205);
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
				JLabel label = new JLabel("\u039F\u039D\u039F\u039C\u0391 \u03A4\u039C\u0397\u039C\u0391\u03A4\u039F\u03A3:");
				label.setBounds(10, 9, 164, 24);
				panel.add(label);
			}
			
			label = new JLabel("\u0394\u03B5\u03BD \u03B5\u03B9\u03BD\u03B1\u03B9 \u03B5\u03C6\u03B9\u03BA\u03C4\u03B7 \u03B7 \u03B4\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03B7 \u03C4\u03BF\u03C5 \u03C4\u03BC\u03B7\u03BC\u03B1\u03C4\u03BF\u03C2.");
			label.setForeground(Color.RED);
			label.setBounds(10, 41, 253, 24);
			panel.add(label);
			label.setVisible(false);
			
			label1 = new JLabel("\u03A5\u03C0\u03B1\u03C1\u03C7\u03BF\u03C5\u03BD \u03B5\u03BD\u03B5\u03C1\u03B3\u03BF\u03B9 \u03C7\u03C1\u03B7\u03C3\u03C4\u03B5\u03C2 \u03BA\u03B1\u03C4\u03B1\u03C7\u03C9\u03C1\u03B7\u03BC\u03B5\u03BD\u03BF\u03B9.");
			label1.setForeground(Color.RED);
			label1.setBounds(10, 62, 253, 14);
			panel.add(label1);
			label1.setVisible(false);
			
			comboBox = new JComboBox<String>();
			comboBox.setBounds(141, 11, 199, 20);
			panel.add(comboBox);
			

			try {
				String query = "Select name from divisions;";
				ResultSet rs = MySQL.executeQuery(query, conn);
					while(rs.next()){comboBox.addItem(rs.getString(1));}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		{
			JLabel label = new JLabel("\u0394\u0399\u0391\u0393\u03A1\u0391\u03A6\u0397 \u03A4\u039C\u0397\u039C\u0391\u03A4\u039F\u03A3");
			label.setBounds(0, 11, 375, 32);
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
				okButton.setIcon(new ImageIcon(MyDialog1.class.getResource("/Pictures/green_globe_ok_tic_584.png")));
				okButton.setActionCommand("OK");
				okButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						
						// TODO Auto-generated method stub
						String text300 = (String) comboBox.getSelectedItem();
						
						try {
							String query5 = "SELECT * from employees where division='"+text300+"';";
							ResultSet rs5 = MySQL.executeQuery(query5, conn);
							if (!rs5.next()){
								String query = "Delete from divisions where name='"+text300+"' ";
								MySQL.executeUpdate(query, conn);
								i.setVisible(false); 
							}
							else {			
								label1.setVisible(true);
								label.setVisible(true);
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
				cancelButton.setIcon(new ImageIcon(MyDialog1.class.getResource("/Pictures/error_button.png")));
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
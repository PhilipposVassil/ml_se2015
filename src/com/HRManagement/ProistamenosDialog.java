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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class ProistamenosDialog extends JDialog {
	static JComboBox<String> cb;
	protected Connection conn;

	ProistamenosDialog i = this;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;


	/**
	 * Create the dialog.
	 */
	public ProistamenosDialog(int permission) {
		
		conn = MySQL.connectDB();
		
		setVisible(true);
		setTitle("\u03A3\u03CD\u03C3\u03C4\u03B7\u03BC\u03B1 \u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B7\u03C3\u03B7\u03C2 \u03A0\u03C1\u03BF\u03C3\u03C9\u03C0\u03B9\u03BA\u03BF\u03CD \u0395\u03C4\u03B1\u03B9\u03C1\u03AF\u03B1\u03C2");
		
		
		
		
		//setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 355);
		
		JMenuBar menuBar1 = new JMenuBar();
		menuBar1.setBackground(Color.WHITE);
		setJMenuBar(menuBar1);
		
		JMenu menu = new JMenu("");
		menuBar1.add(menu);
		
		JMenu mnNewMenu1 = new JMenu("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B7\u03C3\u03B7 \u03A0\u03C1\u03BF\u03C3\u03C9\u03C0\u03B9\u03BA\u03BF\u03CD");
		menuBar1.add(mnNewMenu1);
		
		JMenuItem menuItem1 = new JMenuItem("\u0391\u03BE\u03B9\u03BF\u03BB\u03CC\u03B3\u03B9\u03C3\u03B7 \u03A5\u03C0\u03B1\u03BB\u03BB\u03AE\u03BB\u03BF\u03C5");
		menuItem1.setIcon(new ImageIcon(ProistamenosDialog.class.getResource("/Pictures/Star-Full.png")));
		menuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyDialog5 jdo = new MyDialog5(permission);
				jdo.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu1.add(menuItem1);
		
		
		
		
		
		
		
		
		JMenu mnNewMenu2 = new JMenu("   \u0392\u03BF\u03AE\u03B8\u03B5\u03B9\u03B1");
		menuBar1.add(mnNewMenu2);
		
		JMenuItem mntmNewMenuItem4 = new JMenuItem("\u03A0\u03B5\u03C1\u03B9\u03B5\u03C7\u03CC\u03BC\u03B5\u03BD\u03B1 \u0392\u03BF\u03AE\u03B8\u03B5\u03B9\u03B1\u03C2");
		mntmNewMenuItem4.setIcon(new ImageIcon(HRDialog.class.getResource("/Pictures/questionMarkIcon.png")));
		mnNewMenu2.add(mntmNewMenuItem4);
		mntmNewMenuItem4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Help jd = new Help();
				jd.setVisible(true);
				
			}
		});
		
		JMenuItem mntmNewMenuItem5 = new JMenuItem("\u039F\u03B4\u03B7\u03B3\u03B5\u03AF\u03B5\u03C2 \u03A7\u03C1\u03AE\u03C3\u03B7\u03C2");
		mntmNewMenuItem5.setIcon(new ImageIcon(HRDialog.class.getResource("/Pictures/manual.PNG")));
		mnNewMenu2.add(mntmNewMenuItem5);
		mntmNewMenuItem5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manual2 jdoo = new Manual2();
				jdoo.setVisible(true);
				
			}
		});
		
		JSeparator separator = new JSeparator();
		mnNewMenu2.add(separator);
		
		JMenuItem menuItem = new JMenuItem("\u03A3\u03C7\u03B5\u03C4\u03B9\u03BA\u03AC \u03BC\u03B5 \u03C4\u03BF \u03C0\u03C1\u03CC\u03B3\u03C1\u03B1\u03BC\u03BC\u03B1");
		menuItem.setIcon(new ImageIcon(HRDialog.class.getResource("/Pictures/20131015050010!Home-icon.png")));
		mnNewMenu2.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs jd = new AboutUs();
				jd.setVisible(true);
				
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		menuBar1.add(menuBar);
		menuBar.setBackground(Color.WHITE);
		
		
		
		
		
		setBounds(100, 100, 456, 355);
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
			cb.setBounds(10, 38, 227, 23);
			contentPanel.add(cb);
			JLabel lblNewLabel1 = new JLabel("");
			lblNewLabel1.setIcon(new ImageIcon(HRDialog.class.getResource("/Pictures/person.png")));
			lblNewLabel1.setBounds(319, 0, 111, 114);
			contentPanel.add(lblNewLabel1);
			
			
			JLabel lblNewLabel = new JLabel("\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03B9\u03B1 \u0395\u03C0\u03B9\u03BB\u03B5\u03B3\u03BC\u03B5\u03BD\u03BF\u03C5 \u03A5\u03C0\u03B1\u03BB\u03BB\u03B7\u03BB\u03BF\u03C5");
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
			textField.setEditable(false);
			textField.setBounds(203, 133, 227, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
			
			textField1 = new JTextField();
			textField1.setBackground(Color.WHITE);
			textField1.setEditable(false);
			textField1.setBounds(203, 153, 227, 20);
			contentPanel.add(textField1);
			textField1.setColumns(10);
			
			textField2 = new JTextField();
			textField2.setBackground(Color.WHITE);
			textField2.setEditable(false);
			textField2.setBounds(203, 173, 227, 20);
			contentPanel.add(textField2);
			textField2.setColumns(10);
			
			textField3 = new JTextField();
			textField3.setBackground(Color.WHITE);
			textField3.setEditable(false);
			textField3.setBounds(203, 193, 227, 20);
			contentPanel.add(textField3);
			textField3.setColumns(10);
			
			textField4 = new JTextField();
			textField4.setBackground(Color.WHITE);
			textField4.setEditable(false);
			textField4.setBounds(203, 213, 227, 20);
			contentPanel.add(textField4);
			textField4.setColumns(10);
				

			try {
				String query = "Select name from employees;";
				ResultSet rs = MySQL.executeQuery(query, conn);
					while(rs.next()){cb.addItem(rs.getString(1));}
					
				 
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		JButton button = new JButton("\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03C9\u03BD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object text30 = cb.getSelectedItem();
				
				try {
					String query1 = "Select * from employees where name='"+text30+"';";
					ResultSet rs1 = MySQL.executeQuery(query1, conn);
						while(rs1.next())
						{
							textField.setText(rs1.getString(1));
							textField1.setText(rs1.getString(3));
							textField2.setText(rs1.getString(5));
							textField3.setText(rs1.getString(2));
							textField4.setText(rs1.getString(4));

						}  
						
					 
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(10, 72, 146, 23);
		contentPanel.add(button);
		
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnSave = new JButton("\u0391\u03BD\u03B1\u03BD\u03AD\u03C9\u03C3\u03B7");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("");
					textField1.setText("");
					textField2.setText("");
					textField3.setText("");
					textField4.setText("");
					
				}
			});
			btnSave.setIcon(new ImageIcon(HRDialog.class.getResource("/Pictures/Refresh.png")));
			buttonPane.add(btnSave);
			{
				JButton cancelButton = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
				cancelButton.setIcon(new ImageIcon(HRDialog.class.getResource("/Pictures/error_button.png")));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						MainFrame iq = new MainFrame();
						iq.setVisible(true);
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
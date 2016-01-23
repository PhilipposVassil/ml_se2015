package com.HRManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField1;
	JTextArea txtAr = new JTextArea();
	
	MainFrame i = this;
	
	public MainFrame(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03A7\u03C1\u03AE\u03C3\u03C4\u03B7 :");
		lblNewLabel.setBounds(22, 57, 101, 30);
		contentPane.add(lblNewLabel);
		
		final JLabel lblNewLabel1 = new JLabel("\u039A\u03C9\u03B4\u03B9\u03BA\u03CC\u03C2 \u03A7\u03C1\u03AE\u03C3\u03C4\u03B7 :");
		lblNewLabel1.setBounds(22, 98, 101, 30);
		contentPane.add(lblNewLabel1);
		
		textField = new JTextField();
		textField.setBounds(121, 57, 144, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField1 = new JPasswordField();
		textField1.setBounds(121, 98, 144, 30);
		contentPane.add(textField1);
		textField1.setColumns(10);
		this.setVisible(true);
		

		
		
		JButton btnLogin = new JButton("\u0395\u03AF\u03C3\u03BF\u03B4\u03BF\u03C2");
		btnLogin.setIcon(new ImageIcon(MainApp.class.getResource("/Pictures/green_globe_ok_tic_584.png")));
		
		
		txtAr.setEditable(false);
		txtAr.setForeground(new Color(255, 0, 0));
		txtAr.setText("\u03A4\u03BF \u03CC\u03BD\u03BF\u03BC\u03B1 \u03C7\u03C1\u03AE\u03C3\u03C4\u03B7 \u03AE \u03BF \u03BA\u03C9\u03B4\u03B9\u03BA\u03BF\u03C2 \u03B5\u03AF\u03BD\u03B1\u03B9 \u03BB\u03AC\u03B8\u03BF\u03C2.\r\n\u0394\u03BF\u03BA\u03B9\u03BC\u03AC\u03C3\u03C4\u03B5 \u03BE\u03B1\u03BD\u03AC.");
		txtAr.setBackground(SystemColor.control);
		txtAr.setBounds(22, 139, 243, 37);
		contentPane.add(txtAr);
		txtAr.setVisible(false);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = textField.getText();
				String password = textField1.getText();
				
				UserController us = new UserController();
				
				boolean checkuser = us.checkUser(username,password);
				String permission = us.getPermission(username);
				
				if(checkuser){
					txtAr.setVisible(false);
				}else{
					txtAr.setVisible(true);
				}
				
				if(permission=="Proistamenos"){					
					new ProistamenosDialog(1);
					i.setVisible(false);
				}else if(permission=="HR"){
					new HRDialog(2);
					i.setVisible(false);
				}
			}
		});
		btnLogin.setBounds(157, 177, 108, 30);
		contentPane.add(btnLogin);
		
		
		JLabel label = new JLabel("\u03A3\u03A5\u03A3\u03A4\u0397\u039C\u0391 \u0394\u0399\u0391\u03A7\u0395\u0399\u03A1\u0397\u03A3\u0397\u03A3 \u03A0\u03A1\u039F\u03A3\u03A9\u03A0\u0399\u039A\u039F\u03A5 \u0395\u03A4\u0391\u0399\u03A1\u0395\u0399\u0391\u03A3");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calibri", Font.PLAIN, 15));
		label.setBounds(0, 0, 306, 46);
		contentPane.add(label);
	
	}
	
}

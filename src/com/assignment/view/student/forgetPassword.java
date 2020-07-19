package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.assignment.view.Mainpage;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class forgetPassword extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JLabel lblStudentIdIs;
	static Mainpage mp = new Mainpage();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					forgetPassword frame = new forgetPassword();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public forgetPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 516);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(296, 194, 237, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewPassword.setBounds(74, 266, 175, 34);
		contentPane.add(lblNewPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setFont(new Font("Dialog", Font.BOLD, 18));
		lblConfirmPassword.setBounds(74, 329, 204, 34);
		contentPane.add(lblConfirmPassword);
		
		JLabel lblPcpsId = new JLabel("PCPS ID:");
		lblPcpsId.setFont(new Font("Dialog", Font.BOLD, 18));
		lblPcpsId.setBounds(74, 192, 187, 34);
		contentPane.add(lblPcpsId);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(296, 268, 237, 34);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(296, 331, 237, 34);
		contentPane.add(passwordField_1);
		
		lblStudentIdIs = new JLabel("**Student ID is your clz ID Number**");
		lblStudentIdIs.setFont(new Font("Dialog", Font.BOLD, 18));
		lblStudentIdIs.setBounds(105, 134, 401, 34);
		contentPane.add(lblStudentIdIs);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//database code here...
				
				
				mp.setVisible(true);
				disposePage();
				
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBounds(296, 413, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mp.setVisible(true);
				disposePage();
				
			}
		});
		btnCancel.setFont(new Font("Dialog", Font.BOLD, 15));
		btnCancel.setBounds(429, 413, 103, 25);
		contentPane.add(btnCancel);
		
		JLabel Pcpslogo = new JLabel("");
		Pcpslogo.setIcon(new ImageIcon("/home/lazyprogrammer21/git/PCPSkiosk/images/pcpslogo.jpg"));
		Pcpslogo.setBounds(34, 12, 177, 97);
		contentPane.add(Pcpslogo);
		
		JLabel Uoblogo = new JLabel("");
		Uoblogo.setIcon(new ImageIcon("/home/lazyprogrammer21/git/PCPSkiosk/images/uoblogo.jpg"));
		Uoblogo.setBounds(356, 12, 177, 97);
		contentPane.add(Uoblogo);
	}
	void disposePage() {
		forgetPassword.this.dispose();
	}
}

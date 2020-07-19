package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class changeAdminKey extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changeAdminKey frame = new changeAdminKey();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public changeAdminKey() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 524);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Pcpslogo = new JLabel("");
		Pcpslogo.setIcon(new ImageIcon("/home/lazyprogrammer21/git/PCPSkiosk/images/pcpslogo.jpg"));
		Pcpslogo.setBounds(66, 12, 177, 97);
		contentPane.add(Pcpslogo);
		
		JLabel Uoblogo = new JLabel("");
		Uoblogo.setIcon(new ImageIcon("/home/lazyprogrammer21/git/PCPSkiosk/images/uoblogo.jpg"));
		Uoblogo.setBounds(388, 12, 177, 97);
		contentPane.add(Uoblogo);
		
		JLabel lblNewKey = new JLabel("New Key:");
		lblNewKey.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewKey.setBounds(66, 183, 175, 34);
		contentPane.add(lblNewKey);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(288, 185, 237, 34);
		contentPane.add(passwordField);
		
		JLabel lblConfirmKey = new JLabel("Confirm Key:");
		lblConfirmKey.setFont(new Font("Dialog", Font.BOLD, 18));
		lblConfirmKey.setBounds(66, 246, 204, 34);
		contentPane.add(lblConfirmKey);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(288, 248, 237, 34);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//database ma gayerw data store garne
				JOptionPane.showMessageDialog(null, "Success");
				changeAdminKey.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBounds(288, 330, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				changeAdminKey.this.dispose();
			}
		});
		btnCancel.setFont(new Font("Dialog", Font.BOLD, 15));
		btnCancel.setBounds(421, 330, 103, 25);
		contentPane.add(btnCancel);
	}
}

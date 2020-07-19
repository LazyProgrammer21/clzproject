package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addSubject extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					addSubject frame = new addSubject();
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
	public addSubject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 426);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUniversityId = new JLabel("Description");
		lblUniversityId.setFont(new Font("Dialog", Font.BOLD, 16));
		lblUniversityId.setBounds(60, 220, 134, 15);
		contentPane.add(lblUniversityId);
		
		JLabel lblStudentName = new JLabel("Subject Name");
		lblStudentName.setFont(new Font("Dialog", Font.BOLD, 16));
		lblStudentName.setBounds(60, 63, 134, 15);
		contentPane.add(lblStudentName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(212, 57, 239, 30);
		contentPane.add(textField);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(212, 117, 239, 218);
		contentPane.add(textArea);
		
		JButton btnOk = new JButton("Cancel");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addSubject.this.dispose();
			}
		});
		btnOk.setBounds(334, 368, 117, 25);
		contentPane.add(btnOk);
		
		JButton btnOk_1 = new JButton("OK");
		btnOk_1.setBounds(212, 368, 117, 25);
		contentPane.add(btnOk_1);
	}
}

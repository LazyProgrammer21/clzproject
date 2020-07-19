package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class passwordinfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					passwordinfo frame = new passwordinfo();
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
	public passwordinfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 403);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordinfo.this.dispose();
			}
		
		});
		btnOk.setBounds(188, 329, 103, 25);
		contentPane.add(btnOk);
		
		JTextArea txtrBeBetween = new JTextArea();
		txtrBeBetween.setFont(new Font("Dialog", Font.BOLD, 18));
		txtrBeBetween.setText("Be between 8 and 40 characters long\n\nContain at least one digit.\n\nContain at least one lower case character.\n\nContain at least one upper case character.\n\nContain at least on special character from [ @ # $ % ! . ].");
		txtrBeBetween.setLineWrap(true);
		txtrBeBetween.setRows(10);
		txtrBeBetween.setBounds(46, 12, 385, 305);
		contentPane.add(txtrBeBetween);
	}
}

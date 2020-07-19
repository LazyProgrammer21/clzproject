package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class issueFeedback extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					issueFeedback frame = new issueFeedback();
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
	public issueFeedback() {
		setTitle("Provide Feedback");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 438);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(7);
		textArea.setLineWrap(true);
		textArea.setBounds(171, 61, 422, 40);
		contentPane.add(textArea);
		
		JLabel label = new JLabel("SUBJECT:");
		label.setFont(new Font("Dialog", Font.BOLD, 17));
		label.setBounds(27, 79, 110, 22);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("Description");
		label_2.setFont(new Font("Dialog", Font.BOLD, 17));
		label_2.setBounds(27, 181, 110, 22);
		contentPane.add(label_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setRows(7);
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(171, 113, 422, 184);
		contentPane.add(textArea_1);
		
		JButton button = new JButton("Upload");
		button.setFont(new Font("Dialog", Font.PLAIN, 18));
		button.setBounds(476, 309, 117, 22);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		button_1.setBounds(347, 310, 117, 27);
		contentPane.add(button_1);
	}

}

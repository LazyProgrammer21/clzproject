package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class addRoutine extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addRoutine frame = new addRoutine();
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
	public addRoutine() {
		setTitle("Add Routine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 514);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblTime.setBounds(87, 180, 70, 27);
		contentPane.add(lblTime);
		
		JLabel lblLecture = new JLabel("Lecture");
		lblLecture.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblLecture.setBounds(374, 180, 105, 27);
		contentPane.add(lblLecture);
		
		JLabel lblamam = new JLabel("8:00am -9:00am");
		lblamam.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblamam.setBounds(87, 232, 192, 27);
		contentPane.add(lblamam);
		
		JLabel lblamam_1 = new JLabel("9:00am -10:00am");
		lblamam_1.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblamam_1.setBounds(87, 276, 204, 27);
		contentPane.add(lblamam_1);
		
		JLabel lblamam_2 = new JLabel("10:00am -11:00am");
		lblamam_2.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblamam_2.setBounds(87, 315, 216, 27);
		contentPane.add(lblamam_2);
		
		JLabel lblampm = new JLabel("11:00am -12:00pm");
		lblampm.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblampm.setBounds(87, 354, 216, 31);
		contentPane.add(lblampm);
		
		JLabel lblampm_1 = new JLabel("12:00am -1:00pm");
		lblampm_1.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblampm_1.setBounds(87, 397, 216, 31);
		contentPane.add(lblampm_1);
		
		JComboBox <String>comboBox = new JComboBox<String>();
		comboBox.setEditable(true);
		comboBox.addItem("Bsc CS & SE");
		comboBox.addItem("BBA");
		comboBox.setSelectedItem("Select Subject");
		comboBox.setBounds(72, 81, 125, 24);
		contentPane.add(comboBox);
		
		JComboBox <String>comboBox_1 = new JComboBox<String>();
		comboBox_1.setEditable(true);
		comboBox_1.addItem("L4S1");
		comboBox_1.addItem("L4S2");
		comboBox_1.addItem("L5S1");
		comboBox_1.addItem("L5S2");
		comboBox_1.addItem("L6S1");
		comboBox_1.addItem("L6S2");
		comboBox_1.setSelectedItem("Select level");
		comboBox_1.setBounds(215, 81, 125, 24);
		contentPane.add(comboBox_1);
		
		JComboBox <String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setEditable(true);
		comboBox_2.addItem("Section A");
		comboBox_2.addItem("Section B");
		comboBox_2.setSelectedItem("Select Section");
		comboBox_2.setBounds(366, 81, 137, 24);
		contentPane.add(comboBox_2);
		
		JComboBox <String>comboBox_3 = new JComboBox<String>();
		comboBox_3.setEditable(true);
		comboBox_3.addItem("Sunday");
		comboBox_3.addItem("Monday");
		comboBox_3.addItem("Tuesday");
		comboBox_3.addItem("Wednesday");
		comboBox_3.addItem("Thursday");
		comboBox_3.addItem("Friday");
		comboBox_3.setSelectedItem("Select Day");
		comboBox_3.setBounds(532, 81, 120, 24);
		contentPane.add(comboBox_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField.setBounds(365, 225, 192, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(365, 269, 192, 34);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(365, 304, 192, 34);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(365, 351, 192, 34);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(365, 397, 192, 34);
		contentPane.add(textField_4);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(647, 360, 99, 25);
		contentPane.add(btnUpload);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(647, 385, 99, 25);
		contentPane.add(btnCancel);
	}
}

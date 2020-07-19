package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JButton;

public class RoutineDashboardAdmin extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					RoutineDashboardAdmin frame = new RoutineDashboardAdmin();
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
	public RoutineDashboardAdmin() {
//		setTitle("Routine CRUD");
		setBounds(0, 0, 966, 546);
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setSize(1344, 668);	
		
		getContentPane().setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setEditable(true);
		comboBox.addItem("BBA");
		comboBox.addItem("Bsc CS&SE");
		comboBox.setSelectedItem("Filter by Subject");
		comboBox.setBounds(298, 178, 149, 24);
		getContentPane().add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setEditable(true);
//		comboBox_1.addItem("Sunday");
		comboBox_1.addItem("Monday");
		comboBox_1.addItem("Tuesday");
		comboBox_1.addItem("Wednesday");
		comboBox_1.addItem("Thursday");
		comboBox_1.addItem("Friday");
		comboBox_1.setSelectedItem("Filter by Day");
		comboBox_1.setBounds(465, 178, 125, 24);
		getContentPane().add(comboBox_1);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setEditable(true);
		comboBox_2.addItem("L4S1");
		comboBox_2.addItem("L4S2");
		comboBox_2.addItem("L5S1");
		comboBox_2.addItem("L5S2");
		comboBox_2.addItem("L6S1");
		comboBox_2.addItem("L6S2");
		comboBox_2.setSelectedItem("Filter by Semester");
		comboBox_2.setBounds(616, 178, 154, 24);
		
		getContentPane().add(comboBox_2);
		
		JComboBox<String> comboBox_3 = new JComboBox<String>();
		comboBox_3.setEditable(true);
		comboBox_3.addItem("Section A");
		comboBox_3.addItem("Section B");
		
		comboBox_3.setSelectedItem("Filter by Section");
		comboBox_3.setBounds(782, 178, 149, 24);
		getContentPane().add(comboBox_3);
		
		JLabel label = new JLabel("Time");
		label.setFont(new Font("Dialog", Font.PLAIN, 22));
		label.setBounds(337, 277, 70, 27);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Lecture");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_1.setBounds(624, 277, 105, 27);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("8:00am -9:00am");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_2.setBounds(337, 329, 192, 27);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("9:00am -10:00am");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_3.setBounds(337, 373, 204, 27);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("10:00am -11:00am");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_4.setBounds(337, 412, 216, 27);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("11:00am -12:00pm");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_5.setBounds(337, 451, 216, 31);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("12:00am -1:00pm");
		label_6.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_6.setBounds(337, 494, 216, 31);
		getContentPane().add(label_6);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(615, 494, 192, 34);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(615, 448, 192, 34);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(615, 401, 192, 34);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(615, 366, 192, 34);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(615, 322, 192, 34);
		getContentPane().add(textField_4);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.setBounds(897, 479, 99, 25);
		getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(897, 516, 99, 25);
		getContentPane().add(btnDelete);

	}

}

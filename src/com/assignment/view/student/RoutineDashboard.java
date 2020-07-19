package com.assignment.view.student;



import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class RoutineDashboard extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	public RoutineDashboard() {
		getContentPane().setBackground(Color.WHITE);
		setBounds(0, 0, 923, 548);
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setSize(1344, 668);	
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(218, 117, 858, 460);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Time");
		label.setFont(new Font("Dialog", Font.PLAIN, 22));
		label.setBounds(162, 149, 70, 27);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("8:00am -9:00am");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_1.setBounds(162, 201, 192, 27);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("9:00am -10:00am");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_2.setBounds(162, 245, 204, 27);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("10:00am -11:00am");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_3.setBounds(162, 284, 216, 27);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("11:00am -12:00pm");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_4.setBounds(162, 323, 216, 31);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("12:00am -1:00pm");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_5.setBounds(162, 366, 216, 31);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Lecture");
		label_6.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_6.setBounds(449, 149, 105, 27);
		panel_1.add(label_6);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(440, 194, 192, 34);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(440, 238, 192, 34);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(440, 273, 192, 34);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(440, 320, 192, 34);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(440, 366, 192, 34);
		panel_1.add(textField_4);
		
		JComboBox <String>comboBox_3 = new JComboBox<String>();
		comboBox_3.setEditable(true);
		comboBox_3.addItem("Sunday");
		comboBox_3.addItem("Monday");
		comboBox_3.addItem("Tuesday");
		comboBox_3.addItem("Wednesday");
		comboBox_3.addItem("Thursday");
		comboBox_3.addItem("Friday");
		comboBox_3.setSelectedItem("Select Day");
		comboBox_3.setBounds(256, 57, 237, 34);
		panel_1.add(comboBox_3);
		
		JLabel Uoblogo = new JLabel("");
		Uoblogo.setIcon(new ImageIcon("/home/lazyprogrammer21/git/PCPSkiosk/images/uoblogo.jpg"));
		Uoblogo.setBounds(1105, 12, 177, 97);
		getContentPane().add(Uoblogo);
		
		JLabel Pcpslogo = new JLabel("");
		Pcpslogo.setIcon(new ImageIcon("/home/lazyprogrammer21/git/PCPSkiosk/images/pcpslogo.jpg"));
		Pcpslogo.setBounds(12, 12, 177, 97);
		getContentPane().add(Pcpslogo);

	}
}

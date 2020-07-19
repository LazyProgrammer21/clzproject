package com.assignment.view.student;



import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import javax.swing.JRadioButton;

import com.assignment.model.studentinfo;
import com.assignment.service.studentService;
import com.assignment.service.studentserviceImpl;
import com.assignment.view.Mainpage;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentPersonalization extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField id;
	private JTextField name;
	private JTextField email;
	private JTextField city;
	private JTextField state;
	private JTextField zipcode;
	private JTextField phone;
	private JTextField totalnumbookevent;
	private BigInteger id1;
	studentService ss = new studentserviceImpl();

	public StudentPersonalization() {
	
		initialize();
	}

	public void initialize() {
		
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		
		setBounds(0, 0, 999, 562);
		setSize(1344, 668);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.GRAY);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		panel.setBounds(201, 103, 903, 496);
		getContentPane().add(panel);
		
		JLabel label = new JLabel("ID");
		label.setFont(new Font("FreeSans", Font.BOLD, 16));
		label.setBounds(188, 10, 70, 28);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_1.setBounds(188, 64, 70, 25);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("DOB");
		label_2.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_2.setBounds(188, 134, 70, 25);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Gender");
		label_3.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_3.setBounds(188, 159, 70, 25);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Add_city");
		label_4.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_4.setBounds(188, 196, 70, 25);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Address State");
		label_5.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_5.setBounds(188, 233, 121, 25);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("zipcode");
		label_6.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_6.setBounds(188, 270, 83, 25);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Phonen Number");
		label_7.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_7.setBounds(188, 319, 141, 25);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("level(CLass)");
		label_8.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_8.setBounds(188, 356, 94, 25);
		panel.add(label_8);
		
		JLabel label_10 = new JLabel("Email");
		label_10.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_10.setBounds(188, 91, 70, 31);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Subject");
		label_11.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_11.setBounds(188, 393, 100, 25);
		panel.add(label_11);
		
		id = new JTextField();
		id.setEditable(false);
		id.setText("No update");
		id.setColumns(10);
		id.setBounds(394, 12, 162, 24);
		panel.add(id);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(394, 51, 162, 24);
		panel.add(name);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(394, 87, 162, 24);
		panel.add(email);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(394, 185, 162, 24);
		panel.add(city);
		
		state = new JTextField();
		state.setColumns(10);
		state.setBounds(394, 233, 162, 24);
		panel.add(state);
		
		zipcode = new JTextField();
		zipcode.setColumns(10);
		zipcode.setBounds(394, 270, 162, 24);
		panel.add(zipcode);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(394, 320, 162, 24);
		panel.add(phone);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(391, 159, 70, 23);
		panel.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(466, 159, 90, 23);
		panel.add(female);
		
		JRadioButton other = new JRadioButton("Other");
		other.setBounds(564, 159, 90, 23);
		panel.add(other);
		
		JDateChooser dob = new JDateChooser();
		dob.setBounds(394, 123, 171, 28);
		panel.add(dob);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(394, 392, 162, 24);
		panel.add(comboBox);
		
		JButton update = new JButton("Update");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setValue();
			
			}
		});
		update.setBounds(588, 392, 117, 25);
		panel.add(update);
		
		JButton cancel = new JButton("Cancel");
		cancel.setBounds(588, 429, 117, 25);
		panel.add(cancel);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblSection.setBounds(188, 430, 100, 25);
		panel.add(lblSection);
		
		JLabel lblTotalBookedEvent = new JLabel("Total Booked Event");
		lblTotalBookedEvent.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblTotalBookedEvent.setBounds(188, 459, 156, 25);
		panel.add(lblTotalBookedEvent);
		
		totalnumbookevent = new JTextField();
		totalnumbookevent.setColumns(10);
		totalnumbookevent.setBounds(394, 464, 162, 24);
		panel.add(totalnumbookevent);
		
		JButton btnViewMyEvent = new JButton("View My event");
		btnViewMyEvent.setBounds(564, 463, 156, 25);
		panel.add(btnViewMyEvent);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(394, 360, 162, 24);
		panel.add(comboBox_1);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(394, 427, 162, 24);
		panel.add(comboBox_2);

	}
	private void setValue() {
	
		Mainpage mp = new Mainpage();
	
//		List<studentinfo> s_info = ss.getstudentDetailbyID(mp.settheclzid());
//		System.out.println(s_info);
	
	
	
		
	
		
	}
}

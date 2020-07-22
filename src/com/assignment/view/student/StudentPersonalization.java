package com.assignment.view.student;



import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.math.BigInteger;
import java.sql.Date;
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
	private BigInteger id1;
	private int gettheclzid;
	studentService ss = new studentserviceImpl();
	
	private JTextField dob1;

	public StudentPersonalization(int x) {
	gettheclzid=x;
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
		label.setBounds(191, 68, 70, 28);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_1.setBounds(191, 113, 70, 25);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("DOB");
		label_2.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_2.setBounds(191, 192, 70, 25);
		panel.add(label_2);
		
		JLabel label_4 = new JLabel("Add_city");
		label_4.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_4.setBounds(191, 240, 70, 25);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Address State");
		label_5.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_5.setBounds(191, 291, 121, 25);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("zipcode");
		label_6.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_6.setBounds(191, 328, 83, 25);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Phonen Number");
		label_7.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_7.setBounds(191, 377, 141, 25);
		panel.add(label_7);
		
		JLabel label_10 = new JLabel("Email");
		label_10.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_10.setBounds(191, 149, 70, 31);
		panel.add(label_10);
	
		id = new JTextField();
		id.setEditable(false);
		id.setColumns(10);
		id.setBounds(397, 70, 206, 24);
		panel.add(id);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(397, 109, 206, 24);
		panel.add(name);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(397, 145, 206, 24);
		panel.add(email);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(397, 243, 206, 24);
		panel.add(city);
		
		state = new JTextField();
		state.setColumns(10);
		state.setBounds(397, 291, 206, 24);
		panel.add(state);
		
		zipcode = new JTextField();
		zipcode.setColumns(10);
		zipcode.setBounds(397, 328, 206, 24);
		panel.add(zipcode);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(397, 378, 206, 24);
		panel.add(phone);
		
		JDateChooser dob = new JDateChooser();
		dob.setBounds(498, 189, 111, 28);
		panel.add(dob);
		
		JButton update = new JButton("Update");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				studentinfo sinfo = new studentinfo();
				
				sinfo.setName(name.getText());
				sinfo.setEmail(email.getText());
				sinfo.setDob(new Date(dob.getDate().getTime()));
				sinfo.setAdd_city(city.getText());
				sinfo.setAdd_state(	state.getText());
				sinfo.setPhone(phone.getText());
				sinfo.setZipCode(zipcode.getText());
				if(ss.updatestudentpersonaliztion(sinfo, gettheclzid)) {
					JOptionPane.showMessageDialog(null, "data updated Successfully");
				}
				else {
					JOptionPane.showMessageDialog(null, "update uncessfull");
				}
				
				
				
				
			
			}
		});
		update.setBounds(613, 340, 117, 25);
		panel.add(update);
		
		JButton cancel = new JButton("Cancel");
		cancel.setBounds(613, 377, 117, 25);
		panel.add(cancel);
		
		JButton btnView = new JButton("view");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setValue();
			}
		});
		btnView.setBounds(613, 308, 117, 25);
		panel.add(btnView);
		
		dob1 = new JTextField();
		dob1.setEditable(false);
		dob1.setColumns(10);
		dob1.setBounds(397, 192, 102, 24);
		panel.add(dob1);

	}
	private void setValue() {
	

	
		studentinfo s_info = ss.getStudentdata(gettheclzid);
		id.setText(s_info.getClzId().toString());
		name.setText(s_info.getName());
		email.setText(s_info.getEmail());
		city.setText(s_info.getAdd_city());
		state.setText(s_info.getAdd_state());
		zipcode.setText(s_info.getZipCode());
		phone.setText(s_info.getPhone());
		dob1.setText(s_info.getDob().toString());
	
	
	
	
		
	
		
	}
}

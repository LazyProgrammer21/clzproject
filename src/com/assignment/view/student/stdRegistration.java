package com.assignment.view.student;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

import com.assignment.model.studentinfo;
import com.assignment.service.course;
import com.assignment.service.courseSubjectImpl;
import com.assignment.service.passwordValidation;
import com.assignment.service.sectionService;
import com.assignment.service.sectionServiceImpl;
import com.assignment.service.semesterSeriveImpl;
import com.assignment.service.semesterService;
import com.assignment.service.studentService;
import com.assignment.service.studentserviceImpl;
import com.assignment.view.Mainpage;

import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.math.BigInteger;

public class stdRegistration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField stdid;
	private JTextField name;
	private JTextField email;
	private JTextField city;
	private JTextField state;
	private JTextField zipcode;
	private JTextField phone;
	private JPasswordField password;
	private String stdName="";
	
	
	String sid="";
	String sname="";
	String semail="";
	Date sdob=null;
	String sphone="";
	String spassword="";

	
	studentinfo s_info = new studentinfo();
	course cs = new courseSubjectImpl();
	sectionService s = new sectionServiceImpl();
	studentService stdservice = new studentserviceImpl();
	static semesterService sems = new semesterSeriveImpl();
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stdRegistration frame = new stdRegistration();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
						
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public stdRegistration() {
		
		initialize();
	
	}


	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setUndecorated(true);
		setBounds(100, 100, 924, 622);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 128, 847, 516);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("*ID");
		lblId.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblId.setBounds(188, 10, 70, 28);
		panel.add(lblId);
		
		JLabel lblName = new JLabel("*Name");
		lblName.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblName.setBounds(188, 64, 70, 25);
		panel.add(lblName);
		
		JLabel lblDob = new JLabel("*DOB");
		lblDob.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblDob.setBounds(188, 134, 70, 25);
		panel.add(lblDob);
		
		JLabel lblGender = new JLabel("*Gender");
		lblGender.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblGender.setBounds(188, 159, 70, 25);
		panel.add(lblGender);
		
		JLabel lblAddcity = new JLabel("Add_city");
		lblAddcity.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblAddcity.setBounds(188, 196, 70, 25);
		panel.add(lblAddcity);
		
		JLabel lblAddressState = new JLabel("Address State");
		lblAddressState.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblAddressState.setBounds(188, 233, 121, 25);
		panel.add(lblAddressState);
		
		JLabel lblZipcode = new JLabel("zipcode");
		lblZipcode.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblZipcode.setBounds(188, 282, 83, 25);
		panel.add(lblZipcode);
		
		JLabel lblPhonenNumber = new JLabel("*Phonen Number");
		lblPhonenNumber.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblPhonenNumber.setBounds(188, 306, 141, 25);
		panel.add(lblPhonenNumber);
		
		JLabel lblLevelclass = new JLabel("level(CLass)");
		lblLevelclass.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblLevelclass.setBounds(188, 346, 94, 25);
		panel.add(lblLevelclass);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblPassword.setBounds(188, 416, 100, 25);
		panel.add(lblPassword);
		
		JLabel lblemail = new JLabel("*Email");
		lblemail.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblemail.setBounds(188, 91, 70, 31);
		panel.add(lblemail);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblSubject.setBounds(188, 453, 100, 25);
		panel.add(lblSubject);
		
		stdid = new JTextField();
		stdid.setBounds(344, 10, 189, 24);
		panel.add(stdid);
		stdid.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(344, 49, 189, 24);
		panel.add(name);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(344, 85, 189, 24);
		panel.add(email);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(344, 183, 189, 24);
		panel.add(city);
		
		state = new JTextField();
		state.setColumns(10);
		state.setBounds(344, 231, 189, 24);
		panel.add(state);
		
		zipcode = new JTextField();
		zipcode.setColumns(10);
		zipcode.setBounds(344, 268, 189, 24);
		panel.add(zipcode);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(392, 305, 141, 24);
		panel.add(phone);
		
		password = new JPasswordField();
		password.setBounds(344, 414, 189, 25);
		panel.add(password);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(341, 157, 70, 23);
		panel.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(416, 157, 90, 23);
		panel.add(female);
		
		JRadioButton other = new JRadioButton("Other");
		other.setBounds(514, 157, 90, 23);
		panel.add(other);
		
		JDateChooser birthdate = new JDateChooser();
		birthdate.setBounds(344, 121, 189, 28);
		panel.add(birthdate);
		
		JComboBox <String>subject = new JComboBox<String>();
		for(String sub:cs.getAllcourse()) {
			subject.addItem(sub);
		}
		subject.setBounds(344, 450, 189, 24);
		panel.add(subject);
		
		
		
		JComboBox<String> sem = new JComboBox<String>();
		
		for(String x: sems.getTotalsemester()) {
			sem.addItem(x);
			
		}
		
		sem.setBounds(344, 343, 189, 24);
		panel.add(sem);
		
		JComboBox<String> section = new JComboBox<String>();
		for(String y: s.getAllsection()) {
			section.addItem(y);
			
		}
	
		
		section.setBounds(344, 377, 189, 24);
		panel.add(section);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
	
			@SuppressWarnings({ "deprecation" })
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
				
				 sid = stdid.getText();
				 sname = name.getText();
				 semail = email.getText();
				 sdob = new Date(birthdate.getDate().getTime());
				 sphone = phone.getText();
				 spassword = password.getText();
			
				 int semid = sem.getSelectedIndex()+1;
					
					
				int secid = section.getSelectedIndex()+1;
					
				
				int subid = subject.getSelectedIndex()+1;
				
				//database code..
//				
				 BigInteger k = BigDecimal.valueOf(numeric(sid)).toBigInteger();
			
					 
					
						
					 
				 if(sid!=null) {
					
					 s_info.setClzId(k);
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Invalid ID");
				 }
				 
				 if(phonenumeric(sphone)) {
					
					 s_info.setPhone(phone.getText());
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Field cannot be Empty");
				 }
				 if(!check_name().isEmpty()) {
						s_info.setName(name.getText());
					}
				else {
						JOptionPane.showMessageDialog(null, "Field cannot be Empty!");
					}
				 if(isValidemail(semail)) {
						s_info.setEmail(email.getText());
					}
				else {
						JOptionPane.showMessageDialog(null, "Check your Email");
					}
				 if(sdob != null) {
						s_info.setDob(new Date(birthdate.getDate().getTime()));
					}
				else {
						JOptionPane.showMessageDialog(null, "Check your DOB");
					}
					
				
				if(male.isSelected())
					{
						s_info.setGender("Male");
					}
					
				else if(female.isSelected()){
						
						s_info.setGender("Female");
					}
					
				else if(other.isSelected())
					{
						s_info.setGender("Other");
					}
					
					s_info.setAdd_city(city.getText());
					s_info.setAdd_state(state.getText());
					s_info.setZipCode(zipcode.getText());
					
				
				passwordValidation checkpassword = new passwordValidation();
				if(checkpassword.validate(spassword)) {
						s_info.setPassWord(password.getText());
					}
				else {
						JOptionPane.showMessageDialog(null, "Try next Password");
					}
				 
				 
				
				 
				
				
				if(stdservice.newRegister(s_info, subid, semid, secid))
				{
					
					JOptionPane.showMessageDialog(null, "Added Success");
					
				
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Added Failed");
				}
				
				
				
				
				//input field make empty once the button is pressed..
				
				stdid.setText("");
				name.setText("");
				email.setText("");
				birthdate.setCalendar(null);
				city.setText("");
				state.setText("");
				zipcode.setText("");
				phone.setText("");
				password.setText("");
	
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				
				stdRegistration.this.dispose();
				
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Fill all the Form");
					System.out.println("helo");
				}
				
			}
		});
		btnSubmit.setBounds(628, 281, 117, 25);
		panel.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				
				stdRegistration.this.dispose();
				
			}
		});
		btnCancel.setBounds(628, 318, 117, 25);
		panel.add(btnCancel);
		
		
		
		JLabel lblId_1 = new JLabel("+977");
		lblId_1.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblId_1.setBounds(342, 304, 45, 28);
		panel.add(lblId_1);
		
		JLabel lblInfo = new JLabel("*Info*");
		lblInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				passwordinfo pi = new passwordinfo();
				pi.setVisible(true);
				pi.setLocationRelativeTo(null);
				
			}
		});
		lblInfo.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblInfo.setBounds(535, 414, 45, 25);
		panel.add(lblInfo);
		
		JLabel lblClzIdConsists = new JLabel("Clz ID consists of 10 digit Number");
		lblClzIdConsists.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblClzIdConsists.setBounds(535, 14, 264, 25);
		panel.add(lblClzIdConsists);
		
		JLabel lblSubject_1 = new JLabel("Section");
		lblSubject_1.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblSubject_1.setBounds(188, 379, 94, 25);
		panel.add(lblSubject_1);
		
		JButton btnS = new JButton("s");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, subject.getSelectedItem().toString());
			}
		});
		btnS.setBounds(628, 354, 117, 25);
		panel.add(btnS);
		
	
		
		JLabel unilogo = new JLabel("");
		unilogo.setIcon(new ImageIcon("/Users/hunte/git/PCPSkiosk/images/uoblogo.jpg"));
		unilogo.setBounds(704, 19, 184, 97);
		contentPane.add(unilogo);
		
		JLabel pcplogo = new JLabel("");
		pcplogo.setIcon(new ImageIcon("/Users/hunte/git/PCPSkiosk/images/pcpslogo.jpg"));
		pcplogo.setBounds(38, 31, 184, 85);
		contentPane.add(pcplogo);
	}
	
	
	private Double numeric(String cid) {
		
		Double x = null;
		try {
			if(cid!=null&&cid.length()==10) {
				x = Double.parseDouble(cid);
				
				
			}
			
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Clz ID cannot be String");
		
		
		}
	
		
		return x;
	}
	private Boolean phonenumeric(String pnum) {
		Boolean x = false;
		try {
			if(pnum!=null) {
				 Double.parseDouble(pnum);
				 x=true;
				
			}
			
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "PhoneNumber cannot be String");
			
			
		}
	
		
		return x;
	}
	
	private String check_name() {
		if(!sname.isEmpty()) {
			stdName = sname;
		}
		else {
			JOptionPane.showMessageDialog(null, "Name Cannot be Empty");
		}
		
		return stdName;
	}
	
	private static boolean isValidemail(String stdemail) {
		 String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		 return stdemail.matches(regex);
	}
	
	
	
	

	
	
	
	
}

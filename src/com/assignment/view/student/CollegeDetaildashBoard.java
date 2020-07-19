package com.assignment.view.student;


import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import com.assignment.model.collegeinfo;
import com.assignment.service.collegedetailImpl;
import com.assignment.service.collegedetailService;
import com.assignment.service.course;
import com.assignment.service.courseSubjectImpl;

import javax.swing.border.LineBorder;
import java.awt.Color;


import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CollegeDetaildashBoard extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int triggervalue;
	private String clzintros="";
	private String aboutuss="";
	private String contactuss="";

	collegedetailService s = new collegedetailImpl();
	
	String detail = s.getalldetails();
	String[] alldetail = detail.split("@@intermission@@");
	course c = new courseSubjectImpl();
	String course = c.getcourseDescription();
	String[] coursedetail = course.split("@@hello@@");

	public CollegeDetaildashBoard(int triggervalue) {
		this.triggervalue=triggervalue;
		initialize();
	}
	public void initialize() {
		setBounds(0, 0, 1080, 578);
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setSize(1344, 668);	
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Contact US", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(12, 12, 412, 272);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 28, 377, 233);
		panel.add(scrollPane);
		
		JTextArea contact = new JTextArea();
		scrollPane.setViewportView(contact);
		
		contact.setText(alldetail[2]);
		contact.setRows(10);
		contact.setLineWrap(true);
		if(triggervalue==1) {
			contact.setEditable(false);
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Intro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(436, 12, 429, 272);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 23, 407, 238);
		panel_1.add(scrollPane_1);
		
		JTextArea intro = new JTextArea();
		scrollPane_1.setViewportView(intro);
		intro.setText(alldetail[0]);
		if(triggervalue==1) {
			intro.setEditable(false);
		}
		intro.setRows(10);
		intro.setLineWrap(true);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "About US", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(877, 12, 440, 272);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 23, 418, 238);
		panel_2.add(scrollPane_2);
		
		JTextArea aboutus = new JTextArea();
		scrollPane_2.setViewportView(aboutus);
		aboutus.setText(alldetail[1]);
		if(triggervalue==1) {
			aboutus.setEditable(false);
		}
		aboutus.setRows(10);
		aboutus.setLineWrap(true);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Courses", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_3.setBounds(112, 307, 1039, 306);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "BSC. CS&SE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(12, 12, 543, 259);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 24, 523, 224);
		panel_4.add(scrollPane_3);
		
		JTextArea bscourse = new JTextArea();
		
		bscourse.setText(coursedetail[0]);
		if(triggervalue==1) {
			bscourse.setEditable(false);
		}
		scrollPane_3.setViewportView(bscourse);
		bscourse.setRows(10);
		bscourse.setLineWrap(true);
		
		JTextArea about = new JTextArea();
		about.setEditable(false);
		about.setText("");
	
		about.setRows(10);
		about.setLineWrap(true);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "BBA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel_5.setBounds(581, 12, 446, 259);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(12, 22, 424, 214);
		panel_5.add(scrollPane_4);
		
		JTextArea bbacourse = new JTextArea();
		bbacourse.setText(coursedetail[1]);
		if(triggervalue==1) {
			bbacourse.setEditable(false);
		}
		scrollPane_4.setViewportView(bbacourse);
		bbacourse.setRows(10);
		bbacourse.setLineWrap(true);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				
				clzintros = intro.getText();
				aboutuss = aboutus.getText();
				contactuss = contact.getText();
				collegeinfo c_info = new collegeinfo();
				c_info.setClzintro(clzintros);
				c_info.setAboutus(aboutuss);
				c_info.setContactus(contactuss);
				
				
					if(s.updatethedetails(c_info)) {
						
					JOptionPane.showMessageDialog(null, "Update Success");
					}
					else {
						
						JOptionPane.showMessageDialog(null, "Update Failed");
					}
				}
				catch(Exception e1) {
					System.out.println("Hello");
				}
			}
				
				
				
			
		});
		if(triggervalue==1) {
			btnUpdate.setVisible(false);
		}
		btnUpdate.setBounds(1187, 577, 96, 25);
		getContentPane().add(btnUpdate);

	}
}

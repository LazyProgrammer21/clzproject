package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.assignment.model.noticeinfo;
import com.assignment.model.studentinfo;
import com.assignment.service.studentService;
import com.assignment.service.studentserviceImpl;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class stdUNIkey extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	studentService ss = new studentserviceImpl();
	List<studentinfo> s_info= ss.getdatafromstudentadminrecord();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					stdUNIkey frame = new stdUNIkey();
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
	public stdUNIkey() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 426);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 58, 458, 289);
		contentPane.add(scrollPane);
		
		table = new JTable();
	
		scrollPane.setViewportView(table);
	
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"UniversityID", "Sudent Name", "Status"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(102);
		table.getColumnModel().getColumn(0).setMinWidth(42);
		table.getColumnModel().getColumn(1).setPreferredWidth(137);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(97);
		displaytable(table);
		
		JLabel lblCollegeId_1_1 = new JLabel("StudentRecord");
		lblCollegeId_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCollegeId_1_1.setBounds(204, 33, 134, 15);
		contentPane.add(lblCollegeId_1_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stdUNIkey.this.dispose();
			}
		});
		btnBack.setBounds(387, 352, 117, 25);
		contentPane.add(btnBack);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addStudent add = new addStudent(table);
				add.setVisible(true);
				add.setLocationRelativeTo(null);
				stdUNIkey.this.dispose();
				
			}
		});
		btnAddStudent.setBounds(233, 352, 142, 25);
		contentPane.add(btnAddStudent);
	}
	void displaytable(JTable table){
		
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		
		// empty the table first otherwise on every button click same data will repeatedly displayed
		
			tableModel.setRowCount(0);
			for(studentinfo ninfos : s_info)
			{
				tableModel.addRow(new Object[] {ninfos.getUniID(),ninfos.getName(),ninfos.getStatus()});
			}
			
			

			
	}
}

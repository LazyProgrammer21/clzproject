package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewTeacher extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewTeacher frame = new viewTeacher();
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
	public viewTeacher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 426);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTeacherId = new JLabel("Teacher  ID");
		lblTeacherId.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTeacherId.setBounds(32, 23, 114, 15);
		contentPane.add(lblTeacherId);
		
		JLabel lblTeacherName = new JLabel("Teacher Name");
		lblTeacherName.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTeacherName.setBounds(167, 24, 134, 15);
		contentPane.add(lblTeacherName);
		
		JLabel lblCollegeId_1_1 = new JLabel("Faculty");
		lblCollegeId_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCollegeId_1_1.setBounds(336, 30, 134, 15);
		contentPane.add(lblCollegeId_1_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Teacher ID", "Teacher Name", "Faculty"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(147);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(128);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.setBounds(12, 57, 458, 289);
		contentPane.add(table);
		
		JButton btnAddTeacher = new JButton("Add Teacher");
		btnAddTeacher.setBounds(205, 351, 142, 25);
		contentPane.add(btnAddTeacher);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewTeacher.this.dispose();
			}
		});
		btnBack.setBounds(359, 351, 117, 25);
		contentPane.add(btnBack);
	}
}

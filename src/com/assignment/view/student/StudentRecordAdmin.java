package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.beans.PropertyVetoException;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JRadioButton;

import com.assignment.model.noticeinfo;
import com.assignment.model.studentinfo;
import com.assignment.service.studentService;
import com.assignment.service.studentserviceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentRecordAdmin extends JInternalFrame {
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
	private JTextField number;
	private JTable table;
	int ids=0;
	/**
	 * Launch the application.
	 */
	studentService ss = new studentserviceImpl();
	List<studentinfo> ninfo = ss.getstudentDetailbyID();

	private JTextField gender;
	private JTextField dob;
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					StudentRecordAdmin frame = new StudentRecordAdmin();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	public StudentRecordAdmin() throws PropertyVetoException {
//		setTitle("Student record");
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setBounds(0, 0, 1074, 581);
		setSize(1344, 668);
		
		
		getContentPane().setBackground(Color.GRAY);
		setClosed(true);
		setVisible(true);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(149, 152, 486, 398);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 115, 462, 148);
		panel.add(scrollPane);
		
		table = new JTable();
	
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row =table.getSelectedRow();
				String id = (table.getModel().getValueAt(row, 0).toString());

				ids= Integer.parseInt(id);
				
				setData(ids);
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Id", "Name", "Subject", "Semester", "Section"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(124);
		table.getColumnModel().getColumn(2).setPreferredWidth(97);
		table.getColumnModel().getColumn(3).setPreferredWidth(101);
		table.getColumnModel().getColumn(4).setPreferredWidth(114);
	
		table.setBorder(new LineBorder(Color.BLACK));
		displatTable(table);
		JLabel label_13 = new JLabel("");
		label_13.setFont(new Font("Dialog", Font.BOLD, 14));
		label_13.setBounds(410, 115, 64, 15);
		panel.add(label_13);
		
		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
			
				if(table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "Please Select any Row to proceed");
					return;
				}
				else {
					ss.deletestudentrecord(ids);
				}
			
				
			
				}
				catch(Exception e1) {
//					e1.printStackTrace();
					System.out.println("helo");
				}
			
				
			}
			
		});
		displatTable(table);
		btnDeleteStudent.setBounds(322, 275, 152, 25);
		panel.add(btnDeleteStudent);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(687, 92, 542, 496);
		getContentPane().add(panel_1);
		
		JLabel label = new JLabel("ID");
		label.setFont(new Font("FreeSans", Font.BOLD, 16));
		label.setBounds(57, 12, 70, 28);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_1.setBounds(57, 66, 70, 25);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("DOB");
		label_2.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_2.setBounds(57, 136, 70, 25);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Gender");
		label_3.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_3.setBounds(57, 184, 70, 25);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Add_city");
		label_4.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_4.setBounds(57, 230, 70, 25);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Address State");
		label_5.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_5.setBounds(57, 268, 121, 25);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("zipcode");
		label_6.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_6.setBounds(57, 310, 83, 25);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Phonen Number");
		label_7.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_7.setBounds(57, 363, 141, 25);
		panel_1.add(label_7);
		
		JLabel label_9 = new JLabel("Email");
		label_9.setFont(new Font("FreeSans", Font.BOLD, 16));
		label_9.setBounds(57, 93, 70, 31);
		panel_1.add(label_9);
		
		id = new JTextField();
		id.setText("No update");
		id.setColumns(10);
		id.setBounds(263, 14, 162, 24);
		panel_1.add(id);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(263, 53, 162, 24);
		panel_1.add(name);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(263, 89, 162, 24);
		panel_1.add(email);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(263, 233, 162, 24);
		panel_1.add(city);
		
		state = new JTextField();
		state.setColumns(10);
		state.setBounds(263, 268, 162, 24);
		panel_1.add(state);
		
		zipcode = new JTextField();
		zipcode.setColumns(10);
		zipcode.setBounds(263, 313, 162, 24);
		panel_1.add(zipcode);
		
		number = new JTextField();
		number.setColumns(10);
		number.setBounds(263, 366, 162, 24);
		panel_1.add(number);
		
		gender = new JTextField();
		gender.setColumns(10);
		gender.setBounds(263, 184, 162, 24);
		panel_1.add(gender);
		
		dob = new JTextField();
		dob.setColumns(10);
		dob.setBounds(263, 136, 162, 24);
		panel_1.add(dob);

		
	}
	void displatTable(JTable table) {
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		
		// empty the table first otherwise on every button click same data will repeatedly displayed
		
		tableModel.setRowCount(0);
		
		for(studentinfo ninfos : ninfo)
		{
			tableModel.addRow(new Object[] {ninfos.getClzId(),ninfos.getName(),ninfos.getSubject(),ninfos.getSemseter(),ninfos.getSection()});
		}
	}
	void setData(int clzid) {
		
		studentinfo s_infos = ss.getStudentdata(clzid);
		id.setText(s_infos.getClzId().toString());
		name.setText(s_infos.getName());
		email.setText(s_infos.getEmail());
		dob.setText(s_infos.getDob().toString());
		gender.setText(s_infos.getGender());
		city.setText(s_infos.getAdd_city());
		state.setText(s_infos.getAdd_state());
		zipcode.setText(s_infos.getZipCode());
		number.setText(s_infos.getPhone());
		
		
		
		
		
		
	}
}

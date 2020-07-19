package com.assignment.view.student;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.assignment.model.noticeinfo;
import com.assignment.service.noticeService;
import com.assignment.service.noticeServiceimpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class IssueNotice extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	String nsubject="";
	String ndescription = "";
	String ntype="";
	Date nissuedate;
	private JTable table;
	




	
	public IssueNotice(JTable table) {
		this.table=table;
	
		
		initialize();
	}
	private void initialize() {
		setTitle("Add Notice\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 632, 584);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDateChooser issueDate = new JDateChooser();
		issueDate.setBounds(174, 411, 225, 35);
		contentPane.add(issueDate);
		
		JLabel lblNewLabel = new JLabel("SUBJECT:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel.setBounds(30, 88, 110, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Dialog", Font.BOLD, 17));
		lblDescription.setBounds(30, 190, 110, 22);
		contentPane.add(lblDescription);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(174, 122, 422, 184);
		contentPane.add(scrollPane);
		
		JTextArea description = new JTextArea();
		scrollPane.setViewportView(description);
		description.setLineWrap(true);
		description.setRows(7);
		
		JTextArea subject = new JTextArea();
		subject.setLineWrap(true);
		subject.setRows(7);
		subject.setBounds(174, 70, 422, 40);
		contentPane.add(subject);
		
		JTextArea type = new JTextArea();
		type.setRows(7);
		type.setLineWrap(true);
		type.setBounds(174, 335, 422, 40);
		contentPane.add(type);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Dialog", Font.BOLD, 17));
		lblDate.setBounds(30, 411, 110, 22);
		contentPane.add(lblDate);
		
		JLabel lblIssuedBy = new JLabel("Type/Title:");
		lblIssuedBy.setFont(new Font("Dialog", Font.BOLD, 17));
		lblIssuedBy.setBounds(30, 351, 110, 22);
		contentPane.add(lblIssuedBy);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					nsubject=subject.getText();
					ndescription=description.getText();
					ntype = type.getText();
					nissuedate = new Date(issueDate.getDate().getTime());
					
					noticeinfo ninfo = new noticeinfo();
					ninfo.setIssueDate(nissuedate);
					ninfo.setType(ntype);
					ninfo.setSubject(nsubject);
					ninfo.setDescription(ndescription);
					noticeService ns = new noticeServiceimpl();
					if(ns.issueNotice(ninfo))
					{
						JOptionPane.showMessageDialog(null, "Notice Issued");
					}
					else {
						JOptionPane.showMessageDialog(null, "Failed to issue Notice!");
					}
					
					
					subject.setText("");
					description.setText("");
					type.setText("");
					issueDate.setCalendar(null);
					
					IssueNotice.this.dispose();
					
					NoticedashBoard nb = new NoticedashBoard(0);
					nb.displayTable(table);
					
					
				}
				catch(Exception ex) {
					
					JOptionPane.showMessageDialog(null, "FIll all the Form!");
					ex.printStackTrace();
					
				}
				
				
				
				
				
				
				
				
			}
		});
		btnUpload.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnUpload.setBounds(479, 411, 117, 22);
		contentPane.add(btnUpload);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
//				
				IssueNotice.this.dispose();
//				
			}
		});
		btnCancel.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnCancel.setBounds(479, 434, 117, 27);
		contentPane.add(btnCancel);
		
	
	}
}

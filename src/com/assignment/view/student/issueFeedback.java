package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import com.assignment.db.database;
import com.assignment.model.FeedbackInfo;
import com.assignment.service.FeedbackService;
import com.assignment.service.FeedbackServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class issueFeedback extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	database db = new database();
	FeedbackServiceImpl fs =new FeedbackServiceImpl();
	FeedbackInfo fin = new FeedbackInfo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					issueFeedback frame = new issueFeedback();
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
	public issueFeedback() {
		con=db.getDBConnection();
		setTitle("Provide Feedback");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 438);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txt_subject = new JTextArea();
		txt_subject.setRows(7);
		txt_subject.setLineWrap(true);
		txt_subject.setBounds(171, 61, 422, 40);
		contentPane.add(txt_subject);
		
		JLabel label = new JLabel("SUBJECT:");
		label.setFont(new Font("Dialog", Font.BOLD, 17));
		label.setBounds(27, 79, 110, 22);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("Description");
		label_2.setFont(new Font("Dialog", Font.BOLD, 17));
		label_2.setBounds(27, 181, 110, 22);
		contentPane.add(label_2);
		
		JTextArea txt_description = new JTextArea();
		txt_description.setRows(7);
		txt_description.setLineWrap(true);
		txt_description.setBounds(171, 113, 422, 184);
		contentPane.add(txt_description);
		
		JButton button = new JButton("Upload");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_subject.getText().equals("")|| txt_description.getText().equals("")) 
				{    JOptionPane.showMessageDialog(null,"One or more empty feilds");}
				else {
				fs.insertedUpdateDeleteStudent('i',0,txt_subject.getText(), txt_description.getText());
				txt_subject.setText("");
				txt_description.setText("");
				
				issueFeedback.this.dispose();
				Feedbackpage fp=new Feedbackpage(0);
				fp.setVisible(true);
				
			}}
		});
		button.setFont(new Font("Dialog", Font.PLAIN, 18));
		button.setBounds(476, 309, 117, 22);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			issueFeedback.this.dispose();
			Feedbackpage fp = new Feedbackpage(0);
			fp.setVisible(true);
			
			}
			
		});
		button_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		button_1.setBounds(347, 310, 117, 27);
		contentPane.add(button_1);
	}

}
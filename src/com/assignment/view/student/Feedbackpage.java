package com.assignment.view.student;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import com.assignment.model.FeedbackInfo;
import com.assignment.service.FeedbackServiceImpl;

import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class Feedbackpage extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tbl_feedback;
	private JTextField txt_id;

	/**
	 * Launch the application.
	 */
	FeedbackInfo fi = new FeedbackInfo();
	FeedbackServiceImpl fsi = new FeedbackServiceImpl();
	private JTextField txt_date;
	int triggervalue;



	
	public Feedbackpage(int x) {
		triggervalue=x;
		initialize();
	}
	
	
	
	public void initialize() {
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1344, 668);	
		setBounds(0, 0, 1370, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(489, 43, 714, 460);
		contentPane.add(panel_1);
		
		JTextArea txt_description = new JTextArea();
		txt_description.setRows(8);
		txt_description.setLineWrap(true);
		txt_description.setFont(new Font("Dialog", Font.PLAIN, 17));
		txt_description.setBounds(150, 162, 442, 244);
		panel_1.add(txt_description);
		
		JTextArea txt_subject = new JTextArea();
		txt_subject.setRows(8);
		txt_subject.setLineWrap(true);
		txt_subject.setFont(new Font("Dialog", Font.PLAIN, 18));
		txt_subject.setBounds(150, 74, 442, 48);
		panel_1.add(txt_subject);
		
		JLabel lblDetail = new JLabel("Detail");
		lblDetail.setFont(new Font("Dialog", Font.PLAIN, 19));
		lblDetail.setBounds(42, 256, 70, 35);
		panel_1.add(lblDetail);
		
		JLabel lblTopic = new JLabel("Topic");
		lblTopic.setFont(new Font("Dialog", Font.PLAIN, 19));
		lblTopic.setBounds(42, 70, 70, 35);
		panel_1.add(lblTopic);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(45, 33, 64, 26);
		panel_1.add(lblNewLabel);
		
		txt_id = new JTextField();
		txt_id.setEnabled(false);
		txt_id.setBounds(150, 36, 96, 20);
		panel_1.add(txt_id);
		txt_id.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setBounds(363, 33, 49, 14);
		panel_1.add(lblNewLabel_1);
		
		txt_date = new JTextField();
		txt_date.setEnabled(false);
		txt_date.setBounds(437, 33, 152, 20);
		panel_1.add(txt_date);
		txt_date.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(57, 123, 381, 368);
		contentPane.add(panel);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setEnabled(false);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(Integer.valueOf(txt_id.getText()));
				fsi.insertedUpdateDeleteStudent('D', Integer.valueOf(txt_id.getText()), txt_subject.getText(),txt_description.getText());
				fsi.viewEvent(tbl_feedback);
				
				//
				txt_id.setText("");
				txt_subject.setText("");
				txt_description.setText("");
			}
		});
		btnDelete.setBounds(171, 285, 117, 25);
		panel.add(btnDelete);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				issueFeedback ia = new issueFeedback();
				ia.setVisible(true);
				Feedbackpage.this.dispose();
			}
		});
		btnAdd.setBounds(36, 248, 117, 25);
		panel.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setEnabled(false);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fsi.insertedUpdateDeleteStudent('U', Integer.valueOf(txt_id.getText()), txt_subject.getText(),txt_description.getText());
				fsi.viewEvent(tbl_feedback);
				//sets feilds null
				txt_id.setText("");
				txt_subject.setText("");
				txt_description.setText("");
			}
		});
		btnEdit.setBounds(171, 248, 117, 25);
		panel.add(btnEdit);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(26, 48, 38, 15);
		panel.add(lblId);
		
		tbl_feedback = new JTable();
		tbl_feedback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fsi.setTableClickable(tbl_feedback, fi);
				//sets the clicked value in feilds
				txt_id.setText(String.valueOf(fi.getId()));
				txt_subject.setText(fi.getSubject());
				txt_description.setText(fi.getDescription());
				txt_date.setText(fi.getDate());
				
			}
		});
		displaytable();
		tbl_feedback.setBounds(26, 84, 301, 136);
		panel.add(tbl_feedback);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnAdd.setEnabled(true);
				btnEdit.setEnabled(true);
				btnDelete.setEnabled(true);
			}
		});
		if(triggervalue==1) {
			btnNewButton.setVisible(false);
		}
		btnNewButton.setBounds(36, 286, 117, 23);
		panel.add(btnNewButton);
		
		JComboBox filtercombo = new JComboBox();
		filtercombo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			 if("By Date".endsWith(filtercombo.getSelectedItem().toString())) {
				 //showing data according to date
				 fsi.orderedByDate(tbl_feedback);
				 
			 }
			 else {
				 System.out.print("f");
				 fsi.viewEvent(tbl_feedback);
			 }
			}
		});
		filtercombo.setModel(new DefaultComboBoxModel(new String[] {"All feedback", "By Date"}));
		filtercombo.setBounds(62, 76, 196, 22);
		contentPane.add(filtercombo);
	}
	void displaytable() {
		fsi.viewEvent(tbl_feedback);
	}
}
package com.assignment.view.student;



import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import com.assignment.db.database;
import com.assignment.model.EventInfo;
import com.assignment.service.EventService;
import com.assignment.service.EventServiceImpl;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JScrollPane;

public class homepageEvent extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	private JTable table;
	private JTextField txt_search;
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	database db = new database();
	EventService ef = new EventServiceImpl();
	EventInfo info = new EventInfo();
	public JComboBox comboBox_1;
	
	private int trigervalue;


	
	
	public homepageEvent(int x) {
		trigervalue=x;
		initialize();
	}
	public void initialize() {
		con = db.getDBConnection();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setSize(1344, 668);	
		
		setBounds(0, 0, 1380, 701);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(739, 0, 580, 641);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Event Details");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 33));
		lblNewLabel.setBounds(157, 11, 267, 37);
		panel_1.add(lblNewLabel);
		
		JLabel lblEventId = new JLabel("Event Id");
		lblEventId.setBounds(49, 81, 70, 15);
		panel_1.add(lblEventId);
		
		JLabel lblEventName = new JLabel("Event Name");
		lblEventName.setBounds(42, 134, 96, 26);
		panel_1.add(lblEventName);
		
		JLabel lblEventDescription = new JLabel("Event Description");
		lblEventDescription.setBounds(23, 200, 129, 26);
		panel_1.add(lblEventDescription);
		
		JLabel lblVenue = new JLabel("Venue");
		lblVenue.setBounds(49, 370, 70, 26);
		panel_1.add(lblVenue);
		
		JLabel lblStartDate_1 = new JLabel("Start Date");
		lblStartDate_1.setBounds(23, 430, 129, 26);
		panel_1.add(lblStartDate_1);
		
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setBounds(23, 479, 129, 26);
		panel_1.add(lblEndDate);
		
		JLabel lblOrganisedby = new JLabel("Organisedby");
		lblOrganisedby.setBounds(23, 547, 129, 26);
		panel_1.add(lblOrganisedby);
		
		JTextArea txt_EventId = new JTextArea();
		txt_EventId.setEnabled(false);
		txt_EventId.setFont(new Font("Dialog", Font.PLAIN, 23));
		txt_EventId.setBounds(170, 66, 364, 28);
		panel_1.add(txt_EventId);
		
		JTextArea txt_EventName = new JTextArea();
		txt_EventName.setRows(3);
		txt_EventName.setLineWrap(true);
		txt_EventName.setFont(new Font("Dialog", Font.PLAIN, 23));
		txt_EventName.setBounds(170, 125, 364, 37);
		panel_1.add(txt_EventName);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(170, 175, 364, 160);
		panel_1.add(scrollPane_1);
		
		JTextArea txt_Description = new JTextArea();
		scrollPane_1.setViewportView(txt_Description);
		txt_Description.setRows(200);
		txt_Description.setLineWrap(true);
		txt_Description.setFont(new Font("Dialog", Font.PLAIN, 23));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(170, 344, 364, 68);
		panel_1.add(scrollPane_2);
		
		JTextArea txt_EventVenue = new JTextArea();
		scrollPane_2.setViewportView(txt_EventVenue);
		txt_EventVenue.setTabSize(4);
		txt_EventVenue.setRows(20);
		txt_EventVenue.setLineWrap(true);
		txt_EventVenue.setFont(new Font("Dialog", Font.PLAIN, 23));
		
		JTextArea txt_StartDate = new JTextArea();
		txt_StartDate.setFont(new Font("Dialog", Font.PLAIN, 23));
		txt_StartDate.setBounds(170, 421, 364, 28);
		panel_1.add(txt_StartDate);
		
		JTextArea txt_EndDate = new JTextArea();
		txt_EndDate.setFont(new Font("Dialog", Font.PLAIN, 23));
		txt_EndDate.setBounds(170, 472, 364, 28);
		panel_1.add(txt_EndDate);
		
		JComboBox comboOrgarniser = new JComboBox();
		comboOrgarniser.setEnabled(false);
		comboOrgarniser.setDoubleBuffered(true);
		comboOrgarniser.setEditable(true);
		comboOrgarniser.setBounds(170, 549, 129, 22);
		panel_1.add(comboOrgarniser);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 705, 641);
		contentPane.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 228, 675, 253);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ef.setValue(table,info);
				
				//sets the text feild with clicked row of table value
				
				txt_EventName.setText(info.getEventName());
				txt_EventId.setText(String.valueOf(info.getEventID()));
				txt_Description.setText(info.getEventDescription());
				txt_EventVenue.setText(info.getEventVenue());
				txt_StartDate.setText(info.getEventStartDate());
				txt_EndDate.setText(info.getEventEndDate());
				comboOrgarniser.setSelectedItem(info.getEventOrganiser());
				
				
			}
		});
		table.setSurrendersFocusOnKeystroke(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBorder(null);
		
		JLabel lblEid = new JLabel("All Events");
		lblEid.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEid.setBounds(75, 192, 121, 25);
		panel_2.add(lblEid);
		
		txt_search = new JTextField();
		txt_search.setEnabled(false);
		txt_search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(txt_search.getText());
				ef.viewEvent(table);
				ef.search(table,comboBox_1.getSelectedItem().toString(),txt_search.getText());
			}
		});
		txt_search.setColumns(10);
		txt_search.setBounds(409, 158, 189, 25);
		panel_2.add(txt_search);
		
		JButton btnView = new JButton("View All");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ef.viewEvent(table);
				comboBox_1.setEnabled(true);
				txt_search.setEnabled(true);
			}
		});
		btnView.setBounds(328, 506, 89, 23);
		panel_2.add(btnView);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Value To Search");
		lblNewLabel_1.setBounds(268, 154, 142, 33);
		panel_2.add(lblNewLabel_1);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ef.viewEvent(table);
				ef.search(table,comboBox_1.getSelectedItem().toString(),txt_search.getText());
				//System.out.print(comboBox_1.getSelectedItem().toString(),"");
			}
		});
	
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"IT club", "Sports Club", "Socio-Cultural Club", "Free-Flow Club", "Administrative"}));
		comboBox_1.setBounds(103, 159, 147, 22);
		panel_2.add(comboBox_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date d=null;
				ef.insertedUpdateDeleteEvent('D', Integer.parseInt(txt_EventId.getText()), "",d , d,"" , 0, 0);
				
			}
		});
		if(trigervalue==1) {
			btnDelete.setVisible(false);
		}
		if(trigervalue==2) {
			btnDelete.setVisible(false);
		}
		btnDelete.setBounds(103, 507, 91, 25);
		panel_2.add(btnDelete);
		
		JButton btnAddEvent = new JButton("Add event");
		btnAddEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEvent e1 = new addEvent();
				e1.setVisible(true);
				e1.setLocationRelativeTo(null);
//				homepageEvent.this.dispose();
				
			}
		});
		if(trigervalue==1) {
			btnAddEvent.setVisible(false);
		}
		if(trigervalue==2) {
			btnAddEvent.setVisible(false);
		}
		btnAddEvent.setBounds(206, 506, 109, 25);
		panel_2.add(btnAddEvent);
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Event has been book. FOr detail Visit clz NoticeBoard");
			}
		});
		if(trigervalue==0) {
			btnBook.setVisible(false);
		}
		if(trigervalue==1) {
			btnBook.setVisible(true);
		}
		if(trigervalue==2) {
			btnBook.setVisible(false);
		}
		btnBook.setBounds(433, 506, 109, 25);
		panel_2.add(btnBook);
	}
}
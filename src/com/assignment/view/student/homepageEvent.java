package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import com.assignment.db.database;
import com.assignment.model.EventInfo;
import com.assignment.service.EventService;
import com.assignment.service.EventServiceImpl;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepageEvent frame = new homepageEvent();
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
	public homepageEvent() {
		con = db.getDBConnection();
		//ef.fillableEventTable(table,"");
		//ef.viewEvent( table);
		
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setSize(1344, 668);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		scrollPane.setBounds(74, 266, 573, 253);
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
		
		JLabel lblEid = new JLabel("Events");
		lblEid.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEid.setBounds(74, 230, 121, 25);
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
		txt_search.setBounds(408, 196, 189, 25);
		panel_2.add(txt_search);
		
		JButton btnView = new JButton("View All");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ef.viewEvent(table);
				comboBox_1.setEnabled(true);
				txt_search.setEnabled(true);
			}
		});
		btnView.setBounds(327, 544, 89, 23);
		panel_2.add(btnView);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Value To Search");
		lblNewLabel_1.setBounds(267, 192, 142, 33);
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
		comboBox_1.setBounds(102, 197, 147, 22);
		panel_2.add(comboBox_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(102, 545, 91, 25);
		panel_2.add(btnDelete);
		
		JButton btnAddEvent = new JButton("Add event");
		btnAddEvent.setBounds(205, 544, 109, 25);
		panel_2.add(btnAddEvent);
		
		JButton btnBook = new JButton("Book");
		btnBook.setBounds(432, 544, 109, 25);
		panel_2.add(btnBook);
	}
}
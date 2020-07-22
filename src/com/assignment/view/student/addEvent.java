package com.assignment.view.student;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import com.assignment.service.EventServiceImpl;
import com.assignment.view.Mainpage;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class addEvent extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_eventName;
	EventServiceImpl esi = new EventServiceImpl();
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addEvent frame = new addEvent();
					frame.setVisible(true);
//					frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public addEvent( ) {
	
		
		
		setUndecorated(true);
		setSize(1344, 668);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 570);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Event Name");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(71, 76, 106, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Dialog", Font.BOLD, 16));
		lblDescription.setBounds(71, 156, 106, 25);
		contentPane.add(lblDescription);
		
		JLabel lblCub = new JLabel("Cub");
		lblCub.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCub.setBounds(86, 248, 73, 25);
		contentPane.add(lblCub);
		
		JLabel lblVenue = new JLabel("Venue");
		lblVenue.setFont(new Font("Dialog", Font.BOLD, 16));
		lblVenue.setBounds(86, 285, 73, 25);
		contentPane.add(lblVenue);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Dialog", Font.BOLD, 16));
		lblStartDate.setBounds(81, 329, 106, 25);
		contentPane.add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEndDate.setBounds(81, 366, 106, 25);
		contentPane.add(lblEndDate);
		
		JLabel lblOrganised = new JLabel("Organised By");
		lblOrganised.setFont(new Font("Dialog", Font.BOLD, 16));
		lblOrganised.setBounds(71, 438, 127, 25);
		contentPane.add(lblOrganised);
		
		txt_eventName = new JTextField();
		txt_eventName.setBounds(242, 69, 242, 31);
		contentPane.add(txt_eventName);
		txt_eventName.setColumns(10);
		
		JComboBox<String> cmbClub = new JComboBox<String>();
		cmbClub.setBounds(242, 249, 242, 25);
		cmbClub.setEditable(true);
		cmbClub.addItem("IT Club");
		cmbClub.addItem("Free-Flow Club");
		cmbClub.addItem("Socio-Cultural Club");
		cmbClub.addItem("Sports Club");
		cmbClub.addItem("Others");
		contentPane.add(cmbClub);
		
		JComboBox cmbVenue = new JComboBox();
		cmbVenue.setModel(new DefaultComboBoxModel(new String[] {"College Ground", "Seminar Hall", "College Hall"}));
		cmbVenue.setBounds(242, 289, 229, 22);
		contentPane.add(cmbVenue);
		
		JDateChooser txt_startDate = new JDateChooser();
		txt_startDate.setBounds(242, 323, 242, 31);
		contentPane.add(txt_startDate);
		
		JDateChooser txt_endDate = new JDateChooser();
		txt_endDate.setBounds(242, 366, 242, 25);
		contentPane.add(txt_endDate);
		
		JTextArea txt_description = new JTextArea();
		txt_description.setLineWrap(true);
		txt_description.setRows(10);
		txt_description.setBounds(242, 116, 242, 110);
		contentPane.add(txt_description);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.setBounds(562, 467, 139, 25);
		contentPane.add(Cancel);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(496, 116, 17, 110);
		contentPane.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(496, 403, 17, 89);
		contentPane.add(scrollBar_1);
		
		JTextArea textAreaOrg = new JTextArea();
		textAreaOrg.setBounds(242, 416, 242, 76);
		contentPane.add(textAreaOrg);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(esi.insertedUpdateDeleteEvent('i', 0,txt_eventName.getText(),new Date(txt_startDate.getDate().getTime()),new Date(txt_endDate.getDate().getTime()),txt_description.getText(),cmbClub.getSelectedIndex()+1,cmbVenue.getSelectedIndex()+1))
				{
					
					addEvent.this.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "SOrry");
				}
				txt_eventName.setText("");
				txt_description.setText("");
				
				
			}
		});
		btnAdd.setBounds(562, 438, 139, 25);
		contentPane.add(btnAdd);
		
		
	}
}
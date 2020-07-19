package com.assignment.view.student;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Color;

public class addEvent extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField eventName;
	private JTextField venue;
	


	
	public addEvent( ) {
	
		
		
		
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
		
		eventName = new JTextField();
		eventName.setBounds(242, 69, 242, 31);
		contentPane.add(eventName);
		eventName.setColumns(10);
		
		JComboBox<String> Club = new JComboBox<String>();
		Club.setBounds(242, 249, 242, 25);
		Club.setEditable(true);
		Club.addItem("IT Club");
		Club.addItem("Free-Flow Club");
		Club.addItem("Socio-Cultural Club");
		Club.addItem("Sports Club");
		Club.addItem("Others");
		Club.setSelectedItem("Select club");
		contentPane.add(Club);
		
		venue = new JTextField();
		venue.setBounds(238, 286, 246, 25);
		contentPane.add(venue);
		venue.setColumns(10);
		
		JDateChooser startDate = new JDateChooser();
		startDate.setBounds(242, 323, 242, 31);
		contentPane.add(startDate);
		
		JDateChooser endDate = new JDateChooser();
		endDate.setBounds(242, 366, 242, 25);
		contentPane.add(endDate);
		
		JTextArea EventInfo = new JTextArea();
		EventInfo.setLineWrap(true);
		EventInfo.setRows(10);
		EventInfo.setBounds(242, 116, 242, 110);
		contentPane.add(EventInfo);
		
		JTextArea organisedBy = new JTextArea();
		organisedBy.setRows(10);
		organisedBy.setLineWrap(true);
		organisedBy.setBounds(242, 403, 242, 89);
		contentPane.add(organisedBy);
		
		JButton AddEvent = new JButton("Add");
		AddEvent.setBounds(562, 439, 139, 25);
		contentPane.add(AddEvent);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.setBounds(562, 467, 139, 25);
		contentPane.add(Cancel);
		
		JButton uploadImg = new JButton("Upload Images");		
		uploadImg.setBounds(562, 413, 139, 25);
		contentPane.add(uploadImg);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(496, 116, 17, 110);
		contentPane.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(496, 403, 17, 89);
		contentPane.add(scrollBar_1);
	}
}

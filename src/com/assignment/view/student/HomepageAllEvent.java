package com.assignment.view.student;


import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyVetoException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//import java.awt.event.MouseListener;
//import javax.swing.plaf.basic.BasicInternalFrameUI;

public class HomepageAllEvent extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable allevent;
	private JTextField textField;
	private boolean status = true;
	private JTable statustable;
	public int triggervalue;
	

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	public HomepageAllEvent(int triggervalue) throws PropertyVetoException {
		this.triggervalue = triggervalue;
		initialize();
	}
	public void initialize() throws PropertyVetoException {
//		addEvent e = new addEvent(status);
//		setTitle("Homepage");
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		getContentPane().setBackground(Color.GRAY);
		setClosed(true);
		setVisible(true);
		
		
		setBounds(0, 0, 1350, 685);
		setSize(1344, 668);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(1057, 0, 283, 641);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblImages = new JLabel("Images");
		lblImages.setBounds(5, 5, 116, 37);
		panel.add(lblImages);
		lblImages.setFont(new Font("FreeSans", Font.BOLD, 33));
		
		JLabel lblPicture = new JLabel("picture 1");
		lblPicture.setBounds(0, 42, 248, 133);
		panel.add(lblPicture);
		lblPicture.setForeground(Color.ORANGE);
		lblPicture.setBackground(Color.RED);
		
		JLabel lblPicture_1 = new JLabel("picture 2");
		lblPicture_1.setBounds(5, 229, 243, 156);
		panel.add(lblPicture_1);
		
		JLabel label = new JLabel("picture 2");
		label.setBounds(5, 415, 243, 190);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(501, 0, 544, 641);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Event Details");
		lblNewLabel.setBounds(206, 5, 208, 37);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("FreeSans", Font.BOLD, 33));
		
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
		
		JTextArea txtrSs = new JTextArea();
		txtrSs.setFont(new Font("Dialog", Font.PLAIN, 23));
		txtrSs.setBounds(170, 66, 364, 28);
		panel_1.add(txtrSs);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(3);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Dialog", Font.PLAIN, 23));
		textArea.setBounds(170, 116, 364, 47);
		panel_1.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setRows(200);
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Dialog", Font.PLAIN, 23));
		textArea_1.setBounds(170, 175, 341, 160);
		panel_1.add(textArea_1);
		
		JTextArea venueinfo = new JTextArea();
		venueinfo.setLineWrap(true);
		venueinfo.setTabSize(4);
		venueinfo.setRows(20);
		venueinfo.setFont(new Font("Dialog", Font.PLAIN, 23));
		venueinfo.setBounds(170, 344, 341, 68);
		panel_1.add(venueinfo);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(517, 175, 17, 160);
		panel_1.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(517, 344, 17, 68);
		panel_1.add(scrollBar_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Dialog", Font.PLAIN, 23));
		textArea_2.setBounds(170, 421, 364, 28);
		panel_1.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Dialog", Font.PLAIN, 23));
		textArea_3.setBounds(170, 472, 364, 28);
		panel_1.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setRows(200);
		textArea_4.setFont(new Font("Dialog", Font.PLAIN, 23));
		textArea_4.setBounds(170, 512, 341, 101);
		panel_1.add(textArea_4);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setBounds(517, 507, 17, 106);
		panel_1.add(scrollBar_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 495, 641);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		

		allevent = new JTable();
		allevent.setSurrendersFocusOnKeystroke(true);
		allevent.setBorder(null);
		allevent.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Eid", "Event Name", "Start Date"
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
		allevent.getColumnModel().getColumn(0).setResizable(false);
		allevent.getColumnModel().getColumn(1).setResizable(false);
		allevent.getColumnModel().getColumn(1).setPreferredWidth(165);
		allevent.getColumnModel().getColumn(2).setResizable(false);
		allevent.getColumnModel().getColumn(2).setPreferredWidth(95);
		allevent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		allevent.setBounds(12, 220, 344, 231);
		
		panel_2.add(allevent);
		
		JLabel lblEid = new JLabel("EID");
		lblEid.setFont(new Font("Lato Black", Font.BOLD, 20));
		lblEid.setBounds(12, 197, 70, 25);
		panel_2.add(lblEid);
		
		JLabel lblName = new JLabel("Event Name");
		lblName.setFont(new Font("Lato Black", Font.BOLD, 20));
		lblName.setBounds(94, 197, 154, 25);
		panel_2.add(lblName);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Dialog", Font.BOLD, 17));
		lblStartDate.setBounds(260, 193, 109, 33);
		panel_2.add(lblStartDate);
		
		textField = new JTextField();
		textField.setBounds(176, 117, 180, 33);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(265, 156, 91, 25);
		panel_2.add(btnSearch);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
//				e.setTitle("Edit Event");
				status = false;
//				e.setVisible(true);
				
			}
		});
		btnEdit.setBounds(12, 464, 81, 25);
		panel_2.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(105, 464, 91, 25);
		panel_2.add(btnDelete);
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBook.setBounds(331, 501, 129, 25);
		if(triggervalue==1) {
			btnBook.setVisible(false);
		}
		panel_2.add(btnBook);
		
		JButton btnCancelEvent = new JButton("Cancel event");
		btnCancelEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelEvent.setBounds(329, 464, 131, 25);
		if(triggervalue==1) {
			btnCancelEvent.setVisible(false);
		}
		
		panel_2.add(btnCancelEvent);
		
		JButton btnAddEvent = new JButton("Add event");
		btnAddEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				
			}
		});
		btnAddEvent.setBounds(208, 463, 109, 25);
		panel_2.add(btnAddEvent);
		
		JComboBox<String> comboBox = new JComboBox<String>();		
		comboBox.setEditable(true);
		comboBox.addItem("IT Club");
		comboBox.addItem("Free-Flow Club");
		comboBox.addItem("Socio-Cultural Club");
		comboBox.addItem("Sports Club");
		comboBox.setSelectedItem("Filter by Club");
		comboBox.setBounds(12, 121, 137, 24);
		panel_2.add(comboBox);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Dialog", Font.BOLD, 18));
		lblStatus.setBounds(374, 193, 70, 33);
		if(triggervalue==1) {
			lblStatus.setVisible(false);
			
		}
	
		panel_2.add(lblStatus);
		
		statustable = new JTable();
		statustable.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Status"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		statustable.getColumnModel().getColumn(0).setResizable(false);
		statustable.setBounds(361, 220, 99, 231);
		if(triggervalue==1) {
			statustable.setVisible(false);
		}
		
		panel_2.add(statustable);
		

		

	}
	

	
}

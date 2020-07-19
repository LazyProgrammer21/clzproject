package com.assignment.view.student;



import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JPanel;
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
import javax.swing.table.DefaultTableModel;

public class eventguestHomepage extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					eventguestHomepage frame = new eventguestHomepage();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public eventguestHomepage() {
		setBounds(0, 0, 450, 300);
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setSize(1344, 668);	
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(501, 0, 544, 641);
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Event Details");
		lblNewLabel.setFont(new Font("FreeSans", Font.BOLD, 33));
		lblNewLabel.setBounds(206, 5, 208, 37);
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
		venueinfo.setTabSize(4);
		venueinfo.setRows(20);
		venueinfo.setLineWrap(true);
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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(1057, 0, 283, 641);
		getContentPane().add(panel);
		
		JLabel lblImages = new JLabel("Images");
		lblImages.setFont(new Font("FreeSans", Font.BOLD, 33));
		lblImages.setBounds(5, 5, 116, 37);
		panel.add(lblImages);
		
		JLabel lblPicture = new JLabel("picture 1");
		lblPicture.setForeground(Color.ORANGE);
		lblPicture.setBackground(Color.RED);
		lblPicture.setBounds(0, 42, 248, 133);
		panel.add(lblPicture);
		
		JLabel lblPicture_1 = new JLabel("picture 2");
		lblPicture_1.setBounds(5, 229, 243, 156);
		panel.add(lblPicture_1);
		
		JLabel label = new JLabel("picture 2");
		label.setBounds(5, 415, 243, 190);
		panel.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 495, 641);
		getContentPane().add(panel_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Event ID", "Name", "Date"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(68);
		table.getColumnModel().getColumn(1).setPreferredWidth(117);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.setSurrendersFocusOnKeystroke(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBorder(null);
		table.setBounds(74, 253, 344, 231);
		panel_2.add(table);
		
		JLabel lblEid = new JLabel("EID");
		lblEid.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEid.setBounds(74, 230, 70, 25);
		panel_2.add(lblEid);
		
		JLabel lblName = new JLabel("Event Name");
		lblName.setFont(new Font("Dialog", Font.BOLD, 20));
		lblName.setBounds(156, 230, 154, 25);
		panel_2.add(lblName);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Dialog", Font.BOLD, 17));
		lblStartDate.setBounds(322, 226, 109, 33);
		panel_2.add(lblStartDate);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(238, 150, 180, 33);
		panel_2.add(textField);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(327, 189, 91, 25);
		panel_2.add(btnSearch);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setEditable(true);
		comboBox.setBounds(74, 154, 137, 24);
		panel_2.add(comboBox);
		

	}

}

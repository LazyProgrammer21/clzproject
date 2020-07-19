package com.assignment.view.student;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class feedbackguest extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					feedbackguest frame = new feedbackguest();
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
	public feedbackguest() {
		setBounds(0, 0, 1107, 725);
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setSize(1344, 668);	
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(120, 138, 300, 368);
		getContentPane().add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"FeedBack Id", "Student Name", "Date"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.setBounds(26, 74, 246, 151);
		panel.add(table);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(32, 47, 70, 15);
		panel.add(lblId);
		
		JLabel lblStudentName = new JLabel("Student");
		lblStudentName.setBounds(110, 47, 70, 15);
		panel.add(lblStudentName);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(202, 47, 70, 15);
		panel.add(lblDate);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(456, 95, 714, 460);
		getContentPane().add(panel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(8);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Dialog", Font.PLAIN, 17));
		textArea.setBounds(150, 115, 442, 244);
		panel_1.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setRows(8);
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		textArea_1.setBounds(150, 46, 442, 48);
		panel_1.add(textArea_1);
		
		JLabel lblDetail = new JLabel("Detail");
		lblDetail.setFont(new Font("Dialog", Font.PLAIN, 19));
		lblDetail.setBounds(42, 256, 70, 35);
		panel_1.add(lblDetail);
		
		JLabel lblTopic = new JLabel("Topic");
		lblTopic.setFont(new Font("Dialog", Font.PLAIN, 19));
		lblTopic.setBounds(42, 46, 70, 35);
		panel_1.add(lblTopic);

	}
}

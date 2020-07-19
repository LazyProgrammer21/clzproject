package com.assignment.view.student;


import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.assignment.model.noticeinfo;
import com.assignment.service.noticeService;
import com.assignment.service.noticeServiceimpl;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NoticedashBoard extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable notietable;
	private JTextPane description;
	private JTextPane subject;
	private int triggerValue;
	int userID=0;
	
	
	
	
	noticeService nservice = new noticeServiceimpl();
	
	List<noticeinfo> ninfo =  nservice.getAllNotice();


	/**
	 * Create the frame.
	 */
	
	public NoticedashBoard(int triggerValue) {
		this.triggerValue=triggerValue;
		initialize();
	}
	public void initialize() {
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBorder(null);
		BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
		gui.setNorthPane(null);
		setBounds(0, 0, 1088, 591);
		setSize(1344, 668);	
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(179, 168, 323, 316);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 47, 299, 194);
		panel.add(scrollPane);
		
		notietable = new JTable();
		notietable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row =notietable.getSelectedRow();
				String id = (notietable.getModel().getValueAt(row, 0).toString());

				int ids= Integer.parseInt(id);

				setData(ids);
				
				
			}
		});
		scrollPane.setViewportView(notietable);
		notietable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			
			},
			new String[] {
				"ID", "Date issued", "Type"
			}
		) {
			
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		displayTable(notietable);
		notietable.getColumnModel().getColumn(1).setPreferredWidth(105);
		notietable.getColumnModel().getColumn(2).setPreferredWidth(85);
		
		
		
		JButton btnIssueNotice = new JButton("Issue Notice");
		btnIssueNotice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IssueNotice in = new IssueNotice(notietable);
				in.setVisible(true);
			
				
				
			}
		});
		if(triggerValue==1) {
			btnIssueNotice.setVisible(false);
		}
		btnIssueNotice.setBounds(206, 253, 105, 25);
		panel.add(btnIssueNotice);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int row=notietable.getSelectedRow();
				String id = (notietable.getModel().getValueAt(row, 0).toString());

				int ids= Integer.parseInt(id);
			
				if(notietable.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "Please Select any Row to proceed");
					return;
				
				}
				else {
					nservice.deleteNotice(ids);
				}
				
				
			
				
				}
				catch(Exception q) {
					q.printStackTrace();
				}
				displayTable(notietable);
			
			}
		});
		delete.setBounds(99, 253, 97, 25);
		panel.add(delete);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(514, 78, 701, 500);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(44, 114, 610, 305);
		panel_1.add(scrollPane_1);
		
		description = new JTextPane();
		scrollPane_1.setViewportView(description);
		description.setFont(new Font("Dialog", Font.PLAIN, 21));
		description.setEditable(false);
		
		JLabel lblSubject = new JLabel("SUBJECT:");
		lblSubject.setFont(new Font("Dialog", Font.BOLD, 26));
		lblSubject.setBounds(41, 52, 145, 32);
		panel_1.add(lblSubject);
		
		subject = new JTextPane();
		subject.setEditable(false);
		subject.setBounds(192, 52, 462, 32);
		panel_1.add(subject);
		
		

	}
	
	
	public void displayTable(JTable table)
	{
		
		
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		
		// empty the table first otherwise on every button click same data will repeatedly displayed
		
		tableModel.setRowCount(0);
		
		for(noticeinfo ninfos : ninfo)
		{
			tableModel.addRow(new Object[] {ninfos.getId(),ninfos.getIssueDate(),ninfos.getType()});
		}
		
		
	}
	
	public void setData( int id) {
		userID=id;
		
		noticeService nservice = new noticeServiceimpl();
		noticeinfo ninfos = nservice.getByID(id);
//		System.out.println(ninfos.getSubject());
//		System.out.println(ninfos.getDescription());
		subject.setText(ninfos.getSubject());
		description.setText(ninfos.getDescription());
		

		
	}
	
	
}

package com.assignment.view.student;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.assignment.view.Mainpage;

import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

public class AdminHomepage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public int trigger_for_btn_disable;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AdminHomepage frame = new AdminHomepage();
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
	public AdminHomepage() {
		setTitle("Admin Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1336, 770);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(12, 51, 1312, 670);
		contentPane.add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(27, -3, 1112, 54);
		contentPane.add(menuBar);
		
		JButton btnStudentRecord = new JButton("Student Record");
		menuBar.add(btnStudentRecord);
		btnStudentRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.removeAll();
				StudentRecordAdmin sra;
				try {
					sra = new StudentRecordAdmin();
					sra.setVisible(true);
					desktopPane.add(sra);
				} catch (PropertyVetoException e) {
					JOptionPane.showMessageDialog(null, "Try Again");
					System.out.println("Page Not Found!!");
				}
				
				
			}
		});
		btnStudentRecord.setFont(new Font("C059", Font.BOLD, 16));
		
		JButton btnEvents = new JButton("Events");
		btnEvents.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnEvents);
		
		JButton btnNotice = new JButton("Notice");
		btnNotice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				desktopPane.removeAll();
				NoticedashBoard nb;
				nb = new NoticedashBoard(0);
				nb.setVisible(true);
				desktopPane.add(nb);
				
			}
		});
		btnNotice.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnNotice);
		
		JButton btnFeedbacks = new JButton("Feedbacks");
		btnFeedbacks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				trigger_for_btn_disable = 1;
				desktopPane.removeAll();
				FeedbackDashboard fd = new FeedbackDashboard(trigger_for_btn_disable);
				fd.setVisible(true);
				desktopPane.add(fd);
				
			}
		});
		btnFeedbacks.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnFeedbacks);
		
		JButton btnRoutine = new JButton("Routine");
		btnRoutine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.removeAll();
				RoutineDashboardAdmin rda = new RoutineDashboardAdmin();
				rda.setVisible(true);
				desktopPane.add(rda);
				
			}
		});
		btnRoutine.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnRoutine);
		
		JButton btnCollegeDetails = new JButton("College Details");
		btnCollegeDetails.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnCollegeDetails);
		
		JButton btnAddAdmin = new JButton("Administrative");
		btnAddAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.removeAll();
				String adminKey = JOptionPane.showInputDialog("Please enter the Key to proceed:");
				String key = "admin123";
				try {
					
					if (!adminKey.isEmpty()) {
						if(adminKey.equals(key)) {
							
							JOptionPane.showMessageDialog(null, "Success");
						administrativepage h = new administrativepage();
						
						h.setVisible(true);
						h.setLocationRelativeTo(null);
						
						
						}
						else {
							JOptionPane.showMessageDialog(null, "Invalid Key Try Again","Alert",JOptionPane.WARNING_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Field Cannot be Empty");
					}
					
					
				}
				catch(Exception e){
					System.out.println("Cancel pressed");
				}
			}
		});
		btnAddAdmin.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnAddAdmin);
		
		JButton btnExit = new JButton("LogOut");
		btnExit.setFont(new Font("C059", Font.BOLD, 16));
		menuBar.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				AdminHomepage.this.dispose();
			}
		});
		btnCollegeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				desktopPane.removeAll();
				CollegeDetaildashBoard rda = new CollegeDetaildashBoard(0);
				rda.setVisible(true);
				desktopPane.add(rda);
				
			}
		});
		btnEvents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				HomepageAllEvent event;
				try {
					trigger_for_btn_disable = 1;
					desktopPane.removeAll();
					event = new HomepageAllEvent(trigger_for_btn_disable);
//					event.btnCancelEvent.disabled();
					desktopPane.add(event).setVisible(true);
				} catch (PropertyVetoException e) {
					
					System.out.println("Page Not Found!!");
				}
				
				
			}
		});
	}

	
}

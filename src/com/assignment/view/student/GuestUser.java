package com.assignment.view.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.assignment.view.Mainpage;

import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuestUser extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int triggerValue;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GuestUser frame = new GuestUser();
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
	
	public GuestUser() {
		
		initialize();
	}
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1152, 674);
		setSize(1350, 754);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 58, 1328, 647);
		contentPane.add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(12, 15, 1142, 31);
		contentPane.add(menuBar);
		
		JButton btnCollegeDetails = new JButton("College Details");
		btnCollegeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.removeAll();
				CollegeDetaildashBoard cd = new CollegeDetaildashBoard(1);
				cd.setVisible(true);
				desktopPane.add(cd);
			}
		});
		menuBar.add(btnCollegeDetails);
		
		JButton btnFeedBack = new JButton("Feed Back");
		btnFeedBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.removeAll();
				feedbackguest fd = new feedbackguest();
				fd.setVisible(true);
				desktopPane.add(fd);
			}
		});
		menuBar.add(btnFeedBack);
		
		JButton btnEventDetails = new JButton("Event Details");
		btnEventDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.removeAll();
				eventguestHomepage gh = new eventguestHomepage();
				gh.setVisible(true);
				desktopPane.add(gh);
			}
		});
		menuBar.add(btnEventDetails);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				disposepage();
				
				
			}
		});
		menuBar.add(btnExit);
	}
	void disposepage() {
		GuestUser.this.dispose();
	}
}

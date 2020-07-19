package com.assignment.view.student;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;
import java.math.BigInteger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.assignment.model.studentinfo;
import com.assignment.view.Mainpage;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class studentpage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public int trigger_for_btndisable;
	studentinfo ss = new studentinfo();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentpage frame = new studentpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	
	public studentpage() throws PropertyVetoException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 714, 464);
		setSize(1350, 754);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JDesktopPane desktopPane = new JDesktopPane();
		
		desktopPane.setBackground(Color.DARK_GRAY);
		desktopPane.setBounds(0, 59, 1338, 667);
		
		contentPane.add(desktopPane);
	
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 12, 1338, 35);
		contentPane.add(menuBar);
		menuBar.setMargin(new Insets(0, 10, 10, 10));
		menuBar.setBackground(Color.LIGHT_GRAY);

		
		JComboBox<String> Eventcombobx = new JComboBox<String>();
		Eventcombobx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println(Eventcombobx.getSelectedItem());
				if(Eventcombobx.getSelectedItem().equals("All Event")) {
					desktopPane.removeAll();
					HomepageAllEvent h;
					try {
						h = new HomepageAllEvent(0);
						h.setVisible(true);
						desktopPane.add(h);
					} catch (PropertyVetoException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
			}
		});
	
		
		
		Eventcombobx.addItem("All Event");
		Eventcombobx.addItem("Upcomming Event");
		Eventcombobx.addItem("Previous Event");
		Eventcombobx.addItem("My Events");
		Eventcombobx.addItem("Event History");		
		
		JLabel label = new JLabel("     ");
		menuBar.add(label);
		menuBar.add(Eventcombobx);
		
		JLabel label_18 = new JLabel("     ");
		menuBar.add(label_18);
		
		JButton btnCollegeDetail = new JButton("College Detail  ");
		btnCollegeDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				trigger_for_btndisable=1;
				desktopPane.removeAll();
				
				CollegeDetaildashBoard cd = new CollegeDetaildashBoard(trigger_for_btndisable);
				cd.setVisible(true);
				desktopPane.add(cd);
				
				
				
				
				
			}
		});
		menuBar.add(btnCollegeDetail);
		btnCollegeDetail.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel space = new JLabel("     ");
		menuBar.add(space);
		
		JButton btnNotices = new JButton("Notices  ");
		btnNotices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				trigger_for_btndisable=1;
				desktopPane.removeAll();
				NoticedashBoard nb = new NoticedashBoard(trigger_for_btndisable);
				nb.setVisible(true);
				desktopPane.add(nb);
				
				
				
			}
		});
		btnNotices.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnNotices);
		
		JLabel label_1 = new JLabel("     ");
		menuBar.add(label_1);
		
		JLabel label_2 = new JLabel("     ");
		menuBar.add(label_2);
		
		JButton btnPersonalization = new JButton("Personalization  ");
		btnPersonalization.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				desktopPane.removeAll();
		
				StudentPersonalization sp = new StudentPersonalization();
				sp.setVisible(true);
				desktopPane.add(sp);
				
			}
		});
		btnPersonalization.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnPersonalization);
		
		JLabel label_3 = new JLabel("     ");
		menuBar.add(label_3);
		
		JButton btnRoutine = new JButton("Routine  ");
		btnRoutine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.removeAll();
				RoutineDashboard rd = new RoutineDashboard();
				rd.setVisible(true);
				desktopPane.add(rd);
			}
		});
		btnRoutine.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnRoutine);
		
		JLabel label_4 = new JLabel("     ");
		menuBar.add(label_4);
		
		JButton btnNewButton = new JButton("Give Feedback  ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				desktopPane.removeAll();
				FeedbackDashboard fd = new FeedbackDashboard(0);
				fd.setVisible(true);
				desktopPane.add(fd);
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(btnNewButton);
		
		JLabel label_5 = new JLabel("     ");
		menuBar.add(label_5);
		
		JLabel label_12 = new JLabel("     ");
		menuBar.add(label_12);
		
		JLabel label_13 = new JLabel("     ");
		menuBar.add(label_13);
		
		JLabel label_14 = new JLabel("     ");
		menuBar.add(label_14);
		
		JLabel label_15 = new JLabel("     ");
		menuBar.add(label_15);
		
		JLabel label_16 = new JLabel("     ");
		menuBar.add(label_16);
		
		JLabel label_17 = new JLabel("     ");
		menuBar.add(label_17);
		
		JLabel label_7 = new JLabel("     ");
		menuBar.add(label_7);
		
		JLabel label_8 = new JLabel("     ");
		menuBar.add(label_8);
		
		JLabel label_9 = new JLabel("     ");
		menuBar.add(label_9);
		
		JLabel label_10 = new JLabel("     ");
		menuBar.add(label_10);
		
		JLabel label_11 = new JLabel("     ");
		menuBar.add(label_11);
		
		JButton Exitbtn = new JButton("Logout  ");
		Exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				studentpage.this.dispose();
			}
		});
		Exitbtn.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(Exitbtn);
		
		JLabel label_6 = new JLabel("     ");
		menuBar.add(label_6);
		
	
		
	}
	

}

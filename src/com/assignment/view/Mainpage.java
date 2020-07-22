package com.assignment.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;


import com.assignment.service.adminService;
import com.assignment.service.adminServiceImpl;
import com.assignment.service.guestService;
import com.assignment.service.guestServiceImpl;
import com.assignment.service.studentService;
import com.assignment.service.studentserviceImpl;
import com.assignment.view.student.AdminHomepage;
import com.assignment.view.student.GuestUser;
import com.assignment.view.student.forgetPassword;
import com.assignment.view.student.stdRegistration;
import com.assignment.view.student.studentpage;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.math.BigInteger;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainpage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField studentid;
	private JPasswordField password;
	private String s;
	private String uniID;
	 private String guest_email;
	 private String uniid;
	 private int cd=0;
	 private int numid;
	
	 studentService ss = new studentserviceImpl();
	 BigInteger bg=null;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage frame = new Mainpage();
					frame.setVisible(true);
//					frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mainpage() {
		
		
		setAlwaysOnTop(true);
		setBackground(Color.DARK_GRAY);
		setTitle("PCPSKIOSK");
		setResizable(false);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/hunte/git/clzproject/images/appicon.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 508);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel mainpanel = new JPanel();
		mainpanel.setBorder(new LineBorder(Color.BLACK));
		mainpanel.setBackground(new Color(255, 255, 240));
		contentPane.add(mainpanel, BorderLayout.CENTER);
		mainpanel.setLayout(null);
		
		JLabel Pcpslogo = new JLabel("");
		Pcpslogo.setIcon(new ImageIcon("/Users/hunte/git/clzproject/images/pcpslogo.jpg"));
		Pcpslogo.setBounds(47, 34, 177, 97);
		mainpanel.add(Pcpslogo);
		
		JLabel Uoblogo = new JLabel("");
		Uoblogo.setIcon(new ImageIcon("/Users/hunte/git/clzproject/images/uoblogo.jpg"));
		Uoblogo.setBounds(541, 34, 177, 97);
		mainpanel.add(Uoblogo);
		
		JLabel lblStudentId = new JLabel("Student ID: ");
		lblStudentId.setFont(new Font("Dialog", Font.BOLD, 15));
		lblStudentId.setBounds(222, 164, 141, 58);
		mainpanel.add(lblStudentId);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPassword.setBounds(222, 217, 141, 58);
		mainpanel.add(lblPassword);
		
		studentid = new JTextField();
		studentid.setBounds(362, 175, 182, 38);
		mainpanel.add(studentid);
		studentid.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(362, 227, 182, 39);
		mainpanel.add(password);
		
		JLabel infolink = new JLabel("Are you a New Student? Click here for Registration.");
		infolink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				uniid = JOptionPane.showInputDialog("Please Enter your UniversityID to proceed>>");	
				cd = Integer.parseInt(uniid);
				sendtheuniid();
			
				try {
					
				
					try {
						if(!ss.checkstatuscolumn_of_studentadminrecord(cd)) {
							 cd = Integer.parseInt(uniid);
							
							return;
						}
					else {
						System.out.println("username exits");
						JOptionPane.showMessageDialog(null, "username exits");
					}
					
				
				 
				}
				catch(Exception eq1) {
			
					try {
						
						
						if(isnumeric(uniid)) {
							long lvalue=new BigInteger(uniid).longValue();
							
							if(lvalue==ss.getuniIDdb(new BigInteger(uniid))){
								stdRegistration rg = new stdRegistration(cd);
								rg.setVisible(true);
								
								disposeMainpage();
								
							}
							else {
								JOptionPane.showMessageDialog(null, "ID doesnot match");
							}
							
						
						}
						
					}
					catch(Exception eq) {
						JOptionPane.showMessageDialog(null, "Registration failed. Try AGAIN!");
						
					}			
									
					
					
				}
				}
				catch(Exception eq) {
					
					JOptionPane.showMessageDialog(null, "UniversityID cannot be null");
				}
				
			}
			catch(Exception x) {
				System.out.println("null");
			}
			}
		});
		infolink.setBounds(262, 323, 268, 38);
		mainpanel.add(infolink);
		
		JButton ForgetPasswordbtn = new JButton("Forget Password");
		ForgetPasswordbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				uniID = JOptionPane.showInputDialog("Please Enter your College ID to proceed");
				settheclzid1();
	
			try {
				if(!uniID.isEmpty()) {
					
				forgetPassword pass = new forgetPassword(settheclzid1());
				pass.setVisible(true);
				disposeMainpage();
	
				}
				
				
				else{
				
					JOptionPane.showMessageDialog(null, "Field is Empty");
					
					
				}
				}
				catch(Exception e) {
					System.out.println("Cancel Pressed");
				}
				
				
			}
			
			catch(Exception e) {
				System.out.println("Hello");
			}
			}
		});
		ForgetPasswordbtn.setBounds(362, 287, 168, 25);
		mainpanel.add(ForgetPasswordbtn);
		
		JButton Loginbtn = new JButton("Login");
		Loginbtn.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				try {
					numid=Integer.parseInt(studentid.getText());
					settheclzid();
				studentpage page;
					 bg = new BigInteger(studentid.getText());
				if(isnumeric(studentid.getText())) {
				if(ss.studentloginIn(bg, password.getText())) {
					JOptionPane.showMessageDialog(null, "You are logged In");

					page = new studentpage(settheclzid());
					page.setVisible(true);

					disposeMainpage();
				}
				else {
					JOptionPane.showMessageDialog(null, "Worng Username and Password");
				}

					studentid.setText("");
					password.setText("");

}
				
				else {
					JOptionPane.showMessageDialog(null, "cannot be string");
					}
			
				}
				catch (Exception e) {
			
				JOptionPane.showMessageDialog(null, "Try Again with valid Username and Password");
				}
				
	
				
			}
		});
		Loginbtn.setBounds(262, 287, 88, 25);
		mainpanel.add(Loginbtn);
		
		JButton Adminbtn = new JButton("Admin");
		Adminbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = JOptionPane.showInputDialog("Please Enter the Key");
				adminService as = new adminServiceImpl();
				as.getadminKey();
//				System.out.println(as.getadminKey());
				
				try {
			
				if (!s.isEmpty()) {
					if(s.equals(as.getadminKey())) {
						JOptionPane.showMessageDialog(null, "Success");
					AdminHomepage h = new AdminHomepage();
					h.setVisible(true);
					h.setLocationRelativeTo(null);
					disposeMainpage();}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Key Try Again","Alert",JOptionPane.WARNING_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Field Cannot be Empty");
				}
				
			
			
			}
				catch(Exception e ){
					System.out.println("Cancel pressed");
					
				}
			}
				
			
		});
		Adminbtn.setFont(new Font("Dialog", Font.BOLD, 15));
		Adminbtn.setBounds(262, 374, 99, 46);
		mainpanel.add(Adminbtn);
		
		JButton Guestbtn = new JButton("Guest");
		Guestbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				guest_email = JOptionPane.showInputDialog("Please Enter Your Email for Subscription:");
				try {
				if(!guest_email.isEmpty())
				{
					if(isValid(guest_email)) {
						guestService gs = new guestServiceImpl();
						gs.addnewGuest(guest_email);
						JOptionPane.showMessageDialog(null, "Thank you for Subscription");
						GuestUser homepage = new GuestUser();
						homepage.setVisible(true);
						homepage.setLocationRelativeTo(null);
						disposeMainpage();
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Try Again with valid Emailaddress");
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Field cannot be Empty");
				}
				}
				catch(Exception e)
				{
					System.out.println("Cancel pressed");
				}
			
			}
		});
		Guestbtn.setFont(new Font("Dialog", Font.BOLD, 15));
		Guestbtn.setBounds(426, 374, 99, 46);
		mainpanel.add(Guestbtn);
	}
	private static boolean isValid(String guest_email) {
		 String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		 return guest_email.matches(regex);
	}
	private void disposeMainpage() {
		Mainpage.this.dispose();
	}
	private boolean isnumeric (String uniid) {
		boolean x = false;
		try {
			if(uniid!=null) {
				Double.parseDouble(uniid);
				x=true;
			}
			else {
				JOptionPane.showMessageDialog(null, "username cannot be String");
				x=false;
			}
			
		}
		catch(NumberFormatException e) {
			System.out.println("Cannot be Null");
			
		}
	
		
		return x;
	}
	public int settheclzid() {
		
		return numid;
	}
	public int settheclzid1() {
		
		return Integer.parseInt(uniID);
	}
	public int sendtheuniid() {
		
	
		return cd;
	}
	

	
}

package com.SignupLogin;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.connection.dbConecction;
import com.mysql.cj.protocol.Resultset;
import com.resultManagement.*;


public class EmployeeLogin extends JFrame {

	private JPanel contentPane;
	private JTextField eloginemail;
	private JTextField eloginpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeLogin frame = new EmployeeLogin();
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
	public EmployeeLogin() {
		setFont(new Font("Dialog", Font.BOLD, 32));
		setTitle("Employee LogIn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(65, 105, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEmail.setBounds(330, 25, 220, 30);
		contentPane.add(lblEmail);
		
		eloginemail = new JTextField();
		eloginemail.setFont(new Font("Dialog", Font.PLAIN, 12));
		eloginemail.setToolTipText("Enter Email Address");
		eloginemail.setBounds(330, 60, 220, 30);
		contentPane.add(eloginemail);
		eloginemail.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPassword.setBounds(330, 105, 220, 30);
		contentPane.add(lblPassword);
		
		eloginpass = new JTextField();
		eloginpass.setToolTipText("Enter Password");
		eloginpass.setFont(new Font("Dialog", Font.PLAIN, 12));
		eloginpass.setColumns(10);
		eloginpass.setBounds(330, 140, 220, 30);
		contentPane.add(eloginpass);
		

		JButton elogin = new JButton("LOG IN");
		elogin.setFont(new Font("Dialog", Font.BOLD, 16));
		elogin.setForeground(Color.WHITE);
		elogin.setBackground(new Color(30, 144, 255));
		elogin.setEnabled(true);
		elogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String themail = eloginemail.getText();
				String thpass = eloginpass.getText();
				
				try {
					dbConecction c = new dbConecction();
					if(eloginemail.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Email field is required."); 
					}
					if(eloginpass.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Password field is required."); 
					}
					String query = "SELECT * FROM teacherinfo WHERE email='"+themail+"' AND password='"+thpass+"'";
					Resultset res = (Resultset) c.state.executeQuery(query);
					
					if(((ResultSet) res).next()) {
						Ehome eh = new Ehome();
						eh.setVisible(true);
						setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null,"Incorrect Email and Password!");
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		elogin.setBounds(330, 200, 220, 35);
		contentPane.add(elogin);
		
		JButton tBack = new JButton("BACK");
		tBack.setFont(new Font("Dialog", Font.BOLD, 16));
		tBack.setForeground(Color.WHITE);
		tBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				welcome wc = new welcome();
				wc.setVisible(true);
				setVisible(false);
			}
		});
		tBack.setEnabled(true);
		tBack.setBackground(new Color(255, 69, 0));
		tBack.setBounds(330, 245, 220, 35);
		contentPane.add(tBack);
		
		JButton tloginmcreate = new JButton("Haven't Account? SignUp here.");
		tloginmcreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EmployeeSignup ts = new EmployeeSignup();
				ts.setVisible(true);
				setVisible(false);
			}
		});
		tloginmcreate.setBackground(new Color(255, 218, 185));
		tloginmcreate.setFont(new Font("Dialog", Font.PLAIN, 12));
		tloginmcreate.setBounds(320, 327, 240, 20);
		contentPane.add(tloginmcreate);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(240, 230, 140));
		label.setIcon(new ImageIcon(EmployeeLogin.class.getResource("/image/stf.png")));
		label.setBounds(0, -10, 300, 450);
		contentPane.add(label);
	}
}

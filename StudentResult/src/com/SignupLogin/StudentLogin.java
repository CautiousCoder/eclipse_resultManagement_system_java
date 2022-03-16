package com.SignupLogin;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.connection.dbConecction;
import com.mysql.cj.protocol.Resultset;
import com.resultManagement.*;

public class StudentLogin extends JFrame {

	private JPanel contentPane;
	private JTextField sloginemail;
	private JTextField sloginpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentLogin frame = new StudentLogin();
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
	public StudentLogin() {
		setFont(new Font("Dialog", Font.BOLD, 32));
		setTitle("Student LogIn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton tlohin = new JButton("LOG IN");
		tlohin.setForeground(Color.WHITE);
		tlohin.setBackground(new Color(30, 144, 255));
		tlohin.setEnabled(true);
		tlohin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String themail = sloginemail.getText();
				String thpass = sloginpass.getText();
				
				try {
					dbConecction c = new dbConecction();
					if(sloginemail.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Email field is required."); 
					}
					if(sloginpass.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Password field is required."); 
					}
					String query = "SELECT * FROM teacherinfo WHERE email='"+themail+"' AND password='"+thpass+"'";
					Resultset res = (Resultset) c.state.executeQuery(query);
					
					if(((ResultSet) res).next()) {
						
					}
					else {
						JOptionPane.showMessageDialog(null,"Incorrect Email and Password!");
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		tlohin.setBounds(60, 200, 220, 35);
		contentPane.add(tlohin);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEmail.setBounds(60, 25, 200, 30);
		contentPane.add(lblEmail);
		
		sloginemail = new JTextField();
		sloginemail.setBackground(new Color(221, 160, 221));
		sloginemail.setFont(new Font("Dialog", Font.PLAIN, 12));
		sloginemail.setToolTipText("Enter Email Address");
		sloginemail.setBounds(60, 55, 220, 40);
		contentPane.add(sloginemail);
		sloginemail.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPassword.setBounds(60, 100, 200, 30);
		contentPane.add(lblPassword);
		
		sloginpass = new JTextField();
		sloginpass.setBackground(new Color(221, 160, 221));
		sloginpass.setToolTipText("Enter Email Address");
		sloginpass.setFont(new Font("Dialog", Font.PLAIN, 12));
		sloginpass.setColumns(10);
		sloginpass.setBounds(60, 130, 220, 40);
		contentPane.add(sloginpass);
		
		JButton tBack = new JButton("BACK");
		tBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				welcome wc = new welcome();
				wc.setVisible(true);
				setVisible(false);
			}
		});
		tBack.setEnabled(true);
		tBack.setBackground(new Color(255, 69, 0));
		tBack.setBounds(60, 245, 220, 35);
		contentPane.add(tBack);
		
		JButton tloginmcreate = new JButton("Haven't Account? SignUp here.");
		tloginmcreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TeacherSignIn ts = new TeacherSignIn();
				ts.setVisible(true);
				setVisible(false);
			}
		});
		tloginmcreate.setBackground(new Color(255, 218, 185));
		tloginmcreate.setFont(new Font("Dialog", Font.PLAIN, 12));
		tloginmcreate.setBounds(55, 315, 230, 25);
		contentPane.add(tloginmcreate);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(240, 230, 140));
		label.setIcon(new ImageIcon(TeacherLogin.class.getResource("/image/student.jpg")));
		label.setBounds(0, 0, 650, 460);
		contentPane.add(label);
	}

}

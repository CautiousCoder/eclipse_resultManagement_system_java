package com.SignupLogin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import com.resultManagement.*;

public class StudentLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tloninemail;
	private JTextField tloginpass;

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
		setTitle("Teacher LogIn");
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
			}
		});
		tlohin.setBounds(60, 200, 220, 35);
		contentPane.add(tlohin);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEmail.setBounds(60, 25, 200, 30);
		contentPane.add(lblEmail);
		
		tloninemail = new JTextField();
		tloninemail.setBackground(new Color(221, 160, 221));
		tloninemail.setFont(new Font("Dialog", Font.PLAIN, 12));
		tloninemail.setToolTipText("Enter Email Address");
		tloninemail.setBounds(60, 60, 220, 35);
		contentPane.add(tloninemail);
		tloninemail.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPassword.setBounds(60, 105, 200, 30);
		contentPane.add(lblPassword);
		
		tloginpass = new JTextField();
		tloginpass.setBackground(new Color(221, 160, 221));
		tloginpass.setToolTipText("Enter Email Address");
		tloginpass.setFont(new Font("Dialog", Font.PLAIN, 12));
		tloginpass.setColumns(10);
		tloginpass.setBounds(60, 140, 220, 35);
		contentPane.add(tloginpass);
		
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
		tloginmcreate.setBounds(40, 315, 300, 25);
		contentPane.add(tloginmcreate);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(240, 230, 140));
		label.setIcon(new ImageIcon(TeacherLogin.class.getResource("/image/student.jpg")));
		label.setBounds(0, 0, 650, 460);
		contentPane.add(label);
	}

}

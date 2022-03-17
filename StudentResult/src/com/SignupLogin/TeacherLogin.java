package com.SignupLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.connection.dbConecction;
import com.mysql.cj.protocol.Resultset;
import com.resultManagement.Thome;
import com.resultManagement.welcome;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class TeacherLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tloninemail;
	private JPasswordField tloginpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherLogin frame = new TeacherLogin();
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
	public TeacherLogin() {
		setFont(new Font("Dialog", Font.BOLD, 32));
		setTitle("Teacher LogIn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEmail.setBounds(60, 25, 200, 30);
		contentPane.add(lblEmail);
		
		tloninemail = new JTextField();
		tloninemail.setFont(new Font("Dialog", Font.PLAIN, 12));
		tloninemail.setToolTipText("Enter Email Address");
		tloninemail.setBounds(60, 60, 220, 35);
		contentPane.add(tloninemail);
		tloninemail.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPassword.setBounds(60, 105, 200, 30);
		contentPane.add(lblPassword);
		
		JButton tlohin = new JButton("LOG IN");
		tlohin.setForeground(Color.WHITE);
		tlohin.setBackground(new Color(30, 144, 255));
		tlohin.setEnabled(true);
		tlohin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String themail = tloninemail.getText();
				String thpass = tloginpass.getText();
				
				try {
					dbConecction c = new dbConecction();
					if(tloninemail.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Email field is required."); 
					}
					if(tloginpass.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Password field is required."); 
					}
					String query = "SELECT * FROM teacherinfo WHERE email='"+themail+"' AND password='"+thpass+"'";
					Resultset res = (Resultset) c.state.executeQuery(query);
					
					if(((ResultSet) res).next()) {
						Thome th = new Thome();
						th.setVisible(true);
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
		
		tloginpass = new JPasswordField();
		tloginpass.setToolTipText("Enter Password");
		tloginpass.setBounds(60, 140, 220, 35);
		contentPane.add(tloginpass);
		tlohin.setBounds(60, 202, 220, 35);
		contentPane.add(tlohin);
		
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
		tloginmcreate.setBounds(40, 327, 300, 20);
		contentPane.add(tloginmcreate);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(240, 230, 140));
		label.setIcon(new ImageIcon(TeacherLogin.class.getResource("/image/teacher.jpg")));
		label.setBounds(0, 0, 650, 460);
		contentPane.add(label);
	}
}

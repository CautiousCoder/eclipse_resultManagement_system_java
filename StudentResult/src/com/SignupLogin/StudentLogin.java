package com.SignupLogin;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.connection.dbConecction;
import com.mysql.cj.protocol.Resultset;
import com.resultManagement.*;

public class StudentLogin extends JFrame {

	private JPanel contentPane;
	private JTextField sloginemail;
	private JTextField sloginpass;
	
	String themail;

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
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEmail.setBounds(60, 25, 200, 30);
		contentPane.add(lblEmail);
		
		JLabel erroremail = new JLabel("");
		erroremail.setForeground(Color.RED);
		erroremail.setHorizontalAlignment(SwingConstants.CENTER);
		erroremail.setBounds(60, 92, 230, 20);
		contentPane.add(erroremail);
		
		sloginemail = new JTextField();
		sloginemail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
				Pattern patt =Pattern.compile(PATTERN);
				Matcher match = patt.matcher(sloginemail.getText());
				if(!match.matches()) {
					erroremail.setText("Invalid Email.!");
					return;
				} else {
					themail = sloginemail.getText();
					erroremail.setText(null);
				}
			}
		});
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
		
		sloginpass = new JPasswordField();
		sloginpass.setBackground(new Color(221, 160, 221));
		sloginpass.setToolTipText("Enter Email Address");
		sloginpass.setFont(new Font("Dialog", Font.PLAIN, 12));
		sloginpass.setColumns(10);
		sloginpass.setBounds(60, 130, 220, 40);
		contentPane.add(sloginpass);
		
		JButton tlohin = new JButton("LOG IN");
		tlohin.setFont(new Font("Dialog", Font.BOLD, 16));
		tlohin.setForeground(Color.WHITE);
		tlohin.setBackground(new Color(30, 144, 255));
		tlohin.setEnabled(true);
		tlohin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				themail = sloginemail.getText();
				String thpass = sloginpass.getText();
				
				try {
					dbConecction c = new dbConecction();
					if(sloginemail.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Email field is required."); 
					}
					if(sloginpass.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Password field is required."); 
					}
					String query = "SELECT * FROM studentinfo WHERE email='"+themail+"' AND password='"+thpass+"'";
					Resultset res = (Resultset) c.state.executeQuery(query);
					
					if(((ResultSet) res).next()) {
						Shome sh = new Shome();
						sh.setVisible(true);
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
		tlohin.setBounds(60, 200, 220, 35);
		contentPane.add(tlohin);
		
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
		tBack.setBounds(60, 245, 220, 35);
		contentPane.add(tBack);
		
		JButton tloginmcreate = new JButton("Haven't Account? SignUp here.");
		tloginmcreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentSignup ss = new StudentSignup();
				ss.setVisible(true);
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

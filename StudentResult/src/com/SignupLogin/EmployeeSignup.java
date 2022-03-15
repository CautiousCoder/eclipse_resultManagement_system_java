package com.SignupLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class EmployeeSignup extends JFrame {

	private JPanel contentPane;
	private JTextField ename;
	private JTextField eEmail;
	private JPasswordField epassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeSignup frame = new EmployeeSignup();
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
	public EmployeeSignup() {
		setTitle("Employee Signup");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton eSignup = new JButton("SIGN UP");
		eSignup.setBackground(new Color(0, 206, 209));
		eSignup.setBounds(200, 330, 117, 35);
		contentPane.add(eSignup);
		
		JLabel lblEmployee = new JLabel("EMPLOYEE");
		lblEmployee.setFont(new Font("Dialog", Font.BOLD, 34));
		lblEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployee.setBounds(50, 10, 500, 40);
		contentPane.add(lblEmployee);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setBounds(50, 70, 120, 30);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("EMAIL :");
		lblEmail.setBounds(50, 110, 120, 30);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setBounds(50, 150, 120, 30);
		contentPane.add(lblPassword);
		
		JLabel lblGender = new JLabel("GENDER :");
		lblGender.setBounds(50, 190, 120, 30);
		contentPane.add(lblGender);
		
		JLabel lblFaculty = new JLabel("FACULTY :");
		lblFaculty.setBounds(50, 230, 120, 30);
		contentPane.add(lblFaculty);
		
		JLabel lblDepartment = new JLabel("DEPARTMENT :");
		lblDepartment.setBounds(50, 270, 120, 30);
		contentPane.add(lblDepartment);
		
		ename = new JTextField();
		ename.setToolTipText("Enter Your Name");
		ename.setBounds(180, 70, 400, 30);
		contentPane.add(ename);
		ename.setColumns(10);
		
		eEmail = new JTextField();
		eEmail.setToolTipText("Enter Valid Email");
		eEmail.setColumns(10);
		eEmail.setBounds(180, 110, 400, 30);
		contentPane.add(eEmail);
		
		epassword = new JPasswordField();
		epassword.setToolTipText("Enter New Password");
		epassword.setBounds(180, 150, 400, 30);
		contentPane.add(epassword);
		
		JRadioButton egenterFemale = new JRadioButton("Female");
		egenterFemale.setFont(new Font("Dialog", Font.BOLD, 14));
		egenterFemale.setBounds(210, 195, 149, 23);
		contentPane.add(egenterFemale);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Dialog", Font.BOLD, 14));
		rdbtnMale.setBounds(402, 195, 149, 23);
		contentPane.add(rdbtnMale);
		
		JComboBox efaculty = new JComboBox();
		efaculty.setModel(new DefaultComboBoxModel(new String[] {"Engineering", "Humanities", "Business"}));
		efaculty.setBounds(180, 230, 400, 30);
		contentPane.add(efaculty);
		
		JComboBox edepartment = new JComboBox();
		edepartment.setModel(new DefaultComboBoxModel(new String[] {"Computer Science and Engineering", "Electronics and Electric Engineering"}));
		edepartment.setBounds(180, 270, 400, 30);
		contentPane.add(edepartment);
		
		JButton EClear = new JButton("CLEAR");
		EClear.setBackground(new Color(0, 191, 255));
		EClear.setBounds(433, 330, 117, 35);
		contentPane.add(EClear);
		
		JButton btnAlreadyAccountPlease = new JButton("Already Account? Please Log In..");
		btnAlreadyAccountPlease.setBounds(200, 380, 350, 25);
		contentPane.add(btnAlreadyAccountPlease);
	}
}

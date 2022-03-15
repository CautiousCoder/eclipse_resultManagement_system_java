package com.SignupLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Color;

public class StudentSignup extends JFrame {

	private JPanel contentPane;
	private JTextField sname;
	private JTextField sphone;
	private JTextField semail;
	private JPasswordField spassword;
	private JTextField sid;
	private JTextField sreg;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField fphone;
	private JTextField mphone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSignup frame = new StudentSignup();
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
	public StudentSignup() {
		setTitle("Student SignUp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 750, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ssignup = new JButton("SIGN UP");
		ssignup.setBackground(new Color(0, 191, 255));
		ssignup.setBounds(195, 400, 117, 35);
		contentPane.add(ssignup);
		
		JLabel lblNewLabel = new JLabel("STUDENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 34));
		lblNewLabel.setBounds(100, 10, 550, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblName.setBounds(30, 60, 100, 30);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("PHONE :");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmail.setBounds(30, 100, 100, 30);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("EMAIL :");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword.setBounds(30, 140, 100, 30);
		contentPane.add(lblPassword);
		
		JLabel lblPassword_1 = new JLabel("PASSWORD :");
		lblPassword_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1.setBounds(30, 180, 100, 30);
		contentPane.add(lblPassword_1);
		
		sname = new JTextField();
		sname.setToolTipText("Enter Your Name");
		sname.setBounds(135, 60, 300, 30);
		contentPane.add(sname);
		sname.setColumns(10);
		
		sphone = new JTextField();
		sphone.setToolTipText("Enter Phone Number");
		sphone.setColumns(10);
		sphone.setBounds(135, 100, 300, 30);
		contentPane.add(sphone);
		
		semail = new JTextField();
		semail.setToolTipText("Enter Email");
		semail.setColumns(10);
		semail.setBounds(135, 140, 300, 30);
		contentPane.add(semail);
		
		spassword = new JPasswordField();
		spassword.setToolTipText("Enter New Password");
		spassword.setBounds(135, 180, 300, 30);
		contentPane.add(spassword);
		
		JLabel lblIdNo = new JLabel("ID NO. :");
		lblIdNo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIdNo.setBounds(455, 60, 100, 30);
		contentPane.add(lblIdNo);
		
		JLabel lblReggNo = new JLabel("REGG. NO. :");
		lblReggNo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblReggNo.setBounds(455, 100, 100, 30);
		contentPane.add(lblReggNo);
		
		JLabel lblSession = new JLabel("SESSION :");
		lblSession.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSession.setBounds(455, 140, 100, 30);
		contentPane.add(lblSession);
		
		sid = new JTextField();
		sid.setToolTipText("Enter Your Name");
		sid.setColumns(10);
		sid.setBounds(550, 60, 150, 30);
		contentPane.add(sid);
		
		sreg = new JTextField();
		sreg.setToolTipText("Enter Your Name");
		sreg.setColumns(10);
		sreg.setBounds(550, 100, 150, 30);
		contentPane.add(sreg);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2015 - 16", "2016 - 17", "2017 - 18", "2018 -19", "2019 - 20", "2020 - 21", "2021 - 22"}));
		comboBox.setBounds(550, 140, 150, 30);
		contentPane.add(comboBox);
		
		JLabel lblG = new JLabel("GENDER :");
		lblG.setFont(new Font("Dialog", Font.BOLD, 14));
		lblG.setBounds(455, 180, 100, 30);
		contentPane.add(lblG);
		
		JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		rdbtnFemale.setBounds(550, 183, 82, 30);
		contentPane.add(rdbtnFemale);
		
		JRadioButton rdbtnMale = new JRadioButton("MALE");
		rdbtnMale.setBounds(636, 183, 82, 30);
		contentPane.add(rdbtnMale);
		
		JLabel lblPassword_1_1 = new JLabel("FATHER'S NAME :");
		lblPassword_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_1.setBounds(30, 220, 140, 30);
		contentPane.add(lblPassword_1_1);
		
		JLabel lblPassword_1_1_1 = new JLabel("MOTHER'S NAME :");
		lblPassword_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_1_1.setBounds(30, 260, 140, 30);
		contentPane.add(lblPassword_1_1_1);
		
		textField = new JTextField();
		textField.setToolTipText("Enter Phone Number");
		textField.setColumns(10);
		textField.setBounds(185, 220, 250, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Enter Phone Number");
		textField_1.setColumns(10);
		textField_1.setBounds(185, 260, 250, 30);
		contentPane.add(textField_1);
		
		JLabel lblEmail_1 = new JLabel("PHONE :");
		lblEmail_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmail_1.setBounds(455, 220, 75, 30);
		contentPane.add(lblEmail_1);
		
		JLabel lblEmail_1_1 = new JLabel("PHONE :");
		lblEmail_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmail_1_1.setBounds(455, 260, 75, 30);
		contentPane.add(lblEmail_1_1);
		
		fphone = new JTextField();
		fphone.setToolTipText("Enter Your Name");
		fphone.setColumns(10);
		fphone.setBounds(550, 220, 150, 30);
		contentPane.add(fphone);
		
		mphone = new JTextField();
		mphone.setToolTipText("Enter Your Name");
		mphone.setColumns(10);
		mphone.setBounds(550, 260, 150, 30);
		contentPane.add(mphone);
		
		JLabel lblPassword_1_2 = new JLabel("FACULTY :");
		lblPassword_1_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_2.setBounds(30, 300, 100, 30);
		contentPane.add(lblPassword_1_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Engineering", "Humanities", "Business","Arts"}));
		comboBox_1.setBounds(185, 300, 350, 30);
		contentPane.add(comboBox_1);
		
		JLabel lblPassword_1_1_1_1 = new JLabel("DEPARTMENT :");
		lblPassword_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_1_1_1.setBounds(30, 340, 120, 30);
		contentPane.add(lblPassword_1_1_1_1);
		
		JComboBox sdepartment = new JComboBox();
		sdepartment.setModel(new DefaultComboBoxModel(new String[] {"Computer Science and Engineering", "Electrical and Electronics Engineering"}));
		sdepartment.setBounds(185, 340, 350, 30);
		contentPane.add(sdepartment);
		
		JButton sclear = new JButton("CLEAR");
		sclear.setBackground(new Color(0, 191, 255));
		sclear.setBounds(400, 400, 117, 35);
		contentPane.add(sclear);
		
		JButton btnAlreadyAccountPlease = new JButton("Already Account? Please LogIn..");
		btnAlreadyAccountPlease.setBounds(195, 457, 323, 25);
		contentPane.add(btnAlreadyAccountPlease);
	}
}

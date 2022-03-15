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

public class TeacherSignIn extends JFrame {

	private JPanel contentPane;
	private JTextField tname;
	private JTextField temail;
	private JPasswordField tpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherSignIn frame = new TeacherSignIn();
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
	public TeacherSignIn() {
		setTitle("Teacher SignUp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSignup = new JButton("SIGN UP");
		btnSignup.setBackground(new Color(0, 255, 127));
		btnSignup.setBounds(250, 350, 120, 40);
		contentPane.add(btnSignup);
		
		JLabel lblTeacher = new JLabel("TEACHER");
		lblTeacher.setFont(new Font("Dialog", Font.BOLD, 34));
		lblTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeacher.setBounds(50, 10, 550, 40);
		contentPane.add(lblTeacher);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblName.setBounds(50, 60, 150, 30);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("E-MAIL :");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmail.setBounds(50, 100, 150, 30);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword.setBounds(50, 140, 150, 30);
		contentPane.add(lblPassword);
		
		JLabel lblGender = new JLabel("GENDER :");
		lblGender.setFont(new Font("Dialog", Font.BOLD, 14));
		lblGender.setBounds(50, 180, 150, 30);
		contentPane.add(lblGender);
		
		JLabel lblFaculty = new JLabel("FACULTY :");
		lblFaculty.setFont(new Font("Dialog", Font.BOLD, 14));
		lblFaculty.setBounds(50, 220, 150, 30);
		contentPane.add(lblFaculty);
		
		JLabel lblDepartment = new JLabel("DEPARTMENT :");
		lblDepartment.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDepartment.setBounds(50, 260, 150, 30);
		contentPane.add(lblDepartment);
		
		JLabel lblProfession = new JLabel("PROFESSION :");
		lblProfession.setFont(new Font("Dialog", Font.BOLD, 14));
		lblProfession.setBounds(50, 300, 150, 30);
		contentPane.add(lblProfession);
		
		tname = new JTextField();
		tname.setToolTipText("Enter Your Name");
		tname.setBounds(190, 60, 400, 30);
		contentPane.add(tname);
		tname.setColumns(10);
		
		temail = new JTextField();
		temail.setToolTipText("Enter Your Email");
		temail.setColumns(10);
		temail.setBounds(190, 100, 400, 30);
		contentPane.add(temail);
		
		tpassword = new JPasswordField();
		tpassword.setToolTipText("Enter Password");
		tpassword.setBounds(190, 140, 400, 30);
		contentPane.add(tpassword);
		
		JRadioButton tgenderfemale = new JRadioButton("Female");
		tgenderfemale.setBounds(190, 190, 149, 23);
		contentPane.add(tgenderfemale);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(350, 190, 149, 23);
		contentPane.add(rdbtnMale);
		
		JComboBox tcomboBox = new JComboBox();
		tcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Engineering", "Humanities", "Business"}));
		tcomboBox.setBounds(190, 220, 400, 30);
		contentPane.add(tcomboBox);
		
		JComboBox tcomboBox_1 = new JComboBox();
		tcomboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Computer Science and Engineering", "Electronics and Electric Engineering"}));
		tcomboBox_1.setBounds(190, 260, 400, 30);
		contentPane.add(tcomboBox_1);
		
		JComboBox tcomboBox_2 = new JComboBox();
		tcomboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Professor", "Assistant Professior", "Lecturer"}));
		tcomboBox_2.setBounds(190, 300, 400, 30);
		contentPane.add(tcomboBox_2);
		
		JButton talreadyaccount = new JButton("Already Account? Please Log In..");
		talreadyaccount.setBounds(250, 410, 282, 25);
		contentPane.add(talreadyaccount);
		
		JButton tClear = new JButton("CLEAR");
		tClear.setBackground(new Color(0, 255, 127));
		tClear.setBounds(413, 350, 120, 40);
		contentPane.add(tClear);
	}
}

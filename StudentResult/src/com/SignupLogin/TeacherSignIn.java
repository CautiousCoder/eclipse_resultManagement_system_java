package com.SignupLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.connection.dbConecction;
import com.resultManagement.Thome;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JLabel lblProfession = new JLabel("DESIGNATION :");
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
		
		JComboBox tfucalty = new JComboBox();
		tfucalty.setModel(new DefaultComboBoxModel(new String[] {"Engineering", "Humanities", "Business"}));
		tfucalty.setBounds(190, 220, 400, 30);
		contentPane.add(tfucalty);
		
		JComboBox tdept = new JComboBox();
		tdept.setModel(new DefaultComboBoxModel(new String[] {"Computer Science and Engineering", "Electronics and Electric Engineering"}));
		tdept.setBounds(190, 260, 400, 30);
		contentPane.add(tdept);
		
		JComboBox tdesig = new JComboBox();
		tdesig.setModel(new DefaultComboBoxModel(new String[] {"Professor", "Assistant Professior", "Lecturer"}));
		tdesig.setBounds(190, 300, 400, 30);
		contentPane.add(tdesig);

		JButton tSignup = new JButton("SIGN UP");
		tSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = tname.getText();
				String email = temail.getText();
				String pass = tpassword.getText();
				String gender = null;
				if(tgenderfemale.isSelected()) {
					gender = "Famele";
				}
				else if(rdbtnMale.isSelected()) {
					gender = "Male";
				}
				String faculty =  (String) tfucalty.getSelectedItem();
				String dept =  (String) tdept.getSelectedItem();
				String desig =  (String) tdesig.getSelectedItem();
				
				try {
					dbConecction c = new dbConecction();
					String sql = "CREATE TABLE IF NOT EXISTS teacherinfo " +
			                   "(name VARCHAR(50), " +
			                   " email VARCHAR(40) PRIMARY KEY, " + 
			                   " password VARCHAR(30), " + 
			                   " gender VARCHAR(10), " + 
			                   " faculty VARCHAR(30), " + 
			                   " department VARCHAR(50)"
			                   + " profession VARCHAR(50))";
					c.state.execute(sql);
					
					String query = "INSERT INTO teacherinfo values('"+name+"','"+email+"','"+pass+"','"+gender+"','"+faculty+"','"+dept+"','"+desig+"')";
					int x = c.state.executeUpdate(query);
					if (x == 0) {
                        JOptionPane.showMessageDialog(tSignup, "This is alredy exist");
                    } else {
                    	Thome hom = new Thome();
                        JOptionPane.showMessageDialog(tSignup,
                            "Welcome, " + name + ". Your account is sucessfully created");
                        
                        hom.setVisible(true);
                        setVisible(false);
                        
                    }
                    c.conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		tSignup.setBackground(new Color(0, 255, 127));
		tSignup.setBounds(250, 350, 120, 40);
		contentPane.add(tSignup);
		
		JButton talreadyaccount = new JButton("Already Account? Please Log In..");
		talreadyaccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TeacherLogin tl = new TeacherLogin();
				tl.setVisible(true);
				setVisible(false);
			}
		});
		talreadyaccount.setBounds(250, 410, 282, 25);
		contentPane.add(talreadyaccount);
		
		JButton tClear = new JButton("CLEAR");
		tClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tname.setText("");
				temail.setText("");
				tpassword.setText("");
				tfucalty.setSelectedIndex(0);
				tdept.setSelectedIndex(0);
				tdesig.setSelectedIndex(0);
				tgenderfemale.setSelected(false);
				rdbtnMale.setSelected(false);
			}
		});
		tClear.setBackground(new Color(0, 255, 127));
		tClear.setBounds(413, 350, 120, 40);
		contentPane.add(tClear);
	}
}

package com.SignupLogin;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.connection.dbConecction;
import com.resultManagement.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentSignup extends JFrame {

	private JPanel contentPane;
	private JTextField sname;
	private JTextField sphone;
	private JTextField semail;
	private JPasswordField spassword;
	private JTextField sid;
	private JTextField sreg;
	private JTextField faname;
	private JTextField moname;
	private JTextField fphone;
	private JTextField mphone;
	private JTextField saddress;

	
	String email;
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
		setBounds(300, 100, 750, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel erroremail = new JLabel("");
		erroremail.setForeground(Color.RED);
		erroremail.setHorizontalAlignment(SwingConstants.CENTER);
		erroremail.setBounds(135, 165, 300, 20);
		contentPane.add(erroremail);
		
		semail = new JTextField();
		semail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
				Pattern patt =Pattern.compile(PATTERN);
				Matcher match = patt.matcher(semail.getText());
				if(!match.matches()) {
					erroremail.setText("Invalid Email.!");
					return;
				} else {
					email = semail.getText();
					erroremail.setText(null);
				}
			}
		});
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
		sid.setToolTipText("Enter Your ID No.");
		sid.setColumns(10);
		sid.setBounds(550, 60, 150, 30);
		contentPane.add(sid);
		
		sreg = new JTextField();
		sreg.setToolTipText("Enter Your Reg. No.");
		sreg.setColumns(10);
		sreg.setBounds(550, 100, 150, 30);
		contentPane.add(sreg);
		
		JComboBox sses = new JComboBox();
		sses.setModel(new DefaultComboBoxModel(new String[] {"2015 - 16", "2016 - 17", "2017 - 18", "2018 - 19", "2019 - 20", "2020 - 21", "2021 - 22"}));
		sses.setBounds(550, 140, 150, 30);
		contentPane.add(sses);
		
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
		
		faname = new JTextField();
		faname.setToolTipText("Enter Father's Name");
		faname.setColumns(10);
		faname.setBounds(185, 220, 250, 30);
		contentPane.add(faname);
		
		moname = new JTextField();
		moname.setToolTipText("Enter Mother's Name");
		moname.setColumns(10);
		moname.setBounds(185, 260, 250, 30);
		contentPane.add(moname);
		
		JLabel lblEmail_1 = new JLabel("PHONE :");
		lblEmail_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmail_1.setBounds(455, 220, 75, 30);
		contentPane.add(lblEmail_1);
		
		JLabel lblEmail_1_1 = new JLabel("PHONE :");
		lblEmail_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmail_1_1.setBounds(455, 260, 75, 30);
		contentPane.add(lblEmail_1_1);
		
		fphone = new JTextField();
		fphone.setToolTipText("Father's Phone");
		fphone.setColumns(10);
		fphone.setBounds(550, 220, 150, 30);
		contentPane.add(fphone);
		
		mphone = new JTextField();
		mphone.setToolTipText("Mother's Phone");
		mphone.setColumns(10);
		mphone.setBounds(550, 260, 150, 30);
		contentPane.add(mphone);
		
		JLabel lblPassword_1_2 = new JLabel("FACULTY :");
		lblPassword_1_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_2.setBounds(30, 340, 100, 30);
		contentPane.add(lblPassword_1_2);
		
		JComboBox sfaculty = new JComboBox();
		sfaculty.setModel(new DefaultComboBoxModel(new String[] {"Engineering", "Humanities", "Business","Arts"}));
		sfaculty.setBounds(185, 340, 350, 30);
		contentPane.add(sfaculty);
		
		JLabel lblPassword_1_1_1_1 = new JLabel("DEPARTMENT :");
		lblPassword_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_1_1_1.setBounds(30, 380, 120, 30);
		contentPane.add(lblPassword_1_1_1_1);
		
		JComboBox sdepartment = new JComboBox();
		sdepartment.setModel(new DefaultComboBoxModel(new String[] {"Computer Science and Engineering", "Electrical and Electronics Engineering"}));
		sdepartment.setBounds(185, 380, 350, 30);
		contentPane.add(sdepartment);
		
		JLabel lblPassword_1_2_1 = new JLabel("ADDRESS :");
		lblPassword_1_2_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_2_1.setBounds(30, 300, 100, 30);
		contentPane.add(lblPassword_1_2_1);
		
		saddress = new JTextField();
		saddress.setToolTipText("Enter Your Address");
		saddress.setColumns(10);
		saddress.setBounds(185, 300, 515, 30);
		contentPane.add(saddress);
		
		JButton ssignup = new JButton("SIGN UP");
		ssignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = sname.getText();
				email = semail.getText();
				String phone = sphone.getText();
				String pass = spassword.getText();
				String id = sid.getText();
				String reg = sreg.getText();
				String fname = faname.getText();
				String mname = moname.getText();
				String fphon = fphone.getText();
				String mphon = mphone.getText();
				String address = saddress.getText();
				String gender = null;
				if(rdbtnFemale.isSelected()) {
					gender = "Female";
				} else if(rdbtnMale.isSelected()) {
					gender = "Male";
				}
				
				String session = (String) sses.getSelectedItem();
				String faculty = (String) sfaculty.getSelectedItem();
				String dept = (String) sdepartment.getSelectedItem();
				
				try {
					if(sid.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Email field is required."); 
					}
					if(semail.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Email field is required."); 
					}
					if(spassword.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Password field is required."); 
					}
					dbConecction c = new dbConecction();
					String sql = "CREATE TABLE IF NOT EXISTS studentinfo " +
			                   "(id VARCHAR(10) NOT NULL PRIMARY KEY," + 
			                   "reg VARCHAR(10) ," +
			                   "session VARCHAR(10)," +
			                   "name VARCHAR(50)," +
			                   "phone VARCHAR(15)," +
			                   " email VARCHAR(40), " + 
			                   " password VARCHAR(30), " + 
			                   "fathername VARCHAR(50)," +
			                   "mothername VARCHAR(50)," +
			                   "fatherphone VARCHAR(15)," +
			                   "motherphone VARCHAR(15)," +
			                   "address VARCHAR(100)," +
			                   " gender VARCHAR(10), " + 
			                   " faculty VARCHAR(30), " + 
			                   " department VARCHAR(50))";
					c.state.execute(sql);
					 //dispose();
					
					String query = "INSERT INTO studentinfo values('"+id+"','"+reg+"','"+session+"','"+name+"','"+phone+"','"+email+"','"+pass+"','"+fname+"','"+mname+"','"+fphon+"','"+mphon+"','"+address+"','"+gender+"','"+faculty+"','"+dept+"')";
					int x = c.state.executeUpdate(query);
					if (x == 0) {
                        JOptionPane.showMessageDialog(ssignup, "This is alredy exist");
                    } else {
                    	Shome hom = new Shome();
                        JOptionPane.showMessageDialog(ssignup,
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
		ssignup.setBackground(new Color(0, 191, 255));
		ssignup.setBounds(195, 430, 117, 35);
		contentPane.add(ssignup);

		JButton sclear = new JButton("CLEAR");
		sclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sname.setText("");
				semail.setText("");
				sphone.setText("");
				spassword.setText("");
				sid.setText("");
				sreg.setText("");
				faname.setText("");
				moname.setText("");
				fphone.setText("");
				mphone.setText("");
				saddress.setText("");
				sses.setSelectedIndex(0);
				sfaculty.setSelectedIndex(0);
				sdepartment.setSelectedIndex(0);
				rdbtnFemale.setSelected(false);
				rdbtnMale.setSelected(false);
			}
		});
		sclear.setBackground(new Color(0, 191, 255));
		sclear.setBounds(400, 430, 117, 35);
		contentPane.add(sclear);
		
		JButton btnAlreadyAccountPlease = new JButton("Already Account? Please LogIn..");
		btnAlreadyAccountPlease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentLogin sl = new StudentLogin();
				sl.setVisible(true);
				setVisible(false);
			}
		});
		btnAlreadyAccountPlease.setBounds(195, 480, 323, 25);
		contentPane.add(btnAlreadyAccountPlease);
	}
}

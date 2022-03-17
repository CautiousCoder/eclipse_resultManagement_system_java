package com.SignupLogin;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.connection.dbConecction;
import com.resultManagement.*;
import java.awt.event.*;

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
		

		JButton eSignup = new JButton("SIGN UP");
		eSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = ename.getText();
				String email = eEmail.getText();
				String pass = epassword.getText();
				String gender = null;
				if(egenterFemale.isSelected()) {
					gender = "Famele";
				}
				else if(rdbtnMale.isSelected()) {
					gender = "Male";
				}
				String faculty =  (String) efaculty.getSelectedItem();
				String dept =  (String) edepartment.getSelectedItem();
				
				try {
					dbConecction c = new dbConecction();
					String sql = "CREATE TABLE IF NOT EXISTS employeeinfo " +
			                   "(name VARCHAR(50), " +
			                   " email VARCHAR(40) PRIMARY KEY, " + 
			                   " password VARCHAR(30), " + 
			                   " gender VARCHAR(10), " + 
			                   " faculty VARCHAR(30), " + 
			                   " department VARCHAR(50))";
					c.state.execute(sql);
					 //dispose();
					
					String query = "INSERT INTO employeeinfo values('"+name+"','"+email+"','"+pass+"','"+gender+"','"+faculty+"','"+dept+"')";
					int x = c.state.executeUpdate(query);
					if (x == 0) {
                        JOptionPane.showMessageDialog(eSignup, "This is alredy exist");
                    } else {
                    	Thome hom = new Thome();
                        JOptionPane.showMessageDialog(eSignup,
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
		eSignup.setBackground(new Color(0, 206, 209));
		eSignup.setBounds(200, 330, 117, 35);
		contentPane.add(eSignup);
		
		JButton EClear = new JButton("CLEAR");
		EClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ename.setText("");
				eEmail.setText("");
				epassword.setText("");
				efaculty.setSelectedIndex(0);
				edepartment.setSelectedIndex(0);
				egenterFemale.setSelected(false);
				rdbtnMale.setSelected(false);
			}
		});
		EClear.setBackground(new Color(0, 191, 255));
		EClear.setBounds(433, 330, 117, 35);
		contentPane.add(EClear);
		
		JButton btnAlreadyAccountPlease = new JButton("Already Account? Please Log In..");
		btnAlreadyAccountPlease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EmployeeLogin el = new EmployeeLogin();
				el.setVisible(true);
				setVisible(false);
			}
		});
		btnAlreadyAccountPlease.setBounds(200, 380, 350, 25);
		contentPane.add(btnAlreadyAccountPlease);
	}
}

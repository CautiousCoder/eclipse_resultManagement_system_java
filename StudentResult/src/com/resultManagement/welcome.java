package com.resultManagement;

import java.awt.*;
import javax.swing.*;
import com.SignupLogin.*;
import java.awt.event.*;

public class welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome frame = new welcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// github token: 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

	/**
	 * Create the frame.
	 */
	public welcome() {
		setFont(new Font("Dialog", Font.BOLD, 38));
		setTitle("WellCome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 770, 600);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JLabel lblNewLabel = new JLabel("WELLCOME");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 66));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(150, 30, 500, 70);
		contentPane.add(lblNewLabel);
		
		JButton teacherButton = new JButton("Teacher's");
		teacherButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TeacherLogin tc = new TeacherLogin();
				tc.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setForeground(new Color(255, 0, 255));
		lblTo.setFont(new Font("Dialog", Font.BOLD, 28));
		lblTo.setBounds(350, 105, 70, 40);
		contentPane.add(lblTo);
		
		JLabel lblNewLabel_2 = new JLabel("BEGUM ROKEYA UNIVERSITY, RANGPUR");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 32));
		lblNewLabel_2.setBounds(12, 150, 746, 60);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblLogInAs = new JLabel("LOG IN AS : ");
		lblLogInAs.setFont(new Font("Dialog", Font.BOLD, 20));
		lblLogInAs.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogInAs.setForeground(new Color(255, 0, 0));
		lblLogInAs.setBounds(250, 235, 200, 30);
		contentPane.add(lblLogInAs);
		teacherButton.setToolTipText("If you Teacher please click..");
		teacherButton.setBackground(new Color(0, 206, 209));
		teacherButton.setFont(new Font("Dialog", Font.BOLD, 24));
		teacherButton.setBounds(250, 280, 200, 40);
		contentPane.add(teacherButton);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EmployeeLogin em = new EmployeeLogin();
				em.setVisible(true);
				setVisible(false);
			}
		});
		btnEmployee.setToolTipText("If you Teacher employee click..");
		btnEmployee.setFont(new Font("Dialog", Font.BOLD, 24));
		btnEmployee.setBackground(new Color(255, 0, 255));
		btnEmployee.setBounds(250, 340, 200, 40);
		contentPane.add(btnEmployee);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentLogin st = new StudentLogin();
				st.setVisible(true);
				setVisible(false);
			}
		});
		btnStudent.setToolTipText("If you are Student please click..");
		btnStudent.setFont(new Font("Dialog", Font.BOLD, 24));
		btnStudent.setBackground(new Color(50, 205, 50));
		btnStudent.setBounds(250, 400, 200, 40);
		contentPane.add(btnStudent);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setToolTipText("");
		btnExit.setFont(new Font("Dialog", Font.BOLD, 24));
		btnExit.setBackground(new Color(255, 255, 240));
		btnExit.setBounds(300, 470, 100, 40);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(welcome.class.getResource("/image/brur.jpg")));
		lblNewLabel_1.setBounds(0, -15, 780, 600);
		contentPane.add(lblNewLabel_1);
		
		
		
		//using thread
//		setVisible(true);
//		while(true) {
//			lblNewLabel.setVisible(false);
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {}
//			lblNewLabel.setVisible(true);
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {}
//		}
	}
}

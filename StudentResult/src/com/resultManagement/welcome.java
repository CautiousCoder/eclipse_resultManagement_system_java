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
		setBounds(300, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JLabel lblNewLabel = new JLabel("WELLCOME");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 62));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(90, 30, 450, 60);
		contentPane.add(lblNewLabel);
		
		JButton teacherButton = new JButton("Teacher's");
		teacherButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TeacherLogin tc = new TeacherLogin();
				tc.setVisible(true);
				setVisible(false);
			}
		});
		teacherButton.setToolTipText("If you Teacher please click..");
		teacherButton.setBackground(new Color(0, 206, 209));
		teacherButton.setFont(new Font("Dialog", Font.BOLD, 24));
		teacherButton.setBounds(220, 115, 200, 40);
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
		btnEmployee.setBackground(new Color(65, 105, 225));
		btnEmployee.setBounds(220, 170, 200, 40);
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
		btnStudent.setBounds(220, 225, 200, 40);
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
		btnExit.setBounds(265, 310, 100, 40);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(welcome.class.getResource("/image/BegumRokeyaUniversity.jpg")));
		lblNewLabel_1.setBounds(0, 0, 650, 400);
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

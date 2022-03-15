package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

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

	/**
	 * Create the frame.
	 */
	public welcome() {
		setFont(new Font("Dialog", Font.BOLD, 38));
		setTitle("WellCome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELLCOME");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 62));
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 30, 450, 60);
		contentPane.add(lblNewLabel);
		
		JButton teacherButton = new JButton("Teacher's");
		teacherButton.setToolTipText("If you Teacher please click..");
		teacherButton.setBackground(new Color(0, 206, 209));
		teacherButton.setFont(new Font("Dialog", Font.BOLD, 24));
		teacherButton.setBounds(170, 115, 200, 40);
		contentPane.add(teacherButton);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.setToolTipText("If you Teacher employee click..");
		btnEmployee.setFont(new Font("Dialog", Font.BOLD, 24));
		btnEmployee.setBackground(new Color(65, 105, 225));
		btnEmployee.setBounds(170, 170, 200, 40);
		contentPane.add(btnEmployee);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.setToolTipText("If you are Student please click..");
		btnStudent.setFont(new Font("Dialog", Font.BOLD, 24));
		btnStudent.setBackground(new Color(50, 205, 50));
		btnStudent.setBounds(170, 225, 200, 40);
		contentPane.add(btnStudent);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setToolTipText("");
		btnExit.setFont(new Font("Dialog", Font.BOLD, 24));
		btnExit.setBackground(new Color(255, 255, 240));
		btnExit.setBounds(220, 310, 100, 40);
		contentPane.add(btnExit);
	}
}

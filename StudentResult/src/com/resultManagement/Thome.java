package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Thome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thome frame = new Thome();
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
	public Thome() {
		setTitle("Teacher's Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 750, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTeacher = new JButton("Teacher");
		btnTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Teacherview tv = new Teacherview();
				tv.setVisible(true);
				setVisible(false);
			}
		});
		btnTeacher.setForeground(Color.DARK_GRAY);
		btnTeacher.setFont(new Font("Dialog", Font.BOLD, 20));
		btnTeacher.setBackground(new Color(51, 255, 255));
		btnTeacher.setBounds(60, 90, 150, 40);
		contentPane.add(btnTeacher);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchStudent ss = new SearchStudent();
				ss.setVisible(true);
				setVisible(false);
			}
		});
		btnStudent.setForeground(Color.WHITE);
		btnStudent.setFont(new Font("Dialog", Font.BOLD, 20));
		btnStudent.setBackground(new Color(0, 153, 204));
		btnStudent.setBounds(60, 160, 150, 40);
		contentPane.add(btnStudent);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TShowEmployee tse = new TShowEmployee();
				tse.setVisible(true);
				setVisible(false);
			}
		});
		btnEmployee.setForeground(Color.WHITE);
		btnEmployee.setFont(new Font("Dialog", Font.BOLD, 20));
		btnEmployee.setBackground(new Color(0, 0, 255));
		btnEmployee.setBounds(60, 230, 150, 40);
		contentPane.add(btnEmployee);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TeacherShowResult tsr = new TeacherShowResult();
				tsr.setVisible(true);
				setVisible(false);
			}
		});
		btnResult.setForeground(Color.WHITE);
		btnResult.setFont(new Font("Dialog", Font.BOLD, 20));
		btnResult.setBackground(new Color(51, 102, 255));
		btnResult.setBounds(60, 300, 150, 40);
		contentPane.add(btnResult);
		
		JButton btnLogUot = new JButton("Log Out");
		btnLogUot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				welcome wc = new welcome();
				wc.setVisible(true);
				setVisible(false);
			}
		});
		btnLogUot.setForeground(Color.RED);
		btnLogUot.setFont(new Font("Dialog", Font.BOLD, 20));
		btnLogUot.setBackground(new Color(255, 51, 255));
		btnLogUot.setBounds(60, 370, 150, 40);
		contentPane.add(btnLogUot);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Thome.class.getResource("/image/brur.jpg")));
		label.setBounds(250, 20, 480, 490);
		contentPane.add(label);
	}
}

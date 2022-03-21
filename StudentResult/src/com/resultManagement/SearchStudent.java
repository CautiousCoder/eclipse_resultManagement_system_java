package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class SearchStudent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchStudent frame = new SearchStudent();
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
	public SearchStudent() {
		setTitle("Studend");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepartment = new JLabel("DEPARTMENT");
		lblDepartment.setBackground(Color.GRAY);
		lblDepartment.setForeground(new Color(0, 255, 0));
		lblDepartment.setFont(new Font("Dialog", Font.BOLD, 20));
		lblDepartment.setBounds(100, 70, 280, 30);
		contentPane.add(lblDepartment);
		
		JLabel lblSession = new JLabel("SESSION");
		lblSession.setForeground(new Color(0, 255, 0));
		lblSession.setFont(new Font("Dialog", Font.BOLD, 20));
		lblSession.setBounds(410, 70, 180, 30);
		contentPane.add(lblSession);
		
		JComboBox ssdepartmest = new JComboBox();
		ssdepartmest.setModel(new DefaultComboBoxModel(new String[] {"Computer Science and Engineering", "Electrical and Electronics Engineering"}));
		ssdepartmest.setBounds(100, 105, 270, 30);
		contentPane.add(ssdepartmest);
		
		JComboBox sssession = new JComboBox();
		sssession.setModel(new DefaultComboBoxModel(new String[] {"2015 - 16", "2016 - 17", "2017 - 18", "2018 - 19", "2019 - 20", "2020 - 21", "2021 - 22"}));
		sssession.setBounds(410, 105, 200, 30);
		contentPane.add(sssession);
		
		JButton sssubmit = new JButton("SUBMIT");
		sssubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String session = (String) sssession.getSelectedItem();
				String dept = (String) ssdepartmest.getSelectedItem();
				TeacherShowStudent tss = new TeacherShowStudent(dept,session);
				tss.setVisible(true);
				setVisible(false);
				
			}
		});
		sssubmit.setFont(new Font("Dialog", Font.BOLD, 16));
		sssubmit.setBackground(new Color(65, 105, 225));
		sssubmit.setForeground(Color.WHITE);
		sssubmit.setBounds(175, 185, 150, 35);
		contentPane.add(sssubmit);
		
		JButton ssback = new JButton("BACK");
		ssback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Thome tm = new Thome();
				tm.setVisible(true);
				setVisible(false);
			}
		});
		ssback.setForeground(Color.WHITE);
		ssback.setFont(new Font("Dialog", Font.BOLD, 16));
		ssback.setBackground(new Color(250, 128, 114));
		ssback.setBounds(350, 185, 150, 35);
		contentPane.add(ssback);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(255, 0, 0));
		label.setIcon(new ImageIcon(SearchStudent.class.getResource("/image/TeachersSAlaryIncrease.jpg")));
		label.setBounds(0, -10, 700, 450);
		contentPane.add(label);
	}
}

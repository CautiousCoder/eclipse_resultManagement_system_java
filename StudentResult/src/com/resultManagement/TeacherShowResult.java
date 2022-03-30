package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeacherShowResult extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherShowResult frame = new TeacherShowResult();
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
	public TeacherShowResult() {
		setTitle("Result");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCreateResult = new JButton("CREATE RESULT");
		btnCreateResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ESearchCreateResult escr = new ESearchCreateResult();
				escr.setVisible(true);
				setVisible(false);
			}
		});
		btnCreateResult.setFont(new Font("Dialog", Font.BOLD, 18));
		btnCreateResult.setBounds(60, 30, 200, 40);
		contentPane.add(btnCreateResult);
		
		JButton btnShowResult = new JButton("SHOW RESULT");
		btnShowResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ESearchResult esr = new ESearchResult();
				esr.setVisible(true);
				setVisible(false);
			}
		});
		btnShowResult.setFont(new Font("Dialog", Font.BOLD, 18));
		btnShowResult.setBounds(60, 90, 200, 40);
		contentPane.add(btnShowResult);
		
		JButton btnUpdateResult = new JButton("UPDATE RESULT");
		btnUpdateResult.setFont(new Font("Dialog", Font.BOLD, 18));
		btnUpdateResult.setBounds(60, 150, 200, 40);
		contentPane.add(btnUpdateResult);
		
		JButton btnDeleteResult = new JButton("DELETE RESULT");
		btnDeleteResult.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDeleteResult.setBounds(60, 210, 200, 40);
		contentPane.add(btnDeleteResult);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Thome th = new Thome();
				th.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Dialog", Font.BOLD, 18));
		btnBack.setBounds(60, 270, 200, 40);
		contentPane.add(btnBack);
	}
}

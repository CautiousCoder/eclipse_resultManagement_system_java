package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ehome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ehome frame = new Ehome();
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
	public Ehome() {
		setTitle("Employee Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
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
		btnCreateResult.setForeground(new Color(255, 250, 250));
		btnCreateResult.setBackground(new Color(0, 255, 127));
		btnCreateResult.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCreateResult.setBounds(40, 120, 170, 40);
		contentPane.add(btnCreateResult);
		
		JButton btnUpdateResult = new JButton("UPDATE RESULT");
		btnUpdateResult.setBackground(new Color(30, 144, 255));
		btnUpdateResult.setForeground(new Color(255, 255, 255));
		btnUpdateResult.setFont(new Font("Dialog", Font.BOLD, 14));
		btnUpdateResult.setBounds(40, 180, 170, 40);
		contentPane.add(btnUpdateResult);
		
		JButton btnDeleteResult = new JButton("DELETE RESULT");
		btnDeleteResult.setForeground(new Color(255, 0, 0));
		btnDeleteResult.setFont(new Font("Dialog", Font.BOLD, 14));
		btnDeleteResult.setBounds(40, 240, 170, 40);
		contentPane.add(btnDeleteResult);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				welcome wc = new welcome();
				wc.setVisible(true);
				setVisible(false);
			}
		});
		btnLogOut.setForeground(new Color(255, 250, 250));
		btnLogOut.setBackground(new Color(255, 0, 0));
		btnLogOut.setFont(new Font("Dialog", Font.BOLD, 14));
		btnLogOut.setBounds(40, 300, 170, 40);
		contentPane.add(btnLogOut);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Ehome.class.getResource("/image/ss.jpg")));
		label.setBounds(260, -10, 490, 510);
		contentPane.add(label);
		
		JButton btnShowResult = new JButton("SHOW RESULT");
		btnShowResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ESearchResult esr = new ESearchResult();
				esr.setVisible(true);
				setVisible(false);
			}
		});
		btnShowResult.setForeground(new Color(255, 250, 250));
		btnShowResult.setFont(new Font("Dialog", Font.BOLD, 14));
		btnShowResult.setBackground(new Color(255, 0, 255));
		btnShowResult.setBounds(40, 60, 170, 40);
		contentPane.add(btnShowResult);
	}
}

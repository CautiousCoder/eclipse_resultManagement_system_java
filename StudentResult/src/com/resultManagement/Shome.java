package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Shome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shome frame = new Shome();
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
	public Shome() {
		setTitle("Student's Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 48));
		lblNewLabel.setBounds(150, 20, 350, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setForeground(new Color(255, 0, 0));
		lblTo.setFont(new Font("Dialog", Font.BOLD, 24));
		lblTo.setBounds(270, 90, 70, 30);
		contentPane.add(lblTo);
		
		JLabel lblNewLabel_1 = new JLabel("BEGUM ROKEYA UNIVERSITY, RANGPUR.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(10, 130, 620, 40);
		contentPane.add(lblNewLabel_1);
		
		JButton btnProfile = new JButton("PROFILE");
		btnProfile.setFont(new Font("Dialog", Font.BOLD, 16));
		btnProfile.setBounds(60, 251, 200, 35);
		contentPane.add(btnProfile);
		
		JButton btnResult = new JButton("RESULT");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SShowResult ssr = new SShowResult();
				ssr.setVisible(true);
				setVisible(false);
			}
		});
		btnResult.setFont(new Font("Dialog", Font.BOLD, 16));
		btnResult.setBounds(391, 251, 200, 35);
		contentPane.add(btnResult);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				welcome wc = new welcome();
				wc.setVisible(true);
				setVisible(false);
			}
		});
		btnLogOut.setForeground(new Color(255, 0, 0));
		btnLogOut.setFont(new Font("Dialog", Font.BOLD, 16));
		btnLogOut.setBounds(228, 300, 200, 35);
		contentPane.add(btnLogOut);
		
		JLabel lblFsadfasfag = new JLabel("");
		lblFsadfasfag.setIcon(new ImageIcon(Shome.class.getResource("/image/student.jpg")));
		lblFsadfasfag.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFsadfasfag.setForeground(new Color(0, 255, 0));
		lblFsadfasfag.setBounds(0, 0, 650, 500);
		contentPane.add(lblFsadfasfag);
	}
}

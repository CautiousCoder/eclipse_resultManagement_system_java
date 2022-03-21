package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ESearchResult extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ESearchResult frame = new ESearchResult();
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
	public ESearchResult() {
		setTitle("Search Result ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYear = new JLabel("YEAR :");
		lblYear.setFont(new Font("Dialog", Font.BOLD, 24));
		lblYear.setBounds(40, 99, 90, 35);
		contentPane.add(lblYear);
		
		JComboBox cyear = new JComboBox();
		cyear.setFont(new Font("Dialog", Font.BOLD, 16));
		cyear.setModel(new DefaultComboBoxModel(new String[] {"1st", "2nd", "3rd", "4th"}));
		cyear.setBounds(140, 99, 130, 35);
		contentPane.add(cyear);
		
		JLabel lblNewLabel = new JLabel("SEMESTER :");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel.setBounds(300, 99, 160, 35);
		contentPane.add(lblNewLabel);
		
		JComboBox cyear_1 = new JComboBox();
		cyear_1.setModel(new DefaultComboBoxModel(new String[] {"1st", "2nd"}));
		cyear_1.setFont(new Font("Dialog", Font.BOLD, 16));
		cyear_1.setBounds(470, 99, 130, 35);
		contentPane.add(cyear_1);
		
		JButton eresultsubmit = new JButton("SUBMIT");
		eresultsubmit.setForeground(new Color(255, 255, 255));
		eresultsubmit.setBackground(new Color(30, 144, 255));
		eresultsubmit.setFont(new Font("Dialog", Font.BOLD, 24));
		eresultsubmit.setBounds(240, 195, 150, 40);
		contentPane.add(eresultsubmit);
		
		JLabel lblNewLabel_1 = new JLabel("VIEW RESULT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_1.setBounds(220, 10, 200, 40);
		contentPane.add(lblNewLabel_1);
	}
}

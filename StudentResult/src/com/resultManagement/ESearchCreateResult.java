package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.connection.dbConecction;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ESearchCreateResult extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ESearchCreateResult frame = new ESearchCreateResult();
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
	public ESearchCreateResult() {
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
		
		JComboBox cryear = new JComboBox();
		cryear.setFont(new Font("Dialog", Font.BOLD, 16));
		cryear.setModel(new DefaultComboBoxModel(new String[] {"1st", "2nd", "3rd", "4th"}));
		cryear.setBounds(140, 99, 130, 35);
		contentPane.add(cryear);
		
		JLabel lblNewLabel = new JLabel("SEMESTER :");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel.setBounds(300, 99, 160, 35);
		contentPane.add(lblNewLabel);
		
		JComboBox crsemister = new JComboBox();
		crsemister.setModel(new DefaultComboBoxModel(new String[] {"1st", "2nd"}));
		crsemister.setFont(new Font("Dialog", Font.BOLD, 16));
		crsemister.setBounds(470, 99, 130, 35);
		contentPane.add(crsemister);
		
		JButton ecreateresultsubmit = new JButton("SUBMIT");
		ecreateresultsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String year = (String) cryear.getSelectedItem();
				String semister = (String) crsemister.getSelectedItem();
				try {
					dbConecction c = new dbConecction();
					String sql = "CREATE TABLE IF NOT EXISTS"+ year+semister +
			                   "(id VARCHAR(10) PRIMARY KEY, " +
			                   "(name VARCHAR(50), " +
			                   " email DOUBLE(4,2) , " + 
			                   " password VARCHAR(30), " + 
			                   " gender VARCHAR(10), " + 
			                   " faculty VARCHAR(30), " + 
			                   " department VARCHAR(50))";
					c.state.execute(sql);
					
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		ecreateresultsubmit.setForeground(new Color(255, 255, 255));
		ecreateresultsubmit.setBackground(new Color(30, 144, 255));
		ecreateresultsubmit.setFont(new Font("Dialog", Font.BOLD, 24));
		ecreateresultsubmit.setBounds(240, 195, 150, 40);
		contentPane.add(ecreateresultsubmit);
		
		JLabel lblNewLabel_1 = new JLabel("CREATE RESULT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_1.setBounds(210, 10, 240, 40);
		contentPane.add(lblNewLabel_1);
	}

}

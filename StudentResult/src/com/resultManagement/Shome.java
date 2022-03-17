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
		setBounds(300, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnGdfgf = new JRadioButton("gdfgf");
		rdbtnGdfgf.setBounds(182, 173, 149, 23);
		contentPane.add(rdbtnGdfgf);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"tetewryt", "urtur", "hfgjfgj", "hjfgj", "jfgjfgjgh"}));
		comboBox.setBounds(90, 100, 300, 40);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(229, 58, 70, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(182, 132, 117, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblFsadfasfag = new JLabel("");
		lblFsadfasfag.setIcon(new ImageIcon(Shome.class.getResource("/image/brur.jpg")));
		lblFsadfasfag.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFsadfasfag.setForeground(new Color(0, 255, 0));
		lblFsadfasfag.setBounds(0, 0, 650, 500);
		contentPane.add(lblFsadfasfag);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(90, 37, 70, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setBounds(278, 237, 70, 15);
		contentPane.add(label);
	}
}

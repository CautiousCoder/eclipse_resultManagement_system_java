package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.connection.dbConecction;
import com.mysql.cj.protocol.Resultset;

import net.proteanit.sql.DbUtils;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Teacherview extends JFrame {

	private JPanel contentPane;
	private JTable teacherinfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacherview frame = new Teacherview();
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
	public Teacherview() {
		setTitle("Teacher Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepartment = new JLabel("DEPARTMENT :");
		lblDepartment.setFont(new Font("Dialog", Font.BOLD, 16));
		lblDepartment.setBounds(30, 15, 140, 30);
		contentPane.add(lblDepartment);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Computer Science and Engineering", "Electrical and Electronics Engineering"}));
		comboBox.setBounds(175, 15, 320, 32);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 980, 380);
		contentPane.add(scrollPane);
		
		teacherinfo = new JTable();
		scrollPane.setViewportView(teacherinfo);
		
		JButton tLoadData = new JButton("Load Data");
		tLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					dbConecction c = new dbConecction();
					String query = "SELECT name,email,gender,faculty,department,profession FROM teacherinfo";
					ResultSet rs = (ResultSet) c.state.executeQuery(query);
					ResultSetMetaData rsmd = rs.getMetaData();
					DefaultTableModel model =(DefaultTableModel) teacherinfo.getModel(); 
					
					int cols = rsmd.getColumnCount();
					String[] colName = new String[cols];
					for(int i=0; i<cols; i++)
						colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String name,email,gender,faculty,department,designation;
					while(rs.next()) {
						name = rs.getString(1);
						email = rs.getString(2);
						gender = rs.getString(3);
						faculty = rs.getString(4);
						department = rs.getString(5);
						designation = rs.getString(6);
						String[] row = {name,email,gender,faculty,department,designation};
						model.addRow(row);
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		tLoadData.setForeground(new Color(255, 255, 255));
		tLoadData.setBackground(new Color(30, 144, 255));
		tLoadData.setFont(new Font("Dialog", Font.BOLD, 15));
		tLoadData.setBounds(580, 15, 140, 32);
		contentPane.add(tLoadData);
		
		JButton tBack = new JButton("Back");
		tBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Thome th = new Thome();
				th.setVisible(true);
				setVisible(false);
			}
		});
		tBack.setForeground(Color.WHITE);
		tBack.setFont(new Font("Dialog", Font.BOLD, 15));
		tBack.setBackground(new Color(255, 69, 0));
		tBack.setBounds(750, 15, 130, 32);
		contentPane.add(tBack);
	}

}

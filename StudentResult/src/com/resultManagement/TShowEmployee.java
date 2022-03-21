package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.connection.dbConecction;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.awt.event.ActionEvent;

public class TShowEmployee extends JFrame {

	private JPanel contentPane;
	private JTable EmployeeTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TShowEmployee frame = new TShowEmployee();
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
	public TShowEmployee() {
		setTitle("Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 850, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepartment = new JLabel("DEPARTMENT :");
		lblDepartment.setFont(new Font("Dialog", Font.BOLD, 16));
		lblDepartment.setBounds(40, 15, 140, 30);
		contentPane.add(lblDepartment);
		
		JComboBox edepartment = new JComboBox();
		edepartment.setModel(new DefaultComboBoxModel(new String[] {"Computer Science and Engineering", "Electrical and Electronics Engineering"}));
		edepartment.setBounds(190, 15, 320, 32);
		contentPane.add(edepartment);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 830, 280);
		contentPane.add(scrollPane);
		
		EmployeeTable = new JTable();
		scrollPane.setViewportView(EmployeeTable);
		JButton searchEmployee = new JButton("SEARCH");
		searchEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String dep = (String) edepartment.getSelectedItem();
					dbConecction c = new dbConecction();
					String query = "SELECT name,email,gender,faculty,department FROM employeeinfo WHERE department='"+dep+"' ";
					ResultSet rs = (ResultSet) c.state.executeQuery(query);
					ResultSetMetaData rsmd = rs.getMetaData();
					DefaultTableModel model =(DefaultTableModel) EmployeeTable.getModel(); 
					
					int cols = rsmd.getColumnCount();
					String[] colName = new String[cols];
					for(int i=0; i<cols; i++)
						colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String name,email,gender,faculty,department;
					while(rs.next()) {
						name = rs.getString(1);
						email = rs.getString(2);
						gender = rs.getString(3);
						faculty = rs.getString(4);
						department = rs.getString(5);
						String[] row = {name,email,gender,faculty,department};
						model.addRow(row);
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		searchEmployee.setBackground(new Color(0, 191, 255));
		searchEmployee.setForeground(new Color(255, 255, 255));
		searchEmployee.setFont(new Font("Dialog", Font.BOLD, 16));
		searchEmployee.setBounds(550, 15, 130, 30);
		contentPane.add(searchEmployee);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Thome ss = new Thome();
				ss.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Dialog", Font.BOLD, 16));
		btnBack.setBackground(new Color(255, 99, 71));
		btnBack.setBounds(692, 15, 130, 30);
		contentPane.add(btnBack);
		
	}
}

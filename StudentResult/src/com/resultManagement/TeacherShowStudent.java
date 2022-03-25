package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.connection.dbConecction;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TeacherShowStudent extends JFrame {

	private JPanel contentPane;
	private JTable studenttable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherShowStudent frame = new TeacherShowStudent("Computer Science and Engineering","2018 - 19");
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
	public TeacherShowStudent(String department, String session) {
		setTitle("STUDENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 100, 1300, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepartment = new JLabel("DEPARTMENT :");
		lblDepartment.setBounds(41, 15, 110, 30);
		contentPane.add(lblDepartment);
		
		JLabel lblSession = new JLabel("SESSION :");
		lblSession.setBounds(507, 15, 80, 30);
		contentPane.add(lblSession);
		
		JLabel showdept = new JLabel("");
		showdept.setBounds(150, 15, 340, 30);
		contentPane.add(showdept);
		
		JLabel showsession = new JLabel("");
		showsession.setBounds(590, 15, 150, 30);
		contentPane.add(showsession);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 1280, 500);
		contentPane.add(scrollPane);
		
		studenttable = new JTable();
		scrollPane.setViewportView(studenttable);
		
		JButton showloaddata = new JButton("Load Data");
		showloaddata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					showdept.setText(department);
					showsession.setText(session);
					dbConecction c = new dbConecction();
					String query = "SELECT id,reg,session,name,phone,email,fathername,mothername,fatherphone,motherphone,address,gender FROM studentinfo WHERE department='"+department+"' AND session='"+session+"'";
					ResultSet rs = (ResultSet) c.state.executeQuery(query);
					ResultSetMetaData rsmd = rs.getMetaData();
					DefaultTableModel model =(DefaultTableModel) studenttable.getModel(); 
					
					int cols = rsmd.getColumnCount();
					String[] colName = new String[cols];
					for(int i=0; i<cols; i++)
						colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String id,regg,session,name,phone,email,gender,faculty,department,fathername,mothername,fatherphone,motherphone,address;
					while(rs.next()) {
						id = rs.getString(1);
						regg = rs.getString(2);
						session = rs.getString(3);
						name = rs.getString(4);
						phone = rs.getString(5);
						email = rs.getString(6);
						fathername = rs.getString(7);
						mothername = rs.getString(8);
						fatherphone = rs.getString(9);
						motherphone = rs.getString(10);
						address = rs.getString(11);
						gender = rs.getString(12);
						String[] row = {id,regg,session,name,phone,email,fathername,mothername,fatherphone,motherphone,address,gender};
						model.addRow(row);
					}
					
					 //tLoadData.setModel ((ButtonModel) DbUtils.resultSetToTableModel(rs));
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		showloaddata.setFont(new Font("Dialog", Font.BOLD, 14));
		showloaddata.setBounds(158, 575, 117, 30);
		contentPane.add(showloaddata);
		
		JButton showBack = new JButton("Back");
		showBack.setBackground(new Color(64, 224, 208));
		showBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchStudent ss = new SearchStudent();
				ss.setVisible(true);
				setVisible(false);
			}
			
		});
		showBack.setFont(new Font("Dialog", Font.BOLD, 14));
		showBack.setBounds(505, 575, 117, 30);
		contentPane.add(showBack);
	}
	
}

package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.connection.dbConecction;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.awt.event.ActionEvent;

public class ResultShow extends JFrame {

	private JPanel contentPane;
	private JTable resulttable;
	// some database name
		String s= "1st1st";
		String s1= "1st2nd";
		String s2= "2nd1st";
		String s3= "2nd2nd";
		String s4= "3rd1st";
		String s5= "3rd2nd";
		String s6= "4th1st";
		String s7= "4th2nd";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultShow frame = new ResultShow("1st", "1st");
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
	public ResultShow(String syear, String ssemester) {
		setFont(new Font("Dialog", Font.BOLD, 24));
		setTitle("SHOW RESULT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 100, 1260, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(218, 112, 214));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YEAR :");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 28));
		lblNewLabel.setBounds(250, 40, 130, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblSemester = new JLabel("SEMESTER :");
		lblSemester.setFont(new Font("Dialog", Font.BOLD, 28));
		lblSemester.setBounds(650, 40, 200, 35);
		contentPane.add(lblSemester);
		
		JLabel year = new JLabel("");
		year.setFont(new Font("Dialog", Font.BOLD, 32));
		year.setBounds(400, 40, 200, 40);
		contentPane.add(year);
		
		JLabel semester = new JLabel("");
		semester.setFont(new Font("Dialog", Font.BOLD, 32));
		semester.setBounds(880, 40, 200, 40);
		contentPane.add(semester);
		year.setText(syear);
		semester.setText(ssemester);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 90, 1220, 450);
		contentPane.add(scrollPane);
		
		resulttable = new JTable();
		scrollPane.setViewportView(resulttable);
		
		JButton btnNewButton = new JButton("LOAD DATA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String fetchquery=null;
					String id,name,sub,sub1,sub2,sub3,cgpa,status,sub4,sub5,sub6,sub7,sub8,sub9,sgpa;
					dbConecction c = new dbConecction();
					
					if(s.equals(syear+ssemester)) {
						
						fetchquery = "SELECT id,name,CSE1101,CSE1102,EEE1121,EEE1122,ENG1123,MAT1124,PHY1125,SGPA,CGPA,STATUS FROM "+syear+ssemester;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) resulttable.getModel(); 
						
						int cols = rsmd.getColumnCount();
						String[] colName = new String[cols];
						for(int i=0; i<cols; i++)
							colName[i] = rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
						
						while(rs.next()) {
							id = rs.getString(1);
							name = rs.getString(2);
							sub = rs.getString(3);
							sub1 = rs.getString(4);
							sub2 = rs.getString(5);
							sub3 = rs.getString(6);
							sub4 = rs.getString(7);
							sub5 = rs.getString(8);
							sub6 = rs.getString(9);
							sgpa = rs.getString(10);
							cgpa = rs.getString(11);
							status = rs.getString(12);
							String[] row = {id,name,sub,sub1,sub2,sub3,sub4,sub5,sub6,sgpa,cgpa,status};
							model.addRow(row);
						}
					}
					else if(s1.equals(syear+ssemester)) {
						fetchquery = "SELECT id,name,CSE1201,CSE1202,CSE1203,CSE1204,EEE1221,EEE1222,MAT1223,CHM1224,CHM1225,SGPA,CGPA,STATUS FROM "+syear+ssemester;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) resulttable.getModel(); 
						
						int cols = rsmd.getColumnCount();
						String[] colName = new String[cols];
						for(int i=0; i<cols; i++)
							colName[i] = rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
						
						while(rs.next()) {
							id = rs.getString(1);
							name = rs.getString(2);
							sub = rs.getString(3);
							sub1 = rs.getString(4);
							sub2 = rs.getString(5);
							sub3 = rs.getString(6);
							sub4 = rs.getString(7);
							sub5 = rs.getString(8);
							sub6 = rs.getString(9);
							sub7 = rs.getString(10);
							sub8 = rs.getString(11);
							sgpa = rs.getString(12);
							cgpa = rs.getString(13);
							status = rs.getString(14);
							String[] row = {id,name,sub,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sgpa,cgpa,status};
							model.addRow(row);
						}
					}
					else if(s2.equals(syear+ssemester)) {
						fetchquery = "SELECT id,name,CSE2101,CSE2102,CSE2103,CSE2104,CSE2105,MAT2122,STA2122,BUS2123,SGPA,CGPA,STATUS FROM "+syear+ssemester;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) resulttable.getModel(); 
						
						int cols = rsmd.getColumnCount();
						String[] colName = new String[cols];
						for(int i=0; i<cols; i++)
							colName[i] = rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
						
						while(rs.next()) {
							id = rs.getString(1);
							name = rs.getString(2);
							sub = rs.getString(3);
							sub1 = rs.getString(4);
							sub2 = rs.getString(5);
							sub3 = rs.getString(6);
							sub4 = rs.getString(7);
							sub5 = rs.getString(8);
							sub6 = rs.getString(9);
							sub7 = rs.getString(10);
							sgpa = rs.getString(11);
							cgpa = rs.getString(12);
							status = rs.getString(13);
							String[] row = {id,name,sub,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sgpa,cgpa,status};
							model.addRow(row);
						}
					}
					else if(s3.equals(syear+ssemester)) {
						fetchquery = "SELECT id,name,CSE2201,CSE2202,CSE2203,CSE2204,CSE2205,ECO2222,SOC2223,CSE2207,SGPA,CGPA,STATUS FROM "+syear+ssemester;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) resulttable.getModel(); 
						
						int cols = rsmd.getColumnCount();
						String[] colName = new String[cols];
						for(int i=0; i<cols; i++)
							colName[i] = rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
						
						while(rs.next()) {
							id = rs.getString(1);
							name = rs.getString(2);
							sub = rs.getString(3);
							sub1 = rs.getString(4);
							sub2 = rs.getString(5);
							sub3 = rs.getString(6);
							sub4 = rs.getString(7);
							sub5 = rs.getString(8);
							sub6 = rs.getString(9);
							sub7 = rs.getString(10);
							sgpa = rs.getString(11);
							cgpa = rs.getString(12);
							status = rs.getString(13);
							String[] row = {id,name,sub,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sgpa,cgpa,status};
							model.addRow(row);
						}
					}
					else if(s4.equals(syear+ssemester)) {
						fetchquery = "SELECT id,name,CSE3101,CSE3102,CSE3103,CSE3104,CSE3105,CSE3106,CSE3107,CSE3108,MAT3121,SGPA,CGPA,STATUS FROM "+syear+ssemester;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) resulttable.getModel(); 
						
						int cols = rsmd.getColumnCount();
						String[] colName = new String[cols];
						for(int i=0; i<cols; i++)
							colName[i] = rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
						
						while(rs.next()) {
							id = rs.getString(1);
							name = rs.getString(2);
							sub = rs.getString(3);
							sub1 = rs.getString(4);
							sub2 = rs.getString(5);
							sub3 = rs.getString(6);
							sub4 = rs.getString(7);
							sub5 = rs.getString(8);
							sub6 = rs.getString(9);
							sub7 = rs.getString(10);
							sub8 = rs.getString(11);
							sgpa = rs.getString(12);
							cgpa = rs.getString(13);
							status = rs.getString(14);
							String[] row = {id,name,sub,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sgpa,cgpa,status};
							model.addRow(row);
						}
					}
					else if(s5.equals(syear+ssemester)) {
						fetchquery = "SELECT id,name,CSE3201,CSE3202,CSE3203,CSE3204,CSE3205,CSE3206,CSE3207,CSE3208,CSE3209,GEN3221,SGPA,CGPA,STATUS FROM "+syear+ssemester;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) resulttable.getModel(); 
						
						int cols = rsmd.getColumnCount();
						String[] colName = new String[cols];
						for(int i=0; i<cols; i++)
							colName[i] = rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
						
						while(rs.next()) {
							id = rs.getString(1);
							name = rs.getString(2);
							sub = rs.getString(3);
							sub1 = rs.getString(4);
							sub2 = rs.getString(5);
							sub3 = rs.getString(6);
							sub4 = rs.getString(7);
							sub5 = rs.getString(8);
							sub6 = rs.getString(9);
							sub7 = rs.getString(10);
							sub8 = rs.getString(11);
							sub9 = rs.getString(12);
							sgpa = rs.getString(13);
							cgpa = rs.getString(14);
							status = rs.getString(15);
							String[] row = {id,name,sub,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,sgpa,cgpa,status};
							model.addRow(row);
						}
					}
					else if(s6.equals(syear+ssemester)) {
						fetchquery = "SELECT id,name,CSE4101,CSE4102,CSE4103,CSE4104,CSE4105,CSE4106,CSE4107,CSE4108,CSE4109,CSE4110,SGPA,CGPA,STATUS FROM "+syear+ssemester;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) resulttable.getModel(); 
						
						int cols = rsmd.getColumnCount();
						String[] colName = new String[cols];
						for(int i=0; i<cols; i++)
							colName[i] = rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
						
						while(rs.next()) {
							id = rs.getString(1);
							name = rs.getString(2);
							sub = rs.getString(3);
							sub1 = rs.getString(4);
							sub2 = rs.getString(5);
							sub3 = rs.getString(6);
							sub4 = rs.getString(7);
							sub5 = rs.getString(8);
							sub6 = rs.getString(9);
							sub7 = rs.getString(10);
							sub8 = rs.getString(11);
							sub9 = rs.getString(12);
							sgpa = rs.getString(13);
							cgpa = rs.getString(14);
							status = rs.getString(15);
							String[] row = {id,name,sub,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,sgpa,cgpa,status};
							model.addRow(row);
						}
					}
					else if(s7.equals(syear+ssemester)) {
						fetchquery = "SELECT id,name,CSE4201,CSE4202,CSE4203,CSE4204,CSE4205,CSE4206,CSE4207,CSE4208,CSE4209,CSE4210,SGPA,CGPA,STATUS FROM "+syear+ssemester;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) resulttable.getModel(); 
						
						int cols = rsmd.getColumnCount();
						String[] colName = new String[cols];
						for(int i=0; i<cols; i++)
							colName[i] = rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
						
						while(rs.next()) {
							id = rs.getString(1);
							name = rs.getString(2);
							sub = rs.getString(3);
							sub1 = rs.getString(4);
							sub2 = rs.getString(5);
							sub3 = rs.getString(6);
							sub4 = rs.getString(7);
							sub5 = rs.getString(8);
							sub6 = rs.getString(9);
							sub7 = rs.getString(10);
							sub8 = rs.getString(11);
							sub9 = rs.getString(12);
							sgpa = rs.getString(13);
							cgpa = rs.getString(14);
							status = rs.getString(15);
							String[] row = {id,name,sub,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,sgpa,cgpa,status};
							model.addRow(row);
						}
					}
//					ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
//					ResultSetMetaData rsmd = rs.getMetaData();
//					DefaultTableModel model =(DefaultTableModel) resulttable.getModel(); 
//					
//					int cols = rsmd.getColumnCount();
//					String[] colName = new String[cols];
//					for(int i=0; i<cols; i++)
//						colName[i] = rsmd.getColumnName(i+1);
//					model.setColumnIdentifiers(colName);
//					String id,name,sub,sub1,sub2,sub3,cgpa,faculty,department,sub4,sub5,sub6,sub7,sgpa;
//					while(rs.next()) {
//						id = rs.getString(1);
//						name = rs.getString(2);
//						sub = rs.getString(3);
//						sub1 = rs.getString(4);
//						sub2 = rs.getString(5);
//						sub3 = rs.getString(6);
//						sub4 = rs.getString(7);
//						sub5 = rs.getString(8);
//						sub6 = rs.getString(9);
//						sub7 = rs.getString(10);
//						sgpa = rs.getString(11);
//						cgpa = rs.getString(12);
//						String[] row = {id,name,sub,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sgpa,cgpa};
//						model.addRow(row);
//					}
					
					 //tLoadData.setModel ((ButtonModel) DbUtils.resultSetToTableModel(rs));
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 17));
		btnNewButton.setBounds(350, 560, 160, 40);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ESearchResult sr = new ESearchResult();
				sr.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Dialog", Font.BOLD, 17));
		btnBack.setBounds(550, 560, 160, 40);
		contentPane.add(btnBack);
	}
}

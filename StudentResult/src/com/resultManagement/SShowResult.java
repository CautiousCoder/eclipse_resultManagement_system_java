package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.connection.dbConecction;

public class SShowResult extends JFrame {

	private JPanel contentPane;
	
	
	String s= "1st1st";
	String s1= "1st2nd";
	String s2= "2nd1st";
	String s3= "2nd2nd";
	String s4= "3rd1st";
	String s5= "3rd2nd";
	String s6= "4th1st";
	String s7= "4th2nd";
	private JTextField sid;
	private JTable RESULTtable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SShowResult frame = new SShowResult();
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
	public SShowResult() {
		setFont(new Font("Dialog", Font.BOLD, 34));
		setTitle("CREATE RESULT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 100, 1250, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYear = new JLabel("ID :");
		lblYear.setFont(new Font("Dialog", Font.BOLD, 30));
		lblYear.setBounds(100, 40, 70, 50);
		contentPane.add(lblYear);
		
		JLabel lblSemister = new JLabel("SEMESTER :");
		lblSemister.setFont(new Font("Dialog", Font.BOLD, 30));
		lblSemister.setBounds(780, 40, 220, 50);
		contentPane.add(lblSemister);
		
		JLabel lblNewLabel_2 = new JLabel("Course Code  Course Title  Credits");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_2.setBounds(80, 360, 330, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Course Code  Course Title  Credits");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(475, 360, 330, 30);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Course Code  Course Title  Credits");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(855, 360, 330, 30);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel course = new JLabel("");
		course.setFont(new Font("Dialog", Font.PLAIN, 11));
		course.setBounds(80, 400, 370, 30);
		contentPane.add(course);
		
		JLabel course_1 = new JLabel("");
		course_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		course_1.setBounds(80, 440, 370, 30);
		contentPane.add(course_1);
		
		JLabel course_2 = new JLabel("");
		course_2.setFont(new Font("Dialog", Font.PLAIN, 11));
		course_2.setBounds(80, 480, 370, 30);
		contentPane.add(course_2);
		
		JLabel course_3 = new JLabel("");
		course_3.setFont(new Font("Dialog", Font.PLAIN, 11));
		course_3.setBounds(80, 520, 370, 30);
		contentPane.add(course_3);
		
		JLabel course_4 = new JLabel("");
		course_4.setFont(new Font("Dialog", Font.PLAIN, 11));
		course_4.setBounds(475, 400, 370, 30);
		contentPane.add(course_4);
		
		JLabel course_5 = new JLabel("");
		course_5.setFont(new Font("Dialog", Font.PLAIN, 11));
		course_5.setBounds(475, 440, 370, 30);
		contentPane.add(course_5);
		
		JLabel course_6 = new JLabel("");
		course_6.setFont(new Font("Dialog", Font.PLAIN, 11));
		course_6.setBounds(475, 480, 370, 30);
		contentPane.add(course_6);
		
		JLabel course_7 = new JLabel("");
		course_7.setFont(new Font("Dialog", Font.PLAIN, 11));
		course_7.setBounds(475, 520, 370, 30);
		contentPane.add(course_7);
		
		JLabel course_8 = new JLabel("");
		course_8.setFont(new Font("Dialog", Font.PLAIN, 11));
		course_8.setBounds(855, 400, 370, 30);
		contentPane.add(course_8);
		
		JLabel course_9 = new JLabel("");
		course_9.setFont(new Font("Dialog", Font.PLAIN, 11));
		course_9.setBounds(855, 440, 370, 30);
		contentPane.add(course_9);
		
		JLabel course_10 = new JLabel("");
		course_10.setFont(new Font("Dialog", Font.PLAIN, 11));
		course_10.setBounds(855, 480, 370, 30);
		contentPane.add(course_10);	
		
		JComboBox cyear = new JComboBox();
		cyear.setFont(new Font("Dialog", Font.BOLD, 16));
		cyear.setModel(new DefaultComboBoxModel(new String[] {"1st", "2nd", "3rd", "4th"}));
		cyear.setBounds(580, 50, 130, 35);
		contentPane.add(cyear);
		
		JComboBox csemister = new JComboBox();
		csemister.setModel(new DefaultComboBoxModel(new String[] {"1st", "2nd"}));
		csemister.setFont(new Font("Dialog", Font.BOLD, 16));
		csemister.setBounds(1050, 50, 130, 35);
		contentPane.add(csemister);
		
		sid = new JTextField();
		sid.setBounds(200, 50, 170, 30);
		contentPane.add(sid);
		sid.setColumns(10);
		
		JLabel lblSess = new JLabel("YEAR :");
		lblSess.setFont(new Font("Dialog", Font.BOLD, 30));
		lblSess.setBounds(420, 40, 125, 50);
		contentPane.add(lblSess);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 190, 1220, 120);
		contentPane.add(scrollPane);
		
		RESULTtable = new JTable();
		scrollPane.setViewportView(RESULTtable);

		JButton btnRefresh = new JButton("SEARCH");
		btnRefresh.setBackground(new Color(127, 255, 212));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id,name,sub,sub1,sub2,sub3,cgpa,status,sub4,sub5,sub6,sub7,sub8,sub9,sgpa;
				String fetchquery =null;
				String stid = sid.getText();
				String passyear = (String) cyear.getSelectedItem();
				String passsemester = (String) csemister.getSelectedItem();
				try {
					dbConecction c = new dbConecction();
					if(s.equals(passyear+passsemester)) {
						
						fetchquery = "SELECT id,name,CSE1101,CSE1102,EEE1121,EEE1122,ENG1123,MAT1124,PHY1125,SGPA,CGPA,STATUS FROM "+passyear+passsemester+" WHERE id= "+stid;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) RESULTtable.getModel(); 
						
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
						course.setText("CSE 1101  Computer Fundamentals  3");
						course_1.setText("CSE 1102  Computer Fundamentals Lab  1.5");
						course_2.setText("EEE 1121  Electrical Circuit Analysis  3");
						course_3.setText("EEE 1122  Electrical Circuit Analysis Lab  1.5");
						course_4.setText("ENG 1123  Professional English  3");
						course_5.setText("MAT 1124  Linear Algebra & Geometry  3");
						course_6.setText("PHY 1125  Physics  3");
					}
					else if(s1.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE1201,CSE1202,CSE1203,CSE1204,EEE1221,EEE1222,MAT1223,CHM1224,CHM1225,SGPA,CGPA,STATUS FROM "+passyear+passsemester+" WHERE id= "+stid;
					
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) RESULTtable.getModel(); 
						
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
						course.setText("CSE 1201  Structured Programming Language  3");
						course_1.setText("CSE 1202  Structured Programming Language Lab  1.5");
						course_2.setText("EEE 1221  Basic Electronics  3");
						course_3.setText("EEE 1222  Basic Electronics Lab  1.5");
						course_4.setText("MAT 1223  Differential and Integral Calculus  3");
						course_5.setText("CHM 1224  Chemistry  3");
						course_6.setText("CHM 1225  Chemistry Lab  1.5");	
						course_7.setText("CSE 1204  Engineering Drawing Lab  1.5");	
						course_8.setText("CSE 1203  Viva-Voce  1");
					}
					else if(s2.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE2101,CSE2102,CSE2103,CSE2104,CSE2105,MAT2122,STA2122,BUS2123,SGPA,CGPA,STATUS FROM "+passyear+passsemester+" WHERE id= "+stid;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) RESULTtable.getModel(); 
						
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
						course.setText("CSE 2101  Discrete Mathematics  3");
						course_1.setText("CSE 2102  Digital Logic Design  3");
						course_2.setText("CSE 2103  Digital Logic Design and VHDL Lab  1.5");
						course_3.setText("CSE 2104  Object Oriented Programming Language  3");
						course_4.setText("CSE 2105  Object Oriented Programming Language Lab  1.5");
						course_5.setText("MAT 2121  Ordinary Differential Equations  1.5");
						course_6.setText("STA 2122  Basic Statistics & Probability  3");	
						course_7.setText("BUS 2123  Introduction to Business  2");
					}
					else if(s3.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE2201,CSE2202,CSE2203,CSE2204,CSE2205,ECO2222,SOC2223,CSE2207,SGPA,CGPA,STATUS FROM "+passyear+passsemester+" WHERE id= "+stid;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) RESULTtable.getModel(); 
						
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
						course.setText("CSE 2202  Data Structures Lab  1.5");
						course_1.setText("CSE 2102  Digital Logic Design  3");
						course_2.setText("CSE 2203  Database Management Systems  3");
						course_3.setText("CSE 2204  Database Management Systems Lab  1.5");
						course_4.setText("CSE 2205  Complex Variable, Laplace Transformation & Fourier Analysis  3");
						course_5.setText("ECO 2222  Economics  2");
						course_6.setText("SOC 2223  Sociology  2");	
						course_7.setText("CSE 2207  Viva-Voce  1");
					}
					else if(s4.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE3101,CSE3102,CSE3103,CSE3104,CSE3105,CSE3106,CSE3107,CSE3108,MAT3121,SGPA,CGPA,STATUS FROM "+passyear+passsemester+" WHERE id= "+stid;
					
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) RESULTtable.getModel(); 
						
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
						course.setText("CSE 3101  Operating System and System Programming  3");
						course_1.setText("CSE 3102  Operating System and Systems Programming Lab  1.5");
						course_2.setText("CSE 3103  Data and Telecommunications  3");
						course_3.setText("CSE 3104  Data and Telecommunications Lab  1.5");
						course_4.setText("CSE 3105  Computer Architecture  3");
						course_5.setText("CSE 3106  Computer Architecture Lab  1.5");
						course_6.setText("CSE 3107  Computer Peripherals and Interfacing  3");	
						course_7.setText("CSE 3108  Computer Peripherals and Interfacing Lab  1.5");
						course_8.setText("MAT 3121  Numerical Analysis  3");
					}
					else if(s5.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE3201,CSE3202,CSE3203,CSE3204,CSE3205,CSE3206,CSE3207,CSE3208,CSE3209,GEN3221,SGPA,CGPA,STATUS FROM "+passyear+passsemester+" WHERE id= "+stid;
					
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) RESULTtable.getModel(); 
						
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
						course.setText("CSE 3201  Distributed Systems  3");
						course_1.setText("CSE 3202  Distributed Systems Lab  1.5");
						course_2.setText("CSE 3203  Software Engineering  3");
						course_3.setText("CSE 3204  Computer Networking  3");
						course_4.setText("CSE 3205  Computer Networking Lab  1.5");
						course_5.setText("CSE 3206  Algorithm Design & Analysis  3");
						course_6.setText("CSE 3207  Algorithm Design & Analysis Lab  1.5");	
						course_7.setText("CSE 3208  Theory of Computation & Automata  3");
						course_8.setText("GEN 3221  Bangladesh Studies  2");
						course_9.setText("CSE 3209  Viva-Voce  1");
					}
					else if(s6.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE4101,CSE4102,CSE4103,CSE4104,CSE4105,CSE4106,CSE4107,CSE4108,CSE4109,CSE4110,SGPA,CGPA,STATUS FROM "+passyear+passsemester+" WHERE id= "+stid;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) RESULTtable.getModel(); 
						
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
						course.setText("CSE 4101  Project/Thesis/Industry Attachment (Part I)  2");
						course_1.setText("CSE 4102  Artificial Intelligence  3");
						course_2.setText("CSE 4103  Artificial Intelligence Lab  1.5");
						course_3.setText("CSE 4104  Compiler Design  3");
						course_4.setText("CSE 4105  Compiler Design Lab  1.5");
						course_5.setText("CSE 4106  Project Management  3");
						course_6.setText("CSE 4107  Computer Graphics & Multimedia  3");	
						course_7.setText("CSE 4108  Computer Graphics & Multimedia Lab  1.5");
						course_8.setText("CSE 4109  Option I  3");
						course_9.setText("CSE 4110  Option I Lab  0.5");
					}
					else if(s7.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE4201,CSE4202,CSE4203,CSE4204,CSE4205,CSE4206,CSE4207,CSE4208,CSE4209,CSE4210,SGPA,CGPA,STATUS FROM "+passyear+passsemester+" WHERE id= "+stid;
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model =(DefaultTableModel) RESULTtable.getModel(); 
						
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
						course.setText("CSE 4201  Project/Thesis/Industry Attachment (Part II)*  3");
						course_1.setText("CSE 4202  E-Commerce and Web Engineering  3");
						course_2.setText("CSE 4203  E-Commerce and Web Engineering Lab  1.5");
						course_3.setText("CSE 4204  Digital Image Processing  3");
						course_4.setText("CSE 4205  Digital Image Processing Lab  1.5");
						course_5.setText("CSE 4206  Simulation and Modeling  3");
						course_6.setText("CSE 4207  Simulation and Modeling Lab  1.5");	
						course_7.setText("CSE 4208  Option II  3");
						course_8.setText("CSE 4209  Option II Lab  1.5");
						course_9.setText("CSE 4210  Viva Voce  1");
					}
					//WHERE department='"+department+"' AND session='"+session+"'
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnRefresh.setFont(new Font("Dialog", Font.BOLD, 24));
		btnRefresh.setBounds(526, 110, 160, 40);
		contentPane.add(btnRefresh);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(255, 182, 193));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Shome ecr = new Shome();
				ecr.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Dialog", Font.BOLD, 24));
		btnBack.setBounds(750, 110, 160, 40);
		contentPane.add(btnBack);
		
		
	}
}

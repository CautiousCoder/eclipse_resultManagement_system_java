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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JScrollPane;

public class ESResultCreate extends JFrame {

	private JPanel contentPane;
	private JTable createtable;
	private JTextField tfid;
	private JTextField tfname;
	private JTextField firstsub;
	private JTextField secondsub;
	private JTextField thirdsub;
	private JTextField forthsub;
	private JTextField fifthsub;
	private JTextField sixthsub;
	private JTextField seventhsub;
	private JTextField eightsub;
	private JTextField ninethsub;
	private JScrollPane scrollPane;
	private JTextField tenthsub;
	
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
					ESResultCreate frame = new ESResultCreate("1st","1st");
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
	public ESResultCreate(String passyear,String passsemester) {
		setFont(new Font("Dialog", Font.BOLD, 34));
		setTitle("CREATE RESULT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 100, 1250, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLEASE, AT FIRST CLICK REFRESH BUTTON THEN INSERT DATA.");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel.setForeground(new Color(178, 34, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 30, 900, 30);
		contentPane.add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 178, 1220, 20);
		contentPane.add(scrollPane);
		
		createtable = new JTable();
		scrollPane.setViewportView(createtable);
		
		tfid = new JTextField();
		tfid.setFont(new Font("Dialog", Font.BOLD, 14));
		tfid.setBounds(10, 200, 80, 35);
		contentPane.add(tfid);
		tfid.setColumns(10);
		
		tfname = new JTextField();
		tfname.setFont(new Font("Dialog", Font.BOLD, 14));
		tfname.setColumns(10);
		tfname.setBounds(95, 200, 185, 35);
		contentPane.add(tfname);
		
		firstsub = new JTextField();
		firstsub.setFont(new Font("Dialog", Font.BOLD, 14));
		firstsub.setColumns(10);
		firstsub.setBounds(285, 200, 90, 35);
		contentPane.add(firstsub);
		
		secondsub = new JTextField();
		secondsub.setFont(new Font("Dialog", Font.BOLD, 14));
		secondsub.setColumns(10);
		secondsub.setBounds(380, 200, 90, 35);
		contentPane.add(secondsub);
		
		thirdsub = new JTextField();
		thirdsub.setFont(new Font("Dialog", Font.BOLD, 14));
		thirdsub.setColumns(10);
		thirdsub.setBounds(475, 200, 90, 35);
		contentPane.add(thirdsub);
		
		forthsub = new JTextField();
		forthsub.setFont(new Font("Dialog", Font.BOLD, 14));
		forthsub.setColumns(10);
		forthsub.setBounds(570, 200, 90, 35);
		contentPane.add(forthsub);
		
		fifthsub = new JTextField();
		fifthsub.setFont(new Font("Dialog", Font.BOLD, 14));
		fifthsub.setColumns(10);
		fifthsub.setBounds(665, 200, 90, 35);
		contentPane.add(fifthsub);
		
		sixthsub = new JTextField();
		sixthsub.setFont(new Font("Dialog", Font.BOLD, 14));
		sixthsub.setColumns(10);
		sixthsub.setBounds(760, 200, 90, 35);
		contentPane.add(sixthsub);
		
		seventhsub = new JTextField();
		seventhsub.setFont(new Font("Dialog", Font.BOLD, 14));
		seventhsub.setColumns(10);
		seventhsub.setBounds(855, 200, 90, 35);
		contentPane.add(seventhsub);
		
		eightsub = new JTextField();
		eightsub.setFont(new Font("Dialog", Font.BOLD, 14));
		eightsub.setColumns(10);
		eightsub.setBounds(950, 200, 90, 35);
		contentPane.add(eightsub);
		
		ninethsub = new JTextField();
		ninethsub.setFont(new Font("Dialog", Font.BOLD, 14));
		ninethsub.setColumns(10);
		ninethsub.setBounds(1045, 200, 90, 35);
		contentPane.add(ninethsub);

		tenthsub = new JTextField();
		tenthsub.setFont(new Font("Dialog", Font.BOLD, 14));
		tenthsub.setColumns(10);
		tenthsub.setBounds(1140, 200, 90, 35);
		contentPane.add(tenthsub);
		
		JLabel lblYear = new JLabel("YEAR :");
		lblYear.setFont(new Font("Dialog", Font.BOLD, 44));
		lblYear.setBounds(100, 80, 180, 50);
		contentPane.add(lblYear);
		
		JLabel showyear = new JLabel("");
		showyear.setFont(new Font("Dialog", Font.BOLD, 44));
		showyear.setBounds(280, 80, 150, 50);
		contentPane.add(showyear);
		showyear.setText(passyear);
		
		JLabel lblSemister = new JLabel("SEMESTER :");
		lblSemister.setFont(new Font("Dialog", Font.BOLD, 44));
		lblSemister.setBounds(425, 80, 300, 50);
		contentPane.add(lblSemister);
		
		JLabel showsemister = new JLabel("");
		showsemister.setFont(new Font("Dialog", Font.BOLD, 44));
		showsemister.setBounds(720, 80, 150, 50);
		contentPane.add(showsemister);
		showsemister.setText(passsemester);
		
		JLabel lblNewLabel_1 = new JLabel("PLEASE INSERT MARKS(eg. 60) LEFT TO RIGHT. IF SOME BOXES HAVE EMPTY, NO PROBLEM!");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 240, 770, 15);
		contentPane.add(lblNewLabel_1);
		
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
		if(s.equals(passyear+passsemester)) {
			course.setText("CSE 1101  Computer Fundamentals  3");
			course_1.setText("CSE 1102  Computer Fundamentals Lab  1.5");
			course_2.setText("EEE 1121  Electrical Circuit Analysis  3");
			course_3.setText("EEE 1122  Electrical Circuit Analysis Lab  1.5");
			course_4.setText("ENG 1123  Professional English  3");
			course_5.setText("MAT 1124  Linear Algebra & Geometry  3");
			course_6.setText("PHY 1125  Physics  3");	
		}
		else if(s1.equals(passyear+passsemester)) {
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
		

		JButton btnRefresh = new JButton("REFRESH");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//String sql = null;
				String fetchquery =null;
				try {
					dbConecction c = new dbConecction();
					if(s.equals(passyear+passsemester)) {
						
						fetchquery = "SELECT id,name,CSE1101,CSE1102,EEE1121,EEE1122,ENG1123,MAT1124,PHY1125 FROM "+passyear+passsemester;
					}
					else if(s1.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE1201,CSE1202,CSE1203,CSE1204,EEE1221,EEE1222,MAT1223,CHM1224,CHM1225 FROM "+passyear+passsemester;
					}
					else if(s2.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE2101,CSE2102,CSE2103,CSE2104,CSE2105,MAT2122,STA2122,BUS2123 FROM "+passyear+passsemester;
					}
					else if(s3.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE2201,CSE2202,CSE2203,CSE2204,CSE2205,ECO2222,SOC2223,CSE2207 FROM "+passyear+passsemester;
					}
					else if(s4.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE3101,CSE3102,CSE3103,CSE3104,CSE3105,CSE3106,CSE3107,CSE3108,MAT3121 FROM "+passyear+passsemester;
					}
					else if(s5.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE3201,CSE3202,CSE3203,CSE3204,CSE3205,CSE3206,CSE3207,CSE3208,CSE3209,GEN3221 FROM "+passyear+passsemester;
					}
					else if(s6.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE4101,CSE4102,CSE4103,CSE4104,CSE4105,CSE4106,CSE4107,CSE4108,CSE4109,CSE4110 FROM "+passyear+passsemester;
					}
					else if(s7.equals(passyear+passsemester)) {
						fetchquery = "SELECT id,name,CSE4201,CSE4202,CSE4203,CSE4204,CSE4205,CSE4206,CSE4207,CSE4208,CSE4209,CSE4210 FROM "+passyear+passsemester;
					}
					//WHERE department='"+department+"' AND session='"+session+"'
					ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
					ResultSetMetaData rsmd = rs.getMetaData();
					DefaultTableModel model =(DefaultTableModel) createtable.getModel(); 
					
					int cols = rsmd.getColumnCount();
					String[] colName = new String[cols];
					for(int i=0; i<cols; i++)
						colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnRefresh.setFont(new Font("Dialog", Font.BOLD, 24));
		btnRefresh.setBounds(230, 290, 160, 40);
		contentPane.add(btnRefresh);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ESearchCreateResult ecr = new ESearchCreateResult();
				ecr.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Dialog", Font.BOLD, 24));
		btnBack.setBounds(417, 290, 160, 40);
		contentPane.add(btnBack);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sql = null;
				String query =null;
				String id = tfid.getText();
				String name = tfname.getText();
				CheckMark ck = new CheckMark(Double.parseDouble(firstsub.getText()));
				CheckMark ck1 = new CheckMark(Double.parseDouble(secondsub.getText()));
				CheckMark ck2 = new CheckMark(Double.parseDouble(thirdsub.getText()));
				CheckMark ck3 = new CheckMark(Double.parseDouble(forthsub.getText()));
				CheckMark ck4 = new CheckMark(Double.parseDouble(fifthsub.getText()));
				CheckMark ck5 = new CheckMark(Double.parseDouble(sixthsub.getText()));
				CheckMark ck6 = new CheckMark(Double.parseDouble(seventhsub.getText()));
				CheckMark ck7 = new CheckMark(Double.parseDouble(eightsub.getText()));
				CheckMark ck8 = new CheckMark(Double.parseDouble(ninethsub.getText()));
				CheckMark ck9 = new CheckMark(Double.parseDouble(tenthsub.getText()));
				String status = null;
				GpaResult ss = new GpaResult();
				double total,sgpa,cgpa,tfail;
				
				
				try {
					dbConecction c = new dbConecction();
					
					if(s.equals(passyear+passsemester)) {
						sql = "CREATE TABLE IF NOT EXISTS "+ passyear+passsemester +
				                   " (id VARCHAR(10) PRIMARY KEY NOT NULL, " +
				                   " name VARCHAR(50), " +
				                   " CSE1101 VARCHAR(5) , " + 
				                   " CSE1102 VARCHAR(5), " + 
				                   " EEE1121 VARCHAR(5), " + 
				                   " EEE1122 VARCHAR(5), " + 
				                   " ENG1123 VARCHAR(5), " +
				                   " MAT1124 VARCHAR(5), " +
				                   " PHY1125 VARCHAR(5), " +
				                   " SGPA DOUBLE(6,2), " +
				                   " CGPA DOUBLE(6,2), " +
				                   " STATUS VARCHAR(15), " +
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						total = ss.strlt(ck.gpa, 3.00)+ss.strlt(ck1.gpa, 1.50)+ss.strlt(ck2.gpa, 3.00)+ss.strlt(ck3.gpa, 1.50)+ss.strlt(ck4.gpa, 3.00)+ss.strlt(ck5.gpa, 3.00)+ss.strlt(ck6.gpa, 3.00);
						sgpa = total/18.00;
						cgpa = sgpa;
						
						tfail =ss.fail(ck.gpa, 3.00)+ss.fail(ck1.gpa, 1.50)+ss.fail(ck2.gpa, 3.00)+ss.fail(ck3.gpa, 1.50)+ss.fail(ck4.gpa, 3.00)+ss.fail(ck5.gpa, 3.00)+ss.fail(ck6.gpa, 3.00);
						if(tfail>=6 || sgpa<2.25) {
							status = "Not Promoted";
						}
						else {
							status = "Promoted";
						}
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE1101,CSE1102,EEE1121,EEE1122,ENG1123,MAT1124,PHY1125,SGPA,CGPA,STATUS,YEAR,SEMESTER) VALUES('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+String.format("%.2f", sgpa)+"','"+String.format("%.2f", cgpa)+"','"+status+"','"+passyear+"','"+passsemester+"')";
						
					}
					else if(s1.equals(passyear+passsemester)) {
						sql = "CREATE TABLE IF NOT EXISTS "+ passyear+passsemester +
				                   " (id VARCHAR(10) PRIMARY KEY NOT NULL, " +
				                   " name VARCHAR(50), " +
				                   " CSE1201 VARCHAR(5) , " + 
				                   " CSE1202 VARCHAR(5), " + 
				                   " CSE1203 VARCHAR(5), " +
				                   " CSE1204 VARCHAR(5), " +
				                   " EEE1221 VARCHAR(5), " + 
				                   " EEE1222 VARCHAR(5), " + 
				                   " MAT1223 VARCHAR(5), " +
				                   " CHM1224 VARCHAR(5), " +
				                   " CHM1225 VARCHAR(5), " +
				                   " SGPA DOUBLE(6,2), " +
				                   " CGPA DOUBLE(6,2), " +
				                   " STATUS VARCHAR(15), " +
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						String fquery = "SELECT CGPA FROM 1st1st WHERE id="+id;
						ResultSet rs = (ResultSet) c.state.executeQuery(fquery);
						rs.next();
						total = ss.strlt(ck.gpa, 3.00)+ss.strlt(ck1.gpa, 1.50)+ss.strlt(ck2.gpa, 1.50)+ss.strlt(ck3.gpa, 1.00)+ss.strlt(ck4.gpa, 3.00)+ss.strlt(ck5.gpa, 1.50)+ss.strlt(ck6.gpa, 3.00)+ss.strlt(ck7.gpa, 3.00)+ss.strlt(ck8.gpa, 1.50);
						sgpa = total/19.00;
						cgpa = (sgpa+ss.getsgpa(fquery))/2;
						
						tfail =ss.fail(ck.gpa, 3.00)+ss.fail(ck1.gpa, 1.50)+ss.fail(ck2.gpa, 1.50)+ss.fail(ck3.gpa, 1.00)+ss.fail(ck4.gpa, 3.00)+ss.fail(ck5.gpa, 1.50)+ss.fail(ck6.gpa, 3.00)+ss.fail(ck7.gpa, 3.00)+ss.fail(ck8.gpa, 1.50);
						if(tfail>=6 || sgpa<2.25) {
							status = "Not Promoted";
						}
						else {
							status = "Promoted";
						}
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE1201,CSE1202,CSE1203,CSE1204,EEE1221,EEE1222,MAT1223,CHM1224,CHM1225,SGPA,CGPA,STATUS,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+ck8.a+"','"+String.format("%.2f", sgpa)+"','"+String.format("%.2f", cgpa)+"','"+status+"','"+passyear+"','"+passsemester+"')";
						
					}
					else if(s2.equals(passyear+passsemester)) {
						sql = "CREATE TABLE IF NOT EXISTS "+ passyear+passsemester +
				                   " (id VARCHAR(10) PRIMARY KEY NOT NULL, " +
				                   " name VARCHAR(50), " +
				                   " CSE2101 VARCHAR(5) , " + 
				                   " CSE2102 VARCHAR(5), " + 
				                   " CSE2103 VARCHAR(5), " +
				                   " CSE2104 VARCHAR(5), " +
				                   " CSE2105 VARCHAR(5), " +
				                   " MAT2122 VARCHAR(5), " +
				                   " STA2122 VARCHAR(5), " +
				                   " BUS2123 VARCHAR(5), " +
				                   " SGPA DOUBLE(6,2), " +
				                   " CGPA DOUBLE(6,2), " +
				                   " STATUS VARCHAR(15), " +
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						String fquery = "SELECT CGPA FROM 1st1st WHERE id="+id;
						String fquery1 = "SELECT CGPA FROM 1st2nd WHERE id="+id;
						
						total = ss.strlt(ck.gpa, 3.00)+ss.strlt(ck1.gpa, 3.00)+ss.strlt(ck2.gpa, 1.50)+ss.strlt(ck3.gpa, 3.00)+ss.strlt(ck4.gpa, 1.50)+ss.strlt(ck5.gpa, 3.00)+ss.strlt(ck6.gpa, 3.00)+ss.strlt(ck7.gpa, 3.00);
						sgpa = total/21.00;
						cgpa = (sgpa+ss.getsgpa(fquery)+ss.getsgpa(fquery1))/3;
						
						tfail =ss.fail(ck.gpa, 3.00)+ss.fail(ck1.gpa, 3.00)+ss.fail(ck2.gpa, 1.50)+ss.fail(ck3.gpa, 3.00)+ss.fail(ck4.gpa, 1.50)+ss.fail(ck5.gpa, 3.00)+ss.fail(ck6.gpa, 3.00)+ss.fail(ck7.gpa, 3.00);
						if(tfail>=6 || sgpa<2.25) {
							status = "Not Promoted";
							sgpa = 0.00;
						}
						else {
							status = "Promoted";
						}
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE2101,CSE2102,CSE2103,CSE2104,CSE2105,MAT2122,STA2122,BUS2123,SGPA,CGPA,STATUS,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+String.format("%.2f", sgpa)+"','"+String.format("%.2f", cgpa)+"','"+status+"','"+passyear+"','"+passsemester+"')";
						
					}
					else if(s3.equals(passyear+passsemester)) {
						sql = "CREATE TABLE IF NOT EXISTS "+ passyear+passsemester +
				                   " (id VARCHAR(10) PRIMARY KEY NOT NULL, " +
				                   " name VARCHAR(50), " +
				                   " CSE2201 VARCHAR(5) , " + 
				                   " CSE2202 VARCHAR(5), " + 
				                   " CSE2203 VARCHAR(5), " +
				                   " CSE2204 VARCHAR(5), " +
				                   " CSE2205 VARCHAR(5), " +
				                   " ECO2222 VARCHAR(5), " +
				                   " SOC2223 VARCHAR(5), " +
				                   " CSE2207 VARCHAR(5), " +
				                   " SGPA DOUBLE(6,2), " +
				                   " CGPA DOUBLE(6,2), " +
				                   " STATUS VARCHAR(15), " +
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						String fquery = "SELECT CGPA FROM 1st1st WHERE id="+id;
						String fquery1 = "SELECT CGPA FROM 1st2nd WHERE id="+id;
						String fquery2 = "SELECT CGPA FROM 2nd1st WHERE id="+id;
						
						total = ss.strlt(ck.gpa, 3.00)+ss.strlt(ck1.gpa, 1.50)+ss.strlt(ck2.gpa, 3.00)+ss.strlt(ck3.gpa, 1.50)+ss.strlt(ck4.gpa, 3.00)+ss.strlt(ck5.gpa, 2.00)+ss.strlt(ck6.gpa, 2.00)+ss.strlt(ck7.gpa, 1.00);
						sgpa = total/17.00;
						cgpa = (sgpa+ss.getsgpa(fquery)+ss.getsgpa(fquery1)+ss.getsgpa(fquery2))/4;
						
						tfail =ss.fail(ck.gpa, 3.00)+ss.fail(ck1.gpa, 1.50)+ss.fail(ck2.gpa, 3.00)+ss.fail(ck3.gpa, 1.50)+ss.fail(ck4.gpa, 3.00)+ss.fail(ck5.gpa, 2.00)+ss.fail(ck6.gpa, 2.00)+ss.fail(ck7.gpa, 1.00);
						if(tfail>=6 || sgpa<2.25) {
							status = "Not Promoted";
							sgpa = 0.00;
						}
						else {
							status = "Promoted";
						}
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE2201,CSE2202,CSE2203,CSE2204,CSE2205,ECO2222,SOC2223,CSE2207,SGPA,CGPA,STATUS,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+String.format("%.2f", sgpa)+"','"+String.format("%.2f", cgpa)+"','"+status+"','"+passyear+"','"+passsemester+"')";
						
					}
					else if(s4.equals(passyear+passsemester)) {
						sql = "CREATE TABLE IF NOT EXISTS "+ passyear+passsemester +
				                   " (id VARCHAR(10) PRIMARY KEY NOT NULL, " +
				                   " name VARCHAR(50), " +
				                   " CSE3101 VARCHAR(5) , " + 
				                   " CSE3102 VARCHAR(5), " + 
				                   " CSE3103 VARCHAR(5), " +
				                   " CSE3104 VARCHAR(5), " +
				                   " CSE3105 VARCHAR(5), " +
				                   " CSE3106 VARCHAR(5), " +
				                   " CSE3107 VARCHAR(5), " +
				                   " CSE3108 VARCHAR(5), " +
				                   " MAT3121 VARCHAR(5), " +
				                   " SGPA DOUBLE(6,2), " +
				                   " CGPA DOUBLE(6,2), " +
				                   " STATUS VARCHAR(15), " +
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						String fquery = "SELECT CGPA FROM 1st1st WHERE id="+id;
						String fquery1 = "SELECT CGPA FROM 1st2nd WHERE id="+id;
						String fquery2 = "SELECT CGPA FROM 2nd1st WHERE id="+id;
						String fquery3 = "SELECT CGPA FROM 2nd2nd WHERE id="+id;
						
						total = ss.strlt(ck.gpa, 3.00)+ss.strlt(ck1.gpa, 1.50)+ss.strlt(ck2.gpa, 3.00)+ss.strlt(ck3.gpa, 1.50)+ss.strlt(ck4.gpa, 3.00)+ss.strlt(ck5.gpa, 1.50)+ss.strlt(ck6.gpa, 3.00)+ss.strlt(ck7.gpa, 1.50)+ss.strlt(ck8.gpa, 3.00);
						sgpa = total/21.00;
						cgpa = (sgpa+ss.getsgpa(fquery)+ss.getsgpa(fquery1)+ss.getsgpa(fquery2)+ss.getsgpa(fquery3))/5;
						
						tfail =ss.fail(ck.gpa, 3.00)+ss.fail(ck1.gpa, 1.50)+ss.fail(ck2.gpa, 3.00)+ss.fail(ck3.gpa, 1.50)+ss.fail(ck4.gpa, 3.00)+ss.fail(ck5.gpa, 1.50)+ss.fail(ck6.gpa, 3.00)+ss.fail(ck7.gpa, 1.50)+ss.fail(ck8.gpa, 3.00);
						if(tfail>=6 || sgpa<2.25) {
							status = "Not Promoted";
							sgpa = 0.00;
						}
						else {
							status = "Promoted";
						}
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE3101,CSE3102,CSE3103,CSE3104,CSE3105,CSE3106,CSE3107,CSE3108,MAT3121,SGPA,CGPA,STATUS,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+ck8.a+"','"+String.format("%.2f", sgpa)+"','"+String.format("%.2f", cgpa)+"','"+status+"','"+passyear+"','"+passsemester+"')";
						
					}
					else if(s5.equals(passyear+passsemester)) {
						sql = "CREATE TABLE IF NOT EXISTS "+ passyear+passsemester +
				                   " (id VARCHAR(10) PRIMARY KEY NOT NULL, " +
				                   " name VARCHAR(50), " +
				                   " CSE3201 VARCHAR(5) , " + 
				                   " CSE3202 VARCHAR(5), " + 
				                   " CSE3203 VARCHAR(5), " +
				                   " CSE3204 VARCHAR(5), " +
				                   " CSE3205 VARCHAR(5), " +
				                   " CSE3206 VARCHAR(5), " +
				                   " CSE3207 VARCHAR(5), " +
				                   " CSE3208 VARCHAR(5), " +
				                   " CSE3209 VARCHAR(5), " +
				                   " GEN3221 VARCHAR(5), " +
				                   " SGPA DOUBLE(6,2), " +
				                   " CGPA DOUBLE(6,2), " +
				                   " STATUS VARCHAR(15), " +
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						String fquery = "SELECT CGPA FROM 1st1st WHERE id="+id;
						String fquery1 = "SELECT CGPA FROM 1st2nd WHERE id="+id;
						String fquery2 = "SELECT CGPA FROM 2nd1st WHERE id="+id;
						String fquery3 = "SELECT CGPA FROM 2nd2nd WHERE id="+id;
						String fquery4 = "SELECT CGPA FROM 3rd1st WHERE id="+id;
						
						total = ss.strlt(ck.gpa, 3.00)+ss.strlt(ck1.gpa, 1.50)+ss.strlt(ck2.gpa, 3.00)+ss.strlt(ck3.gpa, 3.00)+ss.strlt(ck4.gpa, 1.50)+ss.strlt(ck5.gpa, 3.00)+ss.strlt(ck6.gpa, 1.50)+ss.strlt(ck7.gpa, 3.00)+ss.strlt(ck8.gpa, 1.00)+ss.strlt(ck9.gpa, 2.00);
						sgpa = total/22.50;
						cgpa = (sgpa+ss.getsgpa(fquery)+ss.getsgpa(fquery1)+ss.getsgpa(fquery2)+ss.getsgpa(fquery3)+ss.getsgpa(fquery4))/6;
						
						tfail =ss.fail(ck.gpa, 3.00)+ss.fail(ck1.gpa, 1.50)+ss.fail(ck2.gpa, 3.00)+ss.fail(ck3.gpa, 3.00)+ss.fail(ck4.gpa, 1.50)+ss.fail(ck5.gpa, 3.00)+ss.fail(ck6.gpa, 1.50)+ss.fail(ck7.gpa, 3.00)+ss.fail(ck8.gpa, 1.00)+ss.fail(ck9.gpa, 2.00);
						if(tfail>=6 || sgpa<2.25) {
							status = "Not Promoted";
							sgpa = 0.00;
						}
						else {
							status = "Promoted";
						}
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE3201,CSE3202,CSE3203,CSE3204,CSE3205,CSE3206,CSE3207,CSE3208,CSE3209,GEN3221,SGPA,CGPA,STATUS,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+ck8.a+"','"+ck9.a+"','"+String.format("%.2f", sgpa)+"','"+String.format("%.2f", cgpa)+"','"+status+"','"+passyear+"','"+passsemester+"')";
						
					}
					else if(s6.equals(passyear+passsemester)) {
						sql = "CREATE TABLE IF NOT EXISTS "+ passyear+passsemester +
				                   " (id VARCHAR(10) PRIMARY KEY NOT NULL, " +
				                   " name VARCHAR(50), " +
				                   " CSE4101 VARCHAR(5) , " + 
				                   " CSE4102 VARCHAR(5), " + 
				                   " CSE4103 VARCHAR(5), " +
				                   " CSE4104 VARCHAR(5), " +
				                   " CSE4105 VARCHAR(5), " +
				                   " CSE4106 VARCHAR(5), " +
				                   " CSE4107 VARCHAR(5), " +
				                   " CSE4108 VARCHAR(5), " +
				                   " CSE4109 VARCHAR(5), " +
				                   " CSE4110 VARCHAR(5), " +
				                   " SGPA DOUBLE(6,2), " +
				                   " CGPA DOUBLE(6,2), " +
				                   " STATUS VARCHAR(15), " +
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						String fquery = "SELECT CGPA FROM 1st1st WHERE id="+id;
						String fquery1 = "SELECT CGPA FROM 1st2nd WHERE id="+id;
						String fquery2 = "SELECT CGPA FROM 2nd1st WHERE id="+id;
						String fquery3 = "SELECT CGPA FROM 2nd2nd WHERE id="+id;
						String fquery4 = "SELECT CGPA FROM 3rd1st WHERE id="+id;
						String fquery5 = "SELECT CGPA FROM 3rd2nd WHERE id="+id;
						
						total = ss.strlt(ck.gpa, 2.00)+ss.strlt(ck1.gpa, 3.00)+ss.strlt(ck2.gpa, 1.50)+ss.strlt(ck3.gpa, 3.00)+ss.strlt(ck4.gpa, 1.50)+ss.strlt(ck5.gpa, 3.00)+ss.strlt(ck6.gpa, 3.00)+ss.strlt(ck7.gpa, 1.50)+ss.strlt(ck8.gpa, 3.00)+ss.strlt(ck9.gpa, 0.50);
						sgpa = total/22.00;
						cgpa = (sgpa+ss.getsgpa(fquery)+ss.getsgpa(fquery1)+ss.getsgpa(fquery2)+ss.getsgpa(fquery3)+ss.getsgpa(fquery4)+ss.getsgpa(fquery5))/7;
						
						tfail =ss.fail(ck.gpa, 2.00)+ss.fail(ck1.gpa, 3.00)+ss.fail(ck2.gpa, 1.50)+ss.fail(ck3.gpa, 3.00)+ss.fail(ck4.gpa, 1.50)+ss.fail(ck5.gpa, 3.00)+ss.fail(ck6.gpa, 3.00)+ss.fail(ck7.gpa, 1.50)+ss.fail(ck8.gpa, 3.00)+ss.fail(ck9.gpa, 0.50);
						if(tfail>=6 || sgpa<2.25) {
							status = "Not Promoted";
							sgpa = 0.00;
						}
						else {
							status = "Promoted";
						}
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE4101,CSE4102,CSE4103,CSE4104,CSE4105,CSE4106,CSE4107,CSE4108,CSE4109,CSE4110,SGPA,CGPA,STATUS,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+ck8.a+"','"+ck9.a+"','"+String.format("%.2f", sgpa)+"','"+String.format("%.2f", cgpa)+"','"+status+"','"+passyear+"','"+passsemester+"')";
						
					}
					else if(s7.equals(passyear+passsemester)) {
						sql = "CREATE TABLE IF NOT EXISTS "+ passyear+passsemester +
				                   " (id VARCHAR(10) PRIMARY KEY NOT NULL, " +
				                   " name VARCHAR(50), " +
				                   " CSE4201 VARCHAR(5) , " + 
				                   " CSE4202 VARCHAR(5), " + 
				                   " CSE4203 VARCHAR(5), " +
				                   " CSE4204 VARCHAR(5), " +
				                   " CSE4205 VARCHAR(5), " +
				                   " CSE4206 VARCHAR(5), " +
				                   " CSE4207 VARCHAR(5), " +
				                   " CSE4208 VARCHAR(5), " +
				                   " CSE4209 VARCHAR(5), " +
				                   " CSE4210 VARCHAR(5), " +
				                   " SGPA DOUBLE(6,2), " +
				                   " CGPA DOUBLE(6,2), " +
				                   " STATUS VARCHAR(15), " +
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						String fquery = "SELECT CGPA FROM 1st1st WHERE id="+id;
						String fquery1 = "SELECT CGPA FROM 1st2nd WHERE id="+id;
						String fquery2 = "SELECT CGPA FROM 2nd1st WHERE id="+id;
						String fquery3 = "SELECT CGPA FROM 2nd2nd WHERE id="+id;
						String fquery4 = "SELECT CGPA FROM 3rd1st WHERE id="+id;
						String fquery5 = "SELECT CGPA FROM 3rd2nd WHERE id="+id;
						String fquery6 = "SELECT CGPA FROM 4th1st WHERE id="+id;
						
						total = ss.strlt(ck.gpa, 3.00)+ss.strlt(ck1.gpa, 3.00)+ss.strlt(ck2.gpa, 1.50)+ss.strlt(ck3.gpa, 3.00)+ss.strlt(ck4.gpa, 1.50)+ss.strlt(ck5.gpa, 3.00)+ss.strlt(ck6.gpa, 1.50)+ss.strlt(ck7.gpa, 3.00)+ss.strlt(ck8.gpa, 1.50)+ss.strlt(ck9.gpa, 1.0);
						sgpa = total/22.00;
						cgpa = (sgpa+ss.getsgpa(fquery)+ss.getsgpa(fquery1)+ss.getsgpa(fquery2)+ss.getsgpa(fquery3)+ss.getsgpa(fquery4)+ss.getsgpa(fquery5)+ss.getsgpa(fquery6))/8;
						
						tfail =ss.fail(ck.gpa, 3.00)+ss.fail(ck1.gpa, 3.00)+ss.fail(ck2.gpa, 1.50)+ss.fail(ck3.gpa, 3.00)+ss.fail(ck4.gpa, 1.50)+ss.fail(ck5.gpa, 3.00)+ss.fail(ck6.gpa, 1.50)+ss.fail(ck7.gpa, 3.00)+ss.fail(ck8.gpa, 1.50)+ss.fail(ck9.gpa, 1.00);
						if(tfail>=6 || sgpa<2.25) {
							status = "Not Promoted";
							sgpa = 0.00;
						}
						else {
							status = "Promoted";
						}
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE4201,CSE4202,CSE4203,CSE4204,CSE4205,CSE4206,CSE4207,CSE4208,CSE4209,CSE4210,SGPA,CGPA,STATUS,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+ck8.a+"','"+ck9.a+"','"+String.format("%.2f", sgpa)+"','"+String.format("%.2f", cgpa)+"','"+status+"','"+passyear+"','"+passsemester+"')";
						
					}

					c.state.execute(sql);
					 //dispose();
					
					int x = c.state.executeUpdate(query);
					if (x == 0) {
                        JOptionPane.showMessageDialog(btnSubmit, "This is alredy exist");
                    } else {
                    	ESearchCreateResult escr = new ESearchCreateResult();
                        JOptionPane.showMessageDialog(btnSubmit,
                            "Welcome, " + name + ". Your Result is sucessfully created");
                        
                        escr.setVisible(true);
                        setVisible(false);
                        
                    }
                    c.conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnSubmit.setFont(new Font("Dialog", Font.BOLD, 24));
		btnSubmit.setBounds(600, 290, 160, 40);
		contentPane.add(btnSubmit);
		
		
		
	}
}

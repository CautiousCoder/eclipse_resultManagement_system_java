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
	private JTextField eleventhsub;
	private JTextField twelvesub;
	
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
		setBounds(80, 100, 1250, 400);
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
						fetchquery = "SELECT id,name,CSE1201,CSE1202,CSE1203,EEE1221,EEE1222,MAT1223,CHM1224,CHM1225 FROM "+passyear+passsemester;
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
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE1101,CSE1102,EEE1121,EEE1122,ENG1123,MAT1124,PHY1125,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+passyear+"','"+passsemester+"')";
						
					}
					else if(s1.equals(passyear+passsemester)) {
						sql = "CREATE TABLE IF NOT EXISTS "+ passyear+passsemester +
				                   " (id VARCHAR(10) PRIMARY KEY NOT NULL, " +
				                   " name VARCHAR(50), " +
				                   " CSE1201 VARCHAR(5) , " + 
				                   " CSE1202 VARCHAR(5), " + 
				                   " CSE1203 VARCHAR(5), " +
				                   " EEE1221 VARCHAR(5), " + 
				                   " EEE1222 VARCHAR(5), " + 
				                   " MAT1223 VARCHAR(5), " +
				                   " CHM1224 VARCHAR(5), " +
				                   " CHM1225 VARCHAR(5), " +
				                   " SGPA DOUBLE(6,2), " +
				                   " CGPA DOUBLE(6,2), " +
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE1201,CSE1202,CSE1203,EEE1221,EEE1222,MAT1223,CHM1224,CHM1225,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+passyear+"','"+passsemester+"')";
						
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
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE2101,CSE2102,CSE2103,CSE2104,CSE2105,MAT2122,STA2122,BUS2123,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+passyear+"','"+passsemester+"')";
						
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
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE2201,CSE2202,CSE2203,CSE2204,CSE2205,ECO2222,SOC2223,CSE2207,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+passyear+"','"+passsemester+"')";
						
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
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE3101,CSE3102,CSE3103,CSE3104,CSE3105,CSE3106,CSE3107,CSE3108,MAT3121,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+ck8.a+"','"+passyear+"','"+passsemester+"')";
						
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
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE3201,CSE3202,CSE3203,CSE3204,CSE3205,CSE3206,CSE3207,CSE3208,CSE3209,GEN3221,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+ck8.a+"','"+ck9.a+"','"+passyear+"','"+passsemester+"')";
						
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
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE4101,CSE4102,CSE4103,CSE4104,CSE4105,CSE4106,CSE4107,CSE4108,CSE4109,CSE4110,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+ck8.a+"','"+ck9.a+"','"+passyear+"','"+passsemester+"')";
						
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
				                   " YEAR VARCHAR(5), " +
				                   " SEMESTER VARCHAR(5))";
						query = "INSERT INTO "+ passyear+passsemester +"(id,name,CSE4201,CSE4202,CSE4203,CSE4204,CSE4205,CSE4206,CSE4207,CSE4208,CSE4209,CSE4210,YEAR,SEMESTER) values('"+id+"','"+name+"','"+ck.a+"','"+ck1.a+"','"+ck2.a+"','"+ck3.a+"','"+ck4.a+"','"+ck5.a+"','"+ck6.a+"','"+ck7.a+"','"+ck8.a+"','"+ck9.a+"','"+passyear+"','"+passsemester+"')";
						
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

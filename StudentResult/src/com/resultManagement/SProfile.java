package com.resultManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.connection.dbConecction;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SProfile extends JFrame {

	private JPanel contentPane;
	private JTextField gid;
	private JTextField greg;
	
	String sid,sname,sub,sub1,sub2,sub3,cgpa,status,sub4,sub5,sub6,sub7,sub8,sub9,sgpa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SProfile frame = new SProfile();
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
	public SProfile() {
		setTitle("Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 34));
		lblNewLabel.setBounds(100, 10, 550, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblName.setBounds(30, 120, 100, 30);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("PHONE :");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmail.setBounds(30, 160, 100, 30);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("EMAIL :");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword.setBounds(30, 200, 100, 30);
		contentPane.add(lblPassword);

		JLabel erroremail = new JLabel("");
		erroremail.setForeground(Color.RED);
		erroremail.setHorizontalAlignment(SwingConstants.CENTER);
		erroremail.setBounds(135, 165, 300, 20);
		contentPane.add(erroremail);
		
		JLabel lblIdNo = new JLabel("ID NO. :");
		lblIdNo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIdNo.setBounds(550, 120, 100, 30);
		contentPane.add(lblIdNo);
		
		JLabel lblReggNo = new JLabel("REGG. NO. :");
		lblReggNo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblReggNo.setBounds(550, 160, 100, 30);
		contentPane.add(lblReggNo);
		
		JLabel lblSession = new JLabel("SESSION :");
		lblSession.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSession.setBounds(550, 200, 100, 30);
		contentPane.add(lblSession);
		
		JLabel lblG = new JLabel("GENDER :");
		lblG.setFont(new Font("Dialog", Font.BOLD, 14));
		lblG.setBounds(550, 320, 100, 30);
		contentPane.add(lblG);
		
		JLabel lblPassword_1_1 = new JLabel("FATHER'S NAME :");
		lblPassword_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_1.setBounds(30, 240, 140, 30);
		contentPane.add(lblPassword_1_1);
		
		JLabel lblPassword_1_1_1 = new JLabel("MOTHER'S NAME :");
		lblPassword_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_1_1.setBounds(30, 280, 140, 30);
		contentPane.add(lblPassword_1_1_1);
		
		JLabel lblEmail_1 = new JLabel("PHONE :");
		lblEmail_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmail_1.setBounds(550, 240, 75, 30);
		contentPane.add(lblEmail_1);
		
		JLabel lblEmail_1_1 = new JLabel("PHONE :");
		lblEmail_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmail_1_1.setBounds(550, 280, 75, 30);
		contentPane.add(lblEmail_1_1);
		
		
	
		JLabel lblPassword_1_2 = new JLabel("FACULTY :");
		lblPassword_1_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_2.setBounds(30, 360, 100, 30);
		contentPane.add(lblPassword_1_2);
		
		JLabel lblPassword_1_1_1_1 = new JLabel("DEPARTMENT :");
		lblPassword_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_1_1_1.setBounds(30, 400, 120, 30);
		contentPane.add(lblPassword_1_1_1_1);
		
		JLabel lblPassword_1_2_1 = new JLabel("ADDRESS :");
		lblPassword_1_2_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword_1_2_1.setBounds(30, 320, 100, 30);
		contentPane.add(lblPassword_1_2_1);
		
		JLabel mname = new JLabel("");
		mname.setBounds(182, 280, 320, 30);
		contentPane.add(mname);
		
		JLabel name = new JLabel("");
		name.setBounds(182, 120, 320, 30);
		contentPane.add(name);
		
		JLabel phone = new JLabel("");
		phone.setBounds(182, 160, 320, 30);
		contentPane.add(phone);
		
		JLabel email = new JLabel("");
		email.setBounds(182, 200, 320, 30);
		contentPane.add(email);
		
		JLabel fname = new JLabel("");
		fname.setBounds(182, 240, 320, 30);
		contentPane.add(fname);
		
		JLabel address = new JLabel("");
		address.setBounds(182, 320, 320, 30);
		contentPane.add(address);
		
		JLabel fac = new JLabel("");
		fac.setBounds(182, 360, 320, 30);
		contentPane.add(fac);
		
		JLabel dept = new JLabel("");
		dept.setBounds(182, 400, 320, 30);
		contentPane.add(dept);
		
		JLabel id = new JLabel("");
		id.setBounds(662, 120, 220, 30);
		contentPane.add(id);
		
		JLabel reg = new JLabel("");
		reg.setBounds(662, 160, 220, 30);
		contentPane.add(reg);
		
		JLabel ses = new JLabel("");
		ses.setBounds(662, 200, 220, 30);
		contentPane.add(ses);
		
		JLabel fphone = new JLabel("");
		fphone.setBounds(662, 240, 220, 30);
		contentPane.add(fphone);
		
		JLabel mphone = new JLabel("");
		mphone.setBounds(662, 280, 220, 30);
		contentPane.add(mphone);
		
		JLabel gender = new JLabel("");
		gender.setBounds(662, 320, 220, 30);
		contentPane.add(gender);
		
		JLabel lblIdNo_1 = new JLabel("ID NO. :");
		lblIdNo_1.setBounds(33, 70, 70, 35);
		contentPane.add(lblIdNo_1);
		
		JLabel lblIdNo_1_1 = new JLabel("SESSION :");
		lblIdNo_1_1.setBounds(250, 70, 90, 35);
		contentPane.add(lblIdNo_1_1);
		
		gid = new JTextField();
		gid.setToolTipText("ID NO.");
		gid.setBounds(100, 70, 114, 35);
		contentPane.add(gid);
		gid.setColumns(10);
		
		JComboBox sssession = new JComboBox();
		sssession.setModel(new DefaultComboBoxModel(new String[] {"2015 - 16", "2016 - 17", "2017 - 18", "2018 - 19", "2019 - 20", "2020 - 21", "2021 - 22"}));
		sssession.setBounds(330, 70, 200, 35);
		contentPane.add(sssession);
		
		JButton search = new JButton("SEARCH");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String stid = gid.getText();
				String session = (String) sssession.getSelectedItem();
				try {
					String fetchquery=null;
					
					dbConecction c = new dbConecction();		
						fetchquery = "SELECT * FROM studentinfo WHERE id= '"+stid+"' AND session= '"+session+"'";
						
						ResultSet rs = (ResultSet) c.state.executeQuery(fetchquery);
						ResultSetMetaData rsmd = rs.getMetaData();
						//DefaultTableModel model =(DefaultTableModel) resulttable.getModel(); 
						
//						int cols = rsmd.getColumnCount();
//						String[] colName = new String[cols];
//						for(int i=0; i<cols; i++)
//							colName[i] = rsmd.getColumnName(i+1);
//						model.setColumnIdentifiers(colName);
						
						rs.next();
						sid = rs.getString(1);
						sname = rs.getString(2);
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
//							String[] row = {id,name,sub,sub1,sub2,sub3,sub4,sub5,sub6,sgpa,cgpa,status};
//							model.addRow(row);
					id.setText(sid);
					reg.setText(sname);
					ses.setText(sub);
					name.setText(sub1);
					phone.setText(sub2);
					email.setText(sub3);
					fname.setText(sub5);
					mname.setText(sub6);
					fphone.setText(sub7);
					mphone.setText(sub8);
					address.setText(sub9);
					gender.setText(sgpa);
					fac.setText(cgpa);
					dept.setText(status);
						
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		search.setBackground(new Color(0, 255, 255));
		search.setForeground(new Color(255, 255, 255));
		search.setFont(new Font("Dialog", Font.BOLD, 28));
		search.setBounds(550, 70, 200, 35);
		contentPane.add(search);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Shome sh = new Shome();
				sh.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Dialog", Font.BOLD, 28));
		btnBack.setBackground(new Color(186, 85, 211));
		btnBack.setBounds(760, 70, 170, 35);
		contentPane.add(btnBack);
		
		
	}

}

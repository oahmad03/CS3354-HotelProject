/*
Program: Hotel Management System
File: Employee.Java
Authors: Omar Ahmad, Alex Hernandez, Arsal Hussain, Reuben John, Sharun Naicker, Huamyl Shreyar
Course: 3354.005
*/

// Setup
package hotel.management.system;
import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Employee Class
public class Employee extends JFrame
{
	// Variables
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblJob;
	private JLabel lblName;
	private JLabel lblDepartment;

	// main() Method
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try{
					Employee frame = new Employee();
					frame.setVisible(true);
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}

	// close() Method
	public void close()
	{
		this.dispose();
	}

	// Employee() Method
	public Employee() throws SQLException
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430, 200, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 34, 1000, 450);
		contentPane.add(table);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					conn c = new conn();
					String displayCustomersql = "select * from Employee";
					ResultSet rs = c.s.executeQuery(displayCustomersql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		btnLoadData.setBounds(350, 500, 120, 30);
		btnLoadData.setBackground(Color.BLACK);
		btnLoadData.setForeground(Color.WHITE);
		contentPane.add(btnLoadData);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Reception().setVisible(true);
				setVisible(false);
			}
		});
		btnExit.setBounds(510, 500, 120, 30);
		btnExit.setBackground(Color.BLACK);
		btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
		
		lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(41, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblJob = new JLabel("Age");
		lblJob.setBounds(159, 11, 46, 14);
		contentPane.add(lblJob);
		
		lblName = new JLabel("Gender");
		lblName.setBounds(273, 11, 46, 14);
		contentPane.add(lblName);
		
		lblDepartment = new JLabel("Job");
		lblDepartment.setBounds(416, 11, 86, 14);
		contentPane.add(lblDepartment);
                
		JLabel l1 = new JLabel("Salary");
		l1.setBounds(536, 11, 86, 14);
		contentPane.add(l1);
                
		JLabel l2 = new JLabel("Phone");
		l2.setBounds(656, 11, 86, 14);
		contentPane.add(l2);
                
		JLabel l3 = new JLabel("State ID");
		l3.setBounds(786, 11, 86, 14);
		contentPane.add(l3);
                
		JLabel l4 = new JLabel("Email");
		l4.setBounds(896, 11, 86, 14);
		contentPane.add(l4);
                
		getContentPane().setBackground(Color.WHITE);
	}
}
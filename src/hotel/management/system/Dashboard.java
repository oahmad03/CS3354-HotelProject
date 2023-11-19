/*
Program: Hotel Management System
File: Dashboard.Java
Authors: Omar Ahmad, Alex Hernandez, Arsal Hussain, Reuben John, Sharun Naicker, Huamyl Shreyar
Course: 3354.005
*/

// Setup
package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// Dashboard Class
public class Dashboard extends JFrame
{
    // main() Method
    public static void main(String[] args)
    {
        new Dashboard().setVisible(true);
    }

    // Dashboard() Method
    public Dashboard()
    {
        super("HOTEL MANAGEMENT SYSTEM");
        setForeground(Color.CYAN);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1950, 1000);
        add(NewLabel);
        
        JLabel HotelManagementSystem = new JLabel("THE TAJ GROUP WELCOMES YOU");
        HotelManagementSystem.setForeground(Color.WHITE);
        HotelManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
        HotelManagementSystem.setBounds(600, 60, 1000, 85);
        NewLabel.add(HotelManagementSystem);

        JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
		
        JMenu HotelSystem = new JMenu("HOTEL MANAGEMENT");
        HotelSystem.setForeground(Color.BLUE);
	    menuBar.add(HotelSystem);
		
        JMenuItem FlightDetails = new JMenuItem("RECEPTION");
	    HotelSystem.add(FlightDetails);
		
	    JMenu HotelSystemHello = new JMenu("ADMIN");
        HotelSystemHello.setForeground(Color.RED);
	    menuBar.add(HotelSystemHello);
        
        JMenuItem FlightDetailshello1 = new JMenuItem("ADD EMPLOYEE");
	    HotelSystemHello.add(FlightDetailshello1);
        
        FlightDetailshello1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
                    new AddEmployee().setVisible(true);
                } catch(Exception e ){
                }
            }
	    });

        JMenuItem FlightDetailshello2 = new JMenuItem("ADD ROOMS");
	    HotelSystemHello.add(FlightDetailshello2);
        
        FlightDetailshello2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
                    new AddRoom().setVisible(true);
                } catch(Exception e ){
                }
            }
	    });

	    FlightDetails.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new Reception();
            }
	    });

        JMenuItem FlightDetailshello3 = new JMenuItem("ADD DRIVERS");
	    HotelSystemHello.add(FlightDetailshello3);
        
	    FlightDetailshello3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
                    new AddDrivers().setVisible(true);
                } catch(Exception e ){
                }
            }
	    });
		
        setSize(1950,1090);
	    setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
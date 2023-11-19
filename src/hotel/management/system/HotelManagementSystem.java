/*
Program: Hotel Management System
File: HotelManagementSystem.Java
Authors: Omar Ahmad, Alex Hernandez, Arsal Hussain, Reuben John, Sharun Naicker, Huamyl Shreyar
Course: 3354.005
*/

// Setup
package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// HotelManagementSystem Class
public class HotelManagementSystem extends JFrame implements ActionListener
{
        // Variables
        JLabel l1;
        JButton b1;

        // HotelManagementSystem() Method
        public HotelManagementSystem()
        {
                setSize(1366,430);
                setLayout(null);
                setLocation(300,300);

		        l1 = new JLabel("");
                b1 = new JButton("Next");
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);

                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                JLabel lid=new JLabel("HOTEL MANAGEMENT SYSTEM");
                lid.setBounds(30,300,1500,100);
                lid.setFont(new Font("serif",Font.PLAIN,70));
                lid.setForeground(Color.red);
                l1.add(lid);
                
                b1.setBounds(1170,325,150,50);
		        l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		        add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                
                while(true)
                {
                        lid.setVisible(false);
                        try{
                                Thread.sleep(500);
                            } catch(Exception e){
                        }
                        lid.setVisible(true);
                        try{
                                Thread.sleep(500);
                            } catch(Exception e){
                        }
                }
	    }

        // actionPerformed() Method
        public void actionPerformed(ActionEvent ae)
        {
                new Login().setVisible(true);
                this.setVisible(false);
        }

        // main() Method
        public static void main(String[] args)
        {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	    }
}
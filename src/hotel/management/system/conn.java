/*
Program: Hotel Management System
File: conn.Java
Authors: Omar Ahmad, Alex Hernandez, Arsal Hussain, Reuben John, Sharun Naicker, Huamyl Shreyar
Course: 3354.005
*/

// Setup
package hotel.management.system;
import java.sql.*;  

// conn Class
public class conn
{
    // Variables
    Connection c;
    Statement s;

    // conn() Method
    public conn()
    {
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root","Omar8343");
            s =c.createStatement();
        } catch(Exception e){
            System.out.println(e);
        }  
    }  
}
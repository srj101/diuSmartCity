/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diusmartcity;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author SRJOY
 */
public class DatabaseConnection {
    
    public Connection getcon() {
        Connection conn = null;
        System.out.println("Loading driver...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }
        System.out.println("Connecting database...");

        try  {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/diuSmartCity","root","");
            System.out.println("Database connected!");
        } catch (SQLException e) {
            //throw new IllegalStateException("Cannot connect the database!", e);
            JOptionPane.showConfirmDialog(null,e);
        }   
        return conn;
    } 
    
    
}

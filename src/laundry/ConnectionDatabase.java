/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class ConnectionDatabase {
    private static final String URL="jdbc:mysql://localhost:3306/db_laundry";
    private static final String USER="root";
    private static final String PASSWORD="";
    
    public static Connection getConnection() throws SQLException{
    return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

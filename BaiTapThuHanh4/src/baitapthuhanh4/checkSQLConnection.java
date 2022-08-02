/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapthuhanh4;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;



/**
 *
 * @author Quynh Anh
 */
public class checkSQLConnection {
    public static Connection getMyConnection() throws SQLException, ClassNotFoundException{
        return (Connection) mssqlConnection.getMysSQLConnection();
    }

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Get connection...");
        Connection conn = checkSQLConnection.getMyConnection();
        System.out.println("Get connection" + conn);
        System.out.println("Done!");
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuhanh4;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


/**
 *
 * @author Quynh Anh
 */
public class mssqlConnection {
    
    public static Connection getMysSQLConnection() throws ClassNotFoundException, SQLException{
        
        String hostname = "localhost";
        String port = "1433";
        String dataBaseName = "USER_JAVA";
        String username = "sa";
        String password = "123456789";
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //  String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";databaseName=" + db + ";" + "integratedSecurity=true"+ ";";
        String connectURL = "jdbc:sqlserver://" +hostname + ":"+port+";DatabaseName=" + dataBaseName + ";encrypt=true;trustServerCertificate=true;";
        
        Connection conn = DriverManager.getConnection(connectURL, username, password);
        
        return conn;
    }
    
}

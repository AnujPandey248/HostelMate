/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author amare
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try {
          
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "system");
        return con;
        }
        catch(Exception e)
        {
             e.printStackTrace();  // This prints the stack trace, replace with proper logging in production
            return null;
        }
        
    }
}

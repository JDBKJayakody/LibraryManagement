
package DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class DatabaseHelper {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libmng","root","");
            return con;
        } catch (Exception e) {
            System.err.println("Connection error");
            return null;
        }
    }
}

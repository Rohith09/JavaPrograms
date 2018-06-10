
package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    static public Connection c;
    static public Statement st;
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/clientdb3pm","root","rohith009");
            st = c.createStatement();
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
}

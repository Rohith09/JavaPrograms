package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    static public Connection c,p;
    static public Statement st;
    static public PreparedStatement insertClient;
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
             c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientdb3pm","root","rohith009");
            st = c.createStatement();
            insertClient = c.prepareStatement("insert into client_info (name,gender,dob,country,address,language) values (?,?,?,?,?,?)");
        }catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
}


package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class HeroConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/heroforgedb?zeroDateTimeBehavior=convertToNull";
    private static final String USER = "root";
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SENHA = "";
    
    public static void connect(String query){
        try{
            Class.forName(DRIVER);
            Connection conn = (Connection) DriverManager.getConnection(URL,USER,SENHA);
            Statement st = (Statement) conn.createStatement();
            st.execute(query);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public static ResultSet consultar(String query){
        try{
            Class.forName(DRIVER);
            Connection conn = (Connection) DriverManager.getConnection(URL,USER,SENHA);
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            return rs;
        } catch ( Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
}

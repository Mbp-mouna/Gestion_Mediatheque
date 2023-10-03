package mediatheque1;

import javax.swing.*;
import java.sql.*;

public class Connectionbdd {
    Connection conn =null;
    public static Connection ConnecrDb(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/gestion_mediatheque","root","");
    return conn;
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;}
    }
    
}


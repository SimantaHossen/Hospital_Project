/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterDAO1 
{
    public boolean userRegister(String dname, String date, String time, String dspec, String pname) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cse310_project?","root","")) {
                //Statement st= con.createStatement(); 
                String query = "INSERT INTO apn_info (pname,dname,spec,apdate,aptime) VALUES (?,?,?,?,?)";
                try (PreparedStatement pst = con.prepareStatement(query)) {
                 pst.setString(1, pname);
                 pst.setString(2, dname);
                 pst.setString(3, dspec);
                 pst.setString(4, date);
                 pst.setString(5, time);
          
                    
                    //pst.executeUpdate();
                    if (pst.executeUpdate() > 0)
                    {
                        return true;
                    }
                }
            }
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println(ex);
        }
        return false;
    }
}

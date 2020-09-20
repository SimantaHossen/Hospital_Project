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

public class RegisterDAO_1 
{
    public boolean userRegister(String name, String id, String email, String password, String address, String phoneNo, String gender, String dob) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cse310_project?","root","")) {
                //Statement st= con.createStatement(); 
                String query = "INSERT INTO untitled (Name,StudentID,Email,Password,Address,PhoneNo,Gender,DOB) VALUES (?,?,?,?,?,?,?,?)";
                try (PreparedStatement pst = con.prepareStatement(query)) {
                 pst.setString(1, name);
            pst.setString(2, id);
            pst.setString(3, email);
            pst.setString(4, password);
            pst.setString(5, address);
            pst.setString(6, phoneNo);
            pst.setString(7, gender);
            pst.setString(8, dob);
                    
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

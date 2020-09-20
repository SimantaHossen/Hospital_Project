/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
@WebServlet("/UserRegistration_1")
public class UserRegistration_1 extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        //fetching the data from the UserRegistrationForm.jsp
        String name = request.getParameter("stdName");
        String id = request.getParameter("stdID");
        String email = request.getParameter("stdEmail");
        String password = request.getParameter("stdPass");
        String address = request.getParameter("stdAdd");
        String phoneNo = request.getParameter("stdPNO");
        String gender = request.getParameter("stdGender");
        String dob = request.getParameter("stdDOB");
        
        //sending the data to the RegisterDAO class to insert into the database
        RegisterDAO_1 rDao = new RegisterDAO_1();
        if(rDao.userRegister(name, id, email, password, address, phoneNo, gender, dob) == true)
        {
            HttpSession session = request.getSession();//creating a session
            session.setAttribute("email", email);
            response.sendRedirect("docpage.jsp");
        }
        else
        {
            response.sendRedirect("index.jsp");
        }
    }
}

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
@WebServlet("/UserRegistration1")
public class UserRegistration1 extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        //fetching the data from the UserRegistrationForm.jsp
        String dname=request.getParameter("dname");
	String date=request.getParameter("date");
	String time=request.getParameter("time");
	String dspec=request.getParameter("dspec");
	String pname=request.getParameter("pname");
        
        //sending the data to the RegisterDAO class to insert into the database
        RegisterDAO1 rDao = new RegisterDAO1();
        if(rDao.userRegister(dname, date, time, dspec, pname) == true)
        {
            HttpSession session = request.getSession();//creating a session
            session.setAttribute("pname", pname);
            response.sendRedirect("patientpage.jsp");
        }
        else
        {
            response.sendRedirect("index.jsp");
        }
    }
}

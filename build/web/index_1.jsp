<%-- 
    Document   : index
    Created on : Sep 2, 2020, 1:15:13 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>General login Page</title>
    </head>
    <body>
        <h1>Doctor login Page</h1>
        <form action="login" method = "post">
            Enter Username: <input type = "text" name = "stdEmail"> <br/>
            Enter Password : <input type = "password" name = "stdPass"> <br/>
            <input type = "submit" value = "Login">
        </form>
        not a member <a href="UserRegistrationForm.jsp">click here </a>for signin....
    </body>
</html>

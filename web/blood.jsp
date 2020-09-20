<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Hospital In Town</title>
    </head>
    <body >
         <form method="post" action="BloodManage">
        <i>Which Blood Do You Need</i>
       <select name="blood" required="required">
                <option value="">Select Blood Group</option>
                <option value="A+">A+</option>
                <option value="A-">A-</option>
                <option value="B+">B+</option>
                <option value="B-">B-</option>
                <option value="O+">O+</option>
                <option value="O-">O-</option>
                <option value="AB+">AB+</option>
                <option value="AB-">AB-</option>

                
            </select>
       <button type="submit" name="submit" >
            Submit
        </button>
         </form>
    </body>
</html>
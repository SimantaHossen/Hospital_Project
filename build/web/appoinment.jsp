
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>User  | Book Appointment</title>

    </head>
    <body>

        <h1>Book Appointment</h1>

       
        <form method="post" action="UserRegistration1">
           <tr>
                        <td>Patient Name: </td>
                        <td><input type="text" name="pname" value="" size="50" /></td>
                    </tr>
  
            <label for="DoctorSpecialization">
                Doctor Specialization
            </label>
            
                   
            
            <select name="dspec" required="required">
                <option value="">Select Specialization</option>
                <option value="Brain surgery">Brain surgery</option>
                <option value="Heart surgery">Heart surgery</option>
                <option value="Plastic surgery">Plastic surgery</option>
                <option value="Cancer treatment">Cancer treatment</option>

                <option value="Basic treatment">Basic treatment</option>
            </select>
       

       
            <label for="doctor">
                Doctors
            </label>
            <select name="dname" required="required">

                <option value="">Select Doctor</option>
                <option value="Doc1">Doc1</option>
                <option value="Doc2">Doc2</option>
                <option value="Doc3">Doc3</option>

            </select>
     


      
            <label for="AppointmentDate">
                Date
            </label>
            <input  name="date"  required="required" data-date-format="yyyy-mm-dd"><b>Format: YYYY-MM-DD</b>

    

        <div >
            <label for="Appointmenttime">

                Time

            </label>
            <input  name="time" id="timepicker1" required="required"><b>Format: HH:MM:SS in 24hr format</b>
        </div>														

        <button type="submit" name="submit" >
            Submit
        </button>
    </form>

</body>
</html>
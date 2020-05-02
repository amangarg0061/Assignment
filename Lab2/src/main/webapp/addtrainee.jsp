<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Trainee</title>
</head>
<body>
<h3>Enter Trainee Details</h3>
<form action="addTrainee">
     Trainee Id:<input type="text" name="traineeid"/> <br/>  
     Trainee Name:<input type="text" name="traineename"/> <br/>
     Trainee Location:<input type="radio" name="Location" value="Pune"/>Chennai 
     <input type="radio" name="Location" value="Banglore"/>  Banglore 
     <input type="radio"  name="Location" value="Pune"/>Pune 
     <input type="radio"  name="Location" value="Mumbai"/>Mumbai
     <br>
     Trainee Domain:<select><option>Select the doamin</option><option value="jee">JEE</option>
     <option value="mainframe">Mainframe</option>
     <option value=".net">.NET</option></select> <br><br>
     <input type="submit" value="Add Trainee">
     
</form>

</body>
</html>
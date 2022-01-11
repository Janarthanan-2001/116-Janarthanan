<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
<style>
	body
	{
		 text-align: center;  
		 padding: 30px;  
	}
	
</style>
</head>
<body>
	<form action="/employee/update" method="POST">
		<input type=hidden name="Id" value="${id}" />
		<p> ID           : <input type="text" name="id" value = "${id}" disabled><br>
		<p> EmpID        : <input type="text" name="empId" value = "${empid}"><br>
		<p> Name         : <input type="text" name="empName" value = "${name}"><br>
		<p> age          : <input type="text" name="age" value = "${age}"><br>
		<p> salary       : <input type="text" name="salary" value = "${salary}"><br>
		<p> aadharNumber : <input type="text" name="aadharNumber" value = "${aadhar}" ><br>
		<p> department   : <input type="text" name="department" value ="${department}"><br>
		<br><br>
		 <input type="submit" value="Update">
			
	</form>
</body>
</html>
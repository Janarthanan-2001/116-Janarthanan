<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<style>
	body
	{
		 text-align: center;  
		 padding: 30px;  
	}
	strong
	{
		font-size: 20px;
	}
</style>
</head>
<body>
	<form action="add" method="POST">
		<p><strong>Add Employee</strong></p><br><br>
		<p> EmpId        :<input type="text" name=empId><br>
		<p> Name         :<input type="text" name="empName"><br>
		<p> age          :<input type="text" name="age"><br>
		<p> salary       :<input type="text" name="salary"><br>
		<p> aadharNumber :<input type="text" name="aadharNumber"><br>
		<p> department   :<input type="text" name="department"><br>
		<br><br>
		 <input type="submit" value="Save">
	</form>
</body>
</html>
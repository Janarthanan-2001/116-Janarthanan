<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee Result</title>
<style>
	body
	{	
		 padding: 30px;  
	}
	
</style>
</head>
<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>EmpId</th>
			<th>Name</th>
			<th>Age</th>
			<th>Salary</th>
			<th>Aadhar</th>
			<th>Department</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${empList}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.empId}</td>
				<td>${emp.empName}</td>
				<td>${emp.age}</td>
				<td>${emp.salary}</td>
				<td>${emp.aadharNumber}</td>
				<td>${emp.department}</td>
				<td><a href = "/employee/update/${emp.id}">Update</a></td>
				<td><a href = "/employee/delete/${emp.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br><br>
	<a href="/employee/"><input type="button" class="active" value="Back" name="button" /></a>
</body>
</html>
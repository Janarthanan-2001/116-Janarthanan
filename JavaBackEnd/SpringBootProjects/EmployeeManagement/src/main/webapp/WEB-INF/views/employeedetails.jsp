<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<table>
	<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>AGE</th>
			<th>AADHAR</th>
			<th>DEPARTMENT</th>
			<th>UPDATE</th>
			<th>DELETE</th>
			
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.employeeId}</td>
				<td>${employee.employeeName}</td>
				<td>${employee.salary}</td>
				<td>${employee.age}</td>
				<td>${employee.aadhar}</td>
				<td>${employee.department}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/create-employee">Create Employee</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>

	<table class="table table-striped">
				<thead>
					<tr>
						<th width="10%">EmployeeId</th>
						<th width="10%">EmployeeName</th>
						<th width="10%">Salary</th>
						<th width="10%">Age</th>
						<th width="10%">Aadhar</th>
						<th width="10%">Department</th>
						<th width="5%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${employes}" var="employee">
						<tr>
							<td>${employee.employeeId}</td>
							<td>${employee.employeeName}</td>
							<td>${employee.salary}</td>
							<td>${employee.age}</td>
							<td>${employee.aadhar}</td>
							<td>${employee.department}</td>
							<td><a type="button" class="btn btn-success"
								href="/update-employee?id=${employee.id}">Update</a>
							<a type="button" class="btn btn-warning"
								href="/delete-employee?id=${employee.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
	<a href="/create-employee">Create Employee</a>
</body>
</html>
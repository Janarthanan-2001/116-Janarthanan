
<%@ include file="common/header.jspf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
<style>
	body
	{
		 
		 padding: 30px;  
	}
	strong
	{
		font-size: 20px;
	}
</style>
</head>
<body>
<p><strong>Employee List's</strong></p><br><br>
	<table border="2" >
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
			<td><a href="/employee/update/${emp.id}">Update</a></td>
			<td><a href="/employee/delete/${emp.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
<%@ include file="common/navigation.jspf"%>
<%@ include file="common/footer.jspf"%>

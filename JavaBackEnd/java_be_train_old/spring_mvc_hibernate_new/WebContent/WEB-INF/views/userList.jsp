<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="#" method="post">
	<table border="1">
		<tr>
			<th>User Id</th>
			<th>User Name</th>
			<th>User email</th>
			<th>User Age</th>
			<th>Delect data</th>
			<th>Update data</th>
			
		</tr>
		
		<c:forEach var="user" items="${uList}">	
			<tr>
				<td>${user.id}</td>
				<td>${user.userName}</td>
				<td>${user.email}</td>
				<td>${user.userAge}</td>
				<th><a href="/spring_mvc_hibernate_new/delect/${user.id}"><input type="button" value="Delect" name="button" /></a></th>
				<th><a href="http://localhost:8080/spring_mvc_hibernate_new/update/${user.id}"><input type="button" value="Update" name="button" /></a></th>	
			</tr>
		</c:forEach>
	</table>
	<a href="http://localhost:8080/spring_mvc_hibernate_new/addUser" ><input type="button" value="AddData" name="button" /></a>
	<a href="http://localhost:8080/spring_mvc_hibernate_new/search" ><input type="button" value="Search" name="button" /></a>
</form>
</body>
</html>




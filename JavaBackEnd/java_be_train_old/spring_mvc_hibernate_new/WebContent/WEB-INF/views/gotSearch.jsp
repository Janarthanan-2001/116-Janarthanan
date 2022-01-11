<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Age	</th>
		</tr>
		<tr>
		<td>${id}</td>
		<td>${userName}</td>
		<td>${email}</td>
		<td>${userAge}</td>
		</tr>
	</table>
<a href="http://localhost:8080/spring_mvc_hibernate_new/userlist" ><input type="button" value="Back" name="button" /></a>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<P>The time on the server is ${serverTime}.</p>

<form action="gotSearch" method="POST">
		<p> User Id	   :<input type="text" name="id">
		 <input type="submit" value="search"><br>
		<a href="http://localhost:8080/spring_mvc_hibernate_new/userlist" ><input type="button" value="Back" name="button" /></a>
	</form>
</body>
</html>
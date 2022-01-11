<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<a href="http://localhost:8080/spring_mvc_hibernate1/search">Go to Search...</a><br>
<a href="http://localhost:8080/spring_mvc_hibernate1/userslist">Go to Users List...</a><br>
</head>
<body>
	<h1>Hello world!</h1>
	
	<P>The time on the server is ${serverTime}.</p>

	<form action="user" method="post">
		<p> NAME :<input type="text" name="Name"><br>
		<p> AGE : <input type="text" name="Age"><br>
		<p> EMAIL : <input type="text" name="Email"><br>
		<p> ADDRESS : <input type="text" name="Address"><br>
		 <input type="submit" value="Add user">
	</form>
</body>
</html>
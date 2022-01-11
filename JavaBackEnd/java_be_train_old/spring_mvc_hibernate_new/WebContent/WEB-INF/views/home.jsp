<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="#" >
		<p> User Name :<input type="text" name="userName"><br>
		<p> User Email : <input type="email" name="email"><br>
		<p> User Age : <input type="number" name="userAge"><br>
		
		 <input type="submit" value="add">
		 <br>
		 <a href="http://localhost:8080/spring_mvc_hibernate_new/userlist" ><input type="button" value="Back" name="button" /></a>
	</form>
</body>
</html>
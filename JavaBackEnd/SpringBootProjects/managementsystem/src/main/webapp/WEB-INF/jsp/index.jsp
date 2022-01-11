<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
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
	<form action="login" method="POST">
		<p><strong>Login</strong></p><br>
		<p> User Name :<input type="text" name="userName"><br>
		<p> Password  :<input type="text" name="password"><br>
		<p>${wrongpassword}</p>
		<input type="submit" value="login">
	</form>
</body>
</html>
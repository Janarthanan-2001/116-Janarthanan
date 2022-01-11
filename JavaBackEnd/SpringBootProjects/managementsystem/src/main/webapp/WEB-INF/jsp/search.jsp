<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee</title>
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
	<form action="/employee/search" method="Post">
		<p><strong>Search for Employee Details</strong></p><br><br>
		Search    : <input type="text" name="search">
		<input type="submit" value="search">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<P>The time on the server is ${serverTime}.</p>

	<form action="/spring_mvc_hibernate_new/updateUser" method="post">
	<table>
		<tr>
				<td>userId    : ${id}</td>
				<td>userName   : <input type="text" name="userName" value="${userName}"></td>
				<td>userEmail   : <input type="text" name="email" value="${email}"></td>
				<td>userAge   : <input type="text" name="userAge" value="${userAge}"></td>
				
			</tr>
	</table>	
		<input type =hidden id="id" name="id" value="${id}"	/>
		<input type="submit" value="Update">
	</form>
</body>
</html>
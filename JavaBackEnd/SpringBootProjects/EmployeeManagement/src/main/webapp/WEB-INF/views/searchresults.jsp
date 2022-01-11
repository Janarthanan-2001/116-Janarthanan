<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results</title>
</head>
<body>
<table border="1">

			<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Email</th>
			<th>Address</th>
			</tr>

	<c:forEach items="${users}" var="user">

			<tr>
			<td>${id}</td>
			<td>${Name}</td>
			<td>${Age}</td>
			<td>${Email}</td>
			<td>${Address}</td>
	</c:forEach>

</table>
</body>
</html>
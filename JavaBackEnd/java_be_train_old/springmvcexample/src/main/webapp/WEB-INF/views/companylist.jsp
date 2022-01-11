<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html>
<html>
<head>
	<title>Spring MVC Hello World</title>
</head>

<body>
	<h2>All Company in System--created by ${name} ${title} from ${Sir} ${Sir_name}</h2>
	<table border="1">
		<tr>
			<th>Company Name</th>
		</tr>
		<c:forEach items="${companies}" var="company">
			<tr>
				<td>${company.companyNames}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
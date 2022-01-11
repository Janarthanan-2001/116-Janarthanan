<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>
<title>Update</title>
</head>
<body>

	<h3>Update Employee</h3>
	<form:form method="POST" action="/update-employee/{id}">
		<table>
		<tr>
            <td>EMP ID: </td>
            <td><form:input type="text" path="employeeId" value="${employeeId}"/></td>
        </tr>
		<tr>
            <td>NAME: </td>
            <td><form:input type="text" path="employeeName" value="${employeeName}"/></td>
        </tr>
		<tr>
            <td>SALARY: </td>
            <td><form:input type="text" path="salary" value="${salary}"/></td>
        </tr>
		<tr>
            <td>AGE: </td>
            <td><form:input type="text" path="age" value="${age}"/></td>
        </tr>
		<tr>
            <td>AADHAR: </td>
            <td><form:input type="text" path="aadhar" value="${aadhar}"/></td>
        </tr>
		<tr>
            <td>DEPARTMENT: </td>
            <td><form:input type="text" path="department" value="${department}"/></td>
        </tr>
		 <tr>
            <td></td>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>	
   </form:form>
</body>
</html>
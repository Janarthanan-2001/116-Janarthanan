<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Create Employee</h1>
<form:form method="post" action="create-employee">
    <table>
		<tr>
            <td>ID: </td>
            <td><form:input type="text" path="employeeId"/></td>
        </tr>
		<tr>
            <td>NAME: </td>
            <td><form:input type="text" path="employeeName"/></td>
        </tr>
		<tr>
            <td>SALARY: </td>
            <td><form:input type="text" path="salary"/></td>
        </tr>
		<tr>
            <td>AGE: </td>
            <td><form:input type="text" path="age"/></td>
        </tr>
		<tr>
            <td>AADHAR: </td>
            <td><form:input type="text" path="aadhar"/></td>
        </tr>
		<tr>
            <td>DEPARTMENT: </td>
            <td><form:input type="text" path="department"/></td>
        </tr>
		 <tr>
            <td></td>
            <td><input type="submit" value="Create"/></td>
        </tr>
    </table>
</form:form>
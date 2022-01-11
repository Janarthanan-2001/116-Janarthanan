<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-employee">Add Employee</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of EMPLOYEE's</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="10%">EmployeeId</th>
						<th width="10%">EmployeeName</th>
						<th width="10%">Salary</th>
						<th width="10%">Age</th>
						<th width="10%">Aadhar</th>
						<th width="10%">Department</th>
						<th width="5%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${employes}" var="todo">
						<tr>
							<td>${employee.employeeId}</td>
							<td>${employee.employeeName}</td>
							<td>${employee.salary}</td>
							<td>${employee.age}</td>
							<td>${employee.aadhar}</td>
							<td>${employee.department}</td>
							<td><a type="button" class="btn btn-success"
								href="/update-employee?id=${employee.id}">Update</a>
							<a type="button" class="btn btn-warning"
								href="/delete-employee?id=${employee.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Add EMPLOYEE</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="todo">
						<form:hidden path="id" />
						<fieldset class="form-group">
							<form:label path="employeeId">EmployeeId</form:label>
							<form:input path="employeeId" type="text" class="form-control"
								required="required" />
							<form:errors path="employeeId" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="employeeName">EmployeeName</form:label>
							<form:input path="employeeName" type="text" class="form-control"
								required="required" />
							<form:errors path="employeeName" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="salary">Salary</form:label>
							<form:input path="salary" type="text" class="form-control"
								required="required" />
							<form:errors path="salary" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="age">Age</form:label>
							<form:input path="age" type="text" class="form-control"
								required="required" />
							<form:errors path="age" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="aadhar">Aadhar</form:label>
							<form:input path="aadhar" type="text" class="form-control"
								required="required" />
							<form:errors path="aadhar" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="department">Department</form:label>
							<form:input path="department" type="text" class="form-control"
								required="required" />
							<form:errors path="department" cssClass="text-warning" />
						</fieldset>
						
						<button type="submit" class="btn btn-success">Save</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>
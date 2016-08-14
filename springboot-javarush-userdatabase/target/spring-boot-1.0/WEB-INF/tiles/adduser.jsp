<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="row">

	<div class="col-md-6 col-md-offset-3">

		<div class="panel panel-default">

			<div class="panel-heading">
				<div class="panel-title">Add User</div>
			</div>


			<div class="panel-body">
				<sf:form id="details" method="post" commandName="userUpdate"
					class="addinguser">

					<div class="input-group">
						<input type="text" path="name" name="name" placeholder="Username"
							class="form-control" />
					</div>

					<div class="input-group">
						<input type="text" path="age" name="age" placeholder="Age"
							class="form-control" />
					</div>
					<div class="input-group">
						<label>Admin <sf:checkbox path="isAdmin" name="isAdmin"></sf:checkbox></label>
					</div>

					<div class="input-group">
						<button type="submit" class="btn btn-default">Add User</button>
					</div>

				</sf:form>
			</div>


			
		</div>
	</div>
</div>


<%-- <div class="checkbox">
						<label><sf:checkbox path="isAdmin" name="isAdmin"></sf:checkbox>Admin</label>
					</div> --%>
	
<%-- div class="row">

	<div class="col-md-8 col-md-offset-2">

		<div class="panel panel-default">

			<div class="panel-heading">
				<div class="panel-title">Add a New User</div>
			</div>

			<div class="panel-body">

				<form:form commandName="userUpdate">
					<div class="form-group">
						<label for="name">Name:</label>						
						<form:textarea path="name" name="name" type="text" rows="10" cols="1"></form:textarea>

					</div>
					<div class="form-group">
						<label for="age">Age:</label> 						
						<form:textarea path="age" name="age" type="text" rows="10" cols="1"></form:textarea>
						
					</div>
					<div class="checkbox">
						<label><form:checkbox  name="isAdmin"></form:checkbox>Admin</label>
					</div>
					<button type="submit" class="btn btn-default">Add User</button>
					
					
					

				</form:form>
			</div>
			
			<div class="panel panel-default">

			<div class="panel-heading">
				<div class="panel-title">
					Status update added on
					<fmt:formatDate pattern="EEEE d MMMM y 'at' H:mm:s"
						value="${latestStatusUpdate.added}" />
				</div>
			</div>

			<div class="panel-body">

				<c:out value="${latestStatusUpdate.text}" />

			</div>


		</div>
			

		</div>


	</div>


</div>

 --%>
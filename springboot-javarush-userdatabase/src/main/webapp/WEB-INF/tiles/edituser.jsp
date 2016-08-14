<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>




<div class="row">

	<div class="col-md-6 col-md-offset-3">

		<div class="panel panel-default">

			<div class="panel-heading">
				<div class="panel-title">Edit User</div>
			</div>


			<div class="panel-body">

			<form:form modelAttribute="userUpdate" method="post" class="addinguser">
			
				<form:input type="hidden" path="id" />
				<form:input type="hidden" path="added" />

				<div class="errors">
					<form:errors path="name" />
				</div>
				<div class="input-group">
						  <form:input type="text" path="name" name="name" placeholder="Username" 
						  class="form-control" ></form:input>
					</div>

					<div class="input-group">
						<form:input type="text" path="age" name="age" placeholder="Age"
							class="form-control" ></form:input>
					</div>
					
					<div class="input-group">
						<label>Admin <form:checkbox path="isAdmin" name="isAdmin"></form:checkbox></label>
					</div>

				<input type="submit" name="submit" value="Save" />
			</form:form>
		</div>

		</div>

	</div>



</div>



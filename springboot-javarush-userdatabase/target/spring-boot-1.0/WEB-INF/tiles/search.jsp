<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="nik"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="row">

	<div class="col-md-6 col-md-offset-3">

		<div class="panel panel-default">

			<div class="panel-heading">
				<div class="panel-title">Search by name</div>
			</div>

			<div class="panel-body">

				<form:form modelAttribute="userFound">

					<div class="errors">
						<form:errors path="name" />
					</div>
					<div class="form-group">
						<form:input path="name" name="name"></form:input>
					</div>

					<input type="submit" name="submit" value="Search" />
				</form:form>

			</div>


		</div>



		<c:forEach var="user" items="${users}">

			<c:url var="editLink" value="/edituser?id=${user.id}" />
			<c:url var="deleteLink" value="/deleteuser?id=${user.id}" />

			<div class="panel panel-default">


				<div class="panel-body">
					<div class="panel panel-default">

						<div class="panel-heading">
							<div class="panel-title">
								User added on
								<fmt:formatDate pattern="EEEE d MMMM y 'at' H:mm:s"
									value="${latestStatusUpdate.added}" />
							</div>
						</div>

						<div class="panel-body">

							<div>Name: ${user.name}</div>
							<div>Age: ${user.age}</div>
							<div>Admin: ${user.isAdmin}</div>

							<div class="edit-links pull-right">
								<a href="${editLink}">edit</a> | <a
									onclick="return confirm('Really delete this status update?');"
									href="${deleteLink}">delete</a>
							</div>

						</div>


					</div>
				</div>


			</div>
		</c:forEach>




	</div>

</div>
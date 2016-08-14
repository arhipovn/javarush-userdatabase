<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="nik" %>

<c:url var="url" value="/viewusers" />

<div class="row">

	<div class="col-md-8 col-md-offset-2">

		<nik:pagination url="${url}" page="${page}" size="5" />

		<c:forEach var="userUpdate" items="${page.content}">
		
			<c:url var="editLink" value="/edituser?id=${userUpdate.id}" />
			<c:url var="deleteLink" value="/deleteuser?id=${userUpdate.id}" />


			<div class="panel panel-default">

				<div class="panel-heading">
					<div class="panel-title">
						User added on
						<fmt:formatDate pattern="EEEE d MMMM y 'at' H:mm:s"
							value="${userUpdate.added}" />
					</div>
				</div>

				<div class="panel-body">

					<div>Name: ${userUpdate.name}</div>
					<div>Age: ${userUpdate.age}</div>
					<div>Admin: ${userUpdate.isAdmin}</div>

					<div class="edit-links pull-right">
						<a href="${editLink}">edit</a> | <a onclick="return confirm('Really delete this status update?');" href="${deleteLink}">delete</a>
					</div>

				</div>


			</div>

		</c:forEach>

	</div>
</div>

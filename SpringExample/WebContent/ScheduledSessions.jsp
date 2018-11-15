<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="ses" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
div {
	margin: inherit;
	border: 2px solid gray;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scheduled Sessions</title>
</head>
<body>
	<div>
		<ses:form action="done" method="post" modelAttribute="end">
			<h2>Scheduled Sessions</h2>
			<table>
				<tr>
					<th>SessionName</th>
					<th>Duration(Days)</th>
					<th>Faculty</th>
					<th>Mode</th>
					<th></th>
				</tr>
				<for:forEach var="sessions" items="${data}">
					<tr>
						<td>${sessions.name}</td>
						<td>${sessions.duration}</td>
						<td>${sessions.faculty}</td>
						<td>${sessions.mode1}</td>
						<td><a href="Success.jsp?a=${sessions.name}">Enroll Me</a></td>
					</tr>
				</for:forEach>
			</table>
		</ses:form>
	</div>
</body>
</html>
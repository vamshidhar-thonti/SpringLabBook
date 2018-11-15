<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="allMobiles" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Mobile ID</th>
			<th>Mobile Name</th>
			<th>Mobile Price</th>
			<th>Mobile Category</th>
			<th>Mobile Online</th>
		</tr>
		<allMobiles:forEach var = "mobile" items = "${data}">
			<tr>
				<td>${mobile.mobId}</td>
				<td>${mobile.mobName}</td>
				<td>${mobile.mobPrice}</td>
				<td>${mobile.mobCategory}</td>
				<td>${mobile.mobOnline}</td>
			</tr>
		</allMobiles:forEach>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="allMobiles" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="su" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<su:form action="disp" method="post" modelAttribute="my">
		<table border="1" align="center">
		<caption><b>Purchase a Mobile of your wish</b></caption>
			<tr>
				<th>Mobile ID</th>
				<th>Mobile Name</th>
				<th>Mobile Price</th>
				<th>Mobile Category</th>
				<th></th>
			</tr>
			<allMobiles:forEach var="mobile" items="${data}">
				<tr>
					<td align="center">${mobile.mobId}</td>
					<td align="center">${mobile.mobName}</td>
					<td align="center">${mobile.mobPrice}</td>
					<td align="center">${mobile.mobCategory}</td>
					<td align="center">
						<a href="success.jsp?a=${mobile.mobName}">Purchase</a>
					</td>
				</tr>
			</allMobiles:forEach>
		</table>
	</su:form>
</body>
</html>
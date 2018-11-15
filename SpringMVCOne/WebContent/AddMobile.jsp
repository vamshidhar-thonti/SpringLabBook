<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "fo" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mobiles</title>
</head>
<body>
	<table>
		<!-- commandName = "my" can also be used instead of modelAttribute = "my" -->
		<fo:form action = "addData" method = "post" modelAttribute = "my">
			<tr>
				<td>Mobile ID</td>
				<td><fo:input path="mobId"/></td>
				<td><fo:errors path="mobId"></fo:errors></td>
			</tr>
			<tr>
				<td>Mobile Name</td>
				<td><fo:input path="mobName"/></td>
				<td><fo:errors path="mobName"></fo:errors></td>
			</tr>
			<tr>
				<td>Mobile Price</td>
				<td><fo:input path="mobPrice"/></td>
				<td><fo:errors path="mobPrice"></fo:errors></td>
			</tr>
			<tr>
				<td>Mobile Category</td>
				<td><fo:select path="mobCategory" items = "${cato}"/></td>
				<td><fo:errors path="mobCategory"></fo:errors></td>
			</tr>
			<tr>
				<td><fo:radiobutton path = "mobOnline" value = "Yes"/>Yes</td>
				<td><fo:radiobutton path = "mobOnline" value = "No"/>No</td>
				<td><fo:errors path="mobOnline"></fo:errors></td>
			<tr>
				<td><input type = "submit" value = "Add Mobile"/></td>
			</tr>
		</fo:form>
	</table>
</body>
</html>
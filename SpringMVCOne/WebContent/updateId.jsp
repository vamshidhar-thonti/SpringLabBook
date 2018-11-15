<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="update" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<update:form action = "updateBD" method = "post" modelAttribute = "upId">
		Enter Mobile ID: <update:input path="mobId"/><br>
		Enter Mobile Name: <update:input path="mobName"/><br>
		Enter Mobile Price: <update:input path="mobPrice"/><br>
		Enter Mobile Category: <update:input path="mobCategory"/><br>
		Enter Mobile Type: <update:input path="mobOnline"/><br>
		<input type="submit" value="Update"/>
	</update:form>
</body>
</html>
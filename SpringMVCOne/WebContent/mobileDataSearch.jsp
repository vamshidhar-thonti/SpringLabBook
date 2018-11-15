<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="searchData"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>Searched Data for the mobile ID is <br>
		<b>Mobile ID: </b>${searchedData.mobId}<br> 
		<b>Mobile Name: </b>${searchedData.mobName}<br>
		<b>Mobile Price: </b>${searchedData.mobPrice}<br>
		<b>Mobile Category: </b>${searchedData.mobCategory}<br>
		<b>Mobile Online: </b>${searchedData.mobOnline}
</body>
</html>
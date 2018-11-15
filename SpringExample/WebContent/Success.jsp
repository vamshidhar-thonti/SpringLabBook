<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
div {
	margin: auto;
	border: 2px solid gray;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enrolled</title>
</head>
<body>
	<div>
		<h3>
			You are enrolled to :<%out.println(" " + request.getParameter("a") + " ");%>Session
		</h3>
	</div>
</body>
</html>
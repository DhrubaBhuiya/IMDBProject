<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello admin ${sessionScope.admin_name}</h2>
<a href="addfilms.jsp">Add content</a><br/><br>
<a href="viewfilms.jsp">View content</a><br/>
<a href="Adminlogout">Log out</a>

</body>
</html>
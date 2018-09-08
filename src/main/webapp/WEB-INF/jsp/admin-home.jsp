<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Hello admin ${sessionScope.admin_name}</h2>
<a href="addcontent">Add content</a><br/><br>
<a href="AdminView">View content</a><br/><br>
<a href="Adminlogout">Log out</a>
</center>
</body>
</html>
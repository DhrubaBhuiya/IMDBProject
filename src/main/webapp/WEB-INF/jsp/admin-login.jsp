<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">


body{
background-color:skyblue;
text-align : center;
font-family: "SIMPSON";
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>	

<body >

<h1> ADMIN LOGIN</h1>
 <form action="admin-login" method="post">
UserName:<input type="text"     name="id"><br/><br>
Password:<input type="password" name="password"><br/><br/><br/>
<div>${error}</div>
<input type="submit" value="login">

</form>
 

</body>
</html>
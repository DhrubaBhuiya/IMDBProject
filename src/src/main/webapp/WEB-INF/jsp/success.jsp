<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.container {
    padding: 16px;
    background-color: white;
    width:600px;
    margin-top:200px;
}
body {
    background-image: url("/images/success.jpg");
    background-color: #cccccc;
    font-family: Arial, Helvetica, sans-serif;
}
* {
    box-sizing: border-box;
}
h1,h2 {
    text-shadow: 0 0 3px #FF0000, 0 0 5px #0000FF;
}
</style>

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<center>
<div class="container">
<div class="w3-container w3-center w3-animate-zoom">

<h1>Successfully signed up!!!</h1>
<h2>Welcome ${msg}</h2>
<a href="/"><i class="w3-large fa fa-home"></i>Home</a></div>
</div>
</center>
</body>
</head>
</html>
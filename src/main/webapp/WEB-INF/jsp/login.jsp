<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style> 
body {
    background-image: url("/images/login background.jpg");
    background-color: #cccccc;
    font-family: Arial, Helvetica, sans-serif;
}
* {
    box-sizing: border-box;
}

/* Add padding to containers */
.container {
    padding: 16px;
    background-color: white;
    width:400px;
    margin-top:40px;
}



/* Overwrite default styles of hr */
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 70%;
    opacity: 0.9;
}

.registerbtn:hover {
    opacity: 1;
}

/* Add a blue text color to links */
a {
    color: dodgerblue;
}


h1{

    text-shadow: 0 0 3px #FF0000;
text-align:center;}

b{
    text-shadow: 0 0 3px #FF0000;
}


.icon {
    padding: 10px;
    background: dodgerblue;
    color: white;
    min-width: 50px;
    text-align: center;
    height:100%;
}

.input-container {
    display: -ms-flexbox; /* IE10 */
    display: flex;
    width: 100%;
    margin-bottom: 15px;
    height:30px;
    border:1px solid;
}
.input-field {
    width: 100%;
    height:100%;
    padding: 10px;
    outline: none;
}
 
    .cancelbtn {
       width: 20%;
    }
a{
	text-decoration: none;
	color:black;
}
    
</style>

</head>
<body>
<div class="w3-container  w3-animate-bottom">
<center>
<form action="login" method="post">
  <div class="container">
    <h1>Login Form</h1>
    <hr>
<div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Userid/Email" name="id">
  </div>

  
  
  <div class="input-container">
    <i class="fa fa-key icon"></i>
    <input class="input-field" type="password" placeholder="Password" name="password">
  </div>

   
    <hr>
<button type="submit" class="registerbtn">Login</button>
<div style="color: red">${error}</div>

  <div >
  <hr>
  <b>New user</b>
    <button type="button" class="cancelbtn"><a href="signup">Sign Up</a></button>
    
  </div>

  </div>
</form>
</center>
</div>
</body>
</html>
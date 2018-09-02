<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;
}


/* Full-width input fields */
input[type=text],input[type=password],input[type=email] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus,input[type=password]:focus,input[type=email]:focus {
    background-color: #ddd;
    outline: none;
}

hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
    border-color: red;
    
}

/* Set a style for all buttons */
.resetbtn, .signupbtn {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    border: none;
    cursor: pointer;
    opacity: 0.9;
}

.resetbtn:hover, .signupbtn:hover {
    opacity:1;
}

/* Extra styles for the cancel button */
.resetbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.resetbtn, .signupbtn {
  float: left;
  width: 50%;
  height: 50px;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}
 .container1{
   padding: 16px;
   background-color:white;
   width: 400px;
   margin-top: 40px;
   border: thick solid blue;
   
 }

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
</style>
<body  background="images/signup_image.jpg">

 <center>
 <div class="container1">

<form action="register" method="post" commandName="user" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    
     <label for="firstName"><b>First Name</b></label>
    <input type="text" placeholder="Enter First Name" name="firstName" required>

    <label for="lastName"><b>Last Name</b></label>
    <input type="text" placeholder="Enter Last Name" name="lastName" required>

    <label for="userId"><b>User Id</b></label>
    <input type="text" placeholder="Enter User Id" name="userId" required>
    
	 <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
    
    <label for="email"><b>Email id</b></label>
    <input type="email" placeholder="Enter Email" name="emailId" required>
    
       <label for="phoneNo"><b>Phone No</b></label>
    <input type="text" placeholder="Enter Phone No" name="phoneNo" required>
    
    <div>
    <p style="color:green;"> This is a Heading </p>
    	
    </div>

    <div class="clearfix">
      <input type="reset" class="resetbtn" value="Reset"/>
      <input type="submit" class="signupbtn" value="Submit"/>
    </div>
  </div>
</form>

</div>
</center>
</body>
</html>

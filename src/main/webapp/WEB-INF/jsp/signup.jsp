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

<form action="signup" method="post" commandName="user" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    
     <label for="firstName"><b>First Name</b></label>
    <input type="text" placeholder="Enter First Name" name="firstName" pattern="[a-z][A-Z]{1-15}"
        title="firstname should only contain letters. e.g. John" required>

    <label for="lastName"><b>Last Name</b></label>
    <input type="text" placeholder="Enter Last Name" name="lastName" pattern="[a-z][A-Z]{1-15}"
        title="lastname should only contain  letters. e.g. Peter" required/>

    <label for="userId"><b>User Id</b></label>
    <input type="text" placeholder="Enter User Id" name="userId" pattern="[a-z][A-Z][1-100]{1-15}" title="userid should contain only letters and number e.g.john96" required>
    
	 <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8-16}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
    
    <label for="email"><b>Email id</b></label>
    <input type="email" placeholder="Enter Email" name="emailId" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required>
    
       <label for="phoneNo"><b>Phone No</b></label>
    <input type="text" placeholder="Enter Phone No" name="phoneNo" pattern="[7-9]{1}[0-9]{9}" title="Phone number with 7-9 and remaing 9 digit with 0-9" required>
    
    <div>
    <p style="color:green;">${error}</p>
    	
    </div>

    <div class="clearfix">
      <input type="reset" class="resetbtn" value="Reset"/>
     <a href="/success"> <input type="submit" class="signupbtn" value="Submit"/></a>
      <script>
</script>
    </div>
  </div>
</form>

</div>
</body>
</html>

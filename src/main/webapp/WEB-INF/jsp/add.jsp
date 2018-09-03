<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Content-Admin</title>
</head>
<body>
<center>
 <div class="container1">

<form action="add" method="post" commandName="content" style="border:1px solid #ccc">
  <div class="container">
    <h1>Add new content</h1>
   <hr>
    
     <label for="contentName"><b>Content Name</b></label>
    <input type="text" placeholder="Enter content Name" name="contentName" required pattern="[a-zA-Z][a-zA-Z0-9\s]*">

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
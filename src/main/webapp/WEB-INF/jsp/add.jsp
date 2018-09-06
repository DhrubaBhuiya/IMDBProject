<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;
	background-color:#ECF6BA;}
* {box-sizing: border-box;
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
   border: thick solid black;
 }
 input[type=text],input[type=date],textarea{
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
	background-color: #ddd;
    outline: none;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Content-Admin</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script>
   $( document ).ready(function() {  
	   var msg = '${msg}';
	   if(msg!="")
    		alert(msg);

   });
    </script>
<center>
 <div class="container1">

<form action="addcontent" method="post" commandName="content" style="border:1px solid #ccc" id="addform" enctype="multipart/form-data">
  <div class="container">
    <h1>Add new content</h1>
   <hr>
    
     <label for="contentName"><b>Name</b></label>
    <input type="text" placeholder="Enter content Name" name="contentName" required pattern="[a-zA-Z][a-zA-Z0-9\s]*"><br/>

    <label for="contentType"><b>Type</b></label><br/><br/>
    <input type="radio"  name="contentType" value="hollywood">Hollywood movies<br/><br/>
    <input type="radio"  name="contentType" value="bollywood">Bollywood movies<br/><br/>
	<input type="radio"  name="contentType" value="tvShows">TV shows<br/><br/>
	
    <label for="contentDescription"><b>Content Description</b></label>
    <textarea rows="4" cols="40" name="contentDescription" form="addform" required placeholder="Enter description"></textarea><br/><br/>
    
	 <label for="contentGenre"><b>Genre</b></label>
    <input type="text" placeholder="Enter genre" name="contentGenre" required  pattern="[a-zA-Z][a-zA-Z0-9\s,]*"><br/>
    
   <label for="contentActor"><b>Actor</b></label>
    <input type="text" placeholder="Enter actor" name="contentActor" required  pattern="[a-zA-Z][a-zA-Z0-9\s,]*"><br/>
    
       <label for="contentActress"><b>Actress</b></label>
    <input type="text" placeholder="Enter actress" name="contentActress" required  pattern="[a-zA-Z][a-zA-Z0-9\s,]*"><br/>
    
     <label for="contentDirector"><b>Director</b></label>
    <input type="text" placeholder="Enter director" name="contentDirector" required  pattern="[a-zA-Z][a-zA-Z0-9\s,]*"><br/>
   
    <label for="contentProducer"><b>Producer</b></label>
    <input type="text" placeholder="Enter producer" name="contentProducer" required  pattern="[a-zA-Z][a-zA-Z0-9\s,]*"><br/>
    
    <label for="contentReleaseDate"><b>Release Date</b></label>
    <input type="date" placeholder="Enter release date" name="contentReleaseDate" required><br/>
    
    <label for="contentEndDate"><b>End Date</b></label>
    <input type="date" placeholder="Enter end date" name="contentEndDate"><br/>
	
   <label for="contentImage"><b>Image</b></label><br/>
   <input type="file" name="contentImage" accept="image/*" required>
    <div><br/><br/>
    <p style="color:red;"> ${error} </p>
    </div><br/>
	
    <div class="clearfix">
      <input type="reset" class="resetbtn" value="Reset"/>
      <input type="submit" class="submitbtn" value="Submit"/>
    </div>
  </div>
  <br/><a href="">Home</a>
</form>

</div>
</center>
</body>
</html>
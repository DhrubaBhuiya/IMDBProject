<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
  
<title>Insert title here</title>
<style>
th {
    border: 1px solid black;
    text-align: left;
    padding: 8px;
     background-color: #dddddd;
}
</style>
</head>
<body>
<center>
 <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
       <a href="#" class="pull-left"><img src="/images/elogo.jpg" alt="logo"></a>
       </div>
       </div>
       </nav> 
       </center>
<br>
<br>
<br>
<br>
<br>
<center>
 

    </div>
<table  border="2">

  <tr  style="background-color:#white;">
      <u> <strong><h2> Content Details</h2></strong></u>
        </tr>
      <tr>
      <center>
          <th class="border"><u>Content_ID</u></th>
           <th class="border"><u>Content_Name</u></th>
          <th class="border"><u>Content_Type</u></th>
           <th class="border"><u>Content_Description</u></th>
            <th class="border"><u>Content_Genre</u></th>
             <th class="border"><u>Content_Actor</u></th>
              <th class="border"><u>Content_Actress</u></th>
               <th class="border"><u>Content_Director</u></th>
                <th class="border"><u>Content_Producer</u></th>
               <th class="border"><u>Content_Image</u></th>
                <th class="border"><u>Content_ReleaseDate</u></th>
                 <th class="border"><u>Content_EndDate</u></th>
             </center>  
                
       </tr>
  </thead>                    


  <tbody>
      <c:forEach var="ContentPojo" items="${contentList}">                     
          <tr>
              <td><center>${ContentPojo.content_id}</center></td>
              <td><center>${ContentPojo.contentname}</center></td>
              <td><center>${ContentPojo.content_type}</center></td>
               <td><center>${ContentPojo.content_description}</center></td>
                <td><center>${ContentPojo.content_genre}</center></td>
                 <td><center>${ContentPojo.content_actor}</center></td>
                  <td><center>${ContentPojo.content_actress}</center></td>
                   <td><center>${ContentPojo.content_director}</center></td>
                    <td><center>${ContentPojo.content_producer}</center></td>
                    <td><center>${ContentPojo.data}</center></td>
                     <td><center>${ContentPojo.contentEndDate}</center></td>
                      <td><center>${ContentPojo.contentReleaseDate}</center></td>
                      
            
          </tr>
      </c:forEach>         
   </tbody>    
      </table>
      </center>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <center>
<div class="footer">
 <ul class="pager">
    <li class="Previous"><a href="AdminViewContent"><input type="submit" value="Previous Page"></a></li>
    <li class="Next"><a href="AdminViewContent"><input type="submit" value="Next Page"></a></li>
         
  </ul>
</div>
      <center>
      <div class="footer">
	  <ul class="breadcrumb">
     <li> <a href="AdminView">
      <input type="submit" value="Back">
      </a></li>
      <li> <a href="AdminViewReview">
      <input type="submit" value="View Review & Ratings">
      </a>
	  </li>
      </div>
    </center>
     
</body>
</html>

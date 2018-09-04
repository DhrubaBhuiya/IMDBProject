<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  
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
<tr>
<td>


       </td>
       </tr>
  <tr  style="background-color:#white;">
      <u> <strong> Review & Rating Details</strong></u>
        </tr>
      <tr>
          <th class="border"><u>Content_ID</u></th>
           <th class="border"><u>Content_Review</u></th>
          <th class="border"><u>Content_Rating</u></th>
           <th class="border"><u>User_ID</u></th>
            
                
       </tr>
  </thead>                    


  <tbody>
      <c:forEach var="ReviewPojo" items="${reviewList}">                     
          <tr>
              <td>${ReviewPojo.content_id}</td>
              <td>${ReviewPojo.content_review}</td>
              <td>${ReviewPojo.content_rating}</td>
               <td>${ReviewPojo.user_id}</td>
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
      <a href="AdminView">
      <input type="submit" value="Back">
      </a>
     <br>
     <br>
     <br>
    </div>
    <div class="footer">
      <a href="AdminViewContent">
      <input type="submit" value="View Content">
      </a>
    </center>
</body>
</html>

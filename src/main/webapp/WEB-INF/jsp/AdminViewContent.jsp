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
      <u> <strong> Content Details</strong></u>
        </tr>
      <tr>
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
               
                
       </tr>
  </thead>                    


  <tbody>
      <c:forEach var="ContentPojo" items="${contentList}">                     
          <tr>
              <td>${ContentPojo.content_id}</td>
              <td>${ContentPojo.content_name}</td>
              <td>${ContentPojo.content_type}</td>
               <td>${ContentPojo.content_description}</td>
                <td>${ContentPojo.content_genre}</td>
                 <td>${ContentPojo.content_actor}</td>
                  <td>${ContentPojo.content_actress}</td>
                   <td>${ContentPojo.content_director}</td>
                    <td>${ContentPojo.content_producer}</td>
                    <td>${ContentPojo.data}</td>
                     <td>${ContentPojo.contentEndDate}</td>
                      <td>${ContentPojo.contentReleaseDate}</td>
                      
            
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
      </form>
    </div>
      <br>
     <br>
     <br>
    </div>
    <div class="footer">
      <a href="AdminViewReview">
      <input type="submit" value="View Review & Ratings">
      </a>
    </center>
    </center>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>eLite Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=4">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
  margin: 0;
  background-color: lightblue;
  font-family: Arial, Helvetica, sans-serif;
  
}
/* The grid: Four equal columns that floats next to each other */
.column {
	margin: 0px;
    float: left;
    width: 25%;
    
}
/* Style the images inside the grid */
.column img {
    opacity: 0.8; 
    cursor: pointer; 
}

.column img:hover {
    opacity: 1;
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}
h2
{
font: 22px Georgia Bold;
}
.more
{
 position: absolute;
    right: 20px;
    font: Georgia;
}
.leftcolumn {
    float:left;
    width:15%;
}

.rightcolumn {

    width:15%;
    margin-bottom:10px;
}

.container-my{
	margin-top:80px;
}

*{
    box-sizing: border-box;
}

/* Style the footer */
.footer {
    background-color: #010101;
    padding: 10px;
    text-align: center;
    margin-top: 30px;
}

.main-body{
margin-top:100px;

}
/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media (max-width: 600px) {
    .column {
        width: 100%;
    }
}
hr
{
height: 10px;
border: 1;
box-shadow: inset 0 5px 5px -2px rgba(10, 95, 180, 0.8);
-webkit-border-radius: 3px;
-moz-border-radius: 3px;
-ms-border-radius: 3px;
-o-border-radius: 3px;
border-radius: 3px;
}
</style>
</head>
<body>

<!-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
       <a href="#" class="pull-left"><img src="/images/elogo.jpg" alt="logo"></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-film"></span>&nbsp;Hollywood Movies
      <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li class="w3-animate-top"><a href="#">Top Rated Hollywood Movies</a></li>
          <li class="w3-animate-top"><a href="#">Currently Running Hollywood Movies</a></li>
          <li class="w3-animate-top"><a href="#">UpComing Hollywood Movies</a></li>
        </ul></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-film"></span>&nbsp;Bollywood Movies
      <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li class="w3-animate-top"><a href="#">Top Rated Bollywood Movies</a></li>
          <li class="w3-animate-top"><a href="#">Currently Running Bollywood Movies</a></li>
          <li class="w3-animate-top"><a href="#">UpComing Bollywood Movies</a></li>
        </ul></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-hd-video"></span>&nbsp;TV Shows
      <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li class="w3-animate-top"><a href="#">Top Rated TV Shows</a></li>
          <li class="w3-animate-top"><a href="#">Currently Running TV Shows</a></li>
          <li class="w3-animate-top"><a href="#">UpComing TV Shows</a></li>
        </ul></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="/signin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

<!-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->










<!-- Main Content -->



<div class="container-fluid container-my">
    <div class="row">
    <div class="col-sm-2">
	    <div class="leftcolumn  w3-animate-left">
			<a href="https://www.amazon.com/Season-Premiere-The-Chosen-Ones/dp/B07DVLHZRP"><img src="https://images-na.ssl-images-amazon.com/images/G/02/shazam/AMZN-IMDbCompanionBanner-300x250-PRIME-MASTER-f74b91fe-e1bc-4d76-807f-aa49619de604.jpg" width="200" height="750" border="1"></a>
		</div>
    </div>
    <div class="col-sm-8">
	<center>
	<div>
	<h2>Top Rated Hollywood Movies</h2><br/>
	<div class="row" style="text-align:center">
	
	  <c:forEach var="i" begin="1" end="4">
	  <div class="column w3-animate-zoom">
	    <a href="#">
			<img src="/hmovies/hmovie<c:out value="${i}"/>.jpg" alt="Movie" class="img-rounded" style="width:80%;height:200px;" onclick="myFunction(this);">
		</a>
	  </div>
	  </c:forEach>
	  
	</div>
	<div class="more"><a href="">Show more>></a></div>
	<br/><br/><hr/>
	<h2>Top Rated Bollywood Movies</h2><br/>
	<div class="row" style="text-align:center">
	
	  <c:forEach var="i" begin="1" end="4">
	  <div class="column w3-animate-zoom">
	    <a href="#">
			<img src="/bmovies/bmovie<c:out value="${i}"/>.jpg" alt="Movie" class="img-rounded" style="width:80%;height:200px;" onclick="myFunction(this);">
		</a>
	  </div>
	  </c:forEach>
	  
	</div>
	<div class="more"><a href="">Show more>></a></div>
	<br/><br/><hr/>
	<h2>Top Rated TV Shows</h2><br/>
	<div class="row" style="text-align:center">
		<c:forEach var="i" begin="1" end="4">
		  <div class="column w3-animate-zoom">
		    <a href="#">
				<img src="/tvshows/tv<c:out value="${i}"/>.jpg" alt="Tv Show" class="img-rounded" style="width:80%;height:200px;" onclick="myFunction(this);">
			</a>
		  </div>
	  </c:forEach>
		
	  </div>
	  <div class="more"><a href="">Show more>></a></div>
	  <br/><br/><hr/>
	</div>
	</center>
	</div>
	<div class="col-sm-2">
	    <div class="rightcolumn w3-animate-right">
	  		<a href="https://www.zomato.com/bangalore" target="_blank"><img src="/images/zomato1.jpg" width="200" border="1"></a>
		</div>
		<div class="rightcolumn w3-animate-right">
	  		<a href="https://www.netflix.com/" target="_blank"><img src="/images/netflix1.jpg" width="200" border="1"></a>
		</div>
		<div class="rightcolumn w3-animate-right">
	  		<a href="https://www.paytm.com/" target="_blank"><img src="/images/paytm1.jpg" width="200" border="1"></a>
		</div>
	</div>
  </div>
</div>









<!-- Footer -->
<div class="footer">
 
  	<a href="http://www.facebook.com/sharer.php?u=https://www.w3schools.com/howto/howto_css_social_media_buttons.asp" target="_blank" title="Facebook"><span class="fa fa-facebook-square fa-2x"></span></a>
	<a href="https://twitter.com/home?status=Currently reading https://www.w3schools.com/howto/howto_css_social_media_buttons.asp" target="_blank" title="Twitter"><span class="fa fa-twitter-square fa-2x"></span></a>
	<a href="https://plus.google.com/share?url=https://www.w3schools.com/howto/howto_css_social_media_buttons.asp" target="_blank" title="Google+"><span class="fa fa-google-plus-square fa-2x"></span></a>
	<a href="https://www.youtube.com/share.php?url=https://www.w3schools.com/howto/howto_css_social_media_buttons.asp" target="_blank" title="YouTube"><span class="fa fa-youtube-square fa-2x"></span></a>

	<a href="https://www.gmail.com/share?url=https://www.w3schools.com/howto/howto_css_social_media_buttons.asp" target="_blank" title="Gmail"><span class="fa fa-gmail-square fa-2x"></span></a>
  
  
  	<footer class="page-footer font-small blue pt-4">


	<a href="static/Contact-us.html">Contact us</a>
	<a href="static/About-us.html">About us</a>
	<a href="static/Help.html">Help</a>

    <!-- Copyright -->
    <div class="footer-copyright text-center py-3">&copy;2018 Copyright:
      <span>eLite Corporation</span>
    </div>
    <!-- Copyright -->

  	</footer>
  	<!-- Footer -->
</div>
</body>
</html>
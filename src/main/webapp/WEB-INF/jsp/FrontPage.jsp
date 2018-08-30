<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=4">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
 <nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
<div class="container">
<div class="btn-group btn-group-justified">
  <div class="btn-group">
 <a class="btn btn-primary" href="#">
 <span class="border border-white">
    <img src="/images/elogo.jpg" alt="logo"><strong><font size="5"></font></strong>
	</span>
  </a>
  </div>
  </div>
  <div class="btn-group btn-group-justified">
 <div class="btn-group">
 <span class="border border-white">
      <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      Movies <span class="glyphicon glyphicon-film"></span></button>
      <ul class="dropdown-menu" role="menu">
	  <center>
	  <h6>
	 <li><p class="text-warning"><p class="well"><a href="#">Top Rated Movies</a></p></p></li>
        <li><p class="text-warning"><p class="well"><a href="#">Currently Running Movies</a></p></p></li>
		 <li><p class="text-warning"><p class="well"><a href="#">UpComing Movies</a></p></p></li>
		 </h6>
		</center>
      </ul>
	  </span>
    </div>
	<div class="btn-group">
	<span class="border border-white">
      <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      TV Shows <span class="glyphicon glyphicon-hd-video"></span></button>
      <ul class="dropdown-menu" role="menu">
	  <center>
	 <h5>
      <li><p class="text-warning"><p class="well"><a href="#">Top Rated TV Shows</a></p></li>
        <li><p class="text-warning"><p class="well"><a href="#">Currently Running TV Shows</a></p></li>
		 <li><p class="text-warning"><p class="well"><a href="#">UpComing TV Shows</a></p></li>
		 </h5>
		 </center>
      </ul>
	  </span>
    </div>
		
    <a href="#" class="btn btn-primary"><span class="border border-white"><span class="glyphicon glyphicon-log-in"></span></span> Login</a>
	 	<a href="#" class="btn btn-primary"><span class="border border-white"><span class="glyphicon glyphicon-user"></span></span> Sign Up</a>
	 
	</div>
	</nav>
	
</body>
</html>


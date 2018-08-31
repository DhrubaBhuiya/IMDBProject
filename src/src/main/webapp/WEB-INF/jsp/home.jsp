<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>eLite Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=4">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
    font-family: "Times New Roman", Times, serif;

}
.more
{
 position: absolute;
    right: 20px;
}
.leftcolumn {
    float:left;
    width:15%;
}

.rightcolumn {

    width:15%;
}

.container-my{
	margin-top:80px;
}

*{
    box-sizing: border-box;
}

/* Style the footer */
.footer {
    background-color: #f1f1f1;
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
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-film"></span>&nbsp;Movies
      <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Top Rated Movies</a></li>
          <li><a href="#">Currently Running Movies</a></li>
          <li><a href="#">UpComing Movies</a></li>
        </ul></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-hd-video"></span>&nbsp;TV Shows
      <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Top Rated TV Shows</a></li>
          <li><a href="#">Currently Running TV Shows</a></li>
          <li><a href="#">UpComing TV Shows</a></li>
        </ul></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

<!-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->










<!-- Main Content -->



<div class="container-fluid container-my">
    <div class="row">
    <div class="col-sm-2">
	    <div class="leftcolumn">
			<a href="https://www.amazon.com/Season-Premiere-The-Chosen-Ones/dp/B07DVLHZRP"><img src="https://images-na.ssl-images-amazon.com/images/G/02/shazam/AMZN-IMDbCompanionBanner-300x250-PRIME-MASTER-f74b91fe-e1bc-4d76-807f-aa49619de604.jpg" width="200" height="750" border="1"></a>
		</div>
    </div>
    <div class="col-sm-8">
	<center>
<div>

<h2>Top Rated Bollywood Movies</h2>
<div class="row" style="text-align:center">
<div class="column">
    <a href="#">
		<img src="/images/image_padmavaat.jpg" alt="padmavaat" class="img-rounded" style="width:80%;height:200px;" onclick="myFunction(this);">
	</a>
  </div>
  <div class="column">
   <a href="#"> 
	 <img src="/images/image_raazi.jpg" alt="raazi" style="width:80%;height:200px;" onclick="myFunction(this);">
   </a>
  </div>
  <div class="column">
    <a href="#">
		<img src="/images/image_sanju.jpg" alt="sanju" style="width:80%;height:200px;" onclick="myFunction(this);">
	</a>
  </div>
  <div class="column">
    <a href="#">
		<img src="/images/image_gold.jpg" alt="gold" style="width:80%;height:200px;" onclick="myFunction(this);">
	</a>
	
  </div>
  
</div>
<div class="more"><a href="">Show more>></a></div>

<h2>Top Rated Hollywood Movies</h2>
<div class="row" style="text-align:center">
<div class="column">
    <a href="#">
		<img src="/images/avengers.jpg" alt="avengers" style="width:80%;height:200px;" onclick="myFunction(this);">
	</a>
  </div>
  <div class="column">
   <a href="#"> 
	 <img src="/images/images_deadpool2.jpg" alt="deadpool2" style="width:80%;height:200px;" onclick="myFunction(this);">
   </a>
  </div>
  <div class="column">
    <a href="#">
		<img src="/images/images_missionimpossible.jpg" alt="missionimpossible" style="width:80%;height:200px;" onclick="myFunction(this);">
	</a>
  </div>
  <div class="column">
    <a href="#">
		<img src="/images/images_antman.jpg" alt="antman" style="width:80%;height:200px;" onclick="myFunction(this);">
	</a>
	
  </div>
  
</div>
<div class="more"><a href="">Show more>></a></div>

<h2>Top Rated TV Shows</h2>
<div class="row" style="text-align:center">
<div class="column">
    <a href="#">
		<img src="/images/image_friends.jpg" alt="friends" style="width:80%;height:200px;"  onclick="myFunction(this);">
	</a>
  </div>
  <div class="column">
   <a href="#"> 
	 <img src="/images/image_sherlock.jpg" alt="sherlock" style="width:80%;height:200px;"  onclick="myFunction(this);">
   </a>
  </div>
  <div class="column">
    <a href="#">
		<img src="/images/image_gameOfThrones.jpg" alt="gameOfThrones" style="width:80%;height:200px;"  onclick="myFunction(this);">
	</a>
  </div>
  <div class="column">
    <a href="#">
		<img src="/images/image_house.jpg" alt="house" style="width:80%;height:200px;" onclick="myFunction(this);">
	</a>
	
	</div>
	
  </div>
  <div class="more"><a href="">Show more>></a></div>
</div>
</center>
	</div>
	
	
	<div class="col-sm-2">
	    <div class="rightcolumn">
	  		<a href="https://aax-eu.amazon-adsystem.com/x/c/QsQaMI7KBWnDd9yT8YJIKv4AAAFlhlA_aQMAAADKAb5ddmk/http://aax-eu.amazon-adsystem.com/dae/c?i=1$AgAAAAAAAAAEAAAAAAAAAAMAAAAA2TZhzIPWJ8KSfnFNY9BuyDeicUXJQq9uyVjRmlnMO-gycpjmAMthhE.fa5cqjybljWHUcIQMr9d-GvUwt8e5WXdkiqFfPdYnJbSXL6kuRgbabP6vaNi.HFcPrLclSLGtIjuHmpK39pyAvVJ01tzKSeQapj6bXiH8bHztwk-sYBAabrfOYqzTjzpGe7S4hL3hgT4NtMnPPsgJ68vISJztidr6tTK58Vpqhc6eozK8Ghq7LcH8y1eKvBfeAjO2mu-ItasrC9Qs6JiqN5vyi4SKUfYAFHoqy6H0dTr6o.fOXqAWgyZuZXeRo.ovDBpd7PJOAhpJAAlGBPuaJ8FEsV6wA1W.0.dIui465NQf15rYFpIbiOdREcv5a8Yo2Ok-eaD1Cz6sTFYXQIBQV-XlrkYfCGutdoTr5Bd7q14MDf7kzy2l8-bQmMeK89LwxdZFmxvx.atBG9Yo33kgijD9PXFeLVqwSylny75aOWUu8kZJ7qWPj0q-v7XMShiJbFQUU9Es5xkWImxnpPFiE4HyiODmO-xXwQgkCVmCrB-K2mN7K94c-GHXZe.b9SGB8chrmLjOFUOBhxbkEnK29gZcY5L52DENr0wg9dQSf7fudgj-TUM28KDvqvhkGNSUm4m9A5qK2PWwQ3B9ETwfnE3xktZudptvrRbylhtvHutKZuu9-2piLoc3dz4D61TRxOgS0jHlgmpmcHWknhVvvbos-nAM53YtfdNTYm1qYUJ8UYuFfOKWh2Zz62cpnK2tJGIBvHTel.tdjHkeqtAeKsNKOgrrwxJc5rBNx98ykmq5mZDvuCSdma.yf8RV-S3H356jgT1kmxh77.xmicQYTpNSorBDQJoIx4vmJSRw84U7gu7W6J8G.CPISW2LI2FQDW0lXHetYJ89.0YffJWciBhDNLX36hBze1dCKZr3MBC-v0rZCi8uOz2hJJRFOmbiPDqPQt3n1in24ooDSP4Fjyngz5KYGDeSS6ZGbiILu9pY0q9rR4R-cuicyaD6.mNASHwNM.ZbhgGGb6S3FWrW1PifMpGlyLPPp1tkBWZ1-cc6RlUTtDdoVYyNqfTmaXWe03lofyQSHQg.jn1d-ysnCCkN3nsvapuvm8CfpbtLQtQtBCd5ugtVmHoOyH9M2RI0VTWUMXzz8WcYUFEyiVAKaXnlvqJOnTx1lX1taZPrZ.c485dQzkTfUMJPPpdzz4DFS4EV1C8v-HKMdrXRkYjqeWZRszN9bFmNyGJk-y1l4kmHJOK2LzLupZpZMcCNhVed9VWsOwDnlforDuPU4ns9ZJIIB0ZGnwGm0M3sipOTesKkutNkAGlyI3Aqvn8MLTlRLFcmcW8ywHj1.xiHi5RrgHxy503LIm7kINII3u4L4ZEeAq9WFYt9a0t0ZkNMpA7Ep56Z7l8lRpQ9D0Zm5h3aYD4aYJxwH8OK90b904xs5oKvMhXu8CZs5LrTLVgbZUC.G76GudxpFixlxgM0pbyDj2HhM40alteWckLw9QU8WS-wQhN2UMSCAiq1Y7SQ6ot5EZGvttwSDlh8P8tvLQnNPIWcGhM9dEPQCsU_&amp;d=http://www.primevideo.com/detail/amzn1.dv.gti.6eb05f7b-3886-36bd-c738-4d6939bbb01f/ref=dvm_crs_imd_in_tn_breathe" target="_blank"><img src="https://images-na.ssl-images-amazon.com/images/G/02/shazam/300x250-StreamNow7-5e78c2ea-ddea-4a16-96b2-43d250d3646d.jpg" width="200" height="750" border="1"></a>
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


	<a href="/Contact-us">Contact us</a>
	<a href="/About-us">About us</a>
	<a href="/Help">Help</a>

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
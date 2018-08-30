<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CSS Website Layout</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  margin: 0;
}

/* Style the header */
.leftcolumn {
    float:left;
    width:15%;
}

.rightcolumn {
    float: right;
  width:15%;
}
.topnav {
    overflow: hidden;
    background-color:black;
}
.topnav a {
    float: left;
    display: block;
    color: #f2f2f2;
    text-align: center;
    padding: 10px 14px;
    text-decoration: none;
    width:16%;
}

/* Change color on hover */
.topnav a:hover {
    background-color: #ddd;
    color: black;
}
.container{
width:60%;
}

</style>
</head>
<body>
<div class="topnav">
  <a href="#">Link</a>
  <a href="#">Link</a>
  <a href="#">Link</a>
  <a href="#" style="float:right">Link</a>
</div>

<div class="rightcolumn">
  <a href="https://aax-eu.amazon-adsystem.com/x/c/QsQaMI7KBWnDd9yT8YJIKv4AAAFlhlA_aQMAAADKAb5ddmk/http://aax-eu.amazon-adsystem.com/dae/c?i=1$AgAAAAAAAAAEAAAAAAAAAAMAAAAA2TZhzIPWJ8KSfnFNY9BuyDeicUXJQq9uyVjRmlnMO-gycpjmAMthhE.fa5cqjybljWHUcIQMr9d-GvUwt8e5WXdkiqFfPdYnJbSXL6kuRgbabP6vaNi.HFcPrLclSLGtIjuHmpK39pyAvVJ01tzKSeQapj6bXiH8bHztwk-sYBAabrfOYqzTjzpGe7S4hL3hgT4NtMnPPsgJ68vISJztidr6tTK58Vpqhc6eozK8Ghq7LcH8y1eKvBfeAjO2mu-ItasrC9Qs6JiqN5vyi4SKUfYAFHoqy6H0dTr6o.fOXqAWgyZuZXeRo.ovDBpd7PJOAhpJAAlGBPuaJ8FEsV6wA1W.0.dIui465NQf15rYFpIbiOdREcv5a8Yo2Ok-eaD1Cz6sTFYXQIBQV-XlrkYfCGutdoTr5Bd7q14MDf7kzy2l8-bQmMeK89LwxdZFmxvx.atBG9Yo33kgijD9PXFeLVqwSylny75aOWUu8kZJ7qWPj0q-v7XMShiJbFQUU9Es5xkWImxnpPFiE4HyiODmO-xXwQgkCVmCrB-K2mN7K94c-GHXZe.b9SGB8chrmLjOFUOBhxbkEnK29gZcY5L52DENr0wg9dQSf7fudgj-TUM28KDvqvhkGNSUm4m9A5qK2PWwQ3B9ETwfnE3xktZudptvrRbylhtvHutKZuu9-2piLoc3dz4D61TRxOgS0jHlgmpmcHWknhVvvbos-nAM53YtfdNTYm1qYUJ8UYuFfOKWh2Zz62cpnK2tJGIBvHTel.tdjHkeqtAeKsNKOgrrwxJc5rBNx98ykmq5mZDvuCSdma.yf8RV-S3H356jgT1kmxh77.xmicQYTpNSorBDQJoIx4vmJSRw84U7gu7W6J8G.CPISW2LI2FQDW0lXHetYJ89.0YffJWciBhDNLX36hBze1dCKZr3MBC-v0rZCi8uOz2hJJRFOmbiPDqPQt3n1in24ooDSP4Fjyngz5KYGDeSS6ZGbiILu9pY0q9rR4R-cuicyaD6.mNASHwNM.ZbhgGGb6S3FWrW1PifMpGlyLPPp1tkBWZ1-cc6RlUTtDdoVYyNqfTmaXWe03lofyQSHQg.jn1d-ysnCCkN3nsvapuvm8CfpbtLQtQtBCd5ugtVmHoOyH9M2RI0VTWUMXzz8WcYUFEyiVAKaXnlvqJOnTx1lX1taZPrZ.c485dQzkTfUMJPPpdzz4DFS4EV1C8v-HKMdrXRkYjqeWZRszN9bFmNyGJk-y1l4kmHJOK2LzLupZpZMcCNhVed9VWsOwDnlforDuPU4ns9ZJIIB0ZGnwGm0M3sipOTesKkutNkAGlyI3Aqvn8MLTlRLFcmcW8ywHj1.xiHi5RrgHxy503LIm7kINII3u4L4ZEeAq9WFYt9a0t0ZkNMpA7Ep56Z7l8lRpQ9D0Zm5h3aYD4aYJxwH8OK90b904xs5oKvMhXu8CZs5LrTLVgbZUC.G76GudxpFixlxgM0pbyDj2HhM40alteWckLw9QU8WS-wQhN2UMSCAiq1Y7SQ6ot5EZGvttwSDlh8P8tvLQnNPIWcGhM9dEPQCsU_&amp;d=http://www.primevideo.com/detail/amzn1.dv.gti.6eb05f7b-3886-36bd-c738-4d6939bbb01f/ref=dvm_crs_imd_in_tn_breathe" target="_blank"><img src="https://images-na.ssl-images-amazon.com/images/G/02/shazam/300x250-StreamNow7-5e78c2ea-ddea-4a16-96b2-43d250d3646d.jpg" width="200" height="750" border="1"></a>
</div>


<div class="leftcolumn">
<a href="https://www.amazon.com/Season-Premiere-The-Chosen-Ones/dp/B07DVLHZRP"><img src="https://images-na.ssl-images-amazon.com/images/G/02/shazam/AMZN-IMDbCompanionBanner-300x250-PRIME-MASTER-f74b91fe-e1bc-4d76-807f-aa49619de604.jpg" width="200" height="750" border="1"></a>
</div>
<center>
<div class="container">
<h1>java</h1>
</div>
</center>
</body>
</html>
-

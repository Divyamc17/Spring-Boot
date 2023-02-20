<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Index Page</title>
<style type="text/css">

/* body{
background: linear-gradient(
to right,
red,
orange,
yellow
);

} */

body{
background-image: url("https://e7.pngegg.com/pngimages/161/618/png-clipart-shopping-centre-storefront-strip-mall-s-text-grocery-store.png");


background-size:100%;

background-repeat: no-repeat;


}

h2 {
  background-color:white;
  color: red;
  text-align: center;
  text-decoration: blink;
}


.footer {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  height:7%;
  background-color: black;
  color: white;
  text-align: center;
}

</style>
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#"><img src="https://img.freepik.com/free-vector/shopping-mall-outside-composition-mall-building-with-tags-headlines-shops-wall_1284-58788.jpg"
   width="150" height="75"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    </ul>
    <form class="form-inline my-2 my-lg-0">
    <a class="btn btn-outline-success my-2 my-sm-0" type="submit" href="index.jsp" role="button">Home</a><br>
    &nbsp;
      
   
     <a class="btn btn-outline-success my-2 my-sm-0" type="submit" href="adminlogin.jsp" role="button">About Us</a><br>
    &nbsp;
    <a class="btn btn-outline-success my-2 my-sm-0" type="submit" href="adminlogin.jsp" role="button">Contact</a><br>
    &nbsp;
      <a class="btn btn-outline-success my-2 my-sm-0" type="submit" href="adminlogin.jsp" role="button">Adminlogin</a>
   
   
    </form>
  </div>
</nav>


<h2>Welcome To Mall  </h3>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<!-- Footer -->
<footer class="page-footer font-small blue">

  <!-- Copyright -->
  <div class="footer" style="background-color: dark;"><a href="">© 2023 Copyright:</a>
    <a href="">  &nbsp; Dyamanna H<br></a>
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer -->


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Change Password</title>
<style type="text/css">

/* body{
background: linear-gradient(
to right,
red,
orange,
yellow
);

} */

</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#"><img src="https://img.freepik.com/free-vector/shopping-mall-outside-composition-mall-building-with-tags-headlines-shops-wall_1284-58788.jpg"
   width="150" height="75"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    </ul>
    <form class="form-inline my-2 my-lg-0">
    <a class="btn btn-outline-success my-2 my-sm-0" type="submit" href="adminlogin.jsp" role="button">About Us</a><br>
    &nbsp;
    <a class="btn btn-outline-success my-2 my-sm-0" type="submit" href="adminlogin.jsp" role="button">Contact</a><br>
    &nbsp;
      <a class="btn btn-outline-success my-2 my-sm-0" type="submit" href="adminlogin.jsp" role="button">Adminlogin</a>
   
    </form>
  </div>
</nav>


<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

Change Your Password</h2>


<form action="forgotPassword" method="get">
<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-dark text-white" style="border-radius: 1rem;">
          <div class="card-body p-5 text-left">

            <div class="mb-md-5 mt-md-4 pb-5">
              <p class="text-success" align="center">${message}</p>
              <p class="text-danger" align="center">${error}</p>
              <p  style="color: green;text-align: center;font-size: x-large;font-weight: bolder;">${dto.adminName }</p>
              <div class="form-outline form-white mb-4">
              <label class="form-label" for="adminName">Generated Password</label>
                <input type="text" name="generatedPassword" id="generatedPassword" class="form-control form-control-lg" placeholder="Enter Generated Password"/>
                
              </div>
                          <div class="form-outline form-white mb-4">
              <label class="form-label" for="password">New Password</label>
                <input type="password" name="password" id="password" class="form-control form-control-lg" placeholder="Enter password"/>
 </div>

              <div class="form-outline form-white mb-4">
              <label class="form-label" for="password">Confirm Password</label>
                <input type="password" name="password1" id="password1" class="form-control form-control-lg" placeholder="Enter password"/>
 </div>

              <button class="btn btn-outline-light btn-lg px-5" type="submit">Click</button>

            </div>


            

          </div>
        </div>
      </div>
    </div>
  </div>
</section>

</form>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<!-- Footer -->
<footer class="page-footer font-small blue">

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3" style="background-color: white;"><a href="">© 2023 Copyright:</a>
    <a href="">  &nbsp; Dyamanna H</a>
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer -->


</body>
</html>
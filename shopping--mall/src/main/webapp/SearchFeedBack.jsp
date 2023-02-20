<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Search Feed Back</title>
<style type="text/css">

/* body{
background: linear-gradient(
to right,
red,
orange,
yellow
);

} */


.footer {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
    height:7%;
  background-color: white;
  color: white;
  text-align: center;
}

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
    <a class="btn btn-outline-success my-2 my-sm-0" type="submit" href="index.jsp" role="button">Home</a><br>
    &nbsp;
      <a class="btn btn-outline-success my-2 my-sm-0" type="submit" href="adminlogin.jsp" role="button">Adminlogin</a>
   
    </form>
  </div>
</nav>
<form action="search" method="post">
<div style="padding-left: 75%; padding-top: 0.8%">
<label>Name</label><input type="text" name="name"><input class="btn" type="submit" value="search" role="button" 
style="background-color: #27AE60">
</div>
<c:if test="${not empty list}">
<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th>Id</th>
      <th>Purpose</th>
      <th>Ambience</th>
      <th>Visited Food Court</th>
      <th>Visited Rest Rooms</th>
      <th>Parking Experience</th>
      <th>Total Experience</th>
      <th>Feed Back</th>
    </tr>
  </thead>
  <c:forEach items="${list}" var="dto">
<tr>
<td>${dto.feedback_id }</td>
<td>${dto.purpose }</td>
<td>${dto.ambience }</td>
<td>${dto.visitedFoodCourt }</td>
<td>${dto.visitedRestRooms }</td>
<td>${dto.parkingExperience }</td>
<td>${dto.totalExperience }</td>
<td>${dto.feedBack }</td>
<td><a class="btn btn-outline-success my-2 my-sm-0" type="submit" href="CustomerInformation.jsp" role="button" onclick="myFunction">Edit</a></td>
 </tr>
 </c:forEach>
</table>
</c:if>
</form>

<script>
function myFunction()
{
var name = document.getElementById("name");
document.getElementById('name').innerHTML = name.value;
}
</script>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<!-- Footer -->
<footer class="page-footer font-small blue">

  <!-- Copyright -->
  <div class="footer" style="background-color: white;"><a href="">© 2023 Copyright:</a>
    <a href="">  &nbsp; Dyamanna H</a>
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer -->


</body>
</html>
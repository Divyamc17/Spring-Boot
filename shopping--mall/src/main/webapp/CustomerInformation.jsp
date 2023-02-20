<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!-- <link rel = "stylesheet" href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel = "stylesheet" href = "https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.min.css"> 
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<title>Customer Information</title>
<style type="text/css">
.button {
	padding-left: 10px;
	padding-right: 30px;
	text-align: center;
}

/* 

body{
background: linear-gradient(
to right,
red,
orange,
yellow
);

} */
.fa-star {
	font-size: 50px;
	align-content: center;
}

.rating:hover {
	color: gold;
}

* {
	margin: 0;
	padding: 0;
}

.rate {
	float: left;
	height: 46px;
	padding: 0 10px;
}

.rate:not(:checked)>input {
	display: none;
}

.rate:not(:checked)>label {
	float: right;
	width: 1em;
	overflow: hidden;
	white-space: nowrap;
	cursor: pointer;
	font-size: 30px;
	color: #ccc;
}

.rate:not(:checked)>label:before {
	/* content: '★ '; */
	
}

.rate>input:checked ~ label {
	color: #ffc700;
}

.rate:not(:checked)>label:hover, .rate:not(:checked)>label:hover ~ label
	{
	color: #deb217;
}

.rate>input:checked+label:hover, .rate>input:checked+label:hover ~ label,
	.rate>input:checked ~ label:hover, .rate>input:checked ~ label:hover ~
	label, .rate>label:hover ~ input:checked ~ label {
	color: #c59b08;
}

<
--next
 
star-->.fa-star {
	font-size: 50px;
	align-content: center;
}

.rating:hover {
	color: gold;
}

* {
	margin: 0;
	padding: 0;
}

.rate1 {
	float: left;
	height: 46px;
	padding: 0 10px;
}

.rate1:not(:checked)>input {
	display: none;
}

.rate1:not(:checked)>label {
	float: right;
	width: 1em;
	overflow: hidden;
	white-space: nowrap;
	cursor: pointer;
	font-size: 30px;
	color: #ccc;
}

.rate1:not(:checked)>label:before {
	/* content: '★ '; */
	
}

.rate1>input:checked ~ label {
	color: #ffc700;
}

.rate1:not(:checked)>label:hover, .rate1:not(:checked)>label:hover ~
	label {
	color: #deb217;
}

.rate1>input:checked+label:hover, .rate1>input:checked+label:hover ~
	label, .rate1>input:checked ~ label:hover, .rate1>input:checked ~ label:hover 
	~ label, .rate1>label:hover ~ input:checked ~ label {
	color: #c59b08;
}

.fa-star {
	font-size: 50px;
	align-content: center;
}

.rating:hover {
	color: gold;
}

* {
	margin: 0;
	padding: 0;
}

.rate2 {
	float: left;
	height: 46px;
	padding: 0 10px;
}

.rate2:not(:checked)>input {
	display: none;
}

.rate2:not(:checked)>label {
	float: right;
	width: 1em;
	overflow: hidden;
	white-space: nowrap;
	cursor: pointer;
	font-size: 30px;
	color: #ccc;
}

.rate2:not(:checked)>label:before {
	/* content: '★ '; */
	
}

.rate2>input:checked ~ label {
	color: #ffc700;
}

.rate2:not(:checked)>label:hover, .rate2:not(:checked)>label:hover ~
	label {
	color: #deb217;
}

.rate2>input:checked+label:hover, .rate2>input:checked+label:hover ~
	label, .rate2>input:checked ~ label:hover, .rate2>input:checked ~ label:hover 
	~ label, .rate2>label:hover ~ input:checked ~ label {
	color: #c59b08;
}

#area {
	display: none;
}

#area1 {
	display: none;
}

.card {
	background-color: black;
}

.form-label {
	color: white;
}
</style>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#"><img src="https://img.freepik.com/free-vector/shopping-mall-outside-composition-mall-building-with-tags-headlines-shops-wall_1284-58788.jpg"
   width="150" height="75"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<a class="btn btn-outline-success my-2 my-sm-0" type="submit"
					href="adminlogin.jsp" role="button">Admin Login</a><br> <a
					class="btn btn-outline-success my-2 my-sm-0" type="submit"
					href="index.jsp" role="button">Home</a><br>
			</form>
		</div>
	</nav>
	<form action="customer" method="post">
		<section class="h-50 h-custom gradient-custom-2">

			<div class="container py-5 h-50 ">
				<div
					class="row d-flex justify-content-center align-items-center h-50">

					<div class="col-9">
						<div class="card card-registration card-registration-2"
							style="border-radius: 10px;">
							<div class="card-body p-1">
								<div class="row g-0">

									<div class="col-lg-6">
										<h3 style="color: white">
											<u>Customer Information Form :
										</h3>
										<div class="p-4">
											<div class="mb-4 pb-2">
												<div class="form-outline">
													<label class="form-label" for="form3Examplev4"
														style="color: white">Name</label> <input type="text"
														id="form3Examplev4" name="name" value="" ${dto.name }
														class="form-control form-control-lg"  />
														
												</div>
											</div>

											<div class="mb-4 pb-2">
												<div class="form-outline">
													<label class="form-label" for="form3Examplev4">Email</label>
													<input type="text" id="form3Examplev4" name="email"
														class="form-control form-control-lg" />
												</div>
											</div>

											<div class="mb-4 pb-2">
												<div class="form-outline">
													<label class="form-label" for="form3Examplev4">Mobile
														No</label> <input type="text" id="form3Examplev4" name="mobileNo"
														class="form-control form-control-lg" />
												</div>
											</div>

											<div class=" mb-4 pb-2 ">

												<div class="form-outline">
													<label class="form-label" for="form3Examplev4">Age</label>
													<input type="text" id="form3Examplev4" name="age"
														class="form-control form-control-lg" />

												</div>

												<br>
												<div class="form-outline">
													<label class="form-label" for="form3Examplev4">Country
													</label> <select class="select" name="country">
														<option value="">---SELECT---</option>
														<option value="india">India</option>
														<option value="sri lanka">Sri Lanka</option>
														<option value="dubai">Dubai</option>
														<option value="uk">Uk</option>
													</select>

												</div>
												<br>
												<div class="form-outline">
													<label class="form-label" for="form3Examplev4">State
														&nbsp;&nbsp;&nbsp;&nbsp;</label> <select class="select"
														name="state">
														<option value="---SELECT---">---SELECT---</option>
														<option value="Karnataka">Karnataka</option>
														<option value="Andhra">Andhra</option>
														<option value="Tamil Nadu">Tamil Nadu</option>
														<option value="Maharashtra">Maharashtra</option>
													</select>

												</div>
												<br>
												<div class="form-outline">
													<label class="form-label" for="form3Examplev4">City
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label> <select
														class="select" name="city">
														<option value="1">---SELECT---</option>
														<option value="Bangalore">Bangalore</option>
														<option value="Mysore">Mysore</option>
														<option value="Hubli">Hubli</option>
														<option value="Belgaum">Belgaum</option>
													</select>

												</div>
												<br>
												<div class=" mb-4 pb-2 ">

													<div class="form-outline">
														<label class="form-label" for="form3Examplev4">Pin
															Code</label> <input type="text" id="form3Examplev4"
															name="pincode" class="form-control form-control-lg" />

													</div>

												</div>

											</div>
										</div>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		
		</section>

		<section class="h-50 h-custom gradient-custom-2">
			<div class="container py-5 h-50">
				<div
					class="row d-flex justify-content-center align-items-center h-50">
					<div class="col-9">
						<div class="card card-registration card-registration-2"
							style="border-radius: 10px;">
							<div class="card-body p-1">
								<div class="row g-0">

									<div class="col-lg-6">
										<h3 style="color: white">
											<u>Customer Information Form :
										</h3>
										<br>
										<div class="p-4">
											<div class=" mb-4 pb-2 ">

												<div class="form-outline">
													<label class="form-label" for="form3Examplev4">Purpose</label>
													<div class="form-outline">
														<select class="select" name="purpose">
															<option value="">---SELECT---</option>
															<option value="Shoping">Shoping</option>
															<option value="Game Playing">Game Playing</option>
															<option value="Movie">Movie</option>
															<option value="Food Court">Food Court</option>
														</select>

													</div>

													<div class="mb-4 pb-2">
														<div class="form-outline">
															<label class="form-label" for="form3Examplev4">Ambience</label>
															<br>
															<div class="rate">
																<input class="fa fa-star" type="radio" id="star5"
																	name="ambience" value="5" /> <label class="fa fa-star"
																	for="star5" title="text"></label> <input type="radio"
																	id="star4" name="ambience" value="4" /> <label
																	class="fa fa-star" for="star4" title="text"></label> <input
																	type="radio" id="star3" name="ambience" value="3" /> <label
																	class="fa fa-star" for="star3" title="text"></label> <input
																	type="radio" id="star2" name="ambience" value="2" /> <label
																	class="fa fa-star" for="star2" title="text"></label> <input
																	type="radio" id="star1" name="ambience" value="1" /> <label
																	class="fa fa-star" for="star1" title="text"></label>
															</div>

														</div>
													</div>
													<br>

													<table class="table100" width="150%" cellspacing="2"
														cellpadding="2">
														<tr>
															<label class="form-label" for="form3Examplev4">Are
																you Visited Food Court? :</label>
															<td class="data_yy yyy1"><input type="radio"
																name="visitedFoodCourt" id="yes" value="YES"
																onclick="hideShowJacks('Y');" /><label for ="yes" style="color: white;">Yes</label> <input
																type="radio" name="visitedFoodCourt" id="jone" value="No"
																 onclick="hideShowJacks('N');" /><label for ="No" style="color: white;">No</label>
															</td>
															<!-- <td class="data_xx xxx1"> Are you in high school?</td> -->
														</tr>
													</table>
													<textarea id="area" name="visitedFoodCourt"></textarea>
													<script type="text/javascript">
														function hideShowJacks(
																val) {
															if (val == "Y") {
																document
																		.getElementById("area").style.display = "block";
															} else {

																document
																		.getElementById("area").style.display = "none";
															}
														}
													</script>
													<br>

													<table class="table200" width="150%" cellspacing="2"
														cellpadding="2">
														<tr>
															<label class="form-label" for="form3Examplev4">Are
																you Visited Rest Room? :</label>
															<td class="data_yy yyy1"><input type="radio"
																name="visitedRestRooms" id="jack" value="Yes"
																onclick="hideShowJacks1('Yes');" /><label for ="YES" style="color: white;">Yes</label> <input
																type="radio" name="visitedRestRooms" id="jack"
																value="No" onclick="hideShowJacks1('No');" /><label for ="No" style="color: white;">No</label>
															</td>
															<!-- <td class="data_xx xxx1"> Are you in high school?</td> -->
														</tr>
													</table>

													<textarea id="area1" name="visitedRestRooms" style="display: none;"></textarea>
													<script type="text/javascript">
														function hideShowJacks1(
																val2) {
															if (val2 == "Yes") {
																document
																		.getElementById("area1").style.display = "block";
															} else {

																document
																		.getElementById("area1").style.display = "none";
															}
														}
													</script>
													<br>

													<div class="mb-3 pb-2">
														<div class="form-outline">
															<label class="form-label" for="form3Examplev4">Parking
																Experience</label> <br>
															<div class="rate1">
																<input class="fa fa-star" type="radio" id="stars5"
																	name="parkingExperience" value="5" /> <label
																	class="fa fa-star" for="stars5" title="text"></label> <input
																	type="radio" id="stars4" name="parkingExperience"
																	value="4" /> <label class="fa fa-star" for="stars4"
																	title="text"></label> <input type="radio" id="stars3"
																	name="parkingExperience" value="3" /> <label
																	class="fa fa-star" for="stars3" title="text"></label> <input
																	type="radio" id="stars2" name="parkingExperience"
																	value="2" /> <label class="fa fa-star" for="stars2"
																	title="text"></label> <input type="radio" id="stars1"
																	name="parkingExperience" value="1" /> <label
																	class="fa fa-star" for="stars1" title="text"></label>
															</div>

														</div>
													</div>
													<br>
													<div class="mb-4 pb-2">
														<div class="form-outline">
															<label class="form-label" for="form3Examplev4">totalExperience</label>
															<br>
															<div class="rate">
																<input class="fa fa-star" type="radio" id="starss5"
																	name="totalExperience" value="5" /> <label
																	class="fa fa-star" for="starss5" title="text"></label>
																<input type="radio" id="starss4" name="totalExperience"
																	value="4" /> <label class="fa fa-star" for="starss4"
																	title="text"></label> <input type="radio" id="starss3"
																	name="totalExperience" value="3" /> <label
																	class="fa fa-star" for="starss3" title="text"></label>
																<input type="radio" id="starss2" name="totalExperience"
																	value="2" /> <label class="fa fa-star" for="starss2"
																	title="text"></label> <input type="radio" id="starss1"
																	name="totalExperience" value="1" /> <label
																	class="fa fa-star" for="starss1" title="text"></label>
															</div>

														</div>
													</div>
													<div class=" mb-4 pb-2 ">
														<div class="form-outline">
															<label class="form-label" for="form3Examplev4">totalExperience</label>
															<textarea class="form-control form-control-lg"
																name="feedBack" rows="4" cols="50"></textarea>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div
			style="padding-left: 50%; padding-top: 2%; font-size: x-large; font-weight: bold;">
			<button type="submit" value="save"
				style="text-align: center; padding-left: 10%; padding-right: 10%;"
				data-mdb-ripple-color="dark">Save</button>
		</div>
					</div>
				</div>
			</div>




		</section>
		<!-- <div
			style="padding-left: 50%; padding-top: 2%; font-size: x-large; font-weight: bold;">
			<button type="submit" value="save"
				style="text-align: center; padding-left: 10%; padding-right: 10%;"
				data-mdb-ripple-color="dark">Save</button>
		</div> -->
	</form>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#st1").hover(function() {
				$(".fa-star ").css("color", "black");
				$(".fb-star ").css("color", "black");
				$("#st1 ").css("color", "yellow");

			});
			$("#st2").hover(function() {
				$(".fa-star").css("color", "black");
				$("#st1, #st2").css("color", "yellow");

			});
			$("#st3").hover(function() {
				$(".fa-star").css("color", "black")
				$("#st1, #st2, #st3").css("color", "yellow");

			});
			$("#st4").hover(function() {
				$(".fa-star").css("color", "black");
				$("#st1, #st2, #st3, #st4").css("color", "yellow");

			});
			$("#st5").hover(function() {
				$(".fa-star").css("color", "black");
				$("#st1, #st2, #st3, #st4, #st5").css("color", "yellow");

			});
		});
	</script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js">
		
	</script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js">
		
	</script>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="js/addons/rating.js"></script>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
		
		<!-- Footer -->
<footer class="page-footer font-small blue">

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3" style="background-color: white;"><a href=""> © 2023 Copyright:</a>
    <a href="">  &nbsp; Dyamanna H</a>
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer -->
		
</body>
</html>
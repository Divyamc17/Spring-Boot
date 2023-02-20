<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Admin Success Page</title>
<link rel="icon" type="image/x-icon"
	href="https://www.freeiconspng.com/thumbs/success-icon/success-icon-19.png">
<style type="text/css">
/* body{
background: linear-gradient(
to right,
red,
orange,
yellow
);

} */
.forgetpassword {
	padding-left: 35%;
	padding-top: 4%;
	padding-right: 20%;
	padding-bottom: 2%;
	background-size: 100%;
}

.log {
	position: absolute;
	text-align: center;
}
/* body {
	/* background-image: url("https://png.pngtree.com/thumb_back/fh260/background/20200714/pngtree-modern-double-color-futuristic-neon-background-image_351866.jpg");
	background-repeat: no-repeat;
	background-size: 100%; 

background-color: #D0D3D4;

} */
.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	height: 7%;
	background-color: white;
	color: white;
	text-align: center;
}
</style>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-white">
		<a class="navbar-brand" href="#"><img
			src="https://img.freepik.com/free-vector/shopping-mall-outside-composition-mall-building-with-tags-headlines-shops-wall_1284-58788.jpg"
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
					href="index.jsp" role="button">Home</a><br> &nbsp; &nbsp; <a
					class="btn btn-outline-success my-2 my-sm-0" type="submit"
					href="adminlogin.jsp" role="button">Adminlogin</a>

			</form>
		</div>
	</nav>
	<!--  <marquee style="font-size: xx-large;color: black;" scrollamount="20" direction="right">Wel Come</marquee>-->
	<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Welcome To Admin Success Page</h2>


	<%-- <div style="padding-top: 3%;">
<p style="text-align: center;font-size: x-large;color: black;">Mall Name : ${dto.name}</p>
<p style="text-align: center;font-size: x-large;color: black;">Admin Name : ${dto.adminName}</p>
</div>
<div class="forgetpassword">
		<a class="btn btn" href="CustomerInformation.jsp" role="button" style="background-color: #27AE60 ;color: white;">Take Customer FeedBack</a>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	
		<a class="btn btn" href="SearchFeedBack.jsp" role="button" style="background-color: #27AE60 ;color: white;">Search FeedBack</a>	
</div> --%>

	<form action="login" method="get">
		<section class="vh-300 gradient-custom">
			<div class="container py-9 h-300">
				<div
					class="row d-flex justify-content-center align-items-center h-300">
					<div class="col-12 col-md-8 col-lg-6 col-xl-5">
						<div class="card bg-dark text-white" style="border-radius: 1rem;">
							<div class="card-body p-8 text-left">

								<div class="mb-md-5 mt-md-4 pb-5">

									<h2 class="fw-bold mb-2 text-uppercase"></h2>
									<p class="text-white-50 mb-5"></p>

									<div class="form-outline form-white mb-4">
										<p class="btn btn-light btn-lg px-5">Mall Name :
											${dto.name}</p>
										<p class="btn btn-light btn-lg px-5">Admin Name :
											${dto.adminName}</p>

									</div>
									<div class="log">
										<button class="btn btn-outline-light  px-4" type="submit"
											value="login">
											<a href="CustomerInformation.jsp">Customer FeedBack</a>
										</button>


										<button class="btn btn-outline-light  px-4" type="submit"
											value="login">
											<a href="SearchFeedBack.jsp">Search FeedBack</a>
										</button>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>

	</form>

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
		<div class="footer" style="background-color: white;">
			<a href="">© 2023 Copyright:</a> <a href=""> &nbsp; Dyamanna H</a>
		</div>
		<!-- Copyright -->

	</footer>
	<!-- Footer -->



</body>
</html>
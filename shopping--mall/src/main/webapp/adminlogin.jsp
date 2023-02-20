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
<style type="text/css">
.img-icons {
	height: 600px;
	width: auto;
	background-color: #f8f8ec;
	border: 2px solid #e97117;
	padding: 2em;
	border-radius: 50%;
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	height: 5%;
	background-color: black;
	color: white;
	text-align: center;
}
</style>


<title>Admin Login Page</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
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
					href="index.jsp" role="button">Home</a>
			</form>
		</div>
	</nav>




	<form action="login" method="get">
		<section class="vh-100" style="background-color: white;">
			<div class="container py-5 h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col col-xl-10">
						<div class="card" style="border-radius: 1rem;">
							<div class="row g-0">
								<div class="col-md-6 col-lg-5 d-none d-md-block">
									<img
										src="https://luxuryproperties.in/wp-content/uploads/2019/05/Pheonix-One-Swimming-Pool.jpg"
										alt="login form" class="img-fluid img-icons"
										style="border-radius: 1rem 0 0 1rem" />
								</div>
								<div class="col-md-6 col-lg-7 d-flex align-items-center">
									<div class="card-body p-4 p-lg-5 text-black">



										<div class="d-flex align-items-center mb-3 pb-1">
											<i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i>
											<span class="h1 fw-bold mb-0">LOGIN</span>
										</div>

										<h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Please
											Enter Your Login and Password</h5>

										<div class="form-outline form-white mb-4">
											<label class="form-label" for="adminName">AdminName</label> <input
												type="text" name="adminName" id="adminName"
												class="form-control form-control-lg"
												placeholder="Enter name" value="${dto.adminName}" />

										</div>

										<div class="form-outline form-white mb-4">
											<label class="form-label" for="password">AdminPassword</label>
											<input type="password" name="password" id="password"
												class="form-control form-control-lg"
												placeholder="Enter password" value="${dto.password}" />

										</div>

										<div class="form-outline form-white mb-4">
											<label class="form-label" for="name">AdminMall</label> <select
												name="name">
												<option value="0">--SELECT--</option>

												<option value="Mantri">Mantri</option>
												<option value="Central">Central</option>
												<option value="Rockline">Rockline</option>
												<option value="Orion">Orion</option>
												<!-- 	 <option value="LuLu">LuLu</option>
    	 <option value="Gopalan">Gopalan</option>
     	  <option value="VegCity">VegCity</option>
       <option value="Forum">Forum</option>-->

											</select>

										</div>


										<p class="small mb-5 pb-lg-2">
											<a class="text-white-50" href="ResetPassword.jsp">Forgot
												password?</a>
										</p>

										<button class="btn btn-dark btn-lg btn-block" type="submit"
											value="login">Login</button>


										<p class="text-success" align="center">${message}</p>
										<p class="text-danger" align="center">${error}</p>
										<p class="text-danger" align="center">${error1}</p>




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
		<div class="footer" style="background-color: black;">
			<a href="">© 2023 Copyright:</a> <a href=""> &nbsp; Dyamanna H</a>
		</div>
		<!-- Copyright -->

	</footer>
	<!-- Footer -->


</body>
</html>
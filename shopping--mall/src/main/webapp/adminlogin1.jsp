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

<title>Admin Login Page</title>
<style type="text/css">
.text-align {
	text-align: left;
}

body {
	background-color: olive;
}
/*body{
background: linear-gradient(
to right,
red,
orange,
yellow
);*/
footer {
	background-color: black;
}
}
</style>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#"><img
			src="https://www.greenvironmentindia.com/wp-content/uploads/2021/06/orionmall.jpg"
			width="100" height="50"></a>
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
	<h1>&nbsp;Admin</h1>

	<form action="login" method="get">
		<section class="vh-100 gradient-custom">
			<div class="container py-5 h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-12 col-md-8 col-lg-6 col-xl-5">
						<div class="card bg-dark text-white" style="border-radius: 1rem;">
							<div class="card-body p-5 text-left">

								<div class="mb-md-5 mt-md-4 pb-5">

									<h2 class="fw-bold mb-2 text-uppercase">Login</h2>
									<p class="text-white-50 mb-5">Please enter your login and
										password!</p>

									<div class="form-outline form-white mb-4">
										<label class="form-label" for="adminName">AdminName</label> <input
											type="text" name="adminName" id="adminName"
											class="form-control form-control-lg" placeholder="Enter name"
											value="${dto.adminName}" />

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

									<button class="btn btn-outline-light btn-lg px-5" type="submit"
										value="login">Login</button>

								</div>
								<p class="text-success" align="center">${message}</p>
								<p class="text-danger" align="center">${error}</p>
								<p class="text-danger" align="center">${error1}</p>



							</div>
						</div>
					</div>
				</div>
			</div>
		</section>

	</form>


	<!-- Footer -->
	<footer class="page-footer font-small blue">

		<!-- Copyright -->
		<div class="footer-copyright text-center py-3">
			© 2023 Copyright: <a href="https://x-workz.in/"> Dyamanna H</a>
		</div>
		<!-- Copyright -->

	</footer>
	<!-- Footer -->
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

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart_Page</title>
<%@include file="all_component/allCss.jsp"%>
</head>
<body style="background-color: #f0f1f2">
	<%@include file="all_component/navbar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-md-6" style="margin-top:10px;">
				<div class="card">
					<div class="card-body">
					
						<h3 class="text-center text-success">Your selected Item</h3>
						<table class="table table-striped">
							<thead>
								<tr>
									<th scope="col">Fashion Name</th>
									<th scope="col">Size</th>
									<th scope="col">Price</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
														
							</tbody>
						</table>
					</div>
				</div>
			</div>



			<div class="col-md-6" style="margin-top: 10px;">
				<div class="card">
					<div class="card-body">
						
						<h3 class="text-center text-success">Your selected Item</h3>
						<form>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Email</label> <input type="email"
									class="form-control" id="inputEmail4" placeholder="Email">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Password</label> <input
									type="password" class="form-control" id="inputPassword4"
									placeholder="Password">
							</div>
						</div>

						

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Phone Number</label> <input type="number"
									class="form-control" id="inputEmail4">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Address</label> <input
									type="text" class="form-control" id="inputPassword4"
									>
							</div>
						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Landmark</label> <input type="text"
									class="form-control" id="inputEmail4">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">City</label> <input
									type="text" class="form-control" id="inputPassword4"
									>
							</div>
						</div>
						
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">State</label> <input type="text"
									class="form-control" id="inputEmail4">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Zip</label> <input
									type="text" class="form-control" id="inputPassword4"
									>
							</div>
						</div>
						
						<div class="form-group">
						<label>Payment Mode</label> 
						 
						<select class="form-control">
							<option>--Select--</option>
							<option>Cash on Delivery</option>
						</select>
						</div>
						
						
						<div class="text-center">
						<button class="btn btn-warnings">Order Now</button>
						<a href="index.jsp" class="btn btn-success">Continue Shopping</a>
						</div>
						
						</form>
					</div>


					
				</div>
			</div>

		</div>
	</div>
</body>
</html>
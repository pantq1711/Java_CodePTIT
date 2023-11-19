<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %> 
<%@ page import="com.DAO.*"%>
<%@ page import="com.DAO.FashionDAOImpl.*"%>
<%@ page import="com.entity.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.DB.*"%>
<%@ page import="com.DB.DBConnect.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fashion: Index</title>
<%@include file="all_component/allCss.jsp"%>
<style type="text/css">
.back-img {
	background: url("img/backg.jpg");
	height: 50vh;
	width: 100%;
	background-repeat: no-repeat;
	background-size: cover;
}

.crd-ho:hover {
	background: #fcf7f7;
}
</style>


</head>
<body style="background-color: #f7f7f7;">

<% User u = (User)session.getAttribute("userobj"); %>
	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid back-img">
		<h2 class="text-center text-danger">Fashion Management System</h2>

	</div>



	<!-- Start Recent Fashion -->
	<!-- Nguyen Quang Huong -->
	<div class="container">
		<h3 class="text-center">Recent Fashion</h3>
		<%
		FashionDAOImpl dao2 = new FashionDAOImpl(DBConnect.getConn());
		List<FashionDtls> list2 = dao2.getRecentFashions();
		for (FashionDtls b : list2) {
		%>
		<div class="row">
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="fashion/<%=b.getPhotoName()%>"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p><%=b.getFashionName()%></p>
						<p><%=b.getSize()%></p>
						<p>
							<%
							if (b.getFashionCategory().equals("Old")) {
							%>
							Categories:<%=b.getFashionCategory()%></p>
						<div class="row">
						<a href="view_fashions.jsp?fid=<%=b.getFashionId()%>">
							class="btn btn-success btn-sm ml-5">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%>
								<i class="fas fa-dollar-sign"></i></a>

						</div>
						<p>
							<%
							} else {
							%>
							Categories:<%=b.getFashionCategory()%></p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-1"><i
								class="fa-solid fa-cart-plus"></i> Add Cart</a> <a href="view_fashions.jsp?fid=<%=b.getFashionId()%>"
								class="btn btn-success btn-sm ml-1">View Details</a> <a href=""
								class="btn btn-danger btn-sm"><%=b.getPrice()%> <i
								class="fa-solid fa-dollar-sign"></i></a>
						</div>
						<%
						}
						%>



					</div>
				</div>

			</div>
		</div>

		<%
		}
		%>

		<div class="text-center mt-1">
			<a href="all_recent_book.jsp" class="btn btn-danger btn-sm text-white">View All</a>
		</div>


	</div>
	<!-- End Recent Fashion -->

	<hr>


	<!-- Start New Fashion -->
	<!-- Nguyen Quang Huong -->
	<div class="container">
		<h3 class="text-center">New Fashion</h3>
		<div class="row">

			<%
			FashionDAOImpl dao = new FashionDAOImpl(DBConnect.getConn());
			List<FashionDtls> list = dao.getNewFashion();
			for (FashionDtls b : list) {
			%>
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="fashion/<%=b.getPhotoName()%>"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p><%=b.getFashionName()%></p>
						<p><%=b.getSize()%></p>
						<p>
							Categories:<%=b.getFashionCategory()%></p>
						<div class="row">
						<% if(u == null)
							{%>
							<a href="login.jsp" class="btn btn-danger btn-sm ml-2">Add Cart</a>
							<%}else {
								%>
								<a href="cart?fid=<%=b.getFashionId()%>&&uid=<%=u.getId() %>" class="btn btn-danger btn-sm ml-2">Add Cart</a>
								<%
							}%>
								<a
								href="view_fashions.jsp?fid=<%=b.getFashionId()%>" class="btn btn-success btn-sm ml-1">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%>
								<i class="fa-solid fa-dollar-sign"></i></a>
						</div>
					</div>
				</div>
			</div>
			<%
			}
			%>



		</div>

	</div>
	<div class="text-center mt-1">
		<a href="all_new_fashion" class="btn btn-danger btn-sm text-white">View All</a>
	</div>


	<!-- End New Fashion -->

	<hr>

	<!-- Start Old Fashion -->

	<div class="container">
		<h3 class="text-center">Old Fashion</h3>
		<div class="row">
			<%
			FashionDAOImpl dao3 = new FashionDAOImpl(DBConnect.getConn());
			List<FashionDtls> list3 = dao3.getNewFashion();
			for (FashionDtls b : list) {
			%>
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="fashion/<%=b.getPhotoName()%>"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p><%=b.getFashionName()%></p>
						<p><%=b.getSize()%></p>
						<p>
							Categories:<%=b.getFashionCategory()%></p>
						<div class="row">
							<a href="" class="btn btn-success btn-sm ml-5">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%>
								<i class="fa-solid fa-dollar-sign"></i></a>
						</div>
					</div>
				</div>
			</div>
			<%
			}
			%>


		</div>
		<div class="text-center mt-1">
			<a href="all_new_fashion" class="btn btn-danger btn-sm text-white">View All</a>
		</div>


	</div>
	<!-- End Old Fashion -->

	<%@include file="all_component/footer.jsp"%>

</body>
</html>
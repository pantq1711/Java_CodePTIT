
<%@ page import="com.entity.*"%>
<%@ page import="java.util.List"%>
<%@ page import="com.DB.DBConnect"%>
<%@ page import="com.DAO.*"%>
<%@ page import="com.DAO.FashionDAOImpl.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Recent Fashion</title>
<%@ include file="all_component/allCss.jsp"%>
<style type="text/css">
.crd-ho:hover {
	background-color: #fcf7f7;
}
</style>
<title>All Recent Fashion</title>
<%@include file="all_component/allCss.jsp"%>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid">
		<div class="row p-3">
			<%
			

			            FashionDAOImpl dao = new FashionDAOImpl(DBConnect.getConn());
			            List<FashionDtls> list = dao.getAllOldFashion();
			            for (FashionDtls b : list) {
			%>
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="fashion/<%=b.getPhotoName()%>"
							style="width: 100px;" class="img-thumblin">
						<p><%=b.getFashionName()%></p>
						<p><%=b.getSize()%></p>
						<p>
							Categories:<%=b.getFashionCategory()%>
						</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a> <a
								href="" class="btn btn-danger btn-sm ml-1">View Details </a> <a
								href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%>
								<i class="fas fa-dollar-sign"></i></a>
						</div>
					</div>
				</div>
			</div>
			<%
        }
        %>

		</div>
	</div>
</body>
</html>

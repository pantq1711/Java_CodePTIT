<%-- 
    Document   : view_fashion
    Created on : Nov 14, 2023, 9:47:59 PM
    Author     : Anphan
--%>
<%@ page import="java.util.*"%>
<%@ page import="com.DAO.*"%>
<%@ page import="com.DAO.FashionDAOImpl.*"%>
<%@ page import="com.entity.*"%>
<%@ page import="com.DB.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_component/allCss.jsp"%>
</head>
<body style="background-color: #f0f1f2;">
	<%@include file="all_component/navbar.jsp"%>

	<%
    int bid=Integer.parseInt(request.getParameter("fid"));
    FashionDAOImpl dao=new FashionDAOImpl(DBConnect.getConn());
    FashionDtls b=dao.getFashionById(bid);
    %>

	<div class="container p-3">
		<div class="row">
			<div class="col-md-6 text-center p-5 border bg-white">
				<img src="fashion/<%=b.getPhotoName() %>"
					style="height: 150px; width: 100px"><br>
				<h4 class="mt-3">
					Fashion Name:<span class="text-success"><%=b.getFashionName() %>
					</span>
				</h4>
				<h4>
					Size Name:<span class="text-success"><%=b.getSize() %></span>
				</h4>
				<h4>
					Category:<span class="text-success"><%=b.getFashionCategory() %></span>
				</h4>
			</div>
			<div class="col-md-6 text-center p-5 border bg-white">
				<h2><%=b.getFashionName() %></h2>


				<%
              if ("Old".equals(b.getFashionCategory())){
              %>
				<h5 class="text-primary">Contact To Seller</h5>
				<h5 class="text-primary">
					<i class="far fa-envelope"></i> Email:
					<%=b.getEmail() %></h5>
				<% } %>
				<div class="row">
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fas fa-money-bill-wave fa-2x"></i>
						<p>Cash on Delivery</p>
					</div>
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fas fa-undo-alt fa-2x"></i>
						<p>Return Available</p>
					</div>
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fas fa-truck-moving fa-2x"></i>
						<p>Free Shipping</p>
					</div>

				</div>
				<% 
               if("Old".equals(b.getFashionCategory())) {
              %>
				<div class="text-center p-3">
					<a href="index.jsp" class="btn btn-success"><i
						class="fast fa-cart-plus"></i>Continue Shopping</a> <a href=""
						class="btn btn-danger"><i class="fast fa-dollar-sign"></i>200</a>
				</div>
				<%
              }else{
              %>
				<div class="text-center p-3">
					<a href="" class="btn btn-primary"><i class="fast fa-cart-plus"></i>
						Add Cart</a> <a href="" class="btn btn-danger"><i
						class="fast fa-dollar-sign"></i>200</a>
				</div>
				<%}
              %>

			</div>

		</div>
	</div>
</body>
</html>
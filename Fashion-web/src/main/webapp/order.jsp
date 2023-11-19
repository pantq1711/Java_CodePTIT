<%-- 
    Document   : User_address
    Created on : Nov 12, 2023, 11:27:16?AM
    Author     : Anphan
--%>

<%@page import="java.util.List"%>
<%@page import="com.entity.Fashion_Order"%>
<%@page import="com.DB.DBConnect"%>
<%@page import="com.DAO.FashionOrderDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Fashion</title>
<%@include file="all_component/allCss.jsp"%>
</head>

<body style="background-color: #f0f1f2;">
	<%@include file="all_component/navbar.jsp"%>

	<div class="container p-1">
		<h3 class="text-center text-primary">Your Order</h3>
		<table class="table table-striped mt-3">
			<thead class="bg-primary text-white">
				<tr>
					<th scope="col">Order ID</th>
					<th scope="col">Name</th>
					<th scope="col">Fashion Name</th>
					<th scope="col">Brand</th>
					<th scope="col">Price</th>
					<th scope="col">Payment Type</th>
				</tr>
			</thead>
			<tbody>
				<%
				FashionOrderDAOImpl dao = new FashionOrderDAOImpl(DBConnect.getConn());
				List<Fashion_Order> flist = dao.getAllOrder();
				for (Fashion_Order f : flist) {
				%>


				<tr>
					<th scope="row"><%=f.getOrderId()%></th>
					<td><%=f.getUserName()%></td>
					<td><%=f.getEmail()%></td>
					<td><%=f.getFullAdd()%></td>
					<td><%=f.getPhno()%></td>
					<td><%=f.getFashionName()%></td>
					<td><%=f.getSize()%></td>
					<td><%=f.getPrice()%></td>
					<td><%=f.getPaymentType()%></td>

				</tr>
				<%
				}
				%>

			</tbody>
		</table>

	</div>
</body>
</html>

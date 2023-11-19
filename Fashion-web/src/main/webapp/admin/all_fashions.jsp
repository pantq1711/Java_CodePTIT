<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %> 
<%@ page import="com.DAO.*"%>
<%@ page import="com.entity.*"%>
<%@ page import="com.DAO.FashionDAOImpl.*" %>
<%@ page import="java.util.*"%>
<%@ page import="com.DB.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin: All Fashions</title>
<%@include file="allCss.jsp" %>
</head>
<body>
	<%@include file="navbar.jsp" %>	
	<h3 class="text-center">Hello Admin</h3>

	<c:if test="${not empty succMsg }">
		<h5 class="text-center text-success">${succMsg }</h5>
		<c:remove var="succMsg" scope="session" />
	</c:if>
	<c:if test="${not empty failedMsg }">
		<h5 class="text-center text-dangers">${failedMsg }</h5>
		<c:remove var="failedMsg" scope="session" />
	</c:if>

	<table class="table table-striped" >
  		<thead class="bg-primary text-white">
   			 <tr>
   			 	  <th scope="col">Id</th>
			      <th scope="col">Image</th>
			      <th scope="col">Fashion Name</th>
			      <th scope="col">Size</th>
			      <th scope="col">Price</th>
			      <th scope="col">Fashion Categories</th>
			      <th scope="col">Fashion Status</th>
			      <th scope="col">Action</th>
			      
    		</tr>
  		</thead>
  		<!-- Nguyen Quang Huong -->
  		<tbody>
    		<%
    		FashionDAOImpl dao = new FashionDAOImpl(DBConnect.getConn()) ;
    		List<FashionDtls> list = dao.getAllFashions() ;
    		for (FashionDtls b : list){
    		%>	
    		<tr>
			      <td><%=b.getFashionId() %></td>
			      <td><img src="../fashion/<%=b.getPhotoName() %>"
			      	  style="width:50px ; height:50px ;"></td>
			      <td><%=b.getFashionName() %></td>
			      <td><%=b.getSize() %></td>
			       <td><%=b.getPrice() %></td>
			      <td><%=b.getFashionCategory() %></td>
			      <td><%=b.getStatus() %></td>
			      <td>
			      <a href="edit_fashions.jsp" class="btn btn-sm btn-primary"><i class="fas fa-edit"></i> Edit</a>
			      <a href="../delete?id=<%=b.getFashionId() %>" class="btn btn-sm btn-danger"><i class="fas fa-trash-alt"></i> Delete</a>
			      </td>
    		</tr>
    		<%
    		}
    		%>
    		
    		
  		</tbody>
	</table>
	
<div style="margin-top: 130px;">
		<%@include file="footer.jsp" %></div>	
	
</body>
</html>

<%@ page import="com.entity.*"%>
<%@ page import="java.util.List"%>
<%@ page import="com.DB.DBConnect"%>
<%@ page import="com.DAO.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Recent Fashion</title>
<%@ include file="all_component/allCss.jsp"%>
<style type="text/css">
.crd-ho:hover {
	background-color: #fcf7f7;
}
</style>
</head>
<body>

<%@ include file="all_component/navbar.jsp"%>

	<%
    User u = (User) session.getAttribute("useobj");
    %>

	<div class="container-fluid">
		<div class="row p-3">
			<%
            String ch = request.getParameter("ch");
            FashionDAOImpl dao2 = new FashionDAOImpl(DBConnect.getConn());
            List<FashionDtls> list2 = dao2.getFashionBySearch(ch);
            for (FashionDtls b : list2) {
            %>
			<div class="col-md-3">
				<div class="card crd-ho mt-2">
					<div class="card-body text-center">
						<img alt="" src="Fashion/<%=b.getPhotoName()%>"
							style="width: 100px; height: 150px" class="img-thumbnail">
						<p><%=b.getFashionName()%></p>
						<p><%=b.getSize()%></p>
						<p>
							Categories:<%=b.getFashionCategory()%></p>
						<div class="row">
							<% if (b.getFashionCategory().equals("Old")) { %>
							<a href="view_fashions.jsp?fid=<%=b.getFashionId()%>"
								class="btn btn-success btn-sm ml-5">View Details</a> <a href=""
								class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%> <i
								class="fas fa-rupee-sign"></i></a>
							<% } else { %>
							<% if (u == null) { %>
							<a href="login.jsp" class="btn btn-danger btn-sm ml-2">Add
								Cart</a>
							<% } else { %>
							<a href="cart?fid=<%=b.getFashionId()%>&&uid=<%=u.getId()%>"
								class="btn btn-danger btn-sm ml-2">Add Cart</a>
							<% } %>
							<a href="view_fashions.jsp?fid=<%=b.getFashionId()%>"
								class="btn btn-danger btn-sm ml-1">View Details</a> <a href=""
								class="btn btn-danger btn-sm"><%=b.getPrice()%> <i
								class="fas fa-rupee-sign"></i></a>
							<% } %>
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

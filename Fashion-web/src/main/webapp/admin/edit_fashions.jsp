<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %> 
<%@ page import="com.DAO.*" %>
<%@ page import="com.DAO.FashionDAOImpl.*" %>
<%@ page import="com.DB.*" %>
<%@ page import="com.entity.*" %>
<%@ page import="com.entity.FashionDtls.*" %>

<!DOCTYPE html>
<html>
<head>
<!-- Nguyen Quang Huong -->
<title>Admin: Add Fashions</title>
<%@include file="allCss.jsp" %>
</head>
<body style="background-color: #f0f2f2;">
	<%@include file="navbar.jsp" %>	
		<div class="container">
			<div class="row">
				<div class="col-md-4 offset-md-4">
					<div class="card">
						<div class="card-body">
							<h4 class="text-center">Edit Fashions</h4>
						
 <%
    int id = -1;
    try {
        id = Integer.parseInt(request.getParameter("id"));
    } catch (NumberFormatException e) {
        e.printStackTrace();
    }
    
    out.println("ID: " + id);

    FashionDAOImpl dao = new FashionDAOImpl(DBConnect.getConn());
    FashionDtls b = dao.getFashionById(id);
    %>
							
							<form action="../editFashions" method="post" >
								<input type="hidden" name="id" value="<%=b.getFashionId() %>">
								<div class="form-group">
									<label for="exampleInputEmail1">Fashion Name*</label>  <input name="fname" type="text" class="form-control"
									id="exampleInputEmail1" aria-describedy="emailHelp" value="<%=b.getFashionName()%>">
								</div>
								
								<div class="form-group">
									<label for="exampleInputEmail1">Size*</label>  <input name="size" type="text" class="form-control"
									id="exampleInputEmail1" aria-describedy="emailHelp" value=<%=b.getPrice() %>>
								</div>
								
								<div class="form-group">
									<label for="exampleInputEmail1">Price*</label>  <input name="price" type="number" class="form-control"
									id="exampleInputPassword1" value=<%=b.getPrice()%>> 
								</div>	
								
								
								<div class="form-group">
									<label for="inputState">Fashion Status</label> <select id="inputState" name="bstatus" class="form-control">
										<%
										if("Active".equals(b.getStatus())){
										%>
										<option value="Active">Active</option>
										<option value="Inactive">Inactive</option>
										<%
										} else{
										%>
										<option value="Inactive">Inactive</option>
										<option value="Active">Active</option>
										<%
										}
										%>
									</select>
								</div>
							
								<button type="submit" class="btn btn-primary">Add</button>
							
							</form>
						
						</div>
					</div>
				</div>
			</div>
		</div>

	<div style="margin-top: 130px;">
		<%@include file="footer.jsp" %></div>
	
</body>
</html>
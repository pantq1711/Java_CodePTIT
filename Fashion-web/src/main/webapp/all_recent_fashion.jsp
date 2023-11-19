<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %> 
<%@ page import="com.entity.*"%>
<%@ page import="java.util.List"%>
<%@ page import="com.DB.DBConnect"%>
<%@ page import="com.DAO.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Recent Fashion </title>
<%@include file="all_component/allCss.jsp"%>
<style type="text/css">
.crd-ho:hover{
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
                FashionDAOImpl dao2 = new FashionDAOImpl(DBConnect.getConn());
                List<FashionDtls> list2 = dao2.getAllRecentFashion();
                for (FashionDtls b : list2) {
                %>
                <div class="col-md-3">
                    <div class="card crd-ho mt-2">
                        <div class="card-body text-center">
                            <img alt="" src="Fashion/<%=b.getPhotoName()%>"
                                style="Width: 100px;height: 150x" class="img-thumblin">
                                <p><%=b.getFashionName()%></p>
                                <p><%=b.getSize()%></p>
                                <p>
                                    <%
                                    if(b.getFashionCategory().equals("Old")) {
                                    %>
                                    Categories:<%=b.getFashionCategory()%> </p>
                                <div class="row">
                                    <a href="" class="btn btn-success btn-sm ml-5">View Details</a>
                                    <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%><i
                                        class="fas fa-rupee-sign"></i></a>
                                </div>
                            <%
                            } else {
                            %>Categories:<%=b.getFashionCategory()%>
                            <div class="row">
                                <a href="" class="btn btn-danger btn-sm ml-1"> <i
                                    class="fas fa-cart-plus"></i> Add Cart
                                </a> <a href="" class="btn btn-danger btn-sm ml-1">View Details</a> 
                                <a href="" class="btn btn-danger btn-sm"><%=b.getPrice()%> <i
                                    class="fas fa-rupee-sign"></i></a>
                            </div>
                            <%
                            }
                            %>
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Admin: Add Fashions</title>
        <%@include file="allCss.jsp" %>
    </head>
    <body style="background-color: #f0f2f2;">
        <%@include file="navbar.jsp" %>	
        <c:if test="${empty userobj}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <div class="container">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="text-center">Add Fashions</h4>

                            <form action="../add_fashions" method="post" enctype="multipart/form-data">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Fashion Name*</label>
                                    <input name="fname" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                </div>

                                <div class="form-group">
                                    <label for="exampleInputEmail1">Size*</label>
                                    <input name="size" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                </div>

                                <div class="form-group">
                                    <label for="exampleInputEmail1">Price*</label>
                                    <input name="price" type="number" class="form-control" id="exampleInputPassword1"> 
                                </div>	

                                <div class="form-group">
                                    <label for="inputState">Fashion Categories</label>
                                    <select id="inputState" name="categories" class="form-control">
                                        <option selected>--select--</option>
                                        <option value="New">New Fashion</option>
                                    </select>
                                </div>

                                <div class="form-group">
                                    <label for="inputState">Fashion Status</label>
                                    <select id="inputState" name="status" class="form-control">
                                        <option selected>--select--</option>
                                        <option value="Active">Active</option>
                                        <option value="Inactive">Inactive</option>
                                    </select>
                                </div>

                                <div class="form-group">
                                    <label for="exampleFormControlFile1">Upload Photo</label>
                                    <input name="fimg" type="file" class="form-control-file" id="exampleFormControlFile1">
                                </div>

                                <button type="submit" class="btn btn-primary">Add</button>
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div style="margin-top: 130px;">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>

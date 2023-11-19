/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user.servlet;

/**
 *
// * @author Anphan
 */
import com.DAO.FashionDAOImpl;

import com.DB.DBConnect;
import com.entity.FashionDtls;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet("/add_old_fashion")
@MultipartConfig
public class AddOldFashion extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	try {
		
		String fashionName = req.getParameter("fname"); 
		String price =req.getParameter("price");
		String size= req.getParameter("size");
		String categories= "Old";
		String status= "Active";
		Part part= req.getPart("fimg");		
		String fileName= part.getSubmittedFileName();
		String useremail = req.getParameter("user");
		
		FashionDtls b = new FashionDtls(fashionName, price,size, categories, status,fileName,useremail);
		FashionDAOImpl  dao=  new FashionDAOImpl(DBConnect.getConn()); 
		
		
		
		
		
		 boolean f=  dao.addFashions(b);
		 
		 HttpSession 	session=req.getSession();
		 if(f) {
			 String path=  getServletContext().getRealPath("")+ "fashion" ;
				
				File file= new File(path);
				part.write(path + File.separator + fileName);
				
		 	session.setAttribute("succMsg","Fashion Add Sucessfully");
			 	resp.sendRedirect("sell_fashion.jsp");
		 }else {
			 session.setAttribute("failedMsg", "Something wrong on Server");
			 resp.sendRedirect("sell_fashion.jsp");
		 }
		 
	} catch (Exception e) {
		e.printStackTrace();
	}	
		
	
	}
	
}

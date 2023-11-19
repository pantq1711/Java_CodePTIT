
/**
 *
 * @author Anphan
 */
package com.admin.servlet;

import java.io.IOException ;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet ;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.FashionDAOImpl;
import com.DB.DBConnect;

@WebServlet("/delete")
public class FashionsDeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(req.getParameter("id")) ;
			
			FashionDAOImpl dao = new FashionDAOImpl(DBConnect.getConn()) ;
			boolean f = dao.deleteFashions(id);
			HttpSession session = req.getSession();			
			if(f) {
				session.setAttribute("succMsg","Fashion Delete Successsfully..") ;
				resp.sendRedirect("admin/all_fashions.jsp") ;
			} else {
				session.setAttribute("failedMsg", "Something wrong on server");
				resp.sendRedirect("admin/all_fashions.jsp");
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

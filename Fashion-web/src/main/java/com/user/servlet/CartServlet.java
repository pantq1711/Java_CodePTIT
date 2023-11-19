package com.user.servlet;

import java.io.IOException;
	

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.CartDAOImpl;
import com.DAO.FashionDAOImpl;
import com.DB.DBConnect;
import com.entity.Cart;
import com.entity.FashionDtls;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/cart")

public class CartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {	
            int fid = Integer.parseInt(req.getParameter("fid"));
            int uid = Integer.parseInt(req.getParameter("uid"));

            FashionDAOImpl dao = new FashionDAOImpl(DBConnect.getConn());
            FashionDtls f = dao.getFashionById(fid);

            Cart c = new Cart();
            c.setFid(fid);
            c.setUserId(uid);
            c.setFashionName(f.getFashionName());
            c.setSize(f.getSize());
            c.setPrice(f.getPrice());
            c.setTotalPrice(f.getPrice());

            CartDAOImpl dao2 = new CartDAOImpl(DBConnect.getConn());
            boolean check = dao2.addCart(c);

            HttpSession session = req.getSession();

            if (check) {
                session.setAttribute("addCart", "Fashion Added to cart");
                resp.sendRedirect("all_new_fashion.jsp");
            } else {
                session.setAttribute("failed", "Something Wrong on server");
                resp.sendRedirect("all_new_fashion.jsp");
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

}

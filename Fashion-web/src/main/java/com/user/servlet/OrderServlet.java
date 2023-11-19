package com.user.servlet;
import com.DAO.CartDAOImpl;
import com.DAO.FashionOrderDAOImpl;
import com.DB.DBConnect;
import com.entity.Cart;
import com.entity.Fashion_Order;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/order")
public class OrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            HttpSession session = req.getSession();
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("username");

            String email = req.getParameter("email");

            String phno = req.getParameter("phno");
            String address = req.getParameter("address");
            String landmark = req.getParameter("landmark");
            String city = req.getParameter("city");
            String state = req.getParameter("state");
            String pincode = req.getParameter("pincode");
            String paymentType = req.getParameter("paymentType");

            String fullAdd = address + "," + landmark + "," + city + "," + state + "," + pincode;

            CartDAOImpl dao = new CartDAOImpl(DBConnect.getConn());

            List<Cart> blist = dao.getFashionByUser(id);

            if (blist.isEmpty()) {
                session.setAttribute("failedMsg", "Add Item");
                resp.sendRedirect("checkout.jsp");
            } else {
                FashionOrderDAOImpl dao2 = new FashionOrderDAOImpl(DBConnect.getConn());

                Fashion_Order o = null;

                List<Fashion_Order> orderList = new ArrayList<Fashion_Order>();
                Random r = new Random();
                for (Cart c : blist) {
                    o = new Fashion_Order();
                    o.setOrderId(String.format("FASHION-ORD-%03d", r.nextInt(1000)));
                    o.setUserName(name);
                    o.setEmail(email);
                    o.setPhno(phno);
                    o.setFullAdd(fullAdd);
                    o.setFashionName(c.getFashionName());
                    o.setSize(c.getSize());
                    o.setPrice(c.getPrice() + "");
                    o.setPaymentType(paymentType);

                    orderList.add(o);
                }

                if ("noselect".equals(paymentType)) {
                    session.setAttribute("failedMsg", "Choose Payment Method");
                    resp.sendRedirect("checkout.jsp");
                } else {
                    boolean f = dao2.saveOrder(orderList);

                    if (f) {
                        resp.sendRedirect("order_success.jsp");
                    } else {
                        session.setAttribute("failedMsg", "Your Order Failed");
                        resp.sendRedirect("checkout.jsp");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

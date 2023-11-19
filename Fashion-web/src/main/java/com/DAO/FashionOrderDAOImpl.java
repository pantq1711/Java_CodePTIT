package com.DAO;

import com.entity.Fashion_Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FashionOrderDAOImpl implements FashionOrderDAO {

    private Connection conn;

    public FashionOrderDAOImpl(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public boolean saveOrder(List<Fashion_Order> blist) {
        boolean f = false;
        try {

            String sql = "insert into fashion_order(order_id, user_name, email, address, phno, fashion_name, size, price, payment_type) values(?,?,?,?,?,?,?,?,?)";
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement(sql);
            for (Fashion_Order b : blist) {
                ps.setString(1, b.getOrderId());
                ps.setString(2, b.getUserName());
                ps.setString(3, b.getEmail());
                ps.setString(4, b.getFullAdd());
                ps.setString(5, b.getPhno());
                ps.setString(6, b.getFashionName());
                ps.setString(7, b.getSize());
                ps.setString(8, b.getPrice());
                ps.setString(9, b.getPaymentType());
                ps.addBatch();
            }

            int[] count = ps.executeBatch();
            conn.commit();
            f = true;
            conn.setAutoCommit(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public List<Fashion_Order> getAllOrder() {
        List<Fashion_Order> list = new ArrayList<>();
        Fashion_Order o = null;

        try {
            String sql = "select * from fashion_order ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                o = new Fashion_Order();
                o.setId(rs.getInt(1));
                o.setOrderId(rs.getString(2));
                o.setUserName(rs.getString(3));
                o.setEmail(rs.getString(4));
                o.setFullAdd(rs.getString(5));
                o.setPhno(rs.getString(6));
                o.setFashionName(rs.getString(7));
                o.setSize(rs.getString(8));
                o.setPrice(rs.getString(9));
                o.setPaymentType(rs.getString(10));
                list.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Fashion_Order> getFashion(String email) {
        List<Fashion_Order> list = new ArrayList<>();
        Fashion_Order o = null;

        try {
            String sql = "select * from fashion_order where email=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                o = new Fashion_Order();
                o.setId(rs.getInt(1));
                o.setOrderId(rs.getString(2));
                o.setUserName(rs.getString(3));
                o.setEmail(rs.getString(4));
                o.setFullAdd(rs.getString(5));
                o.setPhno(rs.getString(6));
                o.setFashionName(rs.getString(7));
                o.setSize(rs.getString(8));
                o.setPrice(rs.getString(9));
                o.setPaymentType(rs.getString(10));
                list.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Fashion_Order> getFashion() {
        List<Fashion_Order> list = new ArrayList<>();
        Fashion_Order o = null;

        try {
            String sql = "select * from fashion_order";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                o = new Fashion_Order();
                o.setId(rs.getInt(1));
                o.setOrderId(rs.getString(2));
                o.setUserName(rs.getString(3));
                o.setEmail(rs.getString(4));
                o.setFullAdd(rs.getString(5));
                o.setPhno(rs.getString(6));
                o.setFashionName(rs.getString(7));
                o.setSize(rs.getString(8));
                o.setPrice(rs.getString(9));
                o.setPaymentType(rs.getString(10));
                list.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

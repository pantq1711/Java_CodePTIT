package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.Cart;
import com.entity.FashionDtls;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDAOImpl implements CartDAO {

    private Connection conn;


    public CartDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean addCart(Cart c) {
        boolean f = false;
        try {
            String sql = "insert into cart(fid,uid,fashionName,size,price,total_price) values(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getFid());
            ps.setInt(2, c.getUserId());
            ps.setString(3, c.getFashionName());
            ps.setString(4, c.getSize());
            ps.setString(5, c.getPrice());
            ps.setString(6, c.getTotalPrice());

            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    @Override
    public List<Cart> getFashionByUser(int userId) {
        List<Cart> list = new ArrayList<>();
        Cart c = null;
        double totalPrice = 0;
        try{
            String sql = "select * from cart where uid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,userId );
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                c = new Cart();
                c.setCid(rs.getInt(1));
                c.setFid(rs.getInt(2));
                c.setUserId(rs.getInt(3));
                c.setFashionName(rs.getString(4));
                c.setSize(rs.getString(5));
                c.setPrice(rs.getString(6));
                
                totalPrice = totalPrice + Double.parseDouble(rs.getString(7));
                c.setTotalPrice(Double.toString(totalPrice));
                
                list.add(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean deleteFashion(int fid, int uid, int cid) {
        boolean f=false;
        
        try{
            String sql="delete from cart where fid=? and uid=? and cid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, fid);
            ps.setInt(2, uid);
            ps.setInt(3, cid);
            
            int i=ps.executeUpdate();
            if(i == 1){
                f = true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
}

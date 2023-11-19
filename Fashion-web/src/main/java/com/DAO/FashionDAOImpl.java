package com.DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.FashionDtls;

public  class FashionDAOImpl implements FashionDAO {

    private Connection conn;

    public FashionDAOImpl(Connection conn) {
        super();
        this.conn = conn;

    }
    
    @Override
    public boolean addFashions(FashionDtls b) {
        boolean f = false;
        try {

            String sql = "insert into fashion_dtls(fashionName,price,fashionCategory,status,Size,photoName,email) values(?,?,?,?,?,?,?) ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, b.getFashionName());
            ps.setString(2, b.getPrice());
            ps.setString(3, b.getFashionCategory());
            ps.setString(4, b.getStatus());
            ps.setString(5, b.getSize());
            ps.setString(6, b.getPhotoName());
            ps.setString(7, b.getEmail());

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
    public List<FashionDtls> getAllFashions() {
        List<FashionDtls> list = new ArrayList<FashionDtls>();
        FashionDtls b = null;

        try {
            String sql = "select * from fashion_dtls";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                b = new FashionDtls();
                b.setFashionId(rs.getInt(1));
                b.setFashionName(rs.getString(2));
                b.setSize(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setFashionCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public FashionDtls getFashionById(int id) {
        FashionDtls b = null;
        try {
            String sql = "select * from fashion_dtls where fashionId=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                b = new FashionDtls();
                b.setFashionId(rs.getInt(1));
                b.setFashionName(rs.getString(2));
                b.setSize(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setFashionCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public boolean updateEditFashions(FashionDtls b) {
        boolean f = false;
        try {
            String sql = "update fashion_dtls set fashionName=?,Size=?,price=?,status=? where fashionId=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, b.getFashionName());
            ps.setString(2, b.getSize());
            ps.setString(3, b.getPrice());
            ps.setString(4, b.getStatus());
            ps.setInt(5, b.getFashionId());

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
    public boolean deleteFashions(int id) {
        boolean f = false;
        try {
            String sql = "delete from fashion_dtls where fashionId=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<FashionDtls> getNewFashion() {
        List<FashionDtls> list = new ArrayList<FashionDtls>();
        FashionDtls b = null;
        try {
            String sql = "select * from fashion_dtls where fashionCategory=? and status=? order by fashionId DESC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "New");
            ps.setString(2, "Active");
            ResultSet rs = ps.executeQuery();
            int i = 1;
            while (rs.next() && i <= 4) {
                b = new FashionDtls();
                b.setFashionId(rs.getInt(1));
                b.setFashionName(rs.getString(2));
                b.setSize(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setFashionCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public List<FashionDtls> getRecentFashions() {
        List<FashionDtls> list = new ArrayList<FashionDtls>();
        FashionDtls b = null;
        try {
            String sql = "select * from fashion_dtls where status=? order by fashionId DESC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Active");
            ResultSet rs = ps.executeQuery();
            int i = 1;
            while (rs.next() && i <= 4) {
                b = new FashionDtls();
                b.setFashionId(rs.getInt(1));
                b.setFashionName(rs.getString(2));
                b.setSize(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setFashionCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public List<FashionDtls> getOldFashions() {
        List<FashionDtls> list = new ArrayList<FashionDtls>();
        FashionDtls b = null;
        try {
            String sql = "select * from fashion_dtls where fashionCategory=? and status=? order by fashionId DESC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Old");
            ps.setString(2, "Active");
            ResultSet rs = ps.executeQuery();
            int i = 1;
            while (rs.next() && i <= 4) {
                b = new FashionDtls();
                b.setFashionId(rs.getInt(1));
                b.setFashionName(rs.getString(2));
                b.setSize(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setFashionCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    @Override
    public List<FashionDtls> getAllRecentFashion(){
        List<FashionDtls> list = new ArrayList<>();
        FashionDtls b = null;
        try{
            String sql = "select * from fashion_dtls where status=? order by fashionId DESC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Active");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                b = new FashionDtls();
                b.setFashionId(rs.getInt(1));
                b.setFashionName(rs.getString(2));
                b.setSize(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setFashionCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    @Override
    public List<FashionDtls> getAllNewFashion(){
        List<FashionDtls> list = new ArrayList<>();
        FashionDtls b = null;
        try{
            String sql = "select * from fashion_dtls where fashionCategory=? and status=? order by fashionId DESC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "New");
            ps.setString(2, "Active");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                b = new FashionDtls();
                b.setFashionId(rs.getInt(1));
                b.setFashionName(rs.getString(2));
                b.setSize(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setFashionCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    @Override
    public List<FashionDtls> getAllOldFashion(){
        List<FashionDtls> list = new ArrayList<>();
        FashionDtls b = null;
        try{
            String sql = "select * from fashion_dtls where fashionCategory=? and status=? order by fashionId DESC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Old");
            ps.setString(2, "Active");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                b = new FashionDtls();
                b.setFashionId(rs.getInt(1));
                b.setFashionName(rs.getString(2));
                b.setSize(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setFashionCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    @Override
    public List<FashionDtls> getFashionByOld(String email, String cate){
        List<FashionDtls> list = new ArrayList<>();
        FashionDtls b = null;
        try{
            String sql = "select * from fashion_dtls where fashionCategory=? and email=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cate);
            ps.setString(2, email);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                b = new FashionDtls();
                b.setFashionId(rs.getInt(1));
                b.setFashionName(rs.getString(2));
                b.setSize(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setFashionCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    @Override
    public boolean oldFashionDelete(String email, String cat, int id){
        boolean f = false;
        try{
            String sql = "delete from fashion_dtls where fashionCategory=? and email=? and fashionId=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cat);
            ps.setString(2, email);
            ps.setInt(3,id);
            
            int i = ps.executeUpdate();
            if(i == 1){
                f = true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    @Override
    public List<FashionDtls> getFashionBySearch(String ch){
        List<FashionDtls> list = new ArrayList<>();
        FashionDtls b = null;
        try {
            String sql = "select * from fashion_dtls where fashionName like ? or Size like ? or fashionCategory like ? and status=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+ch+"%");
            ps.setString(2, "%"+ch+"%");
            ps.setString(3, "%"+ch+"%");
            ps.setString(4, "Active");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                b = new FashionDtls();
                b.setFashionId(rs.getInt(1));
                b.setFashionName(rs.getString(2));
                b.setSize(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setFashionCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

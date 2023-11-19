package com.DAO;

import com.entity.Cart;
import com.entity.FashionDtls;
import java.util.*;

public interface CartDAO {
    
    public boolean addCart(Cart c);
    
    public List<Cart> getFashionByUser(int userId);
    
    public boolean deleteFashion(int fid, int uid, int cid);
    
}
package com.DAO;

import com.entity.Fashion_Order;
import java.util.*;

public interface FashionOrderDAO {

    public boolean saveOrder(List<Fashion_Order> b);
    
    public List<Fashion_Order> getAllOrder();

    public List<Fashion_Order> getFashion(String email);

    public List<Fashion_Order> getFashion();
}

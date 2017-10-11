package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.Order;
import com.hzyc.Zee.bean.Page;

public interface OrderMapper {
	public void insertOrder(Order order);
	public void deleteOrderById(int orderId);
	public void updateOrder(Order order);
	public Order getOrderById(int orderId);
	public ArrayList<Order> getOrderByPage(Page page);
	
}

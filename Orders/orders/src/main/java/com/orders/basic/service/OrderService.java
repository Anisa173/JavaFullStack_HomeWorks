package com.orders.basic.service;

import java.util.List;

import com.orders.basic.entity.Orders;

public interface OrderService {

	List<Orders> getAllOrders() throws Exception;

	Orders getOrdersById(Integer Id) throws Exception;

	Integer create(Orders orders) throws Exception;

	Object update(Integer OrderId, Orders orders) throws Exception;

	Integer delete(Integer OrderId, Orders orders) throws Exception;


}

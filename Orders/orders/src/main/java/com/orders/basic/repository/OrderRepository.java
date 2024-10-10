package com.orders.basic.repository;

import java.util.List;

import com.orders.basic.entity.Orders;

public interface OrderRepository {
	List<Orders> getAllOrders(String query) throws Exception;

	Orders getOrdersById(String query, Object... params) throws Exception;

	Integer create(String query,Object...params) throws Exception;;

	Integer update(String query,Object... params) throws Exception;

	Integer delete(String query,Object...params) throws Exception;

}

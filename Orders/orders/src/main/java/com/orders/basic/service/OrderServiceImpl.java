package com.orders.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.orders.basic.entity.Orders;
import com.orders.basic.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {
	private static final String ORDERS_ALL = "SELECT * FROM Orders";
	private static final String ORDERS_ID = "SELECT * FROM Orders WHERE OrderId = ?";
	private static final String ORDERS_ADD = "INSERT INTO Orders(OrderPrize ,OrderItems,OrderTimeC,OrderProcessed,Order_status) Values(?,?,?,?,?)";
	private static final String ORDERS_MODIFIER = "UPDATE Orders SET OrderPrize =?,OrderItems =? Where OrderId = ?";
	private static final String ORDERS_DELETED = "DELETE FROM Orders where OrderId = ?";
	@Autowired
	private final OrderRepository orderRepository;

	public OrderServiceImpl(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	@Override
	public List<Orders> getAllOrders() throws Exception {
		return orderRepository.getAllOrders(ORDERS_ALL);

	}

	@Override
	public Orders getOrdersById(Integer Id) throws Exception {
		return orderRepository.getOrdersById(ORDERS_ID, Id);

	}

	@Override
	public Integer create(Orders orders) throws Exception {
		return orderRepository.create(ORDERS_ADD, orders.getOrderItems(), orders.getOrderPrize(),
				orders.getOrderProcessed(), orders.getOrderTimeC(), orders.getOrderStatus());
	}

	@Override
	public Integer update(Integer OrderId, Orders orders) throws Exception {
		return orderRepository.update(ORDERS_MODIFIER, orders.getOrderPrize(), orders.getOrderItems(), OrderId);
	}

	@Override
	public Integer delete(Integer OrderId, Orders orders) throws Exception {
		return orderRepository.delete(ORDERS_DELETED, OrderId);
	}

}
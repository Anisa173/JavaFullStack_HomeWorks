package com.orders.basic;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import com.orders.basic.entity.Orders;
import com.orders.basic.service.OrderService;

public class OrdersBasicdemo implements CommandLineRunner {

	private final Logger log = LoggerFactory.getLogger(OrdersBasicdemo.class);
	private final OrderService orderService;

	public OrdersBasicdemo(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	@Override
	public void run(String... args) throws Exception {
		Orders orders = new Orders(4, 7000.00, 3, LocalDateTime.now(), LocalDateTime.now(), "PROCESSED");
		orderService.create(orders);
		log.info("{} ", orderService.getAllOrders());
		log.info("Order with OrderId = 1{} :", orderService.getOrdersById(1));
		Orders ord1 = orderService.getOrdersById(3);
		ord1.setOrderPrize(5200.00);
		ord1.setOrderItems(3);
		orderService.update(3, ord1);
		log.info("{} ", orderService.getAllOrders());
		orderService.delete(2, orders);
		log.info("{} ", orderService.getAllOrders());
	}

}

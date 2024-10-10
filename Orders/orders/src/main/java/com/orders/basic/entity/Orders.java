package com.orders.basic.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Orders {
	private Integer OrderId;
	private Double OrderPrize;
	private Integer orderItems;
	private LocalDateTime orderTimeC;// C-Confirmed -kur shtypim butoni "Konfirmo" apo "Submit"
	private LocalDateTime orderProcessed;// Kur klienti merr porosine ne dorë dhe skanohet kuponi ,porosia kalon ne
	// statusin processed
	private String OrderStatus;

	public Orders() {
		super();
	}

	public Orders(Integer OrderId, Double OrderPrize, Integer orderItems, LocalDateTime orderTimeC,
			LocalDateTime orderProcessed, String orderStatus) {
		this.setOrderId(OrderId);
		this.setOrderPrize(OrderPrize);
		this.setOrderItems(orderItems);
		this.setOrderTimeC(orderTimeC);
		this.setOrderProcessed(orderProcessed);

	}

	@Id
	public Integer getOrderId() {
		return OrderId;
	}

	public void setOrderId(Integer orderId) {
		this.OrderId = orderId;
	}

	@Column
	public Double getOrderPrize() {
		return OrderPrize;
	}

	public void setOrderPrize(Double orderPrize) {
		this.OrderPrize = orderPrize;
	}

	@Column
	public Integer getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Integer orderItems) {
		this.orderItems = orderItems;
	}

	@Column
	public LocalDateTime getOrderTimeC() {
		return orderTimeC;
	}

	public void setOrderTimeC(LocalDateTime orderTimeC) {
		this.orderTimeC = orderTimeC;
	}

	@Column
	public LocalDateTime getOrderProcessed() {
		return orderProcessed;
	}

	public void setOrderProcessed(LocalDateTime orderProcessed) {
		this.orderProcessed = orderProcessed;
	}

	@Column
	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.OrderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Orders[OrderId=" + OrderId + ",OrderPrize =" + OrderPrize + ",orderItems = " + orderItems
				+ ",orderTimeC = " + orderTimeC + ",orderProcessed =" + orderProcessed + ",OrderStatus =" + OrderStatus
				+ "]";
	}
}
package com.orders.basic.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.orders.basic.entity.Orders;

public class OrderRepositoryImpl implements OrderRepository {
	@Autowired
	public final JdbcTemplate jdbcTemplate;

	public OrderRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Orders> getAllOrders(String query) {
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Orders>(Orders.class));
	}

	@Override
	public Orders getOrdersById(String query, Object... params) {
		return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Orders.class), params);
	}

	@Override
	public Integer create(String query, Object... params) {
		return jdbcTemplate.update(query, params);
	}

	@Override
	public Integer update(String query, Object... params) {
		return jdbcTemplate.update(query, params);
	}

	@Override
	public Integer delete(String query, Object... params) {
		return jdbcTemplate.update(query, params);
	}

}

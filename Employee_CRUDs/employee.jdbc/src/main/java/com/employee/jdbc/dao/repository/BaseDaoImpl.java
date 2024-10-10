package com.employee.jdbc.dao.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.employee.jdbc.dao.entity.BaseEntity;

public abstract class BaseDaoImpl<T extends BaseEntity<?>, I extends Serializable> {
	private final Class<T> type;

	protected abstract JdbcTemplate getJdbcTemplate();

	public BaseDaoImpl(Class<T> type) {
		this.type = type;
	}

	public T getEmployeeById(String query, Object... params) throws Exception {
		return getJdbcTemplate().queryForObject(query, BeanPropertyRowMapper.newInstance(type), params);

	}

	public List<T> getAllEmployee(String query) throws Exception {
		return getJdbcTemplate().query(query, BeanPropertyRowMapper.newInstance(type));

	}

	public I create(String query, Object... params) throws Exception {
		@SuppressWarnings("unchecked")
		I i = (I) (Object) getJdbcTemplate().update(query, params);
		return i;
	}

	public I update(String query, Object... params) throws Exception {
		@SuppressWarnings("unchecked")
		I i = (I) (Object) getJdbcTemplate().update(query, params);
		return i;

	}

	public void delete(String query, Object... params) throws Exception {
		getJdbcTemplate().update(query, params);

	}

}
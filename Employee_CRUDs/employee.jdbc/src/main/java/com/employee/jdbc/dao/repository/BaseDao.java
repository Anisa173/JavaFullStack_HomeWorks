package com.employee.jdbc.dao.repository;

import java.io.Serializable;
import java.util.List;

import com.employee.jdbc.dao.entity.BaseEntity;

public interface BaseDao<T extends BaseEntity<?>, I extends Serializable> {

	T getEmployeeById(String query, Object... params) throws Exception;

	List<T> getAllEmployee(String query) throws Exception;

	I create(String query, Object... params) throws Exception;

	void delete(String query, Object... params) throws Exception;

	I update(String query, Object... params) throws Exception;

}

package com.employee.jdbc.dao.service;

import java.util.List;

import com.employee.jdbc.dao.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee() throws Exception;

	Employee getEmployeeById(Integer employeeId) throws Exception;

	Integer create(Employee params) throws Exception;

	Integer update(Integer employeeId, Employee empl) throws Exception;

	void delete(Integer employeeId, Employee empl) throws Exception;

}

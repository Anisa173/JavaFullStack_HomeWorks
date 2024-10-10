package com.employee.jdbc.dao.repository.Employee;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.employee.jdbc.dao.entity.Employee;
import com.employee.jdbc.dao.repository.BaseDaoImpl;

@Repository
public class EmployeeDaoImpl extends BaseDaoImpl<Employee, Integer> implements EmployeeDao {
	
	private final JdbcTemplate jdbcTemplate;

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		super(Employee.class);
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	protected JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate;
	}

//	@Override
//	public Employee getEmployeeById(String query, Integer employeeId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void delete(String query, Integer employeeId) {
//		// TODO Auto-generated method stub
//		
//	}

}

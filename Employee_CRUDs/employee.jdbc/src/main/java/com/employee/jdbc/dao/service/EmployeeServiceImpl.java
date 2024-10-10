package com.employee.jdbc.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.jdbc.dao.entity.Employee;
import com.employee.jdbc.dao.repository.Employee.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private static final String EMPLOYEE_ID = " Select * from Employee Where employeeId = ? ";
	private static final String EMPLOYEE_ALL = " Select * from Employee ";
	private static final String ADD_EMPLOYEE = "Insert into Employee(nId,nameEsurname,empSalary,position,birthday,address) Values(?,?,?,?,?,?) ";
	private static final String MODIFY_EMPLOYEE = "Update Employee Set empSalary = ?, position =? , address = ? where employeeId = ? ";
	private static final String DELETE_EMPLOYEE = "Delete from Employee Where employeeId = ? ";

	@Autowired
	private final EmployeeDao daoRepository;

	public EmployeeServiceImpl(EmployeeDao daoRepository) {
		super();
		this.daoRepository = daoRepository;
	}

	public Employee getEmployeeById(Integer employeeId) throws Exception {
		return daoRepository.getEmployeeById(EMPLOYEE_ID, employeeId);
	}

	public List<Employee> getAllEmployee() throws Exception {
		return daoRepository.getAllEmployee(EMPLOYEE_ALL);
	}

	public Integer create(Employee emp) throws Exception {
		return daoRepository.create(ADD_EMPLOYEE, emp.getnId(), emp.getNameEsurname(), emp.getEmpSalary(),
				emp.getPosition(), emp.getBirthday(), emp.getAddress());

	}

	public Integer update(Integer employeeId, Employee emp) throws Exception {
		return daoRepository.update(MODIFY_EMPLOYEE, emp.getEmpSalary(), emp.getPosition(), emp.getAddress(),
				employeeId);

	}

	public void delete(Integer employeeId, Employee empl) throws Exception {
		daoRepository.delete(DELETE_EMPLOYEE, employeeId);
	}
}

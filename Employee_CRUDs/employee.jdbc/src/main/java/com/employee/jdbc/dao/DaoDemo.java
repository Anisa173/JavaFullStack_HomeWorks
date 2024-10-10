package com.employee.jdbc.dao;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.employee.jdbc.dao.entity.Employee;
import com.employee.jdbc.dao.service.EmployeeService;

@Component
public class DaoDemo implements CommandLineRunner {
	private final Logger log = LoggerFactory.getLogger(DaoDemo.class);
	private final EmployeeService empService;

	public DaoDemo(EmployeeService empService) {
		super();
		this.empService = empService;
	}

	@Override
	public void run(String... args) throws Exception {
		Employee empl = new Employee(1, "J2537890P", "Anisa Cela", 3000.00, "position", LocalDateTime.now(),
				"Nikolla Tupja ,Tirane");
		empService.create(empl);
		log.info("{}", empService.getAllEmployee());
		log.info("Employee with employeeId = 1 :", empService.getEmployeeById(1));
		Employee em1 = empService.getEmployeeById(3);
		em1.setEmpSalary(7200.00);
		em1.setPosition("positionX");
		em1.setAddress("zzz,Tirane");
		empService.update(3, em1);
		log.info("{} ", empService.getAllEmployee());
//		empService.delete(2, empl);
		log.info("{} ", empService.getAllEmployee());
	}

}

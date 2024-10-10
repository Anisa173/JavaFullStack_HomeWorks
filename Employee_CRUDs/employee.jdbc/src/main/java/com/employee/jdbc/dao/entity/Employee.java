
package com.employee.jdbc.dao.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee extends BaseEntity<Integer> {
	@Column
	@Id
	private Integer employeeId;
	@Column
	private String nId;
	@Column
	private String nameEsurname;
	@Column
	private Double empSalary;
	@Column
	private String position;
	@Column
	private LocalDateTime birthday;
	@Column
	private String address;

	public Employee() {

	}

	public Employee(Integer employeeId, String nId, String nameEsurname, Double empSalary, String position,
			LocalDateTime birthday, String address) {
		this.setEmployeeId(employeeId);
		this.setnId(nId);
		this.setNameEsurname(nameEsurname);
		this.setEmpSalary(empSalary);
		this.setPosition(position);
		this.setBirthday(birthday);
		this.setAddress(address);

	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getnId() {
		return nId;
	}

	public void setnId(String nId) {
		this.nId = nId;
	}

	public String getNameEsurname() {
		return nameEsurname;
	}

	public void setNameEsurname(String nameEsurname) {
		this.nameEsurname = nameEsurname;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public LocalDateTime getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String toString() {
		return "Employee [employeeId =" + employeeId + ",nId = " + nId + ",nameEsurname = " + nameEsurname
				+ ",empSalary = " + empSalary + ",position = " + position + ",birthday = " + birthday + ",address = "
				+ address + "]";
	}

	@Override
	public Integer getId() {
		return employeeId;

	}

}

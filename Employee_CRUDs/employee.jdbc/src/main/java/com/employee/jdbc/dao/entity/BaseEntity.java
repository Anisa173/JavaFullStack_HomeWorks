package com.employee.jdbc.dao.entity;

import java.io.Serializable;

public abstract class BaseEntity<I extends Serializable> {
	public abstract I getId();
}

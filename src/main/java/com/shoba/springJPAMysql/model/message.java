package com.shoba.springJPAMysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="message")
public class message {

	@Id
	@GeneratedValue
	@Column(name="id")
	public Integer id;
	@Column(name="dept")
	public String dept;
	@Column(name="name")
	public String name;
	
	public message()
	{
		
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

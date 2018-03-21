package com.shoba.springJPAMysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="accounts")
public class accounts {

	@Id
	@GeneratedValue
	@Column(name="id")
	public Integer id;
	@Column(name="account_number")
	public String account_number;
	@Column(name="balance")
	public Integer balance;
	
	public accounts()
	{
				
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	
	
	
}

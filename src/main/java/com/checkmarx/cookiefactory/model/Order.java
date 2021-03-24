package com.checkmarx.cookiefactory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Order {
	private long id;
	private int amount;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(long id, int amount) {
		super();
		this.id = id;
		this.amount = amount;
	}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "amount")
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", amount=" + amount + "]";
	}	
}

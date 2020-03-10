package com.test.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="firstIn")
	private String firstIn;
	
	@Column(name="lastOut")
	private String lastOut;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstIn() {
		return firstIn;
	}
	public void setFirstIn(String firstIn) {
		this.firstIn = firstIn;
	}
	public String getLastOut() {
		return lastOut;
	}
	public void setLastOut(String lastOut) {
		this.lastOut = lastOut;
	}
	

	
}

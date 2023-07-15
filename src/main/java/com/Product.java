package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	private int pId;
	private String name;
	private int price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product( String name, int price) {
		super();
		
		this.name = name;
		this.price = price;
	}
	
	@Id      //for primarykey
	@GeneratedValue   //auto increament
	@Column(name="P_id")   //name change
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", name=" + name + ", price=" + price + "]";
	}
	
	

}

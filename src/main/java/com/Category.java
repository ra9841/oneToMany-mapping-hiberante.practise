package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity    //create a table
public class Category {
	private int cid;
	private String name;
	List<Product> listofproducts;  //Hp,Lenova,Dell(these are number of products belonging to one category
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category( String name, List<Product> listofproducts) {
		super();
		
		this.name = name;
		this.listofproducts = listofproducts;
	}
	
	
	@Id        //primarykey
	@Column(name="c_Id")    //change column name cid
	@GeneratedValue         //autogenetated  cid value
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="c_Id")
	public List<Product> getListofproducts() {
		return listofproducts;
	}
	public void setListofproducts(List<Product> listofproducts) {
		this.listofproducts = listofproducts;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", name=" + name + ", listofproducts=" + listofproducts + "]";
	}
	
	
	
	

}

package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		//----------------------------
				SessionFactory sf= new Configuration().configure().buildSessionFactory();		
				// obtains the session
				Session session = sf.openSession();
				session.beginTransaction();
			    //--------------------------
				
			/*	Product p1=new Product("Hp",500);
				Product p2=new Product("Dell",700);
				Product p3=new Product("Apple",1000);
				Product p4=new Product("Lenovo",800);
				
			   List<Product> listofproduct=new ArrayList<>(); //blank arraylist for number of product
			              listofproduct.add(p1);
			              listofproduct.add(p2);
			              listofproduct.add(p3);
			              listofproduct.add(p4);
				
				Category c1=new Category("Laptop",listofproduct);
				session.save(c1);
				*/
				Product p5=new Product("Nokia",500);
				Product p6=new Product("Samsung",800);
				Product p7=new Product("Apple",1200);
			
				
			   List<Product> listofproduct=new ArrayList<>(); //blank arraylist for number of product
			              listofproduct.add(p5);
			              listofproduct.add(p6);
			              listofproduct.add(p7);
			             
				
				Category c2=new Category("Mobile",listofproduct);
				session.save(c2);
				
				
				
				
				
				//------------	
					session.getTransaction().commit();
					session.close();
							
					//-----------------------
						

	}

}

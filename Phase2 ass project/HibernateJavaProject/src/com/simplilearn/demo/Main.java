package com.simplilearn.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class Main {
	
	public static void main(String[] args) {
		
		StandardServiceRegistry registry=  new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		
		Metadata metadata=  new MetadataSources(registry).getMetadataBuilder().build();
		
		//connection pool
		SessionFactory factory= metadata.getSessionFactoryBuilder().build();
		//let's take  database connection to  do transaction
		
		//prepare one database in mysql with name Student before  executing below command
		
		 
		
		//let's take  database connection to do transection
				//prepare one databse in mysql with name  Student_hibernate before execution of below command
				
				Session session= factory.openSession();
				
				Student s1=new Student();
				s1.setName("Nikunj Soni");
				s1.setEmail("nikunj@123");
				s1.setPassword("Nikunj@123");
				
				Transaction tx= session.beginTransaction();
				session.save(s1);
				
				tx.commit();
				//automatically  prepare  the table and insert the data automatically
				
				session.close();
				factory.close();
				System.out.println("Data Inserted Succesfully");
			 
		 
		
	}

}

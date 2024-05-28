package com;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MobileMain {
	
	public static void main(String[] args) {
		
		
		//----------------------------
				SessionFactory sf= new Configuration().configure().buildSessionFactory();		
				// obtains the session
				Session session = sf.openSession();
				session.beginTransaction();  //read   write
				//-------------------------
				
				
				Mobile mb=new Mobile(1300,"Samsung","Pink",42342);
				session.save(mb); 
				
				Mobile mb2=new Mobile(900,"Motorola","Black",3131);
				session.save(mb2); 
				
				Mobile mb3=new Mobile(3000,"Apple","White",75547);
				session.save(mb3); 
				
				//today is thursday
				
				
			
				
				//-------------
				session.getTransaction().commit();
				session.close();
				//--------------
	}

}

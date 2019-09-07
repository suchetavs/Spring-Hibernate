package com.hibernate.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.classes.*;;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
			
		Session session=sessionFactory.getCurrentSession();
		
		try {
	
		Instructor tempInstructor=new Instructor("Aiman","Hanna","aimanhanna@concordia.ca");
		
		InstructorDetail tempInstructorDetail=new InstructorDetail("ahana.com","teaching");
		

		tempInstructor.setInstructorDetail(tempInstructorDetail);
				
		session.beginTransaction();
		
		session.save(tempInstructor);
		
		session.getTransaction().commit();
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
		finally {
			sessionFactory.close();
		}
		
	}

}

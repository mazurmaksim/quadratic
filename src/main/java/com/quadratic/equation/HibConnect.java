package com.quadratic.equation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibConnect {

	Session session;

	public Session getSession() {
		return session;
	}

		public HibConnect() {
			try {
				StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
				SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
				session = sessionFactory.openSession();
				session.beginTransaction();
			}catch (Exception e) {
				System.out.println(e.getMessage() + e);
			}

		}


}

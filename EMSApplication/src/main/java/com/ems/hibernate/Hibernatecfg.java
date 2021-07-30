package com.ems.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ems.model.*;

public class Hibernatecfg {

	
	public Session configureHibernate() {
		
		
		Configuration cfgConfiguration = new Configuration();
        SessionFactory sfcFactory = cfgConfiguration.addAnnotatedClass(Employee.class).configure().buildSessionFactory();
        Session session = sfcFactory.openSession();
        
        
        return session;
        
        
	}
	
	
}

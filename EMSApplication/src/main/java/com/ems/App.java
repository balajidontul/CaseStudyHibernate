package com.ems;

import com.ems.view.EmpUI;
import java.util.Scanner;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.ems.dao.*;
import com.ems.hibernate.Hibernatecfg;
/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
    	
    	Hibernatecfg hibernatecfg = new Hibernatecfg();
    	Session session = hibernatecfg.configureHibernate();
    	
        EmpUI empUI = new EmpUI();
        empUI.Displayfunction(session);
        
       
        
    }  
       
}

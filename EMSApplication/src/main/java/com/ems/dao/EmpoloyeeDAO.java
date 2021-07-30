package com.ems.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ems.model.Employee;
import com.ems.view.*;

public class EmpoloyeeDAO {
		
	EmpUI empUI = new EmpUI();
	
	Scanner scanner ;
	public void NewEmployee(Session session){
		
		scanner = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Enter Employee ID");
		employee.setEmpid(scanner.nextInt());
		
		System.out.println("Enter Employee Name");
		employee.setName(scanner.next());
		
		System.out.println("Enter Employee Age");
		employee.setAge(scanner.nextInt());
		
		System.out.println("Enter Employee City");
		employee.setCity(scanner.next());
		
		Transaction tx=session.beginTransaction();
        session.save(employee);
        tx.commit();
        
        empUI.Displayfunction(session);
	}
	
	
	public void getEmployee(int empno,Session session){
		
		 Employee employee = session.get(Employee.class, empno);
		 System.out.println(employee.toString());
		
	}
	
	
	
	public void getAllEmployees(Session session){
		
		List<Employee> employees = session.createQuery("from Employee").list();
      
		for(Employee d1: employees)
      {
          System.out.println(d1);
      }
		
		
	}
	
	
	
	public void updateEmployee(Employee e){
		
}
	
	public void deleteEmployee(int empno) {
		
	}
}

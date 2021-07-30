package com.ems.view;

import java.util.Scanner;

import org.hibernate.Session;

import com.ems.dao.*;
import com.ems.model.Employee;

import oracle.net.aso.e;

public class EmpUI {

	
	
    public void Displayfunction(Session session ) {
    	System.out.println("         EMS\r\n"
    			+ "    ------------------------------\r\n"
    			+ "    1.New Employee\r\n"
    			+ "    2.Edit Employee\r\n"
    			+ "    3.Delete Employee\r\n"
    			+ "    4.View All Employees\r\n"
    			+ "    5.Exit ( Enter Your choice ):");
    	
  
    	
    	Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
    	 EmpoloyeeDAO empoloyeeDAO = new EmpoloyeeDAO();
         
         switch (index) {
         
         
 		case 1:
 			
 			empoloyeeDAO.NewEmployee(session);
 			break;
 		case 2:
 			empoloyeeDAO.updateEmployee(null);
 			break;
 			
 		case 3:
 			empoloyeeDAO.deleteEmployee(index);
 			break;
 			
 		case 4:
 			empoloyeeDAO.getAllEmployees(session);
 			break;
 			
 		case 5:
 			session.close();
 			System.exit(0);
 			break;
 			
 		default:
 			break;
 		}
     }
    	
    	
    
    }
    
    
    
    
    


package com.ems.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Employee implements Serializable{

	
	
	
	
	@Id
	@Column(name="EMPID")
	private int empid ;
	
	@Id
	@Column(name="NAME")
	private String name ;
	
	@Id
	@Column(name="AGE")
	private int age ;
	
	@Id
	@Column(name="CITY")
	private String city ;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public Employee(int empid, String name, int age, String city) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "EmployeePOJO [empid=" + empid + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}

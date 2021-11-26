package com.lab6.assignments;

import java.util.HashMap;
import java.util.Map;

public class Employee {
		String name;
		double salary;
		Integer Id;
		String designation;
		String insuranceScheme;
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(String name, double salary, Integer id, String designation) {
			super();
			this.name = name;
			this.salary = salary;
			Id = id;
			this.designation = designation;
			this.insuranceScheme = getInsuranceScheme(this.salary);
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Integer getId() {
			return Id;
		}

		public void setId(Integer id) {
			Id = id;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getInsuranceScheme() {
			return insuranceScheme;
		}

		public void setInsuranceScheme(String insuranceScheme) {
			this.insuranceScheme = insuranceScheme;
		}

		public String getInsuranceScheme(double salary) {
			// TODO Auto-generated method stub
			if(salary>5000 && salary<20000)
			{
				String scheme = "Scheme C";
				this.setInsuranceScheme(scheme);
				return scheme;
			}
			else if(salary>=20000 && salary<40000) {
				String scheme = "Scheme B";
				this.setInsuranceScheme(scheme);
				return scheme;
			}
			else if(salary>=40000)
			{
				String scheme = "Scheme A";
				this.setInsuranceScheme(scheme);
				return scheme;
			}
			else if(salary<5000)
			{
				String scheme = "No Scheme";
				this.setInsuranceScheme(scheme);
				return scheme;
			}
			
			return null;
		}
		
}

class EmployeeService{
	
	public static HashMap<Integer, Employee> empMap = new HashMap<>();
	public static int c = 0;
	
	public static void addEmployee(Employee emp)
	{
		empMap.put(emp.Id, emp);
	}
	
	public static boolean deleteEmployee(int id) {
		if(empMap.containsKey(id)) {
			empMap.remove(id);
			return true;
		}
		return false;
	}
	
	public static String showEmpDetails(String insuranceScheme) {
		for(Map.Entry<Integer, Employee> mapEntry : empMap.entrySet()) {
			Employee obj = (Employee) mapEntry.getValue();
			if(insuranceScheme.equals(obj.getInsuranceScheme(obj.salary))) {
				return "Name: " + obj.name + "Id: " + obj.Id + "Salary: " + obj.salary + "Desgination: " + obj.designation; 
			}
		}
		return null;
	}
	
}

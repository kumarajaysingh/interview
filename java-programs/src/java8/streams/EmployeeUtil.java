package java8.streams;

import java.util.ArrayList;
import java.util.List;

import java8.stream.model.Employee;

public class EmployeeUtil {
	
	public static List<Employee> getEmployeeList() {
		/*
		 * Employee e1 = new Employee(111, "Rohit", 50000, null, 1234567890); Employee
		 * e2 = new Employee(112, "Virat", 55000, null, 1234567890); Employee e3 = new
		 * Employee(113, "Sehwag", 58000, null, 1234567890); Employee e4 = new
		 * Employee(114, "Yuvraj", 61000, null, 1234567890); Employee e5 = new
		 * Employee(115, "Dhon1", 75000, null, 1234567890);
		 */
		
	//	List<Employee> list = new ArrayList<Employee>();
		//list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);
		return null;
	}
	
	public static List<Employee> getEmployeeList1() {
		Employee e1 = new Employee(111, "Rohit", 38, "Male", "IT", 2005, 50000.00);
		Employee e2 = new Employee(222, "Virat", 40, "Male", "IT", 2002, 59000.00);
		Employee e3 = new Employee(333, "Yuvraj", 48, "Male", "IT", 2000, 45000.00);
		Employee e4 = new Employee(444, "Dhoni", 45, "Male", "HR", 2001, 52000.00);
		
		Employee e5 = new Employee(555, "Sania", 48, "Female","Finance", 2005, 50000.00);
		
		Employee e6 = new Employee(666, "Sindhu", 32, "Female", "Finance", 2008, 35000.85);
		Employee e7 = new Employee(777, "bumrah", 22, "Male", "Network", 2005,120000.00);
		Employee e8 = new Employee(888,"shami", 22, "Male", "Network", 2005, 75000.00);
		Employee e9 = new Employee(999, "mithali raj", 22, "Female", "HR", 2012,45000.10);
		Employee e10 = new Employee(000, "shubhangi", 23, "Female", "HR", 2015, 34000.8);
		
		Employee e11 = new Employee(101,"Bunty", 39, "Male", "Marketing", 2005, 25000.00);
		Employee e12 = new Employee(202, "Babli", 32, "Female", "Marketing", 2012,61000.10);
		Employee e13 = new Employee(303, "Mehata", 43, "Male", "Marketing", 2015, 33000.8);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);
		list.add(e11);
		list.add(e12);
		list.add(e13);
		
		return list;
	}

}

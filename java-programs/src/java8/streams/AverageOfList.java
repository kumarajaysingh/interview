package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java8.stream.model.Employee;

public class AverageOfList {

	public static void main(String[] args) {

		Employee e1 = new Employee(111, "Rohit", 50000, null, 1234567890);
		Employee e2 = new Employee(112, "Virat", 55000, null, 1234567890);
		Employee e3 = new Employee(113, "Sehwag", 58000, null, 1234567890);
		Employee e4 = new Employee(114, "Yuvraj", 61000, null, 1234567890);
		Employee e5 = new Employee(115, "Dhon1", 75000, null, 1234567890);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);
		
		Double avgSalary = list.stream().mapToInt(n -> n.getSalary()).average().getAsDouble();
		System.out.println("Average Salary : "+avgSalary);
		System.out.println("==============================");
		List<Employee> list2 = list.stream().filter(emp -> emp.getSalary() > avgSalary).collect(Collectors.toList());
		
		for (Employee e : list2) {
			System.out.println(e.getName() +": "+e.getSalary());
		}
	}

}

/*
 * O/P: 
 * Average Salary : 59800.0 
 * ============================== 
 * Yuvraj: 61000
 * Dhon1: 75000
 */

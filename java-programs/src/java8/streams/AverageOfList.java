package java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import java8.stream.model.Employee;

public class AverageOfList {

	public static void main(String[] args) {

		List<Employee> list = EmployeeUtil.getEmployeeList1();
		
		Double avgSalary = list.stream().mapToDouble(n -> n.getSalary()).average().getAsDouble();
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

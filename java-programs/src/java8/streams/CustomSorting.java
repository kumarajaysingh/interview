package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java8.stream.model.Employee;

public class CustomSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = EmployeeUtil.getEmployeeList();
		
		List<Employee> sortList = list.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
		List<Employee> sortList1 = list.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())).collect(Collectors.toList());
		List<Employee> sortList2 = list.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).collect(Collectors.toList());
		
		for (Employee e : sortList) {
			System.out.println(e.getName() +": "+e.getSalary());
		}
		
		System.out.println("=====================================");
		
		 List<Integer> list1 = Arrays.asList(10,15,8,49,25,98,32);
		 
		 list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 
		 List<String> list11 = Arrays.asList("yuvraj", "rohit", "sachin", "dhoni", "sachon");
		 
		 list11.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 System.out.println("=====================================");
		 list11.stream().sorted().forEach(System.out::println);

	}

}

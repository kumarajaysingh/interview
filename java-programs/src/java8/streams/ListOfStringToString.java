package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.stream.model.Employee;
import java8.stream.model.Person;

public class ListOfStringToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Delhi", "Mumbai", "Kolkata", "Chennai");
		
		String str = list.stream().collect(Collectors.joining(","));
		
		//System.out.println(list);
		//System.out.println(str);
		
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(s -> s, String::length));
		
		for(String k : map.keySet()) {
			//System.out.println(k+ " ===> "+map.get(k));
		}
		
		
		List<Employee> empList = EmployeeUtil.getEmployeeList();
		
		String empName = empList.stream().map(e -> e.getName()).collect(Collectors.joining(", "));
		
		empList.forEach(e -> System.out.println(e.getName()));
		System.out.println("Employee Name==>"+empName);
		
	}

	}

package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

import java8.stream.model.Employee;

public class ListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<String> list = Arrays.asList("Delhi", "Mumbai", "Kolkata", "Chennai");
		
		System.out.println(list);
		
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(s -> s, String::length));
		
		Map<String, String> map1 = list.stream().collect(Collectors.toMap(s -> s, s -> s.toUpperCase()));
		
		for(String k : map.keySet()) {
			System.out.println(k+ " ===> "+map.get(k));
		}
		
		
		List<Employee> empList = EmployeeUtil.getEmployeeList1();
		
		Map<Integer, String> empMap = empList.stream().collect(Collectors.toMap(Employee:: getEmpId, Employee::getName));
		
		
		empMap.forEach((k, v) -> {
			System.out.println("ID:  "+ k+ "  <====>  Name:  "+v);
		});
		
	}


}

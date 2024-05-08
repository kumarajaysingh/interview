package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java8.stream.model.Employee;

public class StringFromStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = EmployeeUtil.getEmployeeList1();
		
		List<String> names = list.stream().filter(m -> m.getSalary() > 55000 && m.getSalary() < 70000).map(Employee::getName).collect(Collectors.toList());
				//.forEach(System.out::println);;
		
		System.out.println(names);
		
		String name = list.stream().map(e -> e.getName()).collect(Collectors.joining(","));
		System.out.println(name);
		//List<Employee> list11 = list.stream().filter(e -> e.getSalary() > 60000).map(n -> n.setPhone(000000)).collect(Collectors.toList());
		
        List<Employee> updatedEmployees = list.stream()
                .map(employee -> employee.getSalary() > 60000 ? new Employee(116, employee.getName(), employee.getAge(),"male", "boler", 2006, 10000.0) : employee)
                .collect(Collectors.toList());

        // Printing the updated list of employees
        updatedEmployees.forEach(System.out::println);
		
		for (Employee e : updatedEmployees) {
			
			System.out.println("name: "+e.getName()+"--- Salary: "+e.getSalary());
		}
		
		

	}

}

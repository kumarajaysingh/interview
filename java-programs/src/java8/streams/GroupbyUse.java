package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.stream.model.Employee;
import java8.stream.model.Person;

public class GroupbyUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//groupingByMthd();

		List<Employee> empList = EmployeeUtil.getEmployeeList1();

		Map<Integer, List<Employee>> empBySal = empList.stream().collect(Collectors.groupingBy(Employee::getAge));

		empBySal.forEach((k, v) -> {
			System.out.println("-----------------------------------------");
			
			System.out.println("Key: "+k);
			v.forEach(e -> System.out.println(e.getName()+"=="+e.getAge()));
		});

	}
	
	private static void groupingByMthd() {
		// TODO Auto-generated method stub
		
		 List<Person> people = Arrays.asList(
	                new Person("Alice", 25, "New York"),
	                new Person("Bob", 30, "London"),
	                new Person("Charlie", 25, "Paris"),
	                new Person("David", 30, "New York")
	        );
		 
		 String city = people.stream().map(p -> p.getCity()).distinct().collect(Collectors.joining(","));
		 System.out.println("CITY==>"+city);

	        // Group people by their age
	        Map<Integer, List<Person>> peopleByAge = people.stream()
	                .collect(Collectors.groupingBy(Person::getAge));

	        // Print the result
	        peopleByAge.forEach((age, group) -> {
	           // System.out.println("Age: " + age);
	           // group.forEach(person -> System.out.println("  " + person.getName() + " from " + person.getCity()));
	        });
	    }

}

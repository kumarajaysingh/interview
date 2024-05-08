package java8.streams;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import java8.stream.model.Employee;

public class StreamUtility {

	public static void main(String[] args) {

		List<Employee> empList = EmployeeUtil.getEmployeeList1();
		//1. how many male and female employee
		maleAndFemaleEmployee(empList);
		System.out.println("\n");
		
		//2. Print all the department name in the organization
		allDepartmentsName(empList);
		System.out.println("\n");
		
		//3. Average age of male and female employee
		avgAgeMaleAndFemale(empList);
		System.out.println("\n");
		
		//4. Highest paid employee
		highestPaidEmployee(empList);
		System.out.println("\n");
		
		//5. Get all the employee who joined after 2005
		employeJoinedAfter2005(empList);
		System.out.println("\n");
		
		//6. Get all the employee count, department wise
		departmentWiseEmployees(empList);
		System.out.println("\n");
		
		//7. Average Salary of each department
		avgSalaryByDept(empList);
		System.out.println("\n");
		
		//8. Youngest Male employee
		youngestMaleEmp(empList);
		System.out.println("\n");
		
		//9. Most working experience employee
		mostExperiencedEmp(empList);
		System.out.println("\n");
		
		//10. Number of Male & Female in Marketing department
		allEmpFromMarketing(empList);
		System.out.println("\n");
		
		//11. Average Salary of Male & Female Employee
		avgSalOfMaleAndFemale(empList);
		System.out.println("\n");
		
		//12. List down name of all employees from each department
		listOfEmployeeFromEachDept(empList);
		System.out.println("\n");
		
		//13.Average & Total salary of whole Organization
		avgAndTotalSalOfOrganization(empList);
		System.out.println("\n");
		
		//14.Average & Total salary of whole Organization
		partioneEmpByAge(empList);
		System.out.println("\n");
		
		/*
		 * //14.Employee less than 25 and greater than 25 age partioneEmpByAge(empList);
		 * System.out.println("\n");
		 */
		//15.Oldest Employee details
		oldestEmpDetails(empList);
		System.out.println("\n");


	}

	private static void oldestEmpDetails(List<Employee> empList) {
		
		System.out.println("Oldest Employee details : ");
		
		Employee oldEmp = empList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println("Employee Name: "+oldEmp.getName());
		System.out.println("Employee Department: "+oldEmp.getDepartment());
		System.out.println("Employee Salary: "+oldEmp.getSalary());
		System.out.println("Oldest Employee Age: "+oldEmp.getAge());
		
	}

	private static void partioneEmpByAge(List<Employee> empList) {
		
		System.out.println("Employee less than 25 and greater than 25 age : ");
		
		Map<Boolean, List<Employee>> partEmp = empList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() < 25));
		
		for(Entry<Boolean, List<Employee>> emp : partEmp.entrySet()) {
			
			if(emp.getKey()) {
				System.out.println("Employee age less than 25 : ");
				for(Employee e : emp.getValue()) {
					System.out.println(e.getName()+" : "+e.getAge());
				}
			} else {
				System.out.println("Employee age greater than 25 : ");
				for(Employee e : emp.getValue()) {
					System.out.println(e.getName()+" : "+e.getAge());
				}
			
				
			}
			
		}
		
		
	}

	private static void avgAndTotalSalOfOrganization(List<Employee> empList) {
		System.out.println("Average & Total salary of whole Organization...");
		
		DoubleSummaryStatistics summaryStatistics = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Total Salary : "+summaryStatistics.getSum());
		System.out.println("Average Salary : "+summaryStatistics.getAverage());
		System.out.println("getCount : "+summaryStatistics.getCount());
		System.out.println("getMax : "+summaryStatistics.getMax());
		System.out.println("getMin : "+summaryStatistics.getMin());
		System.out.println("getClass : "+summaryStatistics.getClass());
		Double sum =  empList.stream().map(Employee::getSalary).reduce((a, b) -> a+b).get();
		System.out.println(sum);
		
	}

	private static void listOfEmployeeFromEachDept(List<Employee> empList) {
		System.out.println(" List down name of all employees from each department...");
		
		Map<String, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		for(Entry<String, List<Employee>> emp : empMap.entrySet()) {
			System.out.println("Employees in "+emp.getKey()+ "  department: ");
			for(Employee e : emp.getValue()) {
				System.out.println(e.getName());
			}
		}
		
	}

	private static void avgSalOfMaleAndFemale(List<Employee> empList) {
		
		System.out.println("Average Salary of Male & Female Employee...");
		
	    Map<String, Double> avgSal = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble((Employee::getSalary))));
	    
		for(Entry<String, Double> emp : avgSal.entrySet()) {
			System.out.println(emp.getKey()+"  :  "+emp.getValue());
		}
		
	}

	private static void allEmpFromMarketing(List<Employee> empList) {
		System.out.println("Number of Male & Female in Marketing department...");
		
		Map<String, Long> markettingTeam = empList.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		for(Entry<String, Long> emp : markettingTeam.entrySet()) {
			System.out.println(emp.getKey()+"  :  "+emp.getValue());
		}
		
	}

	private static void mostExperiencedEmp(List<Employee> empList) {
		System.out.println("Most working experience employee...");
		Employee experEMp = empList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).get();
		System.out.println(experEMp.getName()+ " : "+ experEMp.getYearOfJoining());
	}

	private static void youngestMaleEmp(List<Employee> empList) {
		System.out.println("Youngest Male employee...");
		Employee yEMp = empList.stream().filter(emp -> emp.getGender().equalsIgnoreCase("Male")).sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary)).findFirst().get();
		Employee yEMp1 = empList.stream().filter(emp -> emp.getGender().equalsIgnoreCase("Male")).min(Comparator.comparing(Employee::getAge)).get();
		System.out.println(yEMp.getName()+ " : "+ yEMp.getAge());
		System.out.println(yEMp1.getName()+ " : "+ yEMp1.getAge());
	}

	private static void avgSalaryByDept(List<Employee> empList) {
		System.out.println("Average Salary of each department...");
		
		Map<String, Double> avgDeptSal = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		for(Entry<String, Double> emp : avgDeptSal.entrySet()) {
			System.out.println(emp.getKey()+"  :  "+emp.getValue());
		}
	}

	private static void departmentWiseEmployees(List<Employee> empList) {
		System.out.println("Employee count Department wise");
		
		Map<String, Long> empDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		//System.out.println("empDept==> "+empDept);
		
		for(Entry<String, Long> emp : empDept.entrySet()) {
			System.out.println(emp.getKey()+"  :  "+emp.getValue());
		}
		
	}

	private static void employeJoinedAfter2005(List<Employee> empList) {
		System.out.println("Employee who joined after 2005");
		empList.stream().filter(e -> e.getYearOfJoining() > 2005).map(emp -> emp.getName().toUpperCase()).forEach(System.out::println);
		
		String empls = empList.stream().filter(e -> e.getYearOfJoining() < 2008).map(Employee::getName).collect(Collectors.joining(" , "));
		System.out.println("empls : "+empls);
	}

	private static void highestPaidEmployee(List<Employee> empList) {
		
		System.out.println("Highest paid employee");
		
		Employee highSal = empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(highSal.getName());
		
	}

	private static void avgAgeMaleAndFemale(List<Employee> empList) {
		System.out.println("Average age of male and female employee");
		
		
	 	Map<String, Double> genderMap = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
	 	
	 		System.out.println(genderMap);
		
	}

	private static void allDepartmentsName(List<Employee> empList) {
		List<String> deptList = empList.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.toList());
		System.out.println("male and female employee count");
		System.out.println(deptList);
		//empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	private static void maleAndFemaleEmployee(List<Employee> empList) {
		
		System.out.println(" all the department name");
		
		
	 	Map<String, Long> genderMap = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	 	
	 		System.out.println(genderMap);
		
	}

}

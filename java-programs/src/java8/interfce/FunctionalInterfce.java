package java8.interfce;

import java.util.List;

import java8.stream.model.Employee;
import java8.streams.EmployeeUtil;

public class FunctionalInterfce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List<Employee> listOfEmp = EmployeeUtil.getEmployeeList();
		
		Runnable runable = () -> {
			listOfEmp.forEach(e -> System.out.println(Thread.currentThread().getName()+"  : "+e.getName()+"==>"+e.getSalary()));
		};
		
		Thread thread = new Thread(runable);
		
		thread.start();
		//Thread.sleep(2000);
		for(int i=1; i<10; i++) {
			
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}

	}

}

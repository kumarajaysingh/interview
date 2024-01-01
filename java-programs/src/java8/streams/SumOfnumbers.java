package java8.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfnumbers {

	public static void main(String[] args) {
		
		//List<Integer> numList = Arrays.asList(10, 11, 12,13,14,1,16,17,20);
		List<Integer> numList = Arrays.asList(10, 20,30,40);
		// TODO Auto-generated method stub
		Integer sum = numList.stream().reduce((num1, num2) -> num1+num2).get();
		System.out.println(sum);
		Double avg = numList.stream().mapToInt(n-> n).average().getAsDouble();
		System.out.println(avg);

	}

}

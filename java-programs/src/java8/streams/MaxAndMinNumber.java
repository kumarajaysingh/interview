package java8.streams;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(10, 220,30,40);
		Integer maxNum = numList.stream().max(Integer::compare).get();
		System.out.println(maxNum);
		Integer minNum = numList.stream().min(Integer::compare).get();
		System.out.println(minNum);
		
	}

}

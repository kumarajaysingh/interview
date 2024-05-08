package java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(10, 220,30,40);
		Integer maxNum = numList.stream().max(Integer::compare).get();
		System.out.println(maxNum);
		Integer minNum = numList.stream().min(Integer::compare).get();
		System.out.println(minNum);
		
		Integer max  = numList.stream().max((n1, n2) -> n1.compareTo(n2)).get();
		System.out.println(max);
		
		Integer min  = numList.stream().min((n1, n2) -> n1.compareTo(n2)).get();
		System.out.println(min);
		
		Integer max1  = numList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max1);
	}

}

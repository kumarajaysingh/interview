package java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondHighest {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(10, 5,1,7,13, 20,10,40,13,5,1);
		
		Optional<Integer> sortList = numList.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst();

		System.out.println(sortList.get());
		System.out.println("=====================================");
		
		Integer lowest = numList.stream().sorted().distinct().skip(1).findFirst().get();

		System.out.println(lowest);
		System.out.println("=====================================");
		
		List<Integer> list = numList.stream().limit(3).toList();
		System.out.println(list);
		
		List<Integer> list1 = numList.stream().sorted().distinct().limit(3).toList();
		System.out.println(list1);
		
		List<Integer> list2 = numList.stream().sorted(Collections.reverseOrder()).distinct().limit(3).toList();
		System.out.println(list2);
		
	}

}

/*
 *
 * output: 
 * 20 
 * ===================================== 
 * 5
 * ===================================== 
 *  [10, 5, 1]
 *  [1, 5, 7]
	[40, 20, 13]
 */

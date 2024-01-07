package java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[][] array = { { 4, 7 }, { 2 }, { 6, 2 }, { 8 } };

		List<Integer[]> list = Arrays.asList(array);

		int[] num2 = new int[] { 1, 2, 3 };

		System.out.println(num2[2]);
		System.out.println("==============================");

		List<Integer> sortedList = list.stream().flatMap(Arrays::stream).collect(Collectors.toList());
		List<Integer> sortedList1 = list.stream().flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		List<Integer> sortedList2 = list.stream().flatMap(Arrays::stream).sorted().distinct()
				.collect(Collectors.toList());

		System.out.println(sortedList);
		System.out.println(sortedList1);
		System.out.println(sortedList2);
		System.out.println("==============================");

		List<Integer> list1 = Arrays.asList(2, 5, 7, 8);
		List<Integer> list2 = Arrays.asList(12, 15, 17, 13);
		
		Stream.of(list1, list2).flatMap(Collection::stream).forEach(System.out::println);
		System.out.println("==============================");
		
		List<Integer> fMap = Stream.of(list1, list2).flatMap(l -> l.stream()).collect(Collectors.toList());
		
		for (Integer i : fMap) {
			System.out.print(i+ "  ");
		}

	}

}

/*
 * O/P:
 * 
 * 3 
 * ============================== 
 * [4, 7, 2, 6, 2, 8] 
 * [4, 7, 2, 6, 8] 
 * [2, 4, 6, 7, 8] 
 * ============================== 
 * 2 5 7 8 12 15 17 13
 * ============================== 
 * 2 5 7 8 12 15 17 13
 */

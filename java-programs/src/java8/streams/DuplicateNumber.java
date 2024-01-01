package java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(10, 5,1,7,13, 20,10,40,13,5,1);
		
		Set<Integer> duplicate = numList.stream().filter(n -> Collections.frequency(numList, n) > 1).collect(Collectors.toSet());
		
		System.out.println(duplicate);
		
	

	}

}

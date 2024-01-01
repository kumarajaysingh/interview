package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
         list.stream()
             .filter(n -> n%2 == 0)
             .forEach(System.out::println);
         
         System.out.println("==============================");
			/*
			 * list.stream().filter(n -> (n%2==0 && n>10) ).collect(Collectors.toList());
			 */
         
         list.stream().filter(n -> 
    	 (n%2==0 && n>=10)
     ).forEach(System.out::println);
     }


}
/*
output:
	10
	8
	98
	32
	==============================
	10
	98
	32

*/
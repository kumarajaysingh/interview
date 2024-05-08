package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfnumbers {

	public static void main(String[] args) {
		
		//List<Integer> numList = Arrays.asList(10, 11, 12,13,14,1,16,17,20);
		List<Integer> numList = Arrays.asList(10, 20,30,40);
		// TODO Auto-generated method stub
		Integer sum = numList.stream().reduce((num1, num2) -> num1+num2).get();
		System.out.println(sum);
		Double avg = numList.stream().mapToInt(n-> n).average().getAsDouble();
		System.out.println(avg);
		
		Integer sum1 = numList.stream().filter(n -> n%2==0).reduce((a,b) -> a+b).get();
		System.out.println(sum1);
		
		
		
		List<String> listObject = Arrays.asList("Ross", "Chandler", "CSS",
                "Monica", "Joey", "Rachel");

        listObject.stream().map(eachStringOfList -> eachStringOfList.toUpperCase())
                .forEach(eachStringOfList -> System.out.print(eachStringOfList + " "));
        
        
        String input = "My name is Usmani. What is your Name?";

        // convert string into stream
        Map< Character, Long > result = input
               // .chars().mapToObj(c -> (char) Character.toUpperCase(c))
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });

	}

}

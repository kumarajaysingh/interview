package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashmapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Iterate over the HashMap using forEach and lambda expression
        System.out.println("Iterating using forEach and lambda:");
       // hashMap.forEach((key, value) -> System.out.println(key + ": " + value));
     //   hashMap.forEach((key, value) -> Collections.sort(value));

	}

}

package java8.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstCharacterUpperInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "my name is ajay and i am an engineer";
		
		String result = Arrays.stream(str.split("\\s+")).map(w -> Character.toUpperCase(w.charAt(0))+w.substring(1)).collect(Collectors.joining(" "));
		System.out.println(str);
		System.out.println("==========================================");
		System.out.println(result);
		
		String res = "";
		
		String[] arr = str.split(" ");
		
		for (String s : arr) {
			res = res + Character.toUpperCase(s.charAt(0)) + s.substring(1)+ " ";
		}
		System.out.println(res);
	}

}

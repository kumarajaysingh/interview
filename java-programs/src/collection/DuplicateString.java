package collection;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	public static void main(String[] args) {
		
		//Find number of words in a given string
		
		String str = "this is a java program for a duplicate word in java";

		findDuplicateWords(str);
		findDuplicateCharacters(str);
		
	}

	private static void findDuplicateCharacters(String str) {

		Map<Character, Integer> map = new HashMap<>();

		if (null!=str && ""!=str) {
			char[] charArray = str.toCharArray();
			for (char c: charArray) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}

			}
		}
		
		for(Character key : map.keySet()) {
			System.out.println(key+ "==>"+map.get(key));
		}


	}

	private static void findDuplicateWords(String str) {

		String[] words = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();

		if (words.length > 0) {
			for (String word: words) {
				if (map.containsKey(word)) {
					map.put(word, map.get(word) + 1);
				} else {
					map.put(word, 1);
				}

			}
		}
		
		for(String key : map.keySet()) {
			System.out.println(key+ "==>"+map.get(key));
		}


	}

}

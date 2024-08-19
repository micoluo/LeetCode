package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class L1657 {

	public boolean closeStrings(String word1, String word2) {

		if (word1.length() != word2.length()) {
			return false;
		}
		
		Map<Character,Integer> map1 = new HashMap<>();
		Map<Character,Integer> map2 = new HashMap<>();
		
		
	    for (char c : word1.toCharArray()) {
	        map1.put(c, map1.getOrDefault(c, 0) + 1);
	    }

	    for (char c : word2.toCharArray()) {
	        map2.put(c, map2.getOrDefault(c, 0) + 1);
	    }
		

		// key 
		Set<Character> key1 = map1.keySet();
		Set<Character> key2 = map2.keySet();
		
		if (!key1.equals(key2)) {
			return false; 
		}
		
		
		// value
		List<Integer> value1 = new ArrayList<>();
		List<Integer> value2 = new ArrayList<>();
		for (int m: map1.values()) {
			value1.add(m);
		}
		for (int m: map2.values()) {
			value2.add(m);
		}

		Collections.sort(value1);
		Collections.sort(value2);
		if (!value1.equals(value2)) {
			return false;
		}
		
		return true;
	}


	public static void main(String[] args) {

		String word1 = "aaabbbbccddeeeeefffff";
		String word2 = "aaaaabbcccdddeeeeffff";
		L1657 l = new L1657();
		boolean result = l.closeStrings(word1, word2);
		System.out.println(result);

	}

}

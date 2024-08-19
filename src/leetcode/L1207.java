package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L1207 {

	public boolean uniqueOccurrences(int[] arr) {

		Map<Integer, Integer> unique = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			unique.put(arr[i], unique.getOrDefault(arr[i], 0) + 1);
		}

		Set<Integer> value = new HashSet<>();

		for (int v : unique.values()) {
			value.add(v);
		}

		if (value.size() == unique.size()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 3, 5, -2, -3, -6, -6 };
		L1207 l = new L1207();
		boolean result = l.uniqueOccurrences(arr);
		System.out.println(result);
	}

}

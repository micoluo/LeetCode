package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L2215 {

	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		List<List<Integer>> answer = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			answer.add(new ArrayList<>());
		}

		Set<Integer> set1 = new HashSet<>();
		for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
		}

		Set<Integer> set2 = new HashSet<>();
		for (int i = 0; i < nums2.length; i++) {
			set2.add(nums2[i]);
		}

		for (int s : set1) {
			if (!set2.contains(s)) {
				answer.get(0).add(s);
			}
		}

		for (int s : set2) {
			if (!set1.contains(s)) {
				answer.get(1).add(s);
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 3 };
		int[] nums2 = { 1, 1, 2, 2 };
		L2215 l = new L2215();
		List<List<Integer>> answer = l.findDifference(nums1, nums2);
		System.out.println(answer);
	}

}

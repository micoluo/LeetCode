package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L1004 {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 0, 1 };
		int k = 4;
		L1004 l = new L1004();
		System.out.println(l.longestOnes(nums, k));

	}

	public int longestOnes(int[] nums, int k) {

		List<Integer> zeroes = new ArrayList<Integer>();

		// Find the location of zeroes.
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == 0) {
				zeroes.add(j);
			}
		}

		if (zeroes.size() < k) {
			return nums.length;
		} else {
			for (int l = 0; l < k; l++) {
				nums[zeroes.get(l)] = 1; // set the first k 0's to be 1
			}

			int result = consecutive(nums);

			for (int m = k; m < zeroes.size(); m++) {
				nums[zeroes.get(m)] = 1;
				nums[zeroes.get(m - k)] = 0;
				result = Math.max(result, consecutive(nums));
			} // window sliding

			return result;
		}

	}

	public static int consecutive(int[] nums) {
		// check the consecutive zeroes
		int result = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			// Reset count when 0 is found
			if (nums[i] == 0)
				count = 0;
			else {
				count++;// increase count
				result = Math.max(result, count);
			}
		}

		return result;

	}

}

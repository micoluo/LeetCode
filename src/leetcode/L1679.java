package leetcode;

import java.util.Arrays;

public class L1679 {

	public static void main(String[] args) {
		//int[] nums = { 3, 1, 3, 4, 3 };
		// int[] nums = { 1, 2, 3, 4 };
		 int[] nums = { 3, 1, 3, 4, 3, 2 };

		int k = 6;

		L1679 l = new L1679();
		System.out.println(l.maxOperations(nums, k));

	}

	public int maxOperations(int[] nums, int k) {
		Arrays.sort(nums);
		int count = 0;
		for (int left = 0, right = nums.length - 1; left < right;) {
			if (nums[left] + nums[right] == k) {
				count++;
				left++;
				right--;
			} else if (nums[left] + nums[right] < k) {
				left++;
			} else {
				right--;
			}
		}
		return count;
	}

}

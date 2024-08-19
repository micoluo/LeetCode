package leetcode;

import java.util.Arrays;

public class L26 {

	public int removeDuplicates(int[] nums) {

		int k = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[k - 1]) {
				nums[k] = nums[i];
				k++;
			}
		}

		return k;

	}

	public static void main(String[] args) {

		L26 l = new L26();
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		l.removeDuplicates(nums);
		System.out.println(Arrays.toString(nums));
	}

}

package leetcode;

import java.util.Arrays;

public class L283 {

	public static void main(String[] args) {

		int[] nums = { 0,1,0,2,13 };

		moveZeroes(nums);

		System.out.println(Arrays.toString(nums));

	}

	public static void moveZeroes(int[] nums) {
		
		if (nums.length == 1) {
			return;
		}
		int left = 0;
		int right = 0;

		// right is 0's location; left is non 0's location
		while (right < nums.length) {
			if (nums[right] != 0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
			}
			right++;
		}
	}

}

package leetcode;

import java.util.Arrays;

public class L80 {

	public int removeDuplicates(int[] nums) {

		int k = 1;
		int index = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[k - 1]) {
				nums[k] = nums[i];
				k++;
				index = 1;
			} else if (index < 2) {
				nums[k] = nums[i];
				k++;
				index++;
			}
		}
		return k;
	}

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
		L80 l = new L80();
		l.removeDuplicates(nums);
		System.out.println(Arrays.toString(nums));

	}

}

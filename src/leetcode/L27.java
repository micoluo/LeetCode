package leetcode;

import java.util.Arrays;

public class L27 {

	public int removeElement(int[] nums, int val) {
		int k = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}

		return k;
	}

	public static void main(String[] args) {
		L27 l = new L27();
		int[] nums = { 3, 2, 2, 3 };
		int k = l.removeElement(nums, 3);
		System.out.println(Arrays.toString(nums));
		System.out.println(k);
	}

}

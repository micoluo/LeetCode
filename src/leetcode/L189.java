package leetcode;

import java.util.Arrays;

public class L189 {

	public void rotate(int[] nums, int k) {
		if (nums.length <= 1 || k == 0) {
			return;
		}

		int n = nums.length;
		k = k % n;

		int[] temp = new int[n];

		for (int i = 0; i < k; i++) {
			temp[i] = nums[n - k + i];
		}

		for (int i = k; i < n; i++) {
			temp[i] = nums[i - k];
		}

		System.arraycopy(temp, 0, nums, 0, n);
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		L189 l = new L189();
		l.rotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}

}

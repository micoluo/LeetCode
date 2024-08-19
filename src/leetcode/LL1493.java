package leetcode;

public class LL1493 {

	public int longestSubarray(int[] nums) {

		int left = 0;
		int right = 0;
		int max = 0;
		int zero = 0;

		while (right < nums.length) {
			if (nums[right] == 0) {
				zero++;
			}
			while (zero > 1) {
				if (nums[left] == 0) {
					zero--;
				}
				left++;
			}
			max = Math.max(max, right - left);
			right++;
		}

		return (max == nums.length) ? max - 1 : max;

	}

}

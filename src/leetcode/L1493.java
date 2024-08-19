package leetcode;

public class L1493 {

	public int longestSubarray(int[] nums) {
		int left = 0;
		int zeros = 0;
		int max = 0;
		int temp = 0;
		int n = nums.length;
		
		for (int right = 0; right < n; right++) {
			if (nums[right] == 0) {
				zeros++;
			}
			while (zeros > 1) {
				if (nums[left] == 0) {
					zeros--;
				}
				left++;
			}
			temp = right - left;
			if (temp > max) {
				max = temp;
			}

		}
		if (max == n) {
			return max - 1;
		} else {
			return max;
		}

	}

	public static void main(String[] args) {

		L1493 l = new L1493();
		int[] nums = { 1, 1, 0, 1 };
		int max = l.longestSubarray(nums);
		System.out.println(max);

	}

}

package leetcode;

public class L724 {

	public int pivotIndex(int[] nums) {

		int index = -1;
		int leftSum = 0;
		int rightSum = 0;

		for (int num : nums) {
			rightSum += num;
		}

		for (int i = 0; i < nums.length; i++) {
			rightSum -= nums[i];
			if (rightSum == leftSum) {
				index = i;
				break;
			}
			leftSum += nums[i];
		}
		return index;
	}

	public static void main(String[] args) {

		L724 l = new L724();
		 int[] nums = { 1, 7, 3, 6, 5, 6 };
		// int[] nums = { 2, 1, -1 };
		// int[] nums = { 1, 2, 3 };
		// int[] nums = { -1, -1, -1, -1, -1, 0 };
		int index = l.pivotIndex(nums);
		System.out.println("F: " + index);
	}

}

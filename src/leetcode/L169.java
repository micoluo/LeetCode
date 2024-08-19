package leetcode;

import java.util.Arrays;

public class L169 {

	public int majorityElement(int[] nums) {
		
		Arrays.sort(nums);
	    return nums[nums.length / 2];

	}

	public static void main(String[] args) {

		// int[] nums = {2,2,1,1,1,2,2};
		int[] nums = {1};
		L169 l = new L169();
		int k = l.majorityElement(nums);
		System.out.println(k);
	}

}

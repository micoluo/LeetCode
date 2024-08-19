package leetcode;


public class Triplet {

	public static void main(String[] args) {

		// int[] nums = { 20, 100, 10, 12, 5, 13 };
		// int[] nums = {1,5,0,4,1,3};
		// int[] nums = {5,4,3,2,1};
		int[] nums = { 1, 2, 2147483647 };
		Triplet tri = new Triplet();
		System.out.println(tri.increasingTriplet(nums));

	}

	public boolean increasingTriplet(int[] nums) {
		int small = Integer.MAX_VALUE;
		int big = Integer.MAX_VALUE;
		for (int n : nums) {
			if (n <= small) {
				small = n;
			} // update small if n is smaller than both
			else if (n <= big) {
				big = n;
			} // update big only if greater than small but smaller than big
			else
				return true; // return if you find a number bigger than both
		}
		return false;
	}

}

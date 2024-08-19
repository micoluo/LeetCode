package leetcode;

public class L11 {

	public static void main(String[] args) {
		// int[] height1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int[] height2 = { 1, 2 };
		L11 l = new L11();
		System.out.println(l.maxArea(height2));

	}

	public int maxArea(int[] height) {
		if (height.length == 1 || height.length == 0) {
			return 0;
		}

		int maxArea = 0;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {
			int interArea = (right - left) * Math.min(height[left], height[right]);
			maxArea = Math.max(maxArea, interArea);
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

}

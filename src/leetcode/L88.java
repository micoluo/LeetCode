package leetcode;

import java.util.Arrays;

public class L88 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = 0; // pointer for nums3
		int j = 0; // pointer for nums2
		int k = 0; // pointer for nums1

		int[] nums3 = new int[m];

		
		for (int l = 0; l < nums3.length; l++) {
			nums3[l] = nums1[l];
		}


		while (j < n && i < m) {
			int temp1 = nums3[i];
			int temp2 = nums2[j];
			if (temp1 <= temp2) {
				nums1[k] = temp1;
				k++;
				i++;
			} else {
				nums1[k] = temp2;
				k++;
				j++;
			}
		}
		

		while (j < n) {
			nums1[k] = nums2[j];
			j++;
			k++;
		}

		while (i < m) {
			nums1[k] = nums3[i];
			i++;
			k++;
		}

	}

	// test

	public static void main(String[] args) {
		L88 l = new L88();

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int n = nums2.length;
		int m = nums1.length - n;

		l.merge(nums1, m, nums2, n);

		System.out.println(Arrays.toString(nums1));
	}

}

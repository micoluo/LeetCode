package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		int[] Candies = { 5, 1, 4, 6 };
		List<Boolean> result = kidsWithCandies(Candies, 3);
		for (Boolean r : result) {
			System.out.println(r);
		}

	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> resultList = new ArrayList<Boolean>();
		for (int i = 0; i < candies.length; i++) {
			int newC = candies[i] + extraCandies;
			Boolean result = true;
			int j = 0;
			while (j < i) {
				if (candies[j] <= newC) {
					j++;
				} else {
					result = false;
					//exit the current if/else
					break;
				}
			}
			int k = i + 1;
			while (k < candies.length) {
				if (candies[k] <= newC) {
					k++;
				} else {
					result = false;
					break;
				}
			}
			resultList.add(result);

		}
		return resultList;
	}
}

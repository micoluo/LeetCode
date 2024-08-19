package leetcode;

public class L121 {

	public int maxProfit(int[] prices) {
		int max = 0;
		int initial = prices[0];

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < initial) {
				initial = prices[i];
			}
			max = Math.max(max, prices[i] - initial);

		}

		return max;
	}

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		L121 l = new L121();
		int max = l.maxProfit(prices);
		System.out.println(max);

	}

}

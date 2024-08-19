package leetcode;

public class Bedflower {

	public static void main(String[] args) {
		int n = 2;
		int[] flowerbed = { 1, 0, 0, 1, 0, 0, 0, 1 };
		int can = 0; // the actual flower can add
		int count = 1; // check if 0 is at the end
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				count++;
			}else {
				can = can + (count - 1) / 2;
				count = 0;
			}
		}
		if (count != 0) {
			can = can + count/2;
		}
		if (can >= n) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}

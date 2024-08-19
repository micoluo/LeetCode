package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L2352 {

	public int equalPairs(int[][] grid) {

		Map<Integer, int[]> row = new HashMap<>(); // store rows 
		Map<Integer, int[]> column = new HashMap<>(); // store columns
		int equal = 0;

		for (int i = 0; i < grid.length; i++) {
			int[] temp1 = new int[grid.length];
			for (int j = 0; j < grid[0].length; j++) {
				temp1[j] = grid[i][j];
			}
			row.put(i, temp1);
		}

		for (int j = 0; j < grid[0].length; j++) {
			int[] temp2 = new int[grid[0].length];
			for (int i = 0; i < grid.length; i++) {
				temp2[i] = grid[i][j];
			}
			column.put(j, temp2);
		}

		for (int[] r : row.values()) {
			for (int[] c : column.values()) {
				if (Arrays.equals(r, c)) {
					equal++;
				}
			}
		}

		return equal;
	}

	public static void main(String[] args) {

		int[][] grid = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
		L2352 l = new L2352();
		int equal = l.equalPairs(grid);
		System.out.println(equal);
	}

}

package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class L735 {

	public int[] asteroidCollision(int[] asteroids) {

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < asteroids.length; i++) {
			if (stack.isEmpty() || asteroids[i] > 0) {
				stack.push(asteroids[i]);
				continue;
			}

			while (!stack.isEmpty()) {
				int temp = stack.peek();
				if (temp < 0) { // -/+ will never collide
					stack.push(asteroids[i]);
					break;
				} else if (temp == -asteroids[i]) {
					stack.pop();
					break;
				} else if (temp > -asteroids[i]) {
					break;
				} else {
					stack.pop();
				}
				if (stack.isEmpty()) {
					stack.push(asteroids[i]);
					break;
				}
			}
		}

		int[] newAsteroids = new int[stack.size()];// after collision
		int j = 0;
		for (int i : stack) {
			newAsteroids[j] = i;
			j++;
		}

		return newAsteroids;

	}

	public static void main(String[] args) {
		L735 l = new L735();
		int[] asteroids = { 10, 2, -5, 2, 10 };
		int[] newAsteroids = l.asteroidCollision(asteroids);
		System.out.println(Arrays.toString(newAsteroids));

	}

}

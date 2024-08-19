package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//Q 933
public class RecentCounter {

	Queue<Integer> queue;

	public RecentCounter() {
		queue = new LinkedList<>();
	}

	public int ping(int t) {

		queue.add(t);
		while (t - queue.peek() > 3000) {
			queue.remove();

		}
		return queue.size();
	}

	public static void main(String[] args) {

		RecentCounter obj = new RecentCounter();

		int[] T = { 642, 1849, 4921, 5963, 5957 };

		for (int t : T) {
			int param_1 = obj.ping(t);
			System.out.println(param_1);
		}

	}

}

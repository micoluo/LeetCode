package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class L649 {

	public String predictPartyVictory(String senate) {
		
		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();
		int n = senate.length();
		
		for (int i = 0; i < n; i++) {
			if (senate.charAt(i) == 'R')
				queue1.add(i);
			else
				queue2.add(i);
		}
		while (!queue1.isEmpty() && !queue2.isEmpty()) {
			int indexR= queue1.poll(), indexD = queue2.poll();
			if (indexR < indexD)
				queue1.add(indexR + n);
			else
				queue2.add(indexD + n);
		}
		
		if (queue1.isEmpty()) {
			return "Dire";
		}else {
			return "Radiant";
		}

	}

	public static void main(String[] args) {
		L649 l = new L649();
		String senate = "RD";
		String result = l.predictPartyVictory(senate);
		System.out.println(result);
	}

}

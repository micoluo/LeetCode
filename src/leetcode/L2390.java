package leetcode;

import java.util.Stack;

public class L2390 {

	public String removeStars(String s) {

		Stack<Character> stack = new Stack<>();

	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c != '*') {
	            stack.push(c);
	        } else if (!stack.isEmpty()) {
	            stack.pop(); 
	        }
	    }

	    StringBuilder sb = new StringBuilder(stack.size());
	    for (Character character : stack) {
	        sb.append(character);
	    }

	    return sb.toString();
	}

	public static void main(String[] args) {

		String s = "leet**cod*e";
		L2390 l = new L2390();
		String L = l.removeStars(s);
		System.out.println(L);

	}
}

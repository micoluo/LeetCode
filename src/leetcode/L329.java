package leetcode;

public class L329 {

	public static void main(String[] args) {
		String s = "axc";
		String t = "ahbgdc";
		L329 l = new L329();
		System.out.println(l.isSubsequence(s, t));

	}

	public boolean isSubsequence(String s, String t) {

		if (s.equalsIgnoreCase(t)) {
			return true;
		}

		int left = 0; // t
		int count = 0;
		int right = 0; // s

		while (right < s.length() && left < t.length()) {
			if (t.charAt(left) == s.charAt(right)) {
				count++;
				left++;
				right++;
			} else {
				left++;
			}
		}
		if (count == s.length()) {
			return true;
		} else {
			return false;
		}

	}

}

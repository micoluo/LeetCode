package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWord {

	public static void main(String[] args) {
		String s = " the  sky is blue ";
		List<String> words = new ArrayList<String>();
		StringBuilder builder = new StringBuilder();
		String d = s.trim(); // removing leading and trailing space

		int i = 0;
		while (i < d.length()) {
			if (d.charAt(i) != ' ') {
				builder.append(d.charAt(i));
			} else {
				if (builder.length() > 0) {
					words.add(builder.toString());
					builder.delete(0, builder.length());
				}
			}
			i++;
		}
		if (builder.length() > 0) {
			words.add(builder.toString());
		}
		
		builder.delete(0, builder.length());

		Collections.reverse(words);
		for (String c : words) {
			builder.append(c).append(" ");
		}
		
		String e = builder.toString().trim();
		System.out.println(e);
	}

}

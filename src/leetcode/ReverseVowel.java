package leetcode;

public class ReverseVowel {

	public static void main(String[] args) {
		String s = "Hello";
		char[] words = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		String vowels = "aeiouAEIOU";
		
		while (start < end) {
			
			while (start < end && vowels.indexOf(words[start]) == -1) {
				start++;
			}
			
			while (start< end && vowels.indexOf(words[end]) == -1) {
				end--;
			}
			
			// swip
			char temp = words[start];
			words[start] = words[end];
			words[end] = temp;
			
			start++;
			end--;
		}
		String newString =  new String(words);
		System.out.println(newString);
		
	}

}

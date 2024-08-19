package leetcode;

public class L1456 {

	public static void main(String[] args) {

		//String s = "abciiidef";
		String s = "aeiou";
		int k = 4;
		L1456 l = new L1456();
		System.out.println(l.maxVowels(s, k));
	}

	public int maxVowels(String s, int k) {

		char[] words = s.toCharArray();
		int count = 0; 
		
		for (int i = 0; i < k; i++) {
			if (words[i] ==  'a' || words[i] == 'e' || words[i] == 'i' || words[i] == 'o' || words[i]  == 'u') {
				count++;
			}
		} // first k 
		
		int interCount = count; 
		
		for (int j = k; j < s.length(); j++) {
			if (words[j-k] ==  'a' || words[j-k] == 'e' || words[j-k] == 'i' || words[j-k] == 'o' || words[j-k]  == 'u') {
				interCount--;
			}
			if (words[j] ==  'a' || words[j] == 'e' || words[j] == 'i' || words[j] == 'o' || words[j]  == 'u') {
				interCount++;
			}
			count = Math.max(interCount, count);
		} // window sliding

		return count;
	}

}

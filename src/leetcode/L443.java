package leetcode;

public class L443 {

	public static void main(String[] args) {
		char[] example = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
		L443 test = new L443();
		System.out.println(test.compress(example));

	}

	public int compress(char[] chars) {
	    int count = 1;
	    int j = 0;
	    for (int i = 0; i < chars.length; i++) {
	        while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
	            count++;
	            i++;
	        }
	        chars[j] = chars[i];
	        if (count > 1) {
	            String countStr = String.valueOf(count);
	            for (char c : countStr.toCharArray()) {
	                chars[++j] = c;
	            }
	        }
	        j++;
	        count = 1;
	    }
	    return j;
	}


}

package algorithm.string;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {
	
	/*
	 * Time complexity : O(2n)=O(n). 
	 * In the worst case each character will be visited twice by i and j.
	 * 
	 * Space complexity : O(min(m,n)). 
	 * We need O(k) space for the sliding window, where k is the size of the Set. 
	 * The size of the Set is upper bounded by the size of the string n and the size of the charset m. 
	 */
	public int usingCharacterSet(String s) {
		Set<Character> charSet = new HashSet<>();
		int n = s.length();
		int maxLength = 0;
		int i = 0;
		int j = 0;
		while (i < n && j < n) {
			if (charSet.contains(s.charAt(j))) {
				charSet.remove(s.charAt(i++));
			} else {
				charSet.add(s.charAt(j++));
				maxLength = Math.max(maxLength, j - i);
			}
		}
		return maxLength;
	}

}

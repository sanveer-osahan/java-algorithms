package algorithm.string;

import util.CommonUtil;

/*
 * Given 2 strings, check if they are permutation of each other.
 */
public class CheckPermutation {
	private static final int MAX_CHAR_LENGTH = 256;

	/*
	 * Sorting the strings then checking if they are equal. Time Complexity:
	 * O(n*log(n))
	 */
	public boolean bySorting(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		String sortedString1 = CommonUtil.sortString(str1);
		String sortedString2 = CommonUtil.sortString(str2);
		return sortedString1.equals(sortedString2);
	}

	public boolean byCounting(String str1, String str2) {
		if (str1.length() != str2.length()) 
			return false;
		int counter[] = new int[MAX_CHAR_LENGTH];
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		for (char c: charArray1) {
			counter[c]++;
		}
		
		for (char c: charArray2) {
			counter[c]--;
			if (counter[c] < 0)
				return false;
		}
		return true;
	}
}

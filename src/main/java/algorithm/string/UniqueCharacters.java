package algorithm.string;

import java.util.HashSet;
import java.util.Set;

import algorithm.sort.QuickSort;
import util.ConversionUtil;

/*
 * Given a string, determine if the string has all unique characters.
 */
public class UniqueCharacters {
	/*
	 * Brute Force - Comparing each character with every other character. 
	 * Time Complexity: O(n^2)
	 */
	public boolean findByBruteForce(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		return true;
	}

	/*
	 * Sorting the string then comparing neighbor characters.
	 * Time Complexity: O(n*log(n))
	 */
	public boolean findBySorting(String str) {
		Character[] charArray = ConversionUtil.convertStringToCharacterArray(str);
		QuickSort.sort(charArray);
		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i].equals(charArray[i + 1]))
				return false;
		}
		return true;
	}

	/*
	 * Time Complexity: O(n)
	 */
	public boolean findUsingCharacterSet(String str) {
		Set<Character> characterSet = new HashSet<Character>();
		Character[] charArray = ConversionUtil.convertStringToCharacterArray(str);
		for (int i = 0; i < charArray.length; i++) {
			if (characterSet.contains(charArray[i])) {
				return false;
			}
			characterSet.add(charArray[i]);
		}
		return true;
	}
}

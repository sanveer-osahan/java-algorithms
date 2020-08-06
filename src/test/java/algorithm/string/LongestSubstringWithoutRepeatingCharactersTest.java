package algorithm.string;

import org.testng.annotations.Test;

import util.RandomGenerator;

/*
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
	
	@Test
	public void testCharacterSet() {
		LongestSubstringWithoutRepeatingCharacters algorithm = new LongestSubstringWithoutRepeatingCharacters();
		String randomString = RandomGenerator.generateRandomString(1000);
		int result = algorithm.usingCharacterSet(randomString);
		System.out.println(randomString);
		System.out.println(result);
	}
}

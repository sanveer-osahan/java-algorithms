package algorithm.array;

import org.testng.annotations.Test;

import util.TestUtil;

/*
 * Given an array of integers, return indices of the two numbers 
 * such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 */

public class TwoSumTest {
	
	@Test
	public void testHashMap() {
		TwoSum twoSum = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		int[] result = twoSum.usingHashMap(nums, 9);
		TestUtil.printIntArray(result);
	}
}

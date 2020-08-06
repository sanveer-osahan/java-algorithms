package algorithm.array;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers 
 * such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 */

public class TwoSum {
	
	/*
	 * Time complexity : O(n). 
	 * We traverse the list containing n elements only once. 
	 * Each look up in the table costs only O(1) time.
	 * 
	 * Space complexity : O(n). 
	 * The extra space required depends on the number of items stored in the hash table,
	 * which stores at most n elements.
	 */
	public int[] usingHashMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				result[0] = map.get(nums[i]);
				result[1] = i;
			} else {
				int difference = target - nums[i];
				map.put(difference, i);
			}
			
		}
		return result;
	}

}

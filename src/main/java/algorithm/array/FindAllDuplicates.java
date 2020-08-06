package algorithm.array;

import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), 
 * some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 */
public class FindAllDuplicates {
	
	public Set<Integer> withoutUsingExtraSpace(int[] nums) {
		Set<Integer> duplicates = new HashSet<>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int element = Math.abs(nums[i]) - 1;
			if (nums[element] < 0) {
				duplicates.add(element + 1);
			} else {
				nums[element] = - nums[element];
			}
		}
		return duplicates;
	}
}

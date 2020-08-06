package algorithm.array;

import static org.testng.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

/*
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), 
 * some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 */
public class FindAllDuplicatesTest {
	
	@Test
	public void testWithoutUsingExtraSpace() {
		FindAllDuplicates findAllDuplicates = new FindAllDuplicates();
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		Set<Integer> expectedResult = new HashSet<>();
		expectedResult.add(2);
		expectedResult.add(3);
		Set<Integer> actualResult = findAllDuplicates.withoutUsingExtraSpace(nums);
		assertEquals(actualResult, expectedResult);
	}
}

package algorithm.string;

import static util.RandomGenerator.generateRandomString;

import org.testng.Assert;
import org.testng.annotations.Test;

import algorithm.string.UniqueCharacters;

/*
 * Given a string, Determine if the string has all unique characters.
 */

public class UniqueCharactersTest
{
	/*
	 * Brute Force - Comparing each character with every other character.
	 * Time Complexity: O(n^2)
	 */
	@Test
	public void testBruteForce()
	{
		UniqueCharacters uniqueCharacters= new UniqueCharacters();
		Assert.assertEquals(uniqueCharacters.findByBruteForce("abcd10jk"), true);
		Assert.assertEquals(uniqueCharacters.findByBruteForce("hutg9mnd!nk9"), false);	
	}
	
	/*
	 * Sorting the string then comparing neighbor characters 
	 * Time Complexity: O(n*log(n))
	 */
	@Test
	public void testSorting()
	{
		UniqueCharacters uniqueCharacters= new UniqueCharacters();
		Assert.assertEquals(uniqueCharacters.findBySorting("abcd10jk"), true);
		Assert.assertEquals(uniqueCharacters.findBySorting("hutg9mnd!nk9"), false);	
	}
	
	@Test
	public void testCharacterSet()
	{
		UniqueCharacters uniqueCharacters= new UniqueCharacters();
		Assert.assertEquals(uniqueCharacters.findUsingCharacterSet("abcd10jk"), true);
		Assert.assertEquals(uniqueCharacters.findUsingCharacterSet("hutg9mnd!nk9"), false);	
	}
	
	@Test
	public void testComparison()
	{
		String randomString = generateRandomString(10000);
		System.out.println("Input String: "+randomString);
		
		UniqueCharacters uniqueCharacters= new UniqueCharacters();
		
		long start = System.nanoTime(); 
		uniqueCharacters.findByBruteForce(randomString);
        long end =System.nanoTime(); 
        System.out.println("Brute Force - " + (end - start) + " ns");
        
        start = System.nanoTime(); 
		uniqueCharacters.findBySorting(randomString);
        end = System.nanoTime(); 
        System.out.println("Sorting - " + (end - start) + " ns"); 
        
        start = System.nanoTime(); 
		uniqueCharacters.findUsingCharacterSet(randomString);
        end = System.nanoTime(); 
        System.out.println("Character Set - " + (end - start) + " ns"); 
		
	}
	
	
}

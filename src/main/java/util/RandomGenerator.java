package util;

import java.util.Random;

public class RandomGenerator
{
	
	private static Random random = new Random();
	private static final String CHARACTER_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        										   + "0123456789"
        										   + "abcdefghijklmnopqrstuvxyz"; 
	
	public static String generateRandomString(int length)
	{
  
        StringBuilder sb = new StringBuilder(length); 
        for (int i = 0; i < length; i++) { 
            int index = random.nextInt(CHARACTER_SET.length());
            sb.append(CHARACTER_SET.charAt(index)); 
        } 
        return sb.toString(); 
            
	}
	
	public static int[] generateRandomIntArray(int length) {
		int[] randomIntArray = new int[length];
		for (int i = 0; i < length; i++) {
			randomIntArray[i] = random.nextInt();
		}
		return randomIntArray;
	}
}

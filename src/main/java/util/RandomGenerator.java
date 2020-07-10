package util;

public class RandomGenerator
{
	private static final String CHARACTER_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        										   + "0123456789"
        										   + "abcdefghijklmnopqrstuvxyz"; 
	public static String generateRandomString(int length)
	{
  
        StringBuilder sb = new StringBuilder(length); 
  
        for (int i = 0; i < length; i++) 
        { 
            int index = (int)(CHARACTER_SET.length() * Math.random());
            sb.append(CHARACTER_SET.charAt(index)); 
        } 
        
        return sb.toString(); 
            
	}
}

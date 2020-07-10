package util;

public class ConversionUtil
{
	public static Character[] convertStringToCharacterArray(String str)
	{
		Character[] charArray = new Character[str.length()];
		for (int i = 0; i < str.length(); i++) 
		{ 
			charArray[i] = str.charAt(i); 
        }  
		return charArray;	
	}
	
	public static String convertCharacterArrayToString(Character[] charArray)
	{
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i < charArray.length; i++)
		{
			stringBuilder.append(charArray[i]);
		}
		
		return stringBuilder.toString();
	}
	
	
}

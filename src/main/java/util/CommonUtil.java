package util;

import algorithm.sort.QuickSort;

public class CommonUtil
{
	public static <T> void swap(T[] array, int xIndex, int yIndex)
	{
		T temp = array[xIndex];
		array[xIndex] = array[yIndex];
		array[yIndex] = temp;
	}
	
	public static String sortString(String str) {
		Character[] charArray = ConversionUtil.convertStringToCharacterArray(str);
		QuickSort.sort(charArray);
		return ConversionUtil.convertCharacterArrayToString(charArray);
	}
}

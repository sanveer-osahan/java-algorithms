package algorithm.sort;

import static util.CommonUtil.swap;

/*
 * QuickSort is a Divide and Conquer algorithm. 
 * It picks an element as pivot and partitions the given array around the picked pivot.
 *
 * Target of partitions is, given an array and an element x of array as pivot, 
 * put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, 
 * and put all greater elements (greater than x) after x. All this should be done in linear time.
 * 
 * Here, the last element of a partition is used as a pivot
 */

public class QuickSort
{
	public static <T extends Comparable<T>> void sort(T[] array)
	{
		sort(array, 0, array.length - 1);		
	}

	private static <T extends Comparable<T>> void sort(T[] array, int left, int right)
	{
		if (left < right) 
		{
            int pivot = partition(array, left, right);
            sort(array, left, pivot - 1);
            sort(array, pivot + 1, right);
        }
	}

	private static <T extends Comparable<T>> int partition(T[] array, int left, int right)
	{
		T pivot = array[right];
		int i = left - 1;
		for(int j = left; j < right; j++)
		{
			if(array[j].compareTo(pivot) < 0)
			{
				i++;
				swap(array, i, j);
			}	
		}
		swap(array, i+1, right);
		return i + 1;
	}

}

/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 30

Description:

Java program to find a peak element in an integer array i.e. an element
that is not smaller than its neighbors.

*/

public class Question30
{
	public static int[] findPeakElements(int[] array)
	{
		if(array==null || array.length==0 || array.length==0)
			return Array.copy(array);
		int[] temp = new int[array.length];
		int index = 0;
		for(int i = 0;i<array.length;i++)
			if(i==0 || i==array.length-1)
				temp[index++] = array[i];
			else
				if(array[i]>=array[i-1] && array[i]>= array[i+1])
					temp[index++] = array[i];
		int[] result = new int[index];
		for(int i = 0;i<index;i++)
			result[i] = temp[i];
		return result;		
	}
	
	public static void main(String[] args)
	{
		int[] array = Array.generate(10);
		Array.display(array);
		int[] peak = findPeakElements(array);
		Array.display(peak);	
	}
}
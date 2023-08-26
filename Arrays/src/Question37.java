/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 37

Description:

Given an array arr[] of size N-1 with non duplicate integers in the range of
[1, N], the task is to find the missing number from the first N integers.
Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
Output: 5
*/

public class Question37
{
	public static int findMissing(int[] array)
	{
		//Failure and Single Case
		if(array==null)
			return -1;
		if(array.length==0)
			return -1;
		
		//Main Logic - using another temp integer array for size (array.length+1)
		int[] temp = new int[array.length+1];
		for(int i = 0;i<array.length;i++)
			temp[array[i]-1]++;
		for(int i = 0;i<temp.length;i++)
			if(temp[i]==0)
				return (i+1);
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] array = {1, 2, 4, 6, 3, 7, 8};
		System.out.println("The array is :");
		Array.display(array);
		System.out.println(findMissing(array));
	}
}
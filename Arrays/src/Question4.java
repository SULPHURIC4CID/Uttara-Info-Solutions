/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 4

Description:

Java Program to copy all elements of one array into another array


*/

public class Question4
{
	public static int[] copyElementsIntoArray(int[] arr)
	{
		if(arr == null)
		{
			System.out.println("The array is NULL.");
			return arr;
		}
		if(arr.length==0)
		{
			System.out.println("The integer array is empty.");
			return arr;
		}
		else
		{
			int[] result = new int[arr.length];
			for(int i = 0;i<arr.length;i++)
				result[i] = arr[i];
			return result;
		}		
	}
	
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,56,67,78,89};
		int[] newArray = copyElementsIntoArray(array);
		Question1.printElementsOfArray(array);
		Question1.printElementsOfArray(newArray);
	}
}
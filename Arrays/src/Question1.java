/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 1

Description:

Java Program to print the elements of an array


*/

public class Question1
{
	public static void printElementsOfArray(int[] arr)
	{
		if(arr == null)
		{
			System.out.println("The array is NULL.");
			return;
		}
		if(arr.length==0)
		{
			System.out.println("The integer array is empty.");
			return;
		}
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}			
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,56,67,78,89};
		printElementsOfArray(arr);
	}
}
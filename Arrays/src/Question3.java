/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 3

Description:

Java Program to print the elements of an array in reverse order


*/

public class Question3
{
	public static void printArrayInReverseOrder(int[] arr)
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
		else
		{
			for(int i = 0;i<arr.length;i++)
				System.out.print(arr[arr.length-i-1]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,56,67,78,89};
		printArrayInReverseOrder(arr);
	}
}
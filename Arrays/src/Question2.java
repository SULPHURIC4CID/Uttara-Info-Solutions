/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 2

Description:

Java Program to print the number of elements present in an array


*/

public class Question2
{
	public static void printNumberOfElementsInArray(int[] arr)
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
			System.out.println("The array has : "+arr.length+" elements.");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,56,67,78,89};
		printNumberOfElementsInArray(arr);
	}
}
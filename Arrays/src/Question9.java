/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 9

Description:

Java Program to Print the Odd numbers present in an array

*/

public class Question9
{
	public static int[] findOdd(int[] arr)
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
			int index = 0;
			for(int i = 0;i<arr.length;i++)
				if(arr[i]%2==1)
					result[index++] = arr[i];
			int[] finalArray = new int[index];
			for(int i = 0;i<index;i++)
				finalArray[i] = result[i];
			return finalArray;
		}				
	}
	
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,56,67,78,89};
		Question1.printElementsOfArray(array);
		int[] oddNumbers = findOdd(array);
		System.out.println("The odd of the elements of the array is : ");
		Question1.printElementsOfArray(oddNumbers);
	}
}
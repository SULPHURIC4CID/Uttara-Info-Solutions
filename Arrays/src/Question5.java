/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 5

Description:

Java Program to print the elements of an array present on even position(or
index)


*/

public class Question5
{
	public static void printElementsInEvenIndex(int[] arr)
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
				if(i%2==0)
					System.out.print(arr[i]+" ");
		}		
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,56,67,78,89};
		printElementsInEvenIndex(array);
	}
}
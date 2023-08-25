/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 32

Description:

Java program to find a sub-array of integers that adds up to sum when an
array of non-negative integers and an integer sum is given.

*/

public class Question32
{
	public static void modify(int[] array)
	{
		if(array == null)
			return;
		if(array.length==0)
			return;
		int val;
		for(int i = 0;i<array.length;i++)
		{
			val = (int)(Math.random()*1000);
			if(val%5==0)
				array[i] = 0;
			else if(val%3==0)
				array[i] = 1;
			else
				array[i] = 2;
		}
	}
	
	public static void main(String[] args)
	{
		int[] array = Array.generate(40);
		System.out.println("The original array is : ");
		modify(array);
		Array.display(array);
		Array.sort(array,"bubble","asc");
		System.out.println("The sorted array is :");
		Array.display(array);
	}
}
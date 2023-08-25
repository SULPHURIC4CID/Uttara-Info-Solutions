/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 33

Description:

An array contains both positive and negative numbers in random order.
Write a Java program to rearrange the array elements so that all negative
numbers appear before all positive numbers.

*/

public class Question33
{
	public static void move(int[] array)
	{
		if(array==null)
			return;
		if(array.length==0 || array.length==1)
			return;
		for(int i =0;i<array.length;i++)
		{
			for(int j =0;j<array.length-i-1;j++)
			{
				if(array[j]>0)
				{
					array[j] = array[j] ^ array[j+1];
					array[j+1] = array[j] ^ array[j+1];
					array[j] = array[j] ^ array[j+1];
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] array = Array.generate(40,true);
		System.out.println("The original array is : ");
		Array.display(array);
		move(array);
		System.out.println("The modified array is :");
		Array.display(array);
	}
}
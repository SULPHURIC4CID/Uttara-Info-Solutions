/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 31

Description:

Java program to find a sub-array of integers that adds up to sum when an
array of non-negative integers and an integer sum is given.

*/

public class Question31
{
	public static int[] subArray(int[] array,long sum)
	{
		long[] prefixSum = Array.prefixSum(array);
		int r=0,l=0;
		label:
		for(l = 0; l<array.length;l++)
			for(r = l;r<array.length;r++)
				if(l==r)
				{
					if(prefixSum[l] == sum)
						break label;
				}
				else
				{
					if(prefixSum[r]-prefixSum[l] == sum)
						break label;
				}		
		if(l==array.length && r==array.length)
		{
			System.out.println("Sub Array not found.");
			return new int[0];
		}
		else
		{
			int[] result = new int[r-l];
			for(int i = l+1;i<=r;i++)
				result[i-l-1] = array[i];
			return result;
		}
	}
	
	public static void main(String[] args)
	{
		int[] array = Array.generate(40);
		System.out.println("The original array is : ");
		Array.display(array);
		long sum = 167;
		System.out.println("Sum is :"+sum);
		int[] result = subArray(array,sum);
		System.out.println("The sub array with sum = "+sum+" is : ");
		Array.display(result);
	}
}
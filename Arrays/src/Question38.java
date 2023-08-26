/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 38

Description:

Given an array of N integers, and a number sum, the task is to find the
number of pairs of integers in the array whose sum is equal to sum.
Input: arr[] = {1, 5, 7, -1}, sum = 6
Output: Pairs with sum 6 are (1, 5) and (7, -1). {1, 2, 4, 6, 3, 7, 8}, N = 8
Output: 5
*/

public class Question38
{
	public static int[][] findPairs(int[] array, int sum)
	{
		//Failure and Single cases
		if (array == null)
			return null;
		int[][] temp = new int[0][0];
		if(array.length==0 || array.length==1)
			return temp;
		//Main Logic
		int[] first = new int[array.length];
		int[] second = new int[array.length];
		int index = 0;
		for(int i = 0;i<array.length;i++)
			for(int j=i+1;j<array.length;j++)
				if(array[i] + array[j] == sum)
				{
					first[index] = array[i];
					second[index] = array[j];
					index++;
				}
		int[][] result = new int[2][index];
		for(int i = 0;i<index;i++)
		{
			result[0][i] = first[i];
			result[1][i] = second[i];
		}
		return result;		
	}
	
	public static void main(String[] args)
	{
		int[] array = Array.generate(40,false);
		System.out.println("The array is :");
		Array.display(array);
		int sum = 168;
		int[][] result = findPairs(array,sum);
		System.out.println("The total number of pairs that sum upto "+sum+" is : "+result[0].length);
		System.out.println("Pairs with sum "+sum+" are ");
		for(int i = 0;i<result[0].length;i++)
		{
			if(i!=result[0].length-1)
				System.out.print("("+result[0][i]+","+result[1][i]+"), ");
			else
				System.out.print("("+result[0][i]+","+result[1][i]+").");
		}
	}
}
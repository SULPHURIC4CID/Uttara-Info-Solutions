/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 12

Description:

Java Program to search an element in a given array and return the index of
the element if element is present else return -1.

*/

public class Question12
{
	public static int findIndex(int[] arr,int target)
	{
		if(arr==null)
			return -1;
		if(arr.length==0)
			return -1;
		for(int i = 0;i<arr.length;i++)
			if(arr[i] == target)
				return i;
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,56,67,78,89};
		Question1.printElementsOfArray(array);
		int target = 889;
		int result = findIndex(array,target);
		if(result!=-1)
			System.out.println("The element "+target+" is present in index : "+result);
		else
			System.out.println("The element "+target+" is not present in the array.");
	}
}
/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 11

Description:

Java Program to search an element in a given array and return true if the
element is present

*/

public class Question11
{
	public static boolean findElement(int[] arr,int target)
	{
		if(arr==null)
			return false;
		if(arr.length==0)
			return false;
		for(int i = 0;i<arr.length;i++)
			if(arr[i] == target)
				return true;
		return false;
	}
	
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,56,67,78,89};
		Question1.printElementsOfArray(array);
		int target = 89;
		String result = findElement(array,target)?"The element "+target+" is found in the array.":"The element "+target+"is not found in the array.";
		System.out.println(result);
	}
}
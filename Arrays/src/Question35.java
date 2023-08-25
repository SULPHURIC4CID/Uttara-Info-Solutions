/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 35

Description:

Given two sorted arrays, write a java program to find their intersection(a
new array that contains only common elements of the two arrays).

*/

public class Question35
{
	public static void main(String[] args)
	{
		int[] array1 = Array.generate(40,false);
		System.out.println("The first array is : ");
		Array.sort(array1,"bubble","asc");
		Array.display(array1);
		
		int[] array2 = Array.generate(40,false);
		System.out.println("The second array is : ");
		Array.sort(array2,"bubble","asc");
		Array.display(array2);
		
		int[] unionArray = Array.intersection(array1,array2);
		System.out.println("The intersection array is : ");
		Array.display(unionArray);		
	}
}
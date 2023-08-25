/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 34

Description:

Given two sorted arrays, write a java program to find their union(a new
array that contains all the elements of both the arrays).

*/

public class Question34
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
		
		int[] unionArray = Array.union(array1,array2);
		System.out.println("The union array is : ");
		Array.display(unionArray);		
	}
}
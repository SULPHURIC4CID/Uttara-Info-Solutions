/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 26

Description:

Java Program to print the duplicate elements of an array

*/

public class Question26
{
	public static void main(String[] args)
	{
		int[] array = Array.generate(40);
		Array.display(array);
		int[] unique = Array.findUnique(array);
		Array.display(unique);		
		int[] duplicate = Array.findDuplicate(array);
		Array.display(duplicate);
	}
}
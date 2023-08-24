/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 28

Description:

Java program to reverse an array without using any temporary array

*/

public class Question28
{
	
	public static void main(String[] args)
	{
		int[] array = Array.generate(40);
		Array.display(array);
		
		Array.reverse(array);
		Array.display(array);
		
	}
}
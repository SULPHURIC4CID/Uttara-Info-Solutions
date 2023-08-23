/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 232425

Description:

Java Program to cyclically rotate the elements of the array once in
clockwise direction

Java Program to left rotate the elements of an array

Java Program to right rotate the elements of an array

*/

public class Question232425
{	
	public static rotateMultiple(int[] array,int times)
	{
		times = times % array.length;
		for(int i = 0;i<times;i++)
			Array.rotate(array,true);
	}
	
	public static void main(String[] args)
	{
		int[] array = Array.generate(12);
		Array.display(array);
		Array.rotate(array,true);	//Single rotation
		Array.display(array);
		rotateMultiple(array,5);	// Multiple rotations
		Array.display(array);
		Array.rotate(array,false);	// Single rotation
		Array.display(array);
	}
}
/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 36

Description:

Java program to find the common elements among three different sorted
arrays.
*/

public class Question36
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
		
		
		int[] array3 = Array.generate(40,false);
		System.out.println("The third array is : ");
		Array.sort(array3,"bubble","asc");
		Array.display(array3);
		
		int[] unionArray = Array.intersection(Array.intersection(array1,array2),array3);
		System.out.println("The intersection array is : ");
		Array.display(unionArray);		
	}
}
/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 27

Description:

Java Program to remove duplicate elements in an array and store zero in
place of duplicates

*/

public class Question27
{
	public static void zeroDuplicates(int[] array)
	{
		if(array==null)
			return;
		if(array.length==0 || array.length==1)
			return;
		for(int i = 0;i<array.length;i++)
			if(Array.findIndex(array,array[i])!=i)
				array[i] = 0;		
	}
	public static void main(String[] args)
	{
		int[] array = Array.generate(40);
		Array.sort(array,"bubble","asc");
		Array.display(array);
		
		zeroDuplicates(array);
		Array.display(array);
		
	}
}
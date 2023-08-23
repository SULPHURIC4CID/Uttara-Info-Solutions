/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 14

Description:

Java Program to sort the elements of an array in descending order

*/

public class Question14
{	
	public static void main(String[] args)
	{
		int[] firstArray = Question13.generateArray(10);
		Question1.printElementsOfArray(firstArray);
		Question13.sortArray(firstArray,"counting","desc");
		Question1.printElementsOfArray(firstArray);
		Question13.sortArray(firstArray,"bubble","desc");
		Question1.printElementsOfArray(firstArray);		
		Question13.sortArray(firstArray,"insertion","desc");
		Question1.printElementsOfArray(firstArray);		
				
	}
}
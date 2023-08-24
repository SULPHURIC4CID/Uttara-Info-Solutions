/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 29

Description:

Java program to find the factorial of the biggest element of an array.

*/

public class Question29
{
	public static double factorial(int number)
	{
		if(number==0 || number==1)
			return 1.0;
		double fact = 1;
		for(int i = 2;i<=number;i++)
			fact*=i;
		return fact;
	}
	
	public static void main(String[] args)
	{
		int[] array = Array.generate(10);
		Array.display(array);
		
		int max = Array.max(array);
		System.out.println("The factorial of "+max+" is : "+factorial(max));
		
	}
}
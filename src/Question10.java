/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 10

Description: 

Write a program to print the sum of digits of a long number 8729 using for() loop.


*/

/*
Test Cases-

*****************************************************
*	#	*			number			*	output		*
*****************************************************
*	1	*			8729			*	26			*
*****************************************************
*	2	*			-12345			*	15			*
*****************************************************
*	3	*			0				*	0			*
*****************************************************
*	4	*	9199999999999999999		*	163			*
*****************************************************

*/

/*
Method Header-

public static int findDigitSum(long number)

*/

/*

Pseudo Code-

1. Check if number < 0.
2. If yes, convert it to a positive number.
3. Check single case, if len(number) == 1.
4. If true, return number after type casting it to int.
5. Decalre and initialise an int variable sum with 0.
6. Run a while loop till the condition number>0 is not met.
7. Increment sum with (number%10).
8. Reassign number with number/10;
9. After the termination of the while loop return sum.


*/

public class Question10
{
	public static int findDigitSum(long number)
	{
		if (number<0)
			number = -number;
		if (number/10 == 0)
			return (int)number;
		int sum = 0;
		while(number>0)
		{
			sum+=(number%10);
			number/=10;			
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		long number;
		
		number = 8729L;
		System.out.println(findDigitSum(number));
		
		number = -12345L;
		System.out.println(findDigitSum(number));
		
		number = 0L;
		System.out.println(findDigitSum(number));
		
		number = 9199999999999999999L;
		System.out.println(findDigitSum(number));
	}
}

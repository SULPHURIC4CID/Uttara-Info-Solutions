/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 14

Description: 
Write a program to print the absolute value of a given number.
For Ex:
INPUT: 1 OUTPUT: 1
INPUT: -1 OUTPUT: 1


*/

/*
Test Cases-


*********************************
*	#	*	number	*	output	*
*********************************
*	1	*	2.45	*	2.45	*
*********************************
*	2	*	-2.45	*	2.45	*
*********************************
*	3	*	0		*	0.0		*
*********************************


*/
/*
Method Header-

public static double findAbsolute(double number)

*/

/*
Pseudo Code-

1. Check if number == 0, singke case.
2. If yes return 0.
3. Check if number is less than 0.
4. If yes, return -number.
5. Else return number.

*/

public class Question14
{
	public static double findAbsolute(double number)
	{
		if (number==0)
			return 0.0;
		if (number<0)
			return -number;
		else
			return number;
	}
	
	public static void main(String[] args)
	{
		double number;
		
		number = 2.45;
		System.out.println(findAbsolute(number));
		
		number = -2.45;
		System.out.println(findAbsolute(number));
		
		number = 0;
		System.out.println(findAbsolute(number));
	}
}

/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 12

Description: 

Write a program to print the Greatest and Smallest among three numbers.

*/

/*
Test Cases-

*****************************************************************************
*	#	*	number1	*	number2	*	number3	*	greatest	*	smallest	*
*****************************************************************************
*	1	*	2		*	3		*	4		*	4.0			*	2.0			*
*****************************************************************************
*	2	*	2.5		*	2.6		*	2.7		*	2.7			*	2.5			*
*****************************************************************************
*	3	*	-2		*	-3		*	-4		*	-2.0		*	-4.0		*
*****************************************************************************
*	4	*	-2.5	*	-2.6	*	-2.7	*	-2.5		*	-2.7		*
*****************************************************************************

*/

/*
Method Header-
public static String findGreatestAndSmallest(double number1,double number2, double number3)

*/

/*
Pseudo Code-

1. Check if number1 is greater than both number3 and number2.
2. If yes, check if number2 is greater than number3.
3. If yes return "Greatest is number1 and Smallest is number3".
4. Else, return "Greatest is number1 and Smallest is number2".
5. Else, check if number2 is greater than number1 and number3.
6. If yes, check if number1 is greater than number3.
7. If yes return "Greatest is number2 and Smallest is number3".
8. Else, return "Greatest is number2 and Smallest is number1".
9. Else, check if number2 is greater than number1.
10. If yes, return "Greatest is number3 and Smallest is number1".
11. Else, return "Greatest is number3 and Smallest is number2".

*/

public class Question12
{
	public static String findGreatestAndSmallest(double number1,double number2, double number3)
	{
		if(number1>=number2 && number1>=number3)
		{
			if(number2>=number3)
				return ("Greatest is "+number1+" and Smallest is "+number3);
			else
				return ("Greatest is "+number1+" and Smallest is "+number2);
		}
		else if(number2>=number1 && number2>=number3)
		{
			if(number1>=number3)
				return ("Greatest is "+number2+" and Smallest is "+number3);
			else
				return ("Greatest is "+number2+" and Smallest is "+number1);
		}
		else
		{
			if(number1>=number2)
				return ("Greatest is "+number3+" and Smallest is "+number2);
			else
				return ("Greatest is "+number3+" and Smallest is "+number1);
		}
	}
	
	public static void main(String[] args)
	{
		double number1,number2,number3;
		
		number1 = 2;
		number2 = 3;
		number3 = 4;
		System.out.println(findGreatestAndSmallest(number1,number2,number3));
		
		number1 = 2.5;
		number2 = 2.6;
		number3 = 2.7;
		System.out.println(findGreatestAndSmallest(number1,number2,number3));
		
		number1 = -2;
		number2 = -3;
		number3 = -4;
		System.out.println(findGreatestAndSmallest(number1,number2,number3));
		
		number1 = -2.5;
		number2 = -2.6;
		number3 = -2.7;
		System.out.println(findGreatestAndSmallest(number1,number2,number3));
	}
}

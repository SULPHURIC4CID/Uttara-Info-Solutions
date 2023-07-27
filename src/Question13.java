/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 13

Description: 

Consider two in values for length and breadth and check if it is a square or rectangle.


*/

/*

Test Cases-

*********************************************
*	#	*	length	*	breadth	*	Output	*
*********************************************
*	1	*	3.5		*	3.5		*	Square	*
*********************************************
*	2	*	3.5		*	4.5		* Rectangle	*
*********************************************
*	3	*	0		*	+ve		*	Invalid	*
*********************************************
*	4	*	+ve		*	0		*	Invalid	*
*********************************************
*	5	*	0		*	0		*	Invalid	*
*********************************************
*	6	*	-ve		*	-ve		*	Invalid	*
*********************************************


*/

/*
Method Header-


public static String checkShape(double length, double breadth)

*/

/*
Pseudo Code-

1. Check if both length and breadth and strictly positive.
2. If not, return "Invalid".
3. check if length is equal to breadth.
4. If yes return "Square".
5. Else, return "Rectangle".

*/

public class Question13
{
	public static String checkShape(double length, double breadth)
	{
		if (length <=0 || breadth <= 0)
			return "Invalid";
		if (length == breadth)
			return "Square";
		else
			return "Rectangle";
		
	}
	
	public static void main(String[] args)
	{
		double length,breadth;
		
		length = 3.5;
		breadth = 3.5;
		System.out.println(checkShape(length,breadth));
		
		
		length = 3.5;
		breadth = 4.5;
		System.out.println(checkShape(length,breadth));
		
		
		length = 0;
		breadth = 3;
		System.out.println(checkShape(length,breadth));
		
		
		length = 3;
		breadth = 0;
		System.out.println(checkShape(length,breadth));
		
		
		length = 0;
		breadth = 0;
		System.out.println(checkShape(length,breadth));
		
		
		length = -2;
		breadth = -2;
		System.out.println(checkShape(length,breadth));
	}
}

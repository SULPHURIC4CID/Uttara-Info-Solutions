/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 16

Description: 
Convert the following if-else-if construct into switch case:
if(var == 1)
System.out.println("good");
else if(var == 2)
System.out.println("better");
else if(var == 3)
System.out.println("best");
else
System.out.println("invalid");
*/

/*
Test Cases-

*****************************
*	#	*	var	*	output	*
*****************************
*	1	*	1	*	good	*
*****************************
*	2	*	2	*	better	*
*****************************
*	3	*	3	*	best	*
*****************************
*	4	* others*	invalid	*
*****************************


*/

/*
Method Header-

public static void convert(int var)

*/



public class Question16
{
	public static void convert(int variable)
	{
		switch(variable)
		{
			case 1:
				System.out.println("good");
				break;
			case 2:
				System.out.println("better");
				break;
			case 3:
				System.out.println("best");
				break;
			default:
				System.out.println("invalid");
				break;			
		}
	}
	
	public static void main(String[] args)
	{
		int variable;
		
		variable = 1;
		convert(variable);
		
		variable = 2;
		convert(variable);
		
		variable = 3;
		convert(variable);
		
		variable = 6;
		convert(variable);
		
	}
}

/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 15

Description: 
Write a program to check whether a given character is lowercase ( a to z ) or uppercase
( A to Z ). (You can use the range of ASCII values to do so).

*/

/*
Test Cases-


*****************************************
*	#	*	character		*	output	*
*****************************************
*	1	*		a			*	lower	*
*****************************************
*	2	*		A			*	upper	*
*****************************************
*	3	*		68			*	upper	*
*****************************************
*	4	*		99			*	lower	*
*****************************************
*	4	* !(65-90 || 97-122)*	invalid	*
*****************************************


*/
/*
Method Header-

public static String findCase(char character)

*/

/*
Pseudo Code-

1. Check if the character lies between 65-90 or 97-122.
2. If not, return "invalid".
3. Check if character is greater than equal to 65.
4. If yes, return "lower".
5. Else, return "upper".

*/

public class Question15
{
	public static String findCase(char character)
	{
		if (character<=64 || character>=123 || (character>=91 && character<=96))
			return "invalid";
		if (character>=97)
			return "lower";
		else
			return "upper";
	}
	
	public static void main(String[] args)
	{
		char character;
		
		character = 'a';
		System.out.println(findCase(character));
		
		character = 'A';
		System.out.println(findCase(character));
		
		character = 68;
		System.out.println(findCase(character));
		
		character = 99;
		System.out.println(findCase(character));
	
		character = 125;
		System.out.println(findCase(character));
	}
}

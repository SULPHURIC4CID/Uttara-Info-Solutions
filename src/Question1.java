/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 1

Description: 
Write a program to find the sum of n natural numbers using a looping statement in Java.
For example, consider n=10.(Which loop do you use for this and why?).


Answer:
All three loops can be used, butt intuitively for loop is best as the number of iterations are predetermined.

*/

/*
Test Cases-

*************************************************************
*	#	*			n			*			Output			*
*************************************************************
*	1	*			10			*			55				*
*************************************************************
*	2	*			0			*			-1				*
*************************************************************
*	3	*	Integer.MAX_VALUE	*	2305843008139952128		*
*************************************************************
*	4	*			-ve			*			-1				*
*************************************************************

*/

/*
Pseudo Code-

1. Check if the value of n is <=0.
2. Return -1 if true.
3. Declare and initialize a long varaible sum to 0.
4. Run a for loop starting from 0 to (n-1).
5. Increment sum with the value of i.
6. Retrun the value of sum.
*/

/*
Method header-

public static long findSum (int n)

*/



public class Question1
{
	public static long findSum (int n)
	{
		if (n <= 0)
			return -1;
		long sum = 0;
		for(int i=0;i<=(n-1);i++)
		{
			sum+=(i+1);
		}			
		return sum;
	}
	/*
	public static long findSum2(int n)
	{
		int i = 1;
		long sum = 0;
		do
		{
			sum+=i;
		}while(i++<n);
		return sum;
	}
	*/
	
	public static void main(String[] args)
	{
		int n;
		
		n = 10;
		System.out.println(findSum(n));
		
		n = 0;
		System.out.println(findSum(n));
		
		n = Integer.MAX_VALUE;
		System.out.println(findSum(n));
		//System.out.println(findSum2(n));
		
		
		n = -3;
		System.out.println(findSum(n));
	}
}


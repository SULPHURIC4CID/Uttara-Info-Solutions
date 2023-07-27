/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 4

Description: 

Write an equivalent while() loop for the following for() loop.
int s=0;
for(int x=1; x<=25; x+=2)
s+=x;
Think and Remember:
● Why and when do we use while loop
● Why and when do we use for loop
● Why and when do we use do - while loop


Answers-
●When we need to control the iterations based on a condition we use While loop
●When we have the number of iterations known beforehand we use For loop
●When we need to control the iterations based on a condition that needs to execute at least once we use Do-While loop

*/

public class Question4
{
	public static void convert()
	{
		int s = 0;
		int x = 1;
		while(x<=25)
		{
			s+=x;
			x+=2;
		}
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		System.out.println();
		convert();
	}
}

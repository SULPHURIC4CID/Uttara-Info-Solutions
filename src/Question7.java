/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 7

Description: 

What is the final value of ctr when the iterative process given below executes?
int ctr = 0;
for(int i=1 i<5;i++);
for(int j=1 i<=5; j+=2);
System.out.println(++ctr);

output: 1


*/

public class Question7
{
	public static void main(String[] args)
	{
		int ctr = 0;
		for(int i=1; i<5;i++);
		for(int j=1; j<=5; j+=2);
		System.out.println(++ctr);
	}
}

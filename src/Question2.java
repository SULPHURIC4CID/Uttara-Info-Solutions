/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 2

Description: 
Convert the following while loop to the corresponding for loop
int m = 5, n = 10;
while (n>=1)
{
System.out.println(m*n);
n–-;
}


*/

public class Question2
{
	public static void convert()
	{
		for(int n = 10,m = 5;n>=1;n--)
		{
			System.out.println(m*n);
		}			
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		convert();
	}
}

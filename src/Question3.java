/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 3

Description: 

Convert following do-while loop into for loop.
int i=1;
int d=5;
do{
d=d*2
System.out.println(d);
i++;
}while(i<=5);


*/

public class Question3
{
	public static void convert()
	{
		for(int i = 1,d = 10;i<=5;i++,d*=2)
		{
			System.out.println(d);
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		convert();
	}
}

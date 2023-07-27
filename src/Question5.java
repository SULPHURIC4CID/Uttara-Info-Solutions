/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 5

Description: 

Study the method and answer the given questions:
public void forSampleMethod()
{
for(int i=0;i<3;i++) {
for(int j=0;j<2;j++) {
int number = (int)(Math.random() * 10);
System.out.println(number);
}
}
}
● How many times in total will the inner loop execute? - 6 times
● What is the range of possible values stored in the variable number? - 0 to 9


*/

public class Question5
{	
	public static void forSampleMethod()
	{
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<2;j++) 
			{
				int number = (int)(Math.random() * 10);
				System.out.println(number);
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println();
		forSampleMethod();
	}
}

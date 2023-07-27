/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 21

Description: 

What will be the output of the following code snippets?
*/


public class Question21
{
	public static void executePart1()
	{
		/*
		
		for (int i = 0; i < 10; i++) 
		{
			if (i == 5)
				break;
			System.out.println("i: " + i);
		}
		System.out.println("Out of Loop");
		
		Output:
		i: 0
		i: 1
		i: 2
		i: 3
		i: 4
		Out of Loop
		
		*/
		for (int i = 0; i < 10; i++) 
		{
			if (i == 5)
				break;
			System.out.println("i: " + i);
		}
		System.out.println("Out of Loop");
	}
	
	public static void executePart2()
	{
		/*
		
		int j=1;
		for(int i=1;i<5;i++)
		{
			j*=i;
			{
				break;
			}
		}
		System.out.print(j);
		
		Output:
		1
		*/
		
		int j=1;
		for(int i=1;i<5;i++)
		{
			j*=i;
			{
				break;
			}
		}
		System.out.print(j);
		
	}
	
	public static void executePart3()
	{
		/*
		
		int j=1;
		for(int i=1;i<3;i++)
		{
			j*=i;
			for(;;){
				break;
			}
			continue;
		}
		System.out.print(j);
		
		output:
		2
		
		*/
		int j=1;
		for(int i=1;i<3;i++)
		{
			j*=i;
			for(;;){
				break;
			}
			continue;
		}
		System.out.print(j);
		
	}
	
	public static void executePart4()
	{
		/*
		
		int a=2;
		if(a==2)
			break first;
			System.out.print("step1");
			first:
			System.out.println("step2");
		
		Output:
		Compile time error : undefined label first
		
		*/
		
		/*
		int a=2;
		if(a==2)
			break first;
			System.out.print("step1");
			first:
			System.out.println("step2");
		*/
	}
	
	public static void executePart5()
	{
		/*
		
		int a=2;
		india: {
			++a;
			if(a==3)
			break india;
		}
		System.out.print(a);
		
		Output:
		
		3
		
		*/
		int a=2;
		india: {
			++a;
			if(a==3)
			break india;
		}
		System.out.print(a);
		
	}
	public static void main(String[] args)
	{
		//executePart1();
		//executePart2();
		//executePart3();
		//executePart4();
		executePart5();
	}
}

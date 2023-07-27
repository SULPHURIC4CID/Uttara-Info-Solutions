/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 17

Description: 
Find the output in the following code snippet:
int ch=2;
switch(ch) {
case 1: System.out.println("All courses");
Break;
case 2: System.out.println("Simply Coding ");
case 3: System.out.println("Best Study Material");
}


Output:
Compile error as B is capital in break.

If adjusted then output is-
Simply Coding
Best Study Material
*/


public class Question17
{
	public static void main(String[] args)
	{
		int ch=2;
		switch(ch) 
		{
		case 1: 
			System.out.println("All courses");
			break;
		case 2: 
			System.out.println("Simply Coding ");
		case 3: 
			System.out.println("Best Study Material");
}
		
	}
}

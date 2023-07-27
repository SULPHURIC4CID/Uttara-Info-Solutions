/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 9

Description: 

char ch;
int x = 97;
do {
ch = (char) x;
System.out.print(ch + " ");
if (x % 10 == 0)
break;
++x;
} while (x <= 100);
Do you understand what is happening in the above block of code ? do a dry run
on paper, what will be printed on the screen? understand the flow of control, then code
and run and check your output with your answer.


Output:


a b c d


*/

public class Question9
{
	public static void main(String[] args)
	{
		char ch;
		int x = 97;
		do 
		{
			ch = (char) x;
			System.out.print(ch + " ");
			if (x % 10 == 0)
				break;
			++x;
		} while (x <= 100);
	}
}

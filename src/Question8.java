/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 8

Description: 
How do you print the following pattern using loops in Java
5
45
345
2345
12345


*/

/*

Test Cases

*****************************************
*	#	*	input	*		output		*
*****************************************
*	1	*	5		*		5			*
*		*			*		45			*
*		*			*		345			*
*		*			*		2345		*
*		*			*		12345		*
*****************************************
*	2	*	7		*		7			*
*		*			*		67			*
*		*			*		567			*
*		*			*		4567		*
*		*			*		34567		*
*		*			*		234567		*
*		*			*		1234567		*
*****************************************
*	3	*	-ve		*		print(-1)	*
*****************************************
*	4	*	0		*		print(-1)	*
*****************************************


*/

/*

Pseudo Code

1. Check if n<= 0.
2. If yes, print (-1) and return.
3. Run a for loop from i = n till i = 1.
4. Run another inner for loop from j=i till j=n.
5. Print j on the same line.
6. after the terminatino of the outer loop, go to next line.
*/

public class Question8
{
	public static void printPattern(int n)
	{
		if (n<=0)
		{
			System.out.println(-1);
			return;
		}	
		
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int n;
		
		n = 5;
		printPattern(n);
		
		n = 7;
		printPattern(n);
		
		n = -3;
		printPattern(n);
		
		n = 0;
		printPattern(n);
	}
}

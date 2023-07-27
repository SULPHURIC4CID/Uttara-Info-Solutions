/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 6

Description: 

What will be the output for the following code?
public static void main(String[] args)
{
int i = 1;
int j = 20;
int k = 31;
while (i < j) {
k += (i * j);
i = i * 2;
j--;
}
System.out.println("i = " + i + " j = " + j + " k = " + k);
}

Truth Table-

*****************************************
*	#	*	i	*	j	*	k	* (i<j)	*
*****************************************
*	0	*	1	*	20	*	31	*		*
*****************************************
*	1	*	2	*	19	*	51	*	T	*
*****************************************
*	2	*	4	*	18	*	89	*	T	*
*****************************************
*	3	*	8	*	17	*	161	*	T	*
*****************************************
*	4	*	16	*	16	*	297	*	T	*
*****************************************
*	5	*		*		*		*	F	* -> exits the while loop
*****************************************

Output: i = 16 j = 16 k = 297




*/

public class Question6
{
	public static void main(String[] args)
	{
		int i = 1;
		int j = 20;
		int k = 31;
		while (i < j) {
			k += (i * j);
			i = i * 2;
			j--;
		}
		System.out.println("i = " + i + " j = " + j + " k = " + k);
	}
}

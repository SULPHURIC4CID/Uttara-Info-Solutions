/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 11

Description: 

If x = 2, y = 5, z = 0, then find values of the following expressions:
a. x == 2 - True
b. x != 5 - True
c. x != 5 && y >= 5 - True
d. z != 0 || x == 2 - True
e. !(y < 10) - False


*/

public class Question11
{
	public static void main(String[] args)
	{
		int x = 2, y = 5, z = 0;
		System.out.println(x==2);
		System.out.println(x!=5);
		System.out.println(x!=5 && y>=5);
		System.out.println(z!=0 || x==2);
		System.out.println(!(y<10));
	}
}

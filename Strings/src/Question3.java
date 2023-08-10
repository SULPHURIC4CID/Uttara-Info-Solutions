/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 3

Description:

Write a program to check if two strings are equal.
*/

public class Question3
{
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "Anantha";
		String s1 = "anantha";
		String result = s.equals(s1) ? "The strings "+s+" and "+s1+" are equal.":"The strings "+s+" and "+s1+" are not equal.";
		System.out.println(result);
	}
}
/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 4

Description:

How can you concatenate two strings in Java?
*/

public class Question4
{
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "Anantha";
		String s1 = "anantha";
		
		//Method 1 - Using + operator
		String s3 = s + s1;
		System.out.println("Conacted String is :"+s3);
		
		//Method 2 - USing .concat method of String class
		s3 = s.concat(s1);
		System.out.println("Conacted String is :"+s3);
		
	}
}
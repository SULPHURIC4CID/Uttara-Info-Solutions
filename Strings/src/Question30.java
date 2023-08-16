/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 30

Description:

Write a program that generates all possible permutations of a
given string.
*/

public class Question30
{	
	public static void findPermutations(String s,String s1)
	{
		//Failure case
		if(s==null)
			return;
		if(s.isEmpty() && s1.isEmpty())
			return;
		
		//Non Failure case
		if(s.length() == 0)
			System.out.println(s1+ " ");
		
		//Get the single character, append left+right half and recursively call the findPermutations method
		for(int i = 0;i<s.length();i++)
			findPermutations(s.substring(0,i)+s.substring(i+1),s1+s.charAt(i));
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "Java";
		System.out.println("All possible permutations of the string \""+s+"\" are ");
		findPermutations(s,"");
	}
}
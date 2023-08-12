/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 8

Description:

How can you extract a substring from a given string?
*/

public class Question8
{
	public static void main(String[] args)
	{
		System.out.println();
		String s = "ABCDCBA";
		int startingIndex = 4;
		int endingIndex = 7;
		String sub = s.substring(startingIndex,endingIndex);
		// extracts char from startingIndex to endingIndex-1
		// if endingIndex is not specified, then it extracts till end of word.
		System.out.println(sub);
	}
}
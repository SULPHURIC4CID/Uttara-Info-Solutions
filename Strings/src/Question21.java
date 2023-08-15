/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 21

Description:

Implement a function to perform string rotation. For example,
"hello" becomes "lohel" after two rotations.
*/

public class Question21
{
	public static String rotateString(String s,int rotateCount)
	{
		rotateCount = rotateCount%s.length();
		return s.substring(s.length()-rotateCount)+s.substring(0,s.length()-rotateCount);
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "hello";		
		int rotateCount = 2;
		System.out.println("The String \""+s+"\" rotated "+rotateCount+" times is : "+rotateString(s,rotateCount));		
	}
}
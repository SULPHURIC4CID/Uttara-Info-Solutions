/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 19

Description:

Implement a function that compresses a string by replacing
repeated characters with their count.
*/

public class Question19
{
	public static String compressString(String s)
	{
		if(s==null || s.isEmpty())
			return s;
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char ch = s.charAt(0);
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				count++;
			else
			{
				sb.append(count);
				sb.append(ch);
				count=1;
				ch = s.charAt(i);
			}
		}
		sb.append(count);
		sb.append(ch);
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "aaaaaacccceefggfeeaaaafa";
		System.out.println("The original String was  : "+s);
		System.out.println("The compressed String is : "+compressString(s));
	}
}
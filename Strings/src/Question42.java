/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 42

Description:

Write a function that performs a "Run Length Encoding" on a given
string.
*/

public class Question42
{	
	public static String runLengthEncoding(String s)
	{
		if(s==null || s.isEmpty())
			return s;
		StringBuilder sb = new StringBuilder();
		int count = 0;
		char ch = s.charAt(0);
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == ch)
				count++;
			else
			{
				sb.append(count);
				sb.append(ch);
				count = 1;
				ch = s.charAt(i);
			}		
		}
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "aaaaaaaaaaaaaaaaaaaabdbdbdajsbdasskskkksiadadddd";
		String result = runLengthEncoding(s);
		System.out.println("The run length encoded compression of the sentence \""+s+"\" is : "+result);
	}
}
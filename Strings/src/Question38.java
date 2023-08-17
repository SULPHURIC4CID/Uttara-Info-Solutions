/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 38

Description:

Create a program that checks if a string follows the pattern
"aabbcc".
*/

public class Question38
{	
	public static boolean followsPattern(String s, String pattern)
	{
		if(s==null || s.isEmpty())
			return false;
		if(pattern==null || pattern.isEmpty())
			return false;
		if(s.length() % pattern.length()!=0)
			return false;
		
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i%pattern.length()) != pattern.charAt(i%pattern.length()))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String pattern = "aabbcc";
		//String s = "aabbccaabbccaabbccaabbcc";
		//String s = "abcdefghijk";
		String s = "aabbccaabbccaabbccaabbc";
		String result = followsPattern(s,pattern)? "The string \""+s+"\" does follow the pattern \""+pattern+"\"":"The string \""+s+"\" does not follow the pattern \""+pattern+"\"";
		System.out.println(result);
	}
}
/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 29

Description:

Create a function that converts a camelCase string to a
snake_case string.
*/

public class Question29
{	
	public static String convertCamelToSnake(String s)
	{
		if(s==null || s.isEmpty() || s.length()==1)
			return s;
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length();i++)
		{
			if((int)s.charAt(i) >=65 && (int)s.charAt(i) <=90)
			{
				sb.append('_');
				sb.append((char)((int)s.charAt(i)+32));
			}
			else
			{
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "javaIsTheBestLanguageToLearn";
		System.out.println("The string \""+s+"\" converted to snake case is :"+convertCamelToSnake(s));
	}
}
/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 6

Description:

Create a Java program to convert a string to uppercase.
*/

public class Question6
{
	public static String convertToUpperCase(String s)
	{
		//97-122 lower case
		//48-57	digits
		//65-90 upper case
		if(s.isEmpty())
			return s;
		if(s==null)
			return s;
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length();i++)
		{
			if((int)s.charAt(i) >=97 && (int)s.charAt(i)<=122)
				sb.append((char)(s.charAt(i)-32));
			else
				sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "Anantha";
		System.out.println("The string "+s+" when converted to uppercase is : "+convertToUpperCase(s));
		
		
	}
}
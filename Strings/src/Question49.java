/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 49

Description:

Implement a program to convert a string to its "title case" form
(capitalize the first letter of each word).
*/

public class Question49
{
	public static String convertToTitleCase(String s)
	{
		//Failure case
		if(s==null || s.trim().isEmpty())
			return s;
		
		//Pre-processing
		s = s.trim();		
		
		//Main Logic - Make the first letter and all letters after spaces to capital.
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<s.length();i++)
		{
			if(i==0)
			{
				if((int)s.charAt(0)>=97 && (int)s.charAt(0)<=122)
					sb.append((char)((int)s.charAt(0)-32));
				else
					sb.append(s.charAt(0));
			}
			else if(s.charAt(i)==' ')
			{
				sb.append(' ');
				if((int)s.charAt(i+1)>=97 && (int)s.charAt(i+1)<=122)
					sb.append((char)((int)s.charAt(i+1)-32));
				else
					sb.append(s.charAt(i+1));
				i++;
			}	
			else			
				sb.append(s.charAt(i));
		}	
	return 	sb.toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "Java is a great language to learn.";
		int k = 5;		
		System.out.println("The original string is : "+s);		
		String result = convertToTitleCase(s);
		System.out.println("The string converted to title case is :"+result);
	}
}
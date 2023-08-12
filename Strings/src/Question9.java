/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 9

Description:

Write a program to replace all occurrences of a specific character in a
string.
*/

public class Question9
{
	public static String customReplace(String s,String rep,String toRep)
	{
		//Single checks
		if(s==null)
			return null;
		if(s.isEmpty())
			return s;
		if(rep==null)
			return s;
		if(rep.isEmpty())
			return s;
		if(toRep == null)
			return s;
		if(toRep.isEmpty())
			return s;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length();i++)
		{
			if((s.charAt(i)==rep.charAt(0)) && (i+rep.length()<=s.length()))
			{
				//check other characters till length of rep.
				int count = 0;
				for(int j = 0;j<rep.length();j++)
				{
					if(s.charAt(i+j) != rep.charAt(j))
						break;
					count++;						
				}
				if(count==rep.length())
				{
					//replacement character has been found in the string
					sb.append(toRep);
					i = i + rep.length() -1;
				}
				else
				{
					sb.append(s.charAt(i));
				}
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
		String s = "anantha";
		String toBeReplaced = "a";
		String replacementString = "ABC";
		System.out.println(s.replace(toBeReplaced,replacementString));
		System.out.println(customReplace(s,toBeReplaced,replacementString));
	}
}
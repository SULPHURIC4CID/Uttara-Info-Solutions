/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 47

Description:

Create a program that generates all possible substrings of a given
string.
*/

public class Question47
{
	public static int wordInArray(String s, String[] arr)
	{			
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] != null)
				if(arr[i].equals(s))
					return i;
		}
		return -1;
	}
	
	public static String[] getSubstrings(String s)
	{
		//Failure Case
		String[] temp = new String[1];
		if(s==null || s.isEmpty())
		{
			temp[0] = "Null/Empty";
			return temp;
		}
		int length = s.length()*(s.length()+1)/2;
		String[] arr = new String[length];
		int index = 0;
		
		for(int i = 0;i<s.length();i++)
		{
			for(int j = i+1;j<s.length()+1;j++)
			{
				if(wordInArray(s.substring(i,j),arr)<0)
				{
					arr[index] = s.substring(i,j);					
					index++;
				}
			}
		}
		String[] result = new String[index];
		for(int i = 0;i<index;i++)
		{
			result[i] = arr[i];
		}
		return result;		
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "Java is";
		System.out.println();
		System.out.println("The possible substrings are-");
		String[] substringArray = getSubstrings(s);
		for(int i = 0;i<substringArray.length;i++)
			System.out.println(substringArray[i]);
	}
}
/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 24

Description:

Implement a function that finds the longest common prefix among
an array of strings.
*/

public class Question24
{	
	public static String findCommonPrefix(String[] words)
	{
		//Failure Case
		if(words==null)
			return "String array is NULL";
		if(words.length==0)
			return "The String array is EMPTY.";
		for(int i =0;i<words.length;i++)
			if(words[i] == null)
				return "At least an element of the String array is NULL.";
			
		//Single Case
		for(int i =0;i<words.length;i++)
			if(words[i].isEmpty())
				return "";
		
		//Finding shortest word in the String Array
		int length = Integer.MAX_VALUE;
		String shortestWord = words[0];
		for(int i =0;i<words.length;i++)
		{
			//System.out.println(words[i]);
			if(words[i].length()<length)
			{
				shortestWord = words[i];
				length = shortestWord.length();
			}
		}
		
		//Check if the letters of the shortest words occur in the other words
		StringBuilder sb = new StringBuilder();
		int count;
		for(int i =0;i<length;i++)
		{	
			count=0;
			for(int j=0;j<words.length;j++)
				if(shortestWord.charAt(i) == words[j].charAt(i))
					count++;
			if(count==words.length) // If all words have that character then append
				sb.append(shortestWord.charAt(i));			
			else //if all the words don't have the common character then break
				break;			
		}
		return sb.toString();
		
	}
	public static void main(String[] args)
	{
		System.out.println();		
		String[] words = {"javac","jav","java","ja","ja"};
		System.out.println("The given words are : ");
		for(int i = 0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		String result = findCommonPrefix(words);
		System.out.println("The common prefix of the above words is : "+result);
	}
}
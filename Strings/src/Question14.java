/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 14

Description:

Create a Java program to count the occurrences of a specific word
in a string.
*/

public class Question14
{
	public static int countWordOccurance(String s,String word)
	{
		if(s==null || s.isEmpty())
			return -1;
		if(word==null | word.isEmpty())
			return 0;
		
		//PreProcessing the arguments
		s = s.trim();
		word = word.trim();
		
		//Find number of words
		int spaceCount=0;
		for(int i = 0;i<s.length();i++)
			if(s.charAt(i) == ' ')
				spaceCount++;
		
		//Total number of words is #space+1
		String[] words = new String[spaceCount+1];
		int index = 0;
		
		//Next, lets populate the words String array with the words from the sentence
		//USing 2 pointer approach for capturing the word in the sentence
		int start = 0;
		int end = s.length();
		for(int i = 0;i<s.length();i++)		
			if(s.charAt(i) == ' ')
			{
				end = i;
				//System.out.println("Start = "+start+" end = "+end);
				words[index++] = s.substring(start,end);				
				start = i+1;
			}			
		words[index++] = s.substring(start,s.length());
		
		//Counting the number of occurances of the word
		int wordOccuranceCount = 0;
		for(int i = 0;i<index;i++)
			if(!words[i].isEmpty())
				if(words[i].equals(word))
					wordOccuranceCount++;		
		
		return wordOccuranceCount;
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "   java     is the best programming language, java is powerful and java is awesome.   ";
		String word = "java";		
		System.out.println("The word \""+word+"\" occurs "+countWordOccurance(s,word)+" times in the sentence : "+s);			
	}
}
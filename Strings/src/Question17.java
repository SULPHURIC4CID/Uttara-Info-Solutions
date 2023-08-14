/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 17

Description:

Create a program to reverse the words in a sentence, while
keeping the order of words intact.
*/

public class Question17
{
	public static String reverseLettersInWordInSentence(String s)
	{
		if (s==null || s.isEmpty())
			return s;
		
		//PreProcessing the arguments
		s = s.trim();
		
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
		
		//Apennding the words
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<index;i++)
		{
			if(!words[i].isEmpty())
			{
				StringBuilder sbTemp = new StringBuilder(words[i]);
				sbTemp.reverse(); //Reversing the individual words
				sb.append(sbTemp);
				sb.append(' ');
			}			
		}
		return sb.substring(0,sb.length()-1).toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "java is the best programming language , java is powerful and java is awesome .";
		System.out.println("The sentence with the letters of the words reversed in the sentence : "+reverseLettersInWordInSentence(s));
	}
}
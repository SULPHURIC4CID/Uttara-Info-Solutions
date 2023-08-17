/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 34

Description:

Implement a program to find the second most frequent character in
a string.
*/

public class Question34
{
	public static char findSecondMostFrequentCharacter(String s)
	{
		if(s==null || s.isEmpty() || s.length()==1)
			return '?';
		
		//Get unique charcaters and their frequency
		StringBuilder sb = new StringBuilder("");
		int[] count = new int[s.length()];
		int index = 0;
		for(int i = 0;i<s.length();i++)
			if(sb.indexOf(s.substring(i,i+1))<0)
			{	
				sb.append(s.charAt(i));
				count[index++] = 1;
			}
			else
				count[sb.indexOf(s.substring(i,i+1))]++;
		
		//Find the second max value of count
		int maxVal = Integer.MIN_VALUE;
		int maxVal2 = Integer.MIN_VALUE;
		for(int i = 0;i<index;i++)
			if(count[i]>maxVal)
			{
				maxVal2 = maxVal;
				maxVal = count[i];
			}
			else if(count[i] > maxVal2)
				maxVal2 = count[i];
		
		//Find index of minVal2 in count array
		for(int i =0;i<index;i++)
			if(count[i] == maxVal2)
				return sb.charAt(i);
		if(index==1)
			return '?';
		return '?';
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "MMMCMXCVIII";		
		System.out.println("The second most frequent character in the string \""+s+"\" is :" + findSecondMostFrequentCharacter(s));
	}
}
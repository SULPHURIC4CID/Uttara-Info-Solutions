/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 37

Description:

Implement a function that returns the frequency of each character
in a string.
*/

public class Question37
{	
	public static String[][] getCharacterFrequency(String s)
	{
		//Failure Case
		String[][] temp = new String[2][1];
		if(s==null)
		{		
			temp[0][0] = "null";
			temp[1][0] = "-";
			return temp;
		}
		if(s.isEmpty())
		{
			temp[0][0] = "empty";
			temp[1][0] = "-";
			return temp;
		}
		
		//Extarcting unique characters and their frequency
		StringBuilder sb = new StringBuilder();
		int[] count = new int[s.length()];
		int index = 0;
		for(int i =0;i<s.length();i++)
			if(sb.indexOf(s.substring(i,i+1))<0)
			{
				sb.append(s.charAt(i));
				count[index++] = 1;
			}
			else
				count[sb.indexOf(s.substring(i,i+1))]++;
		
		//Storing the extarcted characters and frequency into a 2D String array
		String[][] temp2 = new String[2][index];
		for(int i =0;i<index;i++)
		{
			temp2[0][i] = String.valueOf(sb.charAt(i));
			temp2[1][i] = String.valueOf(count[i]);
		}
		return temp2;
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "Java is a fun language to learn and write";
		System.out.println("The frequency of the characters are as shown below :");
		String[][] arr = getCharacterFrequency(s);
		for(int i =0;i<arr[0].length;i++)
			System.out.println(arr[0][i] +" : "+arr[1][i]);
	}
}
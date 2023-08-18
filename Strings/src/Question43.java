/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 43

Description:

Implement a program to find the lexicographically smallest and
largest substrings of a given length from a string.
*/

public class Question43
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
	
	// ` - ASCII 96 (back tick)
	// { - ASCII 123
	public static String[] findLexicographicallySmallestAndLargest(String s,int length)
	{
		//Failure Case
		String[] temp = new String[2];
		if(s==null || s.trim().isEmpty())
		{
			temp[0] = "Null";
			temp[1] = "Empty";
			return temp;
		}
		
		if(s.length() < length)
		{
			temp[0] = "Short Word";
			temp[1] = "Short Word";
			return temp;
		}
		
		//Pre-Processing
		s = s.toLowerCase();
		String smallest = "";
		String largest = "";
		for(int i =0;i<length;i++)
		{
			smallest+='`';
			largest+='{';
		}
		
		
		//Main Logic - compore with "````...````" and "{{{{...{{{{"
		String[] arr = new String[length];
		int index = 0;		
		
		for(int i =0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length()+1;j++)
			{
				if((j-i+1) == length+1)
				{
					//Comapre and Swap string based on condition
					if(s.substring(i,j).compareTo(largest)<0)
						largest = s.substring(i,j);
					if(s.substring(i,j).compareTo(smallest)>0)
						smallest = s.substring(i,j);
				}
			}
		}
		//Assign the extracted value to the String[], lexicographically lowest in 0 index and highest in 1 index
		temp[0] = largest;
		temp[1] = smallest;
		return temp;
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "aaaaaaaaaaaaaaaaaaaabdbdbdajsbdasskskkksiadadddd";
		System.out.println("The original string is :"+s);
		int length  = 8;
		String[] result = findLexicographicallySmallestAndLargest(s,length);
		System.out.println(result[0]+" : "+result[1]);
	}
}
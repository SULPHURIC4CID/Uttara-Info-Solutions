/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 25

Description:

Create a program that checks if a string is a valid number (integer
or decimal).
*/

public class Question25
{	

	public static boolean checkStringIsNumeric(String s)
	{
		//Failure Case
		if(s==null || s.isEmpty())
			return false;
		
		if(s.charAt(s.length()-1)=='.') // When String = "XXXXX."
			return false;
		
		//Finding the number of 0-9s and .
		int[] arr = new int[11];
		int value;
		for(int i =0;i<s.length();i++)
		{
			value = (int)s.charAt(i);
			if((value >= 48) && (value <=57) || value == 46)
				if(value==46)
					arr[10]++;
				else
					arr[value-48]++;
			else
				return false;
		}
		//If there are more than 1 . then return false as its failure case
		if(arr[10]>1)
			return false;
		//Else return true
		return true;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "123.6789";
		String result = checkStringIsNumeric(s)?"The string \""+s+"\" is a valid numeric value.":"The string \""+s+"\" is not a valid numeric value.";
		System.out.println(result);
	}
}
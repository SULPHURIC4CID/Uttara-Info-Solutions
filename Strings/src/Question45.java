/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 45

Description:

Write a Java program to check if a string can be formed by
shuffling characters of two other strings.

*/

public class Question45
{	
	public static void sortArray(char[] array)
	{
		for(int i = 0;i<array.length;i++)
		{
			for(int j = 0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					char temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static boolean shuffle(String s1,String s2, String target)
	{
		//Failure and Single Cases
		if(target == null && (s1 == null || s2 == null))
			return true;
		if(target==null && s1 != null && s2 != null)
			return false;
		if(target=="")
			return true;
		if(target.length()>0 && s1.isEmpty() && s2.isEmpty())
			return false;
		if(target.length()>(s1.length()+s2.length()))
			return false;
		
		//PreProcessing if one of the source is null
		if(target!= null && s1 == null && s2!=null)
			s1 = "";
		if(target!= null && s1 != null && s2==null)
			s2 = "";
		
		
		//Conactenating the two source strings
		String source = s1+s2;
		char [] sourceArray = source.toCharArray();
		char [] targetArray = target.toCharArray();
		//Sorting the char arrays and loading back into String
		sortArray(sourceArray);
		sortArray(targetArray);
		source = new String(sourceArray);
		target = new String(targetArray);
		
		
		//Main Logic - Checks if the letters inthe sorted target are present in the sorted concated source at appropriate index positions
		int index = 0;
		for(int i = 0;i<target.length();i++)
		{
			if(source.substring(index).indexOf(target.charAt(i))>=0)
				index = source.substring(index).indexOf(target.charAt(i));
			else
				return false;
		}		
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s1 = "java is a fun program to learn";
		String s2 = "camel case is the best";
		String target = "cavaj";
		String result = shuffle(s1,s2,target)?"The string \""+target+"\" can be constructed by shuffling characters of the source strings \""+s1+"\" and \""+s2+"\".":"The string \""+target+"\" can not be constructed by shuffling characters of the source strings \""+s1+"\" and \""+s2+"\".";		
		System.out.println(result);
	}
}
/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 13

Description:

Java Program to sort the elements of an array in ascending order

*/

public class Question13
{
	public static int[] generateArray(int length)
	{
		int[] array;
		if (length<0)
			return null;
		if(length==0)
		{
			array = new int[0];
			return array;
		}
		array = new int[length];
		for(int i = 0;i<length;i++)
			array[i] = (int)(Math.random()*100);
		return array;
	}
	
	
	public static void sortArray(int[] array, String typeOfSort, String orderOfSort)
	{
		//Failure Case and Single Cases
		if(array == null || array.length==0 || array.length==1)
			return;
		if(typeOfSort==null || (!typeOfSort.equals("bubble") && !typeOfSort.equals("insertion") && !typeOfSort.equals("counting")))
		{
			System.out.println("Unable to sort because of bad type of sort String value.");
			return;
		}
		if(orderOfSort==null || (!orderOfSort.equals("asc") && !orderOfSort.equals("desc")))
		{
			System.out.println("Unable to sort because of bad order of sort String value.");
			return;
		}
		
		
		//Bubble Sort - TC = O(n^2),SC = O(1)
		if(typeOfSort.equals("bubble"))
		{
			for(int i = 0;i<array.length;i++)
			{
				for(int j = 0;j<array.length-1-i;j++)
				{
					if(orderOfSort.equals("asc"))
					{
						if(array[j]>array[j+1])
						{
							array[j] = array[j] ^ array[j+1];
							array[j+1] = array[j] ^ array[j+1];
							array[j] = array[j] ^ array[j+1];
						}
					}
					else 
					{
						if(array[j]<array[j+1])
						{
							array[j] = array[j] ^ array[j+1];
							array[j+1] = array[j] ^ array[j+1];
							array[j] = array[j] ^ array[j+1];
						}
					}
				}
			}
			return;
		}
		
		//Insertion Sort - TC = O(n^2),SC = O(1)
		if(typeOfSort.equals("insertion"))
		{
			for(int i = 1;i<array.length;i++)
				for(int j = i ;j>0;j--)
				{
					if(orderOfSort.equals("asc"))
					{
						if(array[j]<array[j-1])
						{
							array[j] = array[j] ^ array[j-1];
							array[j-1] = array[j] ^ array[j-1];
							array[j] = array[j] ^ array[j-1];
						}
					}
					else if(orderOfSort.equals("desc"))
					{
						if(array[j]>array[j-1])
						{
							array[j] = array[j] ^ array[j-1];
							array[j-1] = array[j] ^ array[j-1];
							array[j] = array[j] ^ array[j-1];
						}
					}
				}
			return;
		}
		
		//Counting Sort - TC = O(n+maxValue-minValue), SC = O(maxValue - minValue)
		if(typeOfSort.equals("counting"))
		{
			int maxValue = Integer.MIN_VALUE;
			int minValue = Integer.MAX_VALUE;
			for(int i = 0;i<array.length;i++)
			{
				if(array[i]>maxValue)
					maxValue = array[i];
				if(array[i]<minValue)
					minValue = array[i];
			}
			int[] tempArray = new int[maxValue-minValue+1];
			for(int i = 0;i<array.length;i++)
				tempArray[array[i]-minValue]++;
			int index = 0;
			if(orderOfSort.equals("asc"))
			{
				for(int i = 0;i<tempArray.length;i++)
					if(tempArray[i]>0)
						for(int j = 0;j<tempArray[i];j++)
							array[index++] = i+minValue;
			}
			else if(orderOfSort.equals("desc"))
			{
				for(int i = tempArray.length-1;i>=0;i--)
					if(tempArray[i]>0)
						for(int j = 0;j<tempArray[i];j++)
							array[index++] = i+minValue;
			}
		return;
		}	
	}
	
	public static void main(String[] args)
	{
		int[] firstArray = generateArray(10);
		Question1.printElementsOfArray(firstArray);
		sortArray(firstArray,"bubble","asc");
		Question1.printElementsOfArray(firstArray);
		sortArray(firstArray,"counting","asc");
		Question1.printElementsOfArray(firstArray);				
		sortArray(firstArray,"insertion","asc");
		Question1.printElementsOfArray(firstArray);		
				
	}
}
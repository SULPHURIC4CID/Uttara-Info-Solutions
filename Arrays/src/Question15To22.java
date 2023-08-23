/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 15,16,17,18,19,20,21,22

Description:

Java Program to print the largest element in a sorted array

*/

public class Question15To22
{	
	public static int maxValueOfUnsortedArray(int[] array,int k)
	{
		if(array == null || array.length == 0)
		{
			System.out.println("Cannot find max of NULL or empty array.");
			return -1;
		}
		if(k<=0 || k>array.length)
		{
			System.out.println("Enter a strictly positive value less than the length of the array.");
			return -1;
		}
		Question13.sortArray(array,"insertion","desc");
		return array[k-1];
	}
	
	public static int minValueOfUnsortedArray(int[] array,int k)
	{
		if(array == null || array.length == 0)
		{
			System.out.println("Cannot find min of NULL or empty array.");
			return -1;
		}
		if(k<=0 || k>array.length)
		{
			System.out.println("Enter a strictly positive value less than the length of the array.");
			return -1;
		}
		Question13.sortArray(array,"insertion","asc");
		return array[k-1];
	}
	
	public static void main(String[] args)
	{
		int[] firstArray = Question13.generateArray(10);
		System.out.print("The original Array is : ");
		Question1.printElementsOfArray(firstArray);
		int k = firstArray.length;
		System.out.println("The "+k+"th maximum element in the array is :"+maxValueOfUnsortedArray(firstArray,k));
		System.out.println("The "+k+"th minimum element in the array is :"+minValueOfUnsortedArray(firstArray,k));
		System.out.print("The sorted Array is : ");
		Question1.printElementsOfArray(firstArray);
	}
}
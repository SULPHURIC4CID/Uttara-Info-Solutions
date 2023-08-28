/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 48

Description:

Java Program to find the frequency of odd & even numbers in the given
matrix
*/

public class Question48
{
	public static int[] getParityCount(int[][] matrix)
	{
		if(Matrix.checkNull(matrix))
			return null;
		int[] result = new int[2];
		for(int i = 0;i<matrix.length;i++)
			for(int j = 0;j<matrix.length;j++)
				if(matrix[i][j]%2==0)
					result[0]++;
				else
					result[1]++;
		return result;
	}
	public static void main(String[] args)
	{
		
		int[][] matrix1 = Matrix.generate(5);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);	

		int[] parity = getParityCount(matrix1);
		if(parity!=null)
		{
			System.out.println("The number of odd number is : "+parity[1]);
			System.out.println("The number of even number is : "+parity[0]);
		}
		
	}
}
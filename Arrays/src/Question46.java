/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 46

Description:

Java Program to display the lower triangular matrix
*/

public class Question46
{
	public static int[][] getLowerTriangle(int[][] matrix)
	{
		if(Matrix.checkNull(matrix))
			return null;
		for(int i = 0;i<matrix.length;i++)
			if(matrix.length!=matrix[i].length)
				return null;
		int[][] result = new int[matrix.length][matrix.length];
		for(int i = 0;i<matrix.length;i++)
			for(int j = 0;j<matrix.length;j++)
				if(j<=i)
					result[i][j] = matrix[i][j];
		return result;
	}
	public static void main(String[] args)
	{
		
		int[][] matrix1 = Matrix.generate(3,3,true);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);	

		int[][] lower = getLowerTriangle(matrix1);
		System.out.println("Lower Triangle Matrix is :");
		Matrix.display(lower);
		
	}
}
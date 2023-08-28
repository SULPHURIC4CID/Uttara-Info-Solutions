/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 47

Description:

Java Program to display the upper triangular matrix
*/

public class Question47
{
	public static int[][] getUpperTriangle(int[][] matrix)
	{
		if(Matrix.checkNull(matrix))
			return null;
		for(int i = 0;i<matrix.length;i++)
			if(matrix.length!=matrix[i].length)
				return null;
		int[][] result = new int[matrix.length][matrix.length];
		for(int i = 0;i<matrix.length;i++)
			for(int j = 0;j<matrix.length;j++)
				if(j>=i)
					result[i][j] = matrix[i][j];
		return result;
	}
	public static void main(String[] args)
	{
		
		int[][] matrix1 = Matrix.generate(5,5,true);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);	

		int[][] upper = getUpperTriangle(matrix1);
		System.out.println("Upper Triangle Matrix is :");
		Matrix.display(upper);
		
	}
}
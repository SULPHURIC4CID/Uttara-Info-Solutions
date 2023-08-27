/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 44

Description:

Java program to check if a matrix is a sparse matrix
*/

public class Question44
{
	public static boolean checkIfSparse(int[][] matrix)
	{
		if(Matrix.checkNull(matrix))
			return false;
		int zeroCount = 0;
		int totalElements = 0;
		for(int i = 0;i<matrix.length;i++)
			for(int j = 0;j<matrix[i].length;j++)
			{
				totalElements++;
				if(matrix[i][j]==0)
					zeroCount++;
			}
		
		if(zeroCount>totalElements/2)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		
		int[][] matrix1 = Matrix.generate(2,3,true);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);
		
		
		/*
		int[][] matrix1 = Matrix.generate(4);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);
		*/
		if(checkIfSparse(matrix1))
			System.out.println("The matric is a sparse matrix.");
		else
			System.out.println("The matrix is not a sparse matrix.");
	}
}
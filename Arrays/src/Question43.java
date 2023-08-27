/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 43

Description:

Java program to find transpose of a matrix
*/

public class Question43
{
	public static boolean checkIfIdentity(int[][] matrix)
	{
		if(Matrix.checkNull(matrix))
			return false;
		for(int i = 0;i<matrix.length;i++)
			if(matrix.length!=matrix[i].length)
				return false;
		for(int i = 0;i<matrix.length;i++)
			for(int j=0;j<matrix.length;j++)
				if(i==j && matrix[i][j] != 1)
					return false;
				else if(i!=j && matrix[i][j] !=0)
						return false;
		return true;
	}
	public static void main(String[] args)
	{
		/*
		int[][] matrix1 = Matrix.generate(2,3,true);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);
		*/
		
		int[][] matrix1 = Matrix.generate(4);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);
		
		if(checkIfIdentity(matrix1))
			System.out.println("The matric is an indentity matrix.");
		else
			System.out.println("The matrix is not an indentity matrix.");
	}
}
/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 42

Description:

Java program to find transpose of a matrix
*/

public class Question42
{
	public static void main(String[] args)
	{
		int[][] matrix1 = Matrix.generate(2,3,true);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);
		
		int[][] matrix2 = Matrix.generate(2,3,true);
		System.out.println("Matrix2 is :");
		Matrix.display(matrix2);		
		
		int[][] result = Matrix.add(matrix1,Matrix.negate(matrix2));
		if(result!=null)
		{
			System.out.println("Result of Mat1 - Mat2 is :");
			Matrix.display(result);
		}
	}
}
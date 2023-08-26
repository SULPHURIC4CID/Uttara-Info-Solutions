/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 39

Description:

Java program to add two matrices
*/

public class Question39
{
	public static void main(String[] args)
	{
		int[][] matrix1 = Matrix.generate(3,3,true);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);
		
		int[][] matrix2 = Matrix.generate(3,3,false);
		System.out.println("Matrix2 is :");
		Matrix.display(matrix2);	
				
		int[][] sumMatrix = Matrix.add(matrix1,matrix2);
		if(sumMatrix!=null)
		{
		System.out.println("Sum is :");
		Matrix.display(sumMatrix);
		}
	}
}
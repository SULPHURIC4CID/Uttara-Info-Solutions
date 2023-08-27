/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 45

Description:

Java Program to determine whether two matrices are equal
*/

public class Question45
{
	
	public static void main(String[] args)
	{
		
		int[][] matrix1 = Matrix.generate(2,3,true);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);
		
		
		
		int[][] matrix2 = Matrix.copy(matrix1);//Matrix.generate(4);
		System.out.println("Matrix2 is :");
		Matrix.display(matrix2);
		
		if(Matrix.compare(matrix1,matrix2))
			System.out.println("The matrices are equal.");
		else
			System.out.println("The matrices are not equal.");
	}
}
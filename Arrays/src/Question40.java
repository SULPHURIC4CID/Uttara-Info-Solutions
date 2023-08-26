/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 40

Description:

Java program to mulyiply two matrices
*/

public class Question40
{
	public static void main(String[] args)
	{
		int[][] matrix1 = Matrix.generate(2,3,true);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);
		
		int[][] matrix2 = Matrix.generate(3,10,false);
		System.out.println("Matrix2 is :");
		Matrix.display(matrix2);	
				
		int[][] mulMatrix = Matrix.multiply(matrix1,matrix2);
		if(mulMatrix!=null)
		{
			System.out.println("Product is :");
			Matrix.display(mulMatrix);
		}
	}
}
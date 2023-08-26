/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 41

Description:

Java program to find transpose of a matrix
*/

public class Question41
{
	public static void main(String[] args)
	{
		int[][] matrix1 = Matrix.generate(2,3,true);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);
						
		int[][] transpose = Matrix.transpose(matrix1);
		if(transpose!=null)
		{
			System.out.println("Transpose is :");
			Matrix.display(transpose);
		}
	}
}
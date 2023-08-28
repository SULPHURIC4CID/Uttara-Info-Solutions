/*

Author: Ananthanarayanan R
Batch: Uttara B107
Question: 49

Description:

Java Program to find the sum of each row and each column of a matrix
*/

public class Question49
{
	public static int[][] getSum(int[][] matrix)
	{
		if(Matrix.checkNull(matrix))
			return null;
		int[][] result = new int[2][];
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];
		
		for(int i = 0;i<matrix.length;i++)
			for(int j = 0;j<matrix[i].length;j++)
			{
				row[i]+=(matrix[i][j]);
				col[j]+=(matrix[i][j]);
			}
		result[0] = row;
		result[1] = col;
		return result;
	}
	public static void main(String[] args)
	{
		
		int[][] matrix1 = Matrix.generate(5,5,true);
		System.out.println("Matrix1 is :");
		Matrix.display(matrix1);	

		int[][] sum = getSum(matrix1);
		if(sum!=null)
		{
			System.out.println("The sum of the rows is : ");
			Array.display(sum[0]);
			System.out.println("The sum of the columns is : ");
			Array.display(sum[1]);
		}
		
	}
}
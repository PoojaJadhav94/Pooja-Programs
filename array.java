/*1.Accept the no of rows and columns of matrix from user
2.Accept Array elements from user
3.Print array elements */

import java.util.Scanner;
class array
{
	public static void main(String args[])
	{
		int row,col,i,j;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the no of rows and col of matrix");
		row=sc.nextInt();
		col=sc.nextInt();

		int mat[][]=new int[row][col];
	
		System.out.println("Enter the elements of matrix:");

		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				mat[i][j]=sc.nextInt();

		System.out.println("Matrix elements are:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(" "+mat[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}
}


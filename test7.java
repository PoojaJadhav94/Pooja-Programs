import java.util.Scanner;
/*import java.util.array;
class array
{
		int r=4,c=4,row,col;
		int matrix[][];
		int [][] data=new int[r][c];

		void get(row,col,int[][] m)
		{
			this.r=row;
			this.c=col;
			this.matrix=mat;	
		}
		void arrmat()
		{
			for(r=0;r<matrix.length;r++)
			{
				for(c=0;c<matrix[r].legth;c++)
				{
					System.out.println("Enter the elements for the matrix:");
					data[r][c]=sc.nextInt();
				}	
			}
		}

		public static void main(String args[])
		{
			/*int r,c,row,col;
			Scanner sc=new Scanner(System);
			System.out.println("Enter the no of rows:");
			row=sc.nextInt();
	
			System.out.println("Enter the no of cloumns:");
			col=sc.nextInt();

			int[][] mat=new int[row][col];
			get g=new get(row,col,mat);
			g.arrmat();			
		}
		
}*/
import java.util.Scanner;
public class test7 {

    private int row ;
    private int col ;
    private int[][] matrix;

	Scanner sc=new Scanner(System.in);
	row=sc.nextInt();
	col=sc.nextInt();

    public test7(int trow, int tcol) {

        this.row = trow;
        this.col = tcol;
    }

    public test7(int trow, int tcol, int[][] m) {

        this.row = trow;
        this.col = tcol;
        this.matrix = m;
    }
 public int[][] fill(){


        int[][] data = new int[row][col];
        Scanner in = new Scanner(System.in);

        for(int row = 0; row< matrix.length; row++){
            for(int col = 0 ;col< matrix[row].length; col++){
                System.out.println("enter the elementss for the Matrix");
                data[row][col] = in.nextInt();


            }
            System.out.println();
        }
        return data;
    }





    public static void main(String[] args){
        int[][] ma = new int[3][2];
        test7 q2 = new test7(3, 2,ma);
        q2.fill();
    }
}



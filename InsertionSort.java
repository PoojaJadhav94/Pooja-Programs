import java.util.Scanner;
class InsertionSort
{
	public static void main(String args[])
	{
		int n, i, j, swap;
		
		Scanner sc=new Scanner(System.in);
 
    		System.out.println("Enter the no of elements to sort");
		n=sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter" +n+ "integers");

		public static void insertionsort(int array[])
		{
			 //int n = array.length;
        		for (int j = 1; j < n; j++) 
			{
            			int key = array[j];
            			int i = j-1;
            			
				while ( (i > -1) && ( array [i] > key ) ) 
				{
                			array [i+1] = array [i];
                			i--;
            			}
			}
		}
            	array[i+1] = key;
	
		System.out.println("Sorted list of numbers");
		for(i=0;i<n;i++)
			System.out.println(array[i]);
	}
}

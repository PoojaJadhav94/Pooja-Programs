/*1.Accept the no. of integer elements from user
2.Sort the elements using BubbloSort
3.Print the sorted elements */

import java.util.Scanner;
 class BubbleSort 
{
	public static void main(String args[]) 
	{
    		int n, i, j, swap;
		//int array[] = new int[n];
 
		Scanner sc=new Scanner(System.in);
 
    		System.out.println("Enter the no of elements to sort");
		n=sc.nextInt();
		
		int array[] = new int[n];
    		System.out.println("Enter" +n+ "integers");
 
		for(i=0;i<n;i++)
    		array[i]=sc.nextInt();
 		
		for(i=0;i<(n-1);i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
         			{
          				swap=array[j];
          				array[j]=array[j+1];
          				array[j+1]=swap;
        			}
      			}
    		}
 		System.out.println("Sorted list of numbers");
		for(i=0;i<n;i++)
			System.out.println(array[i]);
  	}
}

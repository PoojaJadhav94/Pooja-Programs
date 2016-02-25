import java.util.Scanner;
class InsertionSort
{
	public static void main(String args[])
	{
		int[] arr1={10,20,5,3,5,90};
		int[] arr2=doInsertionSort(arr1);
	
		for(int i:arr2)
		{
			System.out.print(i);
			System.out.print(",");
		}
	}
	public static int[] doInsertionSort(int[] input)
	{
		int temp,i,j;
		for(i=1;i<input.length;i++)
		{
			for(j=i;j>0;j--)
			{
				if(input[j] < input[j-1])
				{
					temp=input[j];
					input[j]=input[j-1];
					input[j-1]=temp;			
				}
			}
		}
		return input;
	}
}

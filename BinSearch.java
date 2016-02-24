/*1.Accept the words from user
2.Stored words into array
3.Sort the Array elements in asceding order
4.Accept the word to be search from user
5.Search the word using binary search
6.Print the result i.e.word found or not */
 
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class BinSearch
{
	public void BinarySearch(int arr[],int first,int last,int search)
	{
		int result;

		int mid=((first+last)/2);
		
		if(mid==search)
			System.out.println("Number found");
		else if(search < mid)
		{
			 BinarySearch(arr,first,mid,search);
		}
		else if(search > mid)
		{
			 BinarySearch(arr,mid+1,last,search);
		}
		else
			System.out.println("Number not found");
	}
	public static void main(String args[])
	{
		int srch,i;
		Scanner sc=new Scanner(System.in);
		
		BinSearch b=new BinSearch();

		System.out.println("Enter number of elements to enter");
		int no=sc.nextInt();
		int List[] = new int[no];

		System.out.println("Enter the list of number");
		for(i=0;i<no;i++)
			List[i]=sc.nextInt();

		for(int counter: List)
			System.out.println(" "+counter);

		Arrays.sort(List);

		System.out.println("After sorting: ");

		for(int counter:List)
			System.out.println(" "+counter);

		System.out.println("Enter the number to be search from list: ");
		srch=sc.nextInt();
		int ft=0,lt=no;
		int mid=((ft+lt)/2);

		b.BinarySearch(List,ft,lt,srch);		
	}
}

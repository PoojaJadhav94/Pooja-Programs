/*1.Accept array elements from user
2.Arrange elements as 3 before 4
3.Print the output */

import java.util.Arrays;
import java.util.Scanner;

public class Number3Before4Array
{
	public int[] fix34(int[] nums)
	{
		int returnArray[]=new int[nums.length];
		
        	for(int i=0;i<nums.length;i++)
        	{
			if(nums[i]==3)
			{
				returnArray[i]=3;
				returnArray[i+1]=4;
			}
		}
		for(int i=0;i<nums.length;i++)
		{
			if(returnArray[i]!=3 && returnArray[i]!=4 && nums[i]!=3 && nums[i]!=4)
			{
				returnArray[i]=nums[i];
			}			
		}
		OuterLoop:for(int i=0;i<nums.length;i++)
			{
				if(returnArray[i]==0)
				{
					for(int n=0;n<returnArray.length;n++)
					{
						if(returnArray[i]==4)
						{
							returnArray[i]=nums[n];
							continue OuterLoop;
						}
					}
				}
			}
			System.out.print(Arrays.toString(returnArray));
			return returnArray;
	}
	public static void main(String args[])
	{
		int i;
		Number3Before4Array nba=new Number3Before4Array();
	
		int nums[]=new int[5];
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array elements:");
		for(i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();
		}
		nba.fix34(nums);	
	}
}



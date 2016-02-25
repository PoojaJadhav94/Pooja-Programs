
import java.util.Scanner;
//import java.lang.ArrayIndexOutOfBoundException;
import java.util.Arrays;
class arrayrecur
{
	public static void main(String args[])
	{
		int arr[]={1,2,3};
		int sum1;
		sum1=array(arr,0);

		System.out.println("\nSum is: "+sum1);
		//return 0;
	}
		
	/* int arry_sum(int arr[],int n,int sum)
	{
		if(n<0)
			return sum;
		else
		{
			sum +=arr[n];
		}
		//return arr_sum(arr,--n,sum);
		return sum;		
	}*/
	public int array(int[] nums, int index)
	{
		if(index==nums.length)
			return 0;
		if(nums[index]==11)
			return 1+array11(nums,index+1);
		return array11(nums,index+1);
	}
}
/*public int array11(int[] nums, int index)
{
	if(index == nums.length)
		return 0;
	if(nums[index] == 11)
		return 1 + array11(nums, index + 1);
	return array11(nums, index + 1);
}*/

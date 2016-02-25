
import java.util.Scanner;

class withoutusingrecurfact
{
	public static void main(String args[])
	{
		int num;
		int result=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num=sc.nextInt();

		for(int i=1;i<=num;i++)
		{
			result=result*i;
		}
		System.out.println("The factorial of number is :" +result);
	}
}


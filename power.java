/*1.Accept the Nth element from user
2.Calculate the power of 2 upto Nth element
3.Print the table*/

import java.util.Scanner;
class power
{
	public static void main(String args[])
	{
		int n,i=0,pow=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Nth number:");
		n=sc.nextInt();
		
		if(n<=30)
		{
			while(i<=n)
			{
				System.out.println(i+" "+pow);

				pow=2*pow;
				i=i+1;
			}
		}
	}
}

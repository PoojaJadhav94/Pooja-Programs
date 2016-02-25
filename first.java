/*1.Accept the three integer numbers from user
2.Claculate the last digit of three numbers
3.Compare the last digit 
4.Print the outpur */

import java.util.Scanner;
class first
{
	public static void main(String args[])
	{
		int a,b,c,p,q,r;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		p=a%10;
		q=b%10;
		r=c%10;
		
		if(p==q || p==r || q==r)
		{
			System.out.println("true");
		}
		else 
			System.out.println("false");
	}
}

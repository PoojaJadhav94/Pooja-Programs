/*1.Accept the year as a input from user
2.Calculate the year leap or not
3.Display the result */

import java.util.Scanner;
import java.io.*;
class leap
{
	public static void main(String args[])
	{
		int yr;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");		
		yr=sc.nextInt();

		if((yr%400==0) || ((yr%4==0) && (yr%100!=0)))
		{
			System.out.println("The entered year"+yr+"is a leap year");
		}
		else
			System.out.println("The entered year"+yr+"is a not a leap year");
		
	}
}

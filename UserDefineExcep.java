/*1.Accept three no from user
2.Compare numbers which is in increasing order or not
3.If it is in increasing order then return true
4.Print the output */

import java.util.Scanner;
import java.io.*;
public class UserDefineExcep extends Exception
{
	public static void main(String args[])throws Exception
	{
		int a,b,c;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a<b || a<c && (a!=b && a!=c))
		{
			if(b<c && (b!=c))
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		
		else
		{
			System.out.println("False");
		}
		/*public void comp() throws UserDefineException
		{
		try
		{
		if(a<b || a<c)
		{
			if(b<c)
			{
				throw new UserDefineException("Equalok");
				System.out.println("Equalok");
				System.out.println("true");
			}
			else
				System.out.println("False");
		}
		else
			System.out.println("false");
		
		}
		catch(UserDefineException e)
		{
			System.out.println("");
			//e.printStackTrace();
		}	
		}*/
		/*if(a<b)
		{
			if(a<c)
			{
				if(b<c)
				{
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
					System.out.println("true");
				}
				else
				{
					/*System.out.println(a);
					System.out.println(c);
					System.out.println(b);
					System.out.println("false");
				}
			}
			else
			{
					/*System.out.println(c);
					System.out.println(a);
					System.out.println(b);
					System.out.println("false");
			}
		}
		else if(b<c)
		{
			if(a<c)
			{
					System.out.println(b);
					System.out.println(a);
					System.out.println(c);
					System.out.println("true");
			}
			else
			{
					/*System.out.println(b);
					System.out.println(c);
					System.out.println(a);
					System.out.println("true");
			}
		}
		else
		{
					/*System.out.println(c);
					System.out.println(b);
					System.out.println(a);
					System.out.println("false");
		}
	}
	else
	{
		System.out.println("false");
	}*/
}
}

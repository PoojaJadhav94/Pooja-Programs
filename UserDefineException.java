import java.util.Scanner;
import java.io.*;
public class UserDefineExcep
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
		try
		{
		if(a<b || a<c)
		{
			if(b<c)
			{
				throw new UserDefineException("Equalok");
				System.out.println("true");
			}
			else
				System.out.println("False");
		}
		else
			System.out.println("false");
		
		}
		catch(Exception e)
		{
			//System.out.println("");
			e.printStackTrace();
		}	
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

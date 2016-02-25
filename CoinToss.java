import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class CoinToss
{
	public static void main(String args[])throws IOException
	{
		double toss,heads=0,tails=0,total=0;
		double headsper,tailsper;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter no of toss: ");
		toss=s.nextInt();
		int i=0;
		
		for(i=0;i<toss;i++)
		{
			if(Math.random()<=0.5)
			{
				heads++;
			}
			else
			{
				tails++;
			}
		}
		total=heads+tails;
		head=(heads/total)*100;
		tail=(tails/total)*100;

		System.out.println("Percentage of heads: "+head);
		System.out.println("Percentage of tails: "+tail);
				
	}
}

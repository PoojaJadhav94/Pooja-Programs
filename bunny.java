import java.util.Scanner;

class bunny
{
	public static void main(String args[])
	{
		int bn;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of bunnies:");
		
		bn=sc.nextInt();
		int result=bunnyears(bn);

		System.out.println("Bunnies Ears are:" +result);
	}
	public static int bunnyears(int bunnie)
	{
		if(bunnie==0)
			return 0;
		else
			return 2+bunnyears(bunnie-1);
	}
}


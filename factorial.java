import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class factorial
{       
	public static void main(String args[])throws NumberFormatException,IOException
	{
		System.out.println("Enter the Number:");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());

		int result=fact(num);
		
		System.out.println("Factorial of number is:" +result);
	}	
	static int fact(int n)
	{
		if(n<=1)
			return 1;
		else
			return(n*fact(n-1));
	}
        
}

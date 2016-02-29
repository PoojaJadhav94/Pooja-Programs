import java.math.BigInteger;
import java.util.Scanner;
class TestBigInteger
{
	public static void main(String args[])
	{
		BigInteger int1=new BigInteger("11111111111");
		BigInteger int2=new BigInteger("22222222222");

		BigInteger addition=int1.add(int2);
		System.out.println("Addition is:"+addition);
		
		BigInteger result=int1.multiply(int2);

		System.out.println("Multiplication is :"+result);
		
		
	}
}


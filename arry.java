class primefactor
{
	void primefact(int n)
	{
		while(n%2==0)
		{
			System.out.println("2");
			n=n/2;
		}
		for(int i=3;i<=sqrt(n);i=i+2)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
		}
		if(n>2)
			System.out.println(n);
	}
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		primefactor(num);		
	}
}
int main()
{
    int n = 315;
    primeFactors(n);
    return 0;
}

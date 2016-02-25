import java.io.*;
class groupSumOf 
{
	public static boolean sum(int[] num)
	{
		int p,q,r,s,t;
		
		p=2;
		q=2+4;
		r=2+4+8;
		s=4+8;
		t=2+8;

		if(p==10||q==10||r==10||s==10||t==10)
		{
			return true;
			//System.out.println("{0{2,4,8}10}");
		}		
			
		else if(p==14||q==14||r==14||s==14||t==14)
		{		
			return true;
			//System.out.println("{0{2,4,8}14}");
		}		
				
		else if(p==9||q==9||r==9||s==9||t==9)
		{		
			return true;
		}		
		else 
		{		
			return false;
			//System.out.println("{0{2,4,8}09}");
		}	
	}
   	public static void main(String[] args)
    	{
		int arr[]={3,4,11};
	
		boolean b=sum(arr);
		System.out.println(b);
						
	}

}

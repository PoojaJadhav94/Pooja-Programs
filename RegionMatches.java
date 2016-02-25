import java.util.Scanner;
public class RegionMatches
{
	public static void main(String[] args) 
	{
        	String base;;
        	String remove;
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		base=sc.next();
		System.out.println("Enter the string you want to search:");
		remove=sc.next();

		int baseLength=base.length();
        	int removeLength=remove.length();
        	boolean foundIt=false;
        
		for (int i=0;i<=(baseLength-removeLength);i++) 
		{
           		if(base.regionMatches(i,remove,0,removeLength)) 
			{
              			foundIt = true;
				System.out.println("Search String is:");
              			System.out.println(base.substring(i, i+removeLength));
              			break;
           		}
        	}
        	if(!foundIt)
            		System.out.println("String not found");
    	}
}

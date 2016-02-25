
public class RegionMatches
{
	public static void main(String[] args) 
	{
        	String base="Green Eggs and Ham";
        	String remove="Eggs";
        
		int baseLength=base.length();
        	int removeLength=remove.length();
        	boolean foundIt=false;
        
		for (int i=0;i<=(baseLength-removeLength);i++) 
		{
           		if(base.regionMatches(i,remove,0,removeLength)) 
			{
              			foundIt = true;
              			System.out.println(base.substring(i, i+removeLength));
              			break;
           		}
        	}
        	if(!foundIt)
            		System.out.println("No match found.");
    	}
}

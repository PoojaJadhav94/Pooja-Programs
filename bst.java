import java.util.Scanner;
class binarytree
{
	binarytree left,right;
	int data;

	public binarytree()
	{
         	left = null;
         	right = null;
         	data = 0;
	}
	public binarytree(int n)
	{
         	left = null;
         	right = null;
         	data = n;
     	}
	public void setLeft(BSTNode n)
     	{
         	left = n;
     	}
        public void setRight(BSTNode n)
     	{
         	right = n;
     	}
	public int getData()
     	{
         	return data;
     	}
	public void setData(int d)
     	{
         	data = d;
     	}
}
public class bst extends binarytree
{
	private binarytree root;
	public bst()
     	{
         	root = null;
     	}
	boolean isEmpty()
     	{
         	return root == null;
     	}
	void insert(int data)
     	{
         	root = insert(root, data);
     	}  
	BSTNode insert(BSTNode node, int data)
     	{
         	if (node == null)
             		node = new BSTNode(data);
         	else
         	{
             		if (data <= node.getData())
                 		node.left = insert(node.left, data);
             		else
                 		node.right = insert(node.right, data);
         	}
         	return node;
     	}
	public boolean search(int val)
     	{
         	return search(root, val);
     	}
	private boolean search(BSTNode r, int val)
     	{
         	boolean found = false;
         	while ((r != null) && !found)
         	{
             		int rval = r.getData();
             		if (val < rval)
                 		r = r.getLeft();
             		else if (val > rval)
                 		r = r.getRight();
             		else
             		{
                 		found = true;
                 		break;
             		}
             		found = search(r, val);
         	}
         	return found;
     	}   
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		binarytree bt=new binarytree();		
		char ch;
		do    
        	{
            		System.out.println("\nBinary Search Tree Operations\n");
            		System.out.println("1.Insert ");
       		     	System.out.println("2.Search");
            		System.out.println("3.Exit");
            
            		int choice = scan.nextInt();            
            		switch (choice)
            		{
            			case 1 : 
                			System.out.println("Enter elements:");
                			bt.insert(scan.nextInt());                     
                			break;                          
				case 2 : 
                			System.out.println("Enter integer element to search");
                			System.out.println("Search result : "+ bt.search( scan.nextInt()));
                			break;                                          
				case 3: exit();
		     	}
			System.out.println("\nDo you want to continue (Type y or n) \n");
            		ch = scan.next().charAt(0);    
 		}while(ch == 'Y'|| ch == 'y');
	}
}

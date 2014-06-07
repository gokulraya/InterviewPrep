
public class inorderSuccessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreewithParent root=new TreewithParent(20,null,null,null);
		TreewithParent l1=new TreewithParent(8,null,null,root);
		TreewithParent r1=new TreewithParent(22,null,null,root);
		TreewithParent l2=new TreewithParent(4,null,null,l1);
		TreewithParent r2=new TreewithParent(12,null,null,l1);
		TreewithParent l3=new TreewithParent(10,null,null,r2);
		TreewithParent r3=new TreewithParent(14,null,null,r2);
		
		root.left=l1;
		root.right=r1;
		l1.left=l2;
		l1.right=r2;
		r2.left=l3;
		r2.right=r3;
		
		printTree(root);
		TreewithParent t=findinorderSuccessor(root,l1);
		System.out.println("Inorder successor is " + t.value);
		
		//ksmallest(root,3);
		

	}
	
	

	private static TreewithParent findinorderSuccessor(TreewithParent root,
			TreewithParent l1) {
		// TODO Auto-generated method stub
	try{
		if(l1.right!=null)
		{
			l1=l1.right;
			while(l1.left!=null)
				l1=l1.left;
			return l1;
		}
		else
		{
			TreewithParent temp=l1;
			temp=l1.parent;
			while(temp!=null && temp.right==l1)
			{
				l1=temp;
				temp=temp.parent;
			}
			return temp;	
		}
	}
	catch(Exception e)
	{
		System.out.println("Invalid index");
	}
	return l1;
		
		
	}

	private static void printTree(TreewithParent root) {
		// TODO Auto-generated method stub
		
		if(root!=null)
		{	
			printTree(root.left);
			
			System.out.print(root.value + " ");
		
		 printTree(root.right);
		}
	}

}

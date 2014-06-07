
public class sampleTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree root=new Tree(5,null,null);
		root.left=new Tree(3,null,null);
		root.right=new Tree(7,null,null);
		root.left.left=new Tree(2,null,null);
		root.left.right=new Tree(4,null,null);
		root.right.left=new Tree(6,null,null);
		root.right.right=new Tree(8,null,null);
		//root.right.right.right=new Tree(10,null,null);
		//root.left.right.left=new Tree(1,null,null);
		//root.left.right.left.left=new Tree(0,null,null);
		
		
		printTree(root);
		int size=getSize(root);
		System.out.println();
		System.out.println(size);
		int height=getHeight(root);
		System.out.println(height);
		
		boolean flag=isBalanced(root);
		if(flag==true)
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
		
		int parentOf=4;
		
	}

	
	private static boolean isBalanced(Tree root) {
		// TODO Auto-generated method stub
		int lheight=0,rheight=0;
		//Tree lchild=root.left;
		//Tree rchild=root.right;
		lheight=getHeight(root.left);
		rheight=getHeight(root.right);
		/*if(lchild!=null)
		{
			lheight++;
			isBalanced(lchild.left);
			isBalanced(lchild.right);
		}*/
		if(lheight-rheight>1 || rheight-lheight>1)
		{
				return false;
		}
		else
				return true;
		//System.out.println(lheight);
		//System.out.println(rheight);
		
	}

	private static int getHeight(Tree root) {
		// TODO Auto-generated method stub
		if(root!=null)
		{
			return 1+ Math.max(getHeight(root.left), getHeight(root.right));
		}
		return 0;
		
	}

	private static int getSize(Tree root) {
		// TODO Auto-generated method stub
		if(root!=null)
		{
			
			return 1+getSize(root.left)+getSize(root.right);
		}
		return 0;
		
	}

	private static void printTree(Tree root) {
		// TODO Auto-generated method stub
		
		if(root!=null)
		{	
			printTree(root.left);
			
			System.out.print(root.value);
		
		 printTree(root.right);
		}
	}
	

}

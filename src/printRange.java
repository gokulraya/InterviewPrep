
public class printRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree root=new Tree(20,null,null);
		Tree l1=new Tree(8,null,null);
		Tree r1=new Tree(22,null,null);
		Tree l2=new Tree(4,null,null);
		Tree r2=new Tree(12,null,null);
		Tree l3=new Tree(10,null,null);
		Tree r3=new Tree(14,null,null);
		
		root.left=l1;
		root.right=r1;
		l1.left=l2;
		l1.right=r2;
		r2.left=l3;
		r2.right=r3;
		
		//rangePrint(root,12,22);
		printGreaterThan(root,9);

	}
	public static void printGreaterThan(Tree root,int k1)
	{
		if(root==null)
			return;
		if(root.value > k1) 
			printGreaterThan(root.left,k1);
		if(root.value<k1)
			printGreaterThan(root.right,k1);
		
	}
	public static void rangePrint(Tree root, int k1, int k2)
	{
		Tree temp=root;
		if(root==null)
			return;
		if(root.value > k1)
			rangePrint(root.left,k1,k2);
		if(root.value>=k1 && root.value <= k2)
			System.out.println(root.value + " ");
		if(root.value < k2)
			rangePrint(root.right,k1,k2);
	}

}

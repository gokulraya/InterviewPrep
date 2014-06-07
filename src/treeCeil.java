
public class treeCeil {

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

		int ceil=getCeil(root,9);
		System.out.println(ceil);

	}

	private static int getCeil(Tree root, int i) {
		// TODO Auto-generated method stub
		
		if(root==null)
			return -1;
		if(root.value==i)
			return root.value;
		if(root.value<i)
			return getCeil(root.right,i);
		int ceil=getCeil(root.left,i);
		return ((ceil>=i)?ceil:root.value);
		
	}

}

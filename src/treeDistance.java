import java.util.Stack;


public class treeDistance {

	/**
	 * @param args
	 */
	static int lcount=0,rcount=1;
	static Stack<Integer> st=new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree root = new Tree(1,null,null);
		root.left = new Tree(2,null,null);
		root.right = new Tree(3,null,null);
		root.left.left = new Tree(4,null,null);
		root.left.left.left=new Tree(9,null,null);
		root.left.right = new Tree(5,null,null);
		root.right.left = new Tree(6,null,null);
		root.right.right = new Tree(7,null,null);
		root.right.left.right = new Tree(8,null,null);
		int source=8,k=2;
		Stack<Integer> s=calculateDistance(root,source,k);
		while(!s.isEmpty())
			System.out.println(s.pop());
	}

	private static Stack<Integer> calculateDistance(Tree root, int source, int k) {
		// TODO Auto-generated method stub
		
		if(root!=null)
		{
			
			Tree lroot=root.left;
			Tree rroot=root.right;
			if(lcount!=k)
			{
				lcount++;
				calculateDistance(root.left, source, k);
				calculateDistance(root.right,source,k);
				
			}
			else
			{
				st.push(root.value);
				if(st.contains(source))
				{
					return st;
				}
				else
					lcount--;
				
			}
			/*if(rcount!=k)
			{
				rcount++;
				calculateDistance(rroot.left, source, k);
				calculateDistance(rroot.right,source,k);
				
			}
			else
			{
				st.push(rroot.value);
				return st;
			}*/
			
		}
		return st;
		
	}

}

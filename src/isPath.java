import java.util.LinkedList;
import java.util.Queue;


public class isPath {

	/**
	 * @param args
	 */
	static Queue<Integer> q=new LinkedList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree root=new Tree(5,null,null);
		root.left=new Tree(3,null,null);
		root.right=new Tree(8,null,null);
		root.left.left=new Tree(2,null,null);
		root.left.right=new Tree(4,null,null);
		root.right.left=new Tree(7,null,null);
		root.right.right=new Tree(10,null,null);
		int start=3,end=8;
		if(root.value!=start)
			root=setStart(root,start);
		
		Queue<Integer> q=Path(root,start,end);
		System.out.println(q);

	}

	private static Queue<Integer> Path(Tree root, int start, int end) {
		// TODO Auto-generated method stub
		
		
		if(start!=end)
		{
			try{
			if(root.value<end)
			{
				q.add(root.value);
				start=root.value;
				root=root.right;
				Path(root,start,end);
			}
			else if(root.value>end) {
				q.add(root.value);
				start=root.value;
				root=root.left;
				Path(root,start,end);
			}
			else if(root.value==end)
			{
				q.add(root.value);
				start=root.value;
				Path(root,start,end);
			}
			}
			catch(NullPointerException e)
			{
				System.out.println("No Path found");
				return null;
			}
		}
		return q;
		}

	private static Tree setStart(Tree root, int start) {
		// TODO Auto-generated method stub
		if(root.value>start) {
			root=root.left;
			setStart(root,start);
		}
		else if(root.value<start) {
			root=root.right;
			setStart(root,start);
		}
		return root;
	}
		
	

}

import java.util.LinkedList;
import java.util.Queue;


public class treeLevelOrder {

	/**
	 * @param args
	 */
	static Queue<Tree> q=new LinkedList<Tree>();
	static int count=0;
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
		
		Queue<Tree> q=printLevel(root);
		while(!(q.isEmpty()))
		{
			Tree temp=q.remove();
			System.out.println(temp.value);
		}
	}

	private static Queue<Tree> printLevel(Tree root) {
		// TODO Auto-generated method stub
		
			/*if(count>0)
			{
				System.out.println();
			}*/
			System.out.print(root.value);
			if(root!=null)
			{
				if(root.left!=null)
				{
					q.add(root.left);
					count++;
				}
				if(root.right!=null)
				{
					q.add(root.right);
					count++;
				}
				printLevel(q.remove());
				
			}
			return q;
	}
}
			
		
		
		
		
		/*if(root!=null)
		{
			//System.out.println();
			System.out.print(root.value);
			q.add(root.left);
			q.add(root.right);
			if(!q.isEmpty())
			{
			//System.out.println();
				printLevel(q.remove());
			}
		
			return q;
		}
		return q;
		
	}

}
*/
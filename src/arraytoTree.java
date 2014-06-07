import java.util.LinkedList;
import java.util.Queue;


public class arraytoTree {

	/**
	 * @param args
	 */
	static int count=0;
	static Queue<Tree> q=new LinkedList<Tree>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1,2,3,4,5};
		int start=0,end=arr.length-1;
		
		Tree root=constructTree(arr,start,end);
		printTree(root);
		
	}

	private static Tree constructTree(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		if(start>end)
			return null;
		
		int middle=(start+end)/2;
		Tree root=new Tree(arr[middle],null,null);
		
		root.left=constructTree(arr,start,middle-1);
		
		root.right=constructTree(arr,middle+1,end);
		
		return root;
	}
	
	private static void printTree(Tree root) {
		// TODO Auto-generated method stub
		
		if(root!=null)
		{	
			printTree(root.left);
			
			System.out.print(root.value + " ");
		
		 printTree(root.right);
		}
	}
	
	

}

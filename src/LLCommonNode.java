
public class LLCommonNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL node=new LL('a');
		LL node1=new LL('b');
		LL node2=new LL('c');
		LL node3=new LL('j');
		node.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=null;
		
		LL snode=new LL('d');
		//LL snode1=new LL('e');
		//LL snode2=new LL('f');
		snode.next=node1;
		//snode1.next=snode2;
		//snode2.next=node2;
		
		int nodeLength=calculateLength(node);
		int snodeLength=calculateLength(snode);
		//System.out.println(nodeLength);
		//System.out.println(snodeLength);
		
		int diff=snodeLength-nodeLength;
		char common=findCommon(node,snode,diff);
		
		System.out.println(common);
		
	/*	System.out.println("NExt linked is ");
		while(snode.next!=null )
		{
			System.out.print(snode.data);
			snode=snode.next;
		}*/

	}

	private static char findCommon(LL node, LL snode, int diff) {
		// TODO Auto-generated method stub
		while(node!=null && snode!=null)
		{
			while(diff-->0)
			{
				//diff--;
				snode=snode.next;
			}
			if(node!=snode)
			{
				node=node.next;
				snode=snode.next;
			}
			else
			{
				return node.data;
			}
				
		}
		return 0;
		
		
	}

	private static int calculateLength(LL node) {
		// TODO Auto-generated method stub
		int length=0;
		while(node!=null)
		{
			length++;
			node=node.next;
		}
		return length;
		
	}

}

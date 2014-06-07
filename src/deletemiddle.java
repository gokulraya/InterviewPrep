
public class deletemiddle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l1=new LL('G');
		LL l2=new LL('o');
		LL l3=new LL('k');
		LL l4=new LL('u');
		LL l5=new LL('l');
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		
		l3=deleteNode(l2);
		while(l1!=null)
		{
			System.out.println(l1.data);
			l1=l1.next;
		}
	}

	public static LL deleteNode(LL l2) {
		// TODO Auto-generated method stub
		//System.out.println(l3.next.data);
		LL temp=l2.next;
		
		//System.out.println(temp.data);
		l2.data=temp.data;
		l2.next=temp.next;
		
		return l2;
	}

}

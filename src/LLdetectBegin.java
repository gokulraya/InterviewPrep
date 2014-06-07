import java.util.HashMap;


public class LLdetectBegin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LL l1=new LL('A');
		LL l2=new LL('B');
		LL l3=new LL('C');
		LL l4=new LL('D');
		LL l5=new LL('E');
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l3;
		
		char ch;
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		while(l1!=null)
		{
			if(!hash.containsKey(l1.data))
			{
				hash.put(l1.data, 1);
			}
			else
			{
				 ch=l1.data;
				System.out.println(ch);
				break;
			}
			l1=l1.next;
		}
		

	}

}

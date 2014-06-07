import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class duplicatesLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LL l1=new LL('H');
		l1.insert('e');
		l1.insert('l');
		l1.insert('l');
		l1.insert('o');
		HashSet<Character> hash=new HashSet<Character>();
		hash=removeDuplicates(l1);
		Iterator ite=hash.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		
	}
	public static HashSet removeDuplicates(LL l1)
	{
		HashSet<Character> hash=new HashSet<Character>();
		while(l1!=null)
		{
			char ch=l1.data;
			hash.add(ch);
			l1=l1.next;
		}
		
		
		System.out.println(hash);
		return hash;
		
		
	//	return l1;
		
	}

}

/*class LL
{
	LL next=null;
	char data;

	public LL(char d)
	{
		data=d;
	}
	void insert(char d)
	{
		LL end=new LL(d);
		LL head=this;
		while(head.next!=null)
			head=head.next;

		head.next=end;
	}
}*/

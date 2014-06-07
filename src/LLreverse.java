
public class LLreverse {
	
	public static void main(String[] args)
	{
		LL head=new LL('a');
		head.insert('b');
		head.insert('c');
		head.insert('d');
		LL newHead= reverse(head);
		while(newHead!=null)
		{
			System.out.println(newHead.data);
			newHead=newHead.next;
		}
	}
	public static LL reverse(LL head)
	{
		LL after=new LL();
		LL previous=new LL();
		while(head!=null)
		{
			after=head.next;
			head.next=previous;
			previous=head;
			head=after;
		}
		return previous;
		
	}

}

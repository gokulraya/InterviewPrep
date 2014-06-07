import java.util.Stack;


public class stackint {

	/**
	 * @param args
	 */
		
		LLint top;
		int min=0;
		Stack<Integer> s=new Stack<Integer>();
		public int pop()
		{
			if(top!=null)
			{
				int item=top.data;
				top=top.next;
				if(item==s.peek())
					s.pop();
				return item;
			}
			else
				return (Integer) null;
		}
		
		
		public void push(int d)
		{
			LLint l1=new LLint(d);
			l1.next=top;
			top=l1;
			updatemini(d);
		}
		public int peek()
		{
			return top.data;
		}
		public void updatemini(int d)
		{
			
			if(min==0 || d < min)
			{
				s.push(d);
				min=d;
			}
			
		}
		public Stack minimim()
		{
			return s;
		}
		
	
		public boolean isEmpty()
		{
			if(top==null)
				return true;
			else
				return false;
		}

}

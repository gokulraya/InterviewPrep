import java.util.Stack;


public class stackSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Stack<Integer> st1=new Stack<Integer>();
	Stack<Integer> st2=new Stack<Integer>();
	
	st1.push(2);
	st1.push(1);
	st1.push(0);
	st1.push(-1);
	st1.push(-2);
	
	st2=sort(st1);
	while(!st2.isEmpty())
		System.out.println(st2.pop());
	
	
	}
	public static Stack<Integer> sort(Stack<Integer> st1)
	{
		Stack<Integer> st2=null;
		int max=0,counter=0,temp=0;
		while(!st1.isEmpty())
		{			
			if(max==0)
				max=st1.peek();
			else if(st1.peek()>max)
				max=st1.peek();
			
			if(st2==null)
			{
				st2=new Stack<Integer>();
				st2.push(st1.pop());
			}
			else if(st1.peek()<max)
			{
				temp=st1.pop();
				while(!st2.isEmpty())
				{
					if(st2.isEmpty())
						break;
					else if(temp<st2.peek())
					{
						st1.push(st2.pop());
						counter++;
					}
				}
				st2.push(temp);
				while(counter>0)	
				{
					st2.push(st1.pop());
					counter--;
				}
			}
			else
			{
				st2.push(st1.pop());
			}
			
					
		}
		return st2;
	}

}

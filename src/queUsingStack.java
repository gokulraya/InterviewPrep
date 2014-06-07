import java.util.Stack;


public class queUsingStack {

	/**
	 * @param args
	 */
	
	Stack<Integer> stack=new Stack<Integer>();
	Stack<Integer> que=new Stack<Integer>();
	void push(int d)
	{
		if(que==null)
		{
			que.push(d);
		}
		else
		{
			while(!que.isEmpty())
			{
				stack.push(que.pop());
			}
			que.push(d);
			while(!stack.isEmpty())
				que.push(stack.pop());
		}
	}
	
	int pop()
	{
		if(!que.isEmpty())
		{
			int item=que.pop();
			return item;
		}
		return (Integer) null;
	}
	
	boolean isEmpty()
	{
		if(que==null)
			return true;
		else
			return false;
	}

}

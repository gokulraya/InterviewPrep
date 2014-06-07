import java.util.ArrayList;
import java.util.Stack;


public class setOfStacks {

	/**
	 * @param args
	 */
	stackint s1=new stackint();
	ArrayList<stackint> set=new ArrayList<stackint>();
	int counter=1;
	void push(int d)
	{
		//int counter=0;
		
		if(counter<5)
		{
			s1.push(d);
			counter++;
		}
		else
		{
			
			set.add(s1);
			s1=new stackint();
			s1.push(d);
			counter=1;
		}
	}
	int pop()
	{
		while(!set.isEmpty())
		{
			int length=set.size();
			for(int i=length;i>0;i--)
			{
				stackint s2=new stackint();
				s2=set.get(i-1);
				int item=s2.pop();
				return item;
			}
		}
		return (Integer) null;
		
	}
	
	int peek()
	{
		while(!set.isEmpty())
		{
			int length=set.size();
			for(int i=length;i>0;i--)
			{
				stackint s2=new stackint();
				s2=set.get(i-1);
				int item=s2.peek();
				return item;
			}
		}
		return (Integer) null;
	}
	
	int popAt(int index)
	{
		while(!set.isEmpty() && index<set.size())
		{
			for(int i=index;i>=0;i--)
			{
				stackint s3=new stackint();
				s3=set.get(i);
				int item=s3.pop();
				return item;
			}
		}
		return (Integer) null;
	}
}

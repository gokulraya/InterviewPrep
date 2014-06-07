import java.util.Stack;


public class LLadd2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLint op1=new LLint(6);
		op1.insert(1);
		op1.insert(7);
		
		LLint op2=new LLint(2);
		op2.insert(9);
		op2.insert(5);
		
		LLint ans=null;
		Stack<Integer> st1=new Stack<Integer>();
		Stack<Integer> st2=new Stack<Integer>();
		Stack<Integer> result=new Stack<Integer>();
		int carry=0,sum=0;
		while(op1!=null && op2!=null)
		{
			st1.push(op1.data);
			op1=op1.next;
			
			st2.push(op2.data);
			op2=op2.next;
		}
		
		while(!st1.isEmpty() && !st2.isEmpty())
		{
			int operand1=st1.pop();
			int operand2=st2.pop();
						
			if(carry>0)
			{
				sum=operand1+operand2+carry;
				carry=0;
			}
			else
				sum=operand1+operand2;
			
			if(sum>10)
			{
				carry=sum/10;
				
			}
			sum=sum%10;
			
			result.push(sum);
			
		}
		
		while(!result.isEmpty())
		{
			if(ans==null)
			{
				ans=new LLint(result.pop());
			}
			else
				ans.insert(result.pop());
		}
		
		while(ans!=null)
		{
			System.out.println(ans.data);
			ans=ans.next;
		}
		
		
	}

}


public class LLadd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLint op1=new LLint(7);
		op1.insert(1);
		op1.insert(6);
		
		LLint op2=new LLint(5);
		op2.insert(9);
		op2.insert(2);
		
		LLint result = null; 
		int carry=0,sum=0;
		while(op1!=null && op2!=null)
		{
			
			int first=op1.data;
			int second=op2.data;
			//int carry=0,sum=0;
			if(carry>0)
			{
				sum=first+second+carry;
				carry=0;
			}
			else
				sum=first+second;
			
			if(sum>10)
			{
				carry=sum/10;
				
			}
			sum=sum%10;
			if(result==null)
			{
				
				result=new LLint(sum);
			}
				
			else
				result.insert(sum);
			op1=op1.next;
			op2=op2.next;
			//result=result.next;
			
		}
		while(result!=null)
		{
			System.out.println(result.data);
			result=result.next;
		}
	
		

	}

}

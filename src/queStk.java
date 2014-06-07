
public class queStk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		queUsingStack q1=new queUsingStack();
		q1.push(5);
		q1.push(4);
		q1.push(3);
		q1.push(2);
		q1.push(1);
		
		while(!q1.isEmpty())
		{
			int item=q1.pop();
			if(q1!=null)
				System.out.println(item);
			
		}

	}

}

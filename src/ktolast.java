
public class ktolast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		LL l1=new LL('S');
		l1.insert('h');
		l1.insert('y');
		l1.insert('a');
		l1.insert('m');
		l1.insert('a');
		l1.insert('l');
		
		LL l2=l1;
		while(l2!=null)
		{
			l2=l2.next;
			count++;
		}
		
	//	System.out.println(count);
		char ch=klast(l1,count,5);
		System.out.println(ch);

	}
	
	public static char klast(LL l1, int length,int k)
	{
		int count=1;
		k=length-k;
		char ch=' ';
		while(l1!=null)
		{
			if(count<k)
			{
				l1=l1.next;
				count++;
			}
			else
			{
				ch=l1.data;
				break;
			}
				
		}
		return ch;

		
	}

}

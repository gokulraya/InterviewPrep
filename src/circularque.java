
public class circularque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		que myq=new que();
		myq.enque(1);
		myq.enque(2);
		myq.enque(3);
		myq.enque(4);
		myq.enque(5);
		System.out.println(myq.deque());
		System.out.println(myq.deque());
		myq.enque(6);
		myq.enque(7);
		System.out.println(myq.deque());
		System.out.println(myq.deque());
		
		
	}

}


class que{
	int head,tail;
	int q[];
	
	que()
	{
		head=tail=1;
		q=new int[5];
	}
	boolean enque(int d)
	{
		int tmp=(tail+1)%5;
		if(tmp==head)
			return false;
		else
		{
			//tail=tmp;
			q[tail]=d;
			tail=tmp;
			return true;
		}
		
	}
	int deque()
	{
		int temp=q[head];
		if(head==tail)
			return -1;
		else
			head=(head+1)%5;
		return temp;
		
	}

}
class LL
{
	LL next=null;
	char data;
	
	public LL(char d)
	{
		data=d;
	}
	public LL() {
		// TODO Auto-generated constructor stub
	}
	void insert(char d)
	{
		LL end=new LL(d);
		LL head=this;
		while(head.next!=null)
			head=head.next;
		
		head.next=end;
	}
}

public class LLint {

		LLint next=null;
		int data;
		
		public LLint(int i)
		{
			data=i;
		}
		public LLint() {
			// TODO Auto-generated constructor stub
		}
		void insert(int i)
		{
			LLint end=new LLint(i);
			LLint head=this;
			while(head.next!=null)
				head=head.next;
			
			head.next=end;
		}
	
}

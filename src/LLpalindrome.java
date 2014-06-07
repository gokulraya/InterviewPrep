import java.util.Stack;


public class LLpalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LL str1=new LL('1');
		str1.insert('1');
		str1.insert('0');
		str1.insert('1');
		
		LL ptr=str1;
		Stack stk=new Stack();
		while(ptr!=null)
		{
			stk.push(ptr.data);
			ptr=ptr.next;
		}
		
		boolean ispalindrome=checkPalindrome(stk,str1);
		if(ispalindrome==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	
	public static boolean checkPalindrome(Stack stk, LL str1)
	{
		boolean flag=true;
		while(str1!=null && !stk.isEmpty())
		{
			
			char ch=(char) stk.pop();
			if(str1.data==ch)
			{
				flag=true;
				str1=str1.next;
			}
			else
			{
				flag=false;
				return flag;
			}
			
		}
		return flag;
	}

}

import java.util.Stack;


public class parenthesisCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="{[{()}]}}";
		char[] chs=str.toCharArray();
		boolean flag=checkParenthesis(chs);
		
		if(flag==true)
			System.out.println("Valid Order");
		else
			System.out.println("Invalid Order");

	}

	private static boolean checkParenthesis(char[] ch) {
		// TODO Auto-generated method stub
		
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<ch.length;i++)
		{
			if(!st.isEmpty())
			{ 
				if(ch[i]=='{' || ch[i]=='[' || ch[i]=='(')
				{
					st.push(ch[i]);
				}
				else if(ch[i]=='}')
				{
					if(st.peek()=='{')
						st.pop();
				}
				else if(ch[i]==']')
				{
					if(st.peek()=='[')
						st.pop();
				}
				else if(ch[i]==')')
				{
					if(st.peek()=='(')
						st.pop();
				}
				else 
					return false;
			}
			else 
				return false;
		}
		if(st.isEmpty())
			return true;
		else 
			return false;
		
	}

}

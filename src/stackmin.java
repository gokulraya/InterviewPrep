import java.util.Stack;


public class stackmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stackint st=new stackint();
		st.push(7);
		st.push(9);
		st.push(4);
		st.push(3);
		st.push(6);
		
		st.pop();
		st.pop();
		
		Stack<Integer> s=new Stack<Integer>();
		s=st.minimim();
		
		System.out.println(s.peek());

	}

}

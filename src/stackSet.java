
public class stackSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setOfStacks s1=new setOfStacks();
		
		s1.push(10);
		s1.push(9);
		s1.push(8);
		s1.push(7);
		
		s1.push(6);
		s1.push(5);
		s1.push(4);
		s1.push(3);
		
		s1.push(2);
		s1.push(11);
		s1.push(12);
		s1.push(13);
		
		/*s1.push(14);
		s1.push(15);
		s1.push(16);
		
		s1.push(17);
		s1.push(18);
		//s1.push(7);
		*/
		
		//System.out.println(s1.peek());
		System.out.println(s1.pop());
		//System.out.println(s1.peek());
		//System.out.println(s1.pop());
		System.out.println(s1.popAt(0));
		
	
	}

}

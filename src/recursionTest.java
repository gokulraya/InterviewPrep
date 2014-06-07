
public class recursionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(5);
		
		
	}
	static void f(int n)
	{
		if(n>0)
		{
			f(--n);
				System.out.println(n);
			f(--n);
		}
	}


}

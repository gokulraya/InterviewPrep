
public class ispower2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=16;
		boolean bool;
		bool=(((num) & (num-1))==0);

		if(num==1)
		{
			System.out.println("Not");
			
		}
		else if(bool)
		{
			System.out.println("Power of 2");
			
		}
		else
			System.out.println("NOt");

	}

}

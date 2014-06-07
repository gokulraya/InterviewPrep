
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<100;i++)
		{
			if(i%3==0 && i%5==0)
			{	
				System.out.println("FizzBUZZ");
				continue;
			}
				if(i%5==0)
				{
				System.out.println("Buzz");
				continue;
				}
				if(i%3==0)
				{
				System.out.println("FIZZ");
				continue;
				}
				else
				System.out.println(i);
		}

	}

}

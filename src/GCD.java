
public class GCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=19,divisor=7;
		int res=findGcd(number,divisor);
		System.out.println(res);
	}

	private static int findGcd(int number, int divisor) {
		// TODO Auto-generated method stub
	int result=0;
		while((number%divisor)!=0)
		{
			result=number%divisor;
			number=divisor;
			divisor=result;
			//findGcd(number,divisor);
		}
		return divisor;
		
	}

}

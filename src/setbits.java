
public class setbits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v=15; // count the number of bits set in v
		int c; // c accumulates the total bits set in v
		for (c = 0; v!=0; c++)
		{
		  v &= v - 1; // clear the least significant bit set
		}

		System.out.println(c);
	}

}

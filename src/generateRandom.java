import java.util.Random;


public class generateRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		{
			Random rand=new Random();
			int randnum=rand.nextInt((6-0)+1)+0;
			System.out.println(randnum);
		}

	}

}

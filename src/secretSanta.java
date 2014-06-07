import java.util.HashSet;
import java.util.Random;


public class secretSanta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String[] str={"kyle","kenny","eric","stan","stewie","brian"};
		String[] match=generateAssignments(str);
		for(int i=0;i<match.length;i++)
		{
			System.out.print(str[i] + "--> ");
			System.out.println(match[i]);
		}
	}

	private static String[] generateAssignments(String[] str) {
		// TODO Auto-generated method stub
		HashSet<String> hash=new HashSet<String>();
		String[] match=new String[str.length];
		for(int i=0;i<str.length;i++)
		{
			//if(!hash.contains(str[i]))
			{
				String key=str[i];
				int randnum=generateRandomNumber(0,str.length-1);
				while(str[randnum]==key)
				{
					randnum=generateRandomNumber(0,str.length-1);
				}
				while(hash.contains(str[randnum]))
				{
					randnum=generateRandomNumber(0,str.length-1);
				}
				match[i]=str[randnum];
				hash.add(str[randnum]);
			}
			
		}
		return match;
		
	}

	private static int generateRandomNumber(int i, int length) {
		// TODO Auto-generated method stub
			Random rand=new Random();
			int randnum=rand.nextInt((length-i)+1)+i;
			//System.out.println(randnum);
		
		return randnum;
	}

}

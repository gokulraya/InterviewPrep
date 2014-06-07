import java.util.HashSet;


public class letterCount {

	/**
	 * @param args
	 */
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String source="Gokul Kumar";
		String target="kumar";
		
		int count=countLetter(source,target);
		System.out.println(count);

	}

	private static int countLetter(String source, String target) {
		// TODO Auto-generated method stub
		source=source.toLowerCase();
		char[] char_source=source.toCharArray();
		char[] char_dest=target.toCharArray();
		HashSet<Character> hash=new HashSet<Character>();
		for(int i=0;i<char_dest.length;i++)
		{
			hash.add(char_dest[i]);
		}
		
		for(int i=0;i<char_source.length;i++)
		{
			if(hash.contains(char_source[i]))
			{
				count++;
			}
		}
		return count;
	}

}

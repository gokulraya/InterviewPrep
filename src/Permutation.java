import java.util.HashMap;


public class Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="gokul";
		String s2="kulgo";
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(!hash.containsKey(ch))
			{
				hash.put(ch, 1);
			}
			else
			{
				int count=hash.get(ch);
				count++;
				hash.put(ch, count);
				
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(!hash.containsKey(ch))
			{
				hash.put(ch, 1);
			}
			else
			{
				int count=hash.get(ch);
				count--;
				hash.put(ch, count);
				
			}
		}
		
		for(int i=0;i<hash.size();i++)
		{
			char ch=s1.charAt(i);
			if(hash.get(ch)==0)
			{
				System.out.println("Success\n");
			}
			else
			{
				System.out.println("Not permutation\n");
				break;
			}	
		}
		
		
	}

}

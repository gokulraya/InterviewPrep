import java.util.HashMap;


public class StringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!hash.containsKey(ch))
			{
				hash.put(ch, 1);
			}
			else
			{
				int count=0;
				count=hash.get(ch);
				count++;
				hash.put(ch, count);
			}
		}
		//System.out.println("HashMap is "+ hash);
		StringBuilder stb=new StringBuilder();
		int j=0; 
		for(int i=0;i<hash.size();i++)
		{
			//int j=i;
			char ch=str.charAt(j);
			int count=0;
			count=hash.get(ch);
			j=j+count;
			stb.append(ch);
			stb.append(count);
		
		
		}
		//System.out.println("Appended String is "+stb);
		
		if(str.length()<stb.length())
			System.out.println(str);
		else
			System.out.println(stb);
	
	}
}


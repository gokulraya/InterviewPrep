
public class reverseinPlace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Shyamal";
		char ch[]=str.toCharArray();
		int j=ch.length-1;
		for(int i=0;i<ch.length;i++)
		{
				if(i<=j)
				{
					char temp=ch[j];
					ch[j]=ch[i];
					ch[i]=temp;
					j--;
				}
			
		}
		
		System.out.println(ch);
	
	}

}

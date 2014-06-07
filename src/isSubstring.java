
public class isSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Gokul";
		String sub="Gl";
		
		boolean flag=isSub(str,sub);
		if(flag==true)
			System.out.println("Yes");
		else
			System.out.println("Not");
	}
	public static boolean isSub(String str,String sub)
	{
	
		int strcount=0,subcount=0,counter=0;
		boolean flag=false;
		while(strcount<str.length())
		{
			char c1=str.charAt(strcount);
			if(subcount<sub.length())
			{
				char c2=sub.charAt(subcount);
				if(c1==c2)
				{
					strcount++;
					subcount++;
					counter++;
					if(counter==sub.length())
					{
						flag=true;
						return flag;
					}
					//break;
				}
				else
				{
					strcount++;
					flag=false;
					counter=0;
					//break;
				}
				
			}
			else
				return flag;
			//return flag;
			
		}
		return flag;

}
}

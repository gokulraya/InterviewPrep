
public class isPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="malayalam";
		boolean flag=isPalindrome(str);
		if(flag==true)
		{
			System.out.println("is a palindrome");
			
		}
		else
			System.out.println("Not a palindrome");
	}
	public static boolean isPalindrome(String str)
	{
		int strlength=str.length();
		str=str+str;
		
		char[] arr=str.toCharArray();
		//System.out.println(arr.length);
		//System.out.println(str);
		int j=strlength;
		for(int i=strlength-1;i>=0;)
		{
			
			if(arr[i]==arr[j])
			{
				i--;
				j++;
				
			}
			else
			{
				//System.out.println("Not palindrome");
				return false;
			}
		}
		return true;
	}
		/*arr=str.toCharArray();
		int arrlength=arr.length;
		for(int i=0;i<arrlength;)
		{
			int j=arrlength;
			arr[j]=arr[i];
			i++;
			j++;
		}*/
}
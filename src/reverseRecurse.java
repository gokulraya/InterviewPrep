
public class reverseRecurse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] str={1,2,3,4,5};
		int counter=0,length=str.length;
		int[] str1=reverse(str,counter,length);
		for(int i=0;i<str1.length;i++)
			System.out.println(str1[i]);
		//WSystem.out.println(str);
	}
	public static int[] reverse(int str[],int counter,int length)
	{
		 if(counter<length)
		 {
			int c1=str[counter];
			str[counter]=str[length-1];
			str[length-1]=c1;
			 counter++;
			 length=length-counter;
			 reverse(str,counter,length);
		 }
		 return str;
	
		
	}

}

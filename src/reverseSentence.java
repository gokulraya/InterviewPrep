
public class reverseSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is Gokul Kumar";
		String[] split=str.split(" ");
		
		String rev=reverse(str,split);
		System.out.println(rev);
	}

	private static String reverse(String str, String[] split) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=split.length-1;i>=0;i--) {
			rev+=split[i];
			rev+=" ";
		}
		return rev;
		
	}

}


public class oddOccurance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr={'1','2','1','3','2','3','4'};
		
		char result=findODD(arr);
		System.out.println(result);
	}

	private static char findODD(char[] arr) {
		// TODO Auto-generated method stub
		char result=0;
		for(int i=0;i<arr.length;i++)
		{
			result=(char) (result^arr[i]);
		}
		return result;
		
	}

}

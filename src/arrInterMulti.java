
public class arrInterMulti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1,2,3,4,5};
		int[] result=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int product=1;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
					product*=arr[j];
				
			}
			result[i]=product;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(result[i]);

	}

}

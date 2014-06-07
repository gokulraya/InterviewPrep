
public class stockPrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={9,1,5};
		int[] profit=calculateProfit(arr);
		System.out.println("Buy at Day "+ profit[0]);
		System.out.println("Sell at Day "+ profit[1]);
		System.out.println("With Profit "+ profit[2]);
		
	}

	private static int[] calculateProfit(int[] arr) {
		// TODO Auto-generated method stub
		int min=arr[0];
		int max=arr[0];
		int minDay=0,maxDay=0;
		int[] result=new int[3];
		int diff=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				maxDay=i;
			}
			if(arr[i]<min)
			{
				min=arr[i];
				max=arr[i];
				minDay=i;
			}
			diff=max-min;
				
		}
		result[0]=minDay;
		result[1]=maxDay;
		result[2]=diff;

		
		return result;
	}

}

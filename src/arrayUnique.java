import java.util.HashSet;


public class arrayUnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={2,1,2,4,1,3,5,1};
		int[] carr=new int[arr.length];
		int j=0;
		HashSet<Integer> hash=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(hash.contains(arr[i]))
			{
				for(int k=0;k<carr.length;k++)
				{
					if(carr[j]==arr[i])
						break;
					else
						carr[j]=arr[i];
				}
				
				j++;
			}
			else
			{
				hash.add(arr[i]);
			}
		}
		for(int i=0;i<carr.length;i++)
		System.out.println(carr[i]);
		
	}

}

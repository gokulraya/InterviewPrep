
public class coinDenomination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6, 2, 3,5};
	    int m = arr.length;
	    int n = 10;
	    System.out.println(count(arr, m, n));
	   // return 0;

	}

	private static int count(int[] arr, int m, int n) {
		// TODO Auto-generated method stub
		int i, j, x, y;
		 
	    // We need n+1 rows as the table is consturcted in bottom up manner using 
	    // the base case 0 value case (n = 0)
	    int[][] table=new int[n+1][m];
	    
	    // Fill the enteries for 0 value case (n = 0)
	    for (i=0; i<m; i++)
	        table[0][i] = 1;
	 
	    // Fill rest of the table enteries in bottom up manner  
	    for (i = 1; i < n+1; i++)
	    {
	        for (j = 0; j < m; j++)
	        {
	            // Count of solutions including S[j]
	            x = (i-arr[j] >= 0)? table[i - arr[j]][j]: 0;
	 
	            // Count of solutions excluding S[j]
	            y = (j >= 1)? table[i][j-1]: 0;
	 
	            // total count
	            table[i][j] = x + y;
		       // System.out.println(table[i][j]);

	        }
	    }
	    
	    for(int l=0;i<table.length;l++)
	    {
	    	for(int il=0;il<table.length;il++)
	    	{
	    		if(table[i][il]>0)
	    		{
	    			System.out.println(arr[il]);
	    		}
	    	}
	    }
	    return table[n][m-1];
	}
		
		

}

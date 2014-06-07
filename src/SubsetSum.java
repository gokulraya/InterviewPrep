import java.util.Arrays;

public class SubsetSum {

	private static final int[] arr = {2,3,4,5,6,-3,-4,-5};

    public static void main(String[] args) {
    	final int TARGET=10;
    	Arrays.sort(arr);
        GetSubset g = new GetSubset();
        g.findCombination(arr,TARGET);
      
    }
}
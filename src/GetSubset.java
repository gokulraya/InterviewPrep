import java.util.Stack;

public class GetSubset {

    private Stack<Integer> stack = new Stack<Integer>();

    /** Store the sum of current elements stored in stack */
    private int stackSum = 0;
    
    public void findCombination(int[] data, int sum) {
		// TODO Auto-generated method stub
		int startIndex=0;
		int endIndex=data.length;
		startSubset(data,startIndex,endIndex,sum);
	}
   
    public void startSubset(int[] data, int fromIndex, int endIndex,int TARGET_SUM) {

        /*Checks if sum stored in stack is equal to the given sum
        * 
        * If yes, calls the print method to print the result.
        * Base Case for the recursion
        */
        if (stackSum == TARGET_SUM) {
            print(stack, TARGET_SUM);
        }

        for (int currentIndex = fromIndex; currentIndex < endIndex; currentIndex++) {

            if (stackSum + data[currentIndex] <= TARGET_SUM) {
                stack.push(data[currentIndex]);
                stackSum += data[currentIndex];

                /*
                * Increments the currentIndex by 1 and calls the recursive method.
                */
                startSubset(data, currentIndex + 1, endIndex,TARGET_SUM);
                stackSum -= stack.pop();
            }
        }
    }

   private void print(Stack<Integer> stack, int TARGET_SUM) {
   StringBuilder sb = new StringBuilder();
   sb.append(TARGET_SUM).append(" = ");
   for (Integer i : stack) {
       sb.append(i).append("+");
   }
   System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
}

	
}
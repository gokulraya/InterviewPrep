import java.util.HashSet;
import java.util.Random;


public class secretSantaMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String[] str={"kyle","kenny","eric","stan","stewie","brian"};
		
		int[][] Mat=new int[str.length][str.length];
		int[][] adjMat=constructAdjacencyMatrix(Mat);
		/*for(int i=0;i<adjMat.length;i++)
		{
			for(int j=0;j<adjMat.length;j++)
			{
				System.out.print(adjMat[i][j]);
			}
			System.out.println();
		}*/
		String[] match=generateAssignments(adjMat,str);
		for(int i=0;i<match.length;i++)
		{
			System.out.print(str[i] + "--> ");
			System.out.println(match[i]);
		}
	}

	private static String[] generateAssignments(int[][] adjMat, String[] str) {
		// TODO Auto-generated method stub
		String[] match=new String[adjMat.length];
		HashSet<String> visited=new HashSet<String>();
		for(int i=0;i<adjMat.length;i++)
		{
			//for(int j=0;j<adjMat.length;j++)
			{
				int randNum=generateRandomNumber(0,adjMat.length-1);
				/*while(adjMat[i][randNum]!=1)
				{
					randNum=generateRandomNumber(0,adjMat.length-1);
				}*/
				while(visited.contains(str[randNum]) )
				{
					randNum=generateRandomNumber(0,adjMat.length-1);
					while(adjMat[i][randNum]!=1)
					{
						randNum=generateRandomNumber(0,adjMat.length-1);
					}
				}
				match[i]=str[randNum];
				visited.add(str[randNum]);
			}
		}
		return  match;
		
		
	}

	private static int generateRandomNumber(int i, int length) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int randnum=rand.nextInt((length-i)+1)+i;
		//System.out.println(randnum);
	
	return randnum;
		
	}

	private static int[][] constructAdjacencyMatrix(int[][] adjMat) {
		// TODO Auto-generated method stub
		for(int i=0;i<adjMat.length;i++)
		{
			for(int j=0;j<adjMat.length;j++)
			{
				if(i==j)
					adjMat[i][j]=0;
				else
					adjMat[i][j]=1;
			}
		}
		return adjMat;
		
	}

}
